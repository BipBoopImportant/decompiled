package Qw;

import Tw.C13710m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LQw/C;", "", "a", "LQw/a;", "LQw/C$a;", "LQw/E;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qw.C  reason: case insensitive filesystem */
public interface C13453C {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LQw/C$a;", "LQw/C;", "LTw/m;", "startPaymentAction", "<init>", "(LTw/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LTw/m;", "()LTw/m;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qw.C$a */
    public static final class a implements C13453C {

        /* renamed from: a  reason: collision with root package name */
        private final C13710m f114767a;

        public a(C13710m mVar) {
            C17542s.j(mVar, "startPaymentAction");
            this.f114767a = mVar;
        }

        public final C13710m a() {
            return this.f114767a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f114767a, ((a) obj).f114767a);
        }

        public int hashCode() {
            return this.f114767a.hashCode();
        }

        public String toString() {
            C13710m mVar = this.f114767a;
            return "StartPayment(startPaymentAction=" + mVar + ")";
        }
    }
}
