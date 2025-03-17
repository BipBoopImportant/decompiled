package a9;

public final /* synthetic */ class S6 {
    public static /* synthetic */ int a(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("DEBUG")) {
            return 1;
        } else {
            if (str.equals("WARN")) {
                return 2;
            }
            if (str.equals("ERROR")) {
                return 3;
            }
            if (str.equals("CRITICAL")) {
                return 4;
            }
            throw new IllegalArgumentException("No enum constant com.contentsquare.android.analytics.internal.uigestureinterceptor.webview.WebViewAnalyticsEventProcessor.LogLevel.".concat(str));
        }
    }
}
