package com.ingka.ikea.onlinepayment.impl.presentation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import jH.C17408e;
import mH.C17602e;

abstract class h extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f119323a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Object f119324b = new Object();

    h() {
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        if (!this.f119323a) {
            synchronized (this.f119324b) {
                try {
                    if (!this.f119323a) {
                        ((c) C17408e.a(context)).d((AciBroadcastReceiver) C17602e.a(this));
                        this.f119323a = true;
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
