package Ct;

import EB.C12832d;
import FB.C12860a;
import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import am.h;
import bt.e;
import dI.C17164e;
import dt.C11240a;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LCt/d;", "LCt/c;", "LFB/a;", "localStoreSelectionRepository", "Lbt/e;", "repository", "Lam/h;", "timeProvider", "<init>", "(LFB/a;Lbt/e;Lam/h;)V", "LTJ/g;", "Ldt/a;", "invoke", "()LTJ/g;", "a", "LFB/a;", "b", "Lbt/e;", "c", "Lam/h;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f79710a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f79711b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h f79712c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.foodmobile.usecase.GetActiveFoodMobileOrderForCurrentStoreUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetActiveFoodMobileOrderForCurrentStoreUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super C11240a>, v<? extends C12832d, ? extends C11240a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79713c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f79714d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f79715e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f79716f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, d dVar) {
            super(3, eVar);
            this.f79716f = dVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C11240a> hVar, v<? extends C12832d, ? extends C11240a> vVar, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f79716f);
            aVar.f79714d = hVar;
            aVar.f79715e = vVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16532g gVar;
            Object f10 = C17187b.f();
            int i10 = this.f79713c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f79714d;
                v vVar = (v) this.f79715e;
                C12832d dVar = (C12832d) vVar.a();
                C11240a aVar = (C11240a) vVar.b();
                if (aVar == null || !C17542s.e(aVar.c(), dVar.e())) {
                    gVar = C16534i.J(null);
                } else {
                    C15906b.a aVar2 = C15906b.f135496b;
                    gVar = new c(i.a(C15906b.K(C15908d.s(30, C15909e.SECONDS))), aVar, this.f79716f);
                }
                this.f79713c = 1;
                if (C16534i.x(hVar, gVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LEB/d;", "storeSelection", "Ldt/a;", "order", "LXH/v;", "<anonymous>", "(LEB/d;Ldt/a;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.foodmobile.usecase.GetActiveFoodMobileOrderForCurrentStoreUseCaseImpl$invoke$1", f = "GetActiveFoodMobileOrderForCurrentStoreUseCase.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<C12832d, C11240a, C17164e<? super v<? extends C12832d, ? extends C11240a>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79717c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f79718d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f79719e;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C12832d dVar, C11240a aVar, C17164e<? super v<C12832d, C11240a>> eVar) {
            b bVar = new b(eVar);
            bVar.f79718d = dVar;
            bVar.f79719e = aVar;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f79717c == 0) {
                y.b(obj);
                return C16796C.a((C12832d) this.f79718d, (C11240a) this.f79719e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<C11240a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f79720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11240a f79721b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f79722c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f79723a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11240a f79724b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f79725c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.instore.impl.foodmobile.usecase.GetActiveFoodMobileOrderForCurrentStoreUseCaseImpl$invoke$lambda$2$$inlined$map$1$2", f = "GetActiveFoodMobileOrderForCurrentStoreUseCase.kt", l = {52, 50}, m = "emit")
            /* renamed from: Ct.d$c$a$a  reason: collision with other inner class name */
            public static final class C1487a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f79726c;

                /* renamed from: d  reason: collision with root package name */
                int f79727d;

                /* renamed from: e  reason: collision with root package name */
                Object f79728e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f79729f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1487a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f79729f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f79726c = obj;
                    this.f79727d |= Integer.MIN_VALUE;
                    return this.f79729f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C11240a aVar, d dVar) {
                this.f79723a = hVar;
                this.f79724b = aVar;
                this.f79725c = dVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x0161 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r21, dI.C17164e r22) {
                /*
                    r20 = this;
                    r0 = r20
                    r1 = r22
                    boolean r2 = r1 instanceof Ct.d.c.a.C1487a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    Ct.d$c$a$a r2 = (Ct.d.c.a.C1487a) r2
                    int r3 = r2.f79727d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f79727d = r3
                    goto L_0x001c
                L_0x0017:
                    Ct.d$c$a$a r2 = new Ct.d$c$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f79726c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f79727d
                    r5 = 1
                    r6 = 2
                    r7 = 0
                    if (r4 == 0) goto L_0x0042
                    if (r4 == r5) goto L_0x003a
                    if (r4 != r6) goto L_0x0032
                    XH.y.b(r1)
                    goto L_0x0162
                L_0x0032:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x003a:
                    java.lang.Object r4 = r2.f79728e
                    TJ.h r4 = (TJ.C16533h) r4
                    XH.y.b(r1)
                    goto L_0x0071
                L_0x0042:
                    XH.y.b(r1)
                    TJ.h r4 = r0.f79723a
                    r1 = r21
                    java.lang.Number r1 = (java.lang.Number) r1
                    r1.longValue()
                    dt.a r1 = r0.f79724b
                    Ct.d r8 = r0.f79725c
                    am.h r8 = r8.f79712c
                    java.time.LocalDateTime r8 = r8.d()
                    boolean r1 = r1.d(r8)
                    if (r1 == 0) goto L_0x0074
                    Ct.d r1 = r0.f79725c
                    bt.e r1 = r1.f79711b
                    r2.f79728e = r4
                    r2.f79727d = r5
                    java.lang.Object r1 = r1.c(r2)
                    if (r1 != r3) goto L_0x0071
                    return r3
                L_0x0071:
                    r1 = r7
                    goto L_0x0157
                L_0x0074:
                    java.time.temporal.ChronoUnit r1 = java.time.temporal.ChronoUnit.MINUTES
                    Ct.d r8 = r0.f79725c
                    am.h r8 = r8.f79712c
                    java.time.LocalDateTime r8 = r8.d()
                    dt.a r9 = r0.f79724b
                    java.time.LocalDateTime r9 = r9.a()
                    long r8 = r1.between(r8, r9)
                    Ct.d r1 = r0.f79725c
                    qv.e r15 = qv.e.DEBUG
                    qv.d r10 = qv.d.f102012a
                    java.util.List r10 = r10.a()
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.util.ArrayList r11 = new java.util.ArrayList
                    r11.<init>()
                    java.util.Iterator r10 = r10.iterator()
                L_0x009f:
                    boolean r12 = r10.hasNext()
                    if (r12 == 0) goto L_0x00b7
                    java.lang.Object r12 = r10.next()
                    r13 = r12
                    qv.b r13 = (qv.C11819b) r13
                    r14 = 0
                    boolean r13 = r13.b(r15, r14)
                    if (r13 == 0) goto L_0x009f
                    r11.add(r12)
                    goto L_0x009f
                L_0x00b7:
                    java.util.Iterator r16 = r11.iterator()
                    r10 = r7
                    r11 = r10
                L_0x00bd:
                    boolean r12 = r16.hasNext()
                    if (r12 == 0) goto L_0x0155
                    java.lang.Object r12 = r16.next()
                    qv.b r12 = (qv.C11819b) r12
                    r14 = 0
                    if (r10 != 0) goto L_0x00ee
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r13 = "FM order expires in "
                    r10.append(r13)
                    r10.append(r8)
                    java.lang.String r13 = " minutes"
                    r10.append(r13)
                    java.lang.String r10 = r10.toString()
                    java.lang.String r10 = qv.C11818a.a(r10, r14)
                    if (r10 != 0) goto L_0x00ea
                    goto L_0x0155
                L_0x00ea:
                    java.lang.String r10 = qv.C11820c.a(r10)
                L_0x00ee:
                    r17 = r10
                    if (r11 != 0) goto L_0x013f
                    java.lang.Class r10 = r1.getClass()
                    java.lang.String r10 = r10.getName()
                    kotlin.jvm.internal.C17542s.g(r10)
                    r11 = 36
                    java.lang.String r11 = HJ.C15854t.s1(r10, r11, r7, r6, r7)
                    r13 = 46
                    java.lang.String r11 = HJ.C15854t.o1(r11, r13, r7, r6, r7)
                    int r13 = r11.length()
                    if (r13 != 0) goto L_0x0110
                    goto L_0x0116
                L_0x0110:
                    java.lang.String r10 = "Kt"
                    java.lang.String r10 = HJ.C15854t.P0(r11, r10)
                L_0x0116:
                    java.lang.Thread r11 = java.lang.Thread.currentThread()
                    java.lang.String r11 = r11.getName()
                    java.lang.String r13 = "main"
                    boolean r11 = HJ.C15854t.b0(r11, r13, r5)
                    if (r11 == 0) goto L_0x0129
                    java.lang.String r11 = "m"
                    goto L_0x012b
                L_0x0129:
                    java.lang.String r11 = "b"
                L_0x012b:
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    r13.append(r11)
                    java.lang.String r11 = "|"
                    r13.append(r11)
                    r13.append(r10)
                    java.lang.String r11 = r13.toString()
                L_0x013f:
                    r18 = r11
                    r13 = 0
                    r10 = r12
                    r11 = r15
                    r12 = r18
                    r19 = r15
                    r15 = r17
                    r10.a(r11, r12, r13, r14, r15)
                    r10 = r17
                    r11 = r18
                    r15 = r19
                    goto L_0x00bd
                L_0x0155:
                    dt.a r1 = r0.f79724b
                L_0x0157:
                    r2.f79728e = r7
                    r2.f79727d = r6
                    java.lang.Object r1 = r4.emit(r1, r2)
                    if (r1 != r3) goto L_0x0162
                    return r3
                L_0x0162:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: Ct.d.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, C11240a aVar, d dVar) {
            this.f79720a = gVar;
            this.f79721b = aVar;
            this.f79722c = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f79720a.collect(new a(hVar, this.f79721b, this.f79722c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public d(C12860a aVar, e eVar, h hVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(eVar, "repository");
        C17542s.j(hVar, "timeProvider");
        this.f79710a = aVar;
        this.f79711b = eVar;
        this.f79712c = hVar;
    }

    public C16532g<C11240a> invoke() {
        return C16534i.s(C16534i.g0(C16534i.n(C16534i.A(this.f79710a.b()), this.f79711b.a(), new b((C17164e<? super b>) null)), new a((C17164e) null, this)));
    }
}
