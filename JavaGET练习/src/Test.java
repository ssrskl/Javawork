package api.jisuapi.iqa;

import java.net.URLEncoder;

import api.util.HttpUtil;
import net.sf.json.JSONObject;

public class Test {

    public static final String APPKEY = "your_appkey_here";// 你的appkey
    public static final String URL = "https://api.binstd.com/iqa/query";
    public static final String question = "杭州天气";// 问题(utf-8)

    public static void Get() throws Exception {
        String result = null;
        String url = URL + "?appkey=" + APPKEY + "&question=" + URLEncoder.encode(question, "utf-8");

        try {
            result = HttpUtil.sendGet(url, "utf-8");
            JSONObject json = JSONObject.fromObject(result);
            if (json.getInt("status") != 0) {
                System.out.println(json.getString("msg"));
            } else {
                JSONObject resultarr = json.optJSONObject("result");
                String type = resultarr.getString("type");
                String content = resultarr.getString("content");
                String relquestion = resultarr.getString("relquestion");
                System.out.println(type + " " + content + " " + relquestion);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}