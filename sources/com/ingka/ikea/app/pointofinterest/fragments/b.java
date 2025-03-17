package com.ingka.ikea.app.pointofinterest.fragments;

import XH.C16807N;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/app/pointofinterest/fragments/b;", "", "Landroid/view/View;", "view", "", "target", "Lkotlin/Function0;", "LXH/N;", "onDone", "<init>", "(Landroid/view/View;ILnI/a;)V", "e", "()Lcom/ingka/ikea/app/pointofinterest/fragments/b;", "c", "()V", "a", "I", "d", "()I", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "b", "Landroid/animation/ValueAnimator;", "animator", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f72075a;

    /* renamed from: b  reason: collision with root package name */
    private final ValueAnimator f72076b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a f72077a;

        public a(C17631a aVar) {
            this.f72077a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f72077a.invoke();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public b(View view, int i10, C17631a<C16807N> aVar) {
        C17542s.j(view, "view");
        C17542s.j(aVar, "onDone");
        this.f72075a = i10;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getMeasuredHeight(), i10});
        ofInt.addUpdateListener(new a(view));
        C17542s.g(ofInt);
        ofInt.addListener(new a(aVar));
        ofInt.setDuration(400);
        ofInt.setInterpolator(new h3.b());
        this.f72076b = ofInt;
    }

    /* access modifiers changed from: private */
    public static final void b(View view, ValueAnimator valueAnimator) {
        C17542s.j(valueAnimator, "it");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C17542s.h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f72076b;
        valueAnimator.end();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeAllListeners();
    }

    public final int d() {
        return this.f72075a;
    }

    public final b e() {
        this.f72076b.start();
        return this;
    }
}
