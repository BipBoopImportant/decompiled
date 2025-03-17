package com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1;

import EB.C12832d;
import Fz.B;
import HJ.C15854t;
import Hj.C10722c;
import Hj.C10723d;
import Hj.C10724e;
import Hj.C10725f;
import Hj.C10726g;
import Hj.C10727h;
import Hj.C10728i;
import Hj.C10729j;
import Iz.C13043i;
import Iz.C13049o;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16509F;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.A1;
import U0.C4889m;
import Uj.C10958a;
import Uj.C10959b;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
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
import com.adjust.sdk.Constants;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission.RationalePermissionPromptNavigation;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.d;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.e;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreview;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5314c;
import h.C5405c;
import jC.C14615b;
import jC.C14617d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import oj.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import vj.C12128a;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004R\u001a\u0010.\u001a\u00020)8\u0016XD¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010n\u001a\u00020\u000e8\u0014XD¢\u0006\f\n\u0004\bk\u0010X\u001a\u0004\bl\u0010mR\u001a\u0010q\u001a\u00020\u000e8\u0014XD¢\u0006\f\n\u0004\bo\u0010X\u001a\u0004\bp\u0010mR\u001b\u0010w\u001a\u00020r8BX\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010|\u001a\u00020x8BX\u0002¢\u0006\f\n\u0004\by\u0010t\u001a\u0004\bz\u0010{R$\u0010\u0001\u001a\u0010\u0012\f\u0012\n ~*\u0004\u0018\u00010)0)0}8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0001R\u0017\u0010\u0001\u001a\u00020g8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001²\u0006\u000e\u0010\u0001\u001a\u00030\u00018\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/ProductScannerFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "", "<init>", "()V", "LXH/N;", "n1", "p1", "o1", "e1", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "navigateTo", "h1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;)V", "", "shouldCameraBeRunning", "t1", "(Z)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;", "userMessage", "i1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;)V", "c1", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "actionType", "f1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "g1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "R", "Ljava/lang/String;", "U0", "()Ljava/lang/String;", "destId", "LHj/t;", "S", "LHj/t;", "Y0", "()LHj/t;", "setScanner", "(LHj/t;)V", "scanner", "Lug/j;", "T", "Lug/j;", "getEnabledFeaturesFactory", "()Lug/j;", "setEnabledFeaturesFactory", "(Lug/j;)V", "enabledFeaturesFactory", "Lam/d;", "U", "Lam/d;", "V0", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "X", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "X0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "setRationalePermissionPromptNavigation", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;)V", "rationalePermissionPromptNavigation", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;", "Y", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;", "Z0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;", "setScannerProductNavHandler", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;)V", "scannerProductNavHandler", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;", "Z", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;", "a1", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;", "setScannerProductUserMessageHandler", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;)V", "scannerProductUserMessageHandler", "Lvj/a;", "y0", "Lvj/a;", "W0", "()Lvj/a;", "setHelpDialogNavigation", "(Lvj/a;)V", "helpDialogNavigation", "LFz/B;", "z0", "LFz/B;", "_binding", "A0", "v0", "()Z", "drawUnderStatusBar", "B0", "u0", "drawUnderNavigationBar", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;", "C0", "LXH/o;", "b1", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;", "viewModel", "LUj/b;", "D0", "T0", "()LUj/b;", "cartButtonViewModel", "Lg/c;", "kotlin.jvm.PlatformType", "E0", "Lg/c;", "permissionsLauncher", "S0", "()LFz/B;", "binding", "LUj/a;", "state", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductScannerFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final boolean f92063A0 = true;

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f92064B0 = true;

    /* renamed from: C0  reason: collision with root package name */
    private final C16824o f92065C0;

    /* renamed from: D0  reason: collision with root package name */
    private final C16824o f92066D0;

    /* renamed from: E0  reason: collision with root package name */
    private final C5314c<String> f92067E0;

    /* renamed from: R  reason: collision with root package name */
    private final String f92068R = "scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}";

    /* renamed from: S  reason: collision with root package name */
    public Hj.t f92069S;

    /* renamed from: T  reason: collision with root package name */
    public ug.j f92070T;

    /* renamed from: U  reason: collision with root package name */
    public am.d f92071U;

    /* renamed from: X  reason: collision with root package name */
    public RationalePermissionPromptNavigation f92072X;

    /* renamed from: Y  reason: collision with root package name */
    public h f92073Y;

    /* renamed from: Z  reason: collision with root package name */
    public i f92074Z;

    /* renamed from: y0  reason: collision with root package name */
    public C12128a f92075y0;

    /* renamed from: z0  reason: collision with root package name */
    private B f92076z0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$handleUiState$$inlined$collectOnStarted$1", f = "ProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Hj.n, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92077c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92078d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92079e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, ProductScannerFragment productScannerFragment) {
            super(2, eVar);
            this.f92079e = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(eVar, this.f92079e);
            aVar.f92078d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(Hj.n nVar, C17164e<? super C16807N> eVar) {
            return ((a) create(nVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92077c == 0) {
                y.b(obj);
                TextView textView = this.f92079e.S0().f110058k;
                C12832d d10 = ((Hj.n) this.f92078d).d();
                textView.setText(d10 != null ? d10.getName() : null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f92080a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f92081a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$handleUiState$$inlined$map$1$2", f = "ProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$b$a$a  reason: collision with other inner class name */
            public static final class C2032a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f92082c;

                /* renamed from: d  reason: collision with root package name */
                int f92083d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f92084e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2032a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f92084e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f92082c = obj;
                    this.f92083d |= Integer.MIN_VALUE;
                    return this.f92084e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f92081a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.b.a.C2032a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$b$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.b.a.C2032a) r0
                    int r1 = r0.f92083d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f92083d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$b$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f92082c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f92083d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f92081a
                    Hj.n r5 = (Hj.n) r5
                    boolean r5 = r5.f()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f92083d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f92080a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f92080a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f92085a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f92086a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$handleUiState$$inlined$map$2$2", f = "ProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$c$a$a  reason: collision with other inner class name */
            public static final class C2033a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f92087c;

                /* renamed from: d  reason: collision with root package name */
                int f92088d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f92089e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2033a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f92089e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f92087c = obj;
                    this.f92088d |= Integer.MIN_VALUE;
                    return this.f92089e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f92086a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.c.a.C2033a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$c$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.c.a.C2033a) r0
                    int r1 = r0.f92088d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f92088d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$c$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f92087c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f92088d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f92086a
                    Hj.n r5 = (Hj.n) r5
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c r5 = r5.c()
                    r0.f92088d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f92085a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f92085a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f92090a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f92091a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$handleUiState$$inlined$map$3$2", f = "ProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$d$a$a  reason: collision with other inner class name */
            public static final class C2034a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f92092c;

                /* renamed from: d  reason: collision with root package name */
                int f92093d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f92094e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2034a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f92094e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f92092c = obj;
                    this.f92093d |= Integer.MIN_VALUE;
                    return this.f92094e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f92091a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.d.a.C2034a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$d$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.d.a.C2034a) r0
                    int r1 = r0.f92093d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f92093d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$d$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f92092c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f92093d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f92091a
                    Hj.n r5 = (Hj.n) r5
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.e r5 = r5.e()
                    r0.f92093d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f92090a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f92090a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isKeepScannerRunning", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$handleUiState$2", f = "ProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92095c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f92096d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92097e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ProductScannerFragment productScannerFragment, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f92097e = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f92097e, eVar);
            eVar2.f92096d = ((Boolean) obj).booleanValue();
            return eVar2;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((e) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92095c == 0) {
                y.b(obj);
                boolean z10 = this.f92096d;
                if (z10) {
                    this.f92097e.S0().f110050c.setMode(CameraPreviewOverlay.b.C2046b.f92339a);
                    Button button = this.f92097e.S0().f110055h;
                    C17542s.i(button, "manualArticleNumber");
                    button.setVisibility(0);
                } else {
                    this.f92097e.S0().f110050c.setMode(CameraPreviewOverlay.b.a.f92338a);
                    Button button2 = this.f92097e.S0().f110055h;
                    C17542s.i(button2, "manualArticleNumber");
                    button2.setVisibility(8);
                }
                this.f92097e.t1(z10);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "navigateTo", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$handleUiState$4", f = "ProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92098c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92099d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92100e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ProductScannerFragment productScannerFragment, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f92100e = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f92100e, eVar);
            fVar.f92099d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
            return ((f) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92098c == 0) {
                y.b(obj);
                this.f92100e.h1((c) this.f92099d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;", "userMessage", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$handleUiState$6", f = "ProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<e, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92101c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92102d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92103e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ProductScannerFragment productScannerFragment, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f92103e = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f92103e, eVar);
            gVar.f92102d = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(e eVar, C17164e<? super C16807N> eVar2) {
            return ((g) create(eVar, eVar2)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92101c == 0) {
                y.b(obj);
                this.f92103e.i1((e) this.f92102d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92104a;

        h(ProductScannerFragment productScannerFragment) {
            this.f92104a = productScannerFragment;
        }

        private static final C10958a c(A1<? extends C10958a> a12) {
            return (C10958a) a12.getValue();
        }

        /* access modifiers changed from: private */
        public static final C16807N e(ProductScannerFragment productScannerFragment) {
            productScannerFragment.b1().U(d.a.f92149a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r9, int r10) {
            /*
                r8 = this;
                r0 = r10 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r9.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r9.L()
                goto L_0x0078
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.onViewCreated.<anonymous>.<anonymous> (ProductScannerFragment.kt:162)"
                r2 = 1053066988(0x3ec486ec, float:0.38384187)
                U0.C4895p.S(r2, r10, r0, r1)
            L_0x001f:
                com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment r10 = r8.f92104a
                Uj.b r10 = r10.T0()
                TJ.g r0 = r10.C()
                Uj.a$b r1 = Uj.C10958a.b.f88001a
                r6 = 48
                r7 = 14
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = r9
                U0.A1 r10 = j3.a.b(r0, r1, r2, r3, r4, r5, r6, r7)
                Uj.a r0 = c(r10)
                r10 = -484540398(0xffffffffe31e8012, float:-2.923814E21)
                r9.W(r10)
                com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment r10 = r8.f92104a
                boolean r10 = r9.F(r10)
                com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment r1 = r8.f92104a
                java.lang.Object r2 = r9.D()
                if (r10 != 0) goto L_0x0057
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r2 != r10) goto L_0x005f
            L_0x0057:
                com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.b r2 = new com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.b
                r2.<init>(r1)
                r9.u(r2)
            L_0x005f:
                r1 = r2
                nI.a r1 = (nI.C17631a) r1
                r9.P()
                r6 = 3072(0xc00, float:4.305E-42)
                r7 = 4
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = r9
                Lj.o.p(r0, r1, r2, r3, r5, r6, r7)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0078
                U0.C4895p.R()
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment.h.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$onViewCreated$3", f = "ProductScannerFragment.kt", l = {183}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92105c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92106d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ProductScannerFragment f92107a;

            a(ProductScannerFragment productScannerFragment) {
                this.f92107a = productScannerFragment;
            }

            /* renamed from: c */
            public final Object emit(Throwable th2, C17164e<? super C16807N> eVar) {
                if (th2 != null) {
                    this.f92107a.b1().U(new d.n(th2));
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ProductScannerFragment productScannerFragment, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f92106d = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f92106d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92105c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Throwable> q10 = C16534i.q(this.f92106d.b1().J(), 1500);
                a aVar = new a(this.f92106d);
                this.f92105c = 1;
                if (q10.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$setResultListeners$$inlined$consumeResult$1", f = "ProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    public static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<C13049o.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92108c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92109d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f92110e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f92111f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92112g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C8948l lVar, String str, C17164e eVar, ProductScannerFragment productScannerFragment) {
            super(2, eVar);
            this.f92110e = lVar;
            this.f92111f = str;
            this.f92112g = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f92110e, this.f92111f, eVar, this.f92112g);
            jVar.f92109d = obj;
            return jVar;
        }

        /* renamed from: i */
        public final Object invoke(C13049o.a aVar, C17164e<? super C16807N> eVar) {
            return ((j) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92108c == 0) {
                y.b(obj);
                Object obj2 = this.f92109d;
                if (obj2 != null) {
                    this.f92112g.b1().U(new d.j((C13049o.a) obj2));
                    this.f92110e.h().m(this.f92111f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$setUpScanner$1", f = "ProductScannerFragment.kt", l = {255}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92113c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92114d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$setUpScanner$1$1", f = "ProductScannerFragment.kt", l = {256, 261}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f92115c;

            /* renamed from: d  reason: collision with root package name */
            int f92116d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ProductScannerFragment f92117e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerFragment$k$a$a  reason: collision with other inner class name */
            static final class C2035a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ProductScannerFragment f92118a;

                C2035a(ProductScannerFragment productScannerFragment) {
                    this.f92118a = productScannerFragment;
                }

                /* renamed from: c */
                public final Object emit(za.a aVar, C17164e<? super C16807N> eVar) {
                    f O02 = this.f92118a.b1();
                    int i10 = aVar.f58575a;
                    String str = aVar.f58576b;
                    C17542s.i(str, "rawValue");
                    O02.U(new d.l(i10, str));
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ProductScannerFragment productScannerFragment, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f92117e = productScannerFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f92117e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                CameraPreviewOverlay cameraPreviewOverlay;
                Object f10 = C17187b.f();
                int i10 = this.f92116d;
                if (i10 == 0) {
                    y.b(obj);
                    Hj.t Y02 = this.f92117e.Y0();
                    CoordinatorLayout b10 = this.f92117e.S0().getRoot();
                    C17542s.i(b10, "getRoot(...)");
                    View view = this.f92117e.S0().f110059l;
                    C17542s.i(view, "viewport");
                    CameraPreview cameraPreview = this.f92117e.S0().f110049b;
                    C17542s.i(cameraPreview, "cameraPreview");
                    cameraPreviewOverlay = this.f92117e.S0().f110050c;
                    C17542s.i(cameraPreviewOverlay, "cameraPreviewOverlay");
                    this.f92115c = cameraPreviewOverlay;
                    this.f92116d = 1;
                    obj = Y02.s(b10, view, cameraPreview, cameraPreviewOverlay, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    cameraPreviewOverlay = (CameraPreviewOverlay) this.f92115c;
                    y.b(obj);
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    CameraPreviewOverlay cameraPreviewOverlay2 = (CameraPreviewOverlay) this.f92115c;
                    y.b(obj);
                    throw new C16820k();
                }
                C2035a aVar = new C2035a(this.f92117e);
                this.f92115c = cameraPreviewOverlay;
                this.f92116d = 2;
                if (((C16509F) obj).collect(aVar, this) == f10) {
                    return f10;
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ProductScannerFragment productScannerFragment, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f92114d = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f92114d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92113c;
            if (i10 == 0) {
                y.b(obj);
                ProductScannerFragment productScannerFragment = this.f92114d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(productScannerFragment, (C17164e<? super a>) null);
                this.f92113c = 1;
                if (androidx.lifecycle.Q.b(productScannerFragment, bVar, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92119c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92120d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f92119c = oVar;
            this.f92120d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f92120d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f92119c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92121c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(C5187o oVar) {
            super(0);
            this.f92121c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f92121c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class n extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92122c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C17631a aVar) {
            super(0);
            this.f92122c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f92122c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f92123c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(C16824o oVar) {
            super(0);
            this.f92123c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f92123c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class p extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92124c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(C17631a aVar, C16824o oVar) {
            super(0);
            this.f92124c = aVar;
            this.f92125d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f92124c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f92125d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class q extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92126c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f92126c = oVar;
            this.f92127d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f92127d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f92126c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class r extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92128c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(C5187o oVar) {
            super(0);
            this.f92128c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f92128c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class s extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92129c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(C17631a aVar) {
            super(0);
            this.f92129c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f92129c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class t extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f92130c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(C16824o oVar) {
            super(0);
            this.f92130c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f92130c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class u extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92131c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(C17631a aVar, C16824o oVar) {
            super(0);
            this.f92131c = aVar;
            this.f92132d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f92131c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f92132d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    public ProductScannerFragment() {
        m mVar = new m(this);
        XH.s sVar = XH.s.NONE;
        C16824o a10 = C16825p.a(sVar, new n(mVar));
        this.f92065C0 = W.b(this, P.b(f.class), new o(a10), new p((C17631a) null, a10), new q(this, a10));
        C16824o a11 = C16825p.a(sVar, new s(new r(this)));
        this.f92066D0 = W.b(this, P.b(C10959b.class), new t(a11), new u((C17631a) null, a11), new l(this, a11));
        C5314c<String> registerForActivityResult = registerForActivityResult(new C5405c(), new C10725f(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f92067E0 = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public final B S0() {
        B b10 = this.f92076z0;
        if (b10 != null) {
            return b10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final C10959b T0() {
        return (C10959b) this.f92066D0.getValue();
    }

    /* access modifiers changed from: private */
    public final f b1() {
        return (f) this.f92065C0.getValue();
    }

    private final void c1() {
        RationalePermissionPromptNavigation X02 = X0();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        X02.a(parentFragmentManager, this, new C10726g(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(ProductScannerFragment productScannerFragment, RationalePermissionPromptNavigation.Result result) {
        C17542s.j(result, "it");
        if (!C17542s.e(result, RationalePermissionPromptNavigation.Result.c.f92054a)) {
            if (C17542s.e(result, RationalePermissionPromptNavigation.Result.d.f92056a)) {
                productScannerFragment.startActivity(productScannerFragment.V0().c());
            } else if (C17542s.e(result, RationalePermissionPromptNavigation.Result.b.f92052a) || C17542s.e(result, RationalePermissionPromptNavigation.Result.a.f92050a)) {
                C8951o f10 = rw.f.f(productScannerFragment, productScannerFragment.U0(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    C13043i.a(f10);
                }
            } else {
                throw new XH.t();
            }
        }
        return C16807N.f139792a;
    }

    private final void e1() {
        C16532g R10 = C16534i.R(C5208k.b(C16534i.s(new b(b1().getState())), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new e(this, (C17164e<? super e>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        C16532g R11 = C16534i.R(C16534i.A(C5208k.b(C16534i.s(new c(b1().getState())), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null)), new f(this, (C17164e<? super f>) null));
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C16534i.M(R11, C5222z.a(viewLifecycleOwner2));
        C16532g R12 = C16534i.R(C16534i.A(C5208k.b(C16534i.s(new d(b1().getState())), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null)), new g(this, (C17164e<? super g>) null));
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C16534i.M(R12, C5222z.a(viewLifecycleOwner3));
        C16532g R13 = C16534i.R(C5208k.b(b1().getState(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new a((C17164e) null, this));
        C5221y viewLifecycleOwner4 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C16534i.M(R13, C5222z.a(viewLifecycleOwner4));
    }

    private final void f1(com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a aVar) {
        if (C17542s.e(aVar, a.b.f91362a)) {
            b1().U(d.C2037d.a.f92153a);
        } else if (C17542s.e(aVar, a.c.f91364a)) {
            b1().U(d.C2037d.b.f92154a);
        } else if (!C17542s.e(aVar, a.C2000a.f91360a)) {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final void h1(c cVar) {
        Z0().h(U0(), this, b1(), X0(), this.f92067E0, cVar);
    }

    /* access modifiers changed from: private */
    public final void i1(e eVar) {
        if (eVar instanceof e.c) {
            i a12 = a1();
            CoordinatorLayout b10 = S0().getRoot();
            C17542s.i(b10, "getRoot(...)");
            FrameLayout frameLayout = S0().f110057j;
            C17542s.i(frameLayout, "scannerIcon");
            a12.h(this, b10, frameLayout, (e.c) eVar, b1());
        } else if (eVar instanceof e.b) {
            a1().f(U0(), this, (e.b) eVar);
        } else if (eVar instanceof e.a) {
            a1().e(this, T0(), (e.a) eVar);
        } else {
            throw new XH.t();
        }
        b1().U(d.o.f92166a);
    }

    /* access modifiers changed from: private */
    public static final C16807N j1(ProductScannerFragment productScannerFragment, oj.i iVar, com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a aVar) {
        C17542s.j(iVar, "type");
        C17542s.j(aVar, "action");
        productScannerFragment.b1().U(d.o.f92166a);
        if (!(iVar instanceof i.b) && !(iVar instanceof i.c)) {
            if (iVar instanceof i.a) {
                productScannerFragment.f1(aVar);
            } else if (iVar instanceof i.d) {
                productScannerFragment.T0().D(C10959b.a.ResumeBadgeUpdates);
            } else {
                throw new XH.t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void k1(ProductScannerFragment productScannerFragment, View view) {
        productScannerFragment.b1().U(d.b.f92150a);
    }

    /* access modifiers changed from: private */
    public static final C16807N l1(ProductScannerFragment productScannerFragment) {
        productScannerFragment.b1().U(d.o.f92166a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void m1(ProductScannerFragment productScannerFragment, Boolean bool) {
        C17542s.j(bool, "hasPermission");
        productScannerFragment.b1().U(new d.k(bool.booleanValue()));
    }

    private final void n1() {
        if (rw.a.b(this)) {
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(U0());
            C16532g R10 = C16534i.R(C5208k.a(E10.h().i("product_detail_request_key", null), E10.getLifecycle(), r.b.RESUMED), new j(E10, "product_detail_request_key", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        }
    }

    private final void o1() {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new k(this, (C17164e<? super k>) null), 3, (Object) null);
    }

    private final void p1() {
        B S02 = S0();
        b(new C10728i(S02));
        S02.f110054g.setOnClickListener(new C10729j(this));
        S02.f110055h.setVisibility(0);
        S02.f110055h.setOnClickListener(new Hj.k(this));
    }

    /* access modifiers changed from: private */
    public static final void q1(ProductScannerFragment productScannerFragment, View view) {
        productScannerFragment.b1().U(d.f.f92156a);
    }

    /* access modifiers changed from: private */
    public static final void r1(ProductScannerFragment productScannerFragment, View view) {
        productScannerFragment.b1().U(new d.e(Interaction$Component.SCANNER));
    }

    /* access modifiers changed from: private */
    public static final C16807N s1(B b10, jC.q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        lC.l a10 = qVar.a();
        C14615b.c cVar = C14615b.c.f127858b;
        a10.a(cVar);
        qVar.b().a(cVar);
        ImageButton imageButton = b10.f110052e;
        C17542s.i(imageButton, "close");
        C14617d dVar = C14617d.Margin;
        qVar.e(imageButton, dVar);
        ImageButton imageButton2 = b10.f110054g;
        C17542s.i(imageButton2, "help");
        qVar.e(imageButton2, dVar);
        ComposeView composeView = b10.f110051d;
        C17542s.i(composeView, "cartButton");
        qVar.h(composeView, dVar);
        FrameLayout frameLayout = b10.f110057j;
        C17542s.i(frameLayout, "scannerIcon");
        qVar.h(frameLayout, dVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void t1(boolean z10) {
        if (z10) {
            Y0().u(new C10727h(this));
        } else {
            Y0().x();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u1(ProductScannerFragment productScannerFragment, Throwable th2) {
        C17542s.j(th2, "it");
        productScannerFragment.b1().U(new d.m(th2));
        return C16807N.f139792a;
    }

    public String U0() {
        return this.f92068R;
    }

    public final am.d V0() {
        am.d dVar = this.f92071U;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("deviceIntentProvider");
        return null;
    }

    public final C12128a W0() {
        C12128a aVar = this.f92075y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("helpDialogNavigation");
        return null;
    }

    public final RationalePermissionPromptNavigation X0() {
        RationalePermissionPromptNavigation rationalePermissionPromptNavigation = this.f92072X;
        if (rationalePermissionPromptNavigation != null) {
            return rationalePermissionPromptNavigation;
        }
        C17542s.z("rationalePermissionPromptNavigation");
        return null;
    }

    public final Hj.t Y0() {
        Hj.t tVar = this.f92069S;
        if (tVar != null) {
            return tVar;
        }
        C17542s.z("scanner");
        return null;
    }

    public final h Z0() {
        h hVar = this.f92073Y;
        if (hVar != null) {
            return hVar;
        }
        C17542s.z("scannerProductNavHandler");
        return null;
    }

    public final i a1() {
        i iVar = this.f92074Z;
        if (iVar != null) {
            return iVar;
        }
        C17542s.z("scannerProductUserMessageHandler");
        return null;
    }

    /* renamed from: g1 */
    public CoordinatorLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        B c10 = B.c(layoutInflater);
        this.f92076z0 = c10;
        CoordinatorLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        Y0().t();
        this.f92076z0 = null;
        getViewLifecycleOwner().getLifecycle().g(b1());
        requireActivity().getWindow().clearFlags(128);
        requireActivity().setRequestedOrientation(-1);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        getViewLifecycleOwner().getLifecycle().c(b1());
        o1();
        p1();
        e1();
        c1();
        n1();
        ScanAndGoBottomSheetFragment.f91342T.c(this, new C10722c(this));
        B S02 = S0();
        S02.f110052e.setOnClickListener(new C10723d(this));
        S02.f110051d.setContent(c1.c.c(1053066988, true, new h(this)));
        requireActivity().getWindow().addFlags(128);
        requireActivity().setRequestedOrientation(1);
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new i(this, (C17164e<? super i>) null), 3, (Object) null);
        W0().b(this, U0(), new C10724e(this));
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(Constants.DEEPLINK) : null;
        if (string != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.remove(Constants.DEEPLINK);
            }
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
                    String a10 = C11818a.a("Deeplink-param received: " + string, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = ProductScannerFragment.class.getName();
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
            androidx.navigation.fragment.a.a(this).X(Uri.parse(string));
        }
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f92064B0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f92063A0;
    }
}
