package com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2;

import C.C4409q;
import HJ.C15854t;
import Ij.v;
import Iz.C13043i;
import Iz.C13049o;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import Uj.C10959b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import android.net.Uri;
import android.os.Bundle;
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
import bd.C9427a;
import com.adjust.sdk.Constants;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission.RationalePermissionPromptNavigation;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.d;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5314c;
import h.C5405c;
import jC.C14615b;
import jC.q;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import oj.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import u2.C6012a;
import vj.C12128a;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0013\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0004R\u001a\u0010#\u001a\u00020\u001e8\u0016XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010b\u001a\u00020\\8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010i\u001a\u00020c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001b\u0010\u0012\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001b\u0010r\u001a\u00020n8BX\u0002¢\u0006\f\n\u0004\bo\u0010k\u001a\u0004\bp\u0010qR\"\u0010w\u001a\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010\u001e0\u001e0s8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v2/ProductScannerFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "j1", "b1", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "navigateTo", "g1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;)V", "Z0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "actionType", "f1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;", "viewModel", "com/ingka/ikea/app/scanandgoonlineredesign/scanner/v2/ProductScannerFragment$d", "h1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;)Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v2/ProductScannerFragment$d;", "Y0", "D0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "onDestroyView", "", "X", "Ljava/lang/String;", "R0", "()Ljava/lang/String;", "destId", "Lug/j;", "Y", "Lug/j;", "getEnabledFeaturesFactory", "()Lug/j;", "setEnabledFeaturesFactory", "(Lug/j;)V", "enabledFeaturesFactory", "Lam/d;", "Z", "Lam/d;", "S0", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "y0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "U0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "setRationalePermissionPromptNavigation", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;)V", "rationalePermissionPromptNavigation", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;", "z0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;", "W0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;", "setScannerProductNavHandler", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/h;)V", "scannerProductNavHandler", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;", "A0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;", "getScannerProductUserMessageHandler", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;", "setScannerProductUserMessageHandler", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/i;)V", "scannerProductUserMessageHandler", "Lvj/a;", "B0", "Lvj/a;", "T0", "()Lvj/a;", "setHelpDialogNavigation", "(Lvj/a;)V", "helpDialogNavigation", "Lbd/a;", "C0", "Lbd/a;", "O0", "()Lbd/a;", "setBarcodeScanner", "(Lbd/a;)V", "barcodeScanner", "LC/q;", "LC/q;", "P0", "()LC/q;", "setCameraSelector", "(LC/q;)V", "cameraSelector", "LIj/h;", "LIj/h;", "V0", "()LIj/h;", "setScannerBarcodeAnalyzer", "(LIj/h;)V", "scannerBarcodeAnalyzer", "F0", "LXH/o;", "X0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;", "LUj/b;", "G0", "Q0", "()LUj/b;", "cartButtonViewModel", "Lg/c;", "kotlin.jvm.PlatformType", "H0", "Lg/c;", "permissionsLauncher", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductScannerFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.i f92227A0;

    /* renamed from: B0  reason: collision with root package name */
    public C12128a f92228B0;

    /* renamed from: C0  reason: collision with root package name */
    public C9427a f92229C0;

    /* renamed from: D0  reason: collision with root package name */
    public C4409q f92230D0;

    /* renamed from: E0  reason: collision with root package name */
    public Ij.h f92231E0;

    /* renamed from: F0  reason: collision with root package name */
    private final C16824o f92232F0;

    /* renamed from: G0  reason: collision with root package name */
    private final C16824o f92233G0;

    /* renamed from: H0  reason: collision with root package name */
    private final C5314c<String> f92234H0;

    /* renamed from: X  reason: collision with root package name */
    private final String f92235X = "scanandgo/scanner/v1/product?entryPoint={entryPoint}&deeplink={deeplink}";

    /* renamed from: Y  reason: collision with root package name */
    public ug.j f92236Y;

    /* renamed from: Z  reason: collision with root package name */
    public am.d f92237Z;

    /* renamed from: y0  reason: collision with root package name */
    public RationalePermissionPromptNavigation f92238y0;

    /* renamed from: z0  reason: collision with root package name */
    public com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.h f92239z0;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f92240a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$a$a  reason: collision with other inner class name */
        public static final class C2043a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f92241a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$handleUiState$$inlined$map$1$2", f = "ProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$a$a$a  reason: collision with other inner class name */
            public static final class C2044a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f92242c;

                /* renamed from: d  reason: collision with root package name */
                int f92243d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2043a f92244e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2044a(C2043a aVar, C17164e eVar) {
                    super(eVar);
                    this.f92244e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f92242c = obj;
                    this.f92243d |= Integer.MIN_VALUE;
                    return this.f92244e.emit((Object) null, this);
                }
            }

            public C2043a(C16533h hVar) {
                this.f92241a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment.a.C2043a.C2044a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$a$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment.a.C2043a.C2044a) r0
                    int r1 = r0.f92243d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f92243d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$a$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f92242c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f92243d
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
                    TJ.h r6 = r4.f92241a
                    Hj.n r5 = (Hj.n) r5
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c r5 = r5.c()
                    r0.f92243d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment.a.C2043a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f92240a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f92240a.collect(new C2043a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "navigateTo", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$handleUiState$2", f = "ProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92245c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92246d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92247e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ProductScannerFragment productScannerFragment, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f92247e = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f92247e, eVar);
            bVar.f92246d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92245c == 0) {
                y.b(obj);
                this.f92247e.g1((com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c) this.f92246d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$initViewModel$3", f = "ProductScannerFragment.kt", l = {160}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92248c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92249d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ProductScannerFragment f92250a;

            a(ProductScannerFragment productScannerFragment) {
                this.f92250a = productScannerFragment;
            }

            /* renamed from: c */
            public final Object emit(Throwable th2, C17164e<? super C16807N> eVar) {
                if (th2 != null) {
                    this.f92250a.X0().U(new d.n(th2));
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ProductScannerFragment productScannerFragment, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f92249d = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f92249d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92248c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Throwable> q10 = C16534i.q(this.f92249d.X0().J(), 1500);
                a aVar = new a(this.f92249d);
                this.f92248c = 1;
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

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/scanner/v2/ProductScannerFragment$d", "LIj/y;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d;", "uiAction", "LXH/N;", "b", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "navAction", "a", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Ij.y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f f92251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92252b;

        d(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar, ProductScannerFragment productScannerFragment) {
            this.f92251a = fVar;
            this.f92252b = productScannerFragment;
        }

        public void a(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c cVar) {
            C17542s.j(cVar, "navAction");
            this.f92252b.Y0(cVar);
        }

        public void b(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.d dVar) {
            C17542s.j(dVar, "uiAction");
            this.f92251a.U(dVar);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment$setResultListeners$$inlined$consumeResult$1", f = "ProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.l implements p<C13049o.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92253c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92254d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f92255e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f92256f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ProductScannerFragment f92257g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C8948l lVar, String str, C17164e eVar, ProductScannerFragment productScannerFragment) {
            super(2, eVar);
            this.f92255e = lVar;
            this.f92256f = str;
            this.f92257g = productScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f92255e, this.f92256f, eVar, this.f92257g);
            eVar2.f92254d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(C13049o.a aVar, C17164e<? super C16807N> eVar) {
            return ((e) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92253c == 0) {
                y.b(obj);
                Object obj2 = this.f92254d;
                if (obj2 != null) {
                    this.f92257g.X0().U(new d.j((C13049o.a) obj2));
                    this.f92255e.h().m(this.f92256f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92258c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f92258c = oVar;
            this.f92259d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f92259d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f92258c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92260c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar) {
            super(0);
            this.f92260c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f92260c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92261c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar) {
            super(0);
            this.f92261c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f92261c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f92262c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C16824o oVar) {
            super(0);
            this.f92262c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f92262c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92263c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C17631a aVar, C16824o oVar) {
            super(0);
            this.f92263c = aVar;
            this.f92264d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f92263c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f92264d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92265c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f92265c = oVar;
            this.f92266d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f92266d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f92265c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92267c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C5187o oVar) {
            super(0);
            this.f92267c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f92267c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92268c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(C17631a aVar) {
            super(0);
            this.f92268c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f92268c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class n extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f92269c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C16824o oVar) {
            super(0);
            this.f92269c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f92269c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92270c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92271d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(C17631a aVar, C16824o oVar) {
            super(0);
            this.f92270c = aVar;
            this.f92271d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f92270c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f92271d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    public ProductScannerFragment() {
        g gVar = new g(this);
        s sVar = s.NONE;
        C16824o a10 = C16825p.a(sVar, new h(gVar));
        this.f92232F0 = W.b(this, P.b(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f.class), new i(a10), new j((C17631a) null, a10), new k(this, a10));
        C16824o a11 = C16825p.a(sVar, new m(new l(this)));
        this.f92233G0 = W.b(this, P.b(C10959b.class), new n(a11), new o((C17631a) null, a11), new f(this, a11));
        C5314c<String> registerForActivityResult = registerForActivityResult(new C5405c(), new Ij.d(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f92234H0 = registerForActivityResult;
    }

    private final C10959b Q0() {
        return (C10959b) this.f92233G0.getValue();
    }

    /* access modifiers changed from: private */
    public final com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f X0() {
        return (com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f) this.f92232F0.getValue();
    }

    /* access modifiers changed from: private */
    public final void Y0(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c cVar) {
        W0().h(R0(), this, X0(), U0(), this.f92234H0, cVar);
    }

    private final void Z0() {
        RationalePermissionPromptNavigation U02 = U0();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        U02.a(parentFragmentManager, this, new Ij.e(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N a1(ProductScannerFragment productScannerFragment, RationalePermissionPromptNavigation.Result result) {
        C17542s.j(result, "it");
        if (!C17542s.e(result, RationalePermissionPromptNavigation.Result.c.f92054a)) {
            if (C17542s.e(result, RationalePermissionPromptNavigation.Result.d.f92056a)) {
                productScannerFragment.startActivity(productScannerFragment.S0().c());
            } else if (C17542s.e(result, RationalePermissionPromptNavigation.Result.b.f92052a) || C17542s.e(result, RationalePermissionPromptNavigation.Result.a.f92050a)) {
                C8951o f10 = rw.f.f(productScannerFragment, productScannerFragment.R0(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    C13043i.a(f10);
                }
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    private final void b1() {
        C16532g R10 = C16534i.R(C16534i.A(C5208k.b(C16534i.s(new a(X0().getState())), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null)), new b(this, (C17164e<? super b>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    public static final C16807N c1(q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        lC.l a10 = qVar.a();
        C14615b.c cVar = C14615b.c.f127858b;
        a10.a(cVar);
        qVar.b().a(cVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(ProductScannerFragment productScannerFragment, oj.i iVar, com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a aVar) {
        C17542s.j(iVar, "type");
        C17542s.j(aVar, "action");
        productScannerFragment.X0().U(d.o.f92166a);
        if (!(iVar instanceof i.b) && !(iVar instanceof i.c)) {
            if (iVar instanceof i.a) {
                productScannerFragment.f1(aVar);
            } else if (iVar instanceof i.d) {
                productScannerFragment.Q0().D(C10959b.a.ResumeBadgeUpdates);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e1(ProductScannerFragment productScannerFragment) {
        productScannerFragment.X0().U(d.o.f92166a);
        return C16807N.f139792a;
    }

    private final void f1(com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a aVar) {
        if (C17542s.e(aVar, a.b.f91362a)) {
            X0().U(d.C2037d.a.f92153a);
        } else if (C17542s.e(aVar, a.c.f91364a)) {
            X0().U(d.C2037d.b.f92154a);
        } else if (!C17542s.e(aVar, a.C2000a.f91360a)) {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void g1(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c cVar) {
        W0().h(R0(), this, X0(), U0(), this.f92234H0, cVar);
    }

    private final d h1(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar) {
        return new d(fVar, this);
    }

    /* access modifiers changed from: private */
    public static final void i1(ProductScannerFragment productScannerFragment, Boolean bool) {
        C17542s.j(bool, "hasPermission");
        productScannerFragment.X0().U(new d.k(bool.booleanValue()));
    }

    private final void j1() {
        if (rw.a.b(this)) {
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(R0());
            C16532g R10 = C16534i.R(C5208k.a(E10.h().i("product_detail_request_key", null), E10.getLifecycle(), r.b.RESUMED), new e(E10, "product_detail_request_key", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(1642671093);
        if (C4895p.J()) {
            C4895p.S(1642671093, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ProductScannerFragment.FragmentContent (ProductScannerFragment.kt:111)");
        }
        com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f X02 = X0();
        Executor h10 = C6012a.h(requireContext());
        C17542s.i(h10, "getMainExecutor(...)");
        v.l(X02, h10, Q0(), P0(), O0(), V0(), h1(X0()), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        super.E0(bundle);
        b(new Ij.a());
        getViewLifecycleOwner().getLifecycle().c(X0());
        b1();
        Z0();
        j1();
        ScanAndGoBottomSheetFragment.f91342T.c(this, new Ij.b(this));
        requireActivity().getWindow().addFlags(128);
        requireActivity().setRequestedOrientation(1);
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
        T0().b(this, R0(), new Ij.c(this));
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

    public final C9427a O0() {
        C9427a aVar = this.f92229C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("barcodeScanner");
        return null;
    }

    public final C4409q P0() {
        C4409q qVar = this.f92230D0;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("cameraSelector");
        return null;
    }

    public String R0() {
        return this.f92235X;
    }

    public final am.d S0() {
        am.d dVar = this.f92237Z;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("deviceIntentProvider");
        return null;
    }

    public final C12128a T0() {
        C12128a aVar = this.f92228B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("helpDialogNavigation");
        return null;
    }

    public final RationalePermissionPromptNavigation U0() {
        RationalePermissionPromptNavigation rationalePermissionPromptNavigation = this.f92238y0;
        if (rationalePermissionPromptNavigation != null) {
            return rationalePermissionPromptNavigation;
        }
        C17542s.z("rationalePermissionPromptNavigation");
        return null;
    }

    public final Ij.h V0() {
        Ij.h hVar = this.f92231E0;
        if (hVar != null) {
            return hVar;
        }
        C17542s.z("scannerBarcodeAnalyzer");
        return null;
    }

    public final com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.h W0() {
        com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.h hVar = this.f92239z0;
        if (hVar != null) {
            return hVar;
        }
        C17542s.z("scannerProductNavHandler");
        return null;
    }

    public void onDestroyView() {
        getViewLifecycleOwner().getLifecycle().g(X0());
        requireActivity().getWindow().clearFlags(128);
        requireActivity().setRequestedOrientation(-1);
        super.onDestroyView();
    }
}
