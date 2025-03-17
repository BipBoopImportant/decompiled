package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.W;
import com.google.android.gms.internal.vision.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class X<MessageType extends X<MessageType, BuilderType>, BuilderType extends W<MessageType, BuilderType>> implements A1 {
    protected int zza = 0;

    protected static <T> void d(Iterable<T> iterable, List<? super T> list) {
        U0.d(iterable);
        if (iterable instanceof C7506k1) {
            List<?> zzd = ((C7506k1) iterable).zzd();
            C7506k1 k1Var = (C7506k1) list;
            int size = list.size();
            for (Object next : zzd) {
                if (next == null) {
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(k1Var.size() - size);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    for (int size2 = k1Var.size() - 1; size2 >= size; size2--) {
                        k1Var.remove(size2);
                    }
                    throw new NullPointerException(sb3);
                } else if (next instanceof C7497i0) {
                    k1Var.M2((C7497i0) next);
                } else {
                    k1Var.add((String) next);
                }
            }
        } else if (iterable instanceof L1) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb4 = new StringBuilder(37);
                    sb4.append("Element at index ");
                    sb4.append(list.size() - size3);
                    sb4.append(" is null.");
                    String sb5 = sb4.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb5);
                }
                list.add(next2);
            }
        }
    }

    public final C7497i0 e() {
        try {
            C7529r0 B10 = C7497i0.B(r());
            b(B10.b());
            return B10.a();
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("ByteString");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(int i10) {
        throw new UnsupportedOperationException();
    }

    public final byte[] g() {
        try {
            byte[] bArr = new byte[r()];
            C7547x0 f10 = C7547x0.f(bArr);
            b(f10);
            f10.N();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 62 + "byte array".length());
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("byte array");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int k() {
        throw new UnsupportedOperationException();
    }
}
