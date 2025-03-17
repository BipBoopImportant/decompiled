package androidx.compose.foundation.layout;

import G1.V;
import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "LG1/V;", "Landroidx/compose/foundation/layout/g;", "Li1/c;", "alignment", "", "matchParentSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(Li1/c;ZLnI/l;)V", "c", "()Landroidx/compose/foundation/layout/g;", "node", "f", "(Landroidx/compose/foundation/layout/g;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Li1/c;", "getAlignment", "()Li1/c;", "e", "Z", "getMatchParentSize", "()Z", "LnI/l;", "getInspectorInfo", "()LnI/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BoxChildDataElement extends V<C5076g> {

    /* renamed from: d  reason: collision with root package name */
    private final C5437c f17916d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f17917e;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<C5137v0, C16807N> f17918f;

    public BoxChildDataElement(C5437c cVar, boolean z10, C17642l<? super C5137v0, C16807N> lVar) {
        this.f17916d = cVar;
        this.f17917e = z10;
        this.f17918f = lVar;
    }

    /* renamed from: c */
    public C5076g a() {
        return new C5076g(this.f17916d, this.f17917e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return C17542s.e(this.f17916d, boxChildDataElement.f17916d) && this.f17917e == boxChildDataElement.f17917e;
    }

    /* renamed from: f */
    public void b(C5076g gVar) {
        gVar.F2(this.f17916d);
        gVar.G2(this.f17917e);
    }

    public int hashCode() {
        return (this.f17916d.hashCode() * 31) + Boolean.hashCode(this.f17917e);
    }
}
