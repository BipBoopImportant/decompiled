package ut;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lut/o0;", "", "", "labelA11y", "Lp1/v0;", "tint", "busynessText", "statusText", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "d", "()J", "c", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f104300a;

    /* renamed from: b  reason: collision with root package name */
    private final long f104301b;

    /* renamed from: c  reason: collision with root package name */
    private final String f104302c;

    /* renamed from: d  reason: collision with root package name */
    private final String f104303d;

    public /* synthetic */ o0(String str, long j10, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, str2, str3);
    }

    public final String a() {
        return this.f104302c;
    }

    public final String b() {
        return this.f104300a;
    }

    public final String c() {
        return this.f104303d;
    }

    public final long d() {
        return this.f104301b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return C17542s.e(this.f104300a, o0Var.f104300a) && C5747v0.q(this.f104301b, o0Var.f104301b) && C17542s.e(this.f104302c, o0Var.f104302c) && C17542s.e(this.f104303d, o0Var.f104303d);
    }

    public int hashCode() {
        return (((((this.f104300a.hashCode() * 31) + C5747v0.w(this.f104301b)) * 31) + this.f104302c.hashCode()) * 31) + this.f104303d.hashCode();
    }

    public String toString() {
        String str = this.f104300a;
        String x10 = C5747v0.x(this.f104301b);
        String str2 = this.f104302c;
        String str3 = this.f104303d;
        return "OpeningHoursData(labelA11y=" + str + ", tint=" + x10 + ", busynessText=" + str2 + ", statusText=" + str3 + ")";
    }

    private o0(String str, long j10, String str2, String str3) {
        C17542s.j(str, "labelA11y");
        C17542s.j(str2, "busynessText");
        C17542s.j(str3, "statusText");
        this.f104300a = str;
        this.f104301b = j10;
        this.f104302c = str2;
        this.f104303d = str3;
    }
}
