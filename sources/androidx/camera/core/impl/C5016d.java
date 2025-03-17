package androidx.camera.core.impl;

import androidx.camera.core.impl.X;

/* renamed from: androidx.camera.core.impl.d  reason: case insensitive filesystem */
final class C5016d<T> extends X.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f16865a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f16866b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f16867c;

    C5016d(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f16865a = str;
            if (cls != null) {
                this.f16866b = cls;
                this.f16867c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public String c() {
        return this.f16865a;
    }

    public Object d() {
        return this.f16867c;
    }

    public Class<T> e() {
        return this.f16866b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X.a)) {
            return false;
        }
        X.a aVar = (X.a) obj;
        if (this.f16865a.equals(aVar.c()) && this.f16866b.equals(aVar.e())) {
            Object obj2 = this.f16867c;
            if (obj2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f16865a.hashCode() ^ 1000003) * 1000003) ^ this.f16866b.hashCode()) * 1000003;
        Object obj = this.f16867c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f16865a + ", valueClass=" + this.f16866b + ", token=" + this.f16867c + "}";
    }
}
