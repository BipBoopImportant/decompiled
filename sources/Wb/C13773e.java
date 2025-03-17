package WB;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LWB/e;", "", "a", "LWB/e$a;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WB.e  reason: case insensitive filesystem */
public interface C13773e {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LWB/e$a;", "LWB/e;", "", "expanded", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WB.e$a */
    public static final class a implements C13773e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f117525a;

        public a(boolean z10) {
            this.f117525a = z10;
        }

        public final boolean a() {
            return this.f117525a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f117525a == ((a) obj).f117525a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f117525a);
        }

        public String toString() {
            boolean z10 = this.f117525a;
            return "SmallStoreDetailsClicked(expanded=" + z10 + ")";
        }
    }
}
