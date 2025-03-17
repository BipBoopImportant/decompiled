package com.sugarcube.app.base.ui.selection;

import IF.c;
import JF.C13089K;
import JF.C13113u;
import Ma.C9140b;
import OE.q;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.t;
import YE.C13868b;
import YE.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C5191t;
import cF.C14046h;
import com.google.ar.core.ArCoreApk;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.common.R;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.RoomType;
import g.C5314c;
import jF.C14633e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import x4.C;
import x4.C8951o;
import x4.I;
import x4.P;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001d¨\u0006."}, d2 = {"Lcom/sugarcube/app/base/ui/selection/ChooseRoomFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Lkotlin/Function0;", "LXH/N;", "onPermissionGranted", "A0", "(Lcom/sugarcube/core/network/models/RoomType;LnI/a;)V", "w0", "(LnI/a;)V", "D0", "(Lcom/sugarcube/core/network/models/RoomType;)V", "y0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "LOE/q;", "I", "LOE/q;", "x0", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "J", "Lcom/sugarcube/core/network/models/RoomType;", "Lg/c;", "", "K", "Lg/c;", "requestPermissionLauncher", "", "L", "previousScreenOrientationFlag", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ChooseRoomFragment extends Hilt_ChooseRoomFragment {

    /* renamed from: I  reason: collision with root package name */
    public q f125161I;

    /* renamed from: J  reason: collision with root package name */
    private RoomType f125162J;

    /* renamed from: K  reason: collision with root package name */
    private C5314c<String> f125163K;

    /* renamed from: L  reason: collision with root package name */
    private int f125164L = -1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f125165a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f125166b;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
        static {
            /*
                com.google.ar.core.ArCoreApk$Availability[] r0 = com.google.ar.core.ArCoreApk.Availability.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.google.ar.core.ArCoreApk$Availability r2 = com.google.ar.core.ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f125165a = r0
                JF.L[] r0 = JF.C13090L.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                JF.L r2 = JF.C13090L.PERMISSION_GRANTED     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                JF.L r1 = JF.C13090L.CAN_ASK_PERMISSION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                JF.L r1 = JF.C13090L.PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                f125166b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.selection.ChooseRoomFragment.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChooseRoomFragment f125167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ComposeView f125168b;

        b(ChooseRoomFragment chooseRoomFragment, ComposeView composeView) {
            this.f125167a = chooseRoomFragment;
            this.f125168b = composeView;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(ChooseRoomFragment chooseRoomFragment, RoomType roomType) {
            C17542s.j(roomType, "roomType");
            chooseRoomFragment.A0(roomType, new c(chooseRoomFragment));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(ChooseRoomFragment chooseRoomFragment) {
            chooseRoomFragment.y0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(ComposeView composeView) {
            P.a(composeView).k0();
            return C16807N.f139792a;
        }

        public final void e(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1550372670, i10, -1, "com.sugarcube.app.base.ui.selection.ChooseRoomFragment.onCreateView.<anonymous>.<anonymous> (ChooseRoomFragment.kt:96)");
                }
                List<RoomType> allValidRoomTypes = RoomTypeRenderer.INSTANCE.getAllValidRoomTypes(RoomType.Companion);
                mVar.W(1330879101);
                boolean F10 = mVar.F(this.f125167a);
                ChooseRoomFragment chooseRoomFragment = this.f125167a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(chooseRoomFragment);
                    mVar.u(D10);
                }
                C17642l lVar = (C17642l) D10;
                mVar.P();
                mVar.W(1330885600);
                boolean F11 = mVar.F(this.f125168b);
                ComposeView composeView = this.f125168b;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new b(composeView);
                    mVar.u(D11);
                }
                mVar.P();
                C14633e.e(allValidRoomTypes, lVar, (C17631a) D11, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final void A0(RoomType roomType, C17631a<C16807N> aVar) {
        this.f125162J = roomType;
        Context context = getContext();
        ArCoreApk.Availability checkAvailability = context != null ? ArCoreApk.getInstance().checkAvailability(context) : null;
        Log.d(AnyKt.SUGARCUBE_TAG, "checkAvailability = " + checkAvailability);
        if ((checkAvailability == null ? -1 : a.f125165a[checkAvailability.ordinal()]) == 1) {
            Context context2 = getContext();
            if (context2 != null) {
                new C9140b(context2, R.style.AlertDialogTheme).f("Device does not support AR services").D(new IF.b(this)).p();
                return;
            }
            return;
        }
        w0(new c(aVar));
    }

    /* access modifiers changed from: private */
    public static final void B0(ChooseRoomFragment chooseRoomFragment, DialogInterface dialogInterface) {
        C5191t activity = chooseRoomFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N C0(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    private final void D0(RoomType roomType) {
        Analytics b10 = x0().b();
        RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
        Resources resources = getResources();
        C17542s.i(resources, "getResources(...)");
        b10.captureRoomEnd(roomTypeRenderer.getTitle(roomType, resources), roomType);
        C8951o a10 = androidx.navigation.fragment.a.a(this);
        Kreativ.Capture.Hybrid hybrid = new Kreativ.Capture.Hybrid(roomType.getApiKey());
        C.a f10 = new C.a().b(R.anim.sc_slide_in_right).c(R.anim.sc_slide_out_left).e(R.anim.sc_slide_in_left).f(R.anim.sc_slide_out_right);
        f10.j(kotlin.jvm.internal.P.b(Kreativ.Capture.c.class), true, false);
        C14046h.c(a10, hybrid, f10.a());
    }

    private final void w0(C17631a<C16807N> aVar) {
        C5191t activity = getActivity();
        if (activity != null) {
            int i10 = a.f125166b[C13089K.d(activity, "android.permission.CAMERA").ordinal()];
            if (i10 == 1) {
                C13868b.f118106a.b("ChooseRoomFragment: camera permission granted", e.Capture);
                aVar.invoke();
            } else if (i10 == 2) {
                C13868b.f118106a.b("ChooseRoomFragment: camera permission rationale", e.Capture);
                C13089K.e(activity);
            } else if (i10 == 3) {
                C13868b.f118106a.b("ChooseRoomFragment: camera permission denied", e.Capture);
                C5314c<String> cVar = this.f125163K;
                if (cVar != null) {
                    cVar.a("android.permission.CAMERA");
                }
            } else {
                throw new t();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void y0() {
        RoomType roomType = this.f125162J;
        if (roomType == null) {
            return;
        }
        if (roomType == RoomType.OTHER) {
            C8951o.f0(androidx.navigation.fragment.a.a(this), Kreativ.Capture.b.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
        } else {
            D0(roomType);
        }
    }

    /* access modifiers changed from: private */
    public static final void z0(ChooseRoomFragment chooseRoomFragment, boolean z10) {
        if (z10) {
            chooseRoomFragment.x0().b().captureCameraPermissionAllow();
            C13868b.f118106a.b("ChooseRoomFragment - camera permission granted", e.Capture);
            chooseRoomFragment.y0();
            return;
        }
        chooseRoomFragment.x0().b().captureCameraPermissionDontAllow();
        C13868b.f118106a.b("ChooseRoomFragment - camera permission denied", e.Capture);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r5 = r5.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            androidx.fragment.app.t r5 = r4.requireActivity()
            android.view.Window r5 = r5.getWindow()
            r0 = 0
            I2.C4626o0.b(r5, r0)
            android.os.Bundle r5 = r4.getArguments()
            r1 = 0
            if (r5 == 0) goto L_0x0027
            java.util.Set r5 = r5.keySet()
            if (r5 == 0) goto L_0x0027
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r5 = r5.toArray(r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            goto L_0x0028
        L_0x0027:
            r5 = r1
        L_0x0028:
            java.lang.String r5 = java.util.Arrays.toString(r5)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r5, r0)
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r0.toString()
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            android.os.Bundle r2 = r4.getArguments()
            if (r2 == 0) goto L_0x004a
            java.lang.String r3 = "android-support-nav:controller:deepLinkIntent"
            java.lang.Object r2 = r2.get(r3)
            goto L_0x004b
        L_0x004a:
            r2 = r1
        L_0x004b:
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 == 0) goto L_0x0053
            android.net.Uri r1 = r2.getData()
        L_0x0053:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n                ChooseRoomFragment.arguments("
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ")\n                "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = "\n                deeplink="
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = "\n            "
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r0 = "Sugarcube"
            android.util.Log.d(r0, r5)
            h.c r5 = new h.c
            r5.<init>()
            IF.a r0 = new IF.a
            r0.<init>(r4)
            g.c r5 = r4.registerForActivityResult(r5, r0)
            r4.f125163K = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.selection.ChooseRoomFragment.onCreate(android.os.Bundle):void");
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C5191t activity = getActivity();
        if (activity != null) {
            this.f125164L = activity.getRequestedOrientation();
        }
        C5191t activity2 = getActivity();
        if (activity2 != null) {
            activity2.setRequestedOrientation(1);
        }
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C13113u.h(composeView, (C5747v0) null, c1.c.c(1550372670, true, new b(this, composeView)), 1, (Object) null);
        return composeView;
    }

    public void onDestroyView() {
        C5191t activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(this.f125164L);
        }
        super.onDestroyView();
    }

    public final q x0() {
        q qVar = this.f125161I;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }
}
