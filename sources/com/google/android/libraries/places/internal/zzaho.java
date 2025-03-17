package com.google.android.libraries.places.internal;

final class zzaho implements zzaii {
    private static final zzahu zza = new zzahm();
    private final zzahu zzb;

    public zzaho() {
        zzahu zzahu;
        zzagk zza2 = zzagk.zza();
        try {
            zzahu = (zzahu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            zzahu = zza;
        }
        zzahn zzahn = new zzahn(zza2, zzahu);
        byte[] bArr = zzagx.zzd;
        this.zzb = zzahn;
    }

    private static boolean zzb(zzaht zzaht) {
        return zzaht.zzc() + -1 != 1;
    }

    public final zzaih zza(Class cls) {
        zzaij.zzB(cls);
        zzaht zzb2 = this.zzb.zzb(cls);
        Class<zzago> cls2 = zzago.class;
        if (zzb2.zzb()) {
            return cls2.isAssignableFrom(cls) ? zzaia.zzi(zzaij.zzz(), zzagg.zzb(), zzb2.zza()) : zzaia.zzi(zzaij.zzy(), zzagg.zza(), zzb2.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzahz.zzi(cls, zzb2, zzaic.zzb(), zzahk.zzd(), zzaij.zzz(), zzagg.zzb(), zzahs.zzb());
            }
            return zzahz.zzi(cls, zzb2, zzaic.zzb(), zzahk.zzd(), zzaij.zzz(), (zzage) null, zzahs.zzb());
        } else if (zzb(zzb2)) {
            return zzahz.zzi(cls, zzb2, zzaic.zza(), zzahk.zzc(), zzaij.zzy(), zzagg.zza(), zzahs.zza());
        } else {
            return zzahz.zzi(cls, zzb2, zzaic.zza(), zzahk.zzc(), zzaij.zzy(), (zzage) null, zzahs.zza());
        }
    }
}
