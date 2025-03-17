package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.S;

/* renamed from: androidx.datastore.preferences.protobuf.b  reason: case insensitive filesystem */
public abstract class C5149b<MessageType extends S> implements a0<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final C5162o f21293a = C5162o.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private n0 d(MessageType messagetype) {
        return messagetype instanceof C5148a ? ((C5148a) messagetype).f() : new n0(messagetype);
    }

    /* renamed from: e */
    public MessageType a(C5154g gVar, C5162o oVar) {
        return c(f(gVar, oVar));
    }

    public MessageType f(C5154g gVar, C5162o oVar) {
        C5155h y10 = gVar.y();
        MessageType messagetype = (S) b(y10, oVar);
        try {
            y10.a(0);
            return messagetype;
        } catch (A e10) {
            throw e10.k(messagetype);
        }
    }
}
