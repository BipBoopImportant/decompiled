package GE;

import CE.C12699f;
import com.optimizely.ab.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: GE.d  reason: case insensitive filesystem */
public class C12939d {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f110491b = LoggerFactory.getLogger((Class<?>) C12939d.class);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class, C12941f> f110492a;

    /* renamed from: GE.d$a */
    public enum a {
        AB_TEST("ab-test"),
        FEATURE("feature"),
        FEATURE_TEST("feature-test"),
        FEATURE_VARIABLE("feature-variable"),
        ALL_FEATURE_VARIABLES("all-feature-variables"),
        FLAG("flag");
        
        private final String key;

        private a(String str) {
            this.key = str;
        }

        public String toString() {
            return this.key;
        }
    }

    public C12939d() {
        AtomicInteger atomicInteger = new AtomicInteger();
        HashMap hashMap = new HashMap();
        hashMap.put(C12936a.class, new C12941f(atomicInteger));
        hashMap.put(C12944i.class, new C12941f(atomicInteger));
        hashMap.put(C12937b.class, new C12941f(atomicInteger));
        hashMap.put(C12945j.class, new C12941f(atomicInteger));
        hashMap.put(C12699f.class, new C12941f(atomicInteger));
        this.f110492a = Collections.unmodifiableMap(hashMap);
    }

    public <T> int a(Class<T> cls, C12940e<T> eVar) {
        C12941f<T> b10 = b(cls);
        if (b10 != null) {
            return b10.a(eVar);
        }
        f110491b.warn("{} not supported by the NotificationCenter.", (Object) cls);
        return -1;
    }

    public <T> C12941f<T> b(Class cls) {
        return this.f110492a.get(cls);
    }

    public void c(Object obj) {
        C12941f<?> b10 = b(obj.getClass());
        if (b10 != null) {
            b10.b(obj);
            return;
        }
        throw new c("Unsupported notificationType");
    }
}
