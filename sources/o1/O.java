package O1;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LO1/O;", "LO1/b0;", "<init>", "()V", "LO1/c0;", "params", "Landroid/text/StaticLayout;", "a", "(LO1/c0;)Landroid/text/StaticLayout;", "layout", "", "useFallbackLineSpacing", "b", "(Landroid/text/StaticLayout;Z)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class O implements b0 {
    public StaticLayout a(c0 c0Var) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(c0Var.r(), c0Var.q(), c0Var.e(), c0Var.o(), c0Var.u());
        obtain.setTextDirection(c0Var.s());
        obtain.setAlignment(c0Var.a());
        obtain.setMaxLines(c0Var.n());
        obtain.setEllipsize(c0Var.c());
        obtain.setEllipsizedWidth(c0Var.d());
        obtain.setLineSpacing(c0Var.l(), c0Var.m());
        obtain.setIncludePad(c0Var.g());
        obtain.setBreakStrategy(c0Var.b());
        obtain.setHyphenationFrequency(c0Var.f());
        obtain.setIndents(c0Var.i(), c0Var.p());
        int i10 = Build.VERSION.SDK_INT;
        P.a(obtain, c0Var.h());
        if (i10 >= 28) {
            S.a(obtain, c0Var.t());
        }
        if (i10 >= 33) {
            Z.b(obtain, c0Var.j(), c0Var.k());
        }
        return obtain.build();
    }

    public boolean b(StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return Z.a(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }
}
