package androidx.compose.material;

import G1.V;
import I0.C;
import I0.C4552d;
import XH.v;
import c2.C5267b;
import c2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "LG1/V;", "Landroidx/compose/material/b;", "LI0/d;", "state", "Lkotlin/Function2;", "Lc2/r;", "Lc2/b;", "LXH/v;", "LI0/C;", "anchors", "Lp0/v;", "orientation", "<init>", "(LI0/d;LnI/p;Lp0/v;)V", "c", "()Landroidx/compose/material/b;", "node", "LXH/N;", "f", "(Landroidx/compose/material/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "LI0/d;", "e", "LnI/p;", "Lp0/v;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends V<b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private final C4552d<T> f18574d;

    /* renamed from: e  reason: collision with root package name */
    private final p<r, C5267b, v<C<T>, T>> f18575e;

    /* renamed from: f  reason: collision with root package name */
    private final p0.v f18576f;

    public DraggableAnchorsElement(C4552d<T> dVar, p<? super r, ? super C5267b, ? extends v<? extends C<T>, ? extends T>> pVar, p0.v vVar) {
        this.f18574d = dVar;
        this.f18575e = pVar;
        this.f18576f = vVar;
    }

    /* renamed from: c */
    public b<T> a() {
        return new b<>(this.f18574d, this.f18575e, this.f18576f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return C17542s.e(this.f18574d, draggableAnchorsElement.f18574d) && this.f18575e == draggableAnchorsElement.f18575e && this.f18576f == draggableAnchorsElement.f18576f;
    }

    /* renamed from: f */
    public void b(b<T> bVar) {
        bVar.G2(this.f18574d);
        bVar.E2(this.f18575e);
        bVar.F2(this.f18576f);
    }

    public int hashCode() {
        return (((this.f18574d.hashCode() * 31) + this.f18575e.hashCode()) * 31) + this.f18576f.hashCode();
    }
}
