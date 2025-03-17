package ME;

import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;

/* renamed from: ME.b  reason: case insensitive filesystem */
public final class C13206b<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f112011a;

    public C13206b(f<T> fVar) {
        this.f112011a = fVar;
    }

    public T fromJson(k kVar) {
        return kVar.n() == k.b.NULL ? kVar.i() : this.f112011a.fromJson(kVar);
    }

    public void toJson(q qVar, T t10) {
        if (t10 == null) {
            qVar.o();
        } else {
            this.f112011a.toJson(qVar, t10);
        }
    }

    public String toString() {
        return this.f112011a + ".nullSafe()";
    }
}
