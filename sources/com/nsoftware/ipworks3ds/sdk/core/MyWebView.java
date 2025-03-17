package com.nsoftware.ipworks3ds.sdk.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import nts.C3727;
import nts.C4019;

public class MyWebView extends WebView {
    public MyWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        if ((motionEvent.getFlags() & 1) != 1) {
            return super.onFilterTouchEventForSecurity(motionEvent);
        }
        C3727.m1038();
        return false;
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (webViewClient instanceof C4019) {
            super.setWebViewClient(webViewClient);
        }
    }
}
