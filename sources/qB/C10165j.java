package qb;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.S;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: qb.j  reason: case insensitive filesystem */
final class C10165j {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f75970b = Logger.getLogger(C10165j.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<String, b> f75971a;

    /* renamed from: qb.j$a */
    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f75972a;

        a(d dVar) {
            this.f75972a = dVar;
        }

        public Class<?> a() {
            return this.f75972a.getClass();
        }

        public Set<Class<?>> b() {
            return this.f75972a.i();
        }

        public <Q> C10163h<Q> c(Class<Q> cls) {
            try {
                return new C10164i(this.f75972a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        public C10163h<?> d() {
            d dVar = this.f75972a;
            return new C10164i(dVar, dVar.b());
        }
    }

    /* renamed from: qb.j$b */
    private interface b {
        Class<?> a();

        Set<Class<?>> b();

        <P> C10163h<P> c(Class<P> cls);

        C10163h<?> d();
    }

    C10165j(C10165j jVar) {
        this.f75971a = new ConcurrentHashMap(jVar.f75971a);
    }

    private static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    private static <KeyProtoT extends S> b b(d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    private synchronized b d(String str) {
        if (this.f75971a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f75971a.get(str);
    }

    private <P> C10163h<P> e(String str, Class<P> cls) {
        b d10 = d(str);
        if (cls == null) {
            return d10.d();
        }
        if (d10.b().contains(cls)) {
            return d10.c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d10.a() + ", supported primitives: " + i(d10.b()));
    }

    private synchronized <P> void h(b bVar, boolean z10) {
        try {
            String b10 = bVar.d().b();
            b bVar2 = this.f75971a.get(b10);
            if (bVar2 != null) {
                if (!bVar2.a().equals(bVar.a())) {
                    Logger logger = f75970b;
                    logger.warning("Attempted overwrite of a registered key manager for key type " + b10);
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{b10, bVar2.a().getName(), bVar.a().getName()}));
                }
            }
            if (!z10) {
                this.f75971a.putIfAbsent(b10, bVar);
            } else {
                this.f75971a.put(b10, bVar);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private static String i(Set<Class<?>> set) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class next : set) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(next.getCanonicalName());
            z10 = false;
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public <P> C10163h<P> c(String str, Class<P> cls) {
        return e(str, (Class) a(cls));
    }

    /* access modifiers changed from: package-private */
    public C10163h<?> f(String str) {
        return d(str).d();
    }

    /* access modifiers changed from: package-private */
    public synchronized <KeyProtoT extends S> void g(d<KeyProtoT> dVar) {
        if (dVar.a().a()) {
            h(b(dVar), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean j(String str) {
        return this.f75971a.containsKey(str);
    }

    C10165j() {
        this.f75971a = new ConcurrentHashMap();
    }
}
