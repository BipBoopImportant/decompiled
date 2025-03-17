package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Object> f46505a;

    static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, Object> f46506a = new HashMap();

        a() {
        }

        /* access modifiers changed from: package-private */
        public e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f46505a = Collections.unmodifiableMap(new HashMap(aVar.f46506a));
    }

    public boolean a(Class<Object> cls) {
        return this.f46505a.containsKey(cls);
    }
}
