package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;
import xa.C8972m;

public final class zzgs {
    private final zzgo zza;
    private final Map zzb = new HashMap();

    public zzgs(zzgo zzgo) {
        this.zza = zzgo;
    }

    public final boolean zza(C8972m mVar, long j10, String str) {
        if (this.zzb.containsKey(mVar)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
        handlerThread.start();
        this.zzb.put(mVar, handlerThread);
        return new Handler(handlerThread.getLooper()).postDelayed(new zzgp(mVar, "Location timeout."), j10);
    }

    public final boolean zzb(C8972m mVar) {
        HandlerThread handlerThread = (HandlerThread) this.zzb.remove(mVar);
        if (handlerThread == null) {
            return false;
        }
        return handlerThread.quit();
    }
}
