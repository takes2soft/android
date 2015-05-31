package jp.gr.java_conf.takes2.panda_fly;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.xwalk.core.XWalkView;


public class MainActivity extends Activity {

    private XWalkView mXWalkView;
    //接続先のURL
    private static final String web_url ="http://takes2soft.github.io/se/pinpon/picture/index.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //WebViewインスタンスを取得
        mXWalkView = (XWalkView) findViewById(R.id.xwalkview);

        //loadUrlメソッドを呼び出し
        mXWalkView.load(web_url, null);

//        //WebViewClientを組み込む
//        webView.setWebViewClient(new WebViewClient());
//
//        //ズーム機能を無効にする
//        webView.getSettings().setBuiltInZoomControls(false);
//
//        // JavaScriptを有効にする
//        webView.getSettings().setJavaScriptEnabled(true);
//
//        //スクロールバー用の余白を確保しない
//        webView.setVerticalScrollbarOverlay(true);
//        webView.setHorizontalScrollbarOverlay(true);
//
//        //DOMストレージAPIを有効にする
//        webView.getSettings().setDomStorageEnabled(true);
//
//        //Flashなどのプラグインを有効にする
//        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        if (android.os.Build.VERSION.SDK_INT > 10) {
//            getWindow().setFlags(0x01000000, 0x01000000);
//        }
//
//        //キャッシュは使用しない(開発中のみ)
//        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
//
//        //キャッシュ・履歴の削除
//        webView.clearCache(true);
//        webView.clearHistory();

        //webView.getSettings().setLoadWithOverviewMode(true);
        //webView.reload();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
