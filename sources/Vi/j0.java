package Vi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"LVi/j0;", "", "", "title", "aisle", "bin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f88588a;

    /* renamed from: b  reason: collision with root package name */
    private final String f88589b;

    /* renamed from: c  reason: collision with root package name */
    private final String f88590c;

    public j0(String str, String str2, String str3) {
        C17542s.j(str, "title");
        C17542s.j(str2, "aisle");
        C17542s.j(str3, "bin");
        this.f88588a = str;
        this.f88589b = str2;
        this.f88590c = str3;
    }

    public final String a() {
        return this.f88589b;
    }

    public final String b() {
        return this.f88590c;
    }

    public final String c() {
        return this.f88588a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return C17542s.e(this.f88588a, j0Var.f88588a) && C17542s.e(this.f88589b, j0Var.f88589b) && C17542s.e(this.f88590c, j0Var.f88590c);
    }

    public int hashCode() {
        return (((this.f88588a.hashCode() * 31) + this.f88589b.hashCode()) * 31) + this.f88590c.hashCode();
    }

    public String toString() {
        String str = this.f88588a;
        String str2 = this.f88589b;
        String str3 = this.f88590c;
        return "ProductLocationDelegateModel(title=" + str + ", aisle=" + str2 + ", bin=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
