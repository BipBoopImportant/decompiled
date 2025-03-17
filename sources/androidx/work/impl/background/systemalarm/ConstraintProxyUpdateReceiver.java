package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.C7055y;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import l5.O;
import t5.C8791B;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f45214a = C7055y.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f45215a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f45216b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f45217c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f45215a = intent;
            this.f45216b = context;
            this.f45217c = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f45215a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f45215a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f45215a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f45215a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C7055y.e().a(ConstraintProxyUpdateReceiver.f45214a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                C8791B.c(this.f45216b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C8791B.c(this.f45216b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C8791B.c(this.f45216b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C8791B.c(this.f45216b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f45217c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C7055y e10 = C7055y.e();
            String str = f45214a;
            e10.a(str, "Ignoring unknown action " + action);
            return;
        }
        O.r(context).x().d(new a(intent, context, goAsync()));
    }
}
