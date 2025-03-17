package com.sugarcube.app.base.ui.capturev2;

import OE.n;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16533h;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.net.Uri;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyConsentUseCase;
import com.sugarcube.app.base.data.user.privacypolicy.PrivacyPolicyFeatureState;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import tF.C15083h;
import tF.C15091p;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020&0 8\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001eR\"\u00100\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001eR\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b0 8\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002040 8\u0006¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010$R\u0019\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0 8F¢\u0006\u0006\u001a\u0004\b8\u0010$¨\u0006:"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/H0;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "privacyPolicyConsentUseCase", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "accountInteractions", "<init>", "(Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/external/interactions/AccountInteractions;)V", "LXH/N;", "R", "()V", "S", "U", "Landroidx/fragment/app/t;", "activity", "T", "(Landroidx/fragment/app/t;)V", "c0", "m", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyConsentUseCase;", "n", "Lcom/sugarcube/app/base/data/user/UserRepo;", "o", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "Landroidx/lifecycle/K;", "", "kotlin.jvm.PlatformType", "p", "Landroidx/lifecycle/K;", "_isUserLoggedIn", "Landroidx/lifecycle/F;", "q", "Landroidx/lifecycle/F;", "Q", "()Landroidx/lifecycle/F;", "isUserLoggedIn", "LtF/h;", "r", "_showDialog", "s", "getShowDialog", "showDialog", "Landroid/net/Uri;", "t", "_privacyPolicyUri", "u", "_privacyPolicyErrorState", "v", "N", "privacyPolicyErrorState", "Lcom/sugarcube/app/base/data/user/privacypolicy/PrivacyPolicyFeatureState;", "w", "O", "privacyPolicyState", "P", "privacyPolicyUri", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class H0 extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final PrivacyPolicyConsentUseCase f123411m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final UserRepo f123412n;

    /* renamed from: o  reason: collision with root package name */
    private final AccountInteractions f123413o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final K<Boolean> f123414p;

    /* renamed from: q  reason: collision with root package name */
    private final F<Boolean> f123415q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final K<C15083h> f123416r;

    /* renamed from: s  reason: collision with root package name */
    private final F<C15083h> f123417s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final K<Uri> f123418t = new K<>();
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final K<Boolean> f123419u;

    /* renamed from: v  reason: collision with root package name */
    private final F<Boolean> f123420v;

    /* renamed from: w  reason: collision with root package name */
    private final F<PrivacyPolicyFeatureState> f123421w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ResultViewModel$1", f = "ResultViewModel.kt", l = {54}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123422c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H0 f123423d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.capturev2.H0$a$a  reason: collision with other inner class name */
        static final class C3036a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ H0 f123424a;

            C3036a(H0 h02) {
                this.f123424a = h02;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f123424a.f123414p.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H0 h02, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123423d = h02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f123423d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123422c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<Boolean> isLoggedIn = this.f123423d.f123412n.isLoggedIn();
                C3036a aVar = new C3036a(this.f123423d);
                this.f123422c = 1;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ResultViewModel$showPrivacyDisclaimerDialog$1$1", f = "ResultViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123425c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H0 f123426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(H0 h02, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f123426d = h02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f123426d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123425c == 0) {
                y.b(obj);
                this.f123426d.f123411m.captureLinkClicked();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ResultViewModel$showPrivacyDisclaimerDialog$2$1", f = "ResultViewModel.kt", l = {89}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123427c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f123428d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ H0 f123429e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4899r0<Boolean> r0Var, H0 h02, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f123428d = r0Var;
            this.f123429e = h02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f123428d, this.f123429e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123427c;
            if (i10 == 0) {
                y.b(obj);
                this.f123428d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                PrivacyPolicyConsentUseCase H10 = this.f123429e.f123411m;
                this.f123427c = 1;
                obj = H10.capturePositiveAction(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f123428d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            if (booleanValue) {
                this.f123429e.f123416r.postValue(C15083h.a.f131169a);
            } else {
                this.f123429e.f123419u.postValue(kotlin.coroutines.jvm.internal.b.a(true));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ResultViewModel$showPrivacyDisclaimerDialog$3$1", f = "ResultViewModel.kt", l = {103}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123430c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H0 f123431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(H0 h02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f123431d = h02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f123431d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123430c;
            if (i10 == 0) {
                y.b(obj);
                PrivacyPolicyConsentUseCase H10 = this.f123431d.f123411m;
                this.f123430c = 1;
                if (H10.captureNegativeAction(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f123431d.f123416r.postValue(C15083h.a.f131169a);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ResultViewModel$showPrivacyDisclaimerDialog$5$1", f = "ResultViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123432c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H0 f123433d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f123434e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(H0 h02, boolean z10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f123433d = h02;
            this.f123434e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f123433d, this.f123434e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123432c == 0) {
                y.b(obj);
                this.f123433d.f123411m.captureUpdateCheckBoxState(this.f123434e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ResultViewModel$showPrivacyDisclaimerDialog$6$1", f = "ResultViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123435c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H0 f123436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(H0 h02, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f123436d = h02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f123436d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123435c == 0) {
                y.b(obj);
                this.f123436d.f123411m.captureLinkClicked();
                this.f123436d.f123418t.setValue(this.f123436d.f123411m.generatePrivacyPolicyLink());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public H0(PrivacyPolicyConsentUseCase privacyPolicyConsentUseCase, UserRepo userRepo, AccountInteractions accountInteractions) {
        C17542s.j(privacyPolicyConsentUseCase, "privacyPolicyConsentUseCase");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(accountInteractions, "accountInteractions");
        this.f123411m = privacyPolicyConsentUseCase;
        this.f123412n = userRepo;
        this.f123413o = accountInteractions;
        Boolean bool = Boolean.FALSE;
        K<Boolean> k10 = new K<>(bool);
        this.f123414p = k10;
        this.f123415q = k10;
        K<C15083h> k11 = new K<>();
        this.f123416r = k11;
        this.f123417s = k11;
        K<Boolean> k12 = new K<>(bool);
        this.f123419u = k12;
        this.f123420v = k12;
        this.f123421w = C5210m.c(privacyPolicyConsentUseCase.getPrivacyPolicyState(), (C17168i) null, 0, 3, (Object) null);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N V(H0 h02) {
        h02.f123418t.setValue(h02.f123411m.generatePrivacyPolicyLink());
        F0 unused = C16314k.d(g0.a(h02), (C17168i) null, (T) null, new b(h02, (C17164e<? super b>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W(H0 h02, C4899r0 r0Var) {
        F0 unused = C16314k.d(g0.a(h02), (C17168i) null, (T) null, new c(r0Var, h02, (C17164e<? super c>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X(H0 h02) {
        F0 unused = C16314k.d(g0.a(h02), (C17168i) null, (T) null, new d(h02, (C17164e<? super d>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(H0 h02) {
        h02.f123416r.postValue(C15083h.a.f131169a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z(H0 h02, boolean z10) {
        F0 unused = C16314k.d(g0.a(h02), (C17168i) null, (T) null, new e(h02, z10, (C17164e<? super e>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(H0 h02) {
        F0 unused = C16314k.d(g0.a(h02), (C17168i) null, (T) null, new f(h02, (C17164e<? super f>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b0() {
        return C16807N.f139792a;
    }

    public final F<Boolean> N() {
        return this.f123420v;
    }

    public final F<PrivacyPolicyFeatureState> O() {
        return this.f123421w;
    }

    public final F<Uri> P() {
        return this.f123418t;
    }

    public final F<Boolean> Q() {
        return this.f123415q;
    }

    public final void R() {
        this.f123418t.setValue(null);
    }

    public final void S() {
        this.f123419u.postValue(Boolean.FALSE);
    }

    public final void T(C5191t tVar) {
        C17542s.j(tVar, "activity");
        this.f123413o.navigateLogin(tVar);
    }

    public final void U() {
        C4899r0 j10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        C4899r0 r0Var = j10;
        K<C15083h> k10 = this.f123416r;
        C15091p pVar = r7;
        C15091p pVar2 = new C15091p(Integer.valueOf(n.f113325a1), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar3 = r13;
        C15091p pVar4 = new C15091p(Integer.valueOf(n.f113318Z0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar5 = r22;
        C15091p pVar6 = new C15091p(Integer.valueOf(n.f113312Y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar7 = r11;
        C15091p pVar8 = new C15091p(Integer.valueOf(n.f113337c), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar9 = r22;
        C15091p pVar10 = new C15091p(Integer.valueOf(n.f113197F), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar11 = r28;
        C15091p pVar12 = new C15091p(Integer.valueOf(n.f113306X0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar13 = r22;
        C15091p pVar14 = new C15091p(Integer.valueOf(n.f113312Y0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        A0 a02 = r5;
        A0 a03 = new A0(this);
        B0 b02 = r5;
        B0 b03 = new B0(this, j10);
        C0 c02 = r1;
        C0 c03 = new C0(this);
        D0 d02 = r1;
        D0 d03 = new D0(this);
        E0 e02 = r1;
        E0 e03 = new E0(this);
        F0 f02 = r1;
        F0 f03 = new F0(this);
        G0 g02 = r1;
        G0 g03 = new G0();
        k10.postValue(new C15083h.b("privacy_disclaimer", pVar, pVar3, pVar5, a02, pVar7, b02, pVar9, c02, d02, pVar11, pVar13, false, e02, f02, g02, r0Var, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, (DefaultConstructorMarker) null));
    }

    public final void c0(C5191t tVar) {
        C17542s.j(tVar, "activity");
        this.f123413o.navigateSignup(tVar);
    }
}
