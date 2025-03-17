package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzaff;
import com.google.android.libraries.places.internal.zzafg;
import java.io.IOException;

public abstract class zzafg<MessageType extends zzafg<MessageType, BuilderType>, BuilderType extends zzaff<MessageType, BuilderType>> implements zzahw {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    public int zzr(zzaih zzaih) {
        throw null;
    }

    public final zzaft zzs() {
        try {
            int zzv = zzv();
            zzaft zzaft = zzaft.zzb;
            byte[] bArr = new byte[zzv];
            zzagb zzz = zzagb.zzz(bArr, 0, zzv);
            zzK(zzz);
            zzz.zzA();
            return new zzafq(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
