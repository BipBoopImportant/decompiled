package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

public class d {

    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class c {
        static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    public static a a(View view) {
        return a.b(a.a(view));
    }

    public static c b(View view) {
        ContentCaptureSession a10;
        if (Build.VERSION.SDK_INT < 29 || (a10 = b.a(view)) == null) {
            return null;
        }
        return c.f(a10, view);
    }

    public static void c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i10);
        }
    }
}
