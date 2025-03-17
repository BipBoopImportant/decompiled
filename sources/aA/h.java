package aa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import u2.C6012a;

public final class h extends C6012a {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent q(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!g.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != g.a() ? 0 : 2);
    }
}
