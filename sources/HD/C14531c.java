package hD;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import aA.C13909a;
import aA.C13910b;
import cD.C14031c;
import dI.C17164e;
import eI.C17187b;
import kD.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lD.C14761c;
import lD.C14762d;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LhD/c;", "LlD/c;", "LcD/c;", "profileRepository", "LlD/d;", "getProfileUseCase", "LaA/a;", "sessionManager", "<init>", "(LcD/c;LlD/d;LaA/a;)V", "LTJ/g;", "LkD/j;", "d", "()LTJ/g;", "invoke", "a", "LcD/c;", "b", "LlD/d;", "c", "LaA/a;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hD.c  reason: case insensitive filesystem */
public final class C14531c implements C14761c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14031c f127451a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14762d f127452b;

    /* renamed from: c  reason: collision with root package name */
    private final C13909a f127453c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LkD/j;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.useraccount.impl.usecase.GetProfileFlowUseCaseImpl$getProfileFlow$1", f = "GetProfileFlowUseCaseImpl.kt", l = {43, 45, 50, 62}, m = "invokeSuspend")
    /* renamed from: hD.c$a */
    static final class a extends l implements p<C16533h<? super j>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f127454c;

        /* renamed from: d  reason: collision with root package name */
        Object f127455d;

        /* renamed from: e  reason: collision with root package name */
        Object f127456e;

        /* renamed from: f  reason: collision with root package name */
        Object f127457f;

        /* renamed from: g  reason: collision with root package name */
        int f127458g;

        /* renamed from: h  reason: collision with root package name */
        int f127459h;

        /* renamed from: i  reason: collision with root package name */
        int f127460i;

        /* renamed from: j  reason: collision with root package name */
        int f127461j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f127462k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C14531c f127463l;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hD.c$a$a  reason: collision with other inner class name */
        public static final class C3136a implements C16532g<j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f127464a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hD.c$a$a$a  reason: collision with other inner class name */
            public static final class C3137a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f127465a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.ingka.ikea.useraccount.impl.usecase.GetProfileFlowUseCaseImpl$getProfileFlow$1$invokeSuspend$$inlined$map$1$2", f = "GetProfileFlowUseCaseImpl.kt", l = {50}, m = "emit")
                /* renamed from: hD.c$a$a$a$a  reason: collision with other inner class name */
                public static final class C3138a extends d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f127466c;

                    /* renamed from: d  reason: collision with root package name */
                    int f127467d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C3137a f127468e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3138a(C3137a aVar, C17164e eVar) {
                        super(eVar);
                        this.f127468e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f127466c = obj;
                        this.f127467d |= Integer.MIN_VALUE;
                        return this.f127468e.emit((Object) null, this);
                    }
                }

                public C3137a(C16533h hVar) {
                    this.f127465a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof hD.C14531c.a.C3136a.C3137a.C3138a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        hD.c$a$a$a$a r0 = (hD.C14531c.a.C3136a.C3137a.C3138a) r0
                        int r1 = r0.f127467d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f127467d = r1
                        goto L_0x0018
                    L_0x0013:
                        hD.c$a$a$a$a r0 = new hD.c$a$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f127466c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f127467d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x004c
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f127465a
                        kD.h r5 = (kD.h) r5
                        if (r5 != 0) goto L_0x003d
                        kD.j$a r5 = kD.j.a.f128643a
                        goto L_0x0043
                    L_0x003d:
                        kD.j$d r2 = new kD.j$d
                        r2.<init>(r5)
                        r5 = r2
                    L_0x0043:
                        r0.f127467d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x004c
                        return r1
                    L_0x004c:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: hD.C14531c.a.C3136a.C3137a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public C3136a(C16532g gVar) {
                this.f127464a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f127464a.collect(new C3137a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14531c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f127463l = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f127463l, eVar);
            aVar.f127462k = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super j> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00c6 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f127461j
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x004e
                if (r1 == r5) goto L_0x0042
                if (r1 == r4) goto L_0x0042
                if (r1 == r3) goto L_0x0036
                if (r1 != r2) goto L_0x002e
                java.lang.Object r0 = r8.f127457f
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r8.f127456e
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r8.f127455d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r8.f127454c
                kD.h r0 = (kD.h) r0
                java.lang.Object r0 = r8.f127462k
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r9)
                goto L_0x00c7
            L_0x002e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0036:
                java.lang.Object r1 = r8.f127454c
                kD.h r1 = (kD.h) r1
                java.lang.Object r3 = r8.f127462k
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r9)
                goto L_0x009f
            L_0x0042:
                java.lang.Object r1 = r8.f127454c
                kD.h r1 = (kD.h) r1
                java.lang.Object r4 = r8.f127462k
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r9)
                goto L_0x008a
            L_0x004e:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f127462k
                TJ.h r9 = (TJ.C16533h) r9
                hD.c r1 = r8.f127463l
                cD.c r1 = r1.f127451a
                androidx.lifecycle.F r1 = r1.getProfile()
                java.lang.Object r1 = r1.getValue()
                kD.h r1 = (kD.h) r1
                if (r1 != 0) goto L_0x0078
                kD.j$b r4 = kD.j.b.f128644a
                r8.f127462k = r9
                r8.f127454c = r1
                r8.f127461j = r5
                java.lang.Object r4 = r9.emit(r4, r8)
                if (r4 != r0) goto L_0x0076
                return r0
            L_0x0076:
                r4 = r9
                goto L_0x008a
            L_0x0078:
                kD.j$d r7 = new kD.j$d
                r7.<init>(r1)
                r8.f127462k = r9
                r8.f127454c = r1
                r8.f127461j = r4
                java.lang.Object r4 = r9.emit(r7, r8)
                if (r4 != r0) goto L_0x0076
                return r0
            L_0x008a:
                hD.c r9 = r8.f127463l
                lD.d r9 = r9.f127452b
                r8.f127462k = r4
                r8.f127454c = r1
                r8.f127461j = r3
                r3 = 0
                java.lang.Object r9 = lD.C14762d.a.a(r9, r6, r8, r5, r3)
                if (r9 != r0) goto L_0x009e
                return r0
            L_0x009e:
                r3 = r4
            L_0x009f:
                hD.c r9 = r8.f127463l
                cD.c r9 = r9.f127451a
                TJ.g r9 = r9.l()
                hD.c$a$a r4 = new hD.c$a$a
                r4.<init>(r9)
                r8.f127462k = r3
                r8.f127454c = r1
                r8.f127455d = r4
                r8.f127456e = r9
                r8.f127457f = r9
                r8.f127458g = r6
                r8.f127459h = r6
                r8.f127460i = r6
                r8.f127461j = r2
                java.lang.Object r9 = TJ.C16534i.x(r3, r4, r8)
                if (r9 != r0) goto L_0x00c7
                return r0
            L_0x00c7:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hD.C14531c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.useraccount.impl.usecase.GetProfileFlowUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetProfileFlowUseCaseImpl.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: hD.c$b */
    public static final class b extends l implements q<C16533h<? super j>, C13910b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f127469c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f127470d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f127471e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14531c f127472f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, C14531c cVar) {
            super(3, eVar);
            this.f127472f = cVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super j> hVar, C13910b bVar, C17164e<? super C16807N> eVar) {
            b bVar2 = new b(eVar, this.f127472f);
            bVar2.f127470d = hVar;
            bVar2.f127471e = bVar;
            return bVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f127469c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f127470d;
                C16532g b10 = ((C13910b) this.f127471e).j() ? this.f127472f.d() : C16534i.J(j.c.f128645a);
                this.f127469c = 1;
                if (C16534i.x(hVar, b10, this) == f10) {
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

    public C14531c(C14031c cVar, C14762d dVar, C13909a aVar) {
        C17542s.j(cVar, "profileRepository");
        C17542s.j(dVar, "getProfileUseCase");
        C17542s.j(aVar, "sessionManager");
        this.f127451a = cVar;
        this.f127452b = dVar;
        this.f127453c = aVar;
    }

    /* access modifiers changed from: private */
    public final C16532g<j> d() {
        return C16534i.H(new a(this, (C17164e<? super a>) null));
    }

    public C16532g<j> invoke() {
        return C16534i.s(C16534i.g0(this.f127453c.p(), new b((C17164e) null, this)));
    }
}
