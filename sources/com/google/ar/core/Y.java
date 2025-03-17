package com.google.ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class Y implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ X f67746a;

    Y(X x10) {
        this.f67746a = x10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f67746a.d(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f67746a.e();
    }
}
