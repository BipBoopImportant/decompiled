package fx;

import GB.d;
import KJ.C15987c;
import java.time.DayOfWeek;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b \u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010'¨\u0006)"}, d2 = {"Lfx/n;", "", "LKJ/c;", "Lfx/m;", "barDataList", "Lfx/a;", "xAxisData", "Ljava/time/DayOfWeek;", "dayOfWeek", "LGB/d;", "nowBusyness", "", "isDayUsuallyOpen", "isToday", "<init>", "(LKJ/c;Lfx/a;Ljava/time/DayOfWeek;LGB/d;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "b", "Lfx/a;", "d", "()Lfx/a;", "c", "Ljava/time/DayOfWeek;", "()Ljava/time/DayOfWeek;", "LGB/d;", "()LGB/d;", "e", "Z", "()Z", "f", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fx.n  reason: case insensitive filesystem */
public final class C14471n {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<C14470m> f127121a;

    /* renamed from: b  reason: collision with root package name */
    private final C14458a f127122b;

    /* renamed from: c  reason: collision with root package name */
    private final DayOfWeek f127123c;

    /* renamed from: d  reason: collision with root package name */
    private final d f127124d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f127125e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f127126f;

    public C14471n(C15987c<C14470m> cVar, C14458a aVar, DayOfWeek dayOfWeek, d dVar, boolean z10, boolean z11) {
        C17542s.j(cVar, "barDataList");
        C17542s.j(aVar, "xAxisData");
        C17542s.j(dayOfWeek, "dayOfWeek");
        this.f127121a = cVar;
        this.f127122b = aVar;
        this.f127123c = dayOfWeek;
        this.f127124d = dVar;
        this.f127125e = z10;
        this.f127126f = z11;
    }

    public final C15987c<C14470m> a() {
        return this.f127121a;
    }

    public final DayOfWeek b() {
        return this.f127123c;
    }

    public final d c() {
        return this.f127124d;
    }

    public final C14458a d() {
        return this.f127122b;
    }

    public final boolean e() {
        return this.f127125e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14471n)) {
            return false;
        }
        C14471n nVar = (C14471n) obj;
        return C17542s.e(this.f127121a, nVar.f127121a) && C17542s.e(this.f127122b, nVar.f127122b) && this.f127123c == nVar.f127123c && this.f127124d == nVar.f127124d && this.f127125e == nVar.f127125e && this.f127126f == nVar.f127126f;
    }

    public final boolean f() {
        return this.f127126f;
    }

    public int hashCode() {
        int hashCode = ((((this.f127121a.hashCode() * 31) + this.f127122b.hashCode()) * 31) + this.f127123c.hashCode()) * 31;
        d dVar = this.f127124d;
        return ((((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.f127125e)) * 31) + Boolean.hashCode(this.f127126f);
    }

    public String toString() {
        C15987c<C14470m> cVar = this.f127121a;
        C14458a aVar = this.f127122b;
        DayOfWeek dayOfWeek = this.f127123c;
        d dVar = this.f127124d;
        boolean z10 = this.f127125e;
        boolean z11 = this.f127126f;
        return "ChartData(barDataList=" + cVar + ", xAxisData=" + aVar + ", dayOfWeek=" + dayOfWeek + ", nowBusyness=" + dVar + ", isDayUsuallyOpen=" + z10 + ", isToday=" + z11 + ")";
    }
}
