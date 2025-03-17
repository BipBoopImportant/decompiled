package Va;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: Va.c  reason: case insensitive filesystem */
public final /* synthetic */ class C9344c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f64498a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f64499b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f64500c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f64501d;

    public /* synthetic */ C9344c(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view) {
        this.f64498a = sideSheetBehavior;
        this.f64499b = marginLayoutParams;
        this.f64500c = i10;
        this.f64501d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f64498a.y0(this.f64499b, this.f64500c, this.f64501d, valueAnimator);
    }
}
