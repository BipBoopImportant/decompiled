package b5;

import android.webkit.WebResourceError;

/* renamed from: b5.b  reason: case insensitive filesystem */
public class C7060b {
    public static CharSequence a(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int b(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
