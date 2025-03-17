package sa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C7297f7;
import com.google.android.gms.measurement.internal.K;
import com.google.android.gms.measurement.internal.P2;
import com.google.android.gms.measurement.internal.U5;

public final class n0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final P2 f56130a;

    public n0(P2 p22) {
        this.f56130a = p22;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f56130a.f().J().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f56130a.f().J().a("App receiver called with null action");
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            P2 p22 = this.f56130a;
            if (C7297f7.a() && p22.y().H((String) null, K.f49725R0)) {
                p22.f().I().a("App receiver notified triggers are available");
                p22.q().B(new U5(p22));
            }
        } else if (!action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
            this.f56130a.f().J().a("App receiver called with unknown action");
        } else if (this.f56130a.y().H((String) null, K.f49715M0)) {
            this.f56130a.f().I().a("[sgtm] App Receiver notified batches are available");
            this.f56130a.q().B(new o0(this));
        }
    }
}
