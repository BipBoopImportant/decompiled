package dt;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldt/b;", "", "", "url", "", "open", "available", "<init>", "(Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f97108a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f97109b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f97110c;

    public b(String str, boolean z10, boolean z11) {
        this.f97108a = str;
        this.f97109b = z10;
        this.f97110c = z11;
    }

    public final boolean a() {
        return this.f97110c;
    }

    public final boolean b() {
        return this.f97109b;
    }

    public final String c() {
        return this.f97108a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f97108a, bVar.f97108a) && this.f97109b == bVar.f97109b && this.f97110c == bVar.f97110c;
    }

    public int hashCode() {
        String str = this.f97108a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f97109b)) * 31) + Boolean.hashCode(this.f97110c);
    }

    public String toString() {
        String str = this.f97108a;
        boolean z10 = this.f97109b;
        boolean z11 = this.f97110c;
        return "FoodMobileDetails(url=" + str + ", open=" + z10 + ", available=" + z11 + ")";
    }
}
