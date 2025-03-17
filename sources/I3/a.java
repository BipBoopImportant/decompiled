package i3;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f24507a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static int f24508b = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f24507a;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f24507a;
        synchronized (sparseArray) {
            try {
                int i10 = f24508b;
                int i11 = i10 + 1;
                f24508b = i11;
                if (i11 <= 0) {
                    f24508b = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000);
                sparseArray.put(i10, newWakeLock);
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
