package androidx.compose.foundation.selection;

import G1.V;
import L1.i;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17642l;
import r0.m;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010$R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "LG1/V;", "Landroidx/compose/foundation/selection/d;", "", "value", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "enabled", "LL1/i;", "role", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "<init>", "(ZLr0/m;Ln0/I;ZLL1/i;LnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/selection/d;", "node", "f", "(Landroidx/compose/foundation/selection/d;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Z", "e", "Lr0/m;", "Ln0/I;", "g", "h", "LL1/i;", "i", "LnI/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ToggleableElement extends V<d> {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18463d;

    /* renamed from: e  reason: collision with root package name */
    private final m f18464e;

    /* renamed from: f  reason: collision with root package name */
    private final C5586I f18465f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18466g;

    /* renamed from: h  reason: collision with root package name */
    private final i f18467h;

    /* renamed from: i  reason: collision with root package name */
    private final C17642l<Boolean, C16807N> f18468i;

    public /* synthetic */ ToggleableElement(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, mVar, i10, z11, iVar, lVar);
    }

    /* renamed from: c */
    public d a() {
        return new d(this.f18463d, this.f18464e, this.f18465f, this.f18466g, this.f18467h, this.f18468i, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f18463d == toggleableElement.f18463d && C17542s.e(this.f18464e, toggleableElement.f18464e) && C17542s.e(this.f18465f, toggleableElement.f18465f) && this.f18466g == toggleableElement.f18466g && C17542s.e(this.f18467h, toggleableElement.f18467h) && this.f18468i == toggleableElement.f18468i;
    }

    /* renamed from: f */
    public void b(d dVar) {
        dVar.f3(this.f18463d, this.f18464e, this.f18465f, this.f18466g, this.f18467h, this.f18468i);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f18463d) * 31;
        m mVar = this.f18464e;
        int i10 = 0;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C5586I i11 = this.f18465f;
        int hashCode3 = (((hashCode2 + (i11 != null ? i11.hashCode() : 0)) * 31) + Boolean.hashCode(this.f18466g)) * 31;
        i iVar = this.f18467h;
        if (iVar != null) {
            i10 = i.l(iVar.n());
        }
        return ((hashCode3 + i10) * 31) + this.f18468i.hashCode();
    }

    private ToggleableElement(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17642l<? super Boolean, C16807N> lVar) {
        this.f18463d = z10;
        this.f18464e = mVar;
        this.f18465f = i10;
        this.f18466g = z11;
        this.f18467h = iVar;
        this.f18468i = lVar;
    }
}
