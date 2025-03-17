package com.google.android.libraries.places.internal;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class zzmo extends zzmi {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicLong zzb = new AtomicLong();
    private static final ConcurrentLinkedQueue zzc = new ConcurrentLinkedQueue();
    private volatile zzlp zzd;

    private zzmo(String str) {
        super(str);
        String str2 = Build.FINGERPRINT;
        boolean z10 = true;
        boolean z11 = str2 == null || "robolectric".equals(str2);
        String str3 = Build.HARDWARE;
        boolean z12 = "goldfish".equals(str3) || "ranchu".equals(str3);
        String str4 = Build.TYPE;
        if (!"eng".equals(str4) && !"userdebug".equals(str4)) {
            z10 = false;
        }
        if (z11 || z12) {
            this.zzd = new zzmj().zza(zza());
        } else if (z10) {
            this.zzd = new zzmq().zzb(false).zza(zza());
        } else {
            this.zzd = null;
        }
    }

    public static zzlp zzb(String str) {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((zzmk) atomicReference.get()).zza(str);
        }
        zzmo zzmo = new zzmo(str.replace('$', '.'));
        zzmm.zza.offer(zzmo);
        if (atomicReference.get() != null) {
            while (true) {
                zzmo zzmo2 = (zzmo) zzmm.zza.poll();
                if (zzmo2 == null) {
                    break;
                }
                zzmo2.zzd = ((zzmk) zza.get()).zza(zzmo2.zza());
            }
            if (((zzmn) zzc.poll()) != null) {
                zzb.getAndDecrement();
                throw null;
            }
        }
        return zzmo;
    }
}
