package com.sugarcube.app.base.ui.ultrawide;

import JF.C13089K;
import JF.C13103j;
import JF.C13113u;
import JF.T;
import Ma.C9140b;
import OE.C13313e;
import OE.q;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.t;
import XH.y;
import YE.C13868b;
import android.app.Activity;
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
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import com.google.ar.core.ArCoreApk;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.common.R;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5314c;
import jF.C14633e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J:\u0010#\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010=\u001a\u0002068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideRoomFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Lkotlin/Function0;", "LXH/N;", "onPermissionGranted", "E0", "(Lcom/sugarcube/core/network/models/RoomType;LnI/a;)V", "y0", "(LnI/a;)V", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "Lcom/sugarcube/app/base/ui/ultrawide/I0;", "J", "LXH/o;", "B0", "()Lcom/sugarcube/app/base/ui/ultrawide/I0;", "model", "Lg/c;", "", "K", "Lg/c;", "requestPermissionLauncher", "LJF/j;", "L", "LJF/j;", "arManager", "M", "Lcom/sugarcube/core/network/models/RoomType;", "LOE/e;", "N", "LOE/e;", "A0", "()LOE/e;", "setInstallationConfig", "(LOE/e;)V", "installationConfig", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideRoomFragment extends C14292d implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f125517I = new T();

    /* renamed from: J  reason: collision with root package name */
    private final C16824o f125518J = W.b(this, P.b(I0.class), new d(this), new e((C17631a) null, this), new f(this));

    /* renamed from: K  reason: collision with root package name */
    private C5314c<String> f125519K;

    /* renamed from: L  reason: collision with root package name */
    private C13103j f125520L;

    /* renamed from: M  reason: collision with root package name */
    private RoomType f125521M;

    /* renamed from: N  reason: collision with root package name */
    public C13313e f125522N;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f125523a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f125524b;

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
                f125523a = r0
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
                f125524b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.UltrawideRoomFragment.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UltrawideRoomFragment f125525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ComposeView f125526b;

        b(UltrawideRoomFragment ultrawideRoomFragment, ComposeView composeView) {
            this.f125525a = ultrawideRoomFragment;
            this.f125526b = composeView;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(UltrawideRoomFragment ultrawideRoomFragment, ComposeView composeView, RoomType roomType) {
            C17542s.j(roomType, "roomType");
            I0 v02 = ultrawideRoomFragment.B0();
            RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
            Resources resources = composeView.getResources();
            C17542s.i(resources, "getResources(...)");
            v02.V1(roomType, roomTypeRenderer.getTitle(roomType, resources));
            ultrawideRoomFragment.E0(roomType, new C14301h0(ultrawideRoomFragment));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(UltrawideRoomFragment ultrawideRoomFragment) {
            ultrawideRoomFragment.C0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(UltrawideRoomFragment ultrawideRoomFragment) {
            C5191t activity = ultrawideRoomFragment.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return C16807N.f139792a;
        }

        public final void e(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1717895235, i10, -1, "com.sugarcube.app.base.ui.ultrawide.UltrawideRoomFragment.onCreateView.<anonymous>.<anonymous> (UltrawideRoomFragment.kt:104)");
                }
                List<RoomType> allValidRoomTypes = RoomTypeRenderer.INSTANCE.getAllValidRoomTypes(RoomType.Companion);
                mVar.W(1157146796);
                boolean F10 = mVar.F(this.f125525a) | mVar.F(this.f125526b);
                UltrawideRoomFragment ultrawideRoomFragment = this.f125525a;
                ComposeView composeView = this.f125526b;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C14297f0(ultrawideRoomFragment, composeView);
                    mVar.u(D10);
                }
                C17642l lVar = (C17642l) D10;
                mVar.P();
                mVar.W(1157155828);
                boolean F11 = mVar.F(this.f125525a);
                UltrawideRoomFragment ultrawideRoomFragment2 = this.f125525a;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new C14299g0(ultrawideRoomFragment2);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideRoomFragment$onRoomTypeSelected$2", f = "UltrawideRoomFragment.kt", l = {137}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125527c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArCoreApk.Availability f125528d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UltrawideRoomFragment f125529e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f125530f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ArCoreApk.Availability availability, UltrawideRoomFragment ultrawideRoomFragment, C17631a<C16807N> aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f125528d = availability;
            this.f125529e = ultrawideRoomFragment;
            this.f125530f = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C17631a aVar) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f125528d, this.f125529e, this.f125530f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125527c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f125528d == ArCoreApk.Availability.UNKNOWN_CHECKING) {
                    long millis = TimeUnit.SECONDS.toMillis(1);
                    this.f125527c = 1;
                    if (C16297b0.b(millis, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f125529e.y0(new C14303i0(this.f125530f));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f125531c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f125531c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f125531c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f125532c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f125533d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C5187o oVar) {
            super(0);
            this.f125532c = aVar;
            this.f125533d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f125532c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f125533d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.UltrawideRoomFragment.e.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f125534c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar) {
            super(0);
            this.f125534c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f125534c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* access modifiers changed from: private */
    public final I0 B0() {
        return (I0) this.f125518J.getValue();
    }

    /* access modifiers changed from: private */
    public final void C0() {
        RoomType roomType = this.f125521M;
        if (roomType != null) {
            C8951o.f0(androidx.navigation.fragment.a.a(this), roomType == RoomType.OTHER ? Kreativ.Capture.b.INSTANCE : Kreativ.Capture.d.i.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
            this.f125521M = null;
        }
    }

    /* access modifiers changed from: private */
    public static final void D0(UltrawideRoomFragment ultrawideRoomFragment, Boolean bool) {
        if (bool.booleanValue()) {
            ultrawideRoomFragment.B0().u1().b().captureCameraPermissionAllow();
            C13868b.f118106a.b("ChooseRoomFragment - camera permission granted", YE.e.Capture);
            ultrawideRoomFragment.C0();
            return;
        }
        ultrawideRoomFragment.B0().u1().b().captureCameraPermissionDontAllow();
        C13868b.f118106a.b("ChooseRoomFragment - camera permission denied", YE.e.Capture);
    }

    /* access modifiers changed from: private */
    public final void E0(RoomType roomType, C17631a<C16807N> aVar) {
        this.f125521M = roomType;
        Context context = getContext();
        ArCoreApk.Availability checkAvailability = context != null ? ArCoreApk.getInstance().checkAvailability(context) : null;
        Log.d(AnyKt.SUGARCUBE_TAG, "UW checkAvailability = " + checkAvailability);
        if ((checkAvailability == null ? -1 : a.f125523a[checkAvailability.ordinal()]) == 1) {
            Context context2 = getContext();
            if (context2 != null) {
                new C9140b(context2, R.style.AlertDialogTheme).f("Device does not support AR services").D(new C14293d0(this)).p();
                return;
            }
            return;
        }
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new c(checkAvailability, this, aVar, (C17164e<? super c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void F0(UltrawideRoomFragment ultrawideRoomFragment, DialogInterface dialogInterface) {
        C5191t activity = ultrawideRoomFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public final void y0(C17631a<C16807N> aVar) {
        C5191t activity = getActivity();
        if (activity != null) {
            int i10 = a.f125524b[C13089K.d(activity, "android.permission.CAMERA").ordinal()];
            if (i10 == 1) {
                C13868b.f118106a.b("ChooseRoomFragment: camera permission granted", YE.e.Capture);
                if (this.f125520L == null) {
                    q u12 = B0().u1();
                    C13313e A02 = A0();
                    r lifecycle = getLifecycle();
                    C17542s.i(lifecycle, "<get-lifecycle>(...)");
                    this.f125520L = new C13103j(activity, u12, A02, lifecycle, new C14295e0(aVar));
                    return;
                }
                aVar.invoke();
            } else if (i10 == 2) {
                C13868b.f118106a.b("ChooseRoomFragment: camera permission rationale", YE.e.Capture);
                C13089K.e(activity);
            } else if (i10 == 3) {
                C13868b.f118106a.b("ChooseRoomFragment: camera permission denied", YE.e.Capture);
                C5314c<String> cVar = this.f125519K;
                if (cVar != null) {
                    cVar.a("android.permission.CAMERA");
                }
            } else {
                throw new t();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z0(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    public final C13313e A0() {
        C13313e eVar = this.f125522N;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("installationConfig");
        return null;
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f125517I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r5 = r5.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.os.Bundle r5 = r4.getArguments()
            r0 = 0
            if (r5 == 0) goto L_0x001c
            java.util.Set r5 = r5.keySet()
            if (r5 == 0) goto L_0x001c
            java.util.Collection r5 = (java.util.Collection) r5
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r5 = r5.toArray(r1)
            java.lang.String[] r5 = (java.lang.String[]) r5
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            java.lang.String r5 = java.util.Arrays.toString(r5)
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r5, r1)
            android.os.Bundle r1 = r4.getArguments()
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = r1.toString()
        L_0x0030:
            android.net.Uri r1 = cF.C14041c.b(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n                UltrawideRoomFragment.arguments("
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
            com.sugarcube.app.base.ui.ultrawide.c0 r0 = new com.sugarcube.app.base.ui.ultrawide.c0
            r0.<init>(r4)
            g.c r5 = r4.registerForActivityResult(r5, r0)
            r4.f125519K = r5
            com.sugarcube.app.base.ui.ultrawide.I0 r5 = r4.B0()
            OE.q r5 = r5.u1()
            com.sugarcube.app.base.data.analytics.Analytics r5 = r5.b()
            r5.captureRoomStart()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.UltrawideRoomFragment.onCreate(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        installSystemUiDelegate(requireActivity, viewLifecycleOwner, false, false, 0);
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C13113u.h(composeView, (C5747v0) null, c1.c.c(-1717895235, true, new b(this, composeView)), 1, (Object) null);
        return composeView;
    }
}
