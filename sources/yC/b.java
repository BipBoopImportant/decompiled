package Yc;

import K9.C6619q;
import Zc.l;
import ad.C9406a;
import ga.C7900b;
import ga.e0;
import java.util.EnumMap;
import java.util.Map;

public abstract class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Map f64934d;

    /* renamed from: e  reason: collision with root package name */
    public static final Map f64935e;

    /* renamed from: a  reason: collision with root package name */
    private final String f64936a;

    /* renamed from: b  reason: collision with root package name */
    private final C9406a f64937b;

    /* renamed from: c  reason: collision with root package name */
    private final l f64938c;

    static {
        Class<C9406a> cls = C9406a.class;
        f64934d = new EnumMap(cls);
        f64935e = new EnumMap(cls);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C6619q.b(this.f64936a, bVar.f64936a) && C6619q.b(this.f64937b, bVar.f64937b) && C6619q.b(this.f64938c, bVar.f64938c);
    }

    public int hashCode() {
        return C6619q.c(this.f64936a, this.f64937b, this.f64938c);
    }

    public String toString() {
        e0 a10 = C7900b.a("RemoteModel");
        a10.a("modelName", this.f64936a);
        a10.a("baseModel", this.f64937b);
        a10.a("modelType", this.f64938c);
        return a10.toString();
    }
}
