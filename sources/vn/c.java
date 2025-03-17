package vn;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lvn/c;", "", "", "name", "value", "", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f105244a;

    /* renamed from: b  reason: collision with root package name */
    private final String f105245b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f105246c;

    public c(String str, String str2, boolean z10) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        this.f105244a = str;
        this.f105245b = str2;
        this.f105246c = z10;
    }

    public final String a() {
        return this.f105244a;
    }

    public final boolean b() {
        return this.f105246c;
    }

    public final String c() {
        return this.f105245b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f105244a, cVar.f105244a) && C17542s.e(this.f105245b, cVar.f105245b) && this.f105246c == cVar.f105246c;
    }

    public int hashCode() {
        return (((this.f105244a.hashCode() * 31) + this.f105245b.hashCode()) * 31) + Boolean.hashCode(this.f105246c);
    }

    public String toString() {
        String str = this.f105244a;
        String str2 = this.f105245b;
        boolean z10 = this.f105246c;
        return "SortOption(name=" + str + ", value=" + str2 + ", selected=" + z10 + ")";
    }
}
