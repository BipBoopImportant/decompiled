package a7;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import q7.C8683e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"La7/l;", "", "a", "La7/l$a;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, d2 = {"La7/l$a;", "La7/l;", "Lq7/e;", "sct", "", "operator", "<init>", "(Lq7/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq7/e;", "b", "()Lq7/e;", "Ljava/lang/String;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements l {

        /* renamed from: a  reason: collision with root package name */
        private final C8683e f41530a;

        /* renamed from: b  reason: collision with root package name */
        private final String f41531b;

        public a(C8683e eVar, String str) {
            C17542s.j(eVar, "sct");
            C17542s.j(str, "operator");
            this.f41530a = eVar;
            this.f41531b = str;
        }

        public final String a() {
            return this.f41531b;
        }

        public final C8683e b() {
            return this.f41530a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f41530a, aVar.f41530a) && C17542s.e(this.f41531b, aVar.f41531b);
        }

        public int hashCode() {
            return (this.f41530a.hashCode() * 31) + this.f41531b.hashCode();
        }

        public String toString() {
            return "Valid SCT";
        }
    }
}
