package V0;

import U0.C0;
import U0.C4865c1;
import U0.C4866d;
import U0.C4872f;
import U0.C4874f1;
import U0.C4885k;
import U0.C4888l0;
import U0.C4890m0;
import U0.C4897q;
import U0.F;
import U0.S0;
import U0.T0;
import U0.r;
import V0.d;
import V0.g;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\u0003J\u0015\u0010*\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0003J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0003J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0003J\u001d\u00101\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J%\u00105\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0017¢\u0006\u0004\b8\u0010#J)\u0010=\u001a\u00020\b2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b092\u0006\u0010<\u001a\u00020:¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b@\u0010(J;\u0010E\u001a\u00020\b\"\u0004\b\u0000\u0010A\"\u0004\b\u0001\u0010B2\u0006\u0010\u0013\u001a\u00028\u00012\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0C¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0017¢\u0006\u0004\bI\u0010JJ%\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u0017¢\u0006\u0004\bO\u0010#J\u0015\u0010P\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\bP\u0010#J\u001d\u0010S\u001a\u00020\b2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160Q¢\u0006\u0004\bS\u0010TJ\u001b\u0010W\u001a\u00020\b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\b0U¢\u0006\u0004\bW\u0010XJ\u001d\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b[\u0010\\J%\u0010_\u001a\u00020\b2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160]2\u0006\u0010^\u001a\u00020Y¢\u0006\u0004\b_\u0010`J/\u0010f\u001a\u00020\b2\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010d\u001a\u00020c2\u0006\u00100\u001a\u00020e2\u0006\u0010K\u001a\u00020e¢\u0006\u0004\bf\u0010gJ%\u0010j\u001a\u00020\b2\u0006\u0010<\u001a\u00020h2\u0006\u0010d\u001a\u00020c2\u0006\u0010i\u001a\u00020e¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\b¢\u0006\u0004\bl\u0010\u0003J!\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020\u00002\n\b\u0002\u0010^\u001a\u0004\u0018\u00010Y¢\u0006\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020p8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010q¨\u0006s"}, d2 = {"LV0/a;", "LV0/h;", "<init>", "()V", "", "c", "()Z", "d", "LXH/N;", "a", "LU0/f;", "applier", "LU0/f1;", "slots", "LU0/S0;", "rememberManager", "b", "(LU0/f;LU0/f1;LU0/S0;)V", "LU0/T0;", "value", "w", "(LU0/T0;)V", "", "", "groupSlotIndex", "G", "(Ljava/lang/Object;I)V", "LU0/d;", "anchor", "D", "(Ljava/lang/Object;LU0/d;I)V", "f", "(LU0/d;Ljava/lang/Object;)V", "count", "C", "(I)V", "z", "i", "data", "E", "(Ljava/lang/Object;)V", "p", "o", "(LU0/d;)V", "m", "B", "x", "LU0/c1;", "from", "r", "(LU0/d;LU0/c1;)V", "LV0/c;", "fixups", "s", "(LU0/d;LU0/c1;LV0/c;)V", "offset", "t", "Lkotlin/Function1;", "LU0/q;", "action", "composition", "l", "(LnI/l;LU0/q;)V", "node", "I", "T", "V", "Lkotlin/Function2;", "block", "F", "(Ljava/lang/Object;LnI/p;)V", "removeFrom", "moveCount", "y", "(II)V", "to", "u", "(III)V", "distance", "e", "H", "", "nodes", "k", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "A", "(LnI/a;)V", "Lc1/d;", "effectiveNodeIndexOut", "j", "(Lc1/d;LU0/d;)V", "", "effectiveNodeIndex", "g", "(Ljava/util/List;Lc1/d;)V", "LU0/l0;", "resolvedState", "LU0/r;", "parentContext", "LU0/m0;", "h", "(LU0/l0;LU0/r;LU0/m0;LU0/m0;)V", "LU0/F;", "reference", "v", "(LU0/F;LU0/r;LU0/m0;)V", "n", "changeList", "q", "(LV0/a;Lc1/d;)V", "LV0/g;", "LV0/g;", "operations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private final g f14488a = new g();

    public final void A(C17631a<C16807N> aVar) {
        g gVar = this.f14488a;
        d.A a10 = d.A.f14507c;
        gVar.y(a10);
        g.c.d(g.c.a(gVar), d.t.a(0), aVar);
        if (!(gVar.f14550g == gVar.n(a10.b()) && gVar.f14551h == gVar.n(a10.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = a10.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(a10.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = a10.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(a10.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + a10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void B() {
        this.f14488a.x(d.B.f14508c);
    }

    public final void C(int i10) {
        g gVar = this.f14488a;
        d.C c10 = d.C.f14509c;
        gVar.y(c10);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (!(gVar.f14550g == gVar.n(c10.b()) && gVar.f14551h == gVar.n(c10.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = c10.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f14550g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c10.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = c10.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f14551h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(c10.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + c10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void D(Object obj, C4866d dVar, int i10) {
        g gVar = this.f14488a;
        d.D d10 = d.D.f14510c;
        gVar.y(d10);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), obj);
        g.c.d(a10, d.t.a(1), dVar);
        g.c.c(a10, d.q.a(0), i10);
        if (!(gVar.f14550g == gVar.n(d10.b()) && gVar.f14551h == gVar.n(d10.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = d10.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f14550g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(d10.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d11 = d10.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d11; i14++) {
                if (((1 << i14) & gVar.f14551h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(d10.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + d10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void E(Object obj) {
        g gVar = this.f14488a;
        d.E e10 = d.E.f14511c;
        gVar.y(e10);
        g.c.d(g.c.a(gVar), d.t.a(0), obj);
        if (!(gVar.f14550g == gVar.n(e10.b()) && gVar.f14551h == gVar.n(e10.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = e10.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(e10.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = e10.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(e10.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + e10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final <T, V> void F(V v10, p<? super T, ? super V, C16807N> pVar) {
        g gVar = this.f14488a;
        d.F f10 = d.F.f14512c;
        gVar.y(f10);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), v10);
        int a11 = d.t.a(1);
        C17542s.h(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        g.c.d(a10, a11, (p) W.g(pVar, 2));
        if (!(gVar.f14550g == gVar.n(f10.b()) && gVar.f14551h == gVar.n(f10.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = f10.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(f10.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = f10.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(f10.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + f10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void G(Object obj, int i10) {
        g gVar = this.f14488a;
        d.G g10 = d.G.f14513c;
        gVar.y(g10);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), obj);
        g.c.c(a10, d.q.a(0), i10);
        if (!(gVar.f14550g == gVar.n(g10.b()) && gVar.f14551h == gVar.n(g10.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = g10.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f14550g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(g10.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = g10.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f14551h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(g10.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + g10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void H(int i10) {
        g gVar = this.f14488a;
        d.H h10 = d.H.f14514c;
        gVar.y(h10);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (!(gVar.f14550g == gVar.n(h10.b()) && gVar.f14551h == gVar.n(h10.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = h10.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f14550g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(h10.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = h10.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f14551h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(h10.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + h10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void I(Object obj) {
        if (obj instanceof C4885k) {
            this.f14488a.x(d.I.f14515c);
        }
    }

    public final void a() {
        this.f14488a.m();
    }

    public final void b(C4872f<?> fVar, C4874f1 f1Var, S0 s02) {
        this.f14488a.r(fVar, f1Var, s02);
    }

    public final boolean c() {
        return this.f14488a.t();
    }

    public final boolean d() {
        return this.f14488a.u();
    }

    public final void e(int i10) {
        g gVar = this.f14488a;
        d.C4941a aVar = d.C4941a.f14516c;
        gVar.y(aVar);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (!(gVar.f14550g == gVar.n(aVar.b()) && gVar.f14551h == gVar.n(aVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = aVar.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f14550g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(aVar.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = aVar.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f14551h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(aVar.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + aVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void f(C4866d dVar, Object obj) {
        g gVar = this.f14488a;
        d.C4942b bVar = d.C4942b.f14517c;
        gVar.y(bVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), dVar);
        g.c.d(a10, d.t.a(1), obj);
        if (!(gVar.f14550g == gVar.n(bVar.b()) && gVar.f14551h == gVar.n(bVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = bVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(bVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = bVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(bVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + bVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void g(List<? extends Object> list, c1.d dVar) {
        if (!list.isEmpty()) {
            g gVar = this.f14488a;
            d.C0210d dVar2 = d.C0210d.f14519c;
            gVar.y(dVar2);
            g a10 = g.c.a(gVar);
            g.c.d(a10, d.t.a(1), list);
            g.c.d(a10, d.t.a(0), dVar);
            if (!(gVar.f14550g == gVar.n(dVar2.b()) && gVar.f14551h == gVar.n(dVar2.d()))) {
                StringBuilder sb2 = new StringBuilder();
                int b10 = dVar2.b();
                int i10 = 0;
                for (int i11 = 0; i11 < b10; i11++) {
                    if (((1 << i11) & gVar.f14550g) != 0) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(dVar2.e(d.q.a(i11)));
                        i10++;
                    }
                }
                String sb3 = sb2.toString();
                C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder();
                int d10 = dVar2.d();
                int i12 = 0;
                for (int i13 = 0; i13 < d10; i13++) {
                    if (((1 << i13) & gVar.f14551h) != 0) {
                        if (i10 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(dVar2.f(d.t.a(i13)));
                        i12++;
                    }
                }
                String sb5 = sb4.toString();
                C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
                C0.b("Error while pushing " + dVar2 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
            }
        }
    }

    public final void h(C4888l0 l0Var, r rVar, C4890m0 m0Var, C4890m0 m0Var2) {
        g gVar = this.f14488a;
        d.C4944e eVar = d.C4944e.f14520c;
        gVar.y(eVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), l0Var);
        g.c.d(a10, d.t.a(1), rVar);
        g.c.d(a10, d.t.a(3), m0Var2);
        g.c.d(a10, d.t.a(2), m0Var);
        if (!(gVar.f14550g == gVar.n(eVar.b()) && gVar.f14551h == gVar.n(eVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = eVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(eVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = eVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(eVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + eVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void i() {
        this.f14488a.x(d.C4945f.f14521c);
    }

    public final void j(c1.d dVar, C4866d dVar2) {
        g gVar = this.f14488a;
        d.C4946g gVar2 = d.C4946g.f14522c;
        gVar.y(gVar2);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), dVar);
        g.c.d(a10, d.t.a(1), dVar2);
        if (!(gVar.f14550g == gVar.n(gVar2.b()) && gVar.f14551h == gVar.n(gVar2.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = gVar2.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(gVar2.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = gVar2.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(gVar2.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + gVar2 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void k(Object[] objArr) {
        if (!(objArr.length == 0)) {
            g gVar = this.f14488a;
            d.C4947h hVar = d.C4947h.f14523c;
            gVar.y(hVar);
            g.c.d(g.c.a(gVar), d.t.a(0), objArr);
            if (!(gVar.f14550g == gVar.n(hVar.b()) && gVar.f14551h == gVar.n(hVar.d()))) {
                StringBuilder sb2 = new StringBuilder();
                int b10 = hVar.b();
                int i10 = 0;
                for (int i11 = 0; i11 < b10; i11++) {
                    if (((1 << i11) & gVar.f14550g) != 0) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(hVar.e(d.q.a(i11)));
                        i10++;
                    }
                }
                String sb3 = sb2.toString();
                C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder();
                int d10 = hVar.d();
                int i12 = 0;
                for (int i13 = 0; i13 < d10; i13++) {
                    if (((1 << i13) & gVar.f14551h) != 0) {
                        if (i10 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(hVar.f(d.t.a(i13)));
                        i12++;
                    }
                }
                String sb5 = sb4.toString();
                C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
                C0.b("Error while pushing " + hVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
            }
        }
    }

    public final void l(C17642l<? super C4897q, C16807N> lVar, C4897q qVar) {
        g gVar = this.f14488a;
        d.C4948i iVar = d.C4948i.f14524c;
        gVar.y(iVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), lVar);
        g.c.d(a10, d.t.a(1), qVar);
        if (!(gVar.f14550g == gVar.n(iVar.b()) && gVar.f14551h == gVar.n(iVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = iVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(iVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = iVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(iVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + iVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void m() {
        this.f14488a.x(d.j.f14525c);
    }

    public final void n() {
        this.f14488a.x(d.k.f14526c);
    }

    public final void o(C4866d dVar) {
        g gVar = this.f14488a;
        d.l lVar = d.l.f14527c;
        gVar.y(lVar);
        g.c.d(g.c.a(gVar), d.t.a(0), dVar);
        if (!(gVar.f14550g == gVar.n(lVar.b()) && gVar.f14551h == gVar.n(lVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = lVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(lVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = lVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(lVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + lVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void p() {
        this.f14488a.x(d.m.f14528c);
    }

    public final void q(a aVar, c1.d dVar) {
        if (aVar.d()) {
            g gVar = this.f14488a;
            d.C4943c cVar = d.C4943c.f14518c;
            gVar.y(cVar);
            g a10 = g.c.a(gVar);
            g.c.d(a10, d.t.a(0), aVar);
            g.c.d(a10, d.t.a(1), dVar);
            if (!(gVar.f14550g == gVar.n(cVar.b()) && gVar.f14551h == gVar.n(cVar.d()))) {
                StringBuilder sb2 = new StringBuilder();
                int b10 = cVar.b();
                int i10 = 0;
                for (int i11 = 0; i11 < b10; i11++) {
                    if (((1 << i11) & gVar.f14550g) != 0) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(cVar.e(d.q.a(i11)));
                        i10++;
                    }
                }
                String sb3 = sb2.toString();
                C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder();
                int d10 = cVar.d();
                int i12 = 0;
                for (int i13 = 0; i13 < d10; i13++) {
                    if (((1 << i13) & gVar.f14551h) != 0) {
                        if (i10 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(cVar.f(d.t.a(i13)));
                        i12++;
                    }
                }
                String sb5 = sb4.toString();
                C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
                C0.b("Error while pushing " + cVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
            }
        }
    }

    public final void r(C4866d dVar, C4865c1 c1Var) {
        g gVar = this.f14488a;
        d.o oVar = d.o.f14530c;
        gVar.y(oVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), dVar);
        g.c.d(a10, d.t.a(1), c1Var);
        if (!(gVar.f14550g == gVar.n(oVar.b()) && gVar.f14551h == gVar.n(oVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = oVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(oVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = oVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(oVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void s(C4866d dVar, C4865c1 c1Var, c cVar) {
        g gVar = this.f14488a;
        d.p pVar = d.p.f14531c;
        gVar.y(pVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), dVar);
        g.c.d(a10, d.t.a(1), c1Var);
        g.c.d(a10, d.t.a(2), cVar);
        if (!(gVar.f14550g == gVar.n(pVar.b()) && gVar.f14551h == gVar.n(pVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = pVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(pVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = pVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(pVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + pVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void t(int i10) {
        g gVar = this.f14488a;
        d.r rVar = d.r.f14532c;
        gVar.y(rVar);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (!(gVar.f14550g == gVar.n(rVar.b()) && gVar.f14551h == gVar.n(rVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = rVar.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f14550g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(rVar.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = rVar.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f14551h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(rVar.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void u(int i10, int i11, int i12) {
        g gVar = this.f14488a;
        d.s sVar = d.s.f14533c;
        gVar.y(sVar);
        g a10 = g.c.a(gVar);
        g.c.c(a10, d.q.a(1), i10);
        g.c.c(a10, d.q.a(0), i11);
        g.c.c(a10, d.q.a(2), i12);
        if (!(gVar.f14550g == gVar.n(sVar.b()) && gVar.f14551h == gVar.n(sVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = sVar.b();
            int i13 = 0;
            for (int i14 = 0; i14 < b10; i14++) {
                if (((1 << i14) & gVar.f14550g) != 0) {
                    if (i13 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(sVar.e(d.q.a(i14)));
                    i13++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = sVar.d();
            int i15 = 0;
            for (int i16 = 0; i16 < d10; i16++) {
                if (((1 << i16) & gVar.f14551h) != 0) {
                    if (i13 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(sVar.f(d.t.a(i16)));
                    i15++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + sVar + ". Not all arguments were provided. Missing " + i13 + " int arguments (" + sb3 + ") and " + i15 + " object arguments (" + sb5 + ").");
        }
    }

    public final void v(F f10, r rVar, C4890m0 m0Var) {
        g gVar = this.f14488a;
        d.v vVar = d.v.f14535c;
        gVar.y(vVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), f10);
        g.c.d(a10, d.t.a(1), rVar);
        g.c.d(a10, d.t.a(2), m0Var);
        if (!(gVar.f14550g == gVar.n(vVar.b()) && gVar.f14551h == gVar.n(vVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = vVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(vVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = vVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(vVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + vVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void w(T0 t02) {
        g gVar = this.f14488a;
        d.w wVar = d.w.f14536c;
        gVar.y(wVar);
        g.c.d(g.c.a(gVar), d.t.a(0), t02);
        if (!(gVar.f14550g == gVar.n(wVar.b()) && gVar.f14551h == gVar.n(wVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = wVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f14550g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(wVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = wVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f14551h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(wVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + wVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void x() {
        this.f14488a.x(d.x.f14537c);
    }

    public final void y(int i10, int i11) {
        g gVar = this.f14488a;
        d.y yVar = d.y.f14538c;
        gVar.y(yVar);
        g a10 = g.c.a(gVar);
        g.c.c(a10, d.q.a(0), i10);
        g.c.c(a10, d.q.a(1), i11);
        if (!(gVar.f14550g == gVar.n(yVar.b()) && gVar.f14551h == gVar.n(yVar.d()))) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = yVar.b();
            int i12 = 0;
            for (int i13 = 0; i13 < b10; i13++) {
                if (((1 << i13) & gVar.f14550g) != 0) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(yVar.e(d.q.a(i13)));
                    i12++;
                }
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = yVar.d();
            int i14 = 0;
            for (int i15 = 0; i15 < d10; i15++) {
                if (((1 << i15) & gVar.f14551h) != 0) {
                    if (i12 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(yVar.f(d.t.a(i15)));
                    i14++;
                }
            }
            String sb5 = sb4.toString();
            C17542s.i(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + yVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + sb3 + ") and " + i14 + " object arguments (" + sb5 + ").");
        }
    }

    public final void z() {
        this.f14488a.x(d.z.f14539c);
    }
}
