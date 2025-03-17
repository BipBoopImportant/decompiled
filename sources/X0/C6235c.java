package x0;

import A1.C4336c;
import A1.K;
import A1.U;
import QJ.Q;
import QJ.S;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.p1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.E;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import p0.H;
import p0.t;
import p0.v;
import q0.C5770k;
import s0.C5834E;
import uI.C18065n;
import v0.J;
import z1.C6271a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¶\u0001\u0010\"\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 0\u001eH\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a[\u0010'\u001a\b\u0012\u0004\u0012\u00020&0$2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 0\u001e2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$H\u0003¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lx0/C;", "state", "Ls0/E;", "contentPadding", "", "reverseLayout", "Lp0/v;", "orientation", "Lp0/H;", "flingBehavior", "userScrollEnabled", "", "beyondViewportPageCount", "Lc2/h;", "pageSpacing", "Lx0/g;", "pageSize", "Lz1/a;", "pageNestedScrollConnection", "Lkotlin/Function1;", "", "key", "Li1/c$b;", "horizontalAlignment", "Li1/c$c;", "verticalAlignment", "Lq0/k;", "snapPosition", "Lkotlin/Function2;", "Lx0/v;", "LXH/N;", "pageContent", "a", "(Landroidx/compose/ui/d;Lx0/C;Ls0/E;ZLp0/v;Lp0/H;ZIFLx0/g;Lz1/a;LnI/l;Li1/c$b;Li1/c$c;Lq0/k;LnI/r;LU0/m;III)V", "Lkotlin/Function0;", "pageCount", "Lx0/r;", "c", "(Lx0/C;LnI/r;LnI/l;LnI/a;LU0/m;I)LnI/a;", "b", "(Landroidx/compose/ui/d;Lx0/C;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: x0.c  reason: case insensitive filesystem */
public final class C6235c {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x0.c$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f31649c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f31650d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5834E f31651e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f31652f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f31653g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ H f31654h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f31655i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f31656j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ float f31657k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C6239g f31658l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C6271a f31659m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Object> f31660n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C5437c.b f31661o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C5437c.C0386c f31662p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C5770k f31663q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ r<v, Integer, C4889m, Integer, C16807N> f31664r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f31665s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f31666t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f31667u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.d dVar, C6230C c10, C5834E e10, boolean z10, v vVar, H h10, boolean z11, int i10, float f10, C6239g gVar, C6271a aVar, C17642l<? super Integer, ? extends Object> lVar, C5437c.b bVar, C5437c.C0386c cVar, C5770k kVar, r<? super v, ? super Integer, ? super C4889m, ? super Integer, C16807N> rVar, int i11, int i12, int i13) {
            super(2);
            this.f31649c = dVar;
            this.f31650d = c10;
            this.f31651e = e10;
            this.f31652f = z10;
            this.f31653g = vVar;
            this.f31654h = h10;
            this.f31655i = z11;
            this.f31656j = i10;
            this.f31657k = f10;
            this.f31658l = gVar;
            this.f31659m = aVar;
            this.f31660n = lVar;
            this.f31661o = bVar;
            this.f31662p = cVar;
            this.f31663q = kVar;
            this.f31664r = rVar;
            this.f31665s = i11;
            this.f31666t = i12;
            this.f31667u = i13;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            androidx.compose.ui.d dVar = this.f31649c;
            androidx.compose.ui.d dVar2 = dVar;
            C6235c.a(dVar2, this.f31650d, this.f31651e, this.f31652f, this.f31653g, this.f31654h, this.f31655i, this.f31656j, this.f31657k, this.f31658l, this.f31659m, this.f31660n, this.f31661o, this.f31662p, this.f31663q, this.f31664r, mVar2, M0.a(this.f31665s | 1), M0.a(this.f31666t), this.f31667u);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.c$b */
    static final class b extends C17544u implements C17631a<Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6230C f31668c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6230C c10) {
            super(0);
            this.f31668c = c10;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(this.f31668c.G());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.c$c  reason: collision with other inner class name */
    static final class C0487c extends C17544u implements C17631a<Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6230C f31669c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0487c(C6230C c10) {
            super(0);
            this.f31669c = c10;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(this.f31669c.G());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1", f = "LazyLayoutPager.kt", l = {284}, m = "invokeSuspend")
    /* renamed from: x0.c$d */
    static final class d extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f31670c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f31671d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6230C f31672e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {285}, m = "invokeSuspend")
        /* renamed from: x0.c$d$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f31673c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f31674d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C6230C f31675e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {287, 291}, m = "invokeSuspend")
            /* renamed from: x0.c$d$a$a  reason: collision with other inner class name */
            static final class C0488a extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

                /* renamed from: d  reason: collision with root package name */
                Object f31676d;

                /* renamed from: e  reason: collision with root package name */
                Object f31677e;

                /* renamed from: f  reason: collision with root package name */
                int f31678f;

                /* renamed from: g  reason: collision with root package name */
                private /* synthetic */ Object f31679g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C6230C f31680h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0488a(C6230C c10, C17164e<? super C0488a> eVar) {
                    super(2, eVar);
                    this.f31680h = c10;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C0488a aVar = new C0488a(this.f31680h, eVar);
                    aVar.f31679g = obj;
                    return aVar;
                }

                /* renamed from: i */
                public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
                    return ((C0488a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: A1.c} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
                /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = eI.C17187b.f()
                        int r1 = r10.f31678f
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L_0x002f
                        if (r1 == r4) goto L_0x0027
                        if (r1 != r2) goto L_0x001f
                        java.lang.Object r1 = r10.f31677e
                        A1.B r1 = (A1.B) r1
                        java.lang.Object r4 = r10.f31676d
                        A1.B r4 = (A1.B) r4
                        java.lang.Object r5 = r10.f31679g
                        A1.c r5 = (A1.C4336c) r5
                        XH.y.b(r11)
                        goto L_0x0068
                    L_0x001f:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L_0x0027:
                        java.lang.Object r1 = r10.f31679g
                        A1.c r1 = (A1.C4336c) r1
                        XH.y.b(r11)
                        goto L_0x0044
                    L_0x002f:
                        XH.y.b(r11)
                        java.lang.Object r11 = r10.f31679g
                        r1 = r11
                        A1.c r1 = (A1.C4336c) r1
                        A1.r r11 = A1.r.Initial
                        r10.f31679g = r1
                        r10.f31678f = r4
                        java.lang.Object r11 = p0.G.d(r1, r3, r11, r10)
                        if (r11 != r0) goto L_0x0044
                        return r0
                    L_0x0044:
                        A1.B r11 = (A1.B) r11
                        x0.C r4 = r10.f31680h
                        o1.g$a r5 = o1.C5667g.f26701b
                        long r5 = r5.c()
                        r4.k0(r5)
                        r4 = 0
                        r5 = r1
                        r1 = r4
                        r4 = r11
                    L_0x0055:
                        if (r1 != 0) goto L_0x0091
                        A1.r r11 = A1.r.Initial
                        r10.f31679g = r5
                        r10.f31676d = r4
                        r10.f31677e = r1
                        r10.f31678f = r2
                        java.lang.Object r11 = r5.B1(r11, r10)
                        if (r11 != r0) goto L_0x0068
                        return r0
                    L_0x0068:
                        A1.p r11 = (A1.C4349p) r11
                        java.util.List r6 = r11.c()
                        int r7 = r6.size()
                        r8 = r3
                    L_0x0073:
                        if (r8 >= r7) goto L_0x0085
                        java.lang.Object r9 = r6.get(r8)
                        A1.B r9 = (A1.B) r9
                        boolean r9 = A1.C4350q.c(r9)
                        if (r9 != 0) goto L_0x0082
                        goto L_0x0055
                    L_0x0082:
                        int r8 = r8 + 1
                        goto L_0x0073
                    L_0x0085:
                        java.util.List r11 = r11.c()
                        java.lang.Object r11 = r11.get(r3)
                        r1 = r11
                        A1.B r1 = (A1.B) r1
                        goto L_0x0055
                    L_0x0091:
                        x0.C r11 = r10.f31680h
                        long r0 = r1.h()
                        long r2 = r4.h()
                        long r0 = o1.C5667g.q(r0, r2)
                        r11.k0(r0)
                        XH.N r11 = XH.C16807N.f139792a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: x0.C6235c.d.a.C0488a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, C6230C c10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f31674d = k10;
                this.f31675e = c10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f31674d, this.f31675e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f31673c;
                if (i10 == 0) {
                    y.b(obj);
                    K k10 = this.f31674d;
                    C0488a aVar = new C0488a(this.f31675e, (C17164e<? super C0488a>) null);
                    this.f31673c = 1;
                    if (t.c(k10, aVar, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6230C c10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f31672e = c10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f31672e, eVar);
            dVar.f31671d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((d) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f31670c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a((K) this.f31671d, this.f31672e, (C17164e<? super a>) null);
                this.f31670c = 1;
                if (S.f(aVar, this) == f10) {
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x0.c$e */
    /* synthetic */ class e extends E {
        e(Object obj) {
            super(obj, A1.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((A1) this.receiver).getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/p;", "b", "()Lx0/p;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.c$f */
    static final class f extends C17544u implements C17631a<p> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<r<v, Integer, C4889m, Integer, C16807N>> f31681c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<Integer, Object>> f31682d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<Integer> f31683e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(A1<? extends r<? super v, ? super Integer, ? super C4889m, ? super Integer, C16807N>> a12, A1<? extends C17642l<? super Integer, ? extends Object>> a13, C17631a<Integer> aVar) {
            super(0);
            this.f31681c = a12;
            this.f31682d = a13;
            this.f31683e = aVar;
        }

        /* renamed from: b */
        public final p invoke() {
            return new p(this.f31681c.getValue(), this.f31682d.getValue(), this.f31683e.invoke().intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/r;", "b", "()Lx0/r;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.c$g */
    static final class g extends C17544u implements C17631a<r> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<p> f31684c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f31685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(A1<p> a12, C6230C c10) {
            super(0);
            this.f31684c = a12;
            this.f31685d = c10;
        }

        /* renamed from: b */
        public final r invoke() {
            p value = this.f31684c.getValue();
            return new r(this.f31685d, value, new J(this.f31685d.E(), value));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: x0.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: x0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.d r35, x0.C6230C r36, s0.C5834E r37, boolean r38, p0.v r39, p0.H r40, boolean r41, int r42, float r43, x0.C6239g r44, z1.C6271a r45, nI.C17642l<? super java.lang.Integer, ? extends java.lang.Object> r46, i1.C5437c.b r47, i1.C5437c.C0386c r48, q0.C5770k r49, nI.r<? super x0.v, ? super java.lang.Integer, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r50, U0.C4889m r51, int r52, int r53, int r54) {
        /*
            r1 = r35
            r0 = r36
            r15 = r39
            r14 = r40
            r13 = r41
            r12 = r45
            r11 = r52
            r10 = r53
            r9 = r54
            r2 = 538371694(0x2016e66e, float:1.2781737E-19)
            r3 = r51
            U0.m r8 = r3.k(r2)
            r2 = r9 & 1
            if (r2 == 0) goto L_0x0022
            r2 = r11 | 6
            goto L_0x0032
        L_0x0022:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x0031
            boolean r2 = r8.V(r1)
            if (r2 == 0) goto L_0x002e
            r2 = 4
            goto L_0x002f
        L_0x002e:
            r2 = 2
        L_0x002f:
            r2 = r2 | r11
            goto L_0x0032
        L_0x0031:
            r2 = r11
        L_0x0032:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x0039
            r2 = r2 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r11 & 48
            if (r4 != 0) goto L_0x0049
            boolean r4 = r8.V(r0)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r2 = r2 | r4
        L_0x0049:
            r4 = r9 & 4
            r16 = 128(0x80, float:1.794E-43)
            r17 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0056
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r4 = r37
            goto L_0x0069
        L_0x0056:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0053
            r4 = r37
            boolean r18 = r8.V(r4)
            if (r18 == 0) goto L_0x0065
            r18 = r17
            goto L_0x0067
        L_0x0065:
            r18 = r16
        L_0x0067:
            r2 = r2 | r18
        L_0x0069:
            r18 = r9 & 8
            r19 = 1024(0x400, float:1.435E-42)
            r20 = 2048(0x800, float:2.87E-42)
            if (r18 == 0) goto L_0x0076
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0073:
            r3 = r38
            goto L_0x0089
        L_0x0076:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0073
            r3 = r38
            boolean r18 = r8.b(r3)
            if (r18 == 0) goto L_0x0085
            r18 = r20
            goto L_0x0087
        L_0x0085:
            r18 = r19
        L_0x0087:
            r2 = r2 | r18
        L_0x0089:
            r18 = r9 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L_0x0094
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0094:
            r5 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r8.V(r15)
            if (r5 == 0) goto L_0x00a1
            r5 = r22
            goto L_0x00a3
        L_0x00a1:
            r5 = r21
        L_0x00a3:
            r2 = r2 | r5
        L_0x00a4:
            r5 = r9 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00ad
            r2 = r2 | r24
            goto L_0x00bd
        L_0x00ad:
            r5 = r11 & r24
            if (r5 != 0) goto L_0x00bd
            boolean r5 = r8.V(r14)
            if (r5 == 0) goto L_0x00ba
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r2 = r2 | r5
        L_0x00bd:
            r5 = r9 & 64
            if (r5 == 0) goto L_0x00c5
            r5 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c3:
            r2 = r2 | r5
            goto L_0x00d6
        L_0x00c5:
            r5 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 & r11
            if (r5 != 0) goto L_0x00d6
            boolean r5 = r8.b(r13)
            if (r5 == 0) goto L_0x00d3
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c3
        L_0x00d3:
            r5 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c3
        L_0x00d6:
            r5 = r9 & 128(0x80, float:1.794E-43)
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00e1
            r2 = r2 | r25
            r6 = r42
            goto L_0x00f4
        L_0x00e1:
            r25 = r11 & r25
            r6 = r42
            if (r25 != 0) goto L_0x00f4
            boolean r26 = r8.d(r6)
            if (r26 == 0) goto L_0x00f0
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r2 = r2 | r26
        L_0x00f4:
            r7 = r9 & 256(0x100, float:3.59E-43)
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            if (r7 == 0) goto L_0x00ff
            r2 = r2 | r27
            r3 = r43
            goto L_0x0112
        L_0x00ff:
            r27 = r11 & r27
            r3 = r43
            if (r27 != 0) goto L_0x0112
            boolean r27 = r8.c(r3)
            if (r27 == 0) goto L_0x010e
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0110
        L_0x010e:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0110:
            r2 = r2 | r27
        L_0x0112:
            r3 = r9 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x011c
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r3
        L_0x0119:
            r3 = r44
            goto L_0x0130
        L_0x011c:
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 & r11
            if (r3 != 0) goto L_0x0119
            r3 = r44
            boolean r27 = r8.V(r3)
            if (r27 == 0) goto L_0x012c
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012e
        L_0x012c:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012e:
            r2 = r2 | r27
        L_0x0130:
            r3 = r9 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0137
            r3 = r10 | 6
            goto L_0x0147
        L_0x0137:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0146
            boolean r3 = r8.F(r12)
            if (r3 == 0) goto L_0x0143
            r3 = 4
            goto L_0x0144
        L_0x0143:
            r3 = 2
        L_0x0144:
            r3 = r3 | r10
            goto L_0x0147
        L_0x0146:
            r3 = r10
        L_0x0147:
            r4 = r9 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0150
            r3 = r3 | 48
        L_0x014d:
            r4 = r46
            goto L_0x0163
        L_0x0150:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x014d
            r4 = r46
            boolean r27 = r8.F(r4)
            if (r27 == 0) goto L_0x015f
            r18 = 32
            goto L_0x0161
        L_0x015f:
            r18 = 16
        L_0x0161:
            r3 = r3 | r18
        L_0x0163:
            r4 = r9 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x016c
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0169:
            r4 = r47
            goto L_0x017c
        L_0x016c:
            r4 = r10 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0169
            r4 = r47
            boolean r18 = r8.V(r4)
            if (r18 == 0) goto L_0x017a
            r16 = r17
        L_0x017a:
            r3 = r3 | r16
        L_0x017c:
            r4 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0185
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0182:
            r4 = r48
            goto L_0x0195
        L_0x0185:
            r4 = r10 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0182
            r4 = r48
            boolean r16 = r8.V(r4)
            if (r16 == 0) goto L_0x0193
            r19 = r20
        L_0x0193:
            r3 = r3 | r19
        L_0x0195:
            r4 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x019e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x019b:
            r4 = r49
            goto L_0x01ae
        L_0x019e:
            r4 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x019b
            r4 = r49
            boolean r16 = r8.V(r4)
            if (r16 == 0) goto L_0x01ac
            r21 = r22
        L_0x01ac:
            r3 = r3 | r21
        L_0x01ae:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r9 & r16
            if (r16 == 0) goto L_0x01ba
            r3 = r3 | r24
            r1 = r50
            goto L_0x01cd
        L_0x01ba:
            r16 = r10 & r24
            r1 = r50
            if (r16 != 0) goto L_0x01cd
            boolean r16 = r8.F(r1)
            if (r16 == 0) goto L_0x01c9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01cb
        L_0x01c9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x01cb:
            r3 = r3 | r16
        L_0x01cd:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r2 & r16
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r4) goto L_0x01f1
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r3
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r4) goto L_0x01f1
            boolean r1 = r8.l()
            if (r1 != 0) goto L_0x01e7
            goto L_0x01f1
        L_0x01e7:
            r8.L()
            r9 = r43
            r14 = r8
            r11 = r12
            r8 = r6
            goto L_0x0438
        L_0x01f1:
            r1 = 0
            if (r5 == 0) goto L_0x01f5
            r6 = r1
        L_0x01f5:
            if (r7 == 0) goto L_0x01ff
            float r4 = (float) r1
            float r4 = c2.h.B(r4)
            r18 = r4
            goto L_0x0201
        L_0x01ff:
            r18 = r43
        L_0x0201:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x020f
            r4 = 538371694(0x2016e66e, float:1.2781737E-19)
            java.lang.String r5 = "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:101)"
            U0.C4895p.S(r4, r2, r3, r5)
        L_0x020f:
            if (r6 < 0) goto L_0x0472
            r7 = r2 & 112(0x70, float:1.57E-43)
            r19 = 1
            r5 = 32
            if (r7 != r5) goto L_0x021c
            r4 = r19
            goto L_0x021d
        L_0x021c:
            r4 = r1
        L_0x021d:
            java.lang.Object r1 = r8.D()
            if (r4 != 0) goto L_0x022b
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r1 != r4) goto L_0x0233
        L_0x022b:
            x0.c$c r1 = new x0.c$c
            r1.<init>(r0)
            r8.u(r1)
        L_0x0233:
            nI.a r1 = (nI.C17631a) r1
            int r4 = r2 >> 3
            r15 = r4 & 14
            int r16 = r3 >> 12
            r17 = r16 & 112(0x70, float:1.57E-43)
            r17 = r15 | r17
            int r5 = r3 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r17 = r17 | r5
            r5 = r2
            r2 = r36
            r20 = r3
            r3 = r50
            r28 = r4
            r4 = r46
            r42 = r15
            r21 = 32
            r15 = r5
            r5 = r1
            r43 = r6
            r1 = r21
            r6 = r8
            r14 = r7
            r7 = r17
            nI.a r21 = c(r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r8.D()
            U0.m$a r22 = U0.C4889m.f14007a
            java.lang.Object r3 = r22.a()
            if (r2 != r3) goto L_0x027d
            dI.j r2 = dI.C17169j.f142968a
            QJ.Q r2 = U0.P.k(r2, r8)
            U0.B r3 = new U0.B
            r3.<init>(r2)
            r8.u(r3)
            r2 = r3
        L_0x027d:
            U0.B r2 = (U0.B) r2
            QJ.Q r7 = r2.a()
            if (r14 != r1) goto L_0x0288
            r2 = r19
            goto L_0x0289
        L_0x0288:
            r2 = 0
        L_0x0289:
            java.lang.Object r3 = r8.D()
            if (r2 != 0) goto L_0x0295
            java.lang.Object r2 = r22.a()
            if (r3 != r2) goto L_0x029d
        L_0x0295:
            x0.c$b r3 = new x0.c$b
            r3.<init>(r0)
            r8.u(r3)
        L_0x029d:
            r17 = r3
            nI.a r17 = (nI.C17631a) r17
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            r2 = 65520(0xfff0, float:9.1813E-41)
            r2 = r2 & r15
            int r5 = r15 >> 6
            r23 = 458752(0x70000, float:6.42848E-40)
            r3 = r5 & r23
            r2 = r2 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r5
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r5
            r2 = r2 | r3
            int r3 = r20 << 18
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r20 = r2 | r3
            r24 = r16 & 14
            r2 = r21
            r3 = r36
            r4 = r37
            r29 = r5
            r5 = r38
            r25 = r6
            r6 = r39
            r26 = r7
            r7 = r43
            r27 = r8
            r8 = r18
            r9 = r44
            r10 = r47
            r11 = r48
            r12 = r49
            r13 = r26
            r30 = r14
            r14 = r17
            r1 = r39
            r32 = r42
            r31 = r15
            r15 = r27
            r16 = r20
            r17 = r24
            nI.p r13 = x0.t.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            p0.v r10 = p0.v.Vertical
            if (r1 != r10) goto L_0x0302
            r2 = r19
            r14 = r27
            r11 = r32
            goto L_0x0307
        L_0x0302:
            r14 = r27
            r11 = r32
            r2 = 0
        L_0x0307:
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState r4 = x0.z.a(r0, r2, r14, r11)
            r12 = r30
            r2 = 32
            if (r12 != r2) goto L_0x0314
            r2 = r19
            goto L_0x0315
        L_0x0314:
            r2 = 0
        L_0x0315:
            r3 = r31 & r23
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r5) goto L_0x031e
            r3 = r19
            goto L_0x031f
        L_0x031e:
            r3 = 0
        L_0x031f:
            r2 = r2 | r3
            java.lang.Object r3 = r14.D()
            if (r2 != 0) goto L_0x0330
            java.lang.Object r2 = r22.a()
            if (r3 != r2) goto L_0x032d
            goto L_0x0330
        L_0x032d:
            r15 = r40
            goto L_0x033a
        L_0x0330:
            x0.E r3 = new x0.E
            r15 = r40
            r3.<init>(r15, r0)
            r14.u(r3)
        L_0x033a:
            r16 = r3
            x0.E r16 = (x0.C6232E) r16
            U0.I0 r2 = p0.C5690h.a()
            java.lang.Object r2 = r14.Q(r2)
            p0.g r2 = (p0.C5689g) r2
            r3 = 32
            if (r12 != r3) goto L_0x034f
            r3 = r19
            goto L_0x0350
        L_0x034f:
            r3 = 0
        L_0x0350:
            boolean r5 = r14.V(r2)
            r3 = r3 | r5
            java.lang.Object r5 = r14.D()
            if (r3 != 0) goto L_0x0361
            java.lang.Object r3 = r22.a()
            if (r5 != r3) goto L_0x0369
        L_0x0361:
            x0.j r5 = new x0.j
            r5.<init>(r0, r2)
            r14.u(r5)
        L_0x0369:
            r17 = r5
            x0.j r17 = (x0.j) r17
            E1.d0 r2 = r36.Q()
            r9 = r35
            androidx.compose.ui.d r2 = r9.s(r2)
            v0.b r3 = r36.t()
            androidx.compose.ui.d r2 = r2.s(r3)
            r3 = r28
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r5 = 57344(0xe000, float:8.0356E-41)
            r8 = r29
            r5 = r5 & r8
            r3 = r3 | r5
            int r5 = r31 << 6
            r5 = r5 & r23
            r20 = r3 | r5
            r3 = r21
            r5 = r39
            r6 = r41
            r7 = r38
            r15 = r8
            r8 = r14
            r9 = r20
            androidx.compose.ui.d r2 = androidx.compose.foundation.lazy.layout.f.c(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r10) goto L_0x03a9
            r10 = r41
            r3 = r19
            r4 = r26
            goto L_0x03ae
        L_0x03a9:
            r10 = r41
            r4 = r26
            r3 = 0
        L_0x03ae:
            androidx.compose.ui.d r2 = x0.m.e(r2, r0, r3, r4, r10)
            int r3 = r31 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r11
            r11 = r43
            v0.m r3 = x0.h.a(r0, r11, r14, r3)
            v0.j r4 = r36.u()
            U0.I0 r5 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r5 = r14.Q(r5)
            r6 = r5
            c2.t r6 = (c2.t) r6
            int r5 = W0.b.f14622d
            int r5 = r5 << 6
            r5 = r5 | r25
            int r19 = r31 << 3
            r7 = r19 & r23
            r5 = r5 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r31 & r7
            r20 = r5 | r7
            r5 = r38
            r7 = r39
            r8 = r41
            r9 = r14
            r10 = r20
            androidx.compose.ui.d r2 = v0.C6146l.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.m r8 = r36.A()
            r3 = r15 & 896(0x380, float:1.256E-42)
            r3 = r3 | r12
            int r4 = r31 >> 9
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r19 & r4
            r12 = r3 | r4
            r15 = 0
            r3 = r36
            r4 = r39
            r5 = r41
            r6 = r38
            r7 = r16
            r9 = r17
            r10 = r14
            r1 = r11
            r11 = r12
            r12 = r15
            androidx.compose.ui.d r2 = n0.a0.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.ui.d r2 = b(r2, r0)
            r3 = 0
            r4 = 0
            r11 = r45
            r5 = 2
            androidx.compose.ui.d r4 = androidx.compose.ui.input.nestedscroll.a.b(r2, r11, r3, r5, r4)
            androidx.compose.foundation.lazy.layout.d r5 = r36.N()
            r8 = 0
            r9 = 0
            r3 = r21
            r6 = r13
            r7 = r14
            v0.w.a(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0435
            U0.C4895p.R()
        L_0x0435:
            r8 = r1
            r9 = r18
        L_0x0438:
            U0.Y0 r15 = r14.n()
            if (r15 == 0) goto L_0x0471
            x0.c$a r14 = new x0.c$a
            r0 = r14
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r47
            r33 = r14
            r14 = r48
            r34 = r15
            r15 = r49
            r16 = r50
            r17 = r52
            r18 = r53
            r19 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x0471:
            return
        L_0x0472:
            r1 = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "beyondViewportPageCount should be greater than or equal to 0, you selected "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C6235c.a(androidx.compose.ui.d, x0.C, s0.E, boolean, p0.v, p0.H, boolean, int, float, x0.g, z1.a, nI.l, i1.c$b, i1.c$c, q0.k, nI.r, U0.m, int, int, int):void");
    }

    private static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, C6230C c10) {
        return dVar.s(U.d(androidx.compose.ui.d.f18749a, c10, new d(c10, (C17164e<? super d>) null)));
    }

    private static final C17631a<r> c(C6230C c10, r<? super v, ? super Integer, ? super C4889m, ? super Integer, C16807N> rVar, C17642l<? super Integer, ? extends Object> lVar, C17631a<Integer> aVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1372505274, i10, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:258)");
        }
        A1<T> q10 = p1.q(rVar, mVar, (i10 >> 3) & 14);
        A1<T> q11 = p1.q(lVar, mVar, (i10 >> 6) & 14);
        boolean z10 = false;
        boolean V10 = ((((i10 & 14) ^ 6) > 4 && mVar.V(c10)) || (i10 & 6) == 4) | mVar.V(q10) | mVar.V(q11);
        if ((((i10 & 7168) ^ 3072) > 2048 && mVar.V(aVar)) || (i10 & 3072) == 2048) {
            z10 = true;
        }
        boolean z11 = V10 | z10;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = new e(p1.d(p1.p(), new g(p1.d(p1.p(), new f(q10, q11, aVar)), c10)));
            mVar.u(D10);
        }
        C18065n nVar = (C18065n) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return nVar;
    }
}
