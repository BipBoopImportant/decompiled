package Vi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import xB.C15201a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"LVi/r0;", "LxB/a;", "", "itemNo", "itemType", "text", "imageUrl", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "i", "c", "j", "d", "g", "e", "Z", "n", "()Z", "", "f", "J", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f88623a;

    /* renamed from: b  reason: collision with root package name */
    private final String f88624b;

    /* renamed from: c  reason: collision with root package name */
    private final String f88625c;

    /* renamed from: d  reason: collision with root package name */
    private final String f88626d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f88627e;

    /* renamed from: f  reason: collision with root package name */
    private final long f88628f;

    public r0(String str, String str2, String str3, String str4, boolean z10) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        C17542s.j(str3, "text");
        C17542s.j(str4, "imageUrl");
        this.f88623a = str;
        this.f88624b = str2;
        this.f88625c = str3;
        this.f88626d = str4;
        this.f88627e = z10;
        this.f88628f = (long) str.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return C17542s.e(this.f88623a, r0Var.f88623a) && C17542s.e(this.f88624b, r0Var.f88624b) && C17542s.e(this.f88625c, r0Var.f88625c) && C17542s.e(this.f88626d, r0Var.f88626d) && this.f88627e == r0Var.f88627e;
    }

    public long f() {
        return this.f88628f;
    }

    public final String g() {
        return this.f88626d;
    }

    public final String h() {
        return this.f88623a;
    }

    public int hashCode() {
        return (((((((this.f88623a.hashCode() * 31) + this.f88624b.hashCode()) * 31) + this.f88625c.hashCode()) * 31) + this.f88626d.hashCode()) * 31) + Boolean.hashCode(this.f88627e);
    }

    public final String i() {
        return this.f88624b;
    }

    public final String j() {
        return this.f88625c;
    }

    public final boolean n() {
        return this.f88627e;
    }

    public String toString() {
        String str = this.f88623a;
        String str2 = this.f88624b;
        String str3 = this.f88625c;
        String str4 = this.f88626d;
        boolean z10 = this.f88627e;
        return "ShopAndGoOptionResource(itemNo=" + str + ", itemType=" + str2 + ", text=" + str3 + ", imageUrl=" + str4 + ", isSelected=" + z10 + ")";
    }
}
