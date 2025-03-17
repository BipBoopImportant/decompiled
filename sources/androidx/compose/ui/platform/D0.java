package androidx.compose.ui.platform;

import I2.C4600b0;
import I2.E;
import YH.C16870n;
import android.view.View;
import c2.y;
import dI.C17164e;
import kotlin.Metadata;
import o1.C5667g;
import z1.C6271a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/D0;", "Lz1/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "LXH/N;", "a", "()V", "Lo1/g;", "available", "Lz1/e;", "source", "C1", "(JI)J", "consumed", "N0", "(JJI)J", "Lc2/y;", "E1", "(JLdI/e;)Ljava/lang/Object;", "g0", "(JJLdI/e;)Ljava/lang/Object;", "Landroid/view/View;", "LI2/E;", "b", "LI2/E;", "nestedScrollChildHelper", "", "c", "[I", "consumedScrollCache", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D0 implements C6271a {

    /* renamed from: a  reason: collision with root package name */
    private final View f19177a;

    /* renamed from: b  reason: collision with root package name */
    private final E f19178b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f19179c = new int[2];

    public D0(View view) {
        this.f19177a = view;
        E e10 = new E(view);
        e10.m(true);
        this.f19178b = e10;
        C4600b0.D0(view, true);
    }

    private final void a() {
        if (this.f19178b.k(0)) {
            this.f19178b.r(0);
        }
        if (this.f19178b.k(1)) {
            this.f19178b.r(1);
        }
    }

    public long C1(long j10, int i10) {
        if (!this.f19178b.p(E0.g(j10), E0.k(i10))) {
            return C5667g.f26701b.c();
        }
        C16870n.y(this.f19179c, 0, 0, 0, 6, (Object) null);
        this.f19178b.d(E0.f(C5667g.m(j10)), E0.f(C5667g.n(j10)), this.f19179c, (int[]) null, E0.k(i10));
        return E0.j(this.f19179c, j10);
    }

    public Object E1(long j10, C17164e<? super y> eVar) {
        if (!this.f19178b.b(E0.l(y.h(j10)), E0.l(y.i(j10)))) {
            j10 = y.f23066b.a();
        }
        a();
        return y.b(j10);
    }

    public long N0(long j10, long j11, int i10) {
        if (!this.f19178b.p(E0.g(j11), E0.k(i10))) {
            return C5667g.f26701b.c();
        }
        C16870n.y(this.f19179c, 0, 0, 0, 6, (Object) null);
        this.f19178b.e(E0.f(C5667g.m(j10)), E0.f(C5667g.n(j10)), E0.f(C5667g.m(j11)), E0.f(C5667g.n(j11)), (int[]) null, E0.k(i10), this.f19179c);
        return E0.j(this.f19179c, j11);
    }

    public Object g0(long j10, long j11, C17164e<? super y> eVar) {
        if (!this.f19178b.a(E0.l(y.h(j11)), E0.l(y.i(j11)), true)) {
            j11 = y.f23066b.a();
        }
        a();
        return y.b(j11);
    }
}
