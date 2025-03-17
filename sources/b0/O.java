package B0;

import E0.C4457o;
import N1.W;
import QJ.Q;
import T1.H;
import T1.P;
import U0.C4889m;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.room.x;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import m0.C5531a0;
import m0.C5546i;
import m0.C5547i0;
import m0.C5548j;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5668h;
import o1.C5669i;
import o1.C5673m;
import p1.C5728l0;
import p1.C5749w0;
import p1.V0;
import r1.C5817c;
import tI.C17978n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/d;", "LB0/B;", "state", "LT1/P;", "value", "LT1/H;", "offsetMapping", "Lp1/l0;", "cursorBrush", "", "enabled", "a", "(Landroidx/compose/ui/d;LB0/B;LT1/P;LT1/H;Lp1/l0;Z)Landroidx/compose/ui/d;", "Lm0/i;", "", "Lm0/i;", "cursorAnimationSpec", "Lc2/h;", "b", "F", "()F", "DefaultCursorThickness", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class O {

    /* renamed from: a  reason: collision with root package name */
    private static final C5546i<Float> f4582a = C5548j.e(C5548j.f(b.f4595c), (C5547i0) null, 0, 6, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private static final float f4583b = h.B((float) 2);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5728l0 f4584c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ B f4585d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ P f4586e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ H f4587f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {55}, m = "invokeSuspend")
        /* renamed from: B0.O$a$a  reason: collision with other inner class name */
        static final class C0004a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f4588c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4457o f4589d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0004a(C4457o oVar, C17164e<? super C0004a> eVar) {
                super(2, eVar);
                this.f4589d = oVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0004a(this.f4589d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0004a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f4588c;
                if (i10 == 0) {
                    y.b(obj);
                    C4457o oVar = this.f4589d;
                    this.f4588c = 1;
                    if (oVar.e(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/c;", "LXH/N;", "a", "(Lr1/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17642l<C5817c, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4457o f4590c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ H f4591d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ P f4592e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ B f4593f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C5728l0 f4594g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C4457o oVar, H h10, P p10, B b10, C5728l0 l0Var) {
                super(1);
                this.f4590c = oVar;
                this.f4591d = h10;
                this.f4592e = p10;
                this.f4593f = b10;
                this.f4594g = l0Var;
            }

            public final void a(C5817c cVar) {
                C5669i iVar;
                N1.P f10;
                cVar.V1();
                float c10 = this.f4590c.c();
                if (c10 != 0.0f) {
                    int b10 = this.f4591d.b(W.n(this.f4592e.h()));
                    d0 j10 = this.f4593f.j();
                    if (j10 == null || (f10 = j10.f()) == null || (iVar = f10.e(b10)) == null) {
                        iVar = new C5669i(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float H12 = cVar.H1(O.b());
                    float f11 = H12 / ((float) 2);
                    float d10 = C17978n.d(C17978n.h(iVar.o() + f11, C5673m.l(cVar.b()) - f11), f11);
                    r1.f.h1(cVar, this.f4594g, C5668h.a(d10, iVar.r()), C5668h.a(d10, iVar.j()), H12, 0, (V0) null, c10, (C5749w0) null, 0, 432, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5817c) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5728l0 l0Var, B b10, P p10, H h10) {
            super(3);
            this.f4584c = l0Var;
            this.f4585d = b10;
            this.f4586e = p10;
            this.f4587f = h10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cb, code lost:
            if (r1 == r0.a()) goto L_0x00cd;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.compose.ui.d a(androidx.compose.ui.d r9, U0.C4889m r10, int r11) {
            /*
                r8 = this;
                r0 = -84507373(0xfffffffffaf68513, float:-6.4000205E35)
                r10.W(r0)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0012
                r1 = -1
                java.lang.String r2 = "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)"
                U0.C4895p.S(r0, r11, r1, r2)
            L_0x0012:
                java.lang.Object r11 = r10.D()
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r1 = r0.a()
                if (r11 != r1) goto L_0x0026
                E0.o r11 = new E0.o
                r11.<init>()
                r10.u(r11)
            L_0x0026:
                r2 = r11
                E0.o r2 = (E0.C4457o) r2
                p1.l0 r11 = r8.f4584c
                boolean r1 = r11 instanceof p1.j1
                r3 = 0
                if (r1 == 0) goto L_0x003e
                p1.j1 r11 = (p1.j1) r11
                long r4 = r11.b()
                r6 = 16
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 != 0) goto L_0x003e
                r11 = r3
                goto L_0x003f
            L_0x003e:
                r11 = 1
            L_0x003f:
                U0.I0 r1 = androidx.compose.ui.platform.C5100f0.s()
                java.lang.Object r1 = r10.Q(r1)
                androidx.compose.ui.platform.C1 r1 = (androidx.compose.ui.platform.C1) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L_0x00e0
                B0.B r1 = r8.f4585d
                boolean r1 = r1.e()
                if (r1 == 0) goto L_0x00e0
                T1.P r1 = r8.f4586e
                long r4 = r1.h()
                boolean r1 = N1.W.h(r4)
                if (r1 == 0) goto L_0x00e0
                if (r11 == 0) goto L_0x00e0
                r11 = 808320157(0x302dfc9d, float:6.329602E-10)
                r10.W(r11)
                T1.P r11 = r8.f4586e
                N1.d r11 = r11.f()
                T1.P r1 = r8.f4586e
                long r4 = r1.h()
                N1.W r1 = N1.W.b(r4)
                boolean r4 = r10.F(r2)
                java.lang.Object r5 = r10.D()
                if (r4 != 0) goto L_0x008b
                java.lang.Object r4 = r0.a()
                if (r5 != r4) goto L_0x0094
            L_0x008b:
                B0.O$a$a r5 = new B0.O$a$a
                r4 = 0
                r5.<init>(r2, r4)
                r10.u(r5)
            L_0x0094:
                nI.p r5 = (nI.p) r5
                U0.P.f(r11, r1, r5, r10, r3)
                boolean r11 = r10.F(r2)
                T1.H r1 = r8.f4587f
                boolean r1 = r10.F(r1)
                r11 = r11 | r1
                T1.P r1 = r8.f4586e
                boolean r1 = r10.V(r1)
                r11 = r11 | r1
                B0.B r1 = r8.f4585d
                boolean r1 = r10.F(r1)
                r11 = r11 | r1
                p1.l0 r1 = r8.f4584c
                boolean r1 = r10.V(r1)
                r11 = r11 | r1
                T1.H r3 = r8.f4587f
                T1.P r4 = r8.f4586e
                B0.B r5 = r8.f4585d
                p1.l0 r6 = r8.f4584c
                java.lang.Object r1 = r10.D()
                if (r11 != 0) goto L_0x00cd
                java.lang.Object r11 = r0.a()
                if (r1 != r11) goto L_0x00d6
            L_0x00cd:
                B0.O$a$b r11 = new B0.O$a$b
                r1 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r10.u(r11)
            L_0x00d6:
                nI.l r1 = (nI.C17642l) r1
                androidx.compose.ui.d r9 = androidx.compose.ui.draw.b.d(r9, r1)
                r10.P()
                goto L_0x00eb
            L_0x00e0:
                r9 = 809534830(0x3040856e, float:7.003881E-10)
                r10.W(r9)
                r10.P()
                androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            L_0x00eb:
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x00f4
                U0.C4895p.R()
            L_0x00f4:
                r10.P()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: B0.O.a.a(androidx.compose.ui.d, U0.m, int):androidx.compose.ui.d");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/a0$b;", "", "LXH/N;", "a", "(Lm0/a0$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5531a0.b<Float>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f4595c = new b();

        b() {
            super(1);
        }

        public final void a(C5531a0.b<Float> bVar) {
            bVar.e(1000);
            Float valueOf = Float.valueOf(1.0f);
            bVar.g(valueOf, 0);
            bVar.g(valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar.g(valueOf2, 500);
            bVar.g(valueOf2, x.MAX_BIND_PARAMETER_CNT);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5531a0.b) obj);
            return C16807N.f139792a;
        }
    }

    public static final d a(d dVar, B b10, P p10, H h10, C5728l0 l0Var, boolean z10) {
        return z10 ? c.c(dVar, (C17642l) null, new a(l0Var, b10, p10, h10), 1, (Object) null) : dVar;
    }

    public static final float b() {
        return f4583b;
    }
}
