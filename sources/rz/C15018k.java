package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lrz/k;", "", "", "title", "Lrz/o;", "product", "<init>", "(Ljava/lang/String;Lrz/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "Lrz/o;", "()Lrz/o;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.k  reason: case insensitive filesystem */
public final class C15018k {

    /* renamed from: a  reason: collision with root package name */
    private final String f130862a;

    /* renamed from: b  reason: collision with root package name */
    private final C15022o f130863b;

    public C15018k(String str, C15022o oVar) {
        C17542s.j(str, "title");
        C17542s.j(oVar, "product");
        this.f130862a = str;
        this.f130863b = oVar;
    }

    public final C15022o a() {
        return this.f130863b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15018k)) {
            return false;
        }
        C15018k kVar = (C15018k) obj;
        return C17542s.e(this.f130862a, kVar.f130862a) && C17542s.e(this.f130863b, kVar.f130863b);
    }

    public int hashCode() {
        return (this.f130862a.hashCode() * 31) + this.f130863b.hashCode();
    }

    public String toString() {
        String str = this.f130862a;
        C15022o oVar = this.f130863b;
        return "CombinationMeasurements(title=" + str + ", product=" + oVar + ")";
    }
}
