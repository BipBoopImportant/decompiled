package GB;

import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"LGB/b;", "", "", "storeId", "Ljava/time/LocalDate;", "dataValidDate", "", "LGB/a;", "storeOpeningDetails", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/LocalDate;", "getDataValidDate", "()Ljava/time/LocalDate;", "c", "Ljava/util/List;", "()Ljava/util/List;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GB.b  reason: case insensitive filesystem */
public final class C12917b {

    /* renamed from: a  reason: collision with root package name */
    private final String f110246a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalDate f110247b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C12916a> f110248c;

    public C12917b(String str, LocalDate localDate, List<C12916a> list) {
        C17542s.j(str, "storeId");
        C17542s.j(localDate, "dataValidDate");
        C17542s.j(list, "storeOpeningDetails");
        this.f110246a = str;
        this.f110247b = localDate;
        this.f110248c = list;
    }

    public final String a() {
        return this.f110246a;
    }

    public final List<C12916a> b() {
        return this.f110248c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12917b)) {
            return false;
        }
        C12917b bVar = (C12917b) obj;
        return C17542s.e(this.f110246a, bVar.f110246a) && C17542s.e(this.f110247b, bVar.f110247b) && C17542s.e(this.f110248c, bVar.f110248c);
    }

    public int hashCode() {
        return (((this.f110246a.hashCode() * 31) + this.f110247b.hashCode()) * 31) + this.f110248c.hashCode();
    }

    public String toString() {
        String str = this.f110246a;
        LocalDate localDate = this.f110247b;
        List<C12916a> list = this.f110248c;
        return "AmenityOpeningHours(storeId=" + str + ", dataValidDate=" + localDate + ", storeOpeningDetails=" + list + ")";
    }
}
