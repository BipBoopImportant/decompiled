package com.google.android.libraries.places.internal;

import java.io.IOException;

public abstract class zzns {
    private static final zzns zza = new zznq("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzns zzb = new zznq("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzns zzc = new zznr("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzns zzd = new zznr("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzns zze = new zznp("base16()", "0123456789ABCDEF");

    zzns() {
    }

    public static zzns zzd() {
        return zze;
    }

    /* access modifiers changed from: package-private */
    public abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract int zzb(int i10);

    public final String zze(byte[] bArr, int i10, int i11) {
        zzjp.zzi(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzb(i11));
        try {
            zza(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
