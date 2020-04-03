import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTool {
//Ҫ���Ƶ��ļ���·��
	private String shur;
//�����������ļ���·��
	private String shuc;
	//������
	private InputStream inputStream = null;
	//�����
	private OutputStream outputStream = null;
	
	public FileCopyTool(String shur,String shuc) {
		//1.���ж��ļ��Ƿ����
		this.shuc = shuc;
		this.shur = shur;
		//Ҫ���Ƶ��ļ�
		File filer = new File(shur);
		if (filer.exists()) {
			System.out.println("�Ұ��㴴����һ����Ҫ�ǲ���Ҫʹ��ʱ���԰���ɾ��");
			try {
				filer.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}else {
			System.out.println(shuc);
			System.out.println(shuc);
			System.err.println("�ļ�������");
//			System.exit(0);
		}
		//���Ƶ����ļ�
		File filec = new File(shuc);
		// TODO �Զ����ɵĹ��캯�����
		try {
			inputStream = new FileInputStream(filer);
			outputStream = new FileOutputStream(filec);
			//��ȡ����
			byte[] bs = new byte[1024];
			int len = -1;
			while((len = inputStream.read(bs)) != -1) {
				outputStream.write(bs);
				outputStream.flush();
			}
			System.out.println("�������");
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}
	//
	public FileCopyTool(File filer,File filec) {
		// TODO �Զ����ɵĹ��캯�����
		try {
			inputStream = new FileInputStream(filer);
			outputStream = new FileOutputStream(filec);
			//��ȡ����
			byte[] bs = new byte[1024];
			int len = -1;
			while((len = inputStream.read(bs)) != -1) {
				outputStream.write(bs);
				outputStream.flush();
			}
			System.out.println("�������");
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
	}
	}
