package I2;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: I2.j0  reason: case insensitive filesystem */
public final /* synthetic */ class C4616j0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4624n0 f8677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f8678b;

    public /* synthetic */ C4616j0(C4624n0 n0Var, View view) {
        this.f8677a = n0Var;
        this.f8678b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8677a.a(this.f8678b);
    }
}
