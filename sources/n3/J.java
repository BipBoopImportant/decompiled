package N3;

import t3.C5950a;

public interface J {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final K f38761a;

        /* renamed from: b  reason: collision with root package name */
        public final K f38762b;

        public a(K k10) {
            this(k10, k10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f38761a.equals(aVar.f38761a) && this.f38762b.equals(aVar.f38762b);
        }

        public int hashCode() {
            return (this.f38761a.hashCode() * 31) + this.f38762b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f38761a);
            if (this.f38761a.equals(this.f38762b)) {
                str = "";
            } else {
                str = ", " + this.f38762b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(K k10, K k11) {
            this.f38761a = (K) C5950a.e(k10);
            this.f38762b = (K) C5950a.e(k11);
        }
    }

    public static class b implements J {

        /* renamed from: a  reason: collision with root package name */
        private final long f38763a;

        /* renamed from: b  reason: collision with root package name */
        private final a f38764b;

        public b(long j10) {
            this(j10, 0);
        }

        public a c(long j10) {
            return this.f38764b;
        }

        public boolean f() {
            return false;
        }

        public long l() {
            return this.f38763a;
        }

        public b(long j10, long j11) {
            this.f38763a = j10;
            this.f38764b = new a(j11 == 0 ? K.f38765c : new K(0, j11));
        }
    }

    a c(long j10);

    boolean f();

    long l();
}
