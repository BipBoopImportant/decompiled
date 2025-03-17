package com.sugarcube.app.base.ui.capturev2;

import JF.C13113u;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import YE.C13868b;
import YE.e;
import YH.X;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C5191t;
import c1.c;
import com.google.ar.core.ArCoreApk;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.core.analytics.BaseEventProperty;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.RoomType;
import hF.C14540b;
import hF.C14542d;
import jF.C14633e;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import sF.j;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\u00178\u0014X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/RoomFragment;", "Lcom/sugarcube/app/base/ui/capturev2/PermissionsFragment;", "<init>", "()V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "LXH/N;", "T0", "(Lcom/sugarcube/core/network/models/RoomType;)V", "", "msg", "S0", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "M0", "LhF/b;", "T", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "U", "Lcom/sugarcube/core/network/models/RoomType;", "selectedRoom", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoomFragment extends Hilt_RoomFragment {

    /* renamed from: T  reason: collision with root package name */
    private final C14540b f123569T = C14540b.Room;

    /* renamed from: U  reason: collision with root package name */
    private RoomType f123570U;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RoomFragment f123571a;

        a(RoomFragment roomFragment) {
            this.f123571a = roomFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(RoomFragment roomFragment, RoomType roomType) {
            C17542s.j(roomType, "it");
            roomFragment.T0(roomType);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(RoomFragment roomFragment) {
            BaseFragment.z0(roomFragment, C14542d.Exit, (Trackable) null, 2, (Object) null);
            h1.y1(roomFragment.n0(), (C14540b) null, 1, (Object) null);
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(638042038, i10, -1, "com.sugarcube.app.base.ui.capturev2.RoomFragment.onCreateView.<anonymous>.<anonymous> (RoomFragment.kt:42)");
                }
                mVar.W(1896168650);
                if (this.f123571a.n0().b1()) {
                    j.c(6, mVar, 6);
                }
                mVar.P();
                List<RoomType> allValidRoomTypes = RoomTypeRenderer.INSTANCE.getAllValidRoomTypes(RoomType.Companion);
                mVar.W(1896177203);
                boolean F10 = mVar.F(this.f123571a);
                RoomFragment roomFragment = this.f123571a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new L0(roomFragment);
                    mVar.u(D10);
                }
                C17642l lVar = (C17642l) D10;
                mVar.P();
                mVar.W(1896179920);
                boolean F11 = mVar.F(this.f123571a);
                RoomFragment roomFragment2 = this.f123571a;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new M0(roomFragment2);
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
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    private final void S0(String str) {
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, e.Capture);
    }

    /* access modifiers changed from: private */
    public final void T0(RoomType roomType) {
        C14542d dVar = C14542d.Selected;
        TrackingKey trackingKey = TrackingKey.SelectedRoomType;
        String upperCase = roomType.getApiKey().toUpperCase(Locale.ROOT);
        C17542s.i(upperCase, "toUpperCase(...)");
        y0(dVar, new BaseEventProperty(X.l(C16796C.a(trackingKey, upperCase))));
        if (roomType == RoomType.OTHER) {
            h1 n02 = n0();
            RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
            Resources resources = getResources();
            C17542s.i(resources, "getResources(...)");
            n02.I1(roomType, roomTypeRenderer.getTitle(roomType, resources));
            return;
        }
        this.f123570U = roomType;
        I0();
    }

    /* access modifiers changed from: protected */
    public void M0() {
        Q0(false);
        RoomType roomType = this.f123570U;
        if (roomType != null) {
            this.f123570U = null;
            h1 n02 = n0();
            RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
            Resources resources = getResources();
            C17542s.i(resources, "getResources(...)");
            n02.I1(roomType, roomTypeRenderer.getTitle(roomType, resources));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Q0(false);
        ArCoreApk.Availability availability = null;
        C13113u.h(composeView, (C5747v0) null, c.c(638042038, true, new a(this)), 1, (Object) null);
        C5191t activity = getActivity();
        if (activity != null) {
            availability = ArCoreApk.getInstance().checkAvailability(activity);
        }
        S0("RoomFragment.checkAvailability = " + availability);
        return composeView;
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123569T;
    }
}
