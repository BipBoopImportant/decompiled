package wK;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.u;
import m0.C5546i;
import nI.C17642l;
import p1.C5747v0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LwK/r;", "", "LwK/T1;", "componentStyle", "<init>", "(LwK/T1;)V", "LU0/A1;", "Lp1/v0;", "b", "(LU0/m;I)LU0/A1;", "a", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LwK/T1;", "getComponentStyle", "()LwK/T1;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.r  reason: case insensitive filesystem */
final class C18461r {

    /* renamed from: a  reason: collision with root package name */
    private final T1 f151465a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.r$a */
    static final class a implements C17642l<C5747v0, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f151466a = new a();

        a() {
        }

        public final void a(long j10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5747v0) obj).y());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.r$b */
    static final class b implements C17642l<C5747v0, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f151467a = new b();

        b() {
        }

        public final void a(long j10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5747v0) obj).y());
            return C16807N.f139792a;
        }
    }

    public C18461r(T1 t12) {
        C17542s.j(t12, "componentStyle");
        this.f151465a = t12;
    }

    public final A1<C5747v0> a(C4889m mVar, int i10) {
        mVar.W(436267882);
        if (C4895p.J()) {
            C4895p.S(436267882, i10, -1, "net.ikea.skapa.ui.components.AnimationStates.animatedDividerColorSpan (SegmentedControl.kt:517)");
        }
        long c10 = this.f151465a.c(mVar, 0);
        C5546i<C5747v0> b10 = new C18449q().b();
        mVar.W(434823738);
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = a.f151466a;
            mVar.u(D10);
        }
        mVar.P();
        A1<C5747v0> a10 = u.a(c10, b10, "Divider color animation", (C17642l) D10, mVar, 3456, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a10;
    }

    public final A1<C5747v0> b(C4889m mVar, int i10) {
        mVar.W(1095111190);
        if (C4895p.J()) {
            C4895p.S(1095111190, i10, -1, "net.ikea.skapa.ui.components.AnimationStates.animatedForegroundColorSpan (SegmentedControl.kt:508)");
        }
        long b10 = this.f151465a.b(mVar, 0);
        C5546i<C5747v0> a10 = new C18449q().a();
        mVar.W(-234358152);
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = b.f151467a;
            mVar.u(D10);
        }
        mVar.P();
        A1<C5747v0> a11 = u.a(b10, a10, "Text color animation", (C17642l) D10, mVar, 3456, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18461r) && C17542s.e(this.f151465a, ((C18461r) obj).f151465a);
    }

    public int hashCode() {
        return this.f151465a.hashCode();
    }

    public String toString() {
        T1 t12 = this.f151465a;
        return "AnimationStates(componentStyle=" + t12 + ")";
    }
}
