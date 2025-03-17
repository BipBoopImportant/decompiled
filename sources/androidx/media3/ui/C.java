package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import jb.m;
import s3.a;
import s3.e;
import t3.C5950a;

final class C {
    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof e);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(a.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            g((Spannable) C5950a.e(bVar.e()), new A());
        }
        f(bVar);
    }

    public static void f(a.b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            g((Spannable) C5950a.e(bVar.e()), new B());
        }
    }

    private static void g(Spannable spannable, m<Object> mVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (mVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = (float) i12;
        } else if (i10 == 1) {
            f11 = (float) i11;
        } else if (i10 != 2) {
            return -3.4028235E38f;
        } else {
            return f10;
        }
        return f10 * f11;
    }
}
