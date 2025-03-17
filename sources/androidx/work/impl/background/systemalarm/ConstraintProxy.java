package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C7036e;
import androidx.work.C7055y;
import androidx.work.C7056z;
import java.util.List;
import s5.C8739u;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f45213a = C7055y.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List<C8739u> list) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (C8739u uVar : list) {
            C7036e eVar = uVar.f55919j;
            z10 |= eVar.h();
            z11 |= eVar.i();
            z12 |= eVar.k();
            z13 |= eVar.f() != C7056z.NOT_REQUIRED;
            if (z10 && z11 && z12 && z13) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z10, z11, z12, z13));
    }

    public void onReceive(Context context, Intent intent) {
        C7055y e10 = C7055y.e();
        String str = f45213a;
        e10.a(str, "onReceive : " + intent);
        context.startService(b.a(context));
    }
}
