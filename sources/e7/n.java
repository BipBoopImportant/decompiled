package E7;

import C7.f;
import C7.i;
import C7.m;
import Y7.k;
import java.security.MessageDigest;
import java.util.Map;

class n implements f {

    /* renamed from: b  reason: collision with root package name */
    private final Object f35171b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35172c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35173d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f35174e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f35175f;

    /* renamed from: g  reason: collision with root package name */
    private final f f35176g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<?>, m<?>> f35177h;

    /* renamed from: i  reason: collision with root package name */
    private final i f35178i;

    /* renamed from: j  reason: collision with root package name */
    private int f35179j;

    n(Object obj, f fVar, int i10, int i11, Map<Class<?>, m<?>> map, Class<?> cls, Class<?> cls2, i iVar) {
        this.f35171b = k.d(obj);
        this.f35176g = (f) k.e(fVar, "Signature must not be null");
        this.f35172c = i10;
        this.f35173d = i11;
        this.f35177h = (Map) k.d(map);
        this.f35174e = (Class) k.e(cls, "Resource class must not be null");
        this.f35175f = (Class) k.e(cls2, "Transcode class must not be null");
        this.f35178i = (i) k.d(iVar);
    }

    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f35171b.equals(nVar.f35171b) && this.f35176g.equals(nVar.f35176g) && this.f35173d == nVar.f35173d && this.f35172c == nVar.f35172c && this.f35177h.equals(nVar.f35177h) && this.f35174e.equals(nVar.f35174e) && this.f35175f.equals(nVar.f35175f) && this.f35178i.equals(nVar.f35178i);
    }

    public int hashCode() {
        if (this.f35179j == 0) {
            int hashCode = this.f35171b.hashCode();
            this.f35179j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f35176g.hashCode()) * 31) + this.f35172c) * 31) + this.f35173d;
            this.f35179j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f35177h.hashCode();
            this.f35179j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f35174e.hashCode();
            this.f35179j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f35175f.hashCode();
            this.f35179j = hashCode5;
            this.f35179j = (hashCode5 * 31) + this.f35178i.hashCode();
        }
        return this.f35179j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f35171b + ", width=" + this.f35172c + ", height=" + this.f35173d + ", resourceClass=" + this.f35174e + ", transcodeClass=" + this.f35175f + ", signature=" + this.f35176g + ", hashCode=" + this.f35179j + ", transformations=" + this.f35177h + ", options=" + this.f35178i + '}';
    }
}
