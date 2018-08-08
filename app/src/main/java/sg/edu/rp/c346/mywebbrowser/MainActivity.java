package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import sg.edu.rp.c346.mywebbrowserenhanced.R;

public class MainActivity extends AppCompatActivity {

    WebView wvMyPage;
    Button btnLoadURL;
    EditText eT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        eT = findViewById(R.id.eT);

        wvMyPage.setWebViewClient(new WebViewClient());

        wvMyPage.setWebViewClient(new WebViewClient());
        wvMyPage.getSettings().setJavaScriptEnabled(false);
        wvMyPage.getSettings().setAllowFileAccess(false);
        wvMyPage.getSettings().setBuiltInZoomControls(true);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = eT.getText().toString().trim();
                wvMyPage.loadUrl(url);
            }
        });
    }
}
