package com.ingka.ikea.localnotification.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import jH.C17408e;
import mH.C17602e;

abstract class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f96535a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Object f96536b = new Object();

    a() {
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        if (!this.f96535a) {
            synchronized (this.f96536b) {
                try {
                    if (!this.f96535a) {
                        ((e) C17408e.a(context)).e((LocalNotificationReceiver) C17602e.a(this));
                        this.f96535a = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
