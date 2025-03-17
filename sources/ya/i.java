package Ya;

import Za.r;
import Za.s;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;

public final class i extends r {
    public i(Context context) {
        super(new s("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f65044a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f65044a.a("List of extras in received intent:", new Object[0]);
        for (String next : intent.getExtras().keySet()) {
            this.f65044a.a("Key: %s; value: %s", next, intent.getExtras().get(next));
        }
        InstallState f10 = InstallState.f(intent, this.f65044a);
        this.f65044a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", f10);
        d(f10);
    }
}
