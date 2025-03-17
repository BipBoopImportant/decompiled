package com.ingka.ikea.app.scanandgoonlineredesign.fragment;

import Ar.j;
import Fz.p;
import Hj.u;
import IC.C13023e;
import Iz.Y;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16509F;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Uj.z;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.v;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.app.scanandgoonlineredesign.coupon.navigation.AddCouponBottomSheetNavigation;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission.RationalePermissionPromptNavigation;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreview;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5314c;
import h.C5405c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import tj.C11908p;
import tj.C11909q;
import tj.C11910r;
import tj.C11911s;
import tj.C11912t;
import tj.C11913u;
import tj.C11914v;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0001wB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0019\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J+\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u0010\u0004R\u001b\u00105\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010g\u001a\u00020b8\u0016XD¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR \u0010m\u001a\b\u0012\u0004\u0012\u00020\u00050h8\u0016X\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\"\u0010r\u001a\u0010\u0012\f\u0012\n o*\u0004\u0018\u00010b0b0n8\u0002X\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010u\u001a\u0002068BX\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006x"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/fragment/ScanAndGoScannerCouponFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "", "<init>", "()V", "LXH/N;", "n1", "c1", "LUj/z$c;", "data", "g1", "(LUj/z$c;)V", "LUj/z$d;", "state", "h1", "(LUj/z$d;)V", "LUj/z$a;", "action", "f1", "(LUj/z$a;)V", "LIC/e;", "error", "e1", "(LIC/e;)V", "", "shouldCameraBeRunning", "o1", "(Z)V", "l1", "a1", "S0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "d1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LUj/z;", "R", "LXH/o;", "Z0", "()LUj/z;", "viewModel", "LFz/p;", "S", "LFz/p;", "_binding", "LHj/u;", "T", "LHj/u;", "Y0", "()LHj/u;", "setScanner", "(LHj/u;)V", "scanner", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation;", "U", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation;", "T0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation;", "setAddCouponBottomSheetNavigation", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation;)V", "addCouponBottomSheetNavigation", "Lam/d;", "X", "Lam/d;", "V0", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "Y", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "X0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "setRationalePermissionPromptNavigation", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;)V", "rationalePermissionPromptNavigation", "LAr/j;", "Z", "LAr/j;", "W0", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "", "y0", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "z0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "Lg/c;", "kotlin.jvm.PlatformType", "A0", "Lg/c;", "permissionsLauncher", "U0", "()LFz/p;", "binding", "B0", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoScannerCouponFragment extends f {

    /* renamed from: B0  reason: collision with root package name */
    public static final a f91617B0 = new a((DefaultConstructorMarker) null);

    /* renamed from: C0  reason: collision with root package name */
    public static final int f91618C0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    private final C5314c<String> f91619A0;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f91620R;

    /* renamed from: S  reason: collision with root package name */
    private p f91621S;

    /* renamed from: T  reason: collision with root package name */
    public u f91622T;

    /* renamed from: U  reason: collision with root package name */
    public AddCouponBottomSheetNavigation f91623U;

    /* renamed from: X  reason: collision with root package name */
    public am.d f91624X;

    /* renamed from: Y  reason: collision with root package name */
    public RationalePermissionPromptNavigation f91625Y;

    /* renamed from: Z  reason: collision with root package name */
    public j f91626Z;

    /* renamed from: y0  reason: collision with root package name */
    private final String f91627y0 = "scanandgo/scanner/v1/coupon";

    /* renamed from: z0  reason: collision with root package name */
    private final C17631a<C16807N> f91628z0 = new C11910r();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/fragment/ScanAndGoScannerCouponFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoScannerCouponFragment$observeUiDataModel$$inlined$collectOnStarted$1", f = "ScanAndGoScannerCouponFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements nI.p<z.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91629c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91630d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ScanAndGoScannerCouponFragment f91631e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment) {
            super(2, eVar);
            this.f91631e = scanAndGoScannerCouponFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar, this.f91631e);
            bVar.f91630d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(z.c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91629c == 0) {
                y.b(obj);
                z.c cVar = (z.c) this.f91630d;
                ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment = this.f91631e;
                scanAndGoScannerCouponFragment.g1(scanAndGoScannerCouponFragment.Z0().C().getValue());
                this.f91631e.h1(cVar.f());
                ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment2 = this.f91631e;
                scanAndGoScannerCouponFragment2.f1(scanAndGoScannerCouponFragment2.Z0().C().getValue().e());
                this.f91631e.e1(cVar.d());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/fragment/ScanAndGoScannerCouponFragment$c", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScanAndGoScannerCouponFragment f91632b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment) {
            super(true);
            this.f91632b = scanAndGoScannerCouponFragment;
        }

        public void handleOnBackPressed() {
            this.f91632b.S0();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoScannerCouponFragment$setUpScanner$1", f = "ScanAndGoScannerCouponFragment.kt", l = {121}, m = "invokeSuspend")
    static final class d extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91633c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ScanAndGoScannerCouponFragment f91634d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoScannerCouponFragment$setUpScanner$1$1", f = "ScanAndGoScannerCouponFragment.kt", l = {122, 127}, m = "invokeSuspend")
        static final class a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f91635c;

            /* renamed from: d  reason: collision with root package name */
            int f91636d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ScanAndGoScannerCouponFragment f91637e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoScannerCouponFragment$d$a$a  reason: collision with other inner class name */
            static final class C2020a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ScanAndGoScannerCouponFragment f91638a;

                C2020a(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment) {
                    this.f91638a = scanAndGoScannerCouponFragment;
                }

                /* renamed from: c */
                public final Object emit(za.a aVar, C17164e<? super C16807N> eVar) {
                    z M02 = this.f91638a.Z0();
                    int i10 = aVar.f58575a;
                    String str = aVar.f58576b;
                    C17542s.i(str, "rawValue");
                    M02.D(new z.b.f(i10, str));
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f91637e = scanAndGoScannerCouponFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f91637e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                CameraPreviewOverlay cameraPreviewOverlay;
                Object f10 = C17187b.f();
                int i10 = this.f91636d;
                if (i10 == 0) {
                    y.b(obj);
                    u Y02 = this.f91637e.Y0();
                    CoordinatorLayout b10 = this.f91637e.U0().getRoot();
                    C17542s.i(b10, "getRoot(...)");
                    View view = this.f91637e.U0().f110178h;
                    C17542s.i(view, "viewport");
                    CameraPreview cameraPreview = this.f91637e.U0().f110172b;
                    C17542s.i(cameraPreview, "cameraPreview");
                    cameraPreviewOverlay = this.f91637e.U0().f110173c;
                    C17542s.i(cameraPreviewOverlay, "cameraPreviewOverlay");
                    this.f91635c = cameraPreviewOverlay;
                    this.f91636d = 1;
                    obj = Y02.s(b10, view, cameraPreview, cameraPreviewOverlay, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    cameraPreviewOverlay = (CameraPreviewOverlay) this.f91635c;
                    y.b(obj);
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    CameraPreviewOverlay cameraPreviewOverlay2 = (CameraPreviewOverlay) this.f91635c;
                    y.b(obj);
                    throw new C16820k();
                }
                C2020a aVar = new C2020a(this.f91637e);
                this.f91635c = cameraPreviewOverlay;
                this.f91636d = 2;
                if (((C16509F) obj).collect(aVar, this) == f10) {
                    return f10;
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f91634d = scanAndGoScannerCouponFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f91634d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91633c;
            if (i10 == 0) {
                y.b(obj);
                ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment = this.f91634d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(scanAndGoScannerCouponFragment, (C17164e<? super a>) null);
                this.f91633c = 1;
                if (androidx.lifecycle.Q.b(scanAndGoScannerCouponFragment, bVar, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91639c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f91639c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91639c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91640c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar) {
            super(0);
            this.f91640c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91640c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91641c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C16824o oVar) {
            super(0);
            this.f91641c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91641c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91642c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91642c = aVar;
            this.f91643d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91642c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91643d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91644c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91644c = oVar;
            this.f91645d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91645d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91644c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ScanAndGoScannerCouponFragment() {
        C16824o a10 = C16825p.a(s.NONE, new f(new e(this)));
        this.f91620R = W.b(this, P.b(z.class), new g(a10), new h((C17631a) null, a10), new i(this, a10));
        C5314c<String> registerForActivityResult = registerForActivityResult(new C5405c(), new C11911s(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f91619A0 = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public static final C16807N R0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void S0() {
        rw.d.a(this, Y.a.C2681a.f111000a, "ScanAndGoScannerCouponNavigation.RequestKey");
        androidx.navigation.fragment.a.a(this).k0();
    }

    /* access modifiers changed from: private */
    public final p U0() {
        p pVar = this.f91621S;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final z Z0() {
        return (z) this.f91620R.getValue();
    }

    private final void a1() {
        RationalePermissionPromptNavigation X02 = X0();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        X02.a(parentFragmentManager, this, new C11913u(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment, RationalePermissionPromptNavigation.Result result) {
        C17542s.j(result, "it");
        if (!C17542s.e(result, RationalePermissionPromptNavigation.Result.c.f92054a)) {
            if (C17542s.e(result, RationalePermissionPromptNavigation.Result.d.f92056a)) {
                scanAndGoScannerCouponFragment.startActivity(scanAndGoScannerCouponFragment.V0().c());
            } else if (C17542s.e(result, RationalePermissionPromptNavigation.Result.b.f92052a) || C17542s.e(result, RationalePermissionPromptNavigation.Result.a.f92050a)) {
                scanAndGoScannerCouponFragment.S0();
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    private final void c1() {
        C16532g R10 = C16534i.R(C5208k.b(Z0().C(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new b((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    public final void e1(C13023e eVar) {
        if (eVar != null) {
            j W02 = W0();
            CoordinatorLayout b10 = U0().getRoot();
            C17542s.i(b10, "getRoot(...)");
            Context requireContext = requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            j.a.s(W02, b10, eVar.b(requireContext), (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 124, (Object) null);
            Z0().D(z.b.g.f88303a);
        }
    }

    /* access modifiers changed from: private */
    public final void f1(z.a aVar) {
        if (aVar instanceof z.a.b) {
            Z0().D(z.b.d.f88299a);
            rw.d.a(this, ((z.a.b) aVar).a(), "ScanAndGoScannerCouponNavigation.RequestKey");
            androidx.navigation.fragment.a.a(this).k0();
        } else if (aVar instanceof z.a.c) {
            Z0().D(z.b.d.f88299a);
            AddCouponBottomSheetNavigation T02 = T0();
            FragmentManager parentFragmentManager = getParentFragmentManager();
            C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
            T02.a(parentFragmentManager, ((z.a.c) aVar).a());
        } else if (C17542s.e(aVar, z.a.C1849a.f88291a)) {
        } else {
            if (aVar instanceof z.a.d) {
                this.f91619A0.a(((z.a.d) aVar).a());
            } else if (aVar instanceof z.a.e) {
                RationalePermissionPromptNavigation X02 = X0();
                FragmentManager parentFragmentManager2 = getParentFragmentManager();
                C17542s.i(parentFragmentManager2, "getParentFragmentManager(...)");
                X02.b(parentFragmentManager2);
            } else {
                throw new t();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void g1(z.c cVar) {
        U0().f110177g.setText(cVar.g());
    }

    /* access modifiers changed from: private */
    public final void h1(z.d dVar) {
        if (dVar instanceof z.d.a) {
            o1(((z.d.a) dVar).a());
            return;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final void i1(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment, View view) {
        scanAndGoScannerCouponFragment.S0();
    }

    /* access modifiers changed from: private */
    public static final void j1(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment, View view) {
        scanAndGoScannerCouponFragment.Z0().D(z.b.c.f88298a);
    }

    /* access modifiers changed from: private */
    public static final void k1(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment, Boolean bool) {
        C17542s.j(bool, "hasPermission");
        scanAndGoScannerCouponFragment.Z0().D(new z.b.e(bool.booleanValue()));
    }

    private final void l1() {
        AddCouponBottomSheetNavigation T02 = T0();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        T02.b(parentFragmentManager, this, new C11912t(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N m1(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment, AddCouponBottomSheetNavigation.NavigationResult navigationResult) {
        C17542s.j(navigationResult, "it");
        scanAndGoScannerCouponFragment.Z0().D(new z.b.a(navigationResult));
        return C16807N.f139792a;
    }

    private final void n1() {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
    }

    private final void o1(boolean z10) {
        if (z10) {
            Y0().u(new C11914v(this));
        } else {
            Y0().x();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p1(ScanAndGoScannerCouponFragment scanAndGoScannerCouponFragment, Throwable th2) {
        C17542s.j(th2, "it");
        scanAndGoScannerCouponFragment.Z0().D(new z.b.C1850b(th2));
        return C16807N.f139792a;
    }

    public final AddCouponBottomSheetNavigation T0() {
        AddCouponBottomSheetNavigation addCouponBottomSheetNavigation = this.f91623U;
        if (addCouponBottomSheetNavigation != null) {
            return addCouponBottomSheetNavigation;
        }
        C17542s.z("addCouponBottomSheetNavigation");
        return null;
    }

    public final am.d V0() {
        am.d dVar = this.f91624X;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("deviceIntentProvider");
        return null;
    }

    public final j W0() {
        j jVar = this.f91626Z;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final RationalePermissionPromptNavigation X0() {
        RationalePermissionPromptNavigation rationalePermissionPromptNavigation = this.f91625Y;
        if (rationalePermissionPromptNavigation != null) {
            return rationalePermissionPromptNavigation;
        }
        C17542s.z("rationalePermissionPromptNavigation");
        return null;
    }

    public final u Y0() {
        u uVar = this.f91622T;
        if (uVar != null) {
            return uVar;
        }
        C17542s.z("scanner");
        return null;
    }

    /* renamed from: d1 */
    public CoordinatorLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        p c10 = p.c(layoutInflater);
        this.f91621S = c10;
        CoordinatorLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().i(this, new c(this));
    }

    public void onDestroyView() {
        requireActivity().getWindow().clearFlags(128);
        requireActivity().setRequestedOrientation(-1);
        Y0().t();
        this.f91621S = null;
        super.onDestroyView();
    }

    public void onStart() {
        super.onStart();
        requireActivity().getWindow().addFlags(128);
        getLifecycle().c(Z0());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        n1();
        c1();
        l1();
        a1();
        U0().f110174d.setOnClickListener(new C11908p(this));
        U0().f110176f.setOnClickListener(new C11909q(this));
        requireActivity().setRequestedOrientation(1);
    }
}
