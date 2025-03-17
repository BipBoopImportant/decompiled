package GB;

import XH.v;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fI.C17220a;
import fI.C17221b;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0003\u001f\u0017\u001bBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"LGB/c;", "", "LGB/c$c;", "type", "", "LGB/c$b;", "hours", "closed", "exceptions", "LGB/c$a;", "extras", "<init>", "(LGB/c$c;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGB/c$c;", "e", "()LGB/c$c;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GB.c  reason: case insensitive filesystem */
public final class C12918c {

    /* renamed from: a  reason: collision with root package name */
    private final C2642c f110249a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f110250b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f110251c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b> f110252d;

    /* renamed from: e  reason: collision with root package name */
    private final List<a> f110253e;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LGB/c$a;", "", "", "heading", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GB.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f110254a;

        /* renamed from: b  reason: collision with root package name */
        private final String f110255b;

        public a(String str, String str2) {
            this.f110254a = str;
            this.f110255b = str2;
        }

        public final String a() {
            return this.f110255b;
        }

        public final String b() {
            return this.f110254a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f110254a, aVar.f110254a) && C17542s.e(this.f110255b, aVar.f110255b);
        }

        public int hashCode() {
            String str = this.f110254a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f110255b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f110254a;
            String str2 = this.f110255b;
            return "Extra(heading=" + str + ", body=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR)\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"LGB/c$b;", "", "Ljava/time/DayOfWeek;", "day", "Ljava/time/LocalDate;", "date", "", "LXH/v;", "Ljava/time/LocalTime;", "openingHours", "", "reason", "<init>", "(Ljava/time/DayOfWeek;Ljava/time/LocalDate;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/DayOfWeek;", "b", "()Ljava/time/DayOfWeek;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GB.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final DayOfWeek f110256a;

        /* renamed from: b  reason: collision with root package name */
        private final LocalDate f110257b;

        /* renamed from: c  reason: collision with root package name */
        private final List<v<LocalTime, LocalTime>> f110258c;

        /* renamed from: d  reason: collision with root package name */
        private final String f110259d;

        public b() {
            this((DayOfWeek) null, (LocalDate) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public final LocalDate a() {
            return this.f110257b;
        }

        public final DayOfWeek b() {
            return this.f110256a;
        }

        public final List<v<LocalTime, LocalTime>> c() {
            return this.f110258c;
        }

        public final String d() {
            return this.f110259d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f110256a == bVar.f110256a && C17542s.e(this.f110257b, bVar.f110257b) && C17542s.e(this.f110258c, bVar.f110258c) && C17542s.e(this.f110259d, bVar.f110259d);
        }

        public int hashCode() {
            DayOfWeek dayOfWeek = this.f110256a;
            int i10 = 0;
            int hashCode = (dayOfWeek == null ? 0 : dayOfWeek.hashCode()) * 31;
            LocalDate localDate = this.f110257b;
            int hashCode2 = (((hashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.f110258c.hashCode()) * 31;
            String str = this.f110259d;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            DayOfWeek dayOfWeek = this.f110256a;
            LocalDate localDate = this.f110257b;
            List<v<LocalTime, LocalTime>> list = this.f110258c;
            String str = this.f110259d;
            return "OpeningHour(day=" + dayOfWeek + ", date=" + localDate + ", openingHours=" + list + ", reason=" + str + ")";
        }

        public b(DayOfWeek dayOfWeek, LocalDate localDate, List<v<LocalTime, LocalTime>> list, String str) {
            C17542s.j(list, "openingHours");
            this.f110256a = dayOfWeek;
            this.f110257b = localDate;
            this.f110258c = list;
            this.f110259d = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(DayOfWeek dayOfWeek, LocalDate localDate, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : dayOfWeek, (i10 & 2) != 0 ? null : localDate, (i10 & 4) != 0 ? C16877v.n() : list, (i10 & 8) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LGB/c$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "STORE", "RESTAURANT", "BISTRO", "SMALAND", "CAFE", "CLICK_AND_COLLECT", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GB.c$c  reason: collision with other inner class name */
    public enum C2642c {
        STORE(PlaceTypes.STORE),
        RESTAURANT(PlaceTypes.RESTAURANT),
        BISTRO("bistro"),
        SMALAND("smaland"),
        CAFE(PlaceTypes.CAFE),
        CLICK_AND_COLLECT("clickncollect");
        
        public static final a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LGB/c$c$a;", "", "<init>", "()V", "", "type", "LGB/c$c;", "a", "(Ljava/lang/String;)LGB/c$c;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: GB.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C2642c a(String str) {
                T t10;
                C17542s.j(str, "type");
                Iterator<T> it = C2642c.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((C2642c) t10).j(), str)) {
                        break;
                    }
                }
                C2642c cVar = (C2642c) t10;
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalArgumentException("No enum value found for " + str);
            }

            private a() {
            }
        }

        static {
            C2642c[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private C2642c(String str) {
            this.value = str;
        }

        public static C17220a<C2642c> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }
    }

    public C12918c(C2642c cVar, List<b> list, List<b> list2, List<b> list3, List<a> list4) {
        C17542s.j(cVar, "type");
        C17542s.j(list, "hours");
        this.f110249a = cVar;
        this.f110250b = list;
        this.f110251c = list2;
        this.f110252d = list3;
        this.f110253e = list4;
    }

    public final List<b> a() {
        return this.f110251c;
    }

    public final List<b> b() {
        return this.f110252d;
    }

    public final List<a> c() {
        return this.f110253e;
    }

    public final List<b> d() {
        return this.f110250b;
    }

    public final C2642c e() {
        return this.f110249a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12918c)) {
            return false;
        }
        C12918c cVar = (C12918c) obj;
        return this.f110249a == cVar.f110249a && C17542s.e(this.f110250b, cVar.f110250b) && C17542s.e(this.f110251c, cVar.f110251c) && C17542s.e(this.f110252d, cVar.f110252d) && C17542s.e(this.f110253e, cVar.f110253e);
    }

    public int hashCode() {
        int hashCode = ((this.f110249a.hashCode() * 31) + this.f110250b.hashCode()) * 31;
        List<b> list = this.f110251c;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.f110252d;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<a> list3 = this.f110253e;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        C2642c cVar = this.f110249a;
        List<b> list = this.f110250b;
        List<b> list2 = this.f110251c;
        List<b> list3 = this.f110252d;
        List<a> list4 = this.f110253e;
        return "OpeningHours(type=" + cVar + ", hours=" + list + ", closed=" + list2 + ", exceptions=" + list3 + ", extras=" + list4 + ")";
    }
}
