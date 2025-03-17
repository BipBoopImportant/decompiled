package com.google.android.libraries.places.internal;

final class zzagg {
    private static final zzage zza = new zzagf();
    private static final zzage zzb;

    static {
        zzage zzage = null;
        try {
            zzage = (zzage) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        zzb = zzage;
    }

    static zzage zza() {
        zzage zzage = zzb;
        if (zzage != null) {
            return zzage;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzage zzb() {
        return zza;
    }
}
