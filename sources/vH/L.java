package vh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\r¨\u0006\u001d"}, d2 = {"Lvh/L;", "", "", "openingHoursMonTime", "openingHoursTueTime", "openingHoursWedTime", "openingHoursThuTime", "openingHoursFriTime", "openingHoursSatTime", "openingHoursSunTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", "g", "d", "e", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class L {

    /* renamed from: a  reason: collision with root package name */
    private final String f77278a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77279b;

    /* renamed from: c  reason: collision with root package name */
    private final String f77280c;

    /* renamed from: d  reason: collision with root package name */
    private final String f77281d;

    /* renamed from: e  reason: collision with root package name */
    private final String f77282e;

    /* renamed from: f  reason: collision with root package name */
    private final String f77283f;

    /* renamed from: g  reason: collision with root package name */
    private final String f77284g;

    public L(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C17542s.j(str, "openingHoursMonTime");
        C17542s.j(str2, "openingHoursTueTime");
        C17542s.j(str3, "openingHoursWedTime");
        C17542s.j(str4, "openingHoursThuTime");
        C17542s.j(str5, "openingHoursFriTime");
        C17542s.j(str6, "openingHoursSatTime");
        C17542s.j(str7, "openingHoursSunTime");
        this.f77278a = str;
        this.f77279b = str2;
        this.f77280c = str3;
        this.f77281d = str4;
        this.f77282e = str5;
        this.f77283f = str6;
        this.f77284g = str7;
    }

    public final String a() {
        return this.f77282e;
    }

    public final String b() {
        return this.f77278a;
    }

    public final String c() {
        return this.f77283f;
    }

    public final String d() {
        return this.f77284g;
    }

    public final String e() {
        return this.f77281d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return C17542s.e(this.f77278a, l10.f77278a) && C17542s.e(this.f77279b, l10.f77279b) && C17542s.e(this.f77280c, l10.f77280c) && C17542s.e(this.f77281d, l10.f77281d) && C17542s.e(this.f77282e, l10.f77282e) && C17542s.e(this.f77283f, l10.f77283f) && C17542s.e(this.f77284g, l10.f77284g);
    }

    public final String f() {
        return this.f77279b;
    }

    public final String g() {
        return this.f77280c;
    }

    public int hashCode() {
        return (((((((((((this.f77278a.hashCode() * 31) + this.f77279b.hashCode()) * 31) + this.f77280c.hashCode()) * 31) + this.f77281d.hashCode()) * 31) + this.f77282e.hashCode()) * 31) + this.f77283f.hashCode()) * 31) + this.f77284g.hashCode();
    }

    public String toString() {
        String str = this.f77278a;
        String str2 = this.f77279b;
        String str3 = this.f77280c;
        String str4 = this.f77281d;
        String str5 = this.f77282e;
        String str6 = this.f77283f;
        String str7 = this.f77284g;
        return "OpeningHoursFragment(openingHoursMonTime=" + str + ", openingHoursTueTime=" + str2 + ", openingHoursWedTime=" + str3 + ", openingHoursThuTime=" + str4 + ", openingHoursFriTime=" + str5 + ", openingHoursSatTime=" + str6 + ", openingHoursSunTime=" + str7 + ")";
    }
}
