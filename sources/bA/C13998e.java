package bA;

import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.R0;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16509F;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import aA.C13909a;
import aA.C13910b;
import android.app.Activity;
import com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials;
import dI.C17164e;
import dI.C17168i;
import eA.C14371a;
import eI.C17187b;
import gp.C11343b;
import ip.n;
import jA.C14609c;
import jA.C14611e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lA.C14742a;
import nI.p;
import oC.C14874c;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0010H@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ \u0010#\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H@¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020 008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R \u0010!\u001a\b\u0012\u0004\u0012\u00020 038\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R!\u0010:\u001a\b\u0012\u0004\u0012\u00020 0\u00138VX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0015R!\u0010<\u001a\b\u0012\u0004\u0012\u00020 0\u00138VX\u0002¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b;\u0010\u0015R!\u0010>\u001a\b\u0012\u0004\u0012\u00020 0\u00138VX\u0002¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b.\u0010\u0015R \u0010D\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010E\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0012R\u0014\u0010F\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010&R\u0014\u0010G\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010&R\u0014\u0010J\u001a\u00020@8VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&¨\u0006L"}, d2 = {"LbA/e;", "LaA/a;", "LjA/c;", "userSessionOrchestrator", "LeA/a;", "guestTokenRepository", "LjA/e;", "userSessionTokenMonitor", "LoC/c;", "taskSchedulerEvents", "LQJ/Q;", "appScope", "LQJ/M;", "dispatcher", "<init>", "(LjA/c;LeA/a;LjA/e;LoC/c;LQJ/Q;LQJ/M;)V", "", "h", "()Ljava/lang/String;", "LTJ/g;", "getToken", "()LTJ/g;", "b", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "l", "()V", "Landroid/app/Activity;", "activity", "g", "(Landroid/app/Activity;)V", "e", "", "refreshTokenFailed", "triggerLogoutEvent", "m", "(ZZLdI/e;)Ljava/lang/Object;", "c", "()Z", "a", "LjA/c;", "LeA/a;", "LjA/e;", "d", "LoC/c;", "LQJ/Q;", "f", "LQJ/M;", "LTJ/A;", "LTJ/A;", "_refreshTokenFailed", "LTJ/F;", "LTJ/F;", "A", "()LTJ/F;", "i", "LXH/o;", "n", "isLoggedInFlow", "j", "isEmployeeFlow", "k", "hasFamilyPrivilegesFlow", "LTJ/P;", "LaA/b;", "LTJ/P;", "B", "()LTJ/P;", "userStateFlow", "icmId", "isLoggedIn", "hasFamilyPrivileges", "o", "()LaA/b;", "userState", "isEmployee", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bA.e  reason: case insensitive filesystem */
public final class C13998e implements C13909a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14609c f118811a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14371a f118812b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C14611e f118813c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C14874c f118814d;

    /* renamed from: e  reason: collision with root package name */
    private final Q f118815e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final M f118816f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C16504A<Boolean> f118817g;

    /* renamed from: h  reason: collision with root package name */
    private final C16509F<Boolean> f118818h;

    /* renamed from: i  reason: collision with root package name */
    private final C16824o f118819i = C16825p.b(new C13994a(this));

    /* renamed from: j  reason: collision with root package name */
    private final C16824o f118820j = C16825p.b(new C13995b(this));

    /* renamed from: k  reason: collision with root package name */
    private final C16824o f118821k = C16825p.b(new C13996c(this));

    /* renamed from: l  reason: collision with root package name */
    private final C16519P<C13910b> f118822l;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bA.e$a */
    public static final class a implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13998e f118824b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bA.e$a$a  reason: collision with other inner class name */
        public static final class C2963a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118825a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13998e f118826b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$getToken$$inlined$map$1$2", f = "SessionManagerImpl.kt", l = {51, 50}, m = "emit")
            /* renamed from: bA.e$a$a$a  reason: collision with other inner class name */
            public static final class C2964a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118827c;

                /* renamed from: d  reason: collision with root package name */
                int f118828d;

                /* renamed from: e  reason: collision with root package name */
                Object f118829e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C2963a f118830f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2964a(C2963a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118830f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118827c = obj;
                    this.f118828d |= Integer.MIN_VALUE;
                    return this.f118830f.emit((Object) null, this);
                }
            }

            public C2963a(C16533h hVar, C13998e eVar) {
                this.f118825a = hVar;
                this.f118826b = eVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r10, dI.C17164e r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof bA.C13998e.a.C2963a.C2964a
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    bA.e$a$a$a r0 = (bA.C13998e.a.C2963a.C2964a) r0
                    int r1 = r0.f118828d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118828d = r1
                    goto L_0x0018
                L_0x0013:
                    bA.e$a$a$a r0 = new bA.e$a$a$a
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.f118827c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118828d
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L_0x003d
                    if (r2 == r5) goto L_0x0035
                    if (r2 != r4) goto L_0x002d
                    XH.y.b(r11)
                    goto L_0x006a
                L_0x002d:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0035:
                    java.lang.Object r10 = r0.f118829e
                    TJ.h r10 = (TJ.C16533h) r10
                    XH.y.b(r11)
                    goto L_0x005f
                L_0x003d:
                    XH.y.b(r11)
                    TJ.h r11 = r9.f118825a
                    com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r10 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r10
                    bA.e r2 = r9.f118826b
                    QJ.M r2 = r2.f118816f
                    bA.e$b r6 = new bA.e$b
                    bA.e r7 = r9.f118826b
                    r6.<init>(r10, r7, r3)
                    r0.f118829e = r11
                    r0.f118828d = r5
                    java.lang.Object r10 = QJ.C16310i.g(r2, r6, r0)
                    if (r10 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L_0x005f:
                    r0.f118829e = r3
                    r0.f118828d = r4
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: bA.C13998e.a.C2963a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, C13998e eVar) {
            this.f118823a = gVar;
            this.f118824b = eVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118823a.collect(new C2963a(hVar, this.f118824b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$getToken$1$1", f = "SessionManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bA.e$b */
    static final class b extends l implements p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118831c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CiamSessionCredentials f118832d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13998e f118833e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CiamSessionCredentials ciamSessionCredentials, C13998e eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f118832d = ciamSessionCredentials;
            this.f118833e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f118832d, this.f118833e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r2 = r2.a();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            /*
                r1 = this;
                eI.C17187b.f()
                int r0 = r1.f118831c
                if (r0 != 0) goto L_0x001f
                XH.y.b(r2)
                com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r2 = r1.f118832d
                if (r2 == 0) goto L_0x0014
                java.lang.String r2 = r2.a()
                if (r2 != 0) goto L_0x001e
            L_0x0014:
                bA.e r2 = r1.f118833e
                eA.a r2 = r2.f118812b
                java.lang.String r2 = r2.getToken()
            L_0x001e:
                return r2
            L_0x001f:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: bA.C13998e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bA.e$c */
    public static final class c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118834a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bA.e$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118835a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$hasFamilyPrivilegesFlow_delegate$lambda$5$$inlined$map$1$2", f = "SessionManagerImpl.kt", l = {50}, m = "emit")
            /* renamed from: bA.e$c$a$a  reason: collision with other inner class name */
            public static final class C2965a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118836c;

                /* renamed from: d  reason: collision with root package name */
                int f118837d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f118838e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2965a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118838e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118836c = obj;
                    this.f118837d |= Integer.MIN_VALUE;
                    return this.f118838e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f118835a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof bA.C13998e.c.a.C2965a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    bA.e$c$a$a r0 = (bA.C13998e.c.a.C2965a) r0
                    int r1 = r0.f118837d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118837d = r1
                    goto L_0x0018
                L_0x0013:
                    bA.e$c$a$a r0 = new bA.e$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118836c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118837d
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
                    TJ.h r6 = r4.f118835a
                    aA.b r5 = (aA.C13910b) r5
                    aA.b r2 = aA.C13910b.FAMILY
                    if (r5 != r2) goto L_0x003e
                    r5 = r3
                    goto L_0x003f
                L_0x003e:
                    r5 = 0
                L_0x003f:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f118837d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: bA.C13998e.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f118834a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118834a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bA.e$d */
    public static final class d implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118839a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bA.e$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118840a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$isEmployeeFlow_delegate$lambda$3$$inlined$map$1$2", f = "SessionManagerImpl.kt", l = {50}, m = "emit")
            /* renamed from: bA.e$d$a$a  reason: collision with other inner class name */
            public static final class C2966a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118841c;

                /* renamed from: d  reason: collision with root package name */
                int f118842d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f118843e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2966a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118843e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118841c = obj;
                    this.f118842d |= Integer.MIN_VALUE;
                    return this.f118843e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f118840a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof bA.C13998e.d.a.C2966a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    bA.e$d$a$a r0 = (bA.C13998e.d.a.C2966a) r0
                    int r1 = r0.f118842d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118842d = r1
                    goto L_0x0018
                L_0x0013:
                    bA.e$d$a$a r0 = new bA.e$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118841c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118842d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f118840a
                    com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r5 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r5
                    r2 = 0
                    if (r5 == 0) goto L_0x0042
                    boolean r5 = r5.g()
                    if (r5 != r3) goto L_0x0042
                    r2 = r3
                L_0x0042:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)
                    r0.f118842d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: bA.C13998e.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f118839a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118839a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bA.e$e  reason: collision with other inner class name */
    public static final class C2967e implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118844a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bA.e$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118845a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$isLoggedInFlow_delegate$lambda$1$$inlined$map$1$2", f = "SessionManagerImpl.kt", l = {50}, m = "emit")
            /* renamed from: bA.e$e$a$a  reason: collision with other inner class name */
            public static final class C2968a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118846c;

                /* renamed from: d  reason: collision with root package name */
                int f118847d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f118848e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2968a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118848e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118846c = obj;
                    this.f118847d |= Integer.MIN_VALUE;
                    return this.f118848e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f118845a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof bA.C13998e.C2967e.a.C2968a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    bA.e$e$a$a r0 = (bA.C13998e.C2967e.a.C2968a) r0
                    int r1 = r0.f118847d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118847d = r1
                    goto L_0x0018
                L_0x0013:
                    bA.e$e$a$a r0 = new bA.e$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118846c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118847d
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
                    TJ.h r6 = r4.f118845a
                    aA.b r5 = (aA.C13910b) r5
                    boolean r5 = r5.j()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f118847d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: bA.C13998e.C2967e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2967e(C16532g gVar) {
            this.f118844a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118844a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$logout$2", f = "SessionManagerImpl.kt", l = {153, 169}, m = "invokeSuspend")
    /* renamed from: bA.e$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118849c;

        /* renamed from: d  reason: collision with root package name */
        Object f118850d;

        /* renamed from: e  reason: collision with root package name */
        Object f118851e;

        /* renamed from: f  reason: collision with root package name */
        Object f118852f;

        /* renamed from: g  reason: collision with root package name */
        Object f118853g;

        /* renamed from: h  reason: collision with root package name */
        Object f118854h;

        /* renamed from: i  reason: collision with root package name */
        boolean f118855i;

        /* renamed from: j  reason: collision with root package name */
        boolean f118856j;

        /* renamed from: k  reason: collision with root package name */
        int f118857k;

        /* renamed from: l  reason: collision with root package name */
        int f118858l;

        /* renamed from: m  reason: collision with root package name */
        int f118859m;

        /* renamed from: n  reason: collision with root package name */
        int f118860n;

        /* renamed from: o  reason: collision with root package name */
        private /* synthetic */ Object f118861o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C13998e f118862p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f118863q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f118864r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C13998e eVar, boolean z10, boolean z11, C17164e<? super f> eVar2) {
            super(2, eVar2);
            this.f118862p = eVar;
            this.f118863q = z10;
            this.f118864r = z11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f118862p, this.f118863q, this.f118864r, eVar);
            fVar.f118861o = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x037f, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
            r21 = com.sugarcube.core.logger.DslKt.INDICATOR_BACKGROUND;
            r20 = com.sugarcube.core.logger.DslKt.INDICATOR_MAIN;
            r2 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0209, code lost:
            r0 = th;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0037, B:15:0x006e] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0037, B:28:0x00c8] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0037, B:32:0x00d4] */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x02c4  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[ExcHandler: CancellationException (r0v30 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:5:0x0037] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x021c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                r35 = this;
                r1 = r35
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f118860n
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 2
                if (r2 == 0) goto L_0x0081
                if (r2 == r11) goto L_0x0052
                if (r2 != r12) goto L_0x004a
                java.lang.Object r0 = r1.f118854h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118853g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118852f
                aA.b r0 = (aA.C13910b) r0
                java.lang.Object r0 = r1.f118851e
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f118850d
                bA.e r0 = (bA.C13998e) r0
                java.lang.Object r0 = r1.f118849c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f118861o
                r2 = r0
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r36)     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r21 = r4
                r20 = r5
                goto L_0x0202
            L_0x0040:
                r0 = move-exception
                r21 = r4
            L_0x0043:
                r20 = r5
                goto L_0x020c
            L_0x0047:
                r0 = move-exception
                goto L_0x037f
            L_0x004a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0052:
                int r2 = r1.f118858l
                int r14 = r1.f118857k
                boolean r15 = r1.f118856j
                boolean r8 = r1.f118855i
                java.lang.Object r9 = r1.f118852f
                aA.b r9 = (aA.C13910b) r9
                java.lang.Object r12 = r1.f118851e
                QJ.Q r12 = (QJ.Q) r12
                java.lang.Object r13 = r1.f118850d
                bA.e r13 = (bA.C13998e) r13
                java.lang.Object r11 = r1.f118849c
                QJ.Q r11 = (QJ.Q) r11
                java.lang.Object r10 = r1.f118861o
                QJ.Q r10 = (QJ.Q) r10
                XH.y.b(r36)     // Catch:{ CancellationException -> 0x0047, all -> 0x0079 }
                r34 = r8
                r8 = r2
                r2 = r10
                r10 = r9
                r9 = r34
                goto L_0x00bb
            L_0x0079:
                r0 = move-exception
                r21 = r4
                r20 = r5
                r2 = r10
                goto L_0x020c
            L_0x0081:
                XH.y.b(r36)
                java.lang.Object r2 = r1.f118861o
                QJ.Q r2 = (QJ.Q) r2
                bA.e r13 = r1.f118862p
                boolean r8 = r1.f118863q
                boolean r15 = r1.f118864r
                XH.x$a r9 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                aA.b r9 = r13.o()     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                jA.c r10 = r13.f118811a     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r1.f118861o = r2     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r1.f118849c = r2     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r1.f118850d = r13     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r1.f118851e = r2     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r1.f118852f = r9     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r1.f118855i = r8     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r1.f118856j = r15     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r11 = 0
                r1.f118857k = r11     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r1.f118858l = r11     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r11 = 1
                r1.f118860n = r11     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                java.lang.Object r10 = r10.d(r1)     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                if (r10 != r0) goto L_0x00b5
                return r0
            L_0x00b5:
                r11 = r2
                r12 = r11
                r10 = r9
                r14 = 0
                r9 = r8
                r8 = 0
            L_0x00bb:
                eA.a r20 = r13.f118812b     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r20.clear()     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                eA.a r20 = r13.f118812b     // Catch:{ CancellationException -> 0x0047, all -> 0x0040 }
                r21 = r4
                java.lang.String r4 = r20.getToken()     // Catch:{ CancellationException -> 0x0047, all -> 0x0209 }
                int r20 = r4.length()     // Catch:{ CancellationException -> 0x0047, all -> 0x0209 }
                if (r20 <= 0) goto L_0x01af
                r20 = r5
                qv.e r5 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                qv.d r22 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                java.util.List r22 = r22.a()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                java.lang.Iterable r22 = (java.lang.Iterable) r22     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r28 = r0
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r0.<init>()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                java.util.Iterator r22 = r22.iterator()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
            L_0x00e9:
                boolean r23 = r22.hasNext()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                if (r23 == 0) goto L_0x0110
                r36 = r8
                java.lang.Object r8 = r22.next()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r29 = r14
                r14 = r8
                qv.b r14 = (qv.C11819b) r14     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r30 = r4
                r4 = 0
                boolean r14 = r14.b(r5, r4)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                if (r14 == 0) goto L_0x0106
                r0.add(r8)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
            L_0x0106:
                r8 = r36
                r14 = r29
                r4 = r30
                goto L_0x00e9
            L_0x010d:
                r0 = move-exception
                goto L_0x020c
            L_0x0110:
                r30 = r4
                r36 = r8
                r29 = r14
                java.util.Iterator r0 = r0.iterator()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r4 = 0
                r8 = 0
            L_0x011c:
                boolean r14 = r0.hasNext()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                if (r14 == 0) goto L_0x0135
                java.lang.Object r14 = r0.next()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r22 = r14
                qv.b r22 = (qv.C11819b) r22     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r14 = 0
                if (r4 != 0) goto L_0x013f
                java.lang.String r4 = "New guest token fetched successfully on logout"
                java.lang.String r4 = qv.C11818a.a(r4, r14)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                if (r4 != 0) goto L_0x013b
            L_0x0135:
                r32 = r11
                r31 = r12
                goto L_0x01bd
            L_0x013b:
                java.lang.String r4 = qv.C11820c.a(r4)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
            L_0x013f:
                if (r8 != 0) goto L_0x0193
                java.lang.Class r8 = r12.getClass()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                java.lang.String r8 = r8.getName()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r33 = r0
                r32 = r11
                r31 = r12
                r11 = 0
                r12 = 2
                r14 = 36
                java.lang.String r0 = HJ.C15854t.s1(r8, r14, r11, r12, r11)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r14 = 46
                java.lang.String r0 = HJ.C15854t.o1(r0, r14, r11, r12, r11)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                int r11 = r0.length()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                if (r11 != 0) goto L_0x0167
                goto L_0x016b
            L_0x0167:
                java.lang.String r8 = HJ.C15854t.P0(r0, r7)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
            L_0x016b:
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                java.lang.String r0 = r0.getName()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r11 = 1
                boolean r0 = HJ.C15854t.b0(r0, r6, r11)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                if (r0 == 0) goto L_0x017d
                r0 = r20
                goto L_0x017f
            L_0x017d:
                r0 = r21
            L_0x017f:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r11.<init>()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r11.append(r0)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r11.append(r3)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r11.append(r8)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                java.lang.String r0 = r11.toString()     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r8 = r0
                goto L_0x0199
            L_0x0193:
                r33 = r0
                r32 = r11
                r31 = r12
            L_0x0199:
                r25 = 0
                r23 = r5
                r24 = r8
                r0 = 0
                r26 = r0
                r27 = r4
                r22.a(r23, r24, r25, r26, r27)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r12 = r31
                r11 = r32
                r0 = r33
                goto L_0x011c
            L_0x01af:
                r28 = r0
                r30 = r4
                r20 = r5
                r36 = r8
                r32 = r11
                r31 = r12
                r29 = r14
            L_0x01bd:
                if (r9 == 0) goto L_0x01c8
                oC.c r0 = r13.f118814d     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                gp.b$a r4 = gp.C11343b.a.LOGOUT     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r0.a(r4, r10)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
            L_0x01c8:
                if (r15 == 0) goto L_0x0202
                TJ.A r0 = r13.f118817g     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r4 = 1
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r1.f118861o = r2     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r11 = r32
                r1.f118849c = r11     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r1.f118850d = r13     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r12 = r31
                r1.f118851e = r12     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r1.f118852f = r10     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r4 = r30
                r1.f118853g = r4     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r1.f118854h = r4     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r1.f118855i = r9     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r1.f118856j = r15     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r14 = r29
                r1.f118857k = r14     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r4 = r36
                r1.f118858l = r4     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r4 = 0
                r1.f118859m = r4     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r4 = 2
                r1.f118860n = r4     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                java.lang.Object r0 = r0.emit(r5, r1)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                r4 = r28
                if (r0 != r4) goto L_0x0202
                return r4
            L_0x0202:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0047, all -> 0x010d }
                goto L_0x0216
            L_0x0209:
                r0 = move-exception
                goto L_0x0043
            L_0x020c:
                XH.x$a r4 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x0216:
                java.lang.Throwable r4 = XH.x.e(r0)
                if (r4 != 0) goto L_0x02c4
                XH.N r0 = (XH.C16807N) r0
                qv.e r0 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0231:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x0249
                java.lang.Object r8 = r4.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                r10 = 0
                boolean r9 = r9.b(r0, r10)
                if (r9 == 0) goto L_0x0231
                r5.add(r8)
                goto L_0x0231
            L_0x0249:
                java.util.Iterator r4 = r5.iterator()
                r5 = 0
                r11 = 0
            L_0x024f:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x037c
                java.lang.Object r8 = r4.next()
                qv.b r8 = (qv.C11819b) r8
                r12 = 0
                if (r5 != 0) goto L_0x026c
                java.lang.String r5 = "User is logged out"
                java.lang.String r5 = qv.C11818a.a(r5, r12)
                if (r5 != 0) goto L_0x0268
                goto L_0x037c
            L_0x0268:
                java.lang.String r5 = qv.C11820c.a(r5)
            L_0x026c:
                if (r11 != 0) goto L_0x02ba
                java.lang.Class r9 = r2.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                r10 = 36
                r11 = 2
                r13 = 0
                java.lang.String r14 = HJ.C15854t.s1(r9, r10, r13, r11, r13)
                r10 = 46
                java.lang.String r14 = HJ.C15854t.o1(r14, r10, r13, r11, r13)
                int r10 = r14.length()
                if (r10 != 0) goto L_0x028e
                goto L_0x0292
            L_0x028e:
                java.lang.String r9 = HJ.C15854t.P0(r14, r7)
            L_0x0292:
                java.lang.Thread r10 = java.lang.Thread.currentThread()
                java.lang.String r10 = r10.getName()
                r11 = 1
                boolean r10 = HJ.C15854t.b0(r10, r6, r11)
                if (r10 == 0) goto L_0x02a4
                r10 = r20
                goto L_0x02a6
            L_0x02a4:
                r10 = r21
            L_0x02a6:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                r11.append(r3)
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                r14 = r9
                goto L_0x02bb
            L_0x02ba:
                r14 = r11
            L_0x02bb:
                r11 = 0
                r9 = r0
                r10 = r14
                r13 = r5
                r8.a(r9, r10, r11, r12, r13)
                r11 = r14
                goto L_0x024f
            L_0x02c4:
                qv.e r0 = qv.e.ERROR
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x02d7:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x02ef
                java.lang.Object r9 = r5.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                r11 = 0
                boolean r10 = r10.b(r0, r11)
                if (r10 == 0) goto L_0x02d7
                r8.add(r9)
                goto L_0x02d7
            L_0x02ef:
                java.util.Iterator r5 = r8.iterator()
                r8 = 0
                r11 = 0
            L_0x02f5:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x037c
                java.lang.Object r9 = r5.next()
                qv.b r9 = (qv.C11819b) r9
                if (r11 != 0) goto L_0x0313
                java.lang.String r10 = "Failed to logout"
                java.lang.String r10 = qv.C11818a.a(r10, r4)
                if (r10 != 0) goto L_0x030d
                goto L_0x037c
            L_0x030d:
                java.lang.String r10 = qv.C11820c.a(r10)
                r14 = r10
                goto L_0x0314
            L_0x0313:
                r14 = r11
            L_0x0314:
                if (r8 != 0) goto L_0x0363
                java.lang.Class r8 = r2.getClass()
                java.lang.String r8 = r8.getName()
                kotlin.jvm.internal.C17542s.g(r8)
                r12 = 0
                r13 = 2
                r15 = 36
                java.lang.String r10 = HJ.C15854t.s1(r8, r15, r12, r13, r12)
                r11 = 46
                java.lang.String r10 = HJ.C15854t.o1(r10, r11, r12, r13, r12)
                int r16 = r10.length()
                if (r16 != 0) goto L_0x0336
                goto L_0x033a
            L_0x0336:
                java.lang.String r8 = HJ.C15854t.P0(r10, r7)
            L_0x033a:
                java.lang.Thread r10 = java.lang.Thread.currentThread()
                java.lang.String r10 = r10.getName()
                r15 = 1
                boolean r10 = HJ.C15854t.b0(r10, r6, r15)
                if (r10 == 0) goto L_0x034c
                r10 = r20
                goto L_0x034e
            L_0x034c:
                r10 = r21
            L_0x034e:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                r11.append(r3)
                r11.append(r8)
                java.lang.String r8 = r11.toString()
            L_0x0360:
                r17 = r8
                goto L_0x0367
            L_0x0363:
                r12 = 0
                r13 = 2
                r15 = 1
                goto L_0x0360
            L_0x0367:
                r11 = 0
                r8 = r9
                r9 = r0
                r10 = r17
                r16 = 46
                r18 = r12
                r12 = r4
                r19 = r13
                r13 = r14
                r8.a(r9, r10, r11, r12, r13)
                r11 = r14
                r8 = r17
                goto L_0x02f5
            L_0x037c:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x037f:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bA.C13998e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$openLoginPage$1", f = "SessionManagerImpl.kt", l = {127}, m = "invokeSuspend")
    /* renamed from: bA.e$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118865c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13998e f118866d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Activity f118867e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C13998e eVar, Activity activity, C17164e<? super g> eVar2) {
            super(2, eVar2);
            this.f118866d = eVar;
            this.f118867e = activity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f118866d, this.f118867e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118865c;
            if (i10 == 0) {
                y.b(obj);
                C14609c x10 = this.f118866d.f118811a;
                Activity activity = this.f118867e;
                this.f118865c = 1;
                obj = x10.e(activity, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                this.f118866d.f118814d.a(C11343b.a.LOGIN, this.f118866d.f118812b.b());
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$openSignupPage$1", f = "SessionManagerImpl.kt", l = {138}, m = "invokeSuspend")
    /* renamed from: bA.e$h */
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118868c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13998e f118869d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Activity f118870e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C13998e eVar, Activity activity, C17164e<? super h> eVar2) {
            super(2, eVar2);
            this.f118869d = eVar;
            this.f118870e = activity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f118869d, this.f118870e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118868c;
            if (i10 == 0) {
                y.b(obj);
                C14609c x10 = this.f118869d.f118811a;
                Activity activity = this.f118870e;
                this.f118868c = 1;
                obj = x10.c(activity, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                this.f118869d.f118814d.a(C11343b.a.LOGIN, this.f118869d.f118812b.b());
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.SessionManagerImpl$refreshTokenAsync$1", f = "SessionManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bA.e$i */
    static final class i extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118871c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13998e f118872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C13998e eVar, C17164e<? super i> eVar2) {
            super(2, eVar2);
            this.f118872d = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f118872d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118871c == 0) {
                y.b(obj);
                if (this.f118872d.isLoggedIn()) {
                    this.f118872d.f118813c.a();
                } else {
                    this.f118872d.f118812b.a();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C13998e(C14609c cVar, C14371a aVar, C14611e eVar, C14874c cVar2, Q q10, M m10) {
        C17542s.j(cVar, "userSessionOrchestrator");
        C17542s.j(aVar, "guestTokenRepository");
        C17542s.j(eVar, "userSessionTokenMonitor");
        C17542s.j(cVar2, "taskSchedulerEvents");
        C17542s.j(q10, "appScope");
        C17542s.j(m10, "dispatcher");
        this.f118811a = cVar;
        this.f118812b = aVar;
        this.f118813c = eVar;
        this.f118814d = cVar2;
        this.f118815e = q10;
        this.f118816f = m10;
        C16504A<Boolean> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f118817g = b10;
        this.f118818h = C16534i.b(b10);
        this.f118822l = n.a(cVar.a(), q10, new C13997d());
    }

    /* access modifiers changed from: private */
    public static final C16532g C(C13998e eVar) {
        return new c(eVar.p());
    }

    /* access modifiers changed from: private */
    public static final C16532g D(C13998e eVar) {
        return new d(eVar.f118811a.a());
    }

    /* access modifiers changed from: private */
    public static final C16532g E(C13998e eVar) {
        return new C2967e(eVar.p());
    }

    /* access modifiers changed from: private */
    public static final C13910b F(CiamSessionCredentials ciamSessionCredentials) {
        return C14742a.a(ciamSessionCredentials);
    }

    /* renamed from: A */
    public C16509F<Boolean> k() {
        return this.f118818h;
    }

    /* renamed from: B */
    public C16519P<C13910b> p() {
        return this.f118822l;
    }

    public String a() {
        CiamSessionCredentials value = this.f118811a.a().getValue();
        if (value != null) {
            return value.d();
        }
        return null;
    }

    public Object b(C17164e<? super String> eVar) {
        return isLoggedIn() ? this.f118813c.a() : this.f118812b.a();
    }

    public boolean c() {
        String b10 = this.f118812b.b();
        return !(b10 == null || b10.length() == 0);
    }

    public boolean d() {
        CiamSessionCredentials value = this.f118811a.a().getValue();
        return value != null && value.g();
    }

    public void e(Activity activity) {
        C17542s.j(activity, "activity");
        F0 unused = C16314k.d(this.f118815e, (C17168i) null, (T) null, new h(this, activity, (C17164e<? super h>) null), 3, (Object) null);
    }

    public C16532g<Boolean> f() {
        return (C16532g) this.f118821k.getValue();
    }

    public void g(Activity activity) {
        C17542s.j(activity, "activity");
        F0 unused = C16314k.d(this.f118815e, (C17168i) null, (T) null, new g(this, activity, (C17164e<? super g>) null), 3, (Object) null);
    }

    public C16532g<String> getToken() {
        return new a(this.f118811a.a(), this);
    }

    public synchronized String h() {
        try {
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return isLoggedIn() ? this.f118813c.getToken() : this.f118812b.getToken();
    }

    public boolean i() {
        return p().getValue() == C13910b.FAMILY;
    }

    public boolean isLoggedIn() {
        return p().getValue().j();
    }

    public C16532g<Boolean> j() {
        return (C16532g) this.f118820j.getValue();
    }

    @C16814e
    public synchronized void l() {
        F0 unused = C16314k.d(this.f118815e, (C17168i) null, (T) null, new i(this, (C17164e<? super i>) null), 3, (Object) null);
    }

    public Object m(boolean z10, boolean z11, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(R0.f137599a, new f(this, z11, z10, (C17164e<? super f>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public C16532g<Boolean> n() {
        return (C16532g) this.f118819i.getValue();
    }

    public C13910b o() {
        return p().getValue();
    }
}
