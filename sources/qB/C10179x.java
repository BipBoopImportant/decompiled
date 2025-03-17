package qb;

import Cb.A;
import Cb.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.h;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.S;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: qb.x  reason: case insensitive filesystem */
public final class C10179x {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f76008a = Logger.getLogger(C10179x.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<C10165j> f76009b = new AtomicReference<>(new C10165j());

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap<String, b> f76010c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f76011d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<String, Object> f76012e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentMap<String, C10167l> f76013f = new ConcurrentHashMap();

    /* renamed from: qb.x$a */
    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f76014a;

        a(d dVar) {
            this.f76014a = dVar;
        }
    }

    /* renamed from: qb.x$b */
    private interface b {
    }

    private C10179x() {
    }

    private static <KeyProtoT extends S> b a(d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    private static synchronized <KeyProtoT extends S, KeyFormatProtoT extends S> void b(String str, Map<String, d.a.C1174a<KeyFormatProtoT>> map, boolean z10) {
        synchronized (C10179x.class) {
            if (z10) {
                try {
                    ConcurrentMap<String, Boolean> concurrentMap = f76011d;
                    if (concurrentMap.containsKey(str)) {
                        if (!concurrentMap.get(str).booleanValue()) {
                            throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                if (f76009b.get().j(str)) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!f76013f.containsKey(next.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) next.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry next2 : map.entrySet()) {
                        if (f76013f.containsKey(next2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) next2.getKey()));
                        }
                    }
                }
            }
        }
    }

    static <KeyT extends C10162g, P> P c(KeyT keyt, Class<P> cls) {
        return h.c().b(keyt, cls);
    }

    public static Class<?> d(Class<?> cls) {
        try {
            return h.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P e(y yVar, Class<P> cls) {
        return f(yVar.W(), yVar.X(), cls);
    }

    public static <P> P f(String str, C9525h hVar, Class<P> cls) {
        return f76009b.get().c(str, cls).c(hVar);
    }

    public static <P> P g(String str, byte[] bArr, Class<P> cls) {
        return f(str, C9525h.m(bArr), cls);
    }

    public static C10163h<?> h(String str) {
        return f76009b.get().f(str);
    }

    static synchronized Map<String, C10167l> i() {
        Map<String, C10167l> unmodifiableMap;
        synchronized (C10179x.class) {
            unmodifiableMap = Collections.unmodifiableMap(f76013f);
        }
        return unmodifiableMap;
    }

    public static synchronized S j(A a10) {
        S d10;
        synchronized (C10179x.class) {
            C10163h<?> h10 = h(a10.W());
            if (f76011d.get(a10.W()).booleanValue()) {
                d10 = h10.d(a10.X());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a10.W());
            }
        }
        return d10;
    }

    public static synchronized y k(A a10) {
        y a11;
        synchronized (C10179x.class) {
            C10163h<?> h10 = h(a10.W());
            if (f76011d.get(a10.W()).booleanValue()) {
                a11 = h10.a(a10.X());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a10.W());
            }
        }
        return a11;
    }

    public static synchronized <KeyProtoT extends S> void l(d<KeyProtoT> dVar, boolean z10) {
        synchronized (C10179x.class) {
            if (dVar != null) {
                try {
                    AtomicReference<C10165j> atomicReference = f76009b;
                    C10165j jVar = new C10165j(atomicReference.get());
                    jVar.g(dVar);
                    String d10 = dVar.d();
                    b(d10, z10 ? dVar.f().c() : Collections.emptyMap(), z10);
                    if (!atomicReference.get().j(d10)) {
                        f76010c.put(d10, a(dVar));
                        if (z10) {
                            m(d10, dVar.f().c());
                        }
                    }
                    f76011d.put(d10, Boolean.valueOf(z10));
                    atomicReference.set(jVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    private static <KeyFormatProtoT extends S> void m(String str, Map<String, d.a.C1174a<KeyFormatProtoT>> map) {
        for (Map.Entry next : map.entrySet()) {
            f76013f.put((String) next.getKey(), C10167l.a(str, ((S) ((d.a.C1174a) next.getValue()).f67856a).a(), ((d.a.C1174a) next.getValue()).f67857b));
        }
    }

    public static synchronized <B, P> void n(C10178w<B, P> wVar) {
        synchronized (C10179x.class) {
            h.c().e(wVar);
        }
    }

    public static <B, P> P o(C10177v<B> vVar, Class<P> cls) {
        return h.c().f(vVar, cls);
    }
}
