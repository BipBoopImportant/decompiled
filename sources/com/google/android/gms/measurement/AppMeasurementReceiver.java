package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import i3.a;
import sa.C8765s;

public final class AppMeasurementReceiver extends a implements C8765s.a {

    /* renamed from: c  reason: collision with root package name */
    private C8765s f49511c;

    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f49511c == null) {
            this.f49511c = new C8765s(this);
        }
        this.f49511c.a(context, intent);
    }
}
