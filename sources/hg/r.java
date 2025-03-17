package hg;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lhg/r;", "", "b", "a", "Lhg/r$a;", "Lhg/r$b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface r {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lhg/r$a;", "Lhg/r;", "", "productName", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        private final String f73821a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f73822b;

        public a(String str, Throwable th2) {
            C17542s.j(th2, "throwable");
            this.f73821a = str;
            this.f73822b = th2;
        }

        public final String a() {
            return this.f73821a;
        }

        public final Throwable b() {
            return this.f73822b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f73821a, aVar.f73821a) && C17542s.e(this.f73822b, aVar.f73822b);
        }

        public int hashCode() {
            String str = this.f73821a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f73822b.hashCode();
        }

        public String toString() {
            String str = this.f73821a;
            Throwable th2 = this.f73822b;
            return "AddToCartFailure(productName=" + str + ", throwable=" + th2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhg/r$b;", "Lhg/r;", "LIC/e;", "snackbarText", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements r {

        /* renamed from: b  reason: collision with root package name */
        public static final int f73823b = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f73824a;

        public b(C13023e eVar) {
            C17542s.j(eVar, "snackbarText");
            this.f73824a = eVar;
        }

        public final C13023e a() {
            return this.f73824a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f73824a, ((b) obj).f73824a);
        }

        public int hashCode() {
            return this.f73824a.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f73824a;
            return "AddToCartSuccess(snackbarText=" + eVar + ")";
        }
    }
}
