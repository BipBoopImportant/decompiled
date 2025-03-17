package com.ingka.ikea.app.auth.legal;

import Ar.j;
import IC.C13023e;
import IC.C13026h;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13589g1;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import cf.C9460A;
import cf.C9461B;
import cf.C9462C;
import cf.C9463D;
import cf.C9464a;
import cf.C9465b;
import cf.C9466c;
import cf.C9467d;
import cf.C9468e;
import cf.C9469f;
import cf.E;
import cf.F;
import cf.h;
import cf.k;
import cf.m;
import cf.p;
import cf.v;
import cf.w;
import cf.x;
import cf.z;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import df.C9623a;
import df.C9624b;
import eI.C17187b;
import g.C5312a;
import g.C5314c;
import h.C5406d;
import java.util.ArrayList;
import java.util.List;
import kf.C9977a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import vl.n;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0000@\u0000X.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010C\u001a\u00020>8\u0016XD¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010G\u001a\u00020>8TX\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010BR\u001a\u0010M\u001a\u00020H8\u0014XD¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0002¢\u0006\f\n\u0004\bO\u0010E\u001a\u0004\bP\u0010QR\"\u0010W\u001a\u0010\u0012\f\u0012\n U*\u0004\u0018\u00010T0T0S8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010VR\u001a\u0010[\u001a\u00020>*\u0004\u0018\u00010X8BX\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lcom/ingka/ikea/app/auth/legal/AboutFragment;", "Lcom/ingka/ikea/app/auth/AuthDelegateFragment;", "<init>", "()V", "LXH/N;", "u1", "s1", "Lcf/l;", "section", "", "i1", "(Lcf/l;)Ljava/lang/Object;", "Lcf/m;", "Lvl/n$b;", "j1", "(Lcf/m;)Lvl/n$b;", "Lcf/n;", "m1", "(Lcf/n;)Lvl/n$b;", "o1", "Lkf/a;", "error", "w1", "(Lkf/a;)V", "q1", "Lg/a;", "result", "h1", "(Lg/a;)V", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LEo/a;", "z0", "LEo/a;", "c1", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LAr/j;", "A0", "LAr/j;", "e1", "()LAr/j;", "setFeedback$profile_implementation_release", "(LAr/j;)V", "feedback", "LCx/a;", "B0", "LCx/a;", "f1", "()LCx/a;", "setPublisherAuthManager$profile_implementation_release", "(LCx/a;)V", "publisherAuthManager", "", "C0", "Ljava/lang/String;", "d1", "()Ljava/lang/String;", "destId", "D0", "LXH/o;", "L0", "pageTitle", "", "E0", "Z", "H0", "()Z", "excludeLastItemDecoration", "Lcf/p;", "F0", "g1", "()Lcf/p;", "viewModel", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Lg/c;", "authorizationResultLauncher", "Landroid/content/Context;", "b1", "(Landroid/content/Context;)Ljava/lang/String;", "appVersionName", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AboutFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public j f70050A0;

    /* renamed from: B0  reason: collision with root package name */
    public Cx.a f70051B0;

    /* renamed from: C0  reason: collision with root package name */
    private final String f70052C0 = "about";

    /* renamed from: D0  reason: collision with root package name */
    private final C16824o f70053D0 = C16825p.b(new cf.g(this));

    /* renamed from: E0  reason: collision with root package name */
    private final boolean f70054E0 = true;

    /* renamed from: F0  reason: collision with root package name */
    private final C16824o f70055F0;
    /* access modifiers changed from: private */

    /* renamed from: G0  reason: collision with root package name */
    public final C5314c<Intent> f70056G0;

    /* renamed from: z0  reason: collision with root package name */
    public Eo.a f70057z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, p.class, "onVersionClicked", "onVersionClicked()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((p) this.receiver).K();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.auth.legal.AboutFragment$observeUiState$$inlined$collectOnStarted$1", f = "AboutFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements nI.p<E, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f70058c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f70059d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AboutFragment f70060e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, AboutFragment aboutFragment) {
            super(2, eVar);
            this.f70060e = aboutFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar, this.f70060e);
            bVar.f70059d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(E e10, C17164e<? super C16807N> eVar) {
            return ((b) create(e10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f70058c == 0) {
                y.b(obj);
                E e10 = (E) this.f70059d;
                if (e10.d() != null) {
                    Toast.makeText(this.f70060e.getContext(), e10.d(), 1).show();
                    this.f70060e.g1().J();
                }
                if (e10.c()) {
                    this.f70060e.f70056G0.a(this.f70060e.f1().a());
                    this.f70060e.g1().I();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70061c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f70061c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f70061c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70062c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f70062c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f70062c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f70063c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f70063c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f70063c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70064c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f70064c = aVar;
            this.f70065d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f70064c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f70065d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70066c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f70066c = oVar;
            this.f70067d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f70067d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f70066c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public AboutFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f70055F0 = W.b(this, P.b(p.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
        C5314c<Intent> registerForActivityResult = registerForActivityResult(new C5406d(), new h(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f70056G0 = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public static final void a1(AboutFragment aboutFragment, C5312a aVar) {
        C17542s.j(aVar, "result");
        aboutFragment.h1(aVar);
    }

    private final String b1(Context context) {
        if (context == null) {
            return "";
        }
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        String str = packageInfo.versionName;
        int i10 = packageInfo.versionCode;
        return str + "  (" + i10 + ")";
    }

    /* access modifiers changed from: private */
    public final p g1() {
        return (p) this.f70055F0.getValue();
    }

    private final void h1(C5312a aVar) {
        Intent a10 = aVar.a();
        if (a10 != null) {
            f1().b(a10);
        }
    }

    private final Object i1(cf.l lVar) {
        cf.l lVar2 = lVar;
        if (lVar2 instanceof F) {
            return new n.b("version", (String) null, C13589g1.Large, false, new a(g1()), (C17631a) null, C13026h.a(((F) lVar2).b()), C13026h.c(b1(getContext())), (C13573c1) null, (C13569b1) null, false, (nI.p) null, 3882, (DefaultConstructorMarker) null);
        } else if (lVar2 instanceof v) {
            String string = getString(((v) lVar2).b());
            C17542s.i(string, "getString(...)");
            return new C9624b(string);
        } else {
            throw new t();
        }
    }

    private final n.b j1(m mVar) {
        m mVar2 = mVar;
        if ((mVar2 instanceof w) || (mVar2 instanceof cf.y) || (mVar2 instanceof x) || (mVar2 instanceof C9461B) || (mVar2 instanceof C9463D) || (mVar2 instanceof z)) {
            return new n.b(mVar.c() + mVar.b(), (String) null, C13589g1.Large, false, new C9465b(this, mVar2), (C17631a) null, C13026h.c(mVar.b()), (C13023e) null, (C13573c1) null, C13569b1.f.f116152b, false, (nI.p) null, 3498, (DefaultConstructorMarker) null);
        } else if (mVar2 instanceof C9462C) {
            C9462C c10 = (C9462C) mVar2;
            return new n.b(c10.c() + c10.b(), (String) null, C13589g1.Large, false, new C9466c(this, mVar2), (C17631a) null, C13026h.c(c10.b()), (C13023e) null, (C13573c1) null, C13569b1.f.f116152b, false, (nI.p) null, 3498, (DefaultConstructorMarker) null);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k1(AboutFragment aboutFragment, m mVar) {
        aboutFragment.g1().L(mVar.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l1(AboutFragment aboutFragment, m mVar) {
        aboutFragment.g1().L(((C9462C) mVar).c());
        return C16807N.f139792a;
    }

    private final n.b m1(cf.n nVar) {
        cf.n nVar2 = nVar;
        if (nVar2 instanceof C9460A) {
            C9460A a10 = (C9460A) nVar2;
            String c10 = a10.c();
            int b10 = a10.b();
            return new n.b(c10 + b10, (String) null, C13589g1.Large, false, new C9464a(this), (C17631a) null, C13026h.a(a10.b()), (C13023e) null, (C13573c1) null, C13569b1.d.f116148b, false, (nI.p) null, 3498, (DefaultConstructorMarker) null);
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final C16807N n1(AboutFragment aboutFragment) {
        C8951o f10 = rw.f.f(aboutFragment, aboutFragment.d1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C8951o.g0(f10, "open_source_disclaimer", (C) null, (I.a) null, 6, (Object) null);
        }
        return C16807N.f139792a;
    }

    private final void o1() {
        androidx.lifecycle.F<C9977a> F10 = g1().F();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(F10, viewLifecycleOwner, new C9469f(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N p1(AboutFragment aboutFragment, C9977a aVar) {
        C17542s.j(aVar, UiComponentContainer.RESULT_ERROR);
        if (aVar instanceof C9977a.C1360a) {
            aboutFragment.w1(aVar);
        } else if (aVar instanceof C9977a.b) {
            aboutFragment.w1(aVar);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    private final void q1() {
        androidx.lifecycle.F<String> G10 = g1().G();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(G10, viewLifecycleOwner, new C9467d(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N r1(AboutFragment aboutFragment, String str) {
        C17542s.j(str, "url");
        aboutFragment.c1().a(aboutFragment.getContext(), str);
        return C16807N.f139792a;
    }

    private final void s1() {
        androidx.lifecycle.F<List<k>> H10 = g1().H();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(H10, viewLifecycleOwner, new C9468e(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N t1(AboutFragment aboutFragment, List list) {
        Object obj;
        C17542s.j(list, "sections");
        Iterable<k> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (k kVar : iterable) {
            if (kVar instanceof cf.l) {
                obj = aboutFragment.i1((cf.l) kVar);
            } else if (kVar instanceof cf.n) {
                obj = aboutFragment.m1((cf.n) kVar);
            } else if (kVar instanceof m) {
                obj = aboutFragment.j1((m) kVar);
            } else {
                throw new t();
            }
            arrayList.add(obj);
        }
        Lg.d.q(aboutFragment.I0(), arrayList, false, (C17642l) null, 6, (Object) null);
        aboutFragment.K0().setVisibility(8);
        return C16807N.f139792a;
    }

    private final void u1() {
        C16532g R10 = C16534i.R(C5208k.b(g1().m(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new b((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    public static final String v1(AboutFragment aboutFragment) {
        return aboutFragment.getString(We.c.f64739u);
    }

    private final void w1(C9977a aVar) {
        j e12 = e1();
        Context context = getContext();
        String string = getString(aVar.b());
        C17542s.i(string, "getString(...)");
        j.a.k(e12, context, string, getString(aVar.a()), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new vl.m(), new C9623a()});
    }

    /* access modifiers changed from: protected */
    public boolean H0() {
        return this.f70054E0;
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f70053D0.getValue();
    }

    public final Eo.a c1() {
        Eo.a aVar = this.f70057z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public String d1() {
        return this.f70052C0;
    }

    public final j e1() {
        j jVar = this.f70050A0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Cx.a f1() {
        Cx.a aVar = this.f70051B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("publisherAuthManager");
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        s1();
        o1();
        q1();
        u1();
    }
}
