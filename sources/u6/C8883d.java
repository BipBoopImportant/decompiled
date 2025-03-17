package u6;

import com.afterpay.android.cashapp.AfterpayCashAppValidationResponse;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lu6/d;", "", "<init>", "()V", "a", "b", "Lu6/d$a;", "Lu6/d$b;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: u6.d  reason: case insensitive filesystem */
public abstract class C8883d {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu6/d$a;", "Lu6/d;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: u6.d$a */
    public static final class a extends C8883d {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f56872a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(th2, UiComponentContainer.RESULT_ERROR);
            this.f56872a = th2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f56872a, ((a) obj).f56872a);
        }

        public int hashCode() {
            return this.f56872a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f56872a + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu6/d$b;", "Lu6/d;", "Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse;", "response", "<init>", "(Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse;", "getResponse", "()Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: u6.d$b */
    public static final class b extends C8883d {

        /* renamed from: a  reason: collision with root package name */
        private final AfterpayCashAppValidationResponse f56873a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AfterpayCashAppValidationResponse afterpayCashAppValidationResponse) {
            super((DefaultConstructorMarker) null);
            C17542s.j(afterpayCashAppValidationResponse, "response");
            this.f56873a = afterpayCashAppValidationResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f56873a, ((b) obj).f56873a);
        }

        public int hashCode() {
            return this.f56873a.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.f56873a + ')';
        }
    }

    public /* synthetic */ C8883d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C8883d() {
    }
}
