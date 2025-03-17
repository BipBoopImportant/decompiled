package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7215q;
import com.google.android.gms.internal.clearcut.r;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.q  reason: case insensitive filesystem */
public abstract class C7215q<MessageType extends C7215q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements M0 {
    private static boolean zzey = false;
    protected int zzex = 0;

    /* access modifiers changed from: package-private */
    public void a(int i10) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        throw new UnsupportedOperationException();
    }

    public final A c() {
        try {
            F x10 = A.x(y());
            A(x10.b());
            return x10.a();
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
}
