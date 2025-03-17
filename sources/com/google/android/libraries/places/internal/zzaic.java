package com.google.android.libraries.places.internal;

final class zzaic {
    private static final zzaib zza;
    private static final zzaib zzb = new zzaib();

    static {
        zzaib zzaib = null;
        try {
            zzaib = (zzaib) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        zza = zzaib;
    }

    static zzaib zza() {
        return zza;
    }

    static zzaib zzb() {
        return zzb;
    }
}
