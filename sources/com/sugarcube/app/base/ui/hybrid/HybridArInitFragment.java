package com.sugarcube.app.base.ui.hybrid;

import OE.C13316h;
import OE.n;
import QE.E;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16818i;
import XH.t;
import XH.y;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.L;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridArInitFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridArInitFragment extends Hilt_HybridArInitFragment {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/ui/hybrid/HybridArInitFragment$a", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "Landroid/graphics/drawable/Drawable;", "drawable", "LXH/N;", "onAnimationEnd", "(Landroid/graphics/drawable/Drawable;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Animatable2.AnimationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HybridArInitFragment f124771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Animatable2 f124772b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.hybrid.HybridArInitFragment$onCreateView$1$4$1$1$onAnimationEnd$1", f = "HybridArInitFragment.kt", l = {81}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.hybrid.HybridArInitFragment$a$a  reason: collision with other inner class name */
        static final class C3063a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124773c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Animatable2 f124774d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3063a(Animatable2 animatable2, C17164e<? super C3063a> eVar) {
                super(2, eVar);
                this.f124774d = animatable2;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3063a(this.f124774d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3063a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f124773c;
                if (i10 == 0) {
                    y.b(obj);
                    this.f124773c = 1;
                    if (C16297b0.b(1000, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f124774d.start();
                return C16807N.f139792a;
            }
        }

        a(HybridArInitFragment hybridArInitFragment, Animatable2 animatable2) {
            this.f124771a = hybridArInitFragment;
            this.f124772b = animatable2;
        }

        public void onAnimationEnd(Drawable drawable) {
            F0 unused = C16314k.d(C5222z.a(this.f124771a), (C17168i) null, (T) null, new C3063a(this.f124772b, (C17164e<? super C3063a>) null), 3, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124775a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124775a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124775a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124775a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(HybridArInitFragment hybridArInitFragment) {
        E0 u02 = hybridArInitFragment.u0();
        u02.w1().b().captureFloorPointExit(u02.y1(), u02.r1(), u02.s1(), u02.e1(), u02.d1());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void F0(HybridArInitFragment hybridArInitFragment, View view) {
        E0 u02 = hybridArInitFragment.u0();
        u02.w1().b().captureFloorPointEnd(u02.y1(), u02.r1(), u02.s1(), u02.e1(), u02.d1());
        u02.G2();
        C8951o.f0(androidx.navigation.fragment.a.a(hybridArInitFragment), new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_AR_PANO), (C) null, (I.a) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N G0(E e10, HybridArInitFragment hybridArInitFragment, Boolean bool) {
        if (bool == null) {
            e10.f114343c.setText(n.f113294V0);
            e10.f114345e.setVisibility(0);
            e10.f114345e.setImageResource(C13316h.f112826H);
            Drawable drawable = e10.f114345e.getDrawable();
            Animatable2 animatable2 = drawable instanceof Animatable2 ? (Animatable2) drawable : null;
            if (animatable2 != null) {
                animatable2.registerAnimationCallback(new a(hybridArInitFragment, animatable2));
                animatable2.start();
            }
            e10.f114344d.setVisibility(8);
        } else if (C17542s.e(bool, Boolean.TRUE)) {
            e10.f114343c.setText(n.f113288U0);
            e10.f114345e.setVisibility(8);
            e10.f114344d.setVisibility(0);
        } else if (C17542s.e(bool, Boolean.FALSE)) {
            e10.f114343c.setText(n.f113258P0);
            e10.f114345e.setVisibility(8);
            if (e10.f114344d.getVisibility() == 8) {
                E0 u02 = hybridArInitFragment.u0();
                u02.w1().b().captureWarningNoFloorPlane(u02.y1(), u02.r1(), u02.e1(), u02.d1());
            }
            e10.f114344d.setVisibility(0);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        E c10 = E.c(layoutInflater, viewGroup, false);
        w0(false);
        E0 u02 = u0();
        u02.w1().b().captureFloorPointStart(u02.y1(), u02.r1(), u02.s1(), u02.e1(), u02.d1());
        u02.z2();
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114342b;
        C17542s.i(floatingActionButton, "cancelButton");
        x0(b10, floatingActionButton, new B(this));
        c10.f114344d.setOnClickListener(new C(this));
        u0().b1().observe(getViewLifecycleOwner(), new b(new D(c10, this)));
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }
}
