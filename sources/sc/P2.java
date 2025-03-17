package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"LSC/P2;", "", "", "title", "", "iconId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class P2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f115883a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f115884b;

    public P2(String str, Integer num) {
        C17542s.j(str, "title");
        this.f115883a = str;
        this.f115884b = num;
    }

    public final Integer a() {
        return this.f115884b;
    }

    public final String b() {
        return this.f115883a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2)) {
            return false;
        }
        P2 p22 = (P2) obj;
        return C17542s.e(this.f115883a, p22.f115883a) && C17542s.e(this.f115884b, p22.f115884b);
    }

    public int hashCode() {
        int hashCode = this.f115883a.hashCode() * 31;
        Integer num = this.f115884b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.f115883a;
        Integer num = this.f115884b;
        return "SkapaTabItem(title=" + str + ", iconId=" + num + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P2(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : num);
    }
}
