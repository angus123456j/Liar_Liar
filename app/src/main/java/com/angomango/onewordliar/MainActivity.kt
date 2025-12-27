package com.angomango.onewordimposter


import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback

class MainActivity : ComponentActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(this)

        // Enable scrolling + modern web behavior
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.settings.setSupportZoom(false)
        webView.settings.builtInZoomControls = false
        webView.settings.displayZoomControls = false
        webView.settings.cacheMode = android.webkit.WebSettings.LOAD_DEFAULT

        webView.isVerticalScrollBarEnabled = true
        webView.isHorizontalScrollBarEnabled = false

        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://liar-liar-yg1q.onrender.com/")

        setContentView(webView)
    }

}

