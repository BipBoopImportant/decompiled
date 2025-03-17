package eJ;

import eJ.C17190a;
import eJ.C17206q;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: eJ.b  reason: case insensitive filesystem */
public abstract class C17191b<MessageType extends C17206q> implements C17208s<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final C17196g f143008a = C17196g.c();

    private MessageType e(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw f(messagetype).a().i(messagetype);
    }

    private C17212w f(MessageType messagetype) {
        return messagetype instanceof C17190a ? ((C17190a) messagetype).b() : new C17212w(messagetype);
    }

    /* renamed from: g */
    public MessageType d(InputStream inputStream, C17196g gVar) {
        return e(j(inputStream, gVar));
    }

    /* renamed from: h */
    public MessageType b(C17193d dVar, C17196g gVar) {
        return e(k(dVar, gVar));
    }

    /* renamed from: i */
    public MessageType a(InputStream inputStream, C17196g gVar) {
        return e(l(inputStream, gVar));
    }

    public MessageType j(InputStream inputStream, C17196g gVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return l(new C17190a.C3485a.C3486a(inputStream, C17194e.B(read, inputStream)), gVar);
        } catch (IOException e10) {
            throw new C17200k(e10.getMessage());
        }
    }

    public MessageType k(C17193d dVar, C17196g gVar) {
        C17194e A10 = dVar.A();
        MessageType messagetype = (C17206q) c(A10, gVar);
        try {
            A10.a(0);
            return messagetype;
        } catch (C17200k e10) {
            throw e10.i(messagetype);
        }
    }

    public MessageType l(InputStream inputStream, C17196g gVar) {
        C17194e h10 = C17194e.h(inputStream);
        MessageType messagetype = (C17206q) c(h10, gVar);
        try {
            h10.a(0);
            return messagetype;
        } catch (C17200k e10) {
            throw e10.i(messagetype);
        }
    }
}
