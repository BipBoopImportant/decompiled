package Yp;

import Dr.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ov.C11718a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LYp/F;", "", "LDr/a;", "kreativComposable", "Lov/a;", "liveShoppingSection", "<init>", "(LDr/a;Lov/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDr/a;", "()LDr/a;", "b", "Lov/a;", "()Lov/a;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class F {

    /* renamed from: a  reason: collision with root package name */
    private final a f89555a;

    /* renamed from: b  reason: collision with root package name */
    private final C11718a f89556b;

    public F(a aVar, C11718a aVar2) {
        C17542s.j(aVar, "kreativComposable");
        C17542s.j(aVar2, "liveShoppingSection");
        this.f89555a = aVar;
        this.f89556b = aVar2;
    }

    public final a a() {
        return this.f89555a;
    }

    public final C11718a b() {
        return this.f89556b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return C17542s.e(this.f89555a, f10.f89555a) && C17542s.e(this.f89556b, f10.f89556b);
    }

    public int hashCode() {
        return (this.f89555a.hashCode() * 31) + this.f89556b.hashCode();
    }

    public String toString() {
        a aVar = this.f89555a;
        C11718a aVar2 = this.f89556b;
        return "InjectedComposables(kreativComposable=" + aVar + ", liveShoppingSection=" + aVar2 + ")";
    }
}
