package com.sugarcube.app.base.ui.capture;

import JF.T;
import QJ.F0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import cF.C14039a;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.ultrawide.UltrawideActivity;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.p;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/sugarcube/app/base/ui/capture/CaptureLandingFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "LXH/N;", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "J", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "r0", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "setConfigRepository", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "configRepository", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CaptureLandingFragment extends Hilt_CaptureLandingFragment implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f123254I = new T();

    /* renamed from: J  reason: collision with root package name */
    public ConfigRepository f123255J;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capture.CaptureLandingFragment$onCreateView$1", f = "CaptureLandingFragment.kt", l = {42, 50}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123256c;

        /* renamed from: d  reason: collision with root package name */
        Object f123257d;

        /* renamed from: e  reason: collision with root package name */
        Object f123258e;

        /* renamed from: f  reason: collision with root package name */
        int f123259f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CaptureLandingFragment f123260g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CaptureLandingFragment captureLandingFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123260g = captureLandingFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f123260g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C8951o oVar;
            int i10;
            C5191t tVar;
            int i11;
            Object f10 = C17187b.f();
            int i12 = this.f123259f;
            Class<Kreativ.Capture> cls = Kreativ.Capture.class;
            if (i12 == 0) {
                y.b(obj);
                tVar = this.f123260g.getActivity();
                boolean a10 = tVar != null ? UltrawideActivity.f125419I.a(tVar) : false;
                ConfigRepository r02 = this.f123260g.r0();
                FeatureFlags.CaptureV2Enabled captureV2Enabled = FeatureFlags.CaptureV2Enabled.INSTANCE;
                this.f123257d = tVar;
                this.f123256c = a10 ? 1 : 0;
                this.f123259f = 1;
                Object obj2 = r02.get(captureV2Enabled, this);
                if (obj2 == f10) {
                    return f10;
                }
                Object obj3 = obj2;
                i11 = a10;
                obj = obj3;
            } else if (i12 == 1) {
                i11 = this.f123256c;
                tVar = (C5191t) this.f123257d;
                y.b(obj);
            } else if (i12 == 2) {
                i10 = this.f123256c;
                C5191t tVar2 = (C5191t) this.f123257d;
                y.b(obj);
                oVar = (C8951o) this.f123258e;
                Object obj4 = (((Boolean) obj).booleanValue() || i10 == 0) ? Kreativ.Capture.c.INSTANCE : Kreativ.Capture.d.INSTANCE;
                C.a aVar = new C.a();
                aVar.j(P.b(cls), false, false);
                C8951o.f0(oVar, obj4, aVar.a(), (I.a) null, 4, (Object) null);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                C8951o a11 = androidx.navigation.fragment.a.a(this.f123260g);
                C.a aVar2 = new C.a();
                aVar2.j(P.b(cls), false, false);
                C14039a.c(a11, (UUID) null, aVar2.a(), 1, (Object) null);
                return C16807N.f139792a;
            }
            C8951o a12 = androidx.navigation.fragment.a.a(this.f123260g);
            ConfigRepository r03 = this.f123260g.r0();
            FeatureFlags.UltrawideEnabled ultrawideEnabled = FeatureFlags.UltrawideEnabled.INSTANCE;
            this.f123257d = tVar;
            this.f123258e = a12;
            this.f123256c = i11;
            this.f123259f = 2;
            Object obj5 = r03.get(ultrawideEnabled, this);
            if (obj5 == f10) {
                return f10;
            }
            oVar = a12;
            i10 = i11;
            obj = obj5;
            Object obj42 = (((Boolean) obj).booleanValue() || i10 == 0) ? Kreativ.Capture.c.INSTANCE : Kreativ.Capture.d.INSTANCE;
            C.a aVar3 = new C.a();
            aVar3.j(P.b(cls), false, false);
            C8951o.f0(oVar, obj42, aVar3.a(), (I.a) null, 4, (Object) null);
            return C16807N.f139792a;
        }
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f123254I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        F0 unused = C16314k.d(C5222z.a(requireActivity), (C17168i) null, (QJ.T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
        C5191t requireActivity2 = requireActivity();
        C17542s.i(requireActivity2, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity2, viewLifecycleOwner, false, false, (Integer) null, 28, (Object) null);
        return new View(getContext());
    }

    public final ConfigRepository r0() {
        ConfigRepository configRepository = this.f123255J;
        if (configRepository != null) {
            return configRepository;
        }
        C17542s.z("configRepository");
        return null;
    }
}
