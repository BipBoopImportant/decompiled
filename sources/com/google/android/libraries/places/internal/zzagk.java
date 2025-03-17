package com.google.android.libraries.places.internal;

final class zzagk implements zzahu {
    private static final zzagk zza = new zzagk();

    private zzagk() {
    }

    public static zzagk zza() {
        return zza;
    }

    public final zzaht zzb(Class cls) {
        Class<zzago> cls2 = zzago.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzaht) zzago.zzx(cls.asSubclass(cls2)).zzb(3, (Object) null, (Object) null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zzago.class.isAssignableFrom(cls);
    }
}
