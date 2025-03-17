package Qb;

import Nb.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: Qb.e  reason: case insensitive filesystem */
class C9247e {

    /* renamed from: a  reason: collision with root package name */
    private final Float f62972a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f62973b;

    private C9247e(Float f10, boolean z10) {
        this.f62973b = z10;
        this.f62972a = f10;
    }

    public static C9247e a(Context context) {
        boolean z10 = false;
        Float f10 = null;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z10 = e(registerReceiver);
                f10 = d(registerReceiver);
            }
        } catch (IllegalStateException e10) {
            g.f().e("An error occurred getting battery state.", e10);
        }
        return new C9247e(f10, z10);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f62972a;
    }

    public int c() {
        Float f10;
        if (!this.f62973b || (f10 = this.f62972a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
