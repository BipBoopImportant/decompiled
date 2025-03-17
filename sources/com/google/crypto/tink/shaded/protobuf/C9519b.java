package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.S;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b  reason: case insensitive filesystem */
public abstract class C9519b<MessageType extends S> implements a0<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final C9533p f67964a = C9533p.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private n0 d(MessageType messagetype) {
        return messagetype instanceof C9518a ? ((C9518a) messagetype).f() : new n0(messagetype);
    }

    /* renamed from: e */
    public MessageType b(C9525h hVar, C9533p pVar) {
        return c(f(hVar, pVar));
    }

    public MessageType f(C9525h hVar, C9533p pVar) {
        C9526i A10 = hVar.A();
        MessageType messagetype = (S) a(A10, pVar);
        try {
            A10.a(0);
            return messagetype;
        } catch (B e10) {
            throw e10.k(messagetype);
        }
    }
}
