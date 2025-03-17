package com.sugarcube.app.base.ui.gallery.landing;

import C4.j;
import CF.C12705e;
import CF.C12710j;
import CF.C12716p;
import CF.C12717q;
import CF.C12718r;
import CF.C12719s;
import DF.C12754C;
import OE.n;
import QE.C13420A;
import QJ.F0;
import QJ.Q;
import QJ.T;
import S1.C4820m;
import U0.C4889m;
import U0.C4895p;
import UE.C13733a;
import VE.C13760b;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.v;
import XH.y;
import aF.C13959W;
import android.net.Uri;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.F;
import androidx.lifecycle.L;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import cF.C14039a;
import cF.C14043e;
import cF.C14044f;
import cF.C14045g;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.app.base.ui.gallery.landing.a;
import com.sugarcube.app.base.ui.utils.BouncingBallView;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import n0.C5607m;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tK.Z;
import x4.C;
import x4.C8948l;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/landing/GalleryLandingFragment2;", "Lcom/sugarcube/app/base/ui/BaseFragment;", "<init>", "()V", "LXH/N;", "X0", "d1", "b1", "V0", "Z0", "Lx4/o;", "navController", "", "compatible", "N0", "(Lx4/o;Z)V", "O0", "(Lx4/o;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "LQE/A;", "O", "LQE/A;", "_binding", "LDF/C;", "P", "LXH/o;", "L0", "()LDF/C;", "sharedViewModel", "Lcom/sugarcube/app/base/ui/gallery/landing/d;", "Q", "M0", "()Lcom/sugarcube/app/base/ui/gallery/landing/d;", "viewModel", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "R", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "J0", "()Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "setAccountInteractions", "(Lcom/sugarcube/app/base/external/interactions/AccountInteractions;)V", "accountInteractions", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "S", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "getConfigRepository", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "setConfigRepository", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "configRepository", "Lcom/sugarcube/app/base/DeviceCompatibility;", "T", "Lcom/sugarcube/app/base/DeviceCompatibility;", "getDeviceCompatibility", "()Lcom/sugarcube/app/base/DeviceCompatibility;", "setDeviceCompatibility", "(Lcom/sugarcube/app/base/DeviceCompatibility;)V", "deviceCompatibility", "LUE/a;", "U", "LUE/a;", "getDeeplinks", "()LUE/a;", "setDeeplinks", "(LUE/a;)V", "deeplinks", "K0", "()LQE/A;", "binding", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GalleryLandingFragment2 extends Hilt_GalleryLandingFragment2 {

    /* renamed from: O  reason: collision with root package name */
    private C13420A f124427O;

    /* renamed from: P  reason: collision with root package name */
    private final C16824o f124428P;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f124429Q;

    /* renamed from: R  reason: collision with root package name */
    public AccountInteractions f124430R;

    /* renamed from: S  reason: collision with root package name */
    public ConfigRepository f124431S;

    /* renamed from: T  reason: collision with root package name */
    public DeviceCompatibility f124432T;

    /* renamed from: U  reason: collision with root package name */
    public C13733a f124433U;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryLandingFragment2 f124434a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2$a$a  reason: collision with other inner class name */
        static final class C3057a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GalleryLandingFragment2 f124435a;

            C3057a(GalleryLandingFragment2 galleryLandingFragment2) {
                this.f124435a = galleryLandingFragment2;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(GalleryLandingFragment2 galleryLandingFragment2) {
                galleryLandingFragment2.M0().U();
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(GalleryLandingFragment2 galleryLandingFragment2) {
                galleryLandingFragment2.M0().T();
                return C16807N.f139792a;
            }

            public final void c(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(143145252, i10, -1, "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryLandingFragment.kt:129)");
                    }
                    F<v<Uri, Uri>> R10 = this.f124435a.M0().R();
                    mVar.W(1097561304);
                    boolean F10 = mVar.F(this.f124435a);
                    GalleryLandingFragment2 galleryLandingFragment2 = this.f124435a;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new b(galleryLandingFragment2);
                        mVar.u(D10);
                    }
                    C17631a aVar = (C17631a) D10;
                    mVar.P();
                    mVar.W(1097563513);
                    boolean F11 = mVar.F(this.f124435a);
                    GalleryLandingFragment2 galleryLandingFragment22 = this.f124435a;
                    Object D11 = mVar.D();
                    if (F11 || D11 == C4889m.f14007a.a()) {
                        D11 = new c(galleryLandingFragment22);
                        mVar.u(D11);
                    }
                    mVar.P();
                    C12705e.e(R10, aVar, (C17631a) D11, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        a(GalleryLandingFragment2 galleryLandingFragment2) {
            this.f124434a = galleryLandingFragment2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2096520994, i10, -1, "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryLandingFragment.kt:128)");
                }
                Z.g(C5607m.a(mVar, 0), (C4820m) null, c1.c.e(143145252, true, new C3057a(this.f124434a), mVar, 54), mVar, 384, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124436a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124436a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124436a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124436a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2$setupNavigation$1$1", f = "GalleryLandingFragment.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124437c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GalleryLandingFragment2 f124438d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f124439e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(GalleryLandingFragment2 galleryLandingFragment2, a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f124438d = galleryLandingFragment2;
            this.f124439e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f124438d, this.f124439e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f124437c == 0) {
                y.b(obj);
                C8951o a10 = androidx.navigation.fragment.a.a(this.f124438d);
                a aVar = this.f124439e;
                if (C17542s.e(aVar, a.c.f124455a)) {
                    AccountInteractions J02 = this.f124438d.J0();
                    C5191t requireActivity = this.f124438d.requireActivity();
                    C17542s.i(requireActivity, "requireActivity(...)");
                    J02.navigateLogin(requireActivity);
                } else if (C17542s.e(aVar, a.d.f124456a)) {
                    AccountInteractions J03 = this.f124438d.J0();
                    C5191t requireActivity2 = this.f124438d.requireActivity();
                    C17542s.i(requireActivity2, "requireActivity(...)");
                    J03.navigateSignup(requireActivity2);
                } else if (aVar instanceof a.C3058a) {
                    this.f124438d.N0(a10, ((a.C3058a) this.f124439e).a());
                } else if (C17542s.e(aVar, a.b.f124454a)) {
                    this.f124438d.O0(a10);
                } else {
                    throw new t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f124440a;

        public d(C5187o oVar) {
            this.f124440a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f124440a);
            int g10 = j.g(Kreativ.INSTANCE.serializer());
            Class<Kreativ> cls = Kreativ.class;
            if (C8951o.A(a10, a10.L(), g10, true, (x4.v) null, 4, (Object) null) != null) {
                List value = a10.G().getValue();
                ListIterator listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((C8948l) obj).e().x() == g10) {
                        break;
                    }
                }
                C8948l lVar = (C8948l) obj;
                if (lVar != null) {
                    return lVar;
                }
                throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124441c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f124441c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f124441c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124442c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar) {
            super(0);
            this.f124442c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f124442c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f124443c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C16824o oVar) {
            super(0);
            this.f124443c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f124443c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124444c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f124445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar, C16824o oVar) {
            super(0);
            this.f124444c = aVar;
            this.f124445d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f124444c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f124445d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124446c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f124447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f124446c = oVar;
            this.f124447d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f124447d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f124446c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public GalleryLandingFragment2() {
        C16824o b10 = C16825p.b(new d(this));
        this.f124428P = W.b(this, P.b(C12754C.class), new C14045g(b10), new C14043e(b10), new C14044f(this, b10));
        C16824o a10 = C16825p.a(s.NONE, new f(new e(this)));
        this.f124429Q = W.b(this, P.b(d.class), new g(a10), new h((C17631a) null, a10), new i(this, a10));
    }

    private final C13420A K0() {
        C13420A a10 = this.f124427O;
        C17542s.g(a10);
        return a10;
    }

    private final C12754C L0() {
        return (C12754C) this.f124428P.getValue();
    }

    /* access modifiers changed from: private */
    public final d M0() {
        return (d) this.f124429Q.getValue();
    }

    /* access modifiers changed from: private */
    public final void N0(C8951o oVar, boolean z10) {
        h.c cVar = h.c.f124419e;
        com.sugarcube.app.base.ui.gallery.a.b(cVar);
        Kreativ.Gallery.Home home = new Kreativ.Gallery.Home(cVar.b());
        C.a aVar = new C.a();
        aVar.j(P.b(Kreativ.class), false, false);
        C8951o.f0(oVar, home, aVar.a(), (I.a) null, 4, (Object) null);
        if (z10) {
            C14039a.a(oVar, C13959W.f118791a.b().a());
        }
    }

    /* access modifiers changed from: private */
    public final void O0(C8951o oVar) {
        h.d dVar = h.d.f124420e;
        com.sugarcube.app.base.ui.gallery.a.b(dVar);
        Kreativ.Gallery.Home home = new Kreativ.Gallery.Home(dVar.b());
        C.a aVar = new C.a();
        aVar.j(P.b(Kreativ.class), false, false);
        C8951o.f0(oVar, home, aVar.a(), (I.a) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void P0(GalleryLandingFragment2 galleryLandingFragment2, View view) {
        C5191t activity = galleryLandingFragment2.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(GalleryLandingFragment2 galleryLandingFragment2, Boolean bool) {
        if (bool.booleanValue()) {
            galleryLandingFragment2.M0().a0();
            C8951o a10 = androidx.navigation.fragment.a.a(galleryLandingFragment2);
            Kreativ.a aVar = Kreativ.a.INSTANCE;
            C.a a11 = C13959W.f118791a.a();
            a11.j(P.b(Kreativ.Gallery.class), true, false);
            C8951o.f0(a10, aVar, a11.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(C13420A a10, Boolean bool) {
        ConstraintLayout constraintLayout = a10.f114318h;
        C17542s.i(constraintLayout, "loginLayout");
        constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void S0(GalleryLandingFragment2 galleryLandingFragment2, View view) {
        galleryLandingFragment2.M0().X();
    }

    /* access modifiers changed from: private */
    public static final void T0(GalleryLandingFragment2 galleryLandingFragment2, View view) {
        galleryLandingFragment2.M0().V();
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(C13420A a10, GalleryLandingFragment2 galleryLandingFragment2, Boolean bool) {
        ScrollView scrollView = a10.f114314d;
        C17542s.i(scrollView, "galleryLandingScrollView");
        int i10 = 8;
        scrollView.setVisibility(bool.booleanValue() ? 0 : 8);
        BouncingBallView bouncingBallView = a10.f114316f;
        C17542s.i(bouncingBallView, "loading");
        if (!bool.booleanValue()) {
            i10 = 0;
        }
        bouncingBallView.setVisibility(i10);
        if (bool.booleanValue()) {
            ComposeView composeView = a10.f114313c;
            composeView.setViewCompositionStrategy(s1.d.f19581b);
            composeView.setContent(c1.c.c(2096520994, true, new a(galleryLandingFragment2)));
        }
        return C16807N.f139792a;
    }

    private final void V0() {
        L0().A1().observe(getViewLifecycleOwner(), new b(new C12719s(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(GalleryLandingFragment2 galleryLandingFragment2, Boolean bool) {
        if (bool.booleanValue()) {
            galleryLandingFragment2.L0().L2(false);
            C8951o a10 = androidx.navigation.fragment.a.a(galleryLandingFragment2);
            Kreativ.a aVar = Kreativ.a.INSTANCE;
            C.a a11 = C13959W.f118791a.a();
            a11.j(P.b(Kreativ.Gallery.class), true, false);
            C8951o.f0(a10, aVar, a11.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    private final void X0() {
        TextView textView = K0().f114315e.f114494b;
        String string = getString(n.f113357e5, C13760b.f117438d.h(q0().getCountry(), q0().getLanguage()), getString(n.f113454s4));
        C17542s.i(string, "getString(...)");
        textView.setText(Html.fromHtml(getString(n.f113322Z4, string), 0));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setOnClickListener(new C12710j(this));
    }

    /* access modifiers changed from: private */
    public static final void Y0(GalleryLandingFragment2 galleryLandingFragment2, View view) {
        galleryLandingFragment2.q0().b().galleryKreativMarketingHelp();
    }

    private final void Z0() {
        e0.a(M0().O()).observe(getViewLifecycleOwner(), new b(new C12718r(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N a1(GalleryLandingFragment2 galleryLandingFragment2, a aVar) {
        if (aVar == null) {
            return C16807N.f139792a;
        }
        galleryLandingFragment2.M0().O().setValue(null);
        F0 unused = C16314k.d(C5222z.a(galleryLandingFragment2), (C17168i) null, (T) null, new c(galleryLandingFragment2, aVar, (C17164e<? super c>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    private final void b1() {
        L0().E1().observe(getViewLifecycleOwner(), new b(new C12717q(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N c1(GalleryLandingFragment2 galleryLandingFragment2, Boolean bool) {
        if (bool.booleanValue()) {
            galleryLandingFragment2.L0().M2(false);
            C8951o a10 = androidx.navigation.fragment.a.a(galleryLandingFragment2);
            Kreativ.d dVar = Kreativ.d.INSTANCE;
            C.a a11 = C13959W.f118791a.a();
            a11.j(P.b(Kreativ.Gallery.class), true, false);
            C8951o.f0(a10, dVar, a11.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    private final void d1() {
        L0().G1().observe(getViewLifecycleOwner(), new b(new C12716p(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N e1(GalleryLandingFragment2 galleryLandingFragment2, Boolean bool) {
        if (bool.booleanValue()) {
            galleryLandingFragment2.L0().O2(false);
            C8951o a10 = androidx.navigation.fragment.a.a(galleryLandingFragment2);
            Kreativ.e eVar = Kreativ.e.INSTANCE;
            C.a a11 = C13959W.f118791a.a();
            a11.j(P.b(Kreativ.Gallery.class), true, false);
            C8951o.f0(a10, eVar, a11.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    public final AccountInteractions J0() {
        AccountInteractions accountInteractions = this.f124430R;
        if (accountInteractions != null) {
            return accountInteractions;
        }
        C17542s.z("accountInteractions");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r7 = r7.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r7 = "inflater"
            kotlin.jvm.internal.C17542s.j(r5, r7)
            com.sugarcube.app.base.ui.gallery.landing.d r7 = r4.M0()
            DF.C r0 = r4.L0()
            r7.Z(r0)
            android.os.Bundle r7 = r4.getArguments()
            r0 = 0
            r1 = 0
            if (r7 == 0) goto L_0x0029
            java.util.Set r7 = r7.keySet()
            if (r7 == 0) goto L_0x0029
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r7 = r7.toArray(r2)
            java.lang.String[] r7 = (java.lang.String[]) r7
            goto L_0x002a
        L_0x0029:
            r7 = r0
        L_0x002a:
            java.lang.String r7 = java.util.Arrays.toString(r7)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r7, r2)
            android.os.Bundle r2 = r4.getArguments()
            if (r2 == 0) goto L_0x003d
            java.lang.String r0 = r2.toString()
        L_0x003d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n                GalleryLandingFragment.arguments\n                "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = "\n                "
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = "\n            "
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String r0 = "Sugarcube"
            android.util.Log.d(r0, r7)
            QE.A r5 = QE.C13420A.c(r5, r6, r1)
            r4.f124427O = r5
            QE.A r5 = r4.K0()
            QE.d r6 = r5.f114312b
            com.google.android.material.appbar.MaterialToolbar r6 = r6.f114550c
            int r7 = OE.n.f113476v5
            r6.setTitle((int) r7)
            CF.i r7 = new CF.i
            r7.<init>(r4)
            r6.setNavigationOnClickListener(r7)
            com.sugarcube.app.base.ui.utils.BouncingBallView r6 = r5.f114316f
            r6.setVisibility(r1)
            r6.b()
            r7 = 0
            r6.setAlpha(r7)
            android.view.ViewPropertyAnimator r6 = r6.animate()
            r0 = 800(0x320, double:3.953E-321)
            android.view.ViewPropertyAnimator r6 = r6.setStartDelay(r0)
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
            r6.start()
            com.sugarcube.app.base.ui.gallery.landing.d r6 = r4.M0()
            androidx.lifecycle.F r6 = r6.P()
            androidx.lifecycle.y r7 = r4.getViewLifecycleOwner()
            CF.k r0 = new CF.k
            r0.<init>(r5)
            com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2$b r1 = new com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2$b
            r1.<init>(r0)
            r6.observe(r7, r1)
            r4.X0()
            com.google.android.material.button.MaterialButton r6 = r5.f114320j
            CF.l r7 = new CF.l
            r7.<init>(r4)
            r6.setOnClickListener(r7)
            com.google.android.material.button.MaterialButton r6 = r5.f114319i
            CF.m r7 = new CF.m
            r7.<init>(r4)
            r6.setOnClickListener(r7)
            com.sugarcube.app.base.ui.gallery.landing.d r6 = r4.M0()
            androidx.lifecycle.F r6 = r6.N()
            androidx.lifecycle.y r7 = r4.getViewLifecycleOwner()
            CF.n r0 = new CF.n
            r0.<init>(r5, r4)
            com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2$b r5 = new com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2$b
            r5.<init>(r0)
            r6.observe(r7, r5)
            com.sugarcube.app.base.ui.gallery.landing.d r5 = r4.M0()
            androidx.lifecycle.F r5 = r5.Q()
            androidx.lifecycle.y r6 = r4.getViewLifecycleOwner()
            CF.o r7 = new CF.o
            r7.<init>(r4)
            com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2$b r0 = new com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2$b
            r0.<init>(r7)
            r5.observe(r6, r0)
            r4.d1()
            r4.b1()
            r4.V0()
            r4.Z0()
            com.sugarcube.app.base.ui.gallery.landing.d r5 = r4.M0()
            r5.Y()
            QE.A r5 = r4.K0()
            android.widget.LinearLayout r5 = r5.getRoot()
            java.lang.String r6 = "getRoot(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f124427O = null;
    }
}
