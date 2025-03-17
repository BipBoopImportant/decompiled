package androidx.compose.foundation.selection;

import G1.V;
import L1.i;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "LG1/V;", "Landroidx/compose/foundation/selection/b;", "", "selected", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "enabled", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(ZLr0/m;Ln0/I;ZLL1/i;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/selection/b;", "node", "f", "(Landroidx/compose/foundation/selection/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Z", "e", "Lr0/m;", "Ln0/I;", "g", "h", "LL1/i;", "i", "LnI/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SelectableElement extends V<b> {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18457d;

    /* renamed from: e  reason: collision with root package name */
    private final m f18458e;

    /* renamed from: f  reason: collision with root package name */
    private final C5586I f18459f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18460g;

    /* renamed from: h  reason: collision with root package name */
    private final i f18461h;

    /* renamed from: i  reason: collision with root package name */
    private final C17631a<C16807N> f18462i;

    public /* synthetic */ SelectableElement(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17631a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, mVar, i10, z11, iVar, aVar);
    }

    /* renamed from: c */
    public b a() {
        return new b(this.f18457d, this.f18458e, this.f18459f, this.f18460g, this.f18461h, this.f18462i, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f18457d == selectableElement.f18457d && C17542s.e(this.f18458e, selectableElement.f18458e) && C17542s.e(this.f18459f, selectableElement.f18459f) && this.f18460g == selectableElement.f18460g && C17542s.e(this.f18461h, selectableElement.f18461h) && this.f18462i == selectableElement.f18462i;
    }

    /* renamed from: f */
    public void b(b bVar) {
        bVar.d3(this.f18457d, this.f18458e, this.f18459f, this.f18460g, this.f18461h, this.f18462i);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f18457d) * 31;
        m mVar = this.f18458e;
        int i10 = 0;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C5586I i11 = this.f18459f;
        int hashCode3 = (((hashCode2 + (i11 != null ? i11.hashCode() : 0)) * 31) + Boolean.hashCode(this.f18460g)) * 31;
        i iVar = this.f18461h;
        if (iVar != null) {
            i10 = i.l(iVar.n());
        }
        return ((hashCode3 + i10) * 31) + this.f18462i.hashCode();
    }

    private SelectableElement(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17631a<C16807N> aVar) {
        this.f18457d = z10;
        this.f18458e = mVar;
        this.f18459f = i10;
        this.f18460g = z11;
        this.f18461h = iVar;
        this.f18462i = aVar;
    }
}
