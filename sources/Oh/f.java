package oH;

import I2.C0;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x2.d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000b\u001a3\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0017\u001a\u00020\u0016*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroid/view/View;", "LI2/C0;", "insets", "LoH/j;", "typesToApply", "LoH/m;", "initialPaddings", "", "ignoreVisibility", "LXH/N;", "e", "(Landroid/view/View;LI2/C0;LoH/j;LoH/m;Z)V", "initialMargins", "d", "LI2/C0$a;", "", "type", "windowInsets", "applied", "f", "(LI2/C0$a;ILI2/C0;LoH/j;Z)LI2/C0$a;", "typeMask", "Lx2/d;", "g", "(LI2/C0;IZ)Lx2/d;", "insetter"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class f {
    /* access modifiers changed from: private */
    public static final void d(View view, C0 c02, j jVar, m mVar, boolean z10) {
        if (!jVar.f()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                int b10 = jVar.c() == 0 ? ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : mVar.b() + g(c02, jVar.c(), z10).f31836a;
                int d10 = jVar.e() == 0 ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : mVar.d() + g(c02, jVar.e(), z10).f31837b;
                int c10 = jVar.d() == 0 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : mVar.c() + g(c02, jVar.d(), z10).f31838c;
                int a10 = jVar.b() == 0 ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : g(c02, jVar.b(), z10).f31839d + mVar.a();
                C17542s.i(layoutParams, "lp");
                if (g.a((ViewGroup.MarginLayoutParams) layoutParams, b10, d10, c10, a10)) {
                    view.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Margin window insets handling requested but View's LayoutParams do not extend MarginLayoutParams");
        }
    }

    /* access modifiers changed from: private */
    public static final void e(View view, C0 c02, j jVar, m mVar, boolean z10) {
        if (!jVar.f()) {
            view.setPadding(jVar.c() == 0 ? view.getPaddingLeft() : mVar.b() + g(c02, jVar.c(), z10).f31836a, jVar.e() == 0 ? view.getPaddingTop() : mVar.d() + g(c02, jVar.e(), z10).f31837b, jVar.d() == 0 ? view.getPaddingRight() : mVar.c() + g(c02, jVar.d(), z10).f31838c, jVar.b() == 0 ? view.getPaddingBottom() : g(c02, jVar.b(), z10).f31839d + mVar.a());
        }
    }

    /* access modifiers changed from: private */
    public static final C0.a f(C0.a aVar, int i10, C0 c02, j jVar, boolean z10) {
        if ((jVar.a() & i10) != i10) {
            return aVar;
        }
        d g10 = g(c02, i10, z10);
        if (C17542s.e(g10, d.f31835e)) {
            return aVar;
        }
        int i11 = 0;
        int i12 = (jVar.c() & i10) != 0 ? 0 : g10.f31836a;
        int i13 = (jVar.e() & i10) != 0 ? 0 : g10.f31837b;
        int i14 = (jVar.d() & i10) != 0 ? 0 : g10.f31838c;
        if ((jVar.b() & i10) == 0) {
            i11 = g10.f31839d;
        }
        aVar.b(i10, d.b(i12, i13, i14, i11));
        return aVar;
    }

    private static final d g(C0 c02, int i10, boolean z10) {
        if (z10) {
            d g10 = c02.g(i10);
            C17542s.i(g10, "{\n        getInsetsIgnor…isibility(typeMask)\n    }");
            return g10;
        }
        d f10 = c02.f(i10);
        C17542s.i(f10, "{\n        getInsets(typeMask)\n    }");
        return f10;
    }
}
