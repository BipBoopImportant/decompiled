package com.ingka.ikea.account.impl.modalsettings.changepassword;

import HJ.C15854t;
import U0.C4889m;
import U0.C4895p;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import ae.C9408a;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.account.impl.modalsettings.C;
import com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity;
import com.ingka.ikea.account.impl.modalsettings.changepassword.a;
import com.ingka.ikea.account.impl.modalsettings.changepassword.b;
import com.sugarcube.core.logger.DslKt;
import g.C5314c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uI.C18059h;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0015¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00068\u0014XD¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00068\u0014XD¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00068\u0014XD¢\u0006\f\n\u0004\b\r\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/ChangePasswordFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "navigateTo", "", "I0", "(Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;)Z", "LXH/N;", "D0", "(LU0/m;I)V", "X", "Z", "v0", "()Z", "drawUnderStatusBar", "Y", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/d;", "y0", "LXH/o;", "J0", "()Lcom/ingka/ikea/account/impl/modalsettings/changepassword/d;", "viewModel", "Lg/c;", "Lcom/ingka/ikea/account/impl/modalsettings/C;", "kotlin.jvm.PlatformType", "z0", "Lg/c;", "hostedRedirect", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangePasswordFragment extends e {

    /* renamed from: X  reason: collision with root package name */
    private final boolean f69647X;

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f69648Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f69649Z;

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f69650y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C5314c<C> f69651z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<a, Boolean> {
        a(Object obj) {
            super(1, obj, ChangePasswordFragment.class, "consumeNavigationEvent", "consumeNavigationEvent(Lcom/ingka/ikea/account/impl/modalsettings/changepassword/ChangePassword$Destination;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(a aVar) {
            return Boolean.valueOf(((ChangePasswordFragment) this.receiver).I0(aVar));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f69652a;

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
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.DELETE_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity$Companion$RedirectUseCase r1 = com.ingka.ikea.account.impl.modalsettings.HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_PASSWORD     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f69652a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.modalsettings.changepassword.ChangePasswordFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69653c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f69653c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f69653c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69654c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f69654c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f69654c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f69655c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f69655c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f69655c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f69656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f69656c = aVar;
            this.f69657d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f69656c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f69657d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f69658c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f69659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f69658c = oVar;
            this.f69659d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f69659d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f69658c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ChangePasswordFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f69650y0 = W.b(this, P.b(d.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
        C5314c<C> registerForActivityResult = registerForActivityResult(new HostedRedirectActivity.Companion.a(), new C9408a(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f69651z0 = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public final boolean I0(a aVar) {
        if (aVar == null) {
            return false;
        }
        if (aVar instanceof a.C1200a) {
            androidx.navigation.fragment.a.a(this).k0();
            return true;
        } else if (aVar instanceof a.b) {
            this.f69651z0.a(new C(((a.b) aVar).a(), HostedRedirectActivity.Companion.RedirectUseCase.CHANGE_PASSWORD));
            return true;
        } else {
            throw new t();
        }
    }

    private final d J0() {
        return (d) this.f69650y0.getValue();
    }

    /* access modifiers changed from: private */
    public static final void K0(ChangePasswordFragment changePasswordFragment, HostedRedirectActivity.Companion.b bVar) {
        if (bVar != null && !(bVar instanceof HostedRedirectActivity.Companion.b.a)) {
            if (bVar instanceof HostedRedirectActivity.Companion.b.C1198b) {
                HostedRedirectActivity.Companion.RedirectUseCase a10 = ((HostedRedirectActivity.Companion.b.C1198b) bVar).a();
                int i10 = b.f69652a[a10.ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    IllegalStateException illegalStateException = new IllegalStateException("Should never end up here: " + a10);
                    qv.e eVar = qv.e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar2 : arrayList) {
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
                            String name = changePasswordFragment.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar2.a(eVar, str4, false, illegalStateException, str3);
                        str = str3;
                        str2 = str4;
                    }
                } else if (i10 == 4) {
                    changePasswordFragment.J0().H(b.e.f69666a);
                } else {
                    throw new t();
                }
            } else {
                throw new t();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1713091648);
        if (C4895p.J()) {
            C4895p.S(-1713091648, i10, -1, "com.ingka.ikea.account.impl.modalsettings.changepassword.ChangePasswordFragment.FragmentContent (ChangePasswordFragment.kt:52)");
        }
        d J02 = J0();
        mVar.W(1023340979);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        be.e.i(J02, (C17642l) ((C18059h) D10), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f69649Z;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f69648Y;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f69647X;
    }
}
