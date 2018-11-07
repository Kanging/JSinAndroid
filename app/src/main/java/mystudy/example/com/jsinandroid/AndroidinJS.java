package mystudy.example.com.jsinandroid;

import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by ZhouKang on 2018/11/5
 * E-Mail Address：zhouk@szcatic.com
 */
public class AndroidinJS {
    // 定义JS需要调用的方法
    // 被JS调用的方法必须加入@JavascriptInterface注解
    @JavascriptInterface
    public void hello(String msg) {
        Log.e("Tag",msg);
    }
}
