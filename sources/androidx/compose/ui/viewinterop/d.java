package androidx.compose.ui.viewinterop;

import E1.C4489w;
import G1.G;
import android.view.View;
import kotlin.Metadata;
import o1.C5667g;
import z1.C6271a;
import z1.e;

@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0010\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "LG1/G;", "layoutNode", "LXH/N;", "f", "(Landroid/view/View;LG1/G;)V", "", "", "g", "(I)F", "h", "(F)F", "type", "Lz1/e;", "i", "(I)I", "androidx/compose/ui/viewinterop/d$a", "a", "Landroidx/compose/ui/viewinterop/d$a;", "NoOpScrollConnection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final a f19804a = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/viewinterop/d$a", "Lz1/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C6271a {
        a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void f(View view, G g10) {
        long f10 = C4489w.f(g10.s());
        int round = Math.round(C5667g.m(f10));
        int round2 = Math.round(C5667g.n(f10));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }

    /* access modifiers changed from: private */
    public static final float g(int i10) {
        return ((float) i10) * ((float) -1);
    }

    /* access modifiers changed from: private */
    public static final float h(float f10) {
        return f10 * -1.0f;
    }

    /* access modifiers changed from: private */
    public static final int i(int i10) {
        return i10 == 0 ? e.f32374a.b() : e.f32374a.a();
    }
}
