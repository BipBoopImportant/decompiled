package H0;

import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.B0;
import m0.C5530a;
import m0.C5556n;
import m0.C5559o0;
import m0.z0;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import o1.C5668h;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00108\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\" \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\f\u0010 \u001a\u00020\u00028\nX\u0002²\u0006\f\u0010!\u001a\u00020\u00028\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function0;", "Lo1/g;", "magnifierCenter", "Lkotlin/Function1;", "platformMagnifier", "d", "(Landroidx/compose/ui/d;LnI/a;LnI/l;)Landroidx/compose/ui/d;", "targetCalculation", "LU0/A1;", "f", "(LnI/a;LU0/m;I)LU0/A1;", "Lm0/n;", "a", "Lm0/n;", "UnspecifiedAnimationVector2D", "Lm0/z0;", "b", "Lm0/z0;", "getUnspecifiedSafeOffsetVectorConverter", "()Lm0/z0;", "UnspecifiedSafeOffsetVectorConverter", "c", "J", "getOffsetDisplacementThreshold", "()J", "OffsetDisplacementThreshold", "Lm0/o0;", "Lm0/o0;", "e", "()Lm0/o0;", "MagnifierSpringSpec", "animatedCenter", "targetValue", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class F {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C5556n f6704a = new C5556n(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    private static final z0<C5667g, C5556n> f6705b = B0.a(a.f6708c, b.f6709c);

    /* renamed from: c  reason: collision with root package name */
    private static final long f6706c;

    /* renamed from: d  reason: collision with root package name */
    private static final C5559o0<C5667g> f6707d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "Lm0/n;", "a", "(J)Lm0/n;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C5667g, C5556n> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6708c = new a();

        a() {
            super(1);
        }

        public final C5556n a(long j10) {
            return C5668h.c(j10) ? new C5556n(C5667g.m(j10), C5667g.n(j10)) : F.f6704a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C5667g) obj).v());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/n;", "it", "Lo1/g;", "a", "(Lm0/n;)J"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5556n, C5667g> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f6709c = new b();

        b() {
            super(1);
        }

        public final long a(C5556n nVar) {
            return C5668h.a(nVar.f(), nVar.g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5667g.d(a((C5556n) obj));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "b", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C5667g> f6710c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17631a<C5667g>, androidx.compose.ui.d> f6711d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C5667g> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ A1<C5667g> f6712c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1<C5667g> a12) {
                super(0);
                this.f6712c = a12;
            }

            public final long b() {
                return c.c(this.f6712c);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C5667g.d(b());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17631a<C5667g> aVar, C17642l<? super C17631a<C5667g>, ? extends androidx.compose.ui.d> lVar) {
            super(3);
            this.f6710c = aVar;
            this.f6711d = lVar;
        }

        /* access modifiers changed from: private */
        public static final long c(A1<C5667g> a12) {
            return a12.getValue().v();
        }

        public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            mVar.W(759876635);
            if (C4895p.J()) {
                C4895p.S(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            A1 b10 = F.f(this.f6710c, mVar, 0);
            C17642l<C17631a<C5667g>, androidx.compose.ui.d> lVar = this.f6711d;
            boolean V10 = mVar.V(b10);
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(b10);
                mVar.u(D10);
            }
            androidx.compose.ui.d invoke = lVar.invoke((C17631a) D10);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return invoke;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {86}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f6713c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f6714d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<C5667g> f6715e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5530a<C5667g, C5556n> f6716f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C5667g> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ A1<C5667g> f6717c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(A1<C5667g> a12) {
                super(0);
                this.f6717c = a12;
            }

            public final long b() {
                return F.g(this.f6717c);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C5667g.d(b());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "targetValue", "LXH/N;", "c", "(JLdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5530a<C5667g, C5556n> f6718a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f6719b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {100}, m = "invokeSuspend")
            static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f6720c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C5530a<C5667g, C5556n> f6721d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ long f6722e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(C5530a<C5667g, C5556n> aVar, long j10, C17164e<? super a> eVar) {
                    super(2, eVar);
                    this.f6721d = aVar;
                    this.f6722e = j10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new a(this.f6721d, this.f6722e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f6720c;
                    if (i10 == 0) {
                        y.b(obj);
                        C5530a<C5667g, C5556n> aVar = this.f6721d;
                        C5667g d10 = C5667g.d(this.f6722e);
                        C5559o0<C5667g> e10 = F.e();
                        this.f6720c = 1;
                        if (C5530a.f(aVar, d10, e10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
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

            b(C5530a<C5667g, C5556n> aVar, Q q10) {
                this.f6718a = aVar;
                this.f6719b = q10;
            }

            public final Object c(long j10, C17164e<? super C16807N> eVar) {
                if (!C5668h.c(this.f6718a.m().v()) || !C5668h.c(j10) || C5667g.n(this.f6718a.m().v()) == C5667g.n(j10)) {
                    Object t10 = this.f6718a.t(C5667g.d(j10), eVar);
                    return t10 == C17187b.f() ? t10 : C16807N.f139792a;
                }
                F0 unused = C16314k.d(this.f6719b, (C17168i) null, (T) null, new a(this.f6718a, j10, (C17164e<? super a>) null), 3, (Object) null);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((C5667g) obj).v(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(A1<C5667g> a12, C5530a<C5667g, C5556n> aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f6715e = a12;
            this.f6716f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f6715e, this.f6716f, eVar);
            dVar.f6714d = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f6713c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new a(this.f6715e));
                b bVar = new b(this.f6716f, (Q) this.f6714d);
                this.f6713c = 1;
                if (r10.collect(bVar, this) == f10) {
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

    static {
        long a10 = C5668h.a(0.01f, 0.01f);
        f6706c = a10;
        f6707d = new C5559o0(0.0f, 0.0f, C5667g.d(a10), 3, (DefaultConstructorMarker) null);
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar, C17631a<C5667g> aVar, C17642l<? super C17631a<C5667g>, ? extends androidx.compose.ui.d> lVar) {
        return androidx.compose.ui.c.c(dVar, (C17642l) null, new c(aVar, lVar), 1, (Object) null);
    }

    public static final C5559o0<C5667g> e() {
        return f6707d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: m0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: m0.a} */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final U0.A1<o1.C5667g> f(nI.C17631a<o1.C5667g> r9, U0.C4889m r10, int r11) {
        /*
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)"
            r2 = -1589795249(0xffffffffa13da64f, float:-6.42558E-19)
            U0.C4895p.S(r2, r11, r0, r1)
        L_0x000f:
            java.lang.Object r11 = r10.D()
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r1 = r0.a()
            if (r11 != r1) goto L_0x0022
            U0.A1 r11 = U0.p1.e(r9)
            r10.u(r11)
        L_0x0022:
            U0.A1 r11 = (U0.A1) r11
            java.lang.Object r9 = r10.D()
            java.lang.Object r1 = r0.a()
            if (r9 != r1) goto L_0x004b
            m0.a r9 = new m0.a
            long r1 = g(r11)
            o1.g r3 = o1.C5667g.d(r1)
            m0.z0<o1.g, m0.n> r4 = f6705b
            long r1 = f6706c
            o1.g r5 = o1.C5667g.d(r1)
            r7 = 8
            r8 = 0
            r6 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.u(r9)
        L_0x004b:
            m0.a r9 = (m0.C5530a) r9
            XH.N r1 = XH.C16807N.f139792a
            boolean r2 = r10.F(r9)
            java.lang.Object r3 = r10.D()
            if (r2 != 0) goto L_0x005f
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x0068
        L_0x005f:
            H0.F$d r3 = new H0.F$d
            r0 = 0
            r3.<init>(r11, r9, r0)
            r10.u(r3)
        L_0x0068:
            nI.p r3 = (nI.p) r3
            r11 = 6
            U0.P.g(r1, r3, r10, r11)
            U0.A1 r9 = r9.g()
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x007b
            U0.C4895p.R()
        L_0x007b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.F.f(nI.a, U0.m, int):U0.A1");
    }

    /* access modifiers changed from: private */
    public static final long g(A1<C5667g> a12) {
        return a12.getValue().v();
    }
}
