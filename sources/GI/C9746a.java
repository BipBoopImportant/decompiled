package gi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgi/a;", "", "b", "a", "Lgi/a$a;", "Lgi/a$b;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.a  reason: case insensitive filesystem */
public interface C9746a {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgi/a$a;", "Lgi/a;", "", "productName", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.a$a  reason: collision with other inner class name */
    public static final class C1280a implements C9746a {

        /* renamed from: a  reason: collision with root package name */
        private final String f73346a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f73347b;

        public C1280a(String str, Throwable th2) {
            C17542s.j(str, "productName");
            C17542s.j(th2, "throwable");
            this.f73346a = str;
            this.f73347b = th2;
        }

        public final String a() {
            return this.f73346a;
        }

        public final Throwable b() {
            return this.f73347b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1280a)) {
                return false;
            }
            C1280a aVar = (C1280a) obj;
            return C17542s.e(this.f73346a, aVar.f73346a) && C17542s.e(this.f73347b, aVar.f73347b);
        }

        public int hashCode() {
            return (this.f73346a.hashCode() * 31) + this.f73347b.hashCode();
        }

        public String toString() {
            String str = this.f73346a;
            Throwable th2 = this.f73347b;
            return "Failure(productName=" + str + ", throwable=" + th2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lgi/a$b;", "Lgi/a;", "", "productName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.a$b */
    public static final class b implements C9746a {

        /* renamed from: a  reason: collision with root package name */
        private final String f73348a;

        public b(String str) {
            C17542s.j(str, "productName");
            this.f73348a = str;
        }

        public final String a() {
            return this.f73348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f73348a, ((b) obj).f73348a);
        }

        public int hashCode() {
            return this.f73348a.hashCode();
        }

        public String toString() {
            String str = this.f73348a;
            return "Success(productName=" + str + ")";
        }
    }
}
