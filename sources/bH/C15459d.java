package BH;

import OH.C16158a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"LBH/d;", "", "LOH/a;", "expectedType", "response", "<init>", "(LOH/a;Ljava/lang/Object;)V", "a", "()LOH/a;", "b", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LOH/a;", "getExpectedType", "Ljava/lang/Object;", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: BH.d  reason: case insensitive filesystem */
public final class C15459d {

    /* renamed from: a  reason: collision with root package name */
    private final C16158a f133240a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f133241b;

    public C15459d(C16158a aVar, Object obj) {
        C17542s.j(aVar, "expectedType");
        C17542s.j(obj, "response");
        this.f133240a = aVar;
        this.f133241b = obj;
    }

    public final C16158a a() {
        return this.f133240a;
    }

    public final Object b() {
        return this.f133241b;
    }

    public final Object c() {
        return this.f133241b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15459d)) {
            return false;
        }
        C15459d dVar = (C15459d) obj;
        return C17542s.e(this.f133240a, dVar.f133240a) && C17542s.e(this.f133241b, dVar.f133241b);
    }

    public int hashCode() {
        return (this.f133240a.hashCode() * 31) + this.f133241b.hashCode();
    }

    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f133240a + ", response=" + this.f133241b + ')';
    }
}
