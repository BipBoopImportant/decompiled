package com.google.ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class U extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InstallActivity f67729a;

    U(InstallActivity installActivity) {
        this.f67729a = installActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f67729a.a();
    }
}
