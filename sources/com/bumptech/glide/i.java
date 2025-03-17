package com.bumptech.glide;

import C7.k;
import C7.l;
import E7.t;
import E7.v;
import I7.o;
import I7.p;
import I7.q;
import T7.f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final q f46508a;

    /* renamed from: b  reason: collision with root package name */
    private final T7.a f46509b;

    /* renamed from: c  reason: collision with root package name */
    private final T7.e f46510c;

    /* renamed from: d  reason: collision with root package name */
    private final f f46511d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f46512e;

    /* renamed from: f  reason: collision with root package name */
    private final Q7.f f46513f;

    /* renamed from: g  reason: collision with root package name */
    private final T7.b f46514g;

    /* renamed from: h  reason: collision with root package name */
    private final T7.d f46515h = new T7.d();

    /* renamed from: i  reason: collision with root package name */
    private final T7.c f46516i = new T7.c();

    /* renamed from: j  reason: collision with root package name */
    private final H2.f<List<Throwable>> f46517j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m10, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        H2.f<List<Throwable>> e10 = Z7.a.e();
        this.f46517j = e10;
        this.f46508a = new q(e10);
        this.f46509b = new T7.a();
        this.f46510c = new T7.e();
        this.f46511d = new f();
        this.f46512e = new com.bumptech.glide.load.data.f();
        this.f46513f = new Q7.f();
        this.f46514g = new T7.b();
        s(Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"}));
    }

    private <Data, TResource, Transcode> List<E7.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f46510c.d(cls, cls2)) {
            for (Class next2 : this.f46513f.b(next, cls3)) {
                arrayList.add(new E7.i(cls, next, next2, this.f46510c.b(cls, next), this.f46513f.a(next, next2), this.f46517j));
            }
        }
        return arrayList;
    }

    public <Data> i a(Class<Data> cls, C7.d<Data> dVar) {
        this.f46509b.a(cls, dVar);
        return this;
    }

    public <TResource> i b(Class<TResource> cls, l<TResource> lVar) {
        this.f46511d.a(cls, lVar);
        return this;
    }

    public <Data, TResource> i c(Class<Data> cls, Class<TResource> cls2, k<Data, TResource> kVar) {
        e("legacy_append", cls, cls2, kVar);
        return this;
    }

    public <Model, Data> i d(Class<Model> cls, Class<Data> cls2, p<Model, Data> pVar) {
        this.f46508a.a(cls, cls2, pVar);
        return this;
    }

    public <Data, TResource> i e(String str, Class<Data> cls, Class<TResource> cls2, k<Data, TResource> kVar) {
        this.f46510c.a(str, kVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b10 = this.f46514g.b();
        if (!b10.isEmpty()) {
            return b10;
        }
        throw new b();
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> a10 = this.f46516i.a(cls, cls2, cls3);
        if (this.f46516i.c(a10)) {
            return null;
        }
        if (a10 == null) {
            List<E7.i<Data, TResource, Transcode>> f10 = f(cls, cls2, cls3);
            if (f10.isEmpty()) {
                a10 = null;
            } else {
                a10 = new t<>(cls, cls2, cls3, f10, this.f46517j);
            }
            this.f46516i.d(cls, cls2, cls3, a10);
        }
        return a10;
    }

    public <Model> List<o<Model, ?>> i(Model model) {
        return this.f46508a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a10 = this.f46515h.a(cls, cls2, cls3);
        if (a10 == null) {
            a10 = new ArrayList<>();
            for (Class<?> d10 : this.f46508a.c(cls)) {
                for (Class next : this.f46510c.d(d10, cls2)) {
                    if (!this.f46513f.b(next, cls3).isEmpty() && !a10.contains(next)) {
                        a10.add(next);
                    }
                }
            }
            this.f46515h.b(cls, cls2, cls3, Collections.unmodifiableList(a10));
        }
        return a10;
    }

    public <X> l<X> k(v<X> vVar) {
        l<X> b10 = this.f46511d.b(vVar.d());
        if (b10 != null) {
            return b10;
        }
        throw new d(vVar.d());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x10) {
        return this.f46512e.a(x10);
    }

    public <X> C7.d<X> m(X x10) {
        C7.d<X> b10 = this.f46509b.b(x10.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new e(x10.getClass());
    }

    public boolean n(v<?> vVar) {
        return this.f46511d.b(vVar.d()) != null;
    }

    public i o(ImageHeaderParser imageHeaderParser) {
        this.f46514g.a(imageHeaderParser);
        return this;
    }

    public i p(e.a<?> aVar) {
        this.f46512e.b(aVar);
        return this;
    }

    public <TResource, Transcode> i q(Class<TResource> cls, Class<Transcode> cls2, Q7.e<TResource, Transcode> eVar) {
        this.f46513f.c(cls, cls2, eVar);
        return this;
    }

    public <Model, Data> i r(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        this.f46508a.f(cls, cls2, pVar);
        return this;
    }

    public final i s(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String add : list) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        this.f46510c.e(arrayList);
        return this;
    }
}
