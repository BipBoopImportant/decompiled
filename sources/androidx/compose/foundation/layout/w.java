package androidx.compose.foundation.layout;

import E1.C4484q;
import E1.H;
import E1.K;
import E1.r;
import c2.C5267b;
import kotlin.Metadata;
import s0.C5880z;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/w;", "Landroidx/compose/foundation/layout/y;", "Ls0/z;", "height", "", "enforceIncoming", "<init>", "(Ls0/z;Z)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "C2", "(LE1/K;LE1/H;J)J", "LE1/r;", "LE1/q;", "", "width", "I", "(LE1/r;LE1/q;I)I", "w", "n", "Ls0/z;", "getHeight", "()Ls0/z;", "F2", "(Ls0/z;)V", "o", "Z", "D2", "()Z", "E2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class w extends y {

    /* renamed from: n  reason: collision with root package name */
    private C5880z f18239n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f18240o;

    public w(C5880z zVar, boolean z10) {
        this.f18239n = zVar;
        this.f18240o = z10;
    }

    public long C2(K k10, H h10, long j10) {
        int V10 = this.f18239n == C5880z.Min ? h10.V(C5267b.l(j10)) : h10.x(C5267b.l(j10));
        if (V10 < 0) {
            V10 = 0;
        }
        return C5267b.f23024b.d(V10);
    }

    public boolean D2() {
        return this.f18240o;
    }

    public void E2(boolean z10) {
        this.f18240o = z10;
    }

    public final void F2(C5880z zVar) {
        this.f18239n = zVar;
    }

    public int I(r rVar, C4484q qVar, int i10) {
        return this.f18239n == C5880z.Min ? qVar.V(i10) : qVar.x(i10);
    }

    public int w(r rVar, C4484q qVar, int i10) {
        return this.f18239n == C5880z.Min ? qVar.V(i10) : qVar.x(i10);
    }
}
