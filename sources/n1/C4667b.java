package N1;

import N1.I;
import O1.f0;
import W1.c;
import Y1.e;
import Y1.f;
import Y1.j;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import c2.v;
import c2.w;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001f\u001a\u00020\u0002*\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LY1/j;", "align", "", "m", "(I)I", "LY1/e;", "hyphens", "o", "LY1/f$b;", "breakStrategy", "n", "LY1/f$c;", "lineBreakStrictness", "p", "LY1/f$d;", "lineBreakWordStyle", "q", "LO1/f0;", "maxHeight", "k", "(LO1/f0;I)I", "LN1/Y;", "textStyle", "", "ellipsis", "l", "(LN1/Y;Z)Z", "", "j", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "LN1/I;", "r", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.b  reason: case insensitive filesystem */
public final class C4667b {
    /* access modifiers changed from: private */
    public static final CharSequence j(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        c.u(spannableString, new Q1.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* access modifiers changed from: private */
    public static final int k(f0 f0Var, int i10) {
        int m10 = f0Var.m();
        for (int i11 = 0; i11 < m10; i11++) {
            if (f0Var.l(i11) > ((float) i10)) {
                return i11;
            }
        }
        return f0Var.m();
    }

    /* access modifiers changed from: private */
    public static final boolean l(Y y10, boolean z10) {
        if (!z10 || v.e(y10.q(), w.i(0)) || v.e(y10.q(), v.f23057b.a())) {
            return false;
        }
        int z11 = y10.z();
        j.a aVar = j.f14783b;
        return !j.k(z11, aVar.g()) && !j.k(y10.z(), aVar.f()) && !j.k(y10.z(), aVar.c());
    }

    /* access modifiers changed from: private */
    public static final int m(int i10) {
        j.a aVar = j.f14783b;
        if (j.k(i10, aVar.d())) {
            return 3;
        }
        if (j.k(i10, aVar.e())) {
            return 4;
        }
        if (j.k(i10, aVar.a())) {
            return 2;
        }
        return (!j.k(i10, aVar.f()) && j.k(i10, aVar.b())) ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static final int n(int i10) {
        f.b.a aVar = f.b.f14754a;
        if (f.b.e(i10, aVar.c())) {
            return 0;
        }
        if (f.b.e(i10, aVar.b())) {
            return 1;
        }
        return f.b.e(i10, aVar.a()) ? 2 : 0;
    }

    /* access modifiers changed from: private */
    public static final int o(int i10) {
        e.a aVar = e.f14743b;
        if (e.g(i10, aVar.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        e.g(i10, aVar.b());
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int p(int i10) {
        f.c.a aVar = f.c.f14759a;
        if (f.c.f(i10, aVar.a())) {
            return 0;
        }
        if (f.c.f(i10, aVar.b())) {
            return 1;
        }
        if (f.c.f(i10, aVar.c())) {
            return 2;
        }
        return f.c.f(i10, aVar.d()) ? 3 : 0;
    }

    /* access modifiers changed from: private */
    public static final int q(int i10) {
        f.d.a aVar = f.d.f14765a;
        return (!f.d.d(i10, aVar.a()) && f.d.d(i10, aVar.b())) ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static final int r(int i10) {
        I.a aVar = I.f9380a;
        return (!I.d(i10, aVar.a()) && I.d(i10, aVar.b())) ? 1 : 0;
    }
}
