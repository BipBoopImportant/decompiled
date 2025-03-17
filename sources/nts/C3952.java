package nts;

import android.content.Context;
import android.os.Debug;
import android.provider.Settings;

/* renamed from: nts.ᚪ  reason: contains not printable characters */
public class C3952 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int f2325;

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m2192(int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        C3734 r02 = C3734.f1057;
        Context context = r02.f1062;
        boolean z10 = false;
        boolean z11 = true;
        if ((i10 & 2) > 0 && (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1 || (context.getApplicationInfo().flags & 2) != 0)) {
            f2325 |= 2;
        }
        if ((i10 & 16) > 0 && (f2325 & 16) == 0 && C3956.m2203(context, false)) {
            f2325 |= 16;
        }
        if ((i10 & 8) > 0 && C3956.m2204()) {
            f2325 |= 8;
        } else if ((i10 & 4) > 0 && Debug.isDebuggerConnected()) {
            f2325 |= 4;
        } else if ((i10 & 1) > 0 && C3956.m2196()) {
            f2325 |= 1;
        }
        if ((f2325 & 2) != 0) {
            r02.m1122(1, 7);
        }
        if ((f2325 & 16) != 0) {
            r02.m1122(3, 1);
        }
        if ((f2325 & 8) != 0) {
            r02.m1122(3, 5);
            z10 = true;
        }
        if ((f2325 & 4) != 0) {
            r02.m1122(2, 6);
            z10 = true;
        }
        if ((f2325 & 1) != 0) {
            r02.m1122(3, 4);
        } else {
            z11 = z10;
        }
        if (z11) {
            Thread thread = new Thread(new C3876());
            thread.start();
            while (thread.isAlive()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
