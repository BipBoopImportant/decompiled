package gC;

import IB.C13018a;
import IC.C13023e;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LgC/a;", "", "LIB/a$a$a;", "domainOpeningHours", "LgC/a$a;", "a", "(LIB/a$a$a;)LgC/a$a;", "storedetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gC.a  reason: case insensitive filesystem */
public interface C14508a {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LgC/a$a;", "", "LIC/e;", "label", "annotatedPart", "LgC/a$a$a;", "openStatus", "<init>", "(LIC/e;LIC/e;LgC/a$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "c", "LgC/a$a$a;", "()LgC/a$a$a;", "storedetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gC.a$a  reason: collision with other inner class name */
    public static final class C3116a {

        /* renamed from: d  reason: collision with root package name */
        public static final int f127298d = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f127299a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f127300b;

        /* renamed from: c  reason: collision with root package name */
        private final C3117a f127301c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LgC/a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSED", "OPENS_SOON", "OPEN", "storedetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gC.a$a$a  reason: collision with other inner class name */
        public enum C3117a {
            CLOSED,
            OPENS_SOON,
            OPEN;

            static {
                C3117a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        public C3116a(C13023e eVar, C13023e eVar2, C3117a aVar) {
            C17542s.j(eVar, "label");
            C17542s.j(eVar2, "annotatedPart");
            C17542s.j(aVar, "openStatus");
            this.f127299a = eVar;
            this.f127300b = eVar2;
            this.f127301c = aVar;
        }

        public final C13023e a() {
            return this.f127300b;
        }

        public final C13023e b() {
            return this.f127299a;
        }

        public final C3117a c() {
            return this.f127301c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3116a)) {
                return false;
            }
            C3116a aVar = (C3116a) obj;
            return C17542s.e(this.f127299a, aVar.f127299a) && C17542s.e(this.f127300b, aVar.f127300b) && this.f127301c == aVar.f127301c;
        }

        public int hashCode() {
            return (((this.f127299a.hashCode() * 31) + this.f127300b.hashCode()) * 31) + this.f127301c.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f127299a;
            C13023e eVar2 = this.f127300b;
            C3117a aVar = this.f127301c;
            return "OpeningHoursHeader(label=" + eVar + ", annotatedPart=" + eVar2 + ", openStatus=" + aVar + ")";
        }
    }

    C3116a a(C13018a.C2677a.C2678a aVar);
}
