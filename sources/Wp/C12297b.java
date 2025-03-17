package wp;

import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import bH.C17034a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.s;
import up.C12071a;
import up.C12072b;
import xp.C12328a;
import xp.C12331d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H@¢\u0006\u0004\b\u001a\u0010\u0017J$\u0010\u001d\u001a\u00020\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u001bH@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0015H@¢\u0006\u0004\b\u001f\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!¨\u0006\""}, d2 = {"Lwp/b;", "Lwp/a;", "Lxp/a;", "localSource", "LbH/a;", "Lxp/d;", "remoteSource", "<init>", "(Lxp/a;LbH/a;)V", "Lup/a;", "key", "", "i", "(Lup/a;)Z", "LTJ/g;", "j", "(Lup/a;)LTJ/g;", "d", "()Z", "b", "c", "LXH/N;", "f", "(LdI/e;)Ljava/lang/Object;", "", "Lup/b;", "e", "", "consents", "g", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "a", "Lxp/a;", "LbH/a;", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wp.b  reason: case insensitive filesystem */
public final class C12297b implements C12296a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C12328a f105929a;

    /* renamed from: b  reason: collision with root package name */
    private final C17034a<C12331d> f105930b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lup/b;", "performanceAndAnalytics", "personalisation", "personalisedAds", "strictlyNecessary", "", "<anonymous>", "(Lup/b;Lup/b;Lup/b;Lup/b;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.dataconsent.impl.repository.UserConsentRepositoryImpl$getConsentForm$2", f = "UserConsentRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wp.b$a */
    static final class a extends l implements s<C12072b, C12072b, C12072b, C12072b, C17164e<? super List<? extends C12072b>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105931c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f105932d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f105933e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f105934f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f105935g;

        a(C17164e<? super a> eVar) {
            super(5, eVar);
        }

        /* renamed from: i */
        public final Object z(C12072b bVar, C12072b bVar2, C12072b bVar3, C12072b bVar4, C17164e<? super List<C12072b>> eVar) {
            a aVar = new a(eVar);
            aVar.f105932d = bVar;
            aVar.f105933e = bVar2;
            aVar.f105934f = bVar3;
            aVar.f105935g = bVar4;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f105931c == 0) {
                y.b(obj);
                return C16877v.q((C12072b) this.f105932d, (C12072b) this.f105933e, (C12072b) this.f105934f, (C12072b) this.f105935g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.dataconsent.impl.repository.UserConsentRepositoryImpl$getInternal$1", f = "UserConsentRepositoryImpl.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: wp.b$b  reason: collision with other inner class name */
    static final class C2512b extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f105936c;

        /* renamed from: d  reason: collision with root package name */
        Object f105937d;

        /* renamed from: e  reason: collision with root package name */
        int f105938e;

        /* renamed from: f  reason: collision with root package name */
        int f105939f;

        /* renamed from: g  reason: collision with root package name */
        int f105940g;

        /* renamed from: h  reason: collision with root package name */
        int f105941h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C12297b f105942i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C12071a f105943j;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.b$b$a */
        public static final class a implements C16532g<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f105944a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: wp.b$b$a$a  reason: collision with other inner class name */
            public static final class C2513a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f105945a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.ingka.ikea.dataconsent.impl.repository.UserConsentRepositoryImpl$getInternal$1$invokeSuspend$$inlined$map$1$2", f = "UserConsentRepositoryImpl.kt", l = {50}, m = "emit")
                /* renamed from: wp.b$b$a$a$a  reason: collision with other inner class name */
                public static final class C2514a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f105946c;

                    /* renamed from: d  reason: collision with root package name */
                    int f105947d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C2513a f105948e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C2514a(C2513a aVar, C17164e eVar) {
                        super(eVar);
                        this.f105948e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f105946c = obj;
                        this.f105947d |= Integer.MIN_VALUE;
                        return this.f105948e.emit((Object) null, this);
                    }
                }

                public C2513a(C16533h hVar) {
                    this.f105945a = hVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof wp.C12297b.C2512b.a.C2513a.C2514a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        wp.b$b$a$a$a r0 = (wp.C12297b.C2512b.a.C2513a.C2514a) r0
                        int r1 = r0.f105947d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f105947d = r1
                        goto L_0x0018
                    L_0x0013:
                        wp.b$b$a$a$a r0 = new wp.b$b$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f105946c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f105947d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x0049
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f105945a
                        up.b r5 = (up.C12072b) r5
                        boolean r5 = r5.a()
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.f105947d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0049
                        return r1
                    L_0x0049:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: wp.C12297b.C2512b.a.C2513a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public a(C16532g gVar) {
                this.f105944a = gVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f105944a.collect(new C2513a(hVar), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2512b(C12297b bVar, C12071a aVar, C17164e<? super C2512b> eVar) {
            super(2, eVar);
            this.f105942i = bVar;
            this.f105943j = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2512b(this.f105942i, this.f105943j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((C2512b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f105941h;
            if (i10 == 0) {
                y.b(obj);
                C16532g<C12072b> d10 = this.f105942i.f105929a.d(this.f105943j);
                a aVar = new a(d10);
                this.f105936c = d10;
                this.f105937d = d10;
                this.f105938e = 0;
                this.f105939f = 0;
                this.f105940g = 0;
                this.f105941h = 1;
                obj = C16534i.B(aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16532g gVar = (C16532g) this.f105937d;
                C16532g gVar2 = (C16532g) this.f105936c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wp.b$c */
    public static final class c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f105949a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wp.b$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f105950a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.dataconsent.impl.repository.UserConsentRepositoryImpl$getInternalFlow$$inlined$map$1$2", f = "UserConsentRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: wp.b$c$a$a  reason: collision with other inner class name */
            public static final class C2515a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f105951c;

                /* renamed from: d  reason: collision with root package name */
                int f105952d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f105953e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2515a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f105953e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f105951c = obj;
                    this.f105952d |= Integer.MIN_VALUE;
                    return this.f105953e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f105950a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof wp.C12297b.c.a.C2515a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    wp.b$c$a$a r0 = (wp.C12297b.c.a.C2515a) r0
                    int r1 = r0.f105952d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f105952d = r1
                    goto L_0x0018
                L_0x0013:
                    wp.b$c$a$a r0 = new wp.b$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f105951c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f105952d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f105950a
                    up.b r5 = (up.C12072b) r5
                    boolean r5 = r5.a()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f105952d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: wp.C12297b.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f105949a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f105949a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.dataconsent.impl.repository.UserConsentRepositoryImpl", f = "UserConsentRepositoryImpl.kt", l = {82, 83}, m = "submitUserConsentForm")
    /* renamed from: wp.b$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f105954c;

        /* renamed from: d  reason: collision with root package name */
        Object f105955d;

        /* renamed from: e  reason: collision with root package name */
        Object f105956e;

        /* renamed from: f  reason: collision with root package name */
        Object f105957f;

        /* renamed from: g  reason: collision with root package name */
        Object f105958g;

        /* renamed from: h  reason: collision with root package name */
        Object f105959h;

        /* renamed from: i  reason: collision with root package name */
        Object f105960i;

        /* renamed from: j  reason: collision with root package name */
        Object f105961j;

        /* renamed from: k  reason: collision with root package name */
        int f105962k;

        /* renamed from: l  reason: collision with root package name */
        int f105963l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f105964m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C12297b f105965n;

        /* renamed from: o  reason: collision with root package name */
        int f105966o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12297b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f105965n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f105964m = obj;
            this.f105966o |= Integer.MIN_VALUE;
            return this.f105965n.g((Map<C12071a, Boolean>) null, this);
        }
    }

    public C12297b(C12328a aVar, C17034a<C12331d> aVar2) {
        C17542s.j(aVar, "localSource");
        C17542s.j(aVar2, "remoteSource");
        this.f105929a = aVar;
        this.f105930b = aVar2;
    }

    private final boolean i(C12071a aVar) {
        return ((Boolean) C16312j.b((C17168i) null, new C2512b(this, aVar, (C17164e<? super C2512b>) null), 1, (Object) null)).booleanValue();
    }

    private final C16532g<Boolean> j(C12071a aVar) {
        return C16534i.s(new c(this.f105929a.d(aVar)));
    }

    public Object a(C17164e<? super C16807N> eVar) {
        Object a10 = this.f105929a.a(eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public boolean b(C12071a aVar) {
        C17542s.j(aVar, "key");
        return i(aVar);
    }

    public C16532g<Boolean> c(C12071a aVar) {
        C17542s.j(aVar, "key");
        return j(aVar);
    }

    public boolean d() {
        return this.f105929a.b();
    }

    public Object e(C17164e<? super List<C12072b>> eVar) {
        return C16534i.B(C16534i.l(this.f105929a.d(C12071a.b.f103980e), this.f105929a.d(C12071a.c.f103981e), this.f105929a.d(C12071a.d.f103982e), this.f105929a.d(C12071a.e.f103983e), new a((C17164e<? super a>) null)), eVar);
    }

    public Object f(C17164e<? super C16807N> eVar) {
        Object c10 = this.f105929a.c(eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0112 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(java.util.Map<up.C12071a, java.lang.Boolean> r24, dI.C17164e<? super XH.C16807N> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            boolean r3 = r2 instanceof wp.C12297b.d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            wp.b$d r3 = (wp.C12297b.d) r3
            int r4 = r3.f105966o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f105966o = r4
            goto L_0x001e
        L_0x0019:
            wp.b$d r3 = new wp.b$d
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f105964m
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f105966o
            r7 = 0
            r8 = 1
            r9 = 2
            if (r6 == 0) goto L_0x008d
            if (r6 == r8) goto L_0x0062
            if (r6 != r9) goto L_0x005a
            java.lang.Object r1 = r3.f105961j
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f105960i
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f105959h
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f105958g
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f105957f
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f105956e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f105955d
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r3.f105954c
            wp.b r1 = (wp.C12297b) r1
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r2 = r4.j()
            goto L_0x0114
        L_0x005a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0062:
            int r1 = r3.f105963l
            int r2 = r3.f105962k
            java.lang.Object r6 = r3.f105961j
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r10 = r3.f105960i
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r3.f105959h
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r3.f105958g
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r13 = r3.f105957f
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r3.f105956e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r3.f105955d
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r9 = r3.f105954c
            wp.b r9 = (wp.C12297b) r9
            XH.y.b(r4)
            r4 = r2
            r2 = r1
            r1 = r12
            goto L_0x00ed
        L_0x008d:
            XH.y.b(r4)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Set r4 = r24.entrySet()
            java.util.Iterator r6 = r4.iterator()
        L_0x009d:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r9 = r4.getKey()
            up.a r9 = (up.C12071a) r9
            boolean r9 = r9.c()
            if (r9 == 0) goto L_0x009d
            java.lang.Object r9 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r10.put(r9, r4)
            goto L_0x009d
        L_0x00c1:
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto L_0x028c
            xp.a r4 = r0.f105929a
            r3.f105954c = r0
            r3.f105955d = r1
            r3.f105956e = r2
            r3.f105957f = r10
            r3.f105958g = r1
            r3.f105959h = r1
            r3.f105960i = r10
            r3.f105961j = r6
            r3.f105962k = r7
            r3.f105963l = r7
            r3.f105966o = r8
            java.lang.Object r4 = r4.e(r10, r3)
            if (r4 != r5) goto L_0x00e6
            return r5
        L_0x00e6:
            r9 = r0
            r11 = r1
            r15 = r11
            r14 = r2
            r2 = r7
            r4 = r2
            r13 = r10
        L_0x00ed:
            bH.a<xp.d> r12 = r9.f105930b
            java.lang.Object r12 = r12.get()
            xp.d r12 = (xp.C12331d) r12
            r3.f105954c = r9
            r3.f105955d = r15
            r3.f105956e = r14
            r3.f105957f = r13
            r3.f105958g = r1
            r3.f105959h = r11
            r3.f105960i = r10
            r3.f105961j = r6
            r3.f105962k = r4
            r3.f105963l = r2
            r1 = 2
            r3.f105966o = r1
            java.lang.Object r2 = r12.a(r13, r3)
            if (r2 != r5) goto L_0x0113
            return r5
        L_0x0113:
            r1 = r9
        L_0x0114:
            java.lang.Throwable r3 = XH.x.e(r2)
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r6 = "m"
            java.lang.String r15 = "main"
            java.lang.String r14 = "Kt"
            r13 = 46
            r12 = 36
            r11 = 0
            if (r3 != 0) goto L_0x01cf
            XH.N r2 = (XH.C16807N) r2
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x013e:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0156
            java.lang.Object r10 = r3.next()
            r8 = r10
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r2, r7)
            if (r8 == 0) goto L_0x0154
            r9.add(r10)
        L_0x0154:
            r8 = 1
            goto L_0x013e
        L_0x0156:
            java.util.Iterator r3 = r9.iterator()
            r7 = r11
            r8 = r7
        L_0x015c:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x028c
            java.lang.Object r9 = r3.next()
            r17 = r9
            qv.b r17 = (qv.C11819b) r17
            r9 = 0
            if (r7 != 0) goto L_0x017b
            java.lang.String r7 = "User consents submitted successfully"
            java.lang.String r7 = qv.C11818a.a(r7, r9)
            if (r7 != 0) goto L_0x0177
            goto L_0x028c
        L_0x0177:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x017b:
            if (r8 != 0) goto L_0x01c0
            java.lang.Class r8 = r1.getClass()
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r10 = 2
            java.lang.String r9 = HJ.C15854t.s1(r8, r12, r11, r10, r11)
            java.lang.String r9 = HJ.C15854t.o1(r9, r13, r11, r10, r11)
            int r10 = r9.length()
            if (r10 != 0) goto L_0x0198
            goto L_0x019c
        L_0x0198:
            java.lang.String r8 = HJ.C15854t.P0(r9, r14)
        L_0x019c:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r10 = 1
            boolean r9 = HJ.C15854t.b0(r9, r15, r10)
            if (r9 == 0) goto L_0x01ad
            r9 = r6
            goto L_0x01ae
        L_0x01ad:
            r9 = r5
        L_0x01ae:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r4)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
        L_0x01c0:
            r20 = 0
            r18 = r2
            r19 = r8
            r9 = 0
            r21 = r9
            r22 = r7
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x015c
        L_0x01cf:
            qv.e r2 = qv.e.WARN
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x01e2:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01fb
            java.lang.Object r10 = r8.next()
            r13 = r10
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r2, r7)
            if (r13 == 0) goto L_0x01f8
            r9.add(r10)
        L_0x01f8:
            r13 = 46
            goto L_0x01e2
        L_0x01fb:
            java.util.Iterator r7 = r9.iterator()
            r8 = r11
            r9 = r8
        L_0x0201:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x028c
            java.lang.Object r10 = r7.next()
            qv.b r10 = (qv.C11819b) r10
            if (r8 != 0) goto L_0x021d
            java.lang.String r8 = "Error when calling updateDataSharingConsent"
            java.lang.String r8 = qv.C11818a.a(r8, r3)
            if (r8 != 0) goto L_0x0219
            goto L_0x028c
        L_0x0219:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x021d:
            if (r9 != 0) goto L_0x0266
            java.lang.Class r9 = r1.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r13 = 2
            java.lang.String r0 = HJ.C15854t.s1(r9, r12, r11, r13, r11)
            r12 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r12, r11, r13, r11)
            int r16 = r0.length()
            if (r16 != 0) goto L_0x023c
            goto L_0x0240
        L_0x023c:
            java.lang.String r9 = HJ.C15854t.P0(r0, r14)
        L_0x0240:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r12 = 1
            boolean r0 = HJ.C15854t.b0(r0, r15, r12)
            if (r0 == 0) goto L_0x0251
            r0 = r6
            goto L_0x0252
        L_0x0251:
            r0 = r5
        L_0x0252:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r4)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
        L_0x0264:
            r0 = r9
            goto L_0x0269
        L_0x0266:
            r12 = 1
            r13 = 2
            goto L_0x0264
        L_0x0269:
            r17 = 0
            r9 = r10
            r10 = r2
            r16 = 0
            r11 = r0
            r18 = r12
            r19 = 46
            r20 = 36
            r12 = r17
            r17 = r13
            r13 = r3
            r21 = r14
            r14 = r8
            r9.a(r10, r11, r12, r13, r14)
            r9 = r0
            r11 = r16
            r12 = r20
            r14 = r21
            r0 = r23
            goto L_0x0201
        L_0x028c:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wp.C12297b.g(java.util.Map, dI.e):java.lang.Object");
    }
}
