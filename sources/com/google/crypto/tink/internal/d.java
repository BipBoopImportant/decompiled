package com.google.crypto.tink.internal;

import Cb.y;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.S;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import qb.C10167l;
import vb.C10302b;

public abstract class d<KeyProtoT extends S> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyProtoT> f67852a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, m<?, KeyProtoT>> f67853b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f67854c;

    public static abstract class a<KeyFormatProtoT extends S, KeyProtoT extends S> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<KeyFormatProtoT> f67855a;

        /* renamed from: com.google.crypto.tink.internal.d$a$a  reason: collision with other inner class name */
        public static final class C1174a<KeyFormatProtoT> {

            /* renamed from: a  reason: collision with root package name */
            public KeyFormatProtoT f67856a;

            /* renamed from: b  reason: collision with root package name */
            public C10167l.b f67857b;

            public C1174a(KeyFormatProtoT keyformatprotot, C10167l.b bVar) {
                this.f67856a = keyformatprotot;
                this.f67857b = bVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.f67855a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.f67855a;
        }

        public Map<String, C1174a<KeyFormatProtoT>> c() {
            return Collections.emptyMap();
        }

        public abstract KeyFormatProtoT d(C9525h hVar);

        public abstract void e(KeyFormatProtoT keyformatprotot);
    }

    @SafeVarargs
    protected d(Class<KeyProtoT> cls, m<?, KeyProtoT>... mVarArr) {
        this.f67852a = cls;
        HashMap hashMap = new HashMap();
        int length = mVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            m<?, KeyProtoT> mVar = mVarArr[i10];
            if (!hashMap.containsKey(mVar.b())) {
                hashMap.put(mVar.b(), mVar);
                i10++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
        }
        if (mVarArr.length > 0) {
            this.f67854c = mVarArr[0].b();
        } else {
            this.f67854c = Void.class;
        }
        this.f67853b = Collections.unmodifiableMap(hashMap);
    }

    public C10302b.C1424b a() {
        return C10302b.C1424b.ALGORITHM_NOT_FIPS;
    }

    public final Class<?> b() {
        return this.f67854c;
    }

    public final Class<KeyProtoT> c() {
        return this.f67852a;
    }

    public abstract String d();

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) {
        m mVar = this.f67853b.get(cls);
        if (mVar != null) {
            return mVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> f();

    public abstract y.c g();

    public abstract KeyProtoT h(C9525h hVar);

    public final Set<Class<?>> i() {
        return this.f67853b.keySet();
    }

    public abstract void j(KeyProtoT keyprotot);
}
