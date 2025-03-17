package Hx;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0018B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b \u0010\u001fR\u001a\u0010\"\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\u0018\u0010\u000e¨\u0006#"}, d2 = {"LHx/h;", "", "", "id", "dateTimeRange", "timeRange", "", "atlPermitted", "LHx/h$b;", "startDateTime", "endDateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLHx/h$b;LHx/h$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "f", "Z", "()Z", "e", "LHx/h$b;", "()LHx/h$b;", "getEndDateTime", "g", "dateFormat", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f110811a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110812b;

    /* renamed from: c  reason: collision with root package name */
    private final String f110813c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f110814d;

    /* renamed from: e  reason: collision with root package name */
    private final b f110815e;

    /* renamed from: f  reason: collision with root package name */
    private final b f110816f;

    /* renamed from: g  reason: collision with root package name */
    private final String f110817g = "yyyy-MM-dd";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LHx/h$a;", "", "", "id", "dateTimeRange", "", "atlPermitted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "getAtlPermitted", "()Z", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f110818a;

        /* renamed from: b  reason: collision with root package name */
        private final String f110819b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f110820c;

        public a(String str, String str2, boolean z10) {
            C17542s.j(str2, "dateTimeRange");
            this.f110818a = str;
            this.f110819b = str2;
            this.f110820c = z10;
        }

        public final String a() {
            return this.f110819b;
        }

        public final String b() {
            return this.f110818a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f110818a, aVar.f110818a) && C17542s.e(this.f110819b, aVar.f110819b) && this.f110820c == aVar.f110820c;
        }

        public int hashCode() {
            String str = this.f110818a;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.f110819b.hashCode()) * 31) + Boolean.hashCode(this.f110820c);
        }

        public String toString() {
            String str = this.f110818a;
            String str2 = this.f110819b;
            boolean z10 = this.f110820c;
            return "BookedSlot(id=" + str + ", dateTimeRange=" + str2 + ", atlPermitted=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LHx/h$b;", "", "", "date", "formattedTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f110821a;

        /* renamed from: b  reason: collision with root package name */
        private final String f110822b;

        public b(String str, String str2) {
            C17542s.j(str, "date");
            C17542s.j(str2, "formattedTime");
            this.f110821a = str;
            this.f110822b = str2;
        }

        public final String a() {
            return this.f110821a;
        }

        public final String b() {
            return this.f110822b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f110821a, bVar.f110821a) && C17542s.e(this.f110822b, bVar.f110822b);
        }

        public int hashCode() {
            return (this.f110821a.hashCode() * 31) + this.f110822b.hashCode();
        }

        public String toString() {
            String str = this.f110821a;
            String str2 = this.f110822b;
            return "TimeWindowDateTime(date=" + str + ", formattedTime=" + str2 + ")";
        }
    }

    public h(String str, String str2, String str3, boolean z10, b bVar, b bVar2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "dateTimeRange");
        C17542s.j(str3, "timeRange");
        C17542s.j(bVar, "startDateTime");
        C17542s.j(bVar2, "endDateTime");
        this.f110811a = str;
        this.f110812b = str2;
        this.f110813c = str3;
        this.f110814d = z10;
        this.f110815e = bVar;
        this.f110816f = bVar2;
    }

    public final boolean a() {
        return this.f110814d;
    }

    public final String b() {
        return this.f110817g;
    }

    public final String c() {
        return this.f110812b;
    }

    public final String d() {
        return this.f110811a;
    }

    public final b e() {
        return this.f110815e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return C17542s.e(this.f110811a, hVar.f110811a) && C17542s.e(this.f110812b, hVar.f110812b) && C17542s.e(this.f110813c, hVar.f110813c) && this.f110814d == hVar.f110814d && C17542s.e(this.f110815e, hVar.f110815e) && C17542s.e(this.f110816f, hVar.f110816f);
    }

    public final String f() {
        return this.f110813c;
    }

    public int hashCode() {
        return (((((((((this.f110811a.hashCode() * 31) + this.f110812b.hashCode()) * 31) + this.f110813c.hashCode()) * 31) + Boolean.hashCode(this.f110814d)) * 31) + this.f110815e.hashCode()) * 31) + this.f110816f.hashCode();
    }

    public String toString() {
        String str = this.f110811a;
        String str2 = this.f110812b;
        String str3 = this.f110813c;
        boolean z10 = this.f110814d;
        b bVar = this.f110815e;
        b bVar2 = this.f110816f;
        return "RescheduleTimeWindow(id=" + str + ", dateTimeRange=" + str2 + ", timeRange=" + str3 + ", atlPermitted=" + z10 + ", startDateTime=" + bVar + ", endDateTime=" + bVar2 + ")";
    }
}
