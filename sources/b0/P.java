package B0;

import E1.C4488v;
import E1.C4489w;
import N1.C4669d;
import N1.D;
import N1.G;
import N1.U;
import N1.W;
import N1.X;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import T1.C4840i;
import T1.C4842k;
import T1.C4849s;
import T1.H;
import T1.S;
import T1.Y;
import T1.Z;
import U1.e;
import XH.C16795B;
import XH.C16807N;
import Y1.k;
import Y1.o;
import c2.r;
import c2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5670j;
import o1.C5674n;
import p1.C5732n0;
import p1.C5747v0;
import p1.O0;
import p1.S0;
import p1.g1;
import r1.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB0/P;", "", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4596a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JH\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010#\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$JG\u0010+\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b+\u0010,J/\u0010/\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020.H\u0001¢\u0006\u0004\b/\u00100JC\u00109\u001a\u00020\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\b\u00108\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b9\u0010:JF\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020.2\u0006\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\b2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>JW\u0010E\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bE\u0010FJW\u0010G\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bG\u0010FJ3\u0010H\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bH\u0010IJ \u0010M\u001a\u00020K2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010L\u001a\u00020Kø\u0001\u0000¢\u0006\u0004\bM\u0010N\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"LB0/P$a;", "", "<init>", "()V", "Lp1/n0;", "canvas", "LN1/W;", "range", "LT1/H;", "offsetMapping", "LN1/P;", "textLayoutResult", "Lp1/S0;", "paint", "LXH/N;", "c", "(Lp1/n0;JLT1/H;LN1/P;Lp1/S0;)V", "LB0/L;", "textDelegate", "Lc2/b;", "constraints", "Lc2/t;", "layoutDirection", "prevResultText", "LXH/B;", "", "d", "(LB0/L;JLc2/t;LN1/P;)LXH/B;", "LT1/P;", "value", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "highlightPaint", "Lp1/v0;", "selectionBackgroundColor", "b", "(Lp1/n0;LT1/P;JJLT1/H;LN1/P;Lp1/S0;J)V", "LE1/v;", "layoutCoordinates", "LT1/Y;", "textInputSession", "", "hasFocus", "e", "(LT1/P;LB0/L;LN1/P;LE1/v;LT1/Y;ZLT1/H;)V", "textFieldValue", "LB0/d0;", "k", "(LT1/Y;LT1/P;LT1/H;LB0/d0;)V", "", "LT1/i;", "ops", "LT1/k;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "g", "(Ljava/util/List;LT1/k;LnI/l;LT1/Y;)V", "Lo1/g;", "position", "j", "(JLB0/d0;LT1/k;LT1/H;LnI/l;)V", "LT1/S;", "textInputService", "LT1/s;", "imeOptions", "LT1/r;", "onImeActionPerformed", "i", "(LT1/S;LT1/P;LT1/k;LT1/s;LnI/l;LnI/l;)LT1/Y;", "h", "f", "(LT1/Y;LT1/k;LnI/l;)V", "compositionRange", "LT1/Z;", "transformed", "a", "(JLT1/Z;)LT1/Z;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LT1/i;", "it", "LXH/N;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B0.P$a$a  reason: collision with other inner class name */
        static final class C0005a extends C17544u implements C17642l<List<? extends C4840i>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4842k f4597c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<T1.P, C16807N> f4598d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ O<Y> f4599e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0005a(C4842k kVar, C17642l<? super T1.P, C16807N> lVar, O<Y> o10) {
                super(1);
                this.f4597c = kVar;
                this.f4598d = lVar;
                this.f4599e = o10;
            }

            public final void a(List<? extends C4840i> list) {
                P.f4596a.g(list, this.f4597c, this.f4598d, (Y) this.f4599e.f144348a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/O0;", "matrix", "LXH/N;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17642l<O0, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4488v f4600c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C4488v vVar) {
                super(1);
                this.f4600c = vVar;
            }

            public final void a(float[] fArr) {
                if (this.f4600c.c()) {
                    C4489w.d(this.f4600c).r0(this.f4600c, fArr);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((O0) obj).r());
                return C16807N.f139792a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c(C5732n0 n0Var, long j10, H h10, N1.P p10, S0 s02) {
            int b10 = h10.b(W.l(j10));
            int b11 = h10.b(W.k(j10));
            if (b10 != b11) {
                n0Var.h(p10.z(b10, b11), s02);
            }
        }

        public final Z a(long j10, Z z10) {
            int b10 = z10.a().b(W.n(j10));
            int b11 = z10.a().b(W.i(j10));
            int min = Math.min(b10, b11);
            int max = Math.max(b10, b11);
            C4669d.a aVar = new C4669d.a(z10.b());
            aVar.d(new G(0, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, k.f14792b.d(), (g1) null, (D) null, (g) null, 61439, (DefaultConstructorMarker) null), min, max);
            return new Z(aVar.q(), z10.a());
        }

        public final void b(C5732n0 n0Var, T1.P p10, long j10, long j11, H h10, N1.P p11, S0 s02, long j12) {
            if (!W.h(j10)) {
                s02.j(j12);
                c(n0Var, j10, h10, p11, s02);
            } else if (!W.h(j11)) {
                C5747v0 k10 = C5747v0.k(p11.l().i().h());
                if (k10.y() == 16) {
                    k10 = null;
                }
                long y10 = k10 != null ? k10.y() : C5747v0.f27350b.a();
                S0 s03 = s02;
                s03.j(C5747v0.o(y10, C5747v0.r(y10) * 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                c(n0Var, j11, h10, p11, s03);
            } else {
                S0 s04 = s02;
                if (!W.h(p10.h())) {
                    s02.j(j12);
                    c(n0Var, p10.h(), h10, p11, s02);
                }
            }
            C5732n0 n0Var2 = n0Var;
            U.f9418a.a(n0Var, p11);
        }

        public final C16795B<Integer, Integer, N1.P> d(L l10, long j10, t tVar, N1.P p10) {
            N1.P l11 = l10.l(j10, tVar, p10);
            return new C16795B<>(Integer.valueOf(r.h(l11.B())), Integer.valueOf(r.g(l11.B())), l11);
        }

        public final void e(T1.P p10, L l10, N1.P p11, C4488v vVar, Y y10, boolean z10, H h10) {
            if (z10) {
                int b10 = h10.b(W.k(p10.h()));
                C5669i d10 = b10 < p11.l().j().length() ? p11.d(b10) : b10 != 0 ? p11.d(b10 - 1) : new C5669i(0.0f, 0.0f, 1.0f, (float) r.g(Q.b(l10.j(), l10.a(), l10.b(), (String) null, 0, 24, (Object) null)));
                long p02 = vVar.p0(C5668h.a(d10.o(), d10.r()));
                y10.c(C5670j.c(C5668h.a(C5667g.m(p02), C5667g.n(p02)), C5674n.a(d10.t(), d10.n())));
            }
        }

        public final void f(Y y10, C4842k kVar, C17642l<? super T1.P, C16807N> lVar) {
            lVar.invoke(T1.P.d(kVar.f(), (C4669d) null, 0, (W) null, 3, (Object) null));
            y10.a();
        }

        public final void g(List<? extends C4840i> list, C4842k kVar, C17642l<? super T1.P, C16807N> lVar, Y y10) {
            T1.P b10 = kVar.b(list);
            if (y10 != null) {
                y10.d((T1.P) null, b10);
            }
            lVar.invoke(b10);
        }

        public final Y h(S s10, T1.P p10, C4842k kVar, C4849s sVar, C17642l<? super T1.P, C16807N> lVar, C17642l<? super T1.r, C16807N> lVar2) {
            return i(s10, p10, kVar, sVar, lVar, lVar2);
        }

        public final Y i(S s10, T1.P p10, C4842k kVar, C4849s sVar, C17642l<? super T1.P, C16807N> lVar, C17642l<? super T1.r, C16807N> lVar2) {
            O o10 = new O();
            T d10 = s10.d(p10, sVar, new C0005a(kVar, lVar, o10), lVar2);
            o10.f144348a = d10;
            return d10;
        }

        public final void j(long j10, d0 d0Var, C4842k kVar, H h10, C17642l<? super T1.P, C16807N> lVar) {
            lVar.invoke(T1.P.d(kVar.f(), (C4669d) null, X.a(h10.a(d0.e(d0Var, j10, false, 2, (Object) null))), (W) null, 5, (Object) null));
        }

        public final void k(Y y10, T1.P p10, H h10, d0 d0Var) {
            C4488v b10;
            C4488v c10 = d0Var.c();
            if (c10 != null && c10.c() && (b10 = d0Var.b()) != null) {
                y10.e(p10, h10, d0Var.f(), new b(c10), H0.H.i(c10), c10.m0(b10, false));
            }
        }

        private a() {
        }
    }
}
