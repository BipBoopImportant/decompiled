package com.ingka.ikea.account.impl.modalsettings;

import Ae.h;
import Ar.j;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Rd.a;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13589g1;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.RecyclerView;
import cl.C11144a;
import com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import dl.C11207l;
import eI.C17187b;
import g.C5314c;
import ge.C9727a;
import ip.C11410b;
import ip.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lg.C10025b;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import u2.C6012a;
import vl.m;
import vl.n;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0001qB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0003J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010Q\u001a\u00020K8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010W\u001a\u00020R8TX\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010Z\u001a\u00020R8\u0006XD¢\u0006\f\n\u0004\b\f\u0010X\u001a\u0004\bY\u0010VR\u001a\u0010^\u001a\u00020 8\u0014XD¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0002¢\u0006\f\n\u0004\b`\u0010T\u001a\u0004\ba\u0010bR\"\u0010i\u001a\u0010\u0012\f\u0012\n f*\u0004\u0018\u00010e0e0d8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001c\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010kR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010kR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010k¨\u0006r"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/AccountFragment;", "Lcom/ingka/ikea/app/uicomponents/fragment/DelegateFragment;", "<init>", "()V", "LXH/N;", "t1", "z1", "Lkotlin/Function0;", "navBlock", "q1", "(LnI/a;)V", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "E0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "N0", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LAe/e;", "z0", "LAe/e;", "getAnalytics", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LaA/a;", "A0", "LaA/a;", "m1", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "LIl/a;", "B0", "LIl/a;", "getAppConfigApi", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "LTd/a;", "C0", "LTd/a;", "j1", "()LTd/a;", "setAccountAnalytics", "(LTd/a;)V", "accountAnalytics", "LRd/a;", "D0", "LRd/a;", "k1", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "LAr/j;", "LAr/j;", "l1", "()LAr/j;", "setFeedback$account_implementation_release", "(LAr/j;)V", "feedback", "", "F0", "LXH/o;", "L0", "()Ljava/lang/String;", "pageTitle", "Ljava/lang/String;", "getDestId", "destId", "H0", "Z", "()Z", "excludeLastItemDecoration", "Lcom/ingka/ikea/account/impl/modalsettings/v;", "I0", "n1", "()Lcom/ingka/ikea/account/impl/modalsettings/v;", "viewModel", "Lg/c;", "Lcom/ingka/ikea/account/impl/modalsettings/C;", "kotlin.jvm.PlatformType", "J0", "Lg/c;", "hostedRedirect", "K0", "LnI/a;", "editAddress", "editProfile", "M0", "changePassword", "deleteProfile", "a", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccountFragment extends z {

    /* renamed from: A0  reason: collision with root package name */
    public C13909a f69552A0;

    /* renamed from: B0  reason: collision with root package name */
    public Il.a f69553B0;

    /* renamed from: C0  reason: collision with root package name */
    public Td.a f69554C0;

    /* renamed from: D0  reason: collision with root package name */
    public Rd.a f69555D0;

    /* renamed from: E0  reason: collision with root package name */
    public j f69556E0;

    /* renamed from: F0  reason: collision with root package name */
    private final C16824o f69557F0 = C16825p.b(new C9598f(this));

    /* renamed from: G0  reason: collision with root package name */
    private final String f69558G0 = "profile/account/page";

    /* renamed from: H0  reason: collision with root package name */
    private final boolean f69559H0 = true;

    /* renamed from: I0  reason: collision with root package name */
    private final C16824o f69560I0;
    /* access modifiers changed from: private */

    /* renamed from: J0  reason: collision with root package name */
    public final C5314c<C> f69561J0;

    /* renamed from: K0  reason: collision with root package name */
    private final C17631a<C16807N> f69562K0;

    /* renamed from: L0  reason: collision with root package name */
    private final C17631a<C16807N> f69563L0;

    /* renamed from: M0  reason: collision with root package name */
    private final C17631a<C16807N> f69564M0;

    /* renamed from: N0  reason: collision with root package name */
    private final C17631a<C16807N> f69565N0;

    /* renamed from: z0  reason: collision with root package name */
    public Ae.e f69566z0;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/AccountFragment$a;", "Lkotlin/Function1;", "Lip/k;", "", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "useCase", "<init>", "(Lcom/ingka/ikea/account/impl/modalsettings/AccountFragment;Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;)V", "resource", "a", "(Lip/k;)V", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "getUseCase", "()Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements C17642l<k<String, l>, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        private final HostedRedirectActivity.Companion.RedirectUseCase f69567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AccountFragment f69568b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.account.impl.modalsettings.AccountFragment$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1197a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f69569a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    ip.k$e[] r0 = ip.k.e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ip.k$e r1 = ip.k.e.LOADING     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ip.k$e r1 = ip.k.e.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f69569a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.AccountFragment.a.C1197a.<clinit>():void");
            }
        }

        public a(AccountFragment accountFragment, HostedRedirectActivity.Companion.RedirectUseCase redirectUseCase) {
            C17542s.j(redirectUseCase, "useCase");
            this.f69568b = accountFragment;
            this.f69567a = redirectUseCase;
        }

        public void a(k<String, l> kVar) {
            C17542s.j(kVar, "resource");
            int i10 = C1197a.f69569a[kVar.c().ordinal()];
            if (i10 == 1) {
                return;
            }
            if (i10 != 2) {
                j.a.j(this.f69568b.l1(), this.f69568b.requireContext(), Oo.b.f84321A3, (Integer) null, false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 508, (Object) null);
                return;
            }
            String a10 = kVar.a();
            if (a10 != null) {
                this.f69568b.f69561J0.a(new C(a10, this.f69567a));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("No url to open for use case: " + this.f69567a);
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 != null) {
                        str = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f69570a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase[] r0 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_PHONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_EMAIL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_PASSWORD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.DELETE_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f69570a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.AccountFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.account.impl.modalsettings.AccountFragment$logout$2", f = "AccountFragment.kt", l = {289}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f69571c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AccountFragment f69572d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f69573e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AccountFragment accountFragment, C17631a<C16807N> aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f69572d = accountFragment;
            this.f69573e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f69572d, this.f69573e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f69571c;
            if (i10 == 0) {
                y.b(obj);
                this.f69572d.j1().d(kotlin.coroutines.jvm.internal.b.a(this.f69572d.m1().i()));
                C13909a m12 = this.f69572d.m1();
                this.f69571c = 1;
                if (C13909a.C2951a.a(m12, false, false, this, 3, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f69573e.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69574c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f69574c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f69574c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69575c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f69575c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f69575c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f69576c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f69576c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f69576c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69577c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f69577c = aVar;
            this.f69578d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f69577c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f69578d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f69579c = oVar;
            this.f69580d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f69580d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f69579c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public AccountFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f69560I0 = W.b(this, P.b(v.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
        C5314c<C> registerForActivityResult = registerForActivityResult(new HostedRedirectActivity.Companion.a(), new g(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f69561J0 = registerForActivityResult;
        this.f69562K0 = new h(this);
        this.f69563L0 = new i(this);
        this.f69564M0 = new j(this);
        this.f69565N0 = new k(this);
    }

    /* access modifiers changed from: private */
    public static final C16807N A1(AccountFragment accountFragment) {
        r1(accountFragment, (C17631a) null, 1, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String B1(AccountFragment accountFragment) {
        return accountFragment.getString(Sd.f.f63382v);
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(AccountFragment accountFragment) {
        h.a.a(accountFragment.j1(), Td.b.CHANGE_PASSWORD_BEGIN, (Map) null, 2, (Object) null);
        C11410b<k<String, l>> E10 = accountFragment.n1().E();
        C5221y viewLifecycleOwner = accountFragment.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(E10, viewLifecycleOwner, new a(accountFragment, HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_PASSWORD));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g1(AccountFragment accountFragment) {
        C11410b<k<String, l>> F10 = accountFragment.n1().F();
        C5221y viewLifecycleOwner = accountFragment.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(F10, viewLifecycleOwner, new a(accountFragment, HostedRedirectActivity.Companion.RedirectUseCase.DELETE_ACCOUNT));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h1(AccountFragment accountFragment) {
        C8951o f10 = rw.f.f(accountFragment, accountFragment.f69558G0, (C17642l) null, 2, (Object) null);
        if (f10 == null) {
            return null;
        }
        C8951o.g0(f10, "profile/account/address_list", (C) null, (I.a) null, 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(AccountFragment accountFragment) {
        C8951o f10 = rw.f.f(accountFragment, accountFragment.f69558G0, (C17642l) null, 2, (Object) null);
        if (f10 == null) {
            return null;
        }
        a.C1079a.a(accountFragment.k1(), f10, (C) null, 2, (Object) null);
        return C16807N.f139792a;
    }

    private final v n1() {
        return (v) this.f69560I0.getValue();
    }

    /* access modifiers changed from: private */
    public static final void o1(AccountFragment accountFragment, HostedRedirectActivity.Companion.b bVar) {
        if (bVar == null) {
            return;
        }
        if (bVar instanceof HostedRedirectActivity.Companion.b.C1198b) {
            int i10 = b.f69570a[((HostedRedirectActivity.Companion.b.C1198b) bVar).a().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    accountFragment.q1(new C9597e(accountFragment));
                    return;
                }
                throw new t();
            }
        } else if (!(bVar instanceof HostedRedirectActivity.Companion.b.a)) {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p1(AccountFragment accountFragment) {
        C8951o f10 = rw.f.f(accountFragment, accountFragment.f69558G0, (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            accountFragment.k1().a(f10, true);
        }
        return C16807N.f139792a;
    }

    private final void q1(C17631a<C16807N> aVar) {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new c(this, aVar, (C17164e<? super c>) null), 3, (Object) null);
    }

    static /* synthetic */ void r1(AccountFragment accountFragment, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new m(accountFragment);
        }
        accountFragment.q1(aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N s1(AccountFragment accountFragment) {
        C8951o f10 = rw.f.f(accountFragment, accountFragment.f69558G0, (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
        return C16807N.f139792a;
    }

    private final void t1() {
        F<List<C9727a>> G10 = n1().G();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(G10, viewLifecycleOwner, new l(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N u1(AccountFragment accountFragment, List list) {
        n.b bVar;
        AccountFragment accountFragment2 = accountFragment;
        List list2 = list;
        C17542s.j(list2, "sections");
        Iterable<C9727a> iterable = list2;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C9727a aVar : iterable) {
            if (aVar instanceof C9727a.C1272a) {
                C13023e a10 = C13026h.a(aVar.b());
                bVar = new n.b("edit_address", (String) null, C13589g1.Large, aVar.c(), new n(accountFragment2), (C17631a) null, a10, (C13023e) null, (C13573c1) null, C13569b1.d.f116148b, false, (p) null, 3490, (DefaultConstructorMarker) null);
            } else if (aVar instanceof C9727a.d) {
                C13023e a11 = C13026h.a(aVar.b());
                bVar = new n.b("edit_profile", (String) null, C13589g1.Large, aVar.c(), new C9594b(accountFragment2), (C17631a) null, a11, (C13023e) null, (C13573c1) null, C13569b1.d.f116148b, false, (p) null, 3490, (DefaultConstructorMarker) null);
            } else if (aVar instanceof C9727a.b) {
                C13023e a12 = C13026h.a(aVar.b());
                bVar = new n.b("change_password", (String) null, C13589g1.Large, aVar.c(), new C9595c(accountFragment2), (C17631a) null, a12, (C13023e) null, (C13573c1) null, C13569b1.d.f116148b, false, (p) null, 3490, (DefaultConstructorMarker) null);
            } else if (aVar instanceof C9727a.c) {
                C13023e a13 = C13026h.a(aVar.b());
                bVar = new n.b("delete_profile", (String) null, C13589g1.Large, aVar.c(), new C9596d(accountFragment2), (C17631a) null, a13, (C13023e) null, (C13573c1) null, C13569b1.d.f116148b, false, (p) null, 3490, (DefaultConstructorMarker) null);
            } else {
                throw new t();
            }
            arrayList.add(bVar);
        }
        Lg.d.q(accountFragment.I0(), arrayList, false, (C17642l) null, 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v1(AccountFragment accountFragment) {
        accountFragment.f69563L0.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w1(AccountFragment accountFragment) {
        accountFragment.f69564M0.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x1(AccountFragment accountFragment) {
        accountFragment.f69565N0.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y1(AccountFragment accountFragment) {
        accountFragment.f69562K0.invoke();
        return C16807N.f139792a;
    }

    private final void z1() {
        C5191t activity = getActivity();
        if (activity != null) {
            j.a.j(l1(), activity, Oo.b.f84854z4, Integer.valueOf(Sd.f.f63381u), false, Oo.b.f84854z4, new C9593a(this), getString(Oo.b.f84518U0), (C17631a) null, (C17631a) null, 392, (Object) null);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Not attached to activity onClick, what did you do?");
        qv.e eVar = qv.e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            if (str2 == null) {
                String name = AccountFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            bVar.a(eVar, str2, false, illegalStateException, str);
        }
    }

    /* access modifiers changed from: protected */
    public void E0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
        recyclerView.j(new C11144a(0, C6012a.c(recyclerView.getContext(), C10025b.f75261c), true, false, 9, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    public Lg.d G0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new m(), new C11207l(Sd.d.f63353e)});
    }

    /* access modifiers changed from: protected */
    public boolean H0() {
        return this.f69559H0;
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f69557F0.getValue();
    }

    /* access modifiers changed from: protected */
    public void N0() {
        androidx.navigation.fragment.a.a(this).k0();
    }

    public final Td.a j1() {
        Td.a aVar = this.f69554C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountAnalytics");
        return null;
    }

    public final Rd.a k1() {
        Rd.a aVar = this.f69555D0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final j l1() {
        j jVar = this.f69556E0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final C13909a m1() {
        C13909a aVar = this.f69552A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("sessionManager");
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C17542s.j(menu, "menu");
        C17542s.j(menuInflater, "inflater");
        menuInflater.inflate(Sd.e.f63355a, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C17542s.j(menuItem, "item");
        if (menuItem.getItemId() != Sd.c.f63344i) {
            return super.onOptionsItemSelected(menuItem);
        }
        z1();
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        t1();
    }
}
