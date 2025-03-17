package androidx.compose.foundation;

import G1.w0;
import L1.j;
import L1.v;
import L1.x;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import p0.s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b\t\u0010\u001a\"\u0004\b$\u0010\u001cR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b\n\u0010\u001a\"\u0004\b&\u0010\u001c¨\u0006'"}, d2 = {"Landroidx/compose/foundation/n;", "Landroidx/compose/ui/d$c;", "LG1/w0;", "Landroidx/compose/foundation/o;", "state", "", "reverseScrolling", "Lp0/s;", "flingBehavior", "isScrollable", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZLp0/s;ZZ)V", "LL1/x;", "LXH/N;", "m0", "(LL1/x;)V", "n", "Landroidx/compose/foundation/o;", "C2", "()Landroidx/compose/foundation/o;", "G2", "(Landroidx/compose/foundation/o;)V", "o", "Z", "getReverseScrolling", "()Z", "E2", "(Z)V", "p", "Lp0/s;", "getFlingBehavior", "()Lp0/s;", "D2", "(Lp0/s;)V", "q", "F2", "r", "H2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n extends d.c implements w0 {

    /* renamed from: n  reason: collision with root package name */
    private o f18400n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f18401o;

    /* renamed from: p  reason: collision with root package name */
    private s f18402p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18403q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f18404r;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f18405c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar) {
            super(0);
            this.f18405c = nVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf((float) this.f18405c.C2().n());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f18406c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(0);
            this.f18406c = nVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf((float) this.f18406c.C2().m());
        }
    }

    public n(o oVar, boolean z10, s sVar, boolean z11, boolean z12) {
        this.f18400n = oVar;
        this.f18401o = z10;
        this.f18402p = sVar;
        this.f18403q = z11;
        this.f18404r = z12;
    }

    public final o C2() {
        return this.f18400n;
    }

    public final void D2(s sVar) {
        this.f18402p = sVar;
    }

    public final void E2(boolean z10) {
        this.f18401o = z10;
    }

    public final void F2(boolean z10) {
        this.f18403q = z10;
    }

    public final void G2(o oVar) {
        this.f18400n = oVar;
    }

    public final void H2(boolean z10) {
        this.f18404r = z10;
    }

    public void m0(x xVar) {
        v.A0(xVar, true);
        j jVar = new j(new a(this), new b(this), this.f18401o);
        if (this.f18404r) {
            v.C0(xVar, jVar);
        } else {
            v.h0(xVar, jVar);
        }
    }
}
