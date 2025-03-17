package com.google.android.gms.vision.clearcut;

import E9.a;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.C0;
import com.google.android.gms.internal.vision.C7484f;
import com.google.android.gms.internal.vision.C7546x;
import ya.d;

@Keep
public class VisionClearcutLogger {
    private final a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(@RecentlyNonNull Context context) {
        this.zza = new a(context, "VISION", (String) null);
    }

    public final void zza(int i10, C7546x xVar) {
        byte[] g10 = xVar.g();
        if (i10 < 0 || i10 > 3) {
            d.d("Illegal event code: %d", Integer.valueOf(i10));
            return;
        }
        try {
            if (this.zzb) {
                this.zza.a(g10).b(i10).a();
                return;
            }
            C7546x.a x10 = C7546x.x();
            try {
                x10.f(g10, 0, g10.length, C0.c());
                d.b("Would have logged:\n%s", x10.toString());
            } catch (Exception e10) {
                d.c(e10, "Parsing error", new Object[0]);
            }
        } catch (Exception e11) {
            C7484f.b(e11);
            d.c(e11, "Failed to log", new Object[0]);
        }
    }
}
