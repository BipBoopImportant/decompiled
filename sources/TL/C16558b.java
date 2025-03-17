package TL;

import GK.C15775C;
import GK.C15805x;
import QL.h;
import WK.C16770e;
import com.squareup.moshi.f;
import com.squareup.moshi.q;

/* renamed from: TL.b  reason: case insensitive filesystem */
final class C16558b<T> implements h<T, C15775C> {

    /* renamed from: b  reason: collision with root package name */
    private static final C15805x f138924b = C15805x.e("application/json; charset=UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f138925a;

    C16558b(f<T> fVar) {
        this.f138925a = fVar;
    }

    /* renamed from: b */
    public C15775C a(T t10) {
        C16770e eVar = new C16770e();
        this.f138925a.toJson(q.q(eVar), t10);
        return C15775C.c(f138924b, eVar.i0());
    }
}
