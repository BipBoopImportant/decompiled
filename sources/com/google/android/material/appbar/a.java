package com.google.android.material.appbar;

import Ua.C9286g;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f65959a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ColorStateList f65960b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ColorStateList f65961c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C9286g f65962d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Integer f65963e;

    public /* synthetic */ a(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, C9286g gVar, Integer num) {
        this.f65959a = appBarLayout;
        this.f65960b = colorStateList;
        this.f65961c = colorStateList2;
        this.f65962d = gVar;
        this.f65963e = num;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f65959a.q(this.f65960b, this.f65961c, this.f65962d, this.f65963e, valueAnimator);
    }
}
