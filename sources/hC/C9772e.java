package hc;

import android.util.Base64;
import android.util.JsonWriter;
import fc.C9701b;
import fc.C9702c;
import fc.C9703d;
import fc.C9704e;
import fc.C9705f;
import fc.C9706g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* renamed from: hc.e  reason: case insensitive filesystem */
final class C9772e implements C9704e, C9706g {

    /* renamed from: a  reason: collision with root package name */
    private C9772e f73567a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f73568b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f73569c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, C9703d<?>> f73570d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, C9705f<?>> f73571e;

    /* renamed from: f  reason: collision with root package name */
    private final C9703d<Object> f73572f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f73573g;

    C9772e(Writer writer, Map<Class<?>, C9703d<?>> map, Map<Class<?>, C9705f<?>> map2, C9703d<Object> dVar, boolean z10) {
        this.f73569c = new JsonWriter(writer);
        this.f73570d = map;
        this.f73571e = map2;
        this.f73572f = dVar;
        this.f73573g = z10;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private C9772e w(String str, Object obj) {
        y();
        this.f73569c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f73569c.nullValue();
        return this;
    }

    private C9772e x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.f73569c.name(str);
        return k(obj, false);
    }

    private void y() {
        if (this.f73568b) {
            C9772e eVar = this.f73567a;
            if (eVar != null) {
                eVar.y();
                this.f73567a.f73568b = false;
                this.f73567a = null;
                this.f73569c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public C9704e b(C9702c cVar, Object obj) {
        return p(cVar.b(), obj);
    }

    public C9704e c(C9702c cVar, double d10) {
        return m(cVar.b(), d10);
    }

    public C9704e d(C9702c cVar, int i10) {
        return n(cVar.b(), i10);
    }

    public C9704e e(C9702c cVar, long j10) {
        return o(cVar.b(), j10);
    }

    public C9704e f(C9702c cVar, boolean z10) {
        return q(cVar.b(), z10);
    }

    public C9772e h(double d10) {
        y();
        this.f73569c.value(d10);
        return this;
    }

    public C9772e i(int i10) {
        y();
        this.f73569c.value((long) i10);
        return this;
    }

    public C9772e j(long j10) {
        y();
        this.f73569c.value(j10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C9772e k(Object obj, boolean z10) {
        if (z10 && t(obj)) {
            throw new C9701b(String.format("%s cannot be encoded inline", new Object[]{obj == null ? null : obj.getClass()}));
        } else if (obj == null) {
            this.f73569c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f73569c.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    return s((byte[]) obj);
                }
                this.f73569c.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i10 < length) {
                        this.f73569c.value((long) iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        j(jArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        this.f73569c.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        this.f73569c.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    for (Number k10 : (Number[]) obj) {
                        k(k10, false);
                    }
                } else {
                    for (Object k11 : (Object[]) obj) {
                        k(k11, false);
                    }
                }
                this.f73569c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f73569c.beginArray();
                for (Object k12 : (Collection) obj) {
                    k(k12, false);
                }
                this.f73569c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f73569c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new C9701b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                    }
                }
                this.f73569c.endObject();
                return this;
            } else {
                C9703d dVar = this.f73570d.get(obj.getClass());
                if (dVar != null) {
                    return v(dVar, obj, z10);
                }
                C9705f fVar = this.f73571e.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (!(obj instanceof Enum)) {
                    return v(this.f73572f, obj, z10);
                } else {
                    if (obj instanceof C9773f) {
                        i(((C9773f) obj).d());
                    } else {
                        a(((Enum) obj).name());
                    }
                    return this;
                }
            }
        }
    }

    /* renamed from: l */
    public C9772e a(String str) {
        y();
        this.f73569c.value(str);
        return this;
    }

    public C9772e m(String str, double d10) {
        y();
        this.f73569c.name(str);
        return h(d10);
    }

    public C9772e n(String str, int i10) {
        y();
        this.f73569c.name(str);
        return i(i10);
    }

    public C9772e o(String str, long j10) {
        y();
        this.f73569c.name(str);
        return j(j10);
    }

    public C9772e p(String str, Object obj) {
        return this.f73573g ? x(str, obj) : w(str, obj);
    }

    public C9772e q(String str, boolean z10) {
        y();
        this.f73569c.name(str);
        return g(z10);
    }

    /* renamed from: r */
    public C9772e g(boolean z10) {
        y();
        this.f73569c.value(z10);
        return this;
    }

    public C9772e s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.f73569c.nullValue();
        } else {
            this.f73569c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        y();
        this.f73569c.flush();
    }

    /* access modifiers changed from: package-private */
    public C9772e v(C9703d<Object> dVar, Object obj, boolean z10) {
        if (!z10) {
            this.f73569c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f73569c.endObject();
        }
        return this;
    }
}
