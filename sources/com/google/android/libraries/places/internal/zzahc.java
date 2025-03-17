package com.google.android.libraries.places.internal;

public class zzahc {
    private static final zzagd zzb = zzagd.zza;
    protected volatile zzahw zza;
    private volatile zzaft zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzahc)) {
            return false;
        }
        zzahc zzahc = (zzahc) obj;
        zzahw zzahw = this.zza;
        zzahw zzahw2 = zzahc.zza;
        if (zzahw == null && zzahw2 == null) {
            return zzb().equals(zzahc.zzb());
        }
        if (zzahw != null && zzahw2 != null) {
            return zzahw.equals(zzahw2);
        }
        if (zzahw != null) {
            zzahc.zzc(zzahw.zzt());
            return zzahw.equals(zzahc.zza);
        }
        zzc(zzahw2.zzt());
        return this.zza.equals(zzahw2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzafq) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzv();
        }
        return 0;
    }

    public final zzaft zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            try {
                if (this.zzc != null) {
                    zzaft zzaft = this.zzc;
                    return zzaft;
                }
                if (this.zza == null) {
                    this.zzc = zzaft.zzb;
                } else {
                    this.zzc = this.zza.zzs();
                }
                zzaft zzaft2 = this.zzc;
                return zzaft2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.libraries.places.internal.zzahw r2) {
        /*
            r1 = this;
            com.google.android.libraries.places.internal.zzahw r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.libraries.places.internal.zzahw r0 = r1.zza     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x001b
            r1.zza = r2     // Catch:{ zzagz -> 0x0013 }
            com.google.android.libraries.places.internal.zzaft r0 = com.google.android.libraries.places.internal.zzaft.zzb     // Catch:{ zzagz -> 0x0013 }
            r1.zzc = r0     // Catch:{ zzagz -> 0x0013 }
            goto L_0x0019
        L_0x0011:
            r2 = move-exception
            goto L_0x001d
        L_0x0013:
            r1.zza = r2     // Catch:{ all -> 0x0011 }
            com.google.android.libraries.places.internal.zzaft r2 = com.google.android.libraries.places.internal.zzaft.zzb     // Catch:{ all -> 0x0011 }
            r1.zzc = r2     // Catch:{ all -> 0x0011 }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            return
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            return
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x0011 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzahc.zzc(com.google.android.libraries.places.internal.zzahw):void");
    }
}
