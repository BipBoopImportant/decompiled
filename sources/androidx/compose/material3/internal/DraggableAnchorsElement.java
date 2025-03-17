package androidx.compose.material3.internal;

import G1.V;
import Q0.C4796e;
import Q0.g;
import XH.v;
import c2.C5267b;
import c2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "LG1/V;", "Landroidx/compose/material3/internal/c;", "LQ0/e;", "state", "Lkotlin/Function2;", "Lc2/r;", "Lc2/b;", "LXH/v;", "LQ0/g;", "anchors", "Lp0/v;", "orientation", "<init>", "(LQ0/e;LnI/p;Lp0/v;)V", "c", "()Landroidx/compose/material3/internal/c;", "node", "LXH/N;", "f", "(Landroidx/compose/material3/internal/c;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "LQ0/e;", "e", "LnI/p;", "Lp0/v;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends V<c<T>> {

    /* renamed from: d  reason: collision with root package name */
    private final C4796e<T> f18689d;

    /* renamed from: e  reason: collision with root package name */
    private final p<r, C5267b, v<g<T>, T>> f18690e;

    /* renamed from: f  reason: collision with root package name */
    private final p0.v f18691f;

    public DraggableAnchorsElement(C4796e<T> eVar, p<? super r, ? super C5267b, ? extends v<? extends g<T>, ? extends T>> pVar, p0.v vVar) {
        this.f18689d = eVar;
        this.f18690e = pVar;
        this.f18691f = vVar;
    }

    /* renamed from: c */
    public c<T> a() {
        return new c<>(this.f18689d, this.f18690e, this.f18691f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return C17542s.e(this.f18689d, draggableAnchorsElement.f18689d) && this.f18690e == draggableAnchorsElement.f18690e && this.f18691f == draggableAnchorsElement.f18691f;
    }

    /* renamed from: f */
    public void b(c<T> cVar) {
        cVar.G2(this.f18689d);
        cVar.E2(this.f18690e);
        cVar.F2(this.f18691f);
    }

    public int hashCode() {
        return (((this.f18689d.hashCode() * 31) + this.f18690e.hashCode()) * 31) + this.f18691f.hashCode();
    }
}
