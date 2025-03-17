package t5;

import XH.C16807N;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.C7055y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/Context;", "context", "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "b", "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "LXH/N;", "a", "()V", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.H  reason: case insensitive filesystem */
public final class C8797H {

    /* renamed from: a  reason: collision with root package name */
    private static final String f56575a;

    static {
        String i10 = C7055y.i("WakeLocks");
        C17542s.i(i10, "tagWithPrefix(\"WakeLocks\")");
        f56575a = i10;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C8798I i10 = C8798I.f56576a;
        synchronized (i10) {
            linkedHashMap.putAll(i10.a());
            C16807N n10 = C16807N.f139792a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                C7055y e10 = C7055y.e();
                String str2 = f56575a;
                e10.k(str2, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        C17542s.h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        C8798I i10 = C8798I.f56576a;
        synchronized (i10) {
            String put = i10.a().put(newWakeLock, str2);
        }
        C17542s.i(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
