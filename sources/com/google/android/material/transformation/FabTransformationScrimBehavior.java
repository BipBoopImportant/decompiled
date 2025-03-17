package com.google.android.material.transformation;

import Fa.C9082b;
import Fa.C9089i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final C9089i f67652c = new C9089i(75, 150);

    /* renamed from: d  reason: collision with root package name */
    private final C9089i f67653d = new C9089i(0, 150);

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f67654a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f67655b;

        a(boolean z10, View view) {
            this.f67654a = z10;
            this.f67655b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f67654a) {
                this.f67655b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f67654a) {
                this.f67655b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    private void O(View view, boolean z10, boolean z11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C9089i iVar = z10 ? this.f67652c : this.f67653d;
        if (z10) {
            if (!z11) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.a(objectAnimator);
        list.add(objectAnimator);
    }

    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.H(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    public AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        O(view2, z10, z11, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C9082b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
