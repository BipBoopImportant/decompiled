package androidx.compose.foundation;

import G1.V;
import L1.i;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "LG1/V;", "Landroidx/compose/foundation/e;", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(Lr0/m;Ln0/I;ZLjava/lang/String;LL1/i;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/e;", "node", "f", "(Landroidx/compose/foundation/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lr0/m;", "e", "Ln0/I;", "Z", "g", "Ljava/lang/String;", "h", "LL1/i;", "i", "LnI/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ClickableElement extends V<e> {

    /* renamed from: d  reason: collision with root package name */
    private final m f17484d;

    /* renamed from: e  reason: collision with root package name */
    private final C5586I f17485e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f17486f;

    /* renamed from: g  reason: collision with root package name */
    private final String f17487g;

    /* renamed from: h  reason: collision with root package name */
    private final i f17488h;

    /* renamed from: i  reason: collision with root package name */
    private final C17631a<C16807N> f17489i;

    public /* synthetic */ ClickableElement(m mVar, C5586I i10, boolean z10, String str, i iVar, C17631a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, i10, z10, str, iVar, aVar);
    }

    /* renamed from: c */
    public e a() {
        return new e(this.f17484d, this.f17485e, this.f17486f, this.f17487g, this.f17488h, this.f17489i, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return C17542s.e(this.f17484d, clickableElement.f17484d) && C17542s.e(this.f17485e, clickableElement.f17485e) && this.f17486f == clickableElement.f17486f && C17542s.e(this.f17487g, clickableElement.f17487g) && C17542s.e(this.f17488h, clickableElement.f17488h) && this.f17489i == clickableElement.f17489i;
    }

    /* renamed from: f */
    public void b(e eVar) {
        eVar.c3(this.f17484d, this.f17485e, this.f17486f, this.f17487g, this.f17488h, this.f17489i);
    }

    public int hashCode() {
        m mVar = this.f17484d;
        int i10 = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        C5586I i11 = this.f17485e;
        int hashCode2 = (((hashCode + (i11 != null ? i11.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17486f)) * 31;
        String str = this.f17487g;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        i iVar = this.f17488h;
        if (iVar != null) {
            i10 = i.l(iVar.n());
        }
        return ((hashCode3 + i10) * 31) + this.f17489i.hashCode();
    }

    private ClickableElement(m mVar, C5586I i10, boolean z10, String str, i iVar, C17631a<C16807N> aVar) {
        this.f17484d = mVar;
        this.f17485e = i10;
        this.f17486f = z10;
        this.f17487g = str;
        this.f17488h = iVar;
        this.f17489i = aVar;
    }
}
