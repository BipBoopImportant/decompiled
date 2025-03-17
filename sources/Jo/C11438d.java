package jo;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Ljo/d;", "", "Ljo/d$a;", "timeSlot", "", "selected", "", "timePattern", "<init>", "(Ljo/d$a;ZLjava/lang/String;)V", "a", "(Ljo/d$a;ZLjava/lang/String;)Ljo/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljo/d$a;", "e", "()Ljo/d$a;", "b", "Z", "c", "()Z", "Ljava/lang/String;", "d", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jo.d  reason: case insensitive filesystem */
public final class C11438d {

    /* renamed from: a  reason: collision with root package name */
    private final a f98625a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f98626b;

    /* renamed from: c  reason: collision with root package name */
    private final String f98627c;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Ljo/d$a;", "", "Ljava/util/Date;", "fromDateTime", "toDateTime", "", "id", "", "deliveryPrice", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "b", "()Ljava/util/Date;", "d", "c", "Ljava/lang/String;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jo.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Date f98628a;

        /* renamed from: b  reason: collision with root package name */
        private final Date f98629b;

        /* renamed from: c  reason: collision with root package name */
        private final String f98630c;

        /* renamed from: d  reason: collision with root package name */
        private final Double f98631d;

        public a(Date date, Date date2, String str, Double d10) {
            C17542s.j(date, "fromDateTime");
            C17542s.j(date2, "toDateTime");
            C17542s.j(str, "id");
            this.f98628a = date;
            this.f98629b = date2;
            this.f98630c = str;
            this.f98631d = d10;
        }

        public final Double a() {
            return this.f98631d;
        }

        public final Date b() {
            return this.f98628a;
        }

        public final String c() {
            return this.f98630c;
        }

        public final Date d() {
            return this.f98629b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f98628a, aVar.f98628a) && C17542s.e(this.f98629b, aVar.f98629b) && C17542s.e(this.f98630c, aVar.f98630c) && C17542s.e(this.f98631d, aVar.f98631d);
        }

        public int hashCode() {
            int hashCode = ((((this.f98628a.hashCode() * 31) + this.f98629b.hashCode()) * 31) + this.f98630c.hashCode()) * 31;
            Double d10 = this.f98631d;
            return hashCode + (d10 == null ? 0 : d10.hashCode());
        }

        public String toString() {
            Date date = this.f98628a;
            Date date2 = this.f98629b;
            String str = this.f98630c;
            Double d10 = this.f98631d;
            return "TimeSlot(fromDateTime=" + date + ", toDateTime=" + date2 + ", id=" + str + ", deliveryPrice=" + d10 + ")";
        }
    }

    public C11438d(a aVar, boolean z10, String str) {
        C17542s.j(aVar, "timeSlot");
        C17542s.j(str, "timePattern");
        this.f98625a = aVar;
        this.f98626b = z10;
        this.f98627c = str;
    }

    public static /* synthetic */ C11438d b(C11438d dVar, a aVar, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = dVar.f98625a;
        }
        if ((i10 & 2) != 0) {
            z10 = dVar.f98626b;
        }
        if ((i10 & 4) != 0) {
            str = dVar.f98627c;
        }
        return dVar.a(aVar, z10, str);
    }

    public final C11438d a(a aVar, boolean z10, String str) {
        C17542s.j(aVar, "timeSlot");
        C17542s.j(str, "timePattern");
        return new C11438d(aVar, z10, str);
    }

    public final boolean c() {
        return this.f98626b;
    }

    public final String d() {
        return this.f98627c;
    }

    public final a e() {
        return this.f98625a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11438d)) {
            return false;
        }
        C11438d dVar = (C11438d) obj;
        return C17542s.e(this.f98625a, dVar.f98625a) && this.f98626b == dVar.f98626b && C17542s.e(this.f98627c, dVar.f98627c);
    }

    public int hashCode() {
        return (((this.f98625a.hashCode() * 31) + Boolean.hashCode(this.f98626b)) * 31) + this.f98627c.hashCode();
    }

    public String toString() {
        a aVar = this.f98625a;
        boolean z10 = this.f98626b;
        String str = this.f98627c;
        return "TimeSlotTimeHolder(timeSlot=" + aVar + ", selected=" + z10 + ", timePattern=" + str + ")";
    }
}
