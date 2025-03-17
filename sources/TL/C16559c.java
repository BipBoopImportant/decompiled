package TL;

import GK.C15777E;
import QL.h;
import WK.C16772g;
import WK.C16773h;
import com.squareup.moshi.f;
import com.squareup.moshi.k;

/* renamed from: TL.c  reason: case insensitive filesystem */
final class C16559c<T> implements h<C15777E, T> {

    /* renamed from: b  reason: collision with root package name */
    private static final C16773h f138926b = C16773h.j("EFBBBF");

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f138927a;

    C16559c(f<T> fVar) {
        this.f138927a = fVar;
    }

    /* renamed from: b */
    public T a(C15777E e10) {
        C16772g k32 = e10.k3();
        try {
            C16773h hVar = f138926b;
            if (k32.h3(0, hVar)) {
                k32.M((long) hVar.W());
            }
            k l10 = k.l(k32);
            T fromJson = this.f138927a.fromJson(l10);
            if (l10.n() == k.b.END_DOCUMENT) {
                e10.close();
                return fromJson;
            }
            throw new com.squareup.moshi.h("JSON document was not fully consumed.");
        } catch (Throwable th2) {
            e10.close();
            throw th2;
        }
    }
}
