package com.google.android.gms.auth.api.signin.internal;

import C9.g;
import C9.x;
import android.os.Bundle;
import androidx.loader.app.a;
import o3.b;

final class a implements a.C0350a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f47962a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, x xVar) {
        this.f47962a = signInHubActivity;
    }

    public final void a(b bVar) {
    }

    public final b b(int i10, Bundle bundle) {
        return new g(this.f47962a, com.google.android.gms.common.api.g.b());
    }

    public final /* bridge */ /* synthetic */ void c(b bVar, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.f47962a;
        signInHubActivity.setResult(signInHubActivity.f47960y, signInHubActivity.f47961z);
        this.f47962a.finish();
    }
}
