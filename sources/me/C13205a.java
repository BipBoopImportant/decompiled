package ME;

import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;

/* renamed from: ME.a  reason: case insensitive filesystem */
public final class C13205a<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f112010a;

    public C13205a(f<T> fVar) {
        this.f112010a = fVar;
    }

    public T fromJson(k kVar) {
        if (kVar.n() != k.b.NULL) {
            return this.f112010a.fromJson(kVar);
        }
        throw new h("Unexpected null at " + kVar.m());
    }

    public void toJson(q qVar, T t10) {
        if (t10 != null) {
            this.f112010a.toJson(qVar, t10);
            return;
        }
        throw new h("Unexpected null at " + qVar.m());
    }

    public String toString() {
        return this.f112010a + ".nonNull()";
    }
}
