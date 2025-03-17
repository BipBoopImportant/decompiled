package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C7055y;
import l5.O;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f45219a = C7055y.i("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C7055y e10 = C7055y.e();
        String str = f45219a;
        e10.a(str, "Received intent " + intent);
        try {
            O.r(context).B(goAsync());
        } catch (IllegalStateException e11) {
            C7055y.e().d(f45219a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
        }
    }
}
