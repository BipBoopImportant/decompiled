package Mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"LMi/e;", "LMi/l;", "", "retailCode", "localCountryName", "", "showEmptyText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRetailCode", "b", "c", "Z", "()Z", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.e  reason: case insensitive filesystem */
public final class C10770e implements C10777l {

    /* renamed from: a  reason: collision with root package name */
    private final String f83385a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83386b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f83387c;

    public C10770e(String str, String str2, boolean z10) {
        C17542s.j(str, "retailCode");
        C17542s.j(str2, "localCountryName");
        this.f83385a = str;
        this.f83386b = str2;
        this.f83387c = z10;
    }

    public boolean a() {
        return this.f83387c;
    }

    public final String b() {
        return this.f83386b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10770e)) {
            return false;
        }
        C10770e eVar = (C10770e) obj;
        return C17542s.e(this.f83385a, eVar.f83385a) && C17542s.e(this.f83386b, eVar.f83386b) && this.f83387c == eVar.f83387c;
    }

    public int hashCode() {
        return (((this.f83385a.hashCode() * 31) + this.f83386b.hashCode()) * 31) + Boolean.hashCode(this.f83387c);
    }

    public String toString() {
        String str = this.f83385a;
        String str2 = this.f83386b;
        boolean z10 = this.f83387c;
        return "LocalSectionHeader(retailCode=" + str + ", localCountryName=" + str2 + ", showEmptyText=" + z10 + ")";
    }
}
