package com.ingka.ikea.app.welcomescreen;

import android.content.DialogInterface;

public final /* synthetic */ class h implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WelcomeActivity f92867a;

    public /* synthetic */ h(WelcomeActivity welcomeActivity) {
        this.f92867a = welcomeActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        WelcomeActivity.R0(this.f92867a, dialogInterface);
    }
}
