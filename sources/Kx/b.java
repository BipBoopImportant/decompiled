package Kx;

import D4.C6444s;
import D4.K;
import D4.L;
import D4.M;
import D4.P;
import Hx.d;
import TJ.C16532g;
import com.ingka.ikea.purchasehistorydata.impl.data.network.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"LKx/b;", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;", "purchaseHistoryRemoteDataSource", "<init>", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;)V", "LTJ/g;", "LD4/M;", "LHx/d;", "c", "()LTJ/g;", "a", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/e;", "LD4/s;", "", "b", "LD4/s;", "()LD4/s;", "invalidatingPagingSourceFactory", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final e f111767a;

    /* renamed from: b  reason: collision with root package name */
    private final C6444s<Integer, d> f111768b = new C6444s<>(new a(this));

    public b(e eVar) {
        C17542s.j(eVar, "purchaseHistoryRemoteDataSource");
        this.f111767a = eVar;
    }

    /* access modifiers changed from: private */
    public static final P d(b bVar) {
        return new c(bVar.f111767a);
    }

    public C6444s<Integer, d> b() {
        return this.f111768b;
    }

    public C16532g<M<d>> c() {
        return new K(new L(10, 0, false, 10, 0, 0, 50, (DefaultConstructorMarker) null), 0, b()).a();
    }
}
