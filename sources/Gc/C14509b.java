package gC;

import IB.C13018a;
import IC.C13023e;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LgC/b;", "", "LIB/a$a$a;", "amenityOpeningHours", "LgC/b$a;", "a", "(LIB/a$a$a;)LgC/b$a;", "LIC/e;", "b", "(LIB/a$a$a;)LIC/e;", "storedetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gC.b  reason: case insensitive filesystem */
public interface C14509b {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LgC/b$a;", "", "LgC/b$a$a;", "openStatus", "LIC/e;", "nextOpeningTimeLabel", "<init>", "(LgC/b$a$a;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LgC/b$a$a;", "b", "()LgC/b$a$a;", "LIC/e;", "()LIC/e;", "storedetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gC.b$a */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f127302c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C3118a f127303a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f127304b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LgC/b$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSED", "OPENS_SOON", "storedetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gC.b$a$a  reason: collision with other inner class name */
        public enum C3118a {
            CLOSED,
            OPENS_SOON;

            static {
                C3118a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        public a(C3118a aVar, C13023e eVar) {
            C17542s.j(aVar, "openStatus");
            this.f127303a = aVar;
            this.f127304b = eVar;
        }

        public final C13023e a() {
            return this.f127304b;
        }

        public final C3118a b() {
            return this.f127303a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f127303a == aVar.f127303a && C17542s.e(this.f127304b, aVar.f127304b);
        }

        public int hashCode() {
            int hashCode = this.f127303a.hashCode() * 31;
            C13023e eVar = this.f127304b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            C3118a aVar = this.f127303a;
            C13023e eVar = this.f127304b;
            return "NextOpeningTime(openStatus=" + aVar + ", nextOpeningTimeLabel=" + eVar + ")";
        }
    }

    a a(C13018a.C2677a.C2678a aVar);

    C13023e b(C13018a.C2677a.C2678a aVar);
}
