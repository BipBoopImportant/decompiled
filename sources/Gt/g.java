package Gt;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LGt/g;", "", "", "storeId", "LIC/e;", "label", "<init>", "(Ljava/lang/String;LIC/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LIC/e;", "getLabel", "()LIC/e;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final int f81243c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final String f81244a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f81245b;

    public g(String str, C13023e eVar) {
        C17542s.j(str, "storeId");
        C17542s.j(eVar, "label");
        this.f81244a = str;
        this.f81245b = eVar;
    }

    public final String a() {
        return this.f81244a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f81244a, gVar.f81244a) && C17542s.e(this.f81245b, gVar.f81245b);
    }

    public int hashCode() {
        return (this.f81244a.hashCode() * 31) + this.f81245b.hashCode();
    }

    public String toString() {
        String str = this.f81244a;
        C13023e eVar = this.f81245b;
        return "WayfindingData(storeId=" + str + ", label=" + eVar + ")";
    }
}
