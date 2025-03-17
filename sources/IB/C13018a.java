package IB;

import GB.C12916a;
import TJ.C16532g;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J*\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LIB/a;", "", "", "", "storeIds", "LTJ/g;", "LIB/a$a;", "a", "(Ljava/util/List;)LTJ/g;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: IB.a  reason: case insensitive filesystem */
public interface C13018a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LIB/a$a;", "", "", "storeId", "", "LIB/a$a$a;", "amenityOpeningHours", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: IB.a$a  reason: collision with other inner class name */
    public static final class C2677a {

        /* renamed from: a  reason: collision with root package name */
        private final String f110916a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C2678a> f110917b;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b \u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b#\u0010\u0011¨\u0006)"}, d2 = {"LIB/a$a$a;", "", "LGB/a$a;", "type", "", "open", "hasBreak", "", "openingTimeLabel", "closingTimeLabel", "Ljava/time/LocalDateTime;", "openingTime", "nextOpeningTime", "nextOpeningTimeLabel", "<init>", "(LGB/a$a;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LGB/a$a;", "h", "()LGB/a$a;", "b", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "c", "Z", "()Z", "d", "Ljava/lang/String;", "g", "f", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: IB.a$a$a  reason: collision with other inner class name */
        public static final class C2678a {

            /* renamed from: a  reason: collision with root package name */
            private final C12916a.C2641a f110918a;

            /* renamed from: b  reason: collision with root package name */
            private final Boolean f110919b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f110920c;

            /* renamed from: d  reason: collision with root package name */
            private final String f110921d;

            /* renamed from: e  reason: collision with root package name */
            private final String f110922e;

            /* renamed from: f  reason: collision with root package name */
            private final LocalDateTime f110923f;

            /* renamed from: g  reason: collision with root package name */
            private final LocalDateTime f110924g;

            /* renamed from: h  reason: collision with root package name */
            private final String f110925h;

            public C2678a(C12916a.C2641a aVar, Boolean bool, boolean z10, String str, String str2, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str3) {
                C17542s.j(aVar, "type");
                this.f110918a = aVar;
                this.f110919b = bool;
                this.f110920c = z10;
                this.f110921d = str;
                this.f110922e = str2;
                this.f110923f = localDateTime;
                this.f110924g = localDateTime2;
                this.f110925h = str3;
            }

            public final String a() {
                return this.f110922e;
            }

            public final boolean b() {
                return this.f110920c;
            }

            public final LocalDateTime c() {
                return this.f110924g;
            }

            public final String d() {
                return this.f110925h;
            }

            public final Boolean e() {
                return this.f110919b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2678a)) {
                    return false;
                }
                C2678a aVar = (C2678a) obj;
                return this.f110918a == aVar.f110918a && C17542s.e(this.f110919b, aVar.f110919b) && this.f110920c == aVar.f110920c && C17542s.e(this.f110921d, aVar.f110921d) && C17542s.e(this.f110922e, aVar.f110922e) && C17542s.e(this.f110923f, aVar.f110923f) && C17542s.e(this.f110924g, aVar.f110924g) && C17542s.e(this.f110925h, aVar.f110925h);
            }

            public final LocalDateTime f() {
                return this.f110923f;
            }

            public final String g() {
                return this.f110921d;
            }

            public final C12916a.C2641a h() {
                return this.f110918a;
            }

            public int hashCode() {
                int hashCode = this.f110918a.hashCode() * 31;
                Boolean bool = this.f110919b;
                int i10 = 0;
                int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.f110920c)) * 31;
                String str = this.f110921d;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f110922e;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                LocalDateTime localDateTime = this.f110923f;
                int hashCode5 = (hashCode4 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
                LocalDateTime localDateTime2 = this.f110924g;
                int hashCode6 = (hashCode5 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
                String str3 = this.f110925h;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return hashCode6 + i10;
            }

            public String toString() {
                C12916a.C2641a aVar = this.f110918a;
                Boolean bool = this.f110919b;
                boolean z10 = this.f110920c;
                String str = this.f110921d;
                String str2 = this.f110922e;
                LocalDateTime localDateTime = this.f110923f;
                LocalDateTime localDateTime2 = this.f110924g;
                String str3 = this.f110925h;
                return "AmenityOpeningHours(type=" + aVar + ", open=" + bool + ", hasBreak=" + z10 + ", openingTimeLabel=" + str + ", closingTimeLabel=" + str2 + ", openingTime=" + localDateTime + ", nextOpeningTime=" + localDateTime2 + ", nextOpeningTimeLabel=" + str3 + ")";
            }
        }

        public C2677a(String str, List<C2678a> list) {
            C17542s.j(str, "storeId");
            C17542s.j(list, "amenityOpeningHours");
            this.f110916a = str;
            this.f110917b = list;
        }

        public final List<C2678a> a() {
            return this.f110917b;
        }

        public final String b() {
            return this.f110916a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2677a)) {
                return false;
            }
            C2677a aVar = (C2677a) obj;
            return C17542s.e(this.f110916a, aVar.f110916a) && C17542s.e(this.f110917b, aVar.f110917b);
        }

        public int hashCode() {
            return (this.f110916a.hashCode() * 31) + this.f110917b.hashCode();
        }

        public String toString() {
            String str = this.f110916a;
            List<C2678a> list = this.f110917b;
            return "AmenityOpeningHoursResult(storeId=" + str + ", amenityOpeningHours=" + list + ")";
        }
    }

    C16532g<List<C2677a>> a(List<String> list);
}
