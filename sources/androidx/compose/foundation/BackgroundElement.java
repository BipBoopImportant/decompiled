package androidx.compose.foundation;

import G1.V;
import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.C5728l0;
import p1.C5747v0;
import p1.i1;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "LG1/V;", "Landroidx/compose/foundation/c;", "Lp1/v0;", "color", "Lp1/l0;", "brush", "", "alpha", "Lp1/i1;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(JLp1/l0;FLp1/i1;LnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/c;", "node", "f", "(Landroidx/compose/foundation/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "J", "e", "Lp1/l0;", "F", "Lp1/i1;", "g", "LnI/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BackgroundElement extends V<c> {
    private final float alpha;

    /* renamed from: d  reason: collision with root package name */
    private final long f17477d;

    /* renamed from: e  reason: collision with root package name */
    private final C5728l0 f17478e;

    /* renamed from: f  reason: collision with root package name */
    private final i1 f17479f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<C5137v0, C16807N> f17480g;

    public /* synthetic */ BackgroundElement(long j10, C5728l0 l0Var, float f10, i1 i1Var, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, l0Var, f10, i1Var, lVar);
    }

    /* renamed from: c */
    public c a() {
        return new c(this.f17477d, this.f17478e, this.alpha, this.f17479f, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C5747v0.q(this.f17477d, backgroundElement.f17477d) && C17542s.e(this.f17478e, backgroundElement.f17478e) && this.alpha == backgroundElement.alpha && C17542s.e(this.f17479f, backgroundElement.f17479f);
    }

    /* renamed from: f */
    public void b(c cVar) {
        cVar.H2(this.f17477d);
        cVar.G2(this.f17478e);
        cVar.d(this.alpha);
        cVar.Z(this.f17479f);
    }

    public int hashCode() {
        int w10 = C5747v0.w(this.f17477d) * 31;
        C5728l0 l0Var = this.f17478e;
        return ((((w10 + (l0Var != null ? l0Var.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.f17479f.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BackgroundElement(long j10, C5728l0 l0Var, float f10, i1 i1Var, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5747v0.f27350b.i() : j10, (i10 & 2) != 0 ? null : l0Var, f10, i1Var, lVar, (DefaultConstructorMarker) null);
    }

    private BackgroundElement(long j10, C5728l0 l0Var, float f10, i1 i1Var, C17642l<? super C5137v0, C16807N> lVar) {
        this.f17477d = j10;
        this.f17478e = l0Var;
        this.alpha = f10;
        this.f17479f = i1Var;
        this.f17480g = lVar;
    }
}
