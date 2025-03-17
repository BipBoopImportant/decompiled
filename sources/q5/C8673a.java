package q5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C7055y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u5.C8878b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lq5/a;", "Lq5/e;", "", "Landroid/content/Context;", "context", "Lu5/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lu5/b;)V", "Landroid/content/Intent;", "intent", "l", "(Landroid/content/Intent;)Z", "m", "()Ljava/lang/Boolean;", "LXH/N;", "k", "(Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", "j", "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: q5.a  reason: case insensitive filesystem */
public final class C8673a extends e<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8673a(Context context, C8878b bVar) {
        super(context, bVar);
        C17542s.j(context, "context");
        C17542s.j(bVar, "taskExecutor");
    }

    private final boolean l(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    public void k(Intent intent) {
        C17542s.j(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            C7055y e10 = C7055y.e();
            String a10 = b.f55515a;
            e10.a(a10, "Received " + action);
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        g(Boolean.FALSE);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        g(Boolean.FALSE);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        g(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        g(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: m */
    public Boolean e() {
        Intent registerReceiver = d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(l(registerReceiver));
        }
        C7055y.e().c(b.f55515a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
