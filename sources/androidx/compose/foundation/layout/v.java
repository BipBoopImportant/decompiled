package androidx.compose.foundation.layout;

import G1.p0;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C5841L;
import s0.C5870p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/v;", "LG1/p0;", "Landroidx/compose/ui/d$c;", "Li1/c$b;", "horizontal", "<init>", "(Li1/c$b;)V", "Lc2/d;", "", "parentData", "Ls0/L;", "C2", "(Lc2/d;Ljava/lang/Object;)Ls0/L;", "n", "Li1/c$b;", "getHorizontal", "()Li1/c$b;", "D2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v extends d.c implements p0 {

    /* renamed from: n  reason: collision with root package name */
    private C5437c.b f18238n;

    public v(C5437c.b bVar) {
        this.f18238n = bVar;
    }

    /* renamed from: C2 */
    public C5841L K(c2.d dVar, Object obj) {
        C5841L l10 = obj instanceof C5841L ? (C5841L) obj : null;
        if (l10 == null) {
            l10 = new C5841L(0.0f, false, (C5082m) null, (C5870p) null, 15, (DefaultConstructorMarker) null);
        }
        l10.e(C5082m.f18136a.b(this.f18238n));
        return l10;
    }

    public final void D2(C5437c.b bVar) {
        this.f18238n = bVar;
    }
}
