

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Test
{
    public static void main(String[] args) throws Exception
    {
        // ��ʼ��DownUtil����
        final DownUtil downUtil = new DownUtil("http://image.baidu.com/"
                + "search/down?tn=download&word=download&ie=utf8&fr=detail&url=http%3A%2F%2Fa4.att.hudong.com%2F21%2F09%2F01200000026352136359091694357.jpg&thumburl=http%3A%2F%2Fimg3.imgtn.bdimg.com%2Fit%2Fu%3D1208538952%2C1443328523%26fm%3D26%26gp%3D0.jpg"
                , "ios.png", 4);
        // ��ʼ����
        downUtil.download();
        new Thread(() -> {
            while(downUtil.getCompleteRate() < 1)
            {
                // ÿ��0.1���ѯһ���������ɽ��ȣ�
                // GUI�����пɸ��ݸý��������ƽ�����
                System.out.println("����ɣ�"
                        + downUtil.getCompleteRate());
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception ex){}
            }
        }).start();
    }
}
