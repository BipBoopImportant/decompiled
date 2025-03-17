package com.google.android.libraries.places.internal;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzagx {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName(Constants.ENCODING);
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzafx zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i10 = zzafx.zza;
        zzafv zzafv = new zzafv(bArr, 0, 0, false, (zzafu) null);
        try {
            zzafv.zza(0);
            zzf = zzafv;
        } catch (zzagz e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
