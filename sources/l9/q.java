package l9;

import j9.c;
import j9.h;
import j9.i;
import j9.j;
import java.util.Set;

final class q implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Set<c> f54897a;

    /* renamed from: b  reason: collision with root package name */
    private final p f54898b;

    /* renamed from: c  reason: collision with root package name */
    private final t f54899c;

    q(Set<c> set, p pVar, t tVar) {
        this.f54897a = set;
        this.f54898b = pVar;
        this.f54899c = tVar;
    }

    public <T> i<T> a(String str, Class<T> cls, h<T, byte[]> hVar) {
        return b(str, cls, c.b("proto"), hVar);
    }

    public <T> i<T> b(String str, Class<T> cls, c cVar, h<T, byte[]> hVar) {
        if (this.f54897a.contains(cVar)) {
            return new s(this.f54898b, str, cVar, hVar, this.f54899c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{cVar, this.f54897a}));
    }
}
