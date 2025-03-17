package ty;

import Il.d;
import KJ.C15985a;
import KJ.C15988d;
import Op.d1;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import nI.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lty/b;", "Lty/a;", "LAx/c;", "productRemoteDataSource", "LIl/d;", "marketConfigRepository", "<init>", "(LAx/c;LIl/d;)V", "", "", "itemNos", "LTJ/g;", "LKJ/d;", "LOp/d1;", "a", "(Ljava/util/List;)LTJ/g;", "LAx/c;", "b", "LIl/d;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ty.b  reason: case insensitive filesystem */
public final class C15099b implements C15098a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Ax.c f131250a;

    /* renamed from: b  reason: collision with root package name */
    private final d f131251b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ty.b$a */
    public static final class a implements C16532g<C11522d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f131252a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ty.b$a$a  reason: collision with other inner class name */
        public static final class C3250a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f131253a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.room.impl.domain.usecase.GetProductsByItemNumbersUseCaseImpl$invoke$$inlined$map$1$2", f = "GetProductsByItemNumbersUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ty.b$a$a$a  reason: collision with other inner class name */
            public static final class C3251a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f131254c;

                /* renamed from: d  reason: collision with root package name */
                int f131255d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C3250a f131256e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3251a(C3250a aVar, C17164e eVar) {
                    super(eVar);
                    this.f131256e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f131254c = obj;
                    this.f131255d |= Integer.MIN_VALUE;
                    return this.f131256e.emit((Object) null, this);
                }
            }

            public C3250a(C16533h hVar) {
                this.f131253a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ty.C15099b.a.C3250a.C3251a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ty.b$a$a$a r0 = (ty.C15099b.a.C3250a.C3251a) r0
                    int r1 = r0.f131255d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f131255d = r1
                    goto L_0x0018
                L_0x0013:
                    ty.b$a$a$a r0 = new ty.b$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f131254c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f131255d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f131253a
                    Rl.e r5 = (Rl.e) r5
                    kp.d r5 = r5.c()
                    r0.f131255d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ty.C15099b.a.C3250a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f131252a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f131252a.collect(new C3250a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ty.b$b  reason: collision with other inner class name */
    public static final class C3252b implements C16532g<C15988d<String, ? extends d1>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f131257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15099b f131258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f131259c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ty.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f131260a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C15099b f131261b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f131262c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.room.impl.domain.usecase.GetProductsByItemNumbersUseCaseImpl$invoke$$inlined$map$2$2", f = "GetProductsByItemNumbersUseCase.kt", l = {51, 50}, m = "emit")
            /* renamed from: ty.b$b$a$a  reason: collision with other inner class name */
            public static final class C3253a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f131263c;

                /* renamed from: d  reason: collision with root package name */
                int f131264d;

                /* renamed from: e  reason: collision with root package name */
                Object f131265e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f131266f;

                /* renamed from: g  reason: collision with root package name */
                Object f131267g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3253a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f131266f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f131263c = obj;
                    this.f131264d |= Integer.MIN_VALUE;
                    return this.f131266f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C15099b bVar, List list) {
                this.f131260a = hVar;
                this.f131261b = bVar;
                this.f131262c = list;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x007d A[LOOP:0: B:19:0x0077->B:21:0x007d, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2 A[LOOP:1: B:23:0x00cc->B:25:0x00d2, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00f9 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r23, dI.C17164e r24) {
                /*
                    r22 = this;
                    r0 = r22
                    r1 = r24
                    boolean r2 = r1 instanceof ty.C15099b.C3252b.a.C3253a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    ty.b$b$a$a r2 = (ty.C15099b.C3252b.a.C3253a) r2
                    int r3 = r2.f131264d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f131264d = r3
                    goto L_0x001c
                L_0x0017:
                    ty.b$b$a$a r2 = new ty.b$b$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f131263c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f131264d
                    r5 = 2
                    r6 = 1
                    if (r4 == 0) goto L_0x0046
                    if (r4 == r6) goto L_0x0039
                    if (r4 != r5) goto L_0x0031
                    XH.y.b(r1)
                    goto L_0x00fa
                L_0x0031:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0039:
                    java.lang.Object r4 = r2.f131267g
                    kp.d r4 = (kp.C11522d) r4
                    java.lang.Object r6 = r2.f131265e
                    TJ.h r6 = (TJ.C16533h) r6
                    XH.y.b(r1)
                    r15 = r6
                    goto L_0x0066
                L_0x0046:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f131260a
                    r4 = r23
                    kp.d r4 = (kp.C11522d) r4
                    ty.b r7 = r0.f131261b
                    Ax.c r7 = r7.f131250a
                    java.util.List r8 = r0.f131262c
                    r2.f131265e = r1
                    r2.f131267g = r4
                    r2.f131264d = r6
                    java.lang.Object r6 = r7.e(r8, r2)
                    if (r6 != r3) goto L_0x0064
                    return r3
                L_0x0064:
                    r15 = r1
                    r1 = r6
                L_0x0066:
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.ArrayList r14 = new java.util.ArrayList
                    r13 = 10
                    int r6 = YH.C16877v.y(r1, r13)
                    r14.<init>(r6)
                    java.util.Iterator r1 = r1.iterator()
                L_0x0077:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x00b1
                    java.lang.Object r6 = r1.next()
                    com.ingka.ikea.core.model.product.ProductItem r6 = (com.ingka.ikea.core.model.product.ProductItem) r6
                    java.util.List r7 = YH.C16877v.n()
                    java.util.Set r8 = YH.g0.d()
                    r16 = 456(0x1c8, float:6.39E-43)
                    r17 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r9 = r4
                    r5 = r13
                    r13 = r18
                    r5 = r14
                    r14 = r19
                    r21 = r15
                    r15 = r20
                    Op.d1 r6 = Op.B0.o(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                    r5.add(r6)
                    r14 = r5
                    r15 = r21
                    r5 = 2
                    r13 = 10
                    goto L_0x0077
                L_0x00b1:
                    r6 = r13
                    r5 = r14
                    r21 = r15
                    int r1 = YH.C16877v.y(r5, r6)
                    int r1 = YH.X.e(r1)
                    r4 = 16
                    int r1 = tI.C17978n.e(r1, r4)
                    java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                    r4.<init>(r1)
                    java.util.Iterator r1 = r5.iterator()
                L_0x00cc:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L_0x00e5
                    java.lang.Object r5 = r1.next()
                    r6 = r5
                    Op.d1 r6 = (Op.d1) r6
                    Op.d r6 = r6.p()
                    java.lang.String r6 = r6.f()
                    r4.put(r6, r5)
                    goto L_0x00cc
                L_0x00e5:
                    KJ.d r1 = KJ.C15985a.i(r4)
                    r4 = 0
                    r2.f131265e = r4
                    r2.f131267g = r4
                    r4 = 2
                    r2.f131264d = r4
                    r6 = r21
                    java.lang.Object r1 = r6.emit(r1, r2)
                    if (r1 != r3) goto L_0x00fa
                    return r3
                L_0x00fa:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ty.C15099b.C3252b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C3252b(C16532g gVar, C15099b bVar, List list) {
            this.f131257a = gVar;
            this.f131258b = bVar;
            this.f131259c = list;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f131257a.collect(new a(hVar, this.f131258b, this.f131259c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LTJ/h;", "LKJ/d;", "", "LOp/d1;", "", "throwable", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.room.impl.domain.usecase.GetProductsByItemNumbersUseCaseImpl$invoke$3", f = "GetProductsByItemNumbersUseCase.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: ty.b$c */
    static final class c extends l implements q<C16533h<? super C15988d<String, ? extends d1>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f131268c;

        /* renamed from: d  reason: collision with root package name */
        Object f131269d;

        /* renamed from: e  reason: collision with root package name */
        Object f131270e;

        /* renamed from: f  reason: collision with root package name */
        Object f131271f;

        /* renamed from: g  reason: collision with root package name */
        Object f131272g;

        /* renamed from: h  reason: collision with root package name */
        Object f131273h;

        /* renamed from: i  reason: collision with root package name */
        Object f131274i;

        /* renamed from: j  reason: collision with root package name */
        Object f131275j;

        /* renamed from: k  reason: collision with root package name */
        Object f131276k;

        /* renamed from: l  reason: collision with root package name */
        int f131277l;

        /* renamed from: m  reason: collision with root package name */
        int f131278m;

        /* renamed from: n  reason: collision with root package name */
        int f131279n;

        /* renamed from: o  reason: collision with root package name */
        int f131280o;

        /* renamed from: p  reason: collision with root package name */
        int f131281p;

        /* renamed from: q  reason: collision with root package name */
        int f131282q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f131283r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f131284s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ List<String> f131285t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List<String> list, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f131285t = list;
        }

        public final Object invoke(C16533h<? super C15988d<String, d1>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(this.f131285t, eVar);
            cVar.f131283r = hVar;
            cVar.f131284s = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f131282q
                r3 = 1
                if (r2 == 0) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                java.lang.Object r1 = r0.f131275j
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f131274i
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f131273h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f131272g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f131271f
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f131270e
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f131269d
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f131268c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f131284s
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f131283r
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r21)
                goto L_0x0149
            L_0x003a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0042:
                XH.y.b(r21)
                java.lang.Object r2 = r0.f131283r
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r4 = r0.f131284s
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                java.util.List<java.lang.String> r11 = r0.f131285t
                qv.e r12 = qv.e.WARN
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0062:
                boolean r6 = r5.hasNext()
                r14 = 0
                if (r6 == 0) goto L_0x007a
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r12, r14)
                if (r7 == 0) goto L_0x0062
                r13.add(r6)
                goto L_0x0062
            L_0x007a:
                java.util.Iterator r15 = r13.iterator()
                r10 = 0
                r5 = r10
                r6 = r5
                r7 = r13
            L_0x0082:
                boolean r8 = r15.hasNext()
                if (r8 == 0) goto L_0x011c
                java.lang.Object r16 = r15.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x00b1
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "Error fetching "
                r8.append(r9)
                r8.append(r11)
                java.lang.String r8 = r8.toString()
                java.lang.String r8 = qv.C11818a.a(r8, r4)
                if (r8 != 0) goto L_0x00ad
                r7 = r16
                goto L_0x011c
            L_0x00ad:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x00b1:
                r17 = r5
                if (r6 != 0) goto L_0x0103
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                r8 = 2
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r10, r8, r10)
                r9 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r9, r10, r8, r10)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x00d4
                goto L_0x00da
            L_0x00d4:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x00da:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                if (r6 == 0) goto L_0x00ed
                java.lang.String r6 = "m"
                goto L_0x00ef
            L_0x00ed:
                java.lang.String r6 = "b"
            L_0x00ef:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x0103:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r12
                r7 = r18
                r9 = r4
                r19 = r10
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                r10 = r19
                goto L_0x0082
            L_0x011c:
                KJ.g r8 = KJ.C15985a.c()
                r0.f131283r = r2
                r0.f131284s = r4
                r0.f131268c = r2
                r0.f131269d = r11
                r0.f131270e = r2
                r0.f131271f = r12
                r0.f131272g = r5
                r0.f131273h = r6
                r0.f131274i = r13
                r0.f131275j = r15
                r0.f131276k = r7
                r0.f131277l = r14
                r0.f131278m = r14
                r0.f131279n = r14
                r0.f131280o = r14
                r0.f131281p = r14
                r0.f131282q = r3
                java.lang.Object r2 = r2.emit(r8, r0)
                if (r2 != r1) goto L_0x0149
                return r1
            L_0x0149:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ty.C15099b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C15099b(Ax.c cVar, d dVar) {
        C17542s.j(cVar, "productRemoteDataSource");
        C17542s.j(dVar, "marketConfigRepository");
        this.f131250a = cVar;
        this.f131251b = dVar;
    }

    public C16532g<C15988d<String, d1>> a(List<String> list) {
        C17542s.j(list, "itemNos");
        return list.isEmpty() ? C16534i.J(C15985a.c()) : C16534i.g(new C3252b(C16534i.s(new a(C16534i.A(this.f131251b.d()))), this, list), new c(list, (C17164e<? super c>) null));
    }
}
