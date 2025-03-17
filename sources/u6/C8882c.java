package u6;

import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lu6/c;", "", "<init>", "()V", "a", "b", "Lu6/c$a;", "Lu6/c$b;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: u6.c  reason: case insensitive filesystem */
public abstract class C8882c {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu6/c$a;", "Lu6/c;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: u6.c$a */
    public static final class a extends C8882c {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f56870a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(th2, UiComponentContainer.RESULT_ERROR);
            this.f56870a = th2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f56870a, ((a) obj).f56870a);
        }

        public int hashCode() {
            return this.f56870a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f56870a + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu6/c$b;", "Lu6/c;", "Lu6/a;", "response", "<init>", "(Lu6/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu6/a;", "()Lu6/a;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: u6.c$b */
    public static final class b extends C8882c {

        /* renamed from: a  reason: collision with root package name */
        private final C8880a f56871a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C8880a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "response");
            this.f56871a = aVar;
        }

        public final C8880a a() {
            return this.f56871a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f56871a, ((b) obj).f56871a);
        }

        public int hashCode() {
            return this.f56871a.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.f56871a + ')';
        }
    }

    public /* synthetic */ C8882c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C8882c() {
    }
}
