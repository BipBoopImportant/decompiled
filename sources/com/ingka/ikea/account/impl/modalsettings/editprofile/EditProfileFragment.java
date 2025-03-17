package com.ingka.ikea.account.impl.modalsettings.editprofile;

import Ar.j;
import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Wd.C9346a;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.RecyclerView;
import cD.C14029a;
import com.ingka.ikea.account.impl.modalsettings.C;
import com.ingka.ikea.account.impl.modalsettings.F;
import com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import dl.C11199d;
import dl.r;
import fe.i;
import fe.m;
import fe.n;
import g.C5314c;
import il.f;
import ip.C11410b;
import ip.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import u2.C6012a;
import uK.C18146a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001SB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8VX\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0016XD¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002018TX\u0002¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u00105R\u001b\u0010<\u001a\u0002018VX\u0002¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u00105R\u001b\u0010A\u001a\u00020=8VX\u0002¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0016XD¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\u0002018\u0016XD¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bI\u00105R\"\u0010P\u001a\u0010\u0012\f\u0012\n M*\u0004\u0018\u00010L0L0K8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048TX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0007¨\u0006T"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/editprofile/EditProfileFragment;", "Lcom/ingka/ikea/account/impl/dynamicfields/DynamicFieldsDelegateFragment;", "<init>", "()V", "", "", "p2", "()Ljava/util/List;", "LXH/N;", "x2", "Landroidx/recyclerview/widget/RecyclerView;", "view", "E0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "LcD/a;", "P0", "LcD/a;", "n2", "()LcD/a;", "setEditProfileRepository", "(LcD/a;)V", "editProfileRepository", "LAe/e;", "Q0", "LAe/e;", "l2", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "Lcom/ingka/ikea/account/impl/modalsettings/F;", "R0", "Lcom/ingka/ikea/account/impl/modalsettings/F;", "s2", "()Lcom/ingka/ikea/account/impl/modalsettings/F;", "setHostedPageInteractor", "(Lcom/ingka/ikea/account/impl/modalsettings/F;)V", "hostedPageInteractor", "Lfe/n;", "S0", "LXH/o;", "o2", "()Lfe/n;", "editProfileViewModel", "LWd/a;", "T0", "m2", "()LWd/a;", "analyticsDelegate", "", "U0", "Ljava/lang/String;", "r1", "()Ljava/lang/String;", "destId", "V0", "L0", "pageTitle", "W0", "s1", "errorDialogTitle", "Lfe/m;", "X0", "t2", "()Lfe/m;", "repositoryConnection", "", "Y0", "Z", "x1", "()Z", "validateFieldsOnCreation", "Z0", "p1", "componentValue", "Lg/c;", "Lcom/ingka/ikea/account/impl/modalsettings/C;", "kotlin.jvm.PlatformType", "a1", "Lg/c;", "hostedRedirect", "l1", "additionalFields", "a", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditProfileFragment extends a {

    /* renamed from: P0  reason: collision with root package name */
    public C14029a f69757P0;

    /* renamed from: Q0  reason: collision with root package name */
    public Ae.e f69758Q0;

    /* renamed from: R0  reason: collision with root package name */
    public F f69759R0;

    /* renamed from: S0  reason: collision with root package name */
    private final C16824o f69760S0;

    /* renamed from: T0  reason: collision with root package name */
    private final C16824o f69761T0 = C16825p.b(new fe.c(this));

    /* renamed from: U0  reason: collision with root package name */
    private final String f69762U0 = "profile/account/edit_profile";

    /* renamed from: V0  reason: collision with root package name */
    private final C16824o f69763V0 = C16825p.b(new fe.d(this));

    /* renamed from: W0  reason: collision with root package name */
    private final C16824o f69764W0 = C16825p.b(new fe.e(this));

    /* renamed from: X0  reason: collision with root package name */
    private final C16824o f69765X0 = C16825p.b(new fe.f(this));

    /* renamed from: Y0  reason: collision with root package name */
    private final boolean f69766Y0 = true;

    /* renamed from: Z0  reason: collision with root package name */
    private final String f69767Z0 = "edit_profile";
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public final C5314c<C> f69768a1;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000b\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/editprofile/EditProfileFragment$a;", "Lkotlin/Function1;", "Lip/k;", "", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "useCase", "<init>", "(Lcom/ingka/ikea/account/impl/modalsettings/editprofile/EditProfileFragment;Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;)V", "resource", "a", "(Lip/k;)V", "Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "getUseCase", "()Lcom/ingka/ikea/account/impl/modalsettings/HostedRedirectActivity$Companion$RedirectUseCase;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements C17642l<k<String, l>, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        private final HostedRedirectActivity.Companion.RedirectUseCase f69769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditProfileFragment f69770b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1206a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f69771a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
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
                    ip.k$e r1 = ip.k.e.NO_NETWORK     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    ip.k$e r1 = ip.k.e.ERROR     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f69771a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment.a.C1206a.<clinit>():void");
            }
        }

        public a(EditProfileFragment editProfileFragment, HostedRedirectActivity.Companion.RedirectUseCase redirectUseCase) {
            C17542s.j(redirectUseCase, "useCase");
            this.f69770b = editProfileFragment;
            this.f69769a = redirectUseCase;
        }

        public void a(k<String, l> kVar) {
            C17542s.j(kVar, "resource");
            int i10 = C1206a.f69771a[kVar.c().ordinal()];
            if (i10 == 1) {
                return;
            }
            if (i10 == 2) {
                String a10 = kVar.a();
                if (a10 != null) {
                    EditProfileFragment editProfileFragment = this.f69770b;
                    editProfileFragment.s2().a(editProfileFragment.f69768a1, new C(a10, this.f69769a));
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("No url to open for use case: " + this.f69769a);
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
            } else if (i10 == 3 || i10 == 4) {
                j.a.j(this.f69770b.t1(), this.f69770b.requireContext(), Oo.b.f84321A3, (Integer) null, false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 508, (Object) null);
            } else {
                throw new t();
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
        public static final /* synthetic */ int[] f69772a;

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
                f69772a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment$refreshContent$2", f = "EditProfileFragment.kt", l = {187}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f69773c;

        /* renamed from: d  reason: collision with root package name */
        Object f69774d;

        /* renamed from: e  reason: collision with root package name */
        Object f69775e;

        /* renamed from: f  reason: collision with root package name */
        Object f69776f;

        /* renamed from: g  reason: collision with root package name */
        Object f69777g;

        /* renamed from: h  reason: collision with root package name */
        Object f69778h;

        /* renamed from: i  reason: collision with root package name */
        Object f69779i;

        /* renamed from: j  reason: collision with root package name */
        int f69780j;

        /* renamed from: k  reason: collision with root package name */
        int f69781k;

        /* renamed from: l  reason: collision with root package name */
        int f69782l;

        /* renamed from: m  reason: collision with root package name */
        int f69783m;

        /* renamed from: n  reason: collision with root package name */
        int f69784n;

        /* renamed from: o  reason: collision with root package name */
        private /* synthetic */ Object f69785o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ EditProfileFragment f69786p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(EditProfileFragment editProfileFragment, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f69786p = editProfileFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f69786p, eVar);
            cVar.f69785o = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f69784n
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "Kt"
                r11 = 1
                r12 = 0
                r13 = 0
                if (r2 == 0) goto L_0x0044
                if (r2 != r11) goto L_0x003c
                java.lang.Object r1 = r0.f69778h
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f69777g
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f69776f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f69775e
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f69774d
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f69773c
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f69785o
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r24)
                r22 = r4
                goto L_0x0140
            L_0x003c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0044:
                XH.y.b(r24)
                java.lang.Object r2 = r0.f69785o
                QJ.Q r2 = (QJ.Q) r2
                com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment r14 = r0.f69786p
                com.ingka.ikea.account.impl.dynamicfields.d r14 = r14.y1()
                r14.z0(r11)
                qv.e r14 = qv.e.DEBUG
                qv.d r15 = qv.d.f102012a
                java.util.List r15 = r15.a()
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r15 = r15.iterator()
            L_0x0067:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x007e
                java.lang.Object r8 = r15.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r14, r12)
                if (r9 == 0) goto L_0x0067
                r11.add(r8)
                goto L_0x0067
            L_0x007e:
                java.util.Iterator r8 = r11.iterator()
                r16 = r11
                r9 = r13
                r15 = r9
            L_0x0086:
                boolean r17 = r8.hasNext()
                if (r17 == 0) goto L_0x0112
                java.lang.Object r21 = r8.next()
                r16 = r21
                qv.b r16 = (qv.C11819b) r16
                r12 = 0
                if (r9 != 0) goto L_0x00a9
                java.lang.String r10 = "fetch profile"
                java.lang.String r10 = qv.C11818a.a(r10, r12)
                if (r10 != 0) goto L_0x00a5
                r22 = r4
                r4 = r21
                goto L_0x0116
            L_0x00a5:
                java.lang.String r9 = qv.C11820c.a(r10)
            L_0x00a9:
                if (r15 != 0) goto L_0x00f7
                java.lang.Class r10 = r2.getClass()
                java.lang.String r10 = r10.getName()
                kotlin.jvm.internal.C17542s.g(r10)
                r22 = r4
                r12 = 2
                r15 = 36
                java.lang.String r4 = HJ.C15854t.s1(r10, r15, r13, r12, r13)
                r15 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r15, r13, r12, r13)
                int r12 = r4.length()
                if (r12 != 0) goto L_0x00cc
                goto L_0x00d0
            L_0x00cc:
                java.lang.String r10 = HJ.C15854t.P0(r4, r7)
            L_0x00d0:
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r4 = r4.getName()
                r12 = 1
                boolean r4 = HJ.C15854t.b0(r4, r6, r12)
                if (r4 == 0) goto L_0x00e1
                r4 = r5
                goto L_0x00e3
            L_0x00e1:
                r4 = r22
            L_0x00e3:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                r12.append(r3)
                r12.append(r10)
                java.lang.String r15 = r12.toString()
            L_0x00f5:
                r4 = r15
                goto L_0x00fa
            L_0x00f7:
                r22 = r4
                goto L_0x00f5
            L_0x00fa:
                r18 = 0
                r15 = r16
                r16 = r14
                r17 = r4
                r10 = 0
                r19 = r10
                r20 = r9
                r15.a(r16, r17, r18, r19, r20)
                r15 = r4
                r16 = r21
                r4 = r22
                r12 = 0
                goto L_0x0086
            L_0x0112:
                r22 = r4
                r4 = r16
            L_0x0116:
                com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment r10 = r0.f69786p
                fe.n r10 = r10.o2()
                r0.f69785o = r2
                r0.f69773c = r2
                r0.f69774d = r14
                r0.f69775e = r9
                r0.f69776f = r15
                r0.f69777g = r11
                r0.f69778h = r8
                r0.f69779i = r4
                r4 = 0
                r0.f69780j = r4
                r0.f69781k = r4
                r0.f69782l = r4
                r0.f69783m = r4
                r4 = 1
                r0.f69784n = r4
                java.lang.Object r4 = r10.h(r0)
                if (r4 != r1) goto L_0x013f
                return r1
            L_0x013f:
                r1 = r2
            L_0x0140:
                qv.e r2 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0153:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x016b
                java.lang.Object r9 = r4.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                r11 = 0
                boolean r10 = r10.b(r2, r11)
                if (r10 == 0) goto L_0x0153
                r8.add(r9)
                goto L_0x0153
            L_0x016b:
                java.util.Iterator r4 = r8.iterator()
                r8 = r13
                r9 = r8
            L_0x0171:
                boolean r10 = r4.hasNext()
                if (r10 == 0) goto L_0x01e5
                java.lang.Object r10 = r4.next()
                r14 = r10
                qv.b r14 = (qv.C11819b) r14
                r10 = 0
                if (r8 != 0) goto L_0x018e
                java.lang.String r8 = "refresh sections"
                java.lang.String r8 = qv.C11818a.a(r8, r10)
                if (r8 != 0) goto L_0x018a
                goto L_0x01e5
            L_0x018a:
                java.lang.String r8 = qv.C11820c.a(r8)
            L_0x018e:
                if (r9 != 0) goto L_0x01d8
                java.lang.Class r9 = r1.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                r11 = 36
                r12 = 2
                java.lang.String r15 = HJ.C15854t.s1(r9, r11, r13, r12, r13)
                r11 = 46
                java.lang.String r15 = HJ.C15854t.o1(r15, r11, r13, r12, r13)
                int r11 = r15.length()
                if (r11 != 0) goto L_0x01af
                goto L_0x01b3
            L_0x01af:
                java.lang.String r9 = HJ.C15854t.P0(r15, r7)
            L_0x01b3:
                java.lang.Thread r11 = java.lang.Thread.currentThread()
                java.lang.String r11 = r11.getName()
                r12 = 1
                boolean r11 = HJ.C15854t.b0(r11, r6, r12)
                if (r11 == 0) goto L_0x01c4
                r11 = r5
                goto L_0x01c6
            L_0x01c4:
                r11 = r22
            L_0x01c6:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r11)
                r12.append(r3)
                r12.append(r9)
                java.lang.String r9 = r12.toString()
            L_0x01d8:
                r17 = 0
                r15 = r2
                r16 = r9
                r18 = r10
                r19 = r8
                r14.a(r15, r16, r17, r18, r19)
                goto L_0x0171
            L_0x01e5:
                com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment r2 = r0.f69786p
                com.ingka.ikea.account.impl.dynamicfields.d r2 = r2.y1()
                r2.r0()
                com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment r2 = r0.f69786p
                com.ingka.ikea.account.impl.dynamicfields.d r2 = r2.y1()
                r4 = 0
                r2.z0(r4)
                qv.e r2 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x020b:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0223
                java.lang.Object r9 = r4.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                r11 = 0
                boolean r10 = r10.b(r2, r11)
                if (r10 == 0) goto L_0x020b
                r8.add(r9)
                goto L_0x020b
            L_0x0223:
                java.util.Iterator r4 = r8.iterator()
                r8 = r13
                r9 = r8
            L_0x0229:
                boolean r10 = r4.hasNext()
                if (r10 == 0) goto L_0x029f
                java.lang.Object r10 = r4.next()
                r14 = r10
                qv.b r14 = (qv.C11819b) r14
                r10 = 0
                if (r8 != 0) goto L_0x0246
                java.lang.String r8 = "fetch edit profile configuration"
                java.lang.String r8 = qv.C11818a.a(r8, r10)
                if (r8 != 0) goto L_0x0242
                goto L_0x029f
            L_0x0242:
                java.lang.String r8 = qv.C11820c.a(r8)
            L_0x0246:
                if (r9 != 0) goto L_0x0291
                java.lang.Class r9 = r1.getClass()
                java.lang.String r9 = r9.getName()
                kotlin.jvm.internal.C17542s.g(r9)
                r11 = 36
                r12 = 2
                java.lang.String r15 = HJ.C15854t.s1(r9, r11, r13, r12, r13)
                r11 = 46
                java.lang.String r15 = HJ.C15854t.o1(r15, r11, r13, r12, r13)
                int r16 = r15.length()
                if (r16 != 0) goto L_0x0267
                goto L_0x026b
            L_0x0267:
                java.lang.String r9 = HJ.C15854t.P0(r15, r7)
            L_0x026b:
                java.lang.Thread r15 = java.lang.Thread.currentThread()
                java.lang.String r15 = r15.getName()
                r11 = 1
                boolean r15 = HJ.C15854t.b0(r15, r6, r11)
                if (r15 == 0) goto L_0x027c
                r15 = r5
                goto L_0x027e
            L_0x027c:
                r15 = r22
            L_0x027e:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r15)
                r11.append(r3)
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                goto L_0x0292
            L_0x0291:
                r12 = 2
            L_0x0292:
                r17 = 0
                r15 = r2
                r16 = r9
                r18 = r10
                r19 = r8
                r14.a(r15, r16, r17, r18, r19)
                goto L_0x0229
            L_0x029f:
                com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment r1 = r0.f69786p
                com.ingka.ikea.account.impl.dynamicfields.d r1 = r1.y1()
                r1.o0()
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.editprofile.EditProfileFragment.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69787c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f69787c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f69787c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69788c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f69788c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f69788c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f69789c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f69789c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f69789c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69790c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f69790c = aVar;
            this.f69791d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f69790c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f69791d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69792c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f69792c = oVar;
            this.f69793d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f69793d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f69792c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public EditProfileFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f69760S0 = W.b(this, P.b(n.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
        C5314c<C> registerForActivityResult = registerForActivityResult(new HostedRedirectActivity.Companion.a(), new fe.g(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f69768a1 = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public static final C9346a j2(EditProfileFragment editProfileFragment) {
        return new C9346a(new Xd.a(editProfileFragment.l2()), Xd.b.PROFILE_EDIT_SUCCESS, Xd.b.PROFILE_EDIT_FAIL, (Xd.b) null, (Xd.b) null, 24, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final String k2(EditProfileFragment editProfileFragment) {
        return editProfileFragment.getString(Sd.f.f63376p);
    }

    /* access modifiers changed from: private */
    public final n o2() {
        return (n) this.f69760S0.getValue();
    }

    private final List<Object> p2() {
        r.d dVar = new r.d(getString(Oo.b.f84339C1), (String) null, (Integer) null, (Integer) null, r.c.H6, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2030, (DefaultConstructorMarker) null);
        String string = getString(Oo.b.f84659h4);
        C17542s.i(string, "getString(...)");
        com.ingka.ikea.dynamicfields.datalayer.b bVar = com.ingka.ikea.dynamicfields.datalayer.b.READONLY;
        qg.l lVar = new qg.l("phone.unused", "phone.unused", string, bVar, C16877v.n(), C16877v.n(), o2().F(), (C17642l) null, 128, (DefaultConstructorMarker) null);
        lVar.r(o2().F());
        C16807N n10 = C16807N.f139792a;
        String string2 = getString(Oo.b.f84656h1);
        C17542s.i(string2, "getString(...)");
        C11199d.b bVar2 = new C11199d.b((Integer) null, Integer.valueOf(ip.h.a(Xo.e.a(24))), string2, new i(this), 1, (DefaultConstructorMarker) null);
        bVar2.g(C6012a.e(requireContext(), C18146a.f147996C6));
        String string3 = getString(Oo.b.f84648g4);
        C17542s.i(string3, "getString(...)");
        qg.l lVar2 = new qg.l("email.unused", "email.unused", string3, bVar, C16877v.n(), C16877v.n(), o2().E(), (C17642l) null, 128, (DefaultConstructorMarker) null);
        lVar2.r(o2().E());
        String string4 = getString(Oo.b.f84645g1);
        C17542s.i(string4, "getString(...)");
        C11199d.b bVar3 = new C11199d.b((Integer) null, Integer.valueOf(ip.h.a(Xo.e.a(24))), string4, new fe.j(this), 1, (DefaultConstructorMarker) null);
        bVar3.g(C6012a.e(requireContext(), C18146a.f147996C6));
        return C16877v.q(dVar, lVar, bVar2, lVar2, bVar3);
    }

    /* access modifiers changed from: private */
    public static final C16807N q2(EditProfileFragment editProfileFragment, int i10) {
        C11410b<k<String, l>> C10 = editProfileFragment.o2().C();
        C5221y viewLifecycleOwner = editProfileFragment.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(C10, viewLifecycleOwner, new a(editProfileFragment, HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_EMAIL));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r2(EditProfileFragment editProfileFragment, int i10) {
        C11410b<k<String, l>> D10 = editProfileFragment.o2().D();
        C5221y viewLifecycleOwner = editProfileFragment.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(D10, viewLifecycleOwner, new a(editProfileFragment, HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_PHONE));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void u2(EditProfileFragment editProfileFragment, HostedRedirectActivity.Companion.b bVar) {
        String str;
        char c10;
        int i10;
        HostedRedirectActivity.Companion.b bVar2 = bVar;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar3 = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Hosted redirect callback: " + bVar2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = editProfileFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar3.a(eVar, str5, false, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        if (bVar2 == null) {
            return;
        }
        if (bVar2 instanceof HostedRedirectActivity.Companion.b.C1198b) {
            int i11 = b.f69772a[((HostedRedirectActivity.Companion.b.C1198b) bVar2).a().ordinal()];
            if (i11 == 1 || i11 == 2) {
                j.a.r(editProfileFragment.t1(), editProfileFragment.getView(), Oo.b.f84689k1, Oo.b.f84616d5, 0, (View) null, new fe.h(), 16, (Object) null);
                editProfileFragment.x2();
            } else if (i11 == 3 || i11 == 4) {
                IllegalStateException illegalStateException = new IllegalStateException("Callback not expected here: " + bVar2);
                qv.e eVar2 = qv.e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar4 : arrayList2) {
                    if (str6 == null) {
                        String a11 = C11818a.a((String) null, illegalStateException);
                        if (a11 != null) {
                            str6 = C11820c.a(a11);
                        } else {
                            return;
                        }
                    }
                    if (str7 == null) {
                        String name2 = editProfileFragment.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar4.a(eVar2, str7, false, illegalStateException, str6);
                    i10 = 2;
                    c10 = '$';
                }
            } else {
                throw new t();
            }
        } else if (!(bVar2 instanceof HostedRedirectActivity.Companion.b.a)) {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N v2() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String w2(EditProfileFragment editProfileFragment) {
        return editProfileFragment.getString(Sd.f.f63377q);
    }

    private final void x2() {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Refresh content", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = EditProfileFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final m y2(EditProfileFragment editProfileFragment) {
        return new m(editProfileFragment.n2());
    }

    /* access modifiers changed from: protected */
    public void E0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
        recyclerView.j(new il.f(0, false, (f.a) null, 0, 14, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    public String L0() {
        return (String) this.f69763V0.getValue();
    }

    /* access modifiers changed from: protected */
    public List<Object> l1() {
        return p2();
    }

    public final Ae.e l2() {
        Ae.e eVar = this.f69758Q0;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    /* renamed from: m2 */
    public C9346a n1() {
        return (C9346a) this.f69761T0.getValue();
    }

    public final C14029a n2() {
        C14029a aVar = this.f69757P0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("editProfileRepository");
        return null;
    }

    public String p1() {
        return this.f69767Z0;
    }

    public String r1() {
        return this.f69762U0;
    }

    public String s1() {
        return (String) this.f69764W0.getValue();
    }

    public final F s2() {
        F f10 = this.f69759R0;
        if (f10 != null) {
            return f10;
        }
        C17542s.z("hostedPageInteractor");
        return null;
    }

    /* renamed from: t2 */
    public m u1() {
        return (m) this.f69765X0.getValue();
    }

    public boolean x1() {
        return this.f69766Y0;
    }
}
