package H9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class P extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f36522a;

    /* renamed from: b  reason: collision with root package name */
    private final O f36523b;

    public P(O o10) {
        this.f36523b = o10;
    }

    public final void a(Context context) {
        this.f36522a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f36522a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f36522a = null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f36523b.a();
            b();
        }
    }
}
