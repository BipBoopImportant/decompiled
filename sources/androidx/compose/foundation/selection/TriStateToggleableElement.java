package androidx.compose.foundation.selection;

import G1.V;
import L1.i;
import M1.a;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "LG1/V;", "Landroidx/compose/foundation/selection/e;", "LM1/a;", "state", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "", "enabled", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(LM1/a;Lr0/m;Ln0/I;ZLL1/i;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/selection/e;", "node", "f", "(Landroidx/compose/foundation/selection/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "LM1/a;", "e", "Lr0/m;", "Ln0/I;", "g", "Z", "h", "LL1/i;", "i", "LnI/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TriStateToggleableElement extends V<e> {

    /* renamed from: d  reason: collision with root package name */
    private final a f18469d;

    /* renamed from: e  reason: collision with root package name */
    private final m f18470e;

    /* renamed from: f  reason: collision with root package name */
    private final C5586I f18471f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18472g;

    /* renamed from: h  reason: collision with root package name */
    private final i f18473h;

    /* renamed from: i  reason: collision with root package name */
    private final C17631a<C16807N> f18474i;

    public /* synthetic */ TriStateToggleableElement(a aVar, m mVar, C5586I i10, boolean z10, i iVar, C17631a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, mVar, i10, z10, iVar, aVar2);
    }

    /* renamed from: c */
    public e a() {
        return new e(this.f18469d, this.f18470e, this.f18471f, this.f18472g, this.f18473h, this.f18474i, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f18469d == triStateToggleableElement.f18469d && C17542s.e(this.f18470e, triStateToggleableElement.f18470e) && C17542s.e(this.f18471f, triStateToggleableElement.f18471f) && this.f18472g == triStateToggleableElement.f18472g && C17542s.e(this.f18473h, triStateToggleableElement.f18473h) && this.f18474i == triStateToggleableElement.f18474i;
    }

    /* renamed from: f */
    public void b(e eVar) {
        eVar.d3(this.f18469d, this.f18470e, this.f18471f, this.f18472g, this.f18473h, this.f18474i);
    }

    public int hashCode() {
        int hashCode = this.f18469d.hashCode() * 31;
        m mVar = this.f18470e;
        int i10 = 0;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C5586I i11 = this.f18471f;
        int hashCode3 = (((hashCode2 + (i11 != null ? i11.hashCode() : 0)) * 31) + Boolean.hashCode(this.f18472g)) * 31;
        i iVar = this.f18473h;
        if (iVar != null) {
            i10 = i.l(iVar.n());
        }
        return ((hashCode3 + i10) * 31) + this.f18474i.hashCode();
    }

    private TriStateToggleableElement(a aVar, m mVar, C5586I i10, boolean z10, i iVar, C17631a<C16807N> aVar2) {
        this.f18469d = aVar;
        this.f18470e = mVar;
        this.f18471f = i10;
        this.f18472g = z10;
        this.f18473h = iVar;
        this.f18474i = aVar2;
    }
}
