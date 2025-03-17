package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.measurement.internal.q2  reason: case insensitive filesystem */
class C7670q2 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C7728y5 f50294a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f50295b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f50296c;

    C7670q2(C7728y5 y5Var) {
        C6620s.l(y5Var);
        this.f50294a = y5Var;
    }

    public final void b() {
        this.f50294a.L0();
        this.f50294a.q().k();
        if (!this.f50295b) {
            this.f50294a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f50296c = this.f50294a.z0().z();
            this.f50294a.f().I().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f50296c));
            this.f50295b = true;
        }
    }

    public final void c() {
        this.f50294a.L0();
        this.f50294a.q().k();
        this.f50294a.q().k();
        if (this.f50295b) {
            this.f50294a.f().I().a("Unregistering connectivity change receiver");
            this.f50295b = false;
            this.f50296c = false;
            try {
                this.f50294a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f50294a.f().E().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f50294a.L0();
        String action = intent.getAction();
        this.f50294a.f().I().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean z10 = this.f50294a.z0().z();
            if (this.f50296c != z10) {
                this.f50296c = z10;
                this.f50294a.q().B(new C7690t2(this, z10));
                return;
            }
            return;
        }
        this.f50294a.f().J().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
