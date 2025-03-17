package Pn;

import Rn.i;
import Rn.j;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.CheckoutEndpoint;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPn/a;", "", "a", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1732a f85631a = new C1732a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPn/a$a;", "", "<init>", "()V", "LRn/i;", "c", "()LRn/i;", "Ltw/h;", "networkService", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint;", "b", "(Ltw/h;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint;", "a", "(Ltw/h;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/CheckoutEndpoint;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pn.a$a  reason: collision with other inner class name */
    public static final class C1732a {
        public /* synthetic */ C1732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CheckoutEndpoint a(h hVar) {
            C17542s.j(hVar, "networkService");
            return (CheckoutEndpoint) hVar.b(CheckoutEndpoint.class);
        }

        public final PaymentEndpoint b(h hVar) {
            C17542s.j(hVar, "networkService");
            return (PaymentEndpoint) hVar.b(PaymentEndpoint.class);
        }

        public final i c() {
            return new j(0, 0, 3, (DefaultConstructorMarker) null);
        }

        private C1732a() {
        }
    }
}
