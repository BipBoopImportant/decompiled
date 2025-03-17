package com.sugarcube.app.base.ui.capturev2;

import I2.C4626o0;
import JF.C13113u;
import U0.C4889m;
import VE.C13760b;
import XH.C16807N;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.fragment.NavHostFragment;
import c1.c;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.network.models.RoomType;
import hF.C14540b;
import hF.C14542d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import p1.C5747v0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\u00158\u0014X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/RoomGuidanceFragment;", "Lcom/sugarcube/app/base/ui/capturev2/PermissionsFragment;", "<init>", "()V", "LXH/N;", "V0", "W0", "Y0", "X0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "M0", "LhF/b;", "T", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoomGuidanceFragment extends Hilt_RoomGuidanceFragment {

    /* renamed from: T  reason: collision with root package name */
    private final C14540b f123572T = C14540b.ScanningTips;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RoomGuidanceFragment f123573a;

        a(RoomGuidanceFragment roomGuidanceFragment) {
            this.f123573a = roomGuidanceFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(RoomGuidanceFragment roomGuidanceFragment) {
            roomGuidanceFragment.V0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(RoomGuidanceFragment roomGuidanceFragment) {
            roomGuidanceFragment.W0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(RoomGuidanceFragment roomGuidanceFragment) {
            roomGuidanceFragment.Y0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(RoomGuidanceFragment roomGuidanceFragment) {
            roomGuidanceFragment.X0();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(U0.C4889m r11, int r12) {
            /*
                r10 = this;
                r0 = r12 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r11.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r11.L()
                goto L_0x00f2
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment.onCreateView.<anonymous>.<anonymous> (RoomGuidanceFragment.kt:43)"
                r2 = -1249274426(0xffffffffb58995c6, float:-1.0250885E-6)
                U0.C4895p.S(r2, r12, r0, r1)
            L_0x0020:
                r12 = -1923044078(0xffffffff8d60ad12, float:-6.9233655E-31)
                r11.W(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r12 = r10.f123573a
                com.sugarcube.app.base.ui.capturev2.h1 r12 = r12.n0()
                boolean r12 = r12.b1()
                if (r12 == 0) goto L_0x0036
                r12 = 6
                sF.j.c(r12, r11, r12)
            L_0x0036:
                r11.P()
                r12 = -1923037296(0xffffffff8d60c790, float:-6.9265544E-31)
                r11.W(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r12 = r10.f123573a
                boolean r12 = r11.V(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r0 = r10.f123573a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x0055
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x005d
            L_0x0055:
                com.sugarcube.app.base.ui.capturev2.N0 r1 = new com.sugarcube.app.base.ui.capturev2.N0
                r1.<init>(r0)
                r11.u(r1)
            L_0x005d:
                r2 = r1
                nI.a r2 = (nI.C17631a) r2
                r11.P()
                r12 = -1923035885(0xffffffff8d60cd13, float:-6.927218E-31)
                r11.W(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r12 = r10.f123573a
                boolean r12 = r11.V(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r0 = r10.f123573a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x007f
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x0087
            L_0x007f:
                com.sugarcube.app.base.ui.capturev2.O0 r1 = new com.sugarcube.app.base.ui.capturev2.O0
                r1.<init>(r0)
                r11.u(r1)
            L_0x0087:
                r3 = r1
                nI.a r3 = (nI.C17631a) r3
                r11.P()
                r12 = -1923034348(0xffffffff8d60d314, float:-6.9279405E-31)
                r11.W(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r12 = r10.f123573a
                boolean r12 = r11.V(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r0 = r10.f123573a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x00a9
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x00b1
            L_0x00a9:
                com.sugarcube.app.base.ui.capturev2.P0 r1 = new com.sugarcube.app.base.ui.capturev2.P0
                r1.<init>(r0)
                r11.u(r1)
            L_0x00b1:
                r4 = r1
                nI.a r4 = (nI.C17631a) r4
                r11.P()
                r12 = -1923032615(0xffffffff8d60d9d9, float:-6.9287554E-31)
                r11.W(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r12 = r10.f123573a
                boolean r12 = r11.V(r12)
                com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment r0 = r10.f123573a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x00d3
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x00db
            L_0x00d3:
                com.sugarcube.app.base.ui.capturev2.Q0 r1 = new com.sugarcube.app.base.ui.capturev2.Q0
                r1.<init>(r0)
                r11.u(r1)
            L_0x00db:
                r5 = r1
                nI.a r5 = (nI.C17631a) r5
                r11.P()
                r8 = 0
                r9 = 16
                r6 = 0
                r7 = r11
                jF.C14647s.f(r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x00f2
                U0.C4895p.R()
            L_0x00f2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment.a.f(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            f((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final void V0() {
        BaseFragment.z0(this, C14542d.GoBack, (Trackable) null, 2, (Object) null);
        NavHostFragment.f43464H.a(this).k0();
    }

    /* access modifiers changed from: private */
    public final void W0() {
        I0();
    }

    /* access modifiers changed from: private */
    public final void X0() {
        BaseFragment.z0(this, C14542d.KitchenPlanner, (Trackable) null, 2, (Object) null);
        String e10 = C13760b.f117438d.e(n0().X0(), n0().d1());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(e10));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    public final void Y0() {
        BaseFragment.z0(this, C14542d.LearnMore, (Trackable) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void M0() {
        Q0(false);
        BaseFragment.z0(this, C14542d.Continue, (Trackable) null, 2, (Object) null);
        RoomType roomType = RoomType.OTHER;
        h1 n02 = n0();
        RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
        Resources resources = getResources();
        C17542s.i(resources, "getResources(...)");
        n02.J1(roomType, roomTypeRenderer.getTitle(roomType, resources));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4626o0.b(requireActivity().getWindow(), false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Q0(false);
        C13113u.h(composeView, (C5747v0) null, c.c(-1249274426, true, new a(this)), 1, (Object) null);
        return composeView;
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123572T;
    }
}
