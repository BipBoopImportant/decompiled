package com.sugarcube.app.base.ui.hybrid;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.app.Activity;
import android.util.Log;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.LoggedInUser;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17221b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0002=>B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020)0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u0010;\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000f8B@BX\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/a;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "accountInteractions", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "privacyPolicyConsentUseCase", "<init>", "(Landroidx/lifecycle/U;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/external/interactions/AccountInteractions;Lcom/sugarcube/app/base/data/analytics/Analytics;Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;)V", "", "O", "(LdI/e;)Ljava/lang/Object;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onResume", "(Landroidx/lifecycle/y;)V", "Landroid/app/Activity;", "activity", "L", "(Landroid/app/Activity;)V", "M", "m", "Landroidx/lifecycle/U;", "n", "Lcom/sugarcube/app/base/data/user/UserRepo;", "o", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "p", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "q", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "getPrivacyPolicyConsentUseCase", "()Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "Landroidx/lifecycle/K;", "Lcom/sugarcube/app/base/ui/hybrid/a$c;", "r", "Landroidx/lifecycle/K;", "_uiState", "Landroidx/lifecycle/F;", "s", "Landroidx/lifecycle/F;", "J", "()Landroidx/lifecycle/F;", "uiState", "t", "Z", "gotNewAuthState", "value", "K", "()Z", "N", "(Z)V", "waitingForAuthResponse", "u", "b", "c", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.hybrid.a  reason: case insensitive filesystem */
public final class C14247a extends f0 implements C5205h {

    /* renamed from: u  reason: collision with root package name */
    public static final b f124982u = new b((DefaultConstructorMarker) null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f124983v = 8;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static final String f124984w = AnyKt.SUGARCUBE_TAG;

    /* renamed from: x  reason: collision with root package name */
    private static final String f124985x = "waitingForAuthUI";

    /* renamed from: m  reason: collision with root package name */
    private final U f124986m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final UserRepo f124987n;

    /* renamed from: o  reason: collision with root package name */
    private final AccountInteractions f124988o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Analytics f124989p;

    /* renamed from: q  reason: collision with root package name */
    private final PrivacyPolicyConsentUseCase f124990q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final K<c> f124991r;

    /* renamed from: s  reason: collision with root package name */
    private final F<c> f124992s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f124993t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.hybrid.DoneFragmentViewModel$1", f = "HybridDoneFragment.kt", l = {258}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.a$a  reason: collision with other inner class name */
    static final class C3066a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124994c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14247a f124995d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/sugarcube/core/network/models/LoggedInUser;", "user", "LXH/N;", "<anonymous>", "(Lcom/sugarcube/core/network/models/LoggedInUser;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.hybrid.DoneFragmentViewModel$1$1", f = "HybridDoneFragment.kt", l = {269}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.hybrid.a$a$a  reason: collision with other inner class name */
        static final class C3067a extends l implements p<LoggedInUser, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124996c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f124997d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C14247a f124998e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3067a(C14247a aVar, C17164e<? super C3067a> eVar) {
                super(2, eVar);
                this.f124998e = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C3067a aVar = new C3067a(this.f124998e, eVar);
                aVar.f124997d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(LoggedInUser loggedInUser, C17164e<? super C16807N> eVar) {
                return ((C3067a) create(loggedInUser, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f124996c;
                if (i10 == 0) {
                    y.b(obj);
                    LoggedInUser loggedInUser = (LoggedInUser) this.f124997d;
                    String C10 = C14247a.f124984w;
                    boolean E10 = this.f124998e.K();
                    Log.d(C10, "user : " + loggedInUser + " " + E10);
                    this.f124998e.f124993t = true;
                    if (this.f124998e.K()) {
                        this.f124998e.f124993t = true;
                        this.f124998e.f124991r.setValue(c.LoggingIn);
                    } else if (loggedInUser != null) {
                        this.f124998e.f124991r.setValue(c.AlreadyLoggedIn);
                        C14247a aVar = this.f124998e;
                        this.f124997d = loggedInUser;
                        this.f124996c = 1;
                        obj = aVar.O(this);
                        if (obj == f10) {
                            return f10;
                        }
                    } else {
                        this.f124998e.f124991r.setValue(c.LoggedOut);
                    }
                    return C16807N.f139792a;
                } else if (i10 == 1) {
                    LoggedInUser loggedInUser2 = (LoggedInUser) this.f124997d;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f124998e.f124991r.setValue(c.PrivacyPolicy);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3066a(C14247a aVar, C17164e<? super C3066a> eVar) {
            super(2, eVar);
            this.f124995d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3066a(this.f124995d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3066a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124994c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<LoggedInUser> user = this.f124995d.f124987n.getUser();
                C3067a aVar = new C3067a(this.f124995d, (C17164e<? super C3067a>) null);
                this.f124994c = 1;
                if (C16534i.j(user, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "WAITING_KEY", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.hybrid.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "Init", "LoggedOut", "LoggingIn", "AlreadyLoggedIn", "GoToGallery", "PrivacyPolicy", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.hybrid.a$c */
    public enum c {
        Init,
        LoggedOut,
        LoggingIn,
        AlreadyLoggedIn,
        GoToGallery,
        PrivacyPolicy;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.hybrid.DoneFragmentViewModel$onResume$1", f = "HybridDoneFragment.kt", l = {304}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.a$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f124999c;

        /* renamed from: d  reason: collision with root package name */
        int f125000d;

        /* renamed from: e  reason: collision with root package name */
        int f125001e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14247a f125002f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ F0 f125003g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C14247a aVar, F0 f02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f125002f = aVar;
            this.f125003g = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f125002f, this.f125003g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125001e;
            if (i10 == 0) {
                y.b(obj);
                C15906b.a aVar = C15906b.f135496b;
                long s10 = C15908d.s(4, C15909e.SECONDS);
                this.f124999c = aVar;
                this.f125000d = 4;
                this.f125001e = 1;
                if (C16297b0.c(s10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C15906b.a aVar2 = (C15906b.a) this.f124999c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.f125002f.f124987n.isLoggedIn().getValue().booleanValue()) {
                F0.a.a(this.f125003g, (CancellationException) null, 1, (Object) null);
                if (!this.f125002f.f124993t) {
                    Analytics.loginResult$default(this.f125002f.f124989p, (String) null, (String) null, false, 3, (Object) null);
                }
                this.f125002f.N(false);
                this.f125002f.f124991r.setValue(c.LoggedOut);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.hybrid.DoneFragmentViewModel$onResume$job$1", f = "HybridDoneFragment.kt", l = {293}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.a$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125004c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14247a f125005d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.hybrid.a$e$a  reason: collision with other inner class name */
        static final class C3068a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C14247a f125006a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.sugarcube.app.base.ui.hybrid.DoneFragmentViewModel$onResume$job$1$1", f = "HybridDoneFragment.kt", l = {295}, m = "emit")
            /* renamed from: com.sugarcube.app.base.ui.hybrid.a$e$a$a  reason: collision with other inner class name */
            static final class C3069a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f125007c;

                /* renamed from: d  reason: collision with root package name */
                Object f125008d;

                /* renamed from: e  reason: collision with root package name */
                boolean f125009e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f125010f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C3068a<T> f125011g;

                /* renamed from: h  reason: collision with root package name */
                int f125012h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3069a(C3068a<? super T> aVar, C17164e<? super C3069a> eVar) {
                    super(eVar);
                    this.f125011g = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f125010f = obj;
                    this.f125012h |= Integer.MIN_VALUE;
                    return this.f125011g.c(false, this);
                }
            }

            C3068a(C14247a aVar) {
                this.f125006a = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(boolean r6, dI.C17164e<? super XH.C16807N> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.sugarcube.app.base.ui.hybrid.C14247a.e.C3068a.C3069a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.sugarcube.app.base.ui.hybrid.a$e$a$a r0 = (com.sugarcube.app.base.ui.hybrid.C14247a.e.C3068a.C3069a) r0
                    int r1 = r0.f125012h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f125012h = r1
                    goto L_0x0018
                L_0x0013:
                    com.sugarcube.app.base.ui.hybrid.a$e$a$a r0 = new com.sugarcube.app.base.ui.hybrid.a$e$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r1 = r0.f125010f
                    java.lang.Object r2 = eI.C17187b.f()
                    int r3 = r0.f125012h
                    r4 = 1
                    if (r3 == 0) goto L_0x0039
                    if (r3 != r4) goto L_0x0031
                    java.lang.Object r6 = r0.f125008d
                    dI.e r6 = (dI.C17164e) r6
                    java.lang.Object r6 = r0.f125007c
                    com.sugarcube.app.base.ui.hybrid.a$e$a r6 = (com.sugarcube.app.base.ui.hybrid.C14247a.e.C3068a) r6
                    XH.y.b(r1)
                    goto L_0x0050
                L_0x0031:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0039:
                    XH.y.b(r1)
                    if (r6 == 0) goto L_0x006f
                    com.sugarcube.app.base.ui.hybrid.a r1 = r5.f125006a
                    r0.f125007c = r5
                    r0.f125008d = r7
                    r0.f125009e = r6
                    r0.f125012h = r4
                    java.lang.Object r1 = r1.O(r0)
                    if (r1 != r2) goto L_0x004f
                    return r2
                L_0x004f:
                    r6 = r5
                L_0x0050:
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r7 = r1.booleanValue()
                    if (r7 == 0) goto L_0x0064
                    com.sugarcube.app.base.ui.hybrid.a r6 = r6.f125006a
                    androidx.lifecycle.K r6 = r6.f124991r
                    com.sugarcube.app.base.ui.hybrid.a$c r7 = com.sugarcube.app.base.ui.hybrid.C14247a.c.PrivacyPolicy
                    r6.setValue(r7)
                    goto L_0x006f
                L_0x0064:
                    com.sugarcube.app.base.ui.hybrid.a r6 = r6.f125006a
                    androidx.lifecycle.K r6 = r6.f124991r
                    com.sugarcube.app.base.ui.hybrid.a$c r7 = com.sugarcube.app.base.ui.hybrid.C14247a.c.GoToGallery
                    r6.setValue(r7)
                L_0x006f:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.C14247a.e.C3068a.c(boolean, dI.e):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14247a aVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f125005d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f125005d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125004c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f125005d.K()) {
                    this.f125005d.f124991r.setValue(c.LoggingIn);
                }
                C16519P<Boolean> isLoggedIn = this.f125005d.f124987n.isLoggedIn();
                C3068a aVar = new C3068a(this.f125005d);
                this.f125004c = 1;
                if (isLoggedIn.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    public C14247a(U u10, UserRepo userRepo, AccountInteractions accountInteractions, Analytics analytics, PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(accountInteractions, "accountInteractions");
        C17542s.j(analytics, "analytics");
        C17542s.j(privacyPolicyConsentUseCase, "privacyPolicyConsentUseCase");
        this.f124986m = u10;
        this.f124987n = userRepo;
        this.f124988o = accountInteractions;
        this.f124989p = analytics;
        this.f124990q = privacyPolicyConsentUseCase;
        K<c> k10 = new K<>(c.Init);
        this.f124991r = k10;
        this.f124992s = k10;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C3066a(this, (C17164e<? super C3066a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final boolean K() {
        return C17542s.e(this.f124986m.f(f124985x), Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public final void N(boolean z10) {
        this.f124986m.m(f124985x, Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public final Object O(C17164e<? super Boolean> eVar) {
        return this.f124990q.shouldDisplayPrivacyPolicyDialog(eVar);
    }

    public final F<c> J() {
        return this.f124992s;
    }

    public final void L(Activity activity) {
        C17542s.j(activity, "activity");
        N(true);
        this.f124993t = false;
        this.f124988o.navigateLogin(activity);
    }

    public final void M(Activity activity) {
        C17542s.j(activity, "activity");
        N(true);
        this.f124993t = false;
        this.f124988o.navigateSignup(activity);
    }

    public void onResume(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.onResume(yVar);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new d(this, C16314k.d(g0.a(this), (C17168i) null, (T) null, new e(this, (C17164e<? super e>) null), 3, (Object) null), (C17164e<? super d>) null), 3, (Object) null);
    }
}
