package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.T3;
import java.io.IOException;
import java.util.List;

public abstract class T3<MessageType extends T3<MessageType, BuilderType>, BuilderType extends S3<MessageType, BuilderType>> implements C7406s5 {
    protected int zza = 0;

    protected static <T> void h(Iterable<T> iterable, List<? super T> list) {
        S3.m(iterable, list);
    }

    public final C7276d4 f() {
        try {
            C7330j4 A10 = C7276d4.A(a());
            j(A10.b());
            return A10.a();
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "ByteString" + " threw an IOException (should never happen).", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int g(K5 k52) {
        int k10 = k();
        if (k10 != -1) {
            return k10;
        }
        int zza2 = k52.zza(this);
        i(zza2);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public void i(int i10) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int k() {
        throw new UnsupportedOperationException();
    }

    public final byte[] l() {
        try {
            byte[] bArr = new byte[a()];
            C7405s4 H10 = C7405s4.H(bArr);
            j(H10);
            H10.I();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "byte array" + " threw an IOException (should never happen).", e10);
        }
    }
}
