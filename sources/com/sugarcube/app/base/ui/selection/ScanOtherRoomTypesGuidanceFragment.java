package com.sugarcube.app.base.ui.selection;

import I2.C4626o0;
import JF.C13113u;
import OE.q;
import U0.C4889m;
import VE.C13760b;
import XH.C16807N;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C5191t;
import androidx.navigation.fragment.NavHostFragment;
import c1.c;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.ultrawide.UltrawideActivity;
import com.sugarcube.core.network.models.RoomType;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import p1.C5747v0;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/sugarcube/app/base/ui/selection/ScanOtherRoomTypesGuidanceFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "LXH/N;", "x0", "y0", "A0", "z0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LOE/q;", "I", "LOE/q;", "w0", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "J", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "v0", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "setConfigRepository", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "configRepository", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanOtherRoomTypesGuidanceFragment extends Hilt_ScanOtherRoomTypesGuidanceFragment {

    /* renamed from: I  reason: collision with root package name */
    public q f125179I;

    /* renamed from: J  reason: collision with root package name */
    public ConfigRepository f125180J;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScanOtherRoomTypesGuidanceFragment f125181a;

        a(ScanOtherRoomTypesGuidanceFragment scanOtherRoomTypesGuidanceFragment) {
            this.f125181a = scanOtherRoomTypesGuidanceFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(ScanOtherRoomTypesGuidanceFragment scanOtherRoomTypesGuidanceFragment) {
            scanOtherRoomTypesGuidanceFragment.x0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(ScanOtherRoomTypesGuidanceFragment scanOtherRoomTypesGuidanceFragment) {
            scanOtherRoomTypesGuidanceFragment.y0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(ScanOtherRoomTypesGuidanceFragment scanOtherRoomTypesGuidanceFragment) {
            scanOtherRoomTypesGuidanceFragment.A0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(ScanOtherRoomTypesGuidanceFragment scanOtherRoomTypesGuidanceFragment) {
            scanOtherRoomTypesGuidanceFragment.z0();
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
                goto L_0x00d9
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment.onCreateView.<anonymous>.<anonymous> (ScanOtherRoomTypesGuidanceFragment.kt:52)"
                r2 = 238170140(0xe32301c, float:2.1963358E-30)
                U0.C4895p.S(r2, r12, r0, r1)
            L_0x0020:
                r12 = -445445142(0xffffffffe5730bea, float:-7.1734677E22)
                r11.W(r12)
                com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment r12 = r10.f125181a
                boolean r12 = r11.F(r12)
                com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment r0 = r10.f125181a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x003c
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x0044
            L_0x003c:
                com.sugarcube.app.base.ui.selection.d r1 = new com.sugarcube.app.base.ui.selection.d
                r1.<init>(r0)
                r11.u(r1)
            L_0x0044:
                r2 = r1
                nI.a r2 = (nI.C17631a) r2
                r11.P()
                r12 = -445443731(0xffffffffe573116d, float:-7.174103E22)
                r11.W(r12)
                com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment r12 = r10.f125181a
                boolean r12 = r11.F(r12)
                com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment r0 = r10.f125181a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x0066
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x006e
            L_0x0066:
                com.sugarcube.app.base.ui.selection.e r1 = new com.sugarcube.app.base.ui.selection.e
                r1.<init>(r0)
                r11.u(r1)
            L_0x006e:
                r3 = r1
                nI.a r3 = (nI.C17631a) r3
                r11.P()
                r12 = -445442194(0xffffffffe573176e, float:-7.1747954E22)
                r11.W(r12)
                com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment r12 = r10.f125181a
                boolean r12 = r11.F(r12)
                com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment r0 = r10.f125181a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x0090
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x0098
            L_0x0090:
                com.sugarcube.app.base.ui.selection.f r1 = new com.sugarcube.app.base.ui.selection.f
                r1.<init>(r0)
                r11.u(r1)
            L_0x0098:
                r4 = r1
                nI.a r4 = (nI.C17631a) r4
                r11.P()
                r12 = -445440461(0xffffffffe5731e33, float:-7.175576E22)
                r11.W(r12)
                com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment r12 = r10.f125181a
                boolean r12 = r11.F(r12)
                com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment r0 = r10.f125181a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x00ba
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x00c2
            L_0x00ba:
                com.sugarcube.app.base.ui.selection.g r1 = new com.sugarcube.app.base.ui.selection.g
                r1.<init>(r0)
                r11.u(r1)
            L_0x00c2:
                r5 = r1
                nI.a r5 = (nI.C17631a) r5
                r11.P()
                r8 = 0
                r9 = 16
                r6 = 0
                r7 = r11
                jF.C14647s.f(r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x00d9
                U0.C4895p.R()
            L_0x00d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment.a.f(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            f((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final void A0() {
        w0().b().captureScanningTipLearnMore();
    }

    /* access modifiers changed from: private */
    public final void x0() {
        w0().b().captureScanningTipGoBack();
        NavHostFragment.f43464H.a(this).k0();
    }

    /* access modifiers changed from: private */
    public final void y0() {
        C5191t activity = getActivity();
        boolean z10 = activity != null && UltrawideActivity.f125419I.a(activity);
        Analytics b10 = w0().b();
        RoomType roomType = RoomType.OTHER;
        b10.captureScanningTipContinue(roomType);
        if (!v0().isEnabledBlocking(FeatureFlags.UltrawideEnabled.INSTANCE) || !z10) {
            C8951o a10 = androidx.navigation.fragment.a.a(this);
            Kreativ.Capture.Hybrid hybrid = new Kreativ.Capture.Hybrid(roomType.getApiKey());
            C.a aVar = new C.a();
            aVar.j(P.b(Kreativ.Capture.c.class), true, false);
            C8951o.f0(a10, hybrid, aVar.a(), (I.a) null, 4, (Object) null);
            return;
        }
        C8951o.f0(androidx.navigation.fragment.a.a(this), Kreativ.Capture.d.i.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void z0() {
        w0().b().captureScanningTipKitchenPlanner();
        String e10 = C13760b.f117438d.e(w0().getCountry(), w0().getLanguage());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(e10));
        startActivity(intent);
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
        C13113u.h(composeView, (C5747v0) null, c.c(238170140, true, new a(this)), 1, (Object) null);
        return composeView;
    }

    public final ConfigRepository v0() {
        ConfigRepository configRepository = this.f125180J;
        if (configRepository != null) {
            return configRepository;
        }
        C17542s.z("configRepository");
        return null;
    }

    public final q w0() {
        q qVar = this.f125179I;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }
}
