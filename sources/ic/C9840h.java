package ic;

import fc.C9701b;
import fc.C9703d;
import fc.C9704e;
import fc.C9705f;
import gc.C9721a;
import gc.C9722b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ic.h  reason: case insensitive filesystem */
public class C9840h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, C9703d<?>> f74251a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, C9705f<?>> f74252b;

    /* renamed from: c  reason: collision with root package name */
    private final C9703d<Object> f74253c;

    /* renamed from: ic.h$a */
    public static final class a implements C9722b<a> {

        /* renamed from: d  reason: collision with root package name */
        private static final C9703d<Object> f74254d = new C9839g();

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, C9703d<?>> f74255a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<Class<?>, C9705f<?>> f74256b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private C9703d<Object> f74257c = f74254d;

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, C9704e eVar) {
            throw new C9701b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public C9840h c() {
            return new C9840h(new HashMap(this.f74255a), new HashMap(this.f74256b), this.f74257c);
        }

        public a d(C9721a aVar) {
            aVar.a(this);
            return this;
        }

        /* renamed from: f */
        public <U> a a(Class<U> cls, C9703d<? super U> dVar) {
            this.f74255a.put(cls, dVar);
            this.f74256b.remove(cls);
            return this;
        }
    }

    C9840h(Map<Class<?>, C9703d<?>> map, Map<Class<?>, C9705f<?>> map2, C9703d<Object> dVar) {
        this.f74251a = map;
        this.f74252b = map2;
        this.f74253c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new C9838f(outputStream, this.f74251a, this.f74252b, this.f74253c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
