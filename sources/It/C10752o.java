package It;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIt/o;", "", "a", "b", "LIt/o$a;", "LIt/o$b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: It.o  reason: case insensitive filesystem */
public interface C10752o {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"LIt/o$a;", "LIt/o;", "", "url", "currentOrderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.o$a */
    public static final class a implements C10752o {

        /* renamed from: a  reason: collision with root package name */
        private final String f82358a;

        /* renamed from: b  reason: collision with root package name */
        private final String f82359b;

        public a(String str, String str2) {
            C17542s.j(str, "url");
            C17542s.j(str2, "currentOrderId");
            this.f82358a = str;
            this.f82359b = str2;
        }

        public final String a() {
            return this.f82359b;
        }

        public final String b() {
            return this.f82358a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f82358a, aVar.f82358a) && C17542s.e(this.f82359b, aVar.f82359b);
        }

        public int hashCode() {
            return (this.f82358a.hashCode() * 31) + this.f82359b.hashCode();
        }

        public String toString() {
            String str = this.f82358a;
            String str2 = this.f82359b;
            return "FoodMobileCurrentOrder(url=" + str + ", currentOrderId=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001b"}, d2 = {"LIt/o$b;", "LIt/o;", "LIC/e;", "title", "timeLabel", "", "eventId", "eventImagePath", "<init>", "(LIC/e;LIC/e;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "d", "()LIC/e;", "b", "c", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: It.o$b */
    public static final class b implements C10752o {

        /* renamed from: e  reason: collision with root package name */
        public static final int f82360e = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f82361a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f82362b;

        /* renamed from: c  reason: collision with root package name */
        private final String f82363c;

        /* renamed from: d  reason: collision with root package name */
        private final String f82364d;

        public b(C13023e eVar, C13023e eVar2, String str, String str2) {
            C17542s.j(eVar, "title");
            C17542s.j(eVar2, "timeLabel");
            C17542s.j(str, "eventId");
            this.f82361a = eVar;
            this.f82362b = eVar2;
            this.f82363c = str;
            this.f82364d = str2;
        }

        public final String a() {
            return this.f82363c;
        }

        public final String b() {
            return this.f82364d;
        }

        public final C13023e c() {
            return this.f82362b;
        }

        public final C13023e d() {
            return this.f82361a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f82361a, bVar.f82361a) && C17542s.e(this.f82362b, bVar.f82362b) && C17542s.e(this.f82363c, bVar.f82363c) && C17542s.e(this.f82364d, bVar.f82364d);
        }

        public int hashCode() {
            int hashCode = ((((this.f82361a.hashCode() * 31) + this.f82362b.hashCode()) * 31) + this.f82363c.hashCode()) * 31;
            String str = this.f82364d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C13023e eVar = this.f82361a;
            C13023e eVar2 = this.f82362b;
            String str = this.f82363c;
            String str2 = this.f82364d;
            return "StoreEventReminder(title=" + eVar + ", timeLabel=" + eVar2 + ", eventId=" + str + ", eventImagePath=" + str2 + ")";
        }
    }
}
