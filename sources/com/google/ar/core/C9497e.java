package com.google.ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.ar.core.e  reason: case insensitive filesystem */
final class C9497e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ V f67756a;

    C9497e(V v10) {
        this.f67756a = v10;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
            int i10 = extras.getInt("install.status");
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                this.f67756a.a(W.ACCEPTED);
            } else if (i10 == 4) {
                this.f67756a.a(W.COMPLETED);
            } else if (i10 == 6) {
                this.f67756a.a(W.CANCELLED);
            }
        }
    }
}
