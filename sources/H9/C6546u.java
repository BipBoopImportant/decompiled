package H9;

import K9.C6602b;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import xa.C8972m;

/* renamed from: H9.u  reason: case insensitive filesystem */
public class C6546u {
    public static <ResultT> void a(Status status, ResultT resultt, C8972m<ResultT> mVar) {
        if (status.E0()) {
            mVar.c(resultt);
        } else {
            mVar.b(C6602b.a(status));
        }
    }

    public static void b(Status status, C8972m<Void> mVar) {
        a(status, (Object) null, mVar);
    }

    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean c(Status status, ResultT resultt, C8972m<ResultT> mVar) {
        return status.E0() ? mVar.e(resultt) : mVar.d(C6602b.a(status));
    }
}
