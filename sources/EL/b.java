package el;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0012\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001a"}, d2 = {"Lel/b;", "", "", "uniqueId", "", "marginTop", "marginBottom", "marginLeftAndRight", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUniqueId", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "d", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f97130a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f97131b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f97132c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f97133d;

    public b(String str, Integer num, Integer num2, Integer num3) {
        C17542s.j(str, "uniqueId");
        this.f97130a = str;
        this.f97131b = num;
        this.f97132c = num2;
        this.f97133d = num3;
    }

    public final Integer a() {
        return this.f97132c;
    }

    public final Integer b() {
        return this.f97133d;
    }

    public final Integer c() {
        return this.f97131b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f97130a, bVar.f97130a) && C17542s.e(this.f97131b, bVar.f97131b) && C17542s.e(this.f97132c, bVar.f97132c) && C17542s.e(this.f97133d, bVar.f97133d);
    }

    public int hashCode() {
        int hashCode = this.f97130a.hashCode() * 31;
        Integer num = this.f97131b;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f97132c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f97133d;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f97130a;
        Integer num = this.f97131b;
        Integer num2 = this.f97132c;
        Integer num3 = this.f97133d;
        return "DividerViewModel(uniqueId=" + str + ", marginTop=" + num + ", marginBottom=" + num2 + ", marginLeftAndRight=" + num3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Integer num, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3);
    }
}
