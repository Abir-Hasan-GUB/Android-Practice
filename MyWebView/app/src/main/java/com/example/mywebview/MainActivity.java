package com.example.mywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webViewId);
        WebSettings webSettings = webView.getSettings(); // get all web settings
        webSettings.setJavaScriptEnabled(true); // enabled JS file on apps
        webView.setWebViewClient(new WebViewClient()); // this line ensure load all ling on your app.
        webView.loadUrl("https://portfolio-of-abir.netlify.app/");
    }

    @Override
    public void onBackPressed() {  // call this method if click back button
        if(webView.canGoBack()){ // check back page is avilable or not
            webView.goBack(); // if contained back page then go that page
        }else { // if not contained back page then exit to the app
            super.onBackPressed();
        }
    }
}