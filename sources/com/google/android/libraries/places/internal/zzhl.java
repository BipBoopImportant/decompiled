package com.google.android.libraries.places.internal;

import j9.h;
import java.io.IOException;

public final /* synthetic */ class zzhl implements h {
    public static final /* synthetic */ zzhl zza = new zzhl();

    private /* synthetic */ zzhl() {
    }

    public final Object apply(Object obj) {
        zznw zznw = (zznw) obj;
        try {
            int zzv = zznw.zzv();
            byte[] bArr = new byte[zzv];
            zzagb zzz = zzagb.zzz(bArr, 0, zzv);
            zznw.zzK(zzz);
            zzz.zzA();
            return bArr;
        } catch (IOException e10) {
            String name = zznw.getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
