package GB;

import fI.C17221b;
import java.time.DayOfWeek;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"LGB/e;", "", "LGB/e$b;", "status", "LGB/e$a;", "data", "<init>", "(LGB/e$b;LGB/e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGB/e$b;", "getStatus", "()LGB/e$b;", "b", "LGB/e$a;", "()LGB/e$a;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final b f110260a;

    /* renamed from: b  reason: collision with root package name */
    private final a f110261b;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"LGB/e$a;", "", "Ljava/time/DayOfWeek;", "day", "", "hour", "accuracy", "live", "trend", "<init>", "(Ljava/time/DayOfWeek;IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/DayOfWeek;", "()Ljava/time/DayOfWeek;", "b", "I", "c", "getAccuracy", "d", "e", "getTrend", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final DayOfWeek f110262a;

        /* renamed from: b  reason: collision with root package name */
        private final int f110263b;

        /* renamed from: c  reason: collision with root package name */
        private final int f110264c;

        /* renamed from: d  reason: collision with root package name */
        private final int f110265d;

        /* renamed from: e  reason: collision with root package name */
        private final int f110266e;

        public a(DayOfWeek dayOfWeek, int i10, int i11, int i12, int i13) {
            C17542s.j(dayOfWeek, "day");
            this.f110262a = dayOfWeek;
            this.f110263b = i10;
            this.f110264c = i11;
            this.f110265d = i12;
            this.f110266e = i13;
        }

        public final DayOfWeek a() {
            return this.f110262a;
        }

        public final int b() {
            return this.f110263b;
        }

        public final int c() {
            return this.f110265d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f110262a == aVar.f110262a && this.f110263b == aVar.f110263b && this.f110264c == aVar.f110264c && this.f110265d == aVar.f110265d && this.f110266e == aVar.f110266e;
        }

        public int hashCode() {
            return (((((((this.f110262a.hashCode() * 31) + Integer.hashCode(this.f110263b)) * 31) + Integer.hashCode(this.f110264c)) * 31) + Integer.hashCode(this.f110265d)) * 31) + Integer.hashCode(this.f110266e);
        }

        public String toString() {
            DayOfWeek dayOfWeek = this.f110262a;
            int i10 = this.f110263b;
            int i11 = this.f110264c;
            int i12 = this.f110265d;
            int i13 = this.f110266e;
            return "Data(day=" + dayOfWeek + ", hour=" + i10 + ", accuracy=" + i11 + ", live=" + i12 + ", trend=" + i13 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LGB/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "Open", "Closed", "Unknown", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        Open,
        Closed,
        Unknown;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public e(b bVar, a aVar) {
        C17542s.j(bVar, "status");
        this.f110260a = bVar;
        this.f110261b = aVar;
    }

    public final a a() {
        return this.f110261b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f110260a == eVar.f110260a && C17542s.e(this.f110261b, eVar.f110261b);
    }

    public int hashCode() {
        int hashCode = this.f110260a.hashCode() * 31;
        a aVar = this.f110261b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        b bVar = this.f110260a;
        a aVar = this.f110261b;
        return "PopularTimesLive(status=" + bVar + ", data=" + aVar + ")";
    }
}
