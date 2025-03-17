package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7215q;
import com.google.android.gms.internal.clearcut.r;

public abstract class r<MessageType extends C7215q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements N0 {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ N0 y2(M0 m02) {
        if (z().getClass().isInstance(m02)) {
            return a((C7215q) m02);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
