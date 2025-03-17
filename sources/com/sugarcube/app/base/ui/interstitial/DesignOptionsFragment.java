package com.sugarcube.app.base.ui.interstitial;

import C4.h;
import C4.j;
import GF.C12946a;
import GF.C12947b;
import GF.C12948c;
import JF.C13096c;
import JF.C13115w;
import JF.T;
import JF.Z;
import OE.n;
import OE.q;
import QE.C13443u;
import QJ.F0;
import QJ.Q;
import W2.f;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16877v;
import YH.X;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import cF.C14040b;
import cF.C14046h;
import com.sugarcube.app.base.data.preferences.PreferenceImpl;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.interstitial.OptionInterstitialCard;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.p;
import x4.C;
import x4.C8945i;
import x4.C8948l;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J:\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/sugarcube/app/base/ui/interstitial/DesignOptionsFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LXH/N;", "D0", "x0", "", "value", "E0", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "onStop", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "LOE/q;", "J", "LOE/q;", "A0", "()LOE/q;", "setSugarcube", "(LOE/q;)V", "sugarcube", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "K", "Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "z0", "()Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;", "setPreferenceStorage", "(Lcom/sugarcube/app/base/data/preferences/PreferenceStorage;)V", "preferenceStorage", "Lcom/sugarcube/app/base/navigation/Kreativ$DesignOptions;", "L", "LXH/o;", "y0", "()Lcom/sugarcube/app/base/navigation/Kreativ$DesignOptions;", "args", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DesignOptionsFragment extends a implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f125145I = new T();

    /* renamed from: J  reason: collision with root package name */
    public q f125146J;

    /* renamed from: K  reason: collision with root package name */
    public PreferenceStorage f125147K;

    /* renamed from: L  reason: collision with root package name */
    private final C16824o f125148L = C16825p.b(new C12948c(this));

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/sugarcube/app/base/ui/interstitial/DesignOptionsFragment$a", "Lcom/sugarcube/app/base/ui/interstitial/OptionInterstitialCard$OnClickListener;", "LXH/N;", "onClicked", "()V", "onGetStartedClicked", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements OptionInterstitialCard.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DesignOptionsFragment f125149a;

        a(DesignOptionsFragment designOptionsFragment) {
            this.f125149a = designOptionsFragment;
        }

        public void onClicked() {
            OptionInterstitialCard.OnClickListener.a.a(this);
            this.f125149a.D0();
        }

        public void onGetLinkClicked() {
            OptionInterstitialCard.OnClickListener.a.b(this);
        }

        public void onGetStartedClicked() {
            this.f125149a.D0();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/sugarcube/app/base/ui/interstitial/DesignOptionsFragment$b", "Lcom/sugarcube/app/base/ui/interstitial/OptionInterstitialCard$OnClickListener;", "LXH/N;", "onClicked", "()V", "onGetLinkClicked", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements OptionInterstitialCard.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DesignOptionsFragment f125150a;

        b(DesignOptionsFragment designOptionsFragment) {
            this.f125150a = designOptionsFragment;
        }

        public void onClicked() {
            OptionInterstitialCard.OnClickListener.a.a(this);
            this.f125150a.x0();
        }

        public void onGetLinkClicked() {
            this.f125150a.x0();
        }

        public void onGetStartedClicked() {
            OptionInterstitialCard.OnClickListener.a.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.interstitial.DesignOptionsFragment$setShowDesignOptionsInterstitial$1", f = "DesignOptionsFragment.kt", l = {158}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125151c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DesignOptionsFragment f125152d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f125153e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DesignOptionsFragment designOptionsFragment, boolean z10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f125152d = designOptionsFragment;
            this.f125153e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f125152d, this.f125153e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125151c;
            if (i10 == 0) {
                y.b(obj);
                PreferenceStorage z02 = this.f125152d.z0();
                f.a<Boolean> show_design_options_key = PreferenceImpl.PreferencesKeys.getSHOW_DESIGN_OPTIONS_KEY();
                Boolean a10 = kotlin.coroutines.jvm.internal.b.a(this.f125153e);
                this.f125151c = 1;
                if (z02.setPreference(show_design_options_key, a10, this) == f10) {
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

    /* access modifiers changed from: private */
    public static final void B0(DesignOptionsFragment designOptionsFragment, View view) {
        androidx.navigation.fragment.a.a(designOptionsFragment).k0();
    }

    /* access modifiers changed from: private */
    public static final void C0(C13443u uVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C17542s.g(view);
        Z.g(view, C16877v.e(uVar.f114725b));
    }

    /* access modifiers changed from: private */
    public final void D0() {
        if (getActivity() != null) {
            E0(false);
            UUID e10 = C14046h.e(y0().d());
            if (e10 != null) {
                C8951o a10 = androidx.navigation.fragment.a.a(this);
                String uuid = e10.toString();
                C17542s.i(uuid, "toString(...)");
                int b10 = y0().b();
                String a11 = y0().a();
                C.a aVar = new C.a();
                aVar.j(P.b(Kreativ.DesignOptions.class), true, false);
                C14040b.b(a10, uuid, (String) null, b10, true, a11, aVar.a(), 2, (Object) null);
                A0().b().designIntroGetStarted(y0().c(), y0().b(), e10);
            }
        }
    }

    private final void E0(boolean z10) {
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new c(this, z10, (C17164e<? super c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final Kreativ.DesignOptions w0(DesignOptionsFragment designOptionsFragment) {
        Object obj;
        C8951o a10 = androidx.navigation.fragment.a.a(designOptionsFragment);
        int g10 = j.g(Kreativ.DesignOptions.Companion.serializer());
        Class<Kreativ.DesignOptions> cls = Kreativ.DesignOptions.class;
        if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
            List value = a10.G().getValue();
            ListIterator listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((C8948l) obj).e().x() == g10) {
                    break;
                }
            }
            C8948l lVar = (C8948l) obj;
            if (lVar != null) {
                Bundle c10 = lVar.c();
                if (c10 == null) {
                    c10 = new Bundle();
                }
                Map<String, C8945i> s10 = lVar.e().s();
                LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(s10.size()));
                for (Map.Entry entry : s10.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C8945i) entry.getValue()).a());
                }
                return (Kreativ.DesignOptions) h.a(Kreativ.DesignOptions.Companion.serializer(), c10, linkedHashMap);
            }
            throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    /* access modifiers changed from: private */
    public final void x0() {
        UUID e10 = C14046h.e(y0().d());
        if (e10 != null) {
            A0().b().designIntroGetLink(y0().c(), y0().b(), e10);
            E0(false);
            C5191t activity = getActivity();
            if (activity != null) {
                C13115w.d(activity, A0(), e10);
            }
        }
    }

    private final Kreativ.DesignOptions y0() {
        return (Kreativ.DesignOptions) this.f125148L.getValue();
    }

    public final q A0() {
        q qVar = this.f125146J;
        if (qVar != null) {
            return qVar;
        }
        C17542s.z("sugarcube");
        return null;
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f125145I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, false, false, (Integer) null, 28, (Object) null);
        C13443u c10 = C13443u.c(layoutInflater, viewGroup, false);
        c10.f114725b.setOnClickListener(new C12946a(this));
        c10.f114728e.setListener(new a(this));
        c10.f114727d.setListener(new b(this));
        c10.getRoot().addOnLayoutChangeListener(new C12947b(c10));
        c10.f114728e.setBulletedListText(C16877v.q(getString(n.f113496y4), getString(n.f113502z4), getString(n.f113172A4)));
        c10.f114727d.setBulletedListText(C16877v.q(getString(n.f113412m4), getString(n.f113419n4)));
        C5191t activity = getActivity();
        if (activity != null) {
            ConstraintLayout b10 = c10.getRoot();
            C17542s.i(b10, "getRoot(...)");
            C13096c.c(activity, b10);
        }
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onStart() {
        super.onStart();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        Z.u(requireActivity, 8);
    }

    public void onStop() {
        super.onStop();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        Z.u(requireActivity, 0);
    }

    public final PreferenceStorage z0() {
        PreferenceStorage preferenceStorage = this.f125147K;
        if (preferenceStorage != null) {
            return preferenceStorage;
        }
        C17542s.z("preferenceStorage");
        return null;
    }
}
