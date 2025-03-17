package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f19428a;

    /* renamed from: b  reason: collision with root package name */
    private final View f19429b;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    private static class b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.c$c  reason: collision with other inner class name */
    private static class C0304c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private c(ContentCaptureSession contentCaptureSession, View view) {
        this.f19428a = contentCaptureSession;
        this.f19429b = view;
    }

    public static c f(ContentCaptureSession contentCaptureSession, View view) {
        return new c(contentCaptureSession, view);
    }

    public AutofillId a(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession a10 = b.a(this.f19428a);
        a a11 = d.a(this.f19429b);
        Objects.requireNonNull(a11);
        return b.a(a10, a11.a(), j10);
    }

    public e b(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.i(b.c(b.a(this.f19428a), autofillId, j10));
        }
        return null;
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(b.a(this.f19428a), autofillId, charSequence);
        }
    }

    public void d(List<ViewStructure> list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            C0304c.a(b.a(this.f19428a), list);
        } else if (i10 >= 29) {
            ViewStructure b10 = b.b(b.a(this.f19428a), this.f19429b);
            a.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(b.a(this.f19428a), b10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                b.d(b.a(this.f19428a), list.get(i11));
            }
            ViewStructure b11 = b.b(b.a(this.f19428a), this.f19429b);
            a.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(b.a(this.f19428a), b11);
        }
    }

    public void e(long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            ContentCaptureSession a10 = b.a(this.f19428a);
            a a11 = d.a(this.f19429b);
            Objects.requireNonNull(a11);
            b.f(a10, a11.a(), jArr);
        } else if (i10 >= 29) {
            ViewStructure b10 = b.b(b.a(this.f19428a), this.f19429b);
            a.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(b.a(this.f19428a), b10);
            ContentCaptureSession a12 = b.a(this.f19428a);
            a a13 = d.a(this.f19429b);
            Objects.requireNonNull(a13);
            b.f(a12, a13.a(), jArr);
            ViewStructure b11 = b.b(b.a(this.f19428a), this.f19429b);
            a.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(b.a(this.f19428a), b11);
        }
    }
}
