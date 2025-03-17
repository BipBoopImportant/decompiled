package KC;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LKC/r;", "", "<init>", "()V", "b", "a", "LKC/r$a;", "LKC/r$b;", "gift-card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final int f111614a = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LKC/r$a;", "LKC/r;", "", "errorTextRes", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "gift-card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends r {

        /* renamed from: b  reason: collision with root package name */
        private final int f111615b;

        public a(int i10) {
            super((DefaultConstructorMarker) null);
            this.f111615b = i10;
        }

        public final int a() {
            return this.f111615b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f111615b == ((a) obj).f111615b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f111615b);
        }

        public String toString() {
            int i10 = this.f111615b;
            return "CardNumberError(errorTextRes=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LKC/r$b;", "LKC/r;", "", "errorTextRes", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "gift-card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends r {

        /* renamed from: c  reason: collision with root package name */
        public static final int f111616c = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f111617b;

        public b(int i10) {
            super((DefaultConstructorMarker) null);
            this.f111617b = i10;
        }

        public final int a() {
            return this.f111617b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f111617b == ((b) obj).f111617b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f111617b);
        }

        public String toString() {
            int i10 = this.f111617b;
            return "PinError(errorTextRes=" + i10 + ")";
        }
    }

    public /* synthetic */ r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private r() {
    }
}
