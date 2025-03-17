package dt;

import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Ldt/a;", "", "", "storeId", "orderId", "Ljava/time/LocalDateTime;", "expireTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;)V", "now", "", "d", "(Ljava/time/LocalDateTime;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dt.a  reason: case insensitive filesystem */
public final class C11240a {

    /* renamed from: a  reason: collision with root package name */
    private final String f97105a;

    /* renamed from: b  reason: collision with root package name */
    private final String f97106b;

    /* renamed from: c  reason: collision with root package name */
    private final LocalDateTime f97107c;

    public C11240a(String str, String str2, LocalDateTime localDateTime) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "orderId");
        C17542s.j(localDateTime, "expireTime");
        this.f97105a = str;
        this.f97106b = str2;
        this.f97107c = localDateTime;
    }

    public final LocalDateTime a() {
        return this.f97107c;
    }

    public final String b() {
        return this.f97106b;
    }

    public final String c() {
        return this.f97105a;
    }

    public final boolean d(LocalDateTime localDateTime) {
        C17542s.j(localDateTime, "now");
        return localDateTime.isAfter(this.f97107c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11240a)) {
            return false;
        }
        C11240a aVar = (C11240a) obj;
        return C17542s.e(this.f97105a, aVar.f97105a) && C17542s.e(this.f97106b, aVar.f97106b) && C17542s.e(this.f97107c, aVar.f97107c);
    }

    public int hashCode() {
        return (((this.f97105a.hashCode() * 31) + this.f97106b.hashCode()) * 31) + this.f97107c.hashCode();
    }

    public String toString() {
        String str = this.f97105a;
        String str2 = this.f97106b;
        LocalDateTime localDateTime = this.f97107c;
        return "FoodMobileCurrentOrder(storeId=" + str + ", orderId=" + str2 + ", expireTime=" + localDateTime + ")";
    }
}
