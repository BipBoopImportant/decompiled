package com.ingka.ikea.app.scanandgoonlineredesign.fragment;

import HJ.C15854t;
import Iz.C13035a;
import Iz.C13049o;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16509F;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Uj.f;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
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
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission.RationalePermissionPromptNavigation;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreview;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import ds.C11239c;
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
import rz.C15014g;
import rz.C15026t;
import sj.C11853d;
import tj.C11893a;
import tj.C11894b;
import tj.C11895c;
import tj.C11896d;
import tj.C11897e;
import tj.C11898f;
import tj.C11899g;
import tj.C11900h;
import tj.C11901i;
import tj.C11902j;
import vg.C10309b;
import vg.g;
import vj.C12128a;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J+\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u0002012\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u0010\u0004R\u001a\u0010:\u001a\u00020\u00128\u0016XD¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010I\u001a\u00020\u001d8\u0014XD¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Z8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bF\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0001\u001a\u00020y8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010R'\u0010\u0001\u001a\u0012\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00120\u00120\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020;8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/fragment/CollectProductScannerFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "", "<init>", "()V", "LXH/N;", "x1", "w1", "s1", "q1", "Lrz/g;", "product", "r1", "(Lrz/g;)V", "t1", "h1", "f1", "u1", "", "productTitle", "", "quantity", "B1", "(Ljava/lang/String;I)V", "LQJ/F0;", "i1", "()LQJ/F0;", "g1", "U0", "", "shouldCameraBeRunning", "D1", "(Z)V", "imageUrl", "o1", "(Ljava/lang/String;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "actionType", "j1", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/constraintlayout/widget/ConstraintLayout;", "k1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "R", "Ljava/lang/String;", "Y0", "()Ljava/lang/String;", "destId", "LFz/e;", "S", "LFz/e;", "_binding", "LUj/f;", "T", "LXH/o;", "X0", "()LUj/f;", "collectProductViewModel", "U", "Z", "v0", "()Z", "drawUnderStatusBar", "LHj/t;", "X", "LHj/t;", "e1", "()LHj/t;", "setScanner", "(LHj/t;)V", "scanner", "LAr/j;", "Y", "LAr/j;", "a1", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "Lam/d;", "Lam/d;", "Z0", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "y0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "d1", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;", "setRationalePermissionPromptNavigation", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/permission/RationalePermissionPromptNavigation;)V", "rationalePermissionPromptNavigation", "LIz/o;", "z0", "LIz/o;", "c1", "()LIz/o;", "setProductInfoPageNavigation", "(LIz/o;)V", "productInfoPageNavigation", "LIz/a;", "A0", "LIz/a;", "W0", "()LIz/a;", "setCollectProductNavigation", "(LIz/a;)V", "collectProductNavigation", "Lvj/a;", "B0", "Lvj/a;", "b1", "()Lvj/a;", "setHelpDialogNavigation", "(Lvj/a;)V", "helpDialogNavigation", "Lg/c;", "kotlin.jvm.PlatformType", "C0", "Lg/c;", "permissionsLauncher", "V0", "()LFz/e;", "binding", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CollectProductScannerFragment extends d {

    /* renamed from: A0  reason: collision with root package name */
    public C13035a f91493A0;

    /* renamed from: B0  reason: collision with root package name */
    public C12128a f91494B0;
    /* access modifiers changed from: private */

    /* renamed from: C0  reason: collision with root package name */
    public final C5314c<String> f91495C0;

    /* renamed from: R  reason: collision with root package name */
    private final String f91496R = "scanandgo/scanner/v1/collect";

    /* renamed from: S  reason: collision with root package name */
    private Fz.e f91497S;

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f91498T;

    /* renamed from: U  reason: collision with root package name */
    private final boolean f91499U;

    /* renamed from: X  reason: collision with root package name */
    public Hj.t f91500X;

    /* renamed from: Y  reason: collision with root package name */
    public Ar.j f91501Y;

    /* renamed from: Z  reason: collision with root package name */
    public am.d f91502Z;

    /* renamed from: y0  reason: collision with root package name */
    public RationalePermissionPromptNavigation f91503y0;

    /* renamed from: z0  reason: collision with root package name */
    public C13049o f91504z0;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91505a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$a$a  reason: collision with other inner class name */
        public static final class C2010a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91506a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$handleMissItemScan$$inlined$map$1$2", f = "CollectProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$a$a$a  reason: collision with other inner class name */
            public static final class C2011a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91507c;

                /* renamed from: d  reason: collision with root package name */
                int f91508d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2010a f91509e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2011a(C2010a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91509e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91507c = obj;
                    this.f91508d |= Integer.MIN_VALUE;
                    return this.f91509e.emit((Object) null, this);
                }
            }

            public C2010a(C16533h hVar) {
                this.f91506a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.a.C2010a.C2011a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$a$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.a.C2010a.C2011a) r0
                    int r1 = r0.f91508d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91508d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$a$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91507c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91508d
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
                    TJ.h r6 = r4.f91506a
                    Uj.f$f r5 = (Uj.f.C1845f) r5
                    boolean r5 = r5.i()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f91508d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.a.C2010a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f91505a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91505a.collect(new C2010a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "missSnackBar", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$handleMissItemScan$2", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91510c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f91511d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91512e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f91512e = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f91512e, eVar);
            bVar.f91511d = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((b) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91510c == 0) {
                XH.y.b(obj);
                if (this.f91511d) {
                    this.f91512e.X0().S(f.d.e.f88047a);
                    Ar.j a12 = this.f91512e.a1();
                    ConstraintLayout b10 = this.f91512e.V0().getRoot();
                    C17542s.i(b10, "getRoot(...)");
                    C11853d.e(a12, b10, (C17631a) null, (C17642l) null, 6, (Object) null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<f.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91513a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91514a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$handleOnNavigateTo$$inlined$mapNotNull$1$2", f = "CollectProductScannerFragment.kt", l = {52}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$c$a$a  reason: collision with other inner class name */
            public static final class C2012a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91515c;

                /* renamed from: d  reason: collision with root package name */
                int f91516d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91517e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2012a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91517e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91515c = obj;
                    this.f91516d |= Integer.MIN_VALUE;
                    return this.f91517e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91514a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.c.a.C2012a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$c$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.c.a.C2012a) r0
                    int r1 = r0.f91516d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91516d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$c$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91515c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91516d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f91514a
                    Uj.f$f r5 = (Uj.f.C1845f) r5
                    Uj.f$b r5 = r5.e()
                    if (r5 == 0) goto L_0x0047
                    r0.f91516d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f91513a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91513a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUj/f$b;", "destination", "LXH/N;", "<anonymous>", "(LUj/f$b;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$handleOnNavigateTo$2", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<f.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91518c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91519d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91520e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f91520e = collectProductScannerFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(CollectProductScannerFragment collectProductScannerFragment, f.b bVar, C8951o oVar) {
            f.b.c cVar = (f.b.c) bVar;
            collectProductScannerFragment.c1().a(oVar, cVar.a().a(), cVar.a().f());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(CollectProductScannerFragment collectProductScannerFragment) {
            collectProductScannerFragment.X0().S(new f.d.o(true));
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f91520e, eVar);
            dVar.f91519d = obj;
            return dVar;
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91518c == 0) {
                XH.y.b(obj);
                f.b bVar = (f.b) this.f91519d;
                this.f91520e.X0().S(f.d.C1841f.f88048a);
                if (bVar instanceof f.b.c) {
                    CollectProductScannerFragment collectProductScannerFragment = this.f91520e;
                    rw.f.d(collectProductScannerFragment, collectProductScannerFragment.Y0(), new a(this.f91520e, bVar));
                } else if (C17542s.e(bVar, f.b.a.f88036a)) {
                    this.f91520e.b1().a(androidx.navigation.fragment.a.a(this.f91520e));
                    C12128a b12 = this.f91520e.b1();
                    CollectProductScannerFragment collectProductScannerFragment2 = this.f91520e;
                    b12.b(collectProductScannerFragment2, collectProductScannerFragment2.Y0(), new b(this.f91520e));
                } else if (bVar instanceof f.b.C1839b) {
                    f.b.C1839b bVar2 = (f.b.C1839b) bVar;
                    this.f91520e.B1(bVar2.a(), bVar2.b());
                } else {
                    throw new XH.t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: k */
        public final Object invoke(f.b bVar, C17164e<? super C16807N> eVar) {
            return ((d) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C16532g<f.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91521a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91522a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$handlePermissionsIssues$$inlined$mapNotNull$1$2", f = "CollectProductScannerFragment.kt", l = {52}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$e$a$a  reason: collision with other inner class name */
            public static final class C2013a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91523c;

                /* renamed from: d  reason: collision with root package name */
                int f91524d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91525e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2013a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91525e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91523c = obj;
                    this.f91524d |= Integer.MIN_VALUE;
                    return this.f91525e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91522a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.e.a.C2013a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$e$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.e.a.C2013a) r0
                    int r1 = r0.f91524d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91524d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$e$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91523c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91524d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f91522a
                    Uj.f$f r5 = (Uj.f.C1845f) r5
                    Uj.f$c r5 = r5.f()
                    if (r5 == 0) goto L_0x0047
                    r0.f91524d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar) {
            this.f91521a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91521a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUj/f$c;", "permissionsIssue", "LXH/N;", "<anonymous>", "(LUj/f$c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$handlePermissionsIssues$2", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<f.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91526c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91527d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91528e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f91528e = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f91528e, eVar);
            fVar.f91527d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(f.c cVar, C17164e<? super C16807N> eVar) {
            return ((f) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91526c == 0) {
                XH.y.b(obj);
                f.c cVar = (f.c) this.f91527d;
                this.f91528e.X0().S(f.d.a.f88042a);
                if (cVar instanceof f.c.a) {
                    this.f91528e.f91495C0.a(((f.c.a) cVar).a());
                } else if (cVar instanceof f.c.b) {
                    RationalePermissionPromptNavigation d12 = this.f91528e.d1();
                    FragmentManager parentFragmentManager = this.f91528e.getParentFragmentManager();
                    C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
                    d12.b(parentFragmentManager);
                } else {
                    throw new XH.t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91529a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91530a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$handleShowManualEntryPrompt$$inlined$map$1$2", f = "CollectProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$g$a$a  reason: collision with other inner class name */
            public static final class C2014a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91531c;

                /* renamed from: d  reason: collision with root package name */
                int f91532d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91533e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2014a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91533e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91531c = obj;
                    this.f91532d |= Integer.MIN_VALUE;
                    return this.f91533e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91530a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.g.a.C2014a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$g$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.g.a.C2014a) r0
                    int r1 = r0.f91532d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91532d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$g$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$g$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91531c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91532d
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
                    TJ.h r6 = r4.f91530a
                    Uj.f$f r5 = (Uj.f.C1845f) r5
                    boolean r5 = r5.h()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f91532d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.g.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public g(C16532g gVar) {
            this.f91529a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91529a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "showManualEntryPrompt", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$handleShowManualEntryPrompt$2", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91534c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f91535d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91536e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f91536e = collectProductScannerFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(CollectProductScannerFragment collectProductScannerFragment, String str) {
            if (str == null) {
                collectProductScannerFragment.X0().S(new f.d.o(true));
            } else {
                collectProductScannerFragment.X0().S(new f.d.C1840d(str));
            }
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f91536e, eVar);
            hVar.f91535d = ((Boolean) obj).booleanValue();
            return hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91534c == 0) {
                XH.y.b(obj);
                if (this.f91535d) {
                    this.f91536e.X0().S(f.d.b.f88043a);
                    CollectProductScannerFragment collectProductScannerFragment = this.f91536e;
                    C11853d.h(collectProductScannerFragment, new c(collectProductScannerFragment));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object j(boolean z10, C17164e<? super C16807N> eVar) {
            return ((h) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$onViewCreated$3", f = "CollectProductScannerFragment.kt", l = {155}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91537c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91538d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CollectProductScannerFragment f91539a;

            a(CollectProductScannerFragment collectProductScannerFragment) {
                this.f91539a = collectProductScannerFragment;
            }

            /* renamed from: c */
            public final Object emit(Throwable th2, C17164e<? super C16807N> eVar) {
                if (th2 != null) {
                    this.f91539a.X0().S(new f.d.n(th2));
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f91538d = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f91538d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91537c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<Throwable> q10 = C16534i.q(this.f91538d.X0().G(), 1500);
                a aVar = new a(this.f91538d);
                this.f91537c = 1;
                if (q10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements C16532g<C15014g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91540a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91541a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$renderProductToCollect$$inlined$map$1$2", f = "CollectProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$j$a$a  reason: collision with other inner class name */
            public static final class C2015a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91542c;

                /* renamed from: d  reason: collision with root package name */
                int f91543d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91544e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2015a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91544e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91542c = obj;
                    this.f91543d |= Integer.MIN_VALUE;
                    return this.f91544e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91541a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.j.a.C2015a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$j$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.j.a.C2015a) r0
                    int r1 = r0.f91543d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91543d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$j$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$j$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91542c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91543d
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
                    TJ.h r6 = r4.f91541a
                    Uj.f$f r5 = (Uj.f.C1845f) r5
                    rz.g r5 = r5.g()
                    r0.f91543d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.j.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public j(C16532g gVar) {
            this.f91540a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91540a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrz/g;", "product", "LXH/N;", "<anonymous>", "(Lrz/g;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$renderProductToCollect$2", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<C15014g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91545c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91546d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91547e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f91547e = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f91547e, eVar);
            kVar.f91546d = obj;
            return kVar;
        }

        /* renamed from: i */
        public final Object invoke(C15014g gVar, C17164e<? super C16807N> eVar) {
            return ((k) create(gVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91545c == 0) {
                XH.y.b(obj);
                this.f91547e.r1((C15014g) this.f91546d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91548a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91549a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$renderStoreName$$inlined$mapNotNull$1$2", f = "CollectProductScannerFragment.kt", l = {52}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$l$a$a  reason: collision with other inner class name */
            public static final class C2016a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91550c;

                /* renamed from: d  reason: collision with root package name */
                int f91551d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91552e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2016a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91552e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91550c = obj;
                    this.f91551d |= Integer.MIN_VALUE;
                    return this.f91552e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91549a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.l.a.C2016a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$l$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.l.a.C2016a) r0
                    int r1 = r0.f91551d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91551d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$l$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$l$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91550c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91551d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f91549a
                    Uj.f$f r5 = (Uj.f.C1845f) r5
                    java.lang.String r5 = r5.j()
                    if (r5 == 0) goto L_0x0047
                    r0.f91551d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.l.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public l(C16532g gVar) {
            this.f91548a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91548a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "storeName", "LXH/N;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$renderStoreName$2", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91553c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91554d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91555e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f91555e = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            m mVar = new m(this.f91555e, eVar);
            mVar.f91554d = obj;
            return mVar;
        }

        /* renamed from: i */
        public final Object invoke(String str, C17164e<? super C16807N> eVar) {
            return ((m) create(str, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91553c == 0) {
                XH.y.b(obj);
                this.f91555e.V0().f110115w.setText((String) this.f91554d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n implements C16532g<f.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91556a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91557a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$renderUiError$$inlined$map$1$2", f = "CollectProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$n$a$a  reason: collision with other inner class name */
            public static final class C2017a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91558c;

                /* renamed from: d  reason: collision with root package name */
                int f91559d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91560e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2017a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91560e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91558c = obj;
                    this.f91559d |= Integer.MIN_VALUE;
                    return this.f91560e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91557a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.n.a.C2017a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$n$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.n.a.C2017a) r0
                    int r1 = r0.f91559d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91559d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$n$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$n$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91558c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91559d
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
                    TJ.h r6 = r4.f91557a
                    Uj.f$f r5 = (Uj.f.C1845f) r5
                    Uj.f$e r5 = r5.d()
                    r0.f91559d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.n.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public n(C16532g gVar) {
            this.f91556a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91556a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUj/f$e;", "error", "LXH/N;", "<anonymous>", "(LUj/f$e;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$renderUiError$2", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<f.e, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91561c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91562d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91563e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f91563e = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            o oVar = new o(this.f91563e, eVar);
            oVar.f91562d = obj;
            return oVar;
        }

        /* renamed from: i */
        public final Object invoke(f.e eVar, C17164e<? super C16807N> eVar2) {
            return ((o) create(eVar, eVar2)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                eI.C17187b.f()
                int r0 = r6.f91561c
                if (r0 != 0) goto L_0x011e
                XH.y.b(r7)
                java.lang.Object r7 = r6.f91562d
                Uj.f$e r7 = (Uj.f.e) r7
                com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment r0 = r6.f91563e
                Uj.f r0 = r0.X0()
                Uj.f$d$p r1 = Uj.f.d.p.f88061a
                r0.S(r1)
                boolean r0 = r7 instanceof Uj.f.e.b
                if (r0 == 0) goto L_0x010d
                r0 = r7
                Uj.f$e$b r0 = (Uj.f.e.b) r0
                boolean r1 = r0 instanceof Uj.f.e.b.c
                if (r1 == 0) goto L_0x0033
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment$a r0 = com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment.f91342T
                com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment r1 = r6.f91563e
                Uj.f$e$b$c r7 = (Uj.f.e.b.c) r7
                java.lang.String r7 = r7.d()
                r0.h(r1, r7)
                goto L_0x0115
            L_0x0033:
                Uj.f$e$b$a r7 = Uj.f.e.b.a.f88066d
                boolean r7 = kotlin.jvm.internal.C17542s.e(r0, r7)
                if (r7 == 0) goto L_0x0044
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment$a r7 = com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment.f91342T
                com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment r0 = r6.f91563e
                r7.j(r0)
                goto L_0x0115
            L_0x0044:
                Uj.f$e$b$b r7 = Uj.f.e.b.C1842b.f88067d
                boolean r7 = kotlin.jvm.internal.C17542s.e(r0, r7)
                if (r7 != 0) goto L_0x0077
                Uj.f$e$b$d r7 = Uj.f.e.b.d.f88069d
                boolean r7 = kotlin.jvm.internal.C17542s.e(r0, r7)
                if (r7 != 0) goto L_0x0077
                boolean r7 = r0 instanceof Uj.f.e.b.C1843e
                if (r7 != 0) goto L_0x0077
                Uj.f$e$b$f r7 = Uj.f.e.b.C1844f.f88075d
                boolean r7 = kotlin.jvm.internal.C17542s.e(r0, r7)
                if (r7 != 0) goto L_0x0077
                Uj.f$e$b$h r7 = Uj.f.e.b.h.f88081d
                boolean r7 = kotlin.jvm.internal.C17542s.e(r0, r7)
                if (r7 != 0) goto L_0x0077
                Uj.f$e$b$g r7 = Uj.f.e.b.g.f88076d
                boolean r7 = kotlin.jvm.internal.C17542s.e(r0, r7)
                if (r7 == 0) goto L_0x0071
                goto L_0x0077
            L_0x0071:
                XH.t r7 = new XH.t
                r7.<init>()
                throw r7
            L_0x0077:
                com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment$a r7 = com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment.f91342T
                com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment r1 = r6.f91563e
                android.content.Context r1 = r1.requireContext()
                java.lang.String r2 = "requireContext(...)"
                kotlin.jvm.internal.C17542s.i(r1, r2)
                hl.a r3 = r0.c()
                boolean r4 = r3 instanceof hl.C11367a.b
                r5 = 0
                if (r4 == 0) goto L_0x008f
            L_0x008d:
                r1 = r5
                goto L_0x00b6
            L_0x008f:
                boolean r4 = r3 instanceof hl.C11367a.c
                if (r4 == 0) goto L_0x009a
                hl.a$c r3 = (hl.C11367a.c) r3
                java.lang.String r1 = r3.a()
                goto L_0x00b6
            L_0x009a:
                boolean r4 = r3 instanceof hl.C11367a.d
                if (r4 == 0) goto L_0x00a9
                hl.a$d r3 = (hl.C11367a.d) r3
                int r3 = r3.a()
                java.lang.String r1 = r1.getString(r3)
                goto L_0x00b6
            L_0x00a9:
                if (r3 != 0) goto L_0x00ac
                goto L_0x008d
            L_0x00ac:
                boolean r1 = r3 instanceof hl.C11367a.e
                if (r1 == 0) goto L_0x0107
                hl.a$e r3 = (hl.C11367a.e) r3
                android.text.SpannableStringBuilder r1 = r3.a()
            L_0x00b6:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment r3 = r6.f91563e
                android.content.Context r3 = r3.requireContext()
                kotlin.jvm.internal.C17542s.i(r3, r2)
                hl.a r2 = r0.b()
                boolean r4 = r2 instanceof hl.C11367a.b
                if (r4 == 0) goto L_0x00cc
                goto L_0x00f3
            L_0x00cc:
                boolean r4 = r2 instanceof hl.C11367a.c
                if (r4 == 0) goto L_0x00d7
                hl.a$c r2 = (hl.C11367a.c) r2
                java.lang.String r5 = r2.a()
                goto L_0x00f3
            L_0x00d7:
                boolean r4 = r2 instanceof hl.C11367a.d
                if (r4 == 0) goto L_0x00e6
                hl.a$d r2 = (hl.C11367a.d) r2
                int r2 = r2.a()
                java.lang.String r5 = r3.getString(r2)
                goto L_0x00f3
            L_0x00e6:
                if (r2 != 0) goto L_0x00e9
                goto L_0x00f3
            L_0x00e9:
                boolean r3 = r2 instanceof hl.C11367a.e
                if (r3 == 0) goto L_0x0101
                hl.a$e r2 = (hl.C11367a.e) r2
                android.text.SpannableStringBuilder r5 = r2.a()
            L_0x00f3:
                java.lang.String r2 = java.lang.String.valueOf(r5)
                int r0 = r0.a()
                com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment r3 = r6.f91563e
                r7.f(r3, r2, r1, r0)
                goto L_0x0115
            L_0x0101:
                XH.t r7 = new XH.t
                r7.<init>()
                throw r7
            L_0x0107:
                XH.t r7 = new XH.t
                r7.<init>()
                throw r7
            L_0x010d:
                Uj.f$e$a r0 = Uj.f.e.a.f88062a
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r0)
                if (r7 == 0) goto L_0x0118
            L_0x0115:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x0118:
                XH.t r7 = new XH.t
                r7.<init>()
                throw r7
            L_0x011e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$setNavigationResultListeners$$inlined$consumeResult$1", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    public static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<C13049o.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91564c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91565d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f91566e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f91567f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91568g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(C8948l lVar, String str, C17164e eVar, CollectProductScannerFragment collectProductScannerFragment) {
            super(2, eVar);
            this.f91566e = lVar;
            this.f91567f = str;
            this.f91568g = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            p pVar = new p(this.f91566e, this.f91567f, eVar, this.f91568g);
            pVar.f91565d = obj;
            return pVar;
        }

        /* renamed from: i */
        public final Object invoke(C13049o.a aVar, C17164e<? super C16807N> eVar) {
            return ((p) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91564c == 0) {
                XH.y.b(obj);
                Object obj2 = this.f91565d;
                if (obj2 != null) {
                    C13049o.a aVar = (C13049o.a) obj2;
                    if (!(aVar instanceof C13049o.a.C2686a)) {
                        if (aVar instanceof C13049o.a.c) {
                            C13049o.a.c cVar = (C13049o.a.c) aVar;
                            this.f91568g.X0().S(new f.d.g(cVar.a(), cVar.b()));
                        } else if (aVar instanceof C13049o.a.b) {
                            this.f91568g.X0().S(new f.d.o(true));
                        } else if (aVar instanceof C13049o.a.f) {
                            Ar.j a12 = this.f91568g.a1();
                            Context requireContext = this.f91568g.requireContext();
                            C17542s.i(requireContext, "requireContext(...)");
                            C11853d.j(a12, requireContext, new q(this.f91568g));
                        } else if (aVar instanceof C13049o.a.e) {
                            C13049o.a.e eVar = (C13049o.a.e) aVar;
                            this.f91568g.X0().S(new f.d.h(eVar.a(), eVar.b()));
                        } else {
                            throw new XH.t();
                        }
                    }
                    this.f91566e.h().m(this.f91567f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class q implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91569a;

        q(CollectProductScannerFragment collectProductScannerFragment) {
            this.f91569a = collectProductScannerFragment;
        }

        public final void a() {
            this.f91569a.U0();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class r implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91570a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91571a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$setUpScanner$$inlined$map$1$2", f = "CollectProductScannerFragment.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$r$a$a  reason: collision with other inner class name */
            public static final class C2018a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91572c;

                /* renamed from: d  reason: collision with root package name */
                int f91573d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91574e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2018a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91574e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91572c = obj;
                    this.f91573d |= Integer.MIN_VALUE;
                    return this.f91574e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91571a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.r.a.C2018a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$r$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.r.a.C2018a) r0
                    int r1 = r0.f91573d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91573d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$r$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$r$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91572c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91573d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0054
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f91571a
                    Uj.f$f r5 = (Uj.f.C1845f) r5
                    boolean r2 = r5.c()
                    if (r2 == 0) goto L_0x0046
                    Uj.f$c r5 = r5.f()
                    if (r5 != 0) goto L_0x0046
                    r5 = r3
                    goto L_0x0047
                L_0x0046:
                    r5 = 0
                L_0x0047:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f91573d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0054
                    return r1
                L_0x0054:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment.r.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public r(C16532g gVar) {
            this.f91570a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91570a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$setUpScanner$1", f = "CollectProductScannerFragment.kt", l = {199}, m = "invokeSuspend")
    static final class s extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91575c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91576d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$setUpScanner$1$1", f = "CollectProductScannerFragment.kt", l = {200, 205}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f91577c;

            /* renamed from: d  reason: collision with root package name */
            int f91578d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ CollectProductScannerFragment f91579e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$s$a$a  reason: collision with other inner class name */
            static final class C2019a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CollectProductScannerFragment f91580a;

                C2019a(CollectProductScannerFragment collectProductScannerFragment) {
                    this.f91580a = collectProductScannerFragment;
                }

                /* renamed from: c */
                public final Object emit(za.a aVar, C17164e<? super C16807N> eVar) {
                    Uj.f P02 = this.f91580a.X0();
                    int i10 = aVar.f58575a;
                    String str = aVar.f58576b;
                    C17542s.i(str, "rawValue");
                    P02.S(new f.d.j(i10, str));
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f91579e = collectProductScannerFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f91579e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                CameraPreviewOverlay cameraPreviewOverlay;
                Object f10 = C17187b.f();
                int i10 = this.f91578d;
                if (i10 == 0) {
                    XH.y.b(obj);
                    Hj.t e12 = this.f91579e.e1();
                    ConstraintLayout b10 = this.f91579e.V0().getRoot();
                    C17542s.i(b10, "getRoot(...)");
                    View view = this.f91579e.V0().f110117y;
                    C17542s.i(view, "viewport");
                    CameraPreview cameraPreview = this.f91579e.V0().f110104l;
                    C17542s.i(cameraPreview, "cameraPreview");
                    cameraPreviewOverlay = this.f91579e.V0().f110105m;
                    C17542s.i(cameraPreviewOverlay, "cameraPreviewOverlay");
                    this.f91577c = cameraPreviewOverlay;
                    this.f91578d = 1;
                    obj = e12.s(b10, view, cameraPreview, cameraPreviewOverlay, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    cameraPreviewOverlay = (CameraPreviewOverlay) this.f91577c;
                    XH.y.b(obj);
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    CameraPreviewOverlay cameraPreviewOverlay2 = (CameraPreviewOverlay) this.f91577c;
                    XH.y.b(obj);
                    throw new C16820k();
                }
                C2019a aVar = new C2019a(this.f91579e);
                this.f91577c = cameraPreviewOverlay;
                this.f91578d = 2;
                if (((C16509F) obj).collect(aVar, this) == f10) {
                    return f10;
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super s> eVar) {
            super(2, eVar);
            this.f91576d = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new s(this.f91576d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((s) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91575c;
            if (i10 == 0) {
                XH.y.b(obj);
                CollectProductScannerFragment collectProductScannerFragment = this.f91576d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(collectProductScannerFragment, (C17164e<? super a>) null);
                this.f91575c = 1;
                if (androidx.lifecycle.Q.b(collectProductScannerFragment, bVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldCameraBeOn", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.CollectProductScannerFragment$setUpScanner$3", f = "CollectProductScannerFragment.kt", l = {}, m = "invokeSuspend")
    static final class t extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91581c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f91582d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CollectProductScannerFragment f91583e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(CollectProductScannerFragment collectProductScannerFragment, C17164e<? super t> eVar) {
            super(2, eVar);
            this.f91583e = collectProductScannerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            t tVar = new t(this.f91583e, eVar);
            tVar.f91582d = ((Boolean) obj).booleanValue();
            return tVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((t) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91581c == 0) {
                XH.y.b(obj);
                boolean z10 = this.f91582d;
                Button button = this.f91583e.V0().f110109q;
                C17542s.i(button, "manualArticleNumber");
                button.setVisibility(z10 ? 0 : 8);
                this.f91583e.V0().f110105m.setMode(z10 ? CameraPreviewOverlay.b.C2046b.f92339a : CameraPreviewOverlay.b.a.f92338a);
                this.f91583e.D1(z10);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class u extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91584c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(C5187o oVar) {
            super(0);
            this.f91584c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91584c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class v extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91585c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(C17631a aVar) {
            super(0);
            this.f91585c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91585c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class w extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91586c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(C16824o oVar) {
            super(0);
            this.f91586c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91586c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class x extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91587c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91588d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91587c = aVar;
            this.f91588d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91587c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91588d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class y extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91589c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91590d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91589c = oVar;
            this.f91590d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91590d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91589c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CollectProductScannerFragment() {
        C16824o a10 = C16825p.a(XH.s.NONE, new v(new u(this)));
        this.f91498T = W.b(this, P.b(Uj.f.class), new w(a10), new x((C17631a) null, a10), new y(this, a10));
        this.f91499U = true;
        C5314c<String> registerForActivityResult = registerForActivityResult(new C5405c(), new C11895c(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f91495C0 = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public static final void A1(CollectProductScannerFragment collectProductScannerFragment, View view) {
        collectProductScannerFragment.X0().S(new f.d.m(Interaction$Component.SCANNER));
    }

    /* access modifiers changed from: private */
    public final void B1(String str, int i10) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("showProductCollectedAnimation", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = CollectProductScannerFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        W0().a(androidx.navigation.fragment.a.a(this), str, i10);
        W0().b(this, Y0(), new C11902j(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N C1(CollectProductScannerFragment collectProductScannerFragment) {
        C8951o f10 = rw.f.f(collectProductScannerFragment, collectProductScannerFragment.Y0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void D1(boolean z10) {
        if (z10) {
            e1().u(new C11897e(this));
        } else {
            e1().x();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E1(CollectProductScannerFragment collectProductScannerFragment, Throwable th2) {
        C17542s.j(th2, "it");
        collectProductScannerFragment.X0().S(new f.d.k(th2));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void U0() {
        C8951o f10 = rw.f.f(this, Y0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
    }

    /* access modifiers changed from: private */
    public final Fz.e V0() {
        Fz.e eVar = this.f91497S;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final Uj.f X0() {
        return (Uj.f) this.f91498T.getValue();
    }

    private final void f1() {
        C16532g s10 = C16534i.s(new a(X0().getState()));
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g R10 = C16534i.R(C5208k.a(s10, lifecycle, r.b.STARTED), new b(this, (C17164e<? super b>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final F0 g1() {
        C16532g s10 = C16534i.s(new c(X0().getState()));
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g R10 = C16534i.R(C5208k.a(s10, lifecycle, r.b.STARTED), new d(this, (C17164e<? super d>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void h1() {
        C16532g s10 = C16534i.s(new e(X0().getState()));
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g R10 = C16534i.R(C5208k.a(s10, lifecycle, r.b.STARTED), new f(this, (C17164e<? super f>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final F0 i1() {
        C16532g s10 = C16534i.s(new g(X0().getState()));
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g R10 = C16534i.R(C5208k.a(s10, lifecycle, r.b.STARTED), new h(this, (C17164e<? super h>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void j1(com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a aVar) {
        if (C17542s.e(aVar, a.C2000a.f91360a)) {
            return;
        }
        if (C17542s.e(aVar, a.b.f91362a)) {
            X0().S(f.d.c.a.f88044a);
        } else if (C17542s.e(aVar, a.c.f91364a)) {
            X0().S(f.d.c.b.f88045a);
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l1(CollectProductScannerFragment collectProductScannerFragment, oj.i iVar, com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a aVar) {
        C17542s.j(iVar, "type");
        C17542s.j(aVar, "action");
        collectProductScannerFragment.X0().S(new f.d.o(true));
        if (!(iVar instanceof i.b) && !(iVar instanceof i.c) && !(iVar instanceof i.d)) {
            if (iVar instanceof i.a) {
                collectProductScannerFragment.j1(aVar);
            } else {
                throw new XH.t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void m1(CollectProductScannerFragment collectProductScannerFragment, View view) {
        androidx.navigation.fragment.a.a(collectProductScannerFragment).k0();
    }

    /* access modifiers changed from: private */
    public static final void n1(CollectProductScannerFragment collectProductScannerFragment, Boolean bool) {
        C17542s.j(bool, "hasPermission");
        collectProductScannerFragment.X0().S(new f.d.i(bool.booleanValue()));
    }

    private final void o1(String str) {
        ImageView imageView = V0().f110111s;
        C17542s.i(imageView, "productImage");
        if (str == null || C15854t.v0(str)) {
            C10309b.f77164a.b(imageView);
            return;
        }
        C11239c.a.d(C10309b.f77164a, imageView, str, (g.b) null, new C11901i(imageView), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N p1(ImageView imageView, g.a aVar) {
        C17542s.j(aVar, "$this$load");
        aVar.h(C16877v.e(new g.d.C1430d(imageView.getHeight(), imageView.getHeight())));
        return C16807N.f139792a;
    }

    private final void q1() {
        C16532g s10 = C16534i.s(new j(X0().getState()));
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g R10 = C16534i.R(C5208k.a(s10, lifecycle, r.b.STARTED), new k(this, (C17164e<? super k>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    public final void r1(C15014g gVar) {
        Fz.e V02 = V0();
        if (gVar == null) {
            ConstraintLayout constraintLayout = V02.f110103k;
            C17542s.i(constraintLayout, "bottomCardView");
            constraintLayout.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout2 = V02.f110103k;
        C17542s.i(constraintLayout2, "bottomCardView");
        constraintLayout2.setVisibility(0);
        V02.f110112t.setText(gVar.g().e().i());
        V02.f110110r.setText(gVar.g().e().c());
        o1(gVar.g().d().getUrl());
        V02.f110099g.setText(il.g.f98371a.a(gVar.g().f()));
        C15026t c10 = gVar.c();
        if (c10 instanceof C15026t.a) {
            Group group = V02.f110095c;
            C17542s.i(group, "aisleBinGroup");
            group.setVisibility(0);
            TextView textView = V02.f110108p;
            C17542s.i(textView, "itemLocationDepartment");
            textView.setVisibility(8);
            C15026t.a aVar = (C15026t.a) c10;
            V02.f110096d.setText(aVar.a());
            V02.f110102j.setText(aVar.b());
        } else if (c10 instanceof C15026t.b) {
            Group group2 = V02.f110095c;
            C17542s.i(group2, "aisleBinGroup");
            group2.setVisibility(8);
            TextView textView2 = V02.f110108p;
            C17542s.i(textView2, "itemLocationDepartment");
            textView2.setVisibility(0);
            V02.f110108p.setText(((C15026t.b) c10).a());
        } else if (C17542s.e(c10, C15026t.c.f130895a)) {
            Group group3 = V02.f110095c;
            C17542s.i(group3, "aisleBinGroup");
            group3.setVisibility(8);
            TextView textView3 = V02.f110108p;
            C17542s.i(textView3, "itemLocationDepartment");
            textView3.setVisibility(8);
        } else {
            throw new XH.t();
        }
        V02.f110113u.setText(getString(Ez.f.f109709l, Integer.valueOf(gVar.h().c())));
    }

    private final void s1() {
        C16532g s10 = C16534i.s(new l(X0().getState()));
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g R10 = C16534i.R(C5208k.a(s10, lifecycle, r.b.STARTED), new m(this, (C17164e<? super m>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void t1() {
        C16532g s10 = C16534i.s(new n(X0().getState()));
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g R10 = C16534i.R(C5208k.a(s10, lifecycle, r.b.STARTED), new o(this, (C17164e<? super o>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void u1() {
        C8948l E10 = androidx.navigation.fragment.a.a(this).E(Y0());
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("product_detail_request_key", null), E10.getLifecycle(), r.b.RESUMED), new p(E10, "product_detail_request_key", (C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        RationalePermissionPromptNavigation d12 = d1();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        d12.a(parentFragmentManager, this, new C11896d(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N v1(CollectProductScannerFragment collectProductScannerFragment, RationalePermissionPromptNavigation.Result result) {
        C17542s.j(result, "it");
        if (!C17542s.e(result, RationalePermissionPromptNavigation.Result.c.f92054a)) {
            if (C17542s.e(result, RationalePermissionPromptNavigation.Result.d.f92056a)) {
                collectProductScannerFragment.startActivity(collectProductScannerFragment.Z0().c());
            } else if (C17542s.e(result, RationalePermissionPromptNavigation.Result.b.f92052a) || C17542s.e(result, RationalePermissionPromptNavigation.Result.a.f92050a)) {
                collectProductScannerFragment.U0();
            } else {
                throw new XH.t();
            }
        }
        return C16807N.f139792a;
    }

    private final void w1() {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new s(this, (C17164e<? super s>) null), 3, (Object) null);
        C16532g s10 = C16534i.s(new r(X0().getState()));
        androidx.lifecycle.r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g R10 = C16534i.R(C5208k.a(s10, lifecycle, r.b.STARTED), new t(this, (C17164e<? super t>) null));
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner2));
    }

    private final void x1() {
        Fz.e V02 = V0();
        b(new C11898f(V02));
        V02.f110106n.setOnClickListener(new C11899g(this));
        V02.f110109q.setVisibility(0);
        V02.f110109q.setOnClickListener(new C11900h(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N y1(Fz.e eVar, jC.q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        ImageButton imageButton = eVar.f110100h;
        C17542s.i(imageButton, "back");
        C14617d dVar = C14617d.Margin;
        qVar.e(imageButton, dVar);
        ImageButton imageButton2 = eVar.f110106n;
        C17542s.i(imageButton2, "help");
        qVar.e(imageButton2, dVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void z1(CollectProductScannerFragment collectProductScannerFragment, View view) {
        collectProductScannerFragment.X0().S(f.d.l.f88057a);
    }

    public final C13035a W0() {
        C13035a aVar = this.f91493A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("collectProductNavigation");
        return null;
    }

    public String Y0() {
        return this.f91496R;
    }

    public final am.d Z0() {
        am.d dVar = this.f91502Z;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("deviceIntentProvider");
        return null;
    }

    public final Ar.j a1() {
        Ar.j jVar = this.f91501Y;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final C12128a b1() {
        C12128a aVar = this.f91494B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("helpDialogNavigation");
        return null;
    }

    public final C13049o c1() {
        C13049o oVar = this.f91504z0;
        if (oVar != null) {
            return oVar;
        }
        C17542s.z("productInfoPageNavigation");
        return null;
    }

    public final RationalePermissionPromptNavigation d1() {
        RationalePermissionPromptNavigation rationalePermissionPromptNavigation = this.f91503y0;
        if (rationalePermissionPromptNavigation != null) {
            return rationalePermissionPromptNavigation;
        }
        C17542s.z("rationalePermissionPromptNavigation");
        return null;
    }

    public final Hj.t e1() {
        Hj.t tVar = this.f91500X;
        if (tVar != null) {
            return tVar;
        }
        C17542s.z("scanner");
        return null;
    }

    /* renamed from: k1 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Fz.e c10 = Fz.e.c(layoutInflater);
        this.f91497S = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        e1().t();
        this.f91497S = null;
        requireActivity().setRequestedOrientation(-1);
        requireActivity().getWindow().clearFlags(128);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Z().a().a(C14615b.c.f127858b);
        this.f91495C0.a("android.permission.CAMERA");
        w1();
        x1();
        u1();
        q1();
        s1();
        t1();
        f1();
        i1();
        h1();
        g1();
        ScanAndGoBottomSheetFragment.f91342T.c(this, new C11893a(this));
        V0().f110100h.setOnClickListener(new C11894b(this));
        requireActivity().setRequestedOrientation(1);
        requireActivity().getWindow().addFlags(128);
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner), (C17168i) null, (T) null, new i(this, (C17164e<? super i>) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f91499U;
    }
}
