package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C7263c0;
import com.google.android.gms.internal.measurement.C7272d0;

/* renamed from: com.google.android.gms.measurement.internal.z2  reason: case insensitive filesystem */
public final class C7732z2 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f50541a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ A2 f50542b;

    C7732z2(A2 a22, String str) {
        this.f50542b = a22;
        this.f50541a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f50542b.f49520a.f().J().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C7272d0 J32 = C7263c0.J3(iBinder);
            if (J32 == null) {
                this.f50542b.f49520a.f().J().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f50542b.f49520a.f().I().a("Install Referrer Service connected");
            this.f50542b.f49520a.q().B(new B2(this, J32, this));
        } catch (RuntimeException e10) {
            this.f50542b.f49520a.f().J().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f50542b.f49520a.f().I().a("Install Referrer Service disconnected");
    }
}
