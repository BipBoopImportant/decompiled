package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.W;
import com.google.android.gms.internal.vision.X;

public abstract class W<MessageType extends X<MessageType, BuilderType>, BuilderType extends W<MessageType, BuilderType>> implements D1 {
    public final /* synthetic */ D1 H2(A1 a12) {
        if (c().getClass().isInstance(a12)) {
            return d((X) a12);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType d(MessageType messagetype);

    public abstract BuilderType f(byte[] bArr, int i10, int i11, C0 c02);
}
