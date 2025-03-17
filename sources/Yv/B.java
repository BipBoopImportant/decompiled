package Yv;

import EB.C12832d;
import FB.C12860a;
import FB.C12863d;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import aA.C13909a;
import aA.C13910b;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import yB.C15281a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"LYv/B;", "LYv/A;", "LFB/d;", "storeRepository", "LFB/a;", "localStoreSelectionRepository", "LaA/a;", "sessionManager", "LyB/a;", "getProfileStoreUseCase", "<init>", "(LFB/d;LFB/a;LaA/a;LyB/a;)V", "LaA/b;", "state", "LTJ/g;", "LEB/d;", "c", "(LaA/b;)LTJ/g;", "storeSelection", "", "d", "(LEB/d;LdI/e;)Ljava/lang/Object;", "invoke", "()LTJ/g;", "a", "LFB/d;", "b", "LFB/a;", "LaA/a;", "LyB/a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class B implements A {

    /* renamed from: a  reason: collision with root package name */
    private final C12863d f41046a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f41047b;

    /* renamed from: c  reason: collision with root package name */
    private final C13909a f41048c;

    /* renamed from: d  reason: collision with root package name */
    private final C15281a f41049d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41050a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aA.b r1 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                aA.b r1 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                aA.b r1 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f41050a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yv.B.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetSelectedStoreNameUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetSelectedStoreNameUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class b extends l implements q<C16533h<? super C12832d>, C13910b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41051c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41052d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f41053e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ B f41054f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, B b10) {
            super(3, eVar);
            this.f41054f = b10;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C12832d> hVar, C13910b bVar, C17164e<? super C16807N> eVar) {
            b bVar2 = new b(eVar, this.f41054f);
            bVar2.f41052d = hVar;
            bVar2.f41053e = bVar;
            return bVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f41051c;
            if (i10 == 0) {
                y.b(obj);
                C16532g a10 = this.f41054f.c((C13910b) this.f41053e);
                this.f41051c = 1;
                if (C16534i.x((C16533h) this.f41052d, a10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f41055a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ B f41056b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f41057a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ B f41058b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.usecase.GetSelectedStoreNameUseCaseImpl$invoke$$inlined$map$1$2", f = "GetSelectedStoreNameUseCase.kt", l = {51, 50}, m = "emit")
            /* renamed from: Yv.B$c$a$a  reason: collision with other inner class name */
            public static final class C0692a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f41059c;

                /* renamed from: d  reason: collision with root package name */
                int f41060d;

                /* renamed from: e  reason: collision with root package name */
                Object f41061e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f41062f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0692a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f41062f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f41059c = obj;
                    this.f41060d |= Integer.MIN_VALUE;
                    return this.f41062f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, B b10) {
                this.f41057a = hVar;
                this.f41058b = b10;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Yv.B.c.a.C0692a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Yv.B$c$a$a r0 = (Yv.B.c.a.C0692a) r0
                    int r1 = r0.f41060d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f41060d = r1
                    goto L_0x0018
                L_0x0013:
                    Yv.B$c$a$a r0 = new Yv.B$c$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f41059c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f41060d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r8)
                    goto L_0x005f
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.f41061e
                    TJ.h r7 = (TJ.C16533h) r7
                    XH.y.b(r8)
                    goto L_0x0053
                L_0x003c:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f41057a
                    EB.d r7 = (EB.C12832d) r7
                    Yv.B r2 = r6.f41058b
                    r0.f41061e = r8
                    r0.f41060d = r4
                    java.lang.Object r7 = r2.d(r7, r0)
                    if (r7 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0053:
                    r2 = 0
                    r0.f41061e = r2
                    r0.f41060d = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Yv.B.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, B b10) {
            this.f41055a = gVar;
            this.f41056b = b10;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f41055a.collect(new a(hVar, this.f41056b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "", "", "throwable", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetSelectedStoreNameUseCaseImpl$invoke$3", f = "GetSelectedStoreNameUseCase.kt", l = {41}, m = "invokeSuspend")
    static final class d extends l implements q<C16533h<? super String>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f41063c;

        /* renamed from: d  reason: collision with root package name */
        Object f41064d;

        /* renamed from: e  reason: collision with root package name */
        Object f41065e;

        /* renamed from: f  reason: collision with root package name */
        Object f41066f;

        /* renamed from: g  reason: collision with root package name */
        Object f41067g;

        /* renamed from: h  reason: collision with root package name */
        Object f41068h;

        /* renamed from: i  reason: collision with root package name */
        Object f41069i;

        /* renamed from: j  reason: collision with root package name */
        Object f41070j;

        /* renamed from: k  reason: collision with root package name */
        int f41071k;

        /* renamed from: l  reason: collision with root package name */
        int f41072l;

        /* renamed from: m  reason: collision with root package name */
        int f41073m;

        /* renamed from: n  reason: collision with root package name */
        int f41074n;

        /* renamed from: o  reason: collision with root package name */
        int f41075o;

        /* renamed from: p  reason: collision with root package name */
        int f41076p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f41077q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f41078r;

        d(C17164e<? super d> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super String> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar);
            dVar.f41077q = hVar;
            dVar.f41078r = th2;
            return dVar.invokeSuspend(C16807N.f139792a);
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
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f41076p
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r1 = r0.f41069i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f41068h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f41067g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f41066f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f41065e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f41064d
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f41063c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f41078r
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f41077q
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r20)
                goto L_0x0128
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f41077q
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r4 = r0.f41078r
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                qv.e r11 = qv.e.DEBUG
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x005c:
                boolean r6 = r5.hasNext()
                r13 = 0
                if (r6 == 0) goto L_0x0074
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r11, r13)
                if (r7 == 0) goto L_0x005c
                r12.add(r6)
                goto L_0x005c
            L_0x0074:
                java.util.Iterator r14 = r12.iterator()
                r15 = 0
                r7 = r12
                r5 = r15
                r6 = r5
            L_0x007c:
                boolean r8 = r14.hasNext()
                if (r8 == 0) goto L_0x0101
                java.lang.Object r16 = r14.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x009a
                java.lang.String r8 = qv.C11818a.a(r15, r4)
                if (r8 != 0) goto L_0x0096
                r7 = r16
                goto L_0x0101
            L_0x0096:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x009a:
                r17 = r5
                if (r6 != 0) goto L_0x00ec
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                r8 = 2
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r8, r15)
                r9 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r9, r15, r8, r15)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x00bd
                goto L_0x00c3
            L_0x00bd:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x00c3:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                if (r6 == 0) goto L_0x00d6
                java.lang.String r6 = "m"
                goto L_0x00d8
            L_0x00d6:
                java.lang.String r6 = "b"
            L_0x00d8:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x00ec:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r11
                r7 = r18
                r9 = r4
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                goto L_0x007c
            L_0x0101:
                r0.f41077q = r2
                r0.f41078r = r4
                r0.f41063c = r2
                r0.f41064d = r2
                r0.f41065e = r11
                r0.f41066f = r5
                r0.f41067g = r6
                r0.f41068h = r12
                r0.f41069i = r14
                r0.f41070j = r7
                r0.f41071k = r13
                r0.f41072l = r13
                r0.f41073m = r13
                r0.f41074n = r13
                r0.f41075o = r13
                r0.f41076p = r3
                java.lang.Object r2 = r2.emit(r15, r0)
                if (r2 != r1) goto L_0x0128
                return r1
            L_0x0128:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Yv.B.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetSelectedStoreNameUseCaseImpl", f = "GetSelectedStoreNameUseCase.kt", l = {62}, m = "resolveName")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f41079c;

        /* renamed from: d  reason: collision with root package name */
        Object f41080d;

        /* renamed from: e  reason: collision with root package name */
        Object f41081e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f41082f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ B f41083g;

        /* renamed from: h  reason: collision with root package name */
        int f41084h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(B b10, C17164e<? super e> eVar) {
            super(eVar);
            this.f41083g = b10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f41082f = obj;
            this.f41084h |= Integer.MIN_VALUE;
            return this.f41083g.d((C12832d) null, this);
        }
    }

    public B(C12863d dVar, C12860a aVar, C13909a aVar2, C15281a aVar3) {
        C17542s.j(dVar, "storeRepository");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(aVar2, "sessionManager");
        C17542s.j(aVar3, "getProfileStoreUseCase");
        this.f41046a = dVar;
        this.f41047b = aVar;
        this.f41048c = aVar2;
        this.f41049d = aVar3;
    }

    /* access modifiers changed from: private */
    public final C16532g<C12832d> c(C13910b bVar) {
        int i10 = a.f41050a[bVar.ordinal()];
        if (i10 == 1) {
            return this.f41047b.b();
        }
        if (i10 == 2 || i10 == 3) {
            return this.f41049d.invoke();
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(EB.C12832d r7, dI.C17164e<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Yv.B.e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Yv.B$e r0 = (Yv.B.e) r0
            int r1 = r0.f41084h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f41084h = r1
            goto L_0x0018
        L_0x0013:
            Yv.B$e r0 = new Yv.B$e
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f41082f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f41084h
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003e
            if (r3 != r5) goto L_0x0036
            java.lang.Object r7 = r0.f41081e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f41080d
            EB.d r7 = (EB.C12832d) r7
            java.lang.Object r7 = r0.f41079c
            Yv.B r7 = (Yv.B) r7
            XH.y.b(r1)
            goto L_0x0068
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            XH.y.b(r1)
            if (r7 != 0) goto L_0x0044
            goto L_0x0070
        L_0x0044:
            java.lang.String r1 = r7.getName()
            boolean r1 = HJ.C15854t.v0(r1)
            if (r1 != 0) goto L_0x0053
            java.lang.String r4 = r7.getName()
            goto L_0x0070
        L_0x0053:
            FB.d r1 = r6.f41046a
            java.lang.String r3 = r7.e()
            r0.f41079c = r6
            r0.f41080d = r7
            r0.f41081e = r8
            r0.f41084h = r5
            java.lang.Object r1 = r1.b(r3, r0)
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            EB.c r1 = (EB.C12831c) r1
            if (r1 == 0) goto L_0x0070
            java.lang.String r4 = r1.h()
        L_0x0070:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Yv.B.d(EB.d, dI.e):java.lang.Object");
    }

    public C16532g<String> invoke() {
        return C16534i.g(new c(C16534i.g0(this.f41048c.p(), new b((C17164e) null, this)), this), new d((C17164e<? super d>) null));
    }
}
