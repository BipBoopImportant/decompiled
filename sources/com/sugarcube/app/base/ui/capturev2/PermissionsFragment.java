package com.sugarcube.app.base.ui.capturev2;

import JF.C13084F;
import JF.C13089K;
import OE.n;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.t;
import XH.v;
import XH.y;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.w;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.sugarcube.core.analytics.Trackable;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5314c;
import h.C5405c;
import hF.C14540b;
import hF.C14542d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0017\u001a\u00020\u00128\u0014X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188DX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/PermissionsFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "LXH/N;", "K0", "H0", "Landroidx/fragment/app/t;", "N0", "()Landroidx/fragment/app/t;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "I0", "M0", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "Lcom/sugarcube/app/base/ui/capturev2/e0;", "N", "LXH/o;", "J0", "()Lcom/sugarcube/app/base/ui/capturev2/e0;", "permissionModel", "Lg/c;", "", "O", "Lg/c;", "requestPermissionLauncher", "", "P", "Z", "getCheckPermissionMode", "()Z", "Q0", "(Z)V", "checkPermissionMode", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PermissionsFragment extends Hilt_PermissionsFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123540M = C14540b.Permission;

    /* renamed from: N  reason: collision with root package name */
    private final C16824o f123541N = W.b(this, P.b(C14205e0.class), new c(this), new d((C17631a) null, this), new e(this));

    /* renamed from: O  reason: collision with root package name */
    private C5314c<String> f123542O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f123543P = true;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f123544a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                JF.L[] r0 = JF.C13090L.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                JF.L r1 = JF.C13090L.PERMISSION_GRANTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                JF.L r1 = JF.C13090L.CAN_ASK_PERMISSION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                JF.L r1 = JF.C13090L.PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f123544a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.PermissionsFragment.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.PermissionsFragment$onCameraGranted$1$1", f = "PermissionsFragment.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123545c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PermissionsFragment f123546d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5191t f123547e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PermissionsFragment permissionsFragment, C5191t tVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f123546d = permissionsFragment;
            this.f123547e = tVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(PermissionsFragment permissionsFragment) {
            permissionsFragment.M0();
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f123546d, this.f123547e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123545c == 0) {
                y.b(obj);
                this.f123546d.J0().G(this.f123547e, new C14219l0(this.f123546d));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123548c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f123548c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f123548c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123549c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f123550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C5187o oVar) {
            super(0);
            this.f123549c = aVar;
            this.f123550d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f123549c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f123550d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.PermissionsFragment.d.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123551c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f123551c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f123551c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    private final void H0() {
        h1 n02 = n0();
        boolean z10 = this.f123543P;
        h1.R1(n02, "PermissionsFragment.checkCameraPermission (" + z10 + ")", (Throwable) null, 2, (Object) null);
        C5191t activity = getActivity();
        if (activity != null) {
            int i10 = a.f123544a[C13089K.d(activity, "android.permission.CAMERA").ordinal()];
            if (i10 == 1) {
                h1.R1(n0(), "PermissionFragment: camera permission granted", (Throwable) null, 2, (Object) null);
                K0();
            } else if (i10 == 2) {
                h1.R1(n0(), "PermissionFragment: camera permission rationale", (Throwable) null, 2, (Object) null);
                N0();
            } else if (i10 == 3) {
                h1.R1(n0(), "PermissionFragment: camera permission denied", (Throwable) null, 2, (Object) null);
                C5314c<String> cVar = this.f123542O;
                if (cVar != null) {
                    cVar.a("android.permission.CAMERA");
                }
            } else {
                throw new t();
            }
        }
    }

    private final void K0() {
        h1 n02 = n0();
        boolean z10 = this.f123543P;
        h1.R1(n02, "PermissionsFragment.onCameraGranted (" + z10 + ")", (Throwable) null, 2, (Object) null);
        C5191t activity = getActivity();
        if (activity != null) {
            F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new b(this, activity, (C17164e<? super b>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void L0(PermissionsFragment permissionsFragment, Boolean bool) {
        w onBackPressedDispatcher;
        if (bool.booleanValue()) {
            BaseFragment.z0(permissionsFragment, C14542d.Allow, (Trackable) null, 2, (Object) null);
            h1.R1(permissionsFragment.n0(), "PermissionFragment - camera permission granted", (Throwable) null, 2, (Object) null);
            permissionsFragment.K0();
            return;
        }
        BaseFragment.z0(permissionsFragment, C14542d.DontAllow, (Trackable) null, 2, (Object) null);
        h1.R1(permissionsFragment.n0(), "CheckPermissionFragment - camera permission denied", (Throwable) null, 2, (Object) null);
        C5191t activity = permissionsFragment.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.l();
        }
    }

    private final C5191t N0() {
        C5191t activity = getActivity();
        if (activity == null) {
            return null;
        }
        String string = activity.getString(n.f113450s0);
        C17542s.i(string, "getString(...)");
        String string2 = activity.getString(n.f113246N0);
        C17542s.i(string2, "getString(...)");
        String string3 = activity.getString(n.f113227K);
        C17542s.i(string3, "getString(...)");
        v a10 = C16796C.a(string3, new C14215j0(activity));
        String string4 = activity.getString(n.f113351e);
        C17542s.i(string4, "getString(...)");
        C13084F.p(activity, string, string2, a10, C16796C.a(string4, new C14217k0(activity)), false, 16, (Object) null);
        return activity;
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(C5191t tVar) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        String packageName = tVar.getPackageName();
        Uri parse = Uri.parse("package:" + packageName);
        C17542s.i(parse, "parse(...)");
        intent.setData(parse);
        tVar.startActivity(intent);
        tVar.getOnBackPressedDispatcher().l();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(C5191t tVar) {
        tVar.getOnBackPressedDispatcher().l();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public final void I0() {
        this.f123543P = false;
        H0();
        this.f123543P = true;
    }

    /* access modifiers changed from: protected */
    public final C14205e0 J0() {
        return (C14205e0) this.f123541N.getValue();
    }

    /* access modifiers changed from: protected */
    public void M0() {
        h1 n02 = n0();
        boolean z10 = this.f123543P;
        h1.R1(n02, "PermissionsFragment.onPermissionGranted (" + z10 + ")", (Throwable) null, 2, (Object) null);
        BaseFragment.z0(this, C14542d.Continue, (Trackable) null, 2, (Object) null);
        n0().D1();
    }

    /* access modifiers changed from: protected */
    public final void Q0(boolean z10) {
        this.f123543P = z10;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h1 n02 = n0();
        boolean z10 = this.f123543P;
        h1.R1(n02, "PermissionsFragment.onCreate (" + z10 + ")", (Throwable) null, 2, (Object) null);
        this.f123542O = registerForActivityResult(new C5405c(), new C14213i0(this));
    }

    public void onPause() {
        super.onPause();
        J0().H();
    }

    public void onResume() {
        super.onResume();
        h1 n02 = n0();
        boolean z10 = this.f123543P;
        h1.R1(n02, "PermissionsFragment.onResume (" + z10 + ")", (Throwable) null, 2, (Object) null);
        if (this.f123543P) {
            H0();
        }
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123540M;
    }
}
