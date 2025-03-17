package I2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: I2.k0  reason: case insensitive filesystem */
public final class C4618k0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f8679a;

    /* renamed from: I2.k0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4620l0 f8680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f8681b;

        a(C4620l0 l0Var, View view) {
            this.f8680a = l0Var;
            this.f8681b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f8680a.a(this.f8681b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f8680a.b(this.f8681b);
        }

        public void onAnimationStart(Animator animator) {
            this.f8680a.c(this.f8681b);
        }
    }

    C4618k0(View view) {
        this.f8679a = new WeakReference<>(view);
    }

    private void i(View view, C4620l0 l0Var) {
        if (l0Var != null) {
            view.animate().setListener(new a(l0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public C4618k0 b(float f10) {
        View view = this.f8679a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f8679a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f8679a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public C4618k0 f(long j10) {
        View view = this.f8679a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C4618k0 g(Interpolator interpolator) {
        View view = this.f8679a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C4618k0 h(C4620l0 l0Var) {
        View view = this.f8679a.get();
        if (view != null) {
            i(view, l0Var);
        }
        return this;
    }

    public C4618k0 j(long j10) {
        View view = this.f8679a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C4618k0 k(C4624n0 n0Var) {
        View view = this.f8679a.get();
        if (view != null) {
            view.animate().setUpdateListener(n0Var != null ? new C4616j0(n0Var, view) : null);
        }
        return this;
    }

    public void l() {
        View view = this.f8679a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C4618k0 m(float f10) {
        View view = this.f8679a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
