package Vr;

import Ba.C6381e;
import com.google.android.gms.wallet.PaymentsClient;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import xa.C8971l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LVr/b;", "LVr/a;", "Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient", "<init>", "(Lcom/google/android/gms/wallet/PaymentsClient;)V", "LBa/e;", "request", "Lxa/l;", "", "a", "(LBa/e;)Lxa/l;", "Lcom/google/android/gms/wallet/PaymentsClient;", "gpay-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentsClient f88782a;

    public b(PaymentsClient paymentsClient) {
        C17542s.j(paymentsClient, "paymentsClient");
        this.f88782a = paymentsClient;
    }

    public C8971l<Boolean> a(C6381e eVar) {
        C17542s.j(eVar, "request");
        C8971l<Boolean> D10 = this.f88782a.D(eVar);
        C17542s.i(D10, "isReadyToPay(...)");
        return D10;
    }
}
