package com.google.protobuf;

import com.google.protobuf.S;

/* renamed from: com.google.protobuf.b  reason: case insensitive filesystem */
public abstract class C9569b<MessageType extends S> implements a0<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final C9583p f69263a = C9583p.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().j(messagetype);
    }

    private n0 d(MessageType messagetype) {
        return messagetype instanceof C9568a ? ((C9568a) messagetype).newUninitializedMessageException() : new n0(messagetype);
    }

    /* renamed from: e */
    public MessageType a(C9575h hVar, C9583p pVar) {
        return c(f(hVar, pVar));
    }

    public MessageType f(C9575h hVar, C9583p pVar) {
        C9576i y10 = hVar.y();
        MessageType messagetype = (S) b(y10, pVar);
        try {
            y10.a(0);
            return messagetype;
        } catch (B e10) {
            throw e10.j(messagetype);
        }
    }
}
