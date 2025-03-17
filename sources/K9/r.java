package K9;

import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import xa.C8971l;
import xa.C8972m;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Q f37904a = new N();

    public interface a<R extends n, T> {
        T a(R r10);
    }

    public static <R extends n, T> C8971l<T> a(i<R> iVar, a<R, T> aVar) {
        Q q10 = f37904a;
        C8972m mVar = new C8972m();
        iVar.a(new O(iVar, mVar, aVar, q10));
        return mVar.a();
    }

    public static <R extends n> C8971l<Void> b(i<R> iVar) {
        return a(iVar, new P());
    }
}
