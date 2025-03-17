package f8;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowManager;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a;

/* renamed from: f8.b  reason: case insensitive filesystem */
public final /* synthetic */ class C7863b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WindowManager.LayoutParams f51207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f51208b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f51209c;

    public /* synthetic */ C7863b(WindowManager.LayoutParams layoutParams, a aVar, View view) {
        this.f51207a = layoutParams;
        this.f51208b = aVar;
        this.f51209c = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a.d.b(this.f51207a, this.f51208b, this.f51209c, valueAnimator);
    }
}
