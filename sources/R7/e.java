package R7;

import R7.b;
import android.content.Context;
import android.util.Log;
import u2.C6012a;

public class e implements c {
    public b a(Context context, b.a aVar) {
        boolean z10 = C6012a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new n();
    }
}
