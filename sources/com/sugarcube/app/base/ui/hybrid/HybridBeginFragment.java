package com.sugarcube.app.base.ui.hybrid;

import JF.C13089K;
import JF.C13103j;
import OE.C13313e;
import OE.q;
import QE.H;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.t;
import XH.y;
import YE.C13868b;
import YE.e;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.r;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.capture.a;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5314c;
import h.C5405c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridBeginFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "<init>", "()V", "Landroidx/fragment/app/t;", "activity", "LXH/N;", "E0", "(Landroidx/fragment/app/t;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "LJF/j;", "P", "LJF/j;", "arManager", "Lg/c;", "", "Q", "Lg/c;", "requestPermissionLauncher", "LOE/e;", "R", "LOE/e;", "G0", "()LOE/e;", "setInstallationConfig", "(LOE/e;)V", "installationConfig", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridBeginFragment extends Hilt_HybridBeginFragment {

    /* renamed from: P  reason: collision with root package name */
    private C13103j f124776P;

    /* renamed from: Q  reason: collision with root package name */
    private C5314c<String> f124777Q;

    /* renamed from: R  reason: collision with root package name */
    public C13313e f124778R;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124779a;

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
                f124779a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.HybridBeginFragment.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.hybrid.HybridBeginFragment$checkPermissions$1$2", f = "HybridBeginFragment.kt", l = {148}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124780c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HybridBeginFragment f124781d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5191t f124782e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(HybridBeginFragment hybridBeginFragment, C5191t tVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f124781d = hybridBeginFragment;
            this.f124782e = tVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f124781d, this.f124782e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124780c;
            if (i10 == 0) {
                y.b(obj);
                E0 u02 = this.f124781d.u0();
                C5191t tVar = this.f124782e;
                this.f124780c = 1;
                if (u02.v2(tVar, this) == f10) {
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

    private final void E0(C5191t tVar) {
        int i10 = a.f124779a[C13089K.d(tVar, "android.permission.CAMERA").ordinal()];
        if (i10 == 1) {
            Log.e(AnyKt.SUGARCUBE_TAG, "Camera Permission was granted");
            C13868b.f118106a.b("camera permission was granted", e.Capture);
            if (this.f124776P == null) {
                q w12 = u0().w1();
                C13313e G02 = G0();
                r lifecycle = getLifecycle();
                C17542s.i(lifecycle, "<get-lifecycle>(...)");
                this.f124776P = new C13103j(tVar, w12, G02, lifecycle, new E(this, tVar));
            }
        } else if (i10 == 2) {
            Log.e(AnyKt.SUGARCUBE_TAG, "Camera Permission rationale");
            C13868b.f118106a.b("camera permission rationale", e.Capture);
            C13089K.e(tVar);
        } else if (i10 == 3) {
            C5314c<String> cVar = this.f124777Q;
            if (cVar == null) {
                C17542s.z("requestPermissionLauncher");
                cVar = null;
            }
            cVar.a("android.permission.CAMERA");
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N F0(HybridBeginFragment hybridBeginFragment, C5191t tVar) {
        C5191t tVar2 = tVar;
        E0 u02 = hybridBeginFragment.u0();
        Analytics b10 = u02.w1().b();
        UUID y12 = u02.y1();
        String r12 = u02.r1();
        RoomType s12 = u02.s1();
        a.C3024a aVar = com.sugarcube.app.base.capture.a.Companion;
        b10.captureBeginEnd(y12, r12, s12, aVar.a(u02.e1()).b(), u02.d1());
        aVar.a(u02.e1()).b();
        u02.w1().b().captureSelectRoomStart(u02.y1(), u02.r1(), u02.s1(), aVar.a(u02.e1()).b(), u02.d1());
        try {
            Object systemService = tVar2.getSystemService("camera");
            C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            JF.r.h((CameraManager) systemService, hybridBeginFragment.u0().w1());
        } catch (Exception e10) {
            C13868b bVar = C13868b.f118106a;
            bVar.b("trackCameraCharacteristics " + e10, e.Capture);
        }
        F0 unused = C16314k.d(C5222z.a(tVar), (C17168i) null, (T) null, new b(hybridBeginFragment, tVar2, (C17164e<? super b>) null), 3, (Object) null);
        C8951o.f0(androidx.navigation.fragment.a.a(hybridBeginFragment), !hybridBeginFragment.u0().u1() ? new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_GET_READY_1) : new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_AR_GET_READY), (C) null, (I.a) null, 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H0(HybridBeginFragment hybridBeginFragment) {
        E0 u02 = hybridBeginFragment.u0();
        u02.w1().b().captureBeginExit(u02.y1(), u02.r1(), u02.s1(), com.sugarcube.app.base.capture.a.Companion.a(u02.e1()).b(), u02.d1());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void I0(HybridBeginFragment hybridBeginFragment, boolean z10) {
        if (z10) {
            hybridBeginFragment.u0().w1().b().captureCameraPermissionAllow();
            Log.e(AnyKt.SUGARCUBE_TAG, "Camera Permission granted");
            C13868b.f118106a.b("camera permission granted", e.Capture);
            return;
        }
        hybridBeginFragment.u0().w1().b().captureCameraPermissionDontAllow();
        Log.e(AnyKt.SUGARCUBE_TAG, "Camera Permission denied (2)");
        C13868b.f118106a.b("camera permission denied (2)", e.Capture);
    }

    public final C13313e G0() {
        C13313e eVar = this.f124778R;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("installationConfig");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        H c10 = H.c(layoutInflater, viewGroup, false);
        E0 u02 = u0();
        u02.w1().b().captureBeginStart(u02.y1(), u02.r1(), u02.s1(), com.sugarcube.app.base.capture.a.Companion.a(u02.e1()).b(), u02.d1());
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114364b;
        C17542s.i(floatingActionButton, "cancelButton");
        x0(b10, floatingActionButton, new F(this));
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onResume() {
        super.onResume();
        C5191t activity = getActivity();
        if (activity != null) {
            E0(activity);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        this.f124777Q = registerForActivityResult(new C5405c(), new G(this));
    }
}
