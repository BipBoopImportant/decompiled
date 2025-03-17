package com.google.ar.core;

import android.view.View;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

final class S implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InstallActivity f67723a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f67724b;

    S(InstallActivity installActivity, int i10) {
        this.f67724b = i10;
        this.f67723a = installActivity;
    }

    public final void onClick(View view) {
        if (this.f67724b != 0) {
            this.f67723a.c(new UnavailableUserDeclinedInstallationException());
            return;
        }
        this.f67723a.b();
        this.f67723a.d();
    }
}
