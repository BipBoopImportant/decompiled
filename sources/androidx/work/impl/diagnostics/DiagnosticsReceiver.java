package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.B;
import androidx.work.C7055y;
import androidx.work.S;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f45276a = C7055y.i("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C7055y.e().a(f45276a, "Requesting diagnostics");
            try {
                S.i(context).d(B.e(DiagnosticsWorker.class));
            } catch (IllegalStateException e10) {
                C7055y.e().d(f45276a, "WorkManager is not initialized", e10);
            }
        }
    }
}
