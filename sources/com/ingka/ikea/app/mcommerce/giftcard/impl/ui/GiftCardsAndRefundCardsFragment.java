package com.ingka.ikea.app.mcommerce.giftcard.impl.ui;

import Ae.e;
import KC.s;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import bh.C9437B;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17168i;
import gh.C9743b;
import gh.C9745d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import kp.C11522d;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import uI.C18059h;
import xl.C12317a;

@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001A\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006I²\u0006\f\u0010F\u001a\u00020E8\nX\u0002²\u0006\f\u0010H\u001a\u00020G8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/mcommerce/giftcard/impl/ui/GiftCardsAndRefundCardsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "", "buyGiftCardsUri", "LXH/N;", "M0", "(Ljava/lang/String;)V", "W0", "U0", "V0", "D0", "(LU0/m;I)V", "LAe/e;", "X", "LAe/e;", "O0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LRd/a;", "Y", "LRd/a;", "N0", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "LIl/a;", "Z", "LIl/a;", "P0", "()LIl/a;", "setAppConfig", "(LIl/a;)V", "appConfig", "LEo/a;", "y0", "LEo/a;", "S0", "()LEo/a;", "setChromeTabApi", "(LEo/a;)V", "chromeTabApi", "LKC/s;", "z0", "LKC/s;", "T0", "()LKC/s;", "setGiftCardValidator$giftcard_implementation_release", "(LKC/s;)V", "giftCardValidator", "Lgh/j;", "A0", "LXH/o;", "R0", "()Lgh/j;", "checkBalanceViewModel", "Lgh/d;", "B0", "Q0", "()Lgh/d;", "buyGiftCardViewModel", "com/ingka/ikea/app/mcommerce/giftcard/impl/ui/GiftCardsAndRefundCardsFragment$g", "C0", "Lcom/ingka/ikea/app/mcommerce/giftcard/impl/ui/GiftCardsAndRefundCardsFragment$g;", "loginSignUpActions", "Lgh/i;", "checkGiftCardBalanceState", "Lgh/b;", "buyGiftCardUiState", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GiftCardsAndRefundCardsFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f72027A0;

    /* renamed from: B0  reason: collision with root package name */
    private final C16824o f72028B0;

    /* renamed from: C0  reason: collision with root package name */
    private final g f72029C0 = new g(this);

    /* renamed from: X  reason: collision with root package name */
    public Ae.e f72030X;

    /* renamed from: Y  reason: collision with root package name */
    public Rd.a f72031Y;

    /* renamed from: Z  reason: collision with root package name */
    public Il.a f72032Z;

    /* renamed from: y0  reason: collision with root package name */
    public Eo.a f72033y0;

    /* renamed from: z0  reason: collision with root package name */
    public s f72034z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, GiftCardsAndRefundCardsFragment.class, "popBackStack", "popBackStack()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((GiftCardsAndRefundCardsFragment) this.receiver).W0();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<String, C16807N> {
        b(Object obj) {
            super(1, obj, GiftCardsAndRefundCardsFragment.class, "buyGiftCards", "buyGiftCards(Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((String) obj);
            return C16807N.f139792a;
        }

        public final void t(String str) {
            C17542s.j(str, "p0");
            ((GiftCardsAndRefundCardsFragment) this.receiver).M0(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
        c(Object obj) {
            super(0, obj, gh.j.class, "resetGenericServiceException", "resetGenericServiceException()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((gh.j) this.receiver).J();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements nI.p<String, String, C16807N> {
        d(Object obj) {
            super(2, obj, gh.j.class, "onBalanceCheck", "onBalanceCheck(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((String) obj, (String) obj2);
            return C16807N.f139792a;
        }

        public final void t(String str, String str2) {
            C17542s.j(str, "p0");
            C17542s.j(str2, "p1");
            ((gh.j) this.receiver).H(str, str2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17631a<C16807N> {
        e(Object obj) {
            super(0, obj, gh.j.class, "clearError", "clearError()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((gh.j) this.receiver).E();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17631a<C16807N> {
        f(Object obj) {
            super(0, obj, gh.j.class, "resetCheckBalanceForm", "resetCheckBalanceForm()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((gh.j) this.receiver).I();
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"com/ingka/ikea/app/mcommerce/giftcard/impl/ui/GiftCardsAndRefundCardsFragment$g", "Lxl/a;", "Lkotlin/reflect/KFunction0;", "LXH/N;", "a", "LuI/h;", "c", "()LuI/h;", "login", "b", "d", "signUp", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C12317a {

        /* renamed from: a  reason: collision with root package name */
        private final C18059h<C16807N> f72035a;

        /* renamed from: b  reason: collision with root package name */
        private final C18059h<C16807N> f72036b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
            a(Object obj) {
                super(0, obj, GiftCardsAndRefundCardsFragment.class, "launchLogin", "launchLogin()V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                t();
                return C16807N.f139792a;
            }

            public final void t() {
                ((GiftCardsAndRefundCardsFragment) this.receiver).U0();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
            b(Object obj) {
                super(0, obj, GiftCardsAndRefundCardsFragment.class, "launchSignUp", "launchSignUp()V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                t();
                return C16807N.f139792a;
            }

            public final void t() {
                ((GiftCardsAndRefundCardsFragment) this.receiver).V0();
            }
        }

        g(GiftCardsAndRefundCardsFragment giftCardsAndRefundCardsFragment) {
            this.f72035a = new a(giftCardsAndRefundCardsFragment);
            this.f72036b = new b(giftCardsAndRefundCardsFragment);
        }

        public /* bridge */ /* synthetic */ C17631a a() {
            return (C17631a) c();
        }

        public /* bridge */ /* synthetic */ C17631a b() {
            return (C17631a) d();
        }

        public C18059h<C16807N> c() {
            return this.f72035a;
        }

        public C18059h<C16807N> d() {
            return this.f72036b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f72037c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f72038d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f72037c = oVar;
            this.f72038d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f72038d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f72037c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f72039c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar) {
            super(0);
            this.f72039c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f72039c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72040c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C17631a aVar) {
            super(0);
            this.f72040c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f72040c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f72041c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C16824o oVar) {
            super(0);
            this.f72041c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f72041c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72042c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f72043d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C17631a aVar, C16824o oVar) {
            super(0);
            this.f72042c = aVar;
            this.f72043d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f72042c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f72043d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f72044c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f72045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f72044c = oVar;
            this.f72045d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f72045d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f72044c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class n extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f72046c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C5187o oVar) {
            super(0);
            this.f72046c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f72046c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72047c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(C17631a aVar) {
            super(0);
            this.f72047c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f72047c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class p extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f72048c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(C16824o oVar) {
            super(0);
            this.f72048c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f72048c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class q extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72049c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f72050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(C17631a aVar, C16824o oVar) {
            super(0);
            this.f72049c = aVar;
            this.f72050d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f72049c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f72050d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    public GiftCardsAndRefundCardsFragment() {
        i iVar = new i(this);
        XH.s sVar = XH.s.NONE;
        C16824o a10 = C16825p.a(sVar, new j(iVar));
        this.f72027A0 = W.b(this, P.b(gh.j.class), new k(a10), new l((C17631a) null, a10), new m(this, a10));
        C16824o a11 = C16825p.a(sVar, new o(new n(this)));
        this.f72028B0 = W.b(this, P.b(C9745d.class), new p(a11), new q((C17631a) null, a11), new h(this, a11));
    }

    private static final gh.i G0(A1<? extends gh.i> a12) {
        return (gh.i) a12.getValue();
    }

    private static final C9743b H0(A1<? extends C9743b> a12) {
        return (C9743b) a12.getValue();
    }

    /* access modifiers changed from: private */
    public final void M0(String str) {
        e.c.c(O0(), Ae.j.ACTION_TAP.b(), (Map) null, Interaction$Component.BUY_GIFT_CARDS, (e.b) null, 8, (Object) null);
        S0().a(getContext(), str);
    }

    private final C9745d Q0() {
        return (C9745d) this.f72028B0.getValue();
    }

    private final gh.j R0() {
        return (gh.j) this.f72027A0.getValue();
    }

    /* access modifiers changed from: private */
    public final void U0() {
        e.c.b(O0(), Interaction$Component.LOGIN_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        Rd.a N02 = N0();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        N02.d(requireActivity);
    }

    /* access modifiers changed from: private */
    public final void V0() {
        e.c.b(O0(), Interaction$Component.SIGN_UP_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        Rd.a N02 = N0();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        N02.e(requireActivity);
    }

    /* access modifiers changed from: private */
    public final void W0() {
        androidx.navigation.fragment.a.a(this).k0();
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        C4889m mVar2 = mVar;
        mVar2.W(-125994951);
        if (C4895p.J()) {
            C4895p.S(-125994951, i10, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.ui.GiftCardsAndRefundCardsFragment.FragmentContent (GiftCardsAndRefundCardsFragment.kt:56)");
        }
        A1<gh.i> b10 = p1.b(R0().F(), (C17168i) null, mVar2, 0, 1);
        A1<C9743b> b11 = p1.b(Q0().D(), (C17168i) null, mVar2, 0, 1);
        gh.i G02 = G0(b10);
        C9743b H02 = H0(b11);
        C11522d s10 = P0().s();
        mVar2.W(783721382);
        boolean F10 = mVar2.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar2.u(D10);
        }
        C18059h hVar = (C18059h) D10;
        mVar.P();
        g gVar = this.f72029C0;
        mVar2.W(783724518);
        boolean F11 = mVar2.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new b(this);
            mVar2.u(D11);
        }
        C18059h hVar2 = (C18059h) D11;
        mVar.P();
        gh.j R02 = R0();
        mVar2.W(783726155);
        boolean F12 = mVar2.F(R02);
        Object D12 = mVar.D();
        if (F12 || D12 == C4889m.f14007a.a()) {
            D12 = new c(R02);
            mVar2.u(D12);
        }
        C18059h hVar3 = (C18059h) D12;
        mVar.P();
        gh.j R03 = R0();
        mVar2.W(783728573);
        boolean F13 = mVar2.F(R03);
        Object D13 = mVar.D();
        if (F13 || D13 == C4889m.f14007a.a()) {
            D13 = new d(R03);
            mVar2.u(D13);
        }
        C18059h hVar4 = (C18059h) D13;
        mVar.P();
        gh.j R04 = R0();
        mVar2.W(783730745);
        boolean F14 = mVar2.F(R04);
        Object D14 = mVar.D();
        if (F14 || D14 == C4889m.f14007a.a()) {
            D14 = new e(R04);
            mVar2.u(D14);
        }
        C18059h hVar5 = (C18059h) D14;
        mVar.P();
        s T02 = T0();
        gh.j R05 = R0();
        mVar2.W(783734564);
        boolean F15 = mVar2.F(R05);
        Object D15 = mVar.D();
        if (F15 || D15 == C4889m.f14007a.a()) {
            D15 = new f(R05);
            mVar2.u(D15);
        }
        mVar.P();
        C9437B.e(G02, H02, s10, (nI.p) hVar4, (C17631a) hVar5, T02, (C17631a) hVar, gVar, (C17642l) hVar2, (C17631a) hVar3, (C17631a) ((C18059h) D15), mVar, 0, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final Rd.a N0() {
        Rd.a aVar = this.f72031Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final Ae.e O0() {
        Ae.e eVar = this.f72030X;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final Il.a P0() {
        Il.a aVar = this.f72032Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfig");
        return null;
    }

    public final Eo.a S0() {
        Eo.a aVar = this.f72033y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabApi");
        return null;
    }

    public final s T0() {
        s sVar = this.f72034z0;
        if (sVar != null) {
            return sVar;
        }
        C17542s.z("giftCardValidator");
        return null;
    }
}
