package androidx.compose.foundation.layout;

import G1.V;
import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import nI.C17642l;
import s0.C5880z;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "LG1/V;", "Landroidx/compose/foundation/layout/w;", "Ls0/z;", "height", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(Ls0/z;ZLnI/l;)V", "c", "()Landroidx/compose/foundation/layout/w;", "node", "f", "(Landroidx/compose/foundation/layout/w;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ls0/z;", "getHeight", "()Ls0/z;", "e", "Z", "getEnforceIncoming", "()Z", "LnI/l;", "getInspectorInfo", "()LnI/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class IntrinsicHeightElement extends V<w> {

    /* renamed from: d  reason: collision with root package name */
    private final C5880z f17959d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f17960e;

    /* renamed from: f  reason: collision with root package name */
    private final C17642l<C5137v0, C16807N> f17961f;

    public IntrinsicHeightElement(C5880z zVar, boolean z10, C17642l<? super C5137v0, C16807N> lVar) {
        this.f17959d = zVar;
        this.f17960e = z10;
        this.f17961f = lVar;
    }

    /* renamed from: c */
    public w a() {
        return new w(this.f17959d, this.f17960e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.f17959d == intrinsicHeightElement.f17959d && this.f17960e == intrinsicHeightElement.f17960e;
    }

    /* renamed from: f */
    public void b(w wVar) {
        wVar.F2(this.f17959d);
        wVar.E2(this.f17960e);
    }

    public int hashCode() {
        return (this.f17959d.hashCode() * 31) + Boolean.hashCode(this.f17960e);
    }
}
