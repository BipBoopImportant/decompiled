package com.sugarcube.app.base.ui.ultrawide;

import OE.C13316h;
import OE.n;
import QE.P;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideArInitFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideArInitFragment extends Hilt_UltrawideArInitFragment {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/UltrawideArInitFragment$a", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "Landroid/graphics/drawable/Drawable;", "drawable", "LXH/N;", "onAnimationEnd", "(Landroid/graphics/drawable/Drawable;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Animatable2.AnimationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UltrawideArInitFragment f125450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Animatable2 f125451b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideArInitFragment$onCreateView$1$4$1$1$onAnimationEnd$1", f = "UltrawideArInitFragment.kt", l = {81}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.ultrawide.UltrawideArInitFragment$a$a  reason: collision with other inner class name */
        static final class C3070a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f125452c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Animatable2 f125453d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3070a(Animatable2 animatable2, C17164e<? super C3070a> eVar) {
                super(2, eVar);
                this.f125453d = animatable2;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3070a(this.f125453d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3070a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f125452c;
                if (i10 == 0) {
                    y.b(obj);
                    this.f125452c = 1;
                    if (C16297b0.b(1000, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f125453d.start();
                return C16807N.f139792a;
            }
        }

        a(UltrawideArInitFragment ultrawideArInitFragment, Animatable2 animatable2) {
            this.f125450a = ultrawideArInitFragment;
            this.f125451b = animatable2;
        }

        public void onAnimationEnd(Drawable drawable) {
            F0 unused = C16314k.d(C5222z.a(this.f125450a), (C17168i) null, (T) null, new C3070a(this.f125451b, (C17164e<? super C3070a>) null), 3, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f125454a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f125454a = lVar;
        }

        public final C16818i<?> c() {
            return this.f125454a;
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
            this.f125454a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N F0(UltrawideArInitFragment ultrawideArInitFragment) {
        I0 x02 = ultrawideArInitFragment.x0();
        x02.u1().b().captureFloorPointExit(x02.x1(), x02.p1(), x02.q1(), x02.a1(), x02.Z0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void G0(UltrawideArInitFragment ultrawideArInitFragment, View view) {
        I0 x02 = ultrawideArInitFragment.x0();
        x02.u1().b().captureFloorPointEnd(x02.x1(), x02.p1(), x02.q1(), x02.a1(), x02.Z0());
        x02.u2();
        C8951o.f0(androidx.navigation.fragment.a.a(ultrawideArInitFragment), new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_AR_SCAN), (C) null, (I.a) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N H0(P p10, UltrawideArInitFragment ultrawideArInitFragment, Boolean bool) {
        if (bool == null) {
            p10.f114426c.setText(n.f113294V0);
            p10.f114428e.setVisibility(0);
            p10.f114428e.setImageResource(C13316h.f112826H);
            Drawable drawable = p10.f114428e.getDrawable();
            Animatable2 animatable2 = drawable instanceof Animatable2 ? (Animatable2) drawable : null;
            if (animatable2 != null) {
                animatable2.registerAnimationCallback(new a(ultrawideArInitFragment, animatable2));
                animatable2.start();
            }
            p10.f114427d.setVisibility(8);
        } else if (C17542s.e(bool, Boolean.TRUE)) {
            p10.f114426c.setText(n.f113288U0);
            p10.f114428e.setVisibility(8);
            p10.f114427d.setVisibility(0);
        } else if (C17542s.e(bool, Boolean.FALSE)) {
            p10.f114426c.setText(n.f113258P0);
            p10.f114428e.setVisibility(8);
            if (p10.f114427d.getVisibility() == 8) {
                I0 x02 = ultrawideArInitFragment.x0();
                x02.u1().b().captureWarningNoFloorPlane(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
            }
            p10.f114427d.setVisibility(0);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        P c10 = P.c(layoutInflater, viewGroup, false);
        y0(false);
        I0 x02 = x0();
        x02.u1().b().captureFloorPointStart(x02.x1(), x02.p1(), x02.q1(), x02.a1(), x02.Z0());
        x02.s2();
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114425b;
        C17542s.i(floatingActionButton, "cancelButton");
        z0(b10, floatingActionButton, new C14321y(this));
        c10.f114427d.setOnClickListener(new C14322z(this));
        x0().W0().observe(getViewLifecycleOwner(), new b(new A(c10, this)));
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }
}
