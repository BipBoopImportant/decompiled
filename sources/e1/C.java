package E1;

import G1.B;
import androidx.compose.ui.d;
import c2.C5267b;
import kotlin.Metadata;
import nI.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"LE1/C;", "LG1/B;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function3;", "LE1/K;", "LE1/H;", "Lc2/b;", "LE1/J;", "measureBlock", "<init>", "(LnI/q;)V", "measurable", "constraints", "h", "(LE1/K;LE1/H;J)LE1/J;", "", "toString", "()Ljava/lang/String;", "n", "LnI/q;", "getMeasureBlock", "()LnI/q;", "C2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private q<? super K, ? super H, ? super C5267b, ? extends J> f5789n;

    public C(q<? super K, ? super H, ? super C5267b, ? extends J> qVar) {
        this.f5789n = qVar;
    }

    public final void C2(q<? super K, ? super H, ? super C5267b, ? extends J> qVar) {
        this.f5789n = qVar;
    }

    public J h(K k10, H h10, long j10) {
        return (J) this.f5789n.invoke(k10, h10, C5267b.a(j10));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f5789n + ')';
    }
}
