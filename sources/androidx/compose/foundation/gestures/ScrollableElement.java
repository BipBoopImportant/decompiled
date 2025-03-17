package androidx.compose.foundation.gestures;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.T;
import p0.C5681D;
import p0.C5689g;
import p0.s;
import p0.v;
import r0.m;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "LG1/V;", "Landroidx/compose/foundation/gestures/i;", "Lp0/D;", "state", "Lp0/v;", "orientation", "Ln0/T;", "overscrollEffect", "", "enabled", "reverseDirection", "Lp0/s;", "flingBehavior", "Lr0/m;", "interactionSource", "Lp0/g;", "bringIntoViewSpec", "<init>", "(Lp0/D;Lp0/v;Ln0/T;ZZLp0/s;Lr0/m;Lp0/g;)V", "c", "()Landroidx/compose/foundation/gestures/i;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/gestures/i;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lp0/D;", "getState", "()Lp0/D;", "e", "Lp0/v;", "getOrientation", "()Lp0/v;", "Ln0/T;", "getOverscrollEffect", "()Ln0/T;", "g", "Z", "getEnabled", "()Z", "h", "getReverseDirection", "i", "Lp0/s;", "getFlingBehavior", "()Lp0/s;", "j", "Lr0/m;", "getInteractionSource", "()Lr0/m;", "k", "Lp0/g;", "getBringIntoViewSpec", "()Lp0/g;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollableElement extends V<i> {

    /* renamed from: d  reason: collision with root package name */
    private final C5681D f17659d;

    /* renamed from: e  reason: collision with root package name */
    private final v f17660e;

    /* renamed from: f  reason: collision with root package name */
    private final T f17661f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17662g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f17663h;

    /* renamed from: i  reason: collision with root package name */
    private final s f17664i;

    /* renamed from: j  reason: collision with root package name */
    private final m f17665j;

    /* renamed from: k  reason: collision with root package name */
    private final C5689g f17666k;

    public ScrollableElement(C5681D d10, v vVar, T t10, boolean z10, boolean z11, s sVar, m mVar, C5689g gVar) {
        this.f17659d = d10;
        this.f17660e = vVar;
        this.f17661f = t10;
        this.f17662g = z10;
        this.f17663h = z11;
        this.f17664i = sVar;
        this.f17665j = mVar;
        this.f17666k = gVar;
    }

    /* renamed from: c */
    public i a() {
        return new i(this.f17659d, this.f17661f, this.f17664i, this.f17660e, this.f17662g, this.f17663h, this.f17665j, this.f17666k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return C17542s.e(this.f17659d, scrollableElement.f17659d) && this.f17660e == scrollableElement.f17660e && C17542s.e(this.f17661f, scrollableElement.f17661f) && this.f17662g == scrollableElement.f17662g && this.f17663h == scrollableElement.f17663h && C17542s.e(this.f17664i, scrollableElement.f17664i) && C17542s.e(this.f17665j, scrollableElement.f17665j) && C17542s.e(this.f17666k, scrollableElement.f17666k);
    }

    /* renamed from: f */
    public void b(i iVar) {
        iVar.k3(this.f17659d, this.f17660e, this.f17661f, this.f17662g, this.f17663h, this.f17664i, this.f17665j, this.f17666k);
    }

    public int hashCode() {
        int hashCode = ((this.f17659d.hashCode() * 31) + this.f17660e.hashCode()) * 31;
        T t10 = this.f17661f;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (t10 != null ? t10.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17662g)) * 31) + Boolean.hashCode(this.f17663h)) * 31;
        s sVar = this.f17664i;
        int hashCode3 = (hashCode2 + (sVar != null ? sVar.hashCode() : 0)) * 31;
        m mVar = this.f17665j;
        int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C5689g gVar = this.f17666k;
        if (gVar != null) {
            i10 = gVar.hashCode();
        }
        return hashCode4 + i10;
    }
}
