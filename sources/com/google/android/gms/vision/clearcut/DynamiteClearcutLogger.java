package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.C7472c;
import com.google.android.gms.internal.vision.C7524p0;
import com.google.android.gms.internal.vision.C7546x;
import java.util.concurrent.ExecutorService;
import ya.d;

@Keep
public class DynamiteClearcutLogger {
    private static final ExecutorService zza = C7472c.a().i(2, C7524p0.f49363a);
    private b zzb = new b(0.03333333333333333d);
    /* access modifiers changed from: private */
    public VisionClearcutLogger zzc;

    public DynamiteClearcutLogger(@RecentlyNonNull Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i10, C7546x xVar) {
        if (i10 != 3 || this.zzb.a()) {
            zza.execute(new a(this, i10, xVar));
        } else {
            d.e("Skipping image analysis log due to rate limiting", new Object[0]);
        }
    }
}
