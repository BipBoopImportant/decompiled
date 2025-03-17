package androidx.compose.foundation.layout;

import G1.V;
import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import c2.d;
import c2.n;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b%\u0010 ¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "LG1/V;", "Landroidx/compose/foundation/layout/C;", "Lkotlin/Function1;", "Lc2/d;", "Lc2/n;", "offset", "", "rtlAware", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(LnI/l;ZLnI/l;)V", "c", "()Landroidx/compose/foundation/layout/C;", "node", "f", "(Landroidx/compose/foundation/layout/C;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "d", "LnI/l;", "getOffset", "()LnI/l;", "e", "Z", "getRtlAware", "()Z", "getInspectorInfo", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OffsetPxElement extends V<C> {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<d, n> f18022d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18023e;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<C5137v0, C16807N> f18024f;

    public OffsetPxElement(C17642l<? super d, n> lVar, boolean z10, C17642l<? super C5137v0, C16807N> lVar2) {
        this.f18022d = lVar;
        this.f18023e = z10;
        this.f18024f = lVar2;
    }

    /* renamed from: c */
    public C a() {
        return new C(this.f18022d, this.f18023e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return this.f18022d == offsetPxElement.f18022d && this.f18023e == offsetPxElement.f18023e;
    }

    /* renamed from: f */
    public void b(C c10) {
        c10.E2(this.f18022d);
        c10.F2(this.f18023e);
    }

    public int hashCode() {
        return (this.f18022d.hashCode() * 31) + Boolean.hashCode(this.f18023e);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f18022d + ", rtlAware=" + this.f18023e + ')';
    }
}
