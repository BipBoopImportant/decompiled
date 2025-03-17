package uC;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import xB.C15201a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010#\u001a\u00020\u001f8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006$"}, d2 = {"LuC/c;", "LxB/a;", "", "id", "startTime", "endTime", "paymentCutOffTime", "hardCutOffTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "i", "c", "g", "d", "h", "e", "getHardCutOffTime", "", "f", "J", "()J", "stableId", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uC.c  reason: case insensitive filesystem */
public final class C15115c implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f131369a;

    /* renamed from: b  reason: collision with root package name */
    private final String f131370b;

    /* renamed from: c  reason: collision with root package name */
    private final String f131371c;

    /* renamed from: d  reason: collision with root package name */
    private final String f131372d;

    /* renamed from: e  reason: collision with root package name */
    private final String f131373e;

    /* renamed from: f  reason: collision with root package name */
    private final long f131374f;

    public C15115c(String str, String str2, String str3, String str4, String str5) {
        C17542s.j(str, "id");
        C17542s.j(str2, "startTime");
        C17542s.j(str3, "endTime");
        C17542s.j(str4, "paymentCutOffTime");
        C17542s.j(str5, "hardCutOffTime");
        this.f131369a = str;
        this.f131370b = str2;
        this.f131371c = str3;
        this.f131372d = str4;
        this.f131373e = str5;
        U u10 = new U(3);
        u10.a(P.b(C15115c.class));
        u10.a(str);
        u10.b(new Object[0]);
        this.f131374f = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15115c)) {
            return false;
        }
        C15115c cVar = (C15115c) obj;
        return C17542s.e(this.f131369a, cVar.f131369a) && C17542s.e(this.f131370b, cVar.f131370b) && C17542s.e(this.f131371c, cVar.f131371c) && C17542s.e(this.f131372d, cVar.f131372d) && C17542s.e(this.f131373e, cVar.f131373e);
    }

    public long f() {
        return this.f131374f;
    }

    public final String g() {
        return this.f131371c;
    }

    public final String getId() {
        return this.f131369a;
    }

    public final String h() {
        return this.f131372d;
    }

    public int hashCode() {
        return (((((((this.f131369a.hashCode() * 31) + this.f131370b.hashCode()) * 31) + this.f131371c.hashCode()) * 31) + this.f131372d.hashCode()) * 31) + this.f131373e.hashCode();
    }

    public final String i() {
        return this.f131370b;
    }

    public String toString() {
        String str = this.f131369a;
        String str2 = this.f131370b;
        String str3 = this.f131371c;
        String str4 = this.f131372d;
        String str5 = this.f131373e;
        return "TimeslotItem(id=" + str + ", startTime=" + str2 + ", endTime=" + str3 + ", paymentCutOffTime=" + str4 + ", hardCutOffTime=" + str5 + ")";
    }
}
