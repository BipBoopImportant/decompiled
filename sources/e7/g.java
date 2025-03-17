package E7;

import C7.f;
import C7.i;
import C7.l;
import C7.m;
import E7.h;
import F7.b;
import G7.a;
import I7.o;
import com.bumptech.glide.d;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class g<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final List<o.a<?>> f35041a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f35042b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private d f35043c;

    /* renamed from: d  reason: collision with root package name */
    private Object f35044d;

    /* renamed from: e  reason: collision with root package name */
    private int f35045e;

    /* renamed from: f  reason: collision with root package name */
    private int f35046f;

    /* renamed from: g  reason: collision with root package name */
    private Class<?> f35047g;

    /* renamed from: h  reason: collision with root package name */
    private h.e f35048h;

    /* renamed from: i  reason: collision with root package name */
    private i f35049i;

    /* renamed from: j  reason: collision with root package name */
    private Map<Class<?>, m<?>> f35050j;

    /* renamed from: k  reason: collision with root package name */
    private Class<Transcode> f35051k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35052l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f35053m;

    /* renamed from: n  reason: collision with root package name */
    private f f35054n;

    /* renamed from: o  reason: collision with root package name */
    private com.bumptech.glide.g f35055o;

    /* renamed from: p  reason: collision with root package name */
    private j f35056p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f35057q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f35058r;

    g() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f35043c = null;
        this.f35044d = null;
        this.f35054n = null;
        this.f35047g = null;
        this.f35051k = null;
        this.f35049i = null;
        this.f35055o = null;
        this.f35050j = null;
        this.f35056p = null;
        this.f35041a.clear();
        this.f35052l = false;
        this.f35042b.clear();
        this.f35053m = false;
    }

    /* access modifiers changed from: package-private */
    public b b() {
        return this.f35043c.b();
    }

    /* access modifiers changed from: package-private */
    public List<f> c() {
        if (!this.f35053m) {
            this.f35053m = true;
            this.f35042b.clear();
            List<o.a<?>> g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a aVar = g10.get(i10);
                if (!this.f35042b.contains(aVar.f37037a)) {
                    this.f35042b.add(aVar.f37037a);
                }
                for (int i11 = 0; i11 < aVar.f37038b.size(); i11++) {
                    if (!this.f35042b.contains(aVar.f37038b.get(i11))) {
                        this.f35042b.add(aVar.f37038b.get(i11));
                    }
                }
            }
        }
        return this.f35042b;
    }

    /* access modifiers changed from: package-private */
    public a d() {
        return this.f35048h.a();
    }

    /* access modifiers changed from: package-private */
    public j e() {
        return this.f35056p;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f35046f;
    }

    /* access modifiers changed from: package-private */
    public List<o.a<?>> g() {
        if (!this.f35052l) {
            this.f35052l = true;
            this.f35041a.clear();
            List i10 = this.f35043c.i().i(this.f35044d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                o.a b10 = ((o) i10.get(i11)).b(this.f35044d, this.f35045e, this.f35046f, this.f35049i);
                if (b10 != null) {
                    this.f35041a.add(b10);
                }
            }
        }
        return this.f35041a;
    }

    /* access modifiers changed from: package-private */
    public <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f35043c.i().h(cls, this.f35047g, this.f35051k);
    }

    /* access modifiers changed from: package-private */
    public Class<?> i() {
        return this.f35044d.getClass();
    }

    /* access modifiers changed from: package-private */
    public List<o<File, ?>> j(File file) {
        return this.f35043c.i().i(file);
    }

    /* access modifiers changed from: package-private */
    public i k() {
        return this.f35049i;
    }

    /* access modifiers changed from: package-private */
    public com.bumptech.glide.g l() {
        return this.f35055o;
    }

    /* access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.f35043c.i().j(this.f35044d.getClass(), this.f35047g, this.f35051k);
    }

    /* access modifiers changed from: package-private */
    public <Z> l<Z> n(v<Z> vVar) {
        return this.f35043c.i().k(vVar);
    }

    /* access modifiers changed from: package-private */
    public <T> e<T> o(T t10) {
        return this.f35043c.i().l(t10);
    }

    /* access modifiers changed from: package-private */
    public f p() {
        return this.f35054n;
    }

    /* access modifiers changed from: package-private */
    public <X> C7.d<X> q(X x10) {
        return this.f35043c.i().m(x10);
    }

    /* access modifiers changed from: package-private */
    public Class<?> r() {
        return this.f35051k;
    }

    /* access modifiers changed from: package-private */
    public <Z> m<Z> s(Class<Z> cls) {
        m<Z> mVar = this.f35050j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, m<?>>> it = this.f35050j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f35050j.isEmpty() || !this.f35057q) {
            return K7.d.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    public int t() {
        return this.f35045e;
    }

    /* access modifiers changed from: package-private */
    public boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* access modifiers changed from: package-private */
    public <R> void v(d dVar, Object obj, f fVar, int i10, int i11, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, i iVar, Map<Class<?>, m<?>> map, boolean z10, boolean z11, h.e eVar) {
        this.f35043c = dVar;
        this.f35044d = obj;
        this.f35054n = fVar;
        this.f35045e = i10;
        this.f35046f = i11;
        this.f35056p = jVar;
        this.f35047g = cls;
        this.f35048h = eVar;
        this.f35051k = cls2;
        this.f35055o = gVar;
        this.f35049i = iVar;
        this.f35050j = map;
        this.f35057q = z10;
        this.f35058r = z11;
    }

    /* access modifiers changed from: package-private */
    public boolean w(v<?> vVar) {
        return this.f35043c.i().n(vVar);
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return this.f35058r;
    }

    /* access modifiers changed from: package-private */
    public boolean y(f fVar) {
        List<o.a<?>> g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (g10.get(i10).f37037a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
