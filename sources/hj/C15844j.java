package HJ;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17974j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"LHJ/j;", "", "", "value", "LtI/j;", "range", "<init>", "(Ljava/lang/String;LtI/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "b", "LtI/j;", "()LtI/j;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.j  reason: case insensitive filesystem */
public final class C15844j {

    /* renamed from: a  reason: collision with root package name */
    private final String f135333a;

    /* renamed from: b  reason: collision with root package name */
    private final C17974j f135334b;

    public C15844j(String str, C17974j jVar) {
        C17542s.j(str, "value");
        C17542s.j(jVar, "range");
        this.f135333a = str;
        this.f135334b = jVar;
    }

    public final C17974j a() {
        return this.f135334b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15844j)) {
            return false;
        }
        C15844j jVar = (C15844j) obj;
        return C17542s.e(this.f135333a, jVar.f135333a) && C17542s.e(this.f135334b, jVar.f135334b);
    }

    public int hashCode() {
        return (this.f135333a.hashCode() * 31) + this.f135334b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f135333a + ", range=" + this.f135334b + ')';
    }
}
