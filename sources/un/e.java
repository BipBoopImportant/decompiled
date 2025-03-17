package un;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lun/e;", "", "", "start", "end", "", "searchPagingToken", "size", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "c", "Ljava/lang/String;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f103899a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f103900b;

    /* renamed from: c  reason: collision with root package name */
    private final String f103901c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f103902d;

    public e() {
        this((Integer) null, (Integer) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    public final Integer a() {
        return this.f103900b;
    }

    public final String b() {
        return this.f103901c;
    }

    public final Integer c() {
        return this.f103902d;
    }

    public final Integer d() {
        return this.f103899a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f103899a, eVar.f103899a) && C17542s.e(this.f103900b, eVar.f103900b) && C17542s.e(this.f103901c, eVar.f103901c) && C17542s.e(this.f103902d, eVar.f103902d);
    }

    public int hashCode() {
        Integer num = this.f103899a;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f103900b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f103901c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f103902d;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Integer num = this.f103899a;
        Integer num2 = this.f103900b;
        String str = this.f103901c;
        Integer num3 = this.f103902d;
        return "PlpPaginationParams(start=" + num + ", end=" + num2 + ", searchPagingToken=" + str + ", size=" + num3 + ")";
    }

    public e(Integer num, Integer num2, String str, Integer num3) {
        this.f103899a = num;
        this.f103900b = num2;
        this.f103901c = str;
        this.f103902d = num3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Integer num, Integer num2, String str, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : num3);
    }
}
