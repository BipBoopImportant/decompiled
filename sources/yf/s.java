package yf;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nn.C11661g;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lyf/s;", "", "", "isLoading", "Lnn/g;", "promotionWithShoppingListData", "<init>", "(ZLnn/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lnn/g;", "()Lnn/g;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f78060a;

    /* renamed from: b  reason: collision with root package name */
    private final C11661g f78061b;

    public s(boolean z10, C11661g gVar) {
        this.f78060a = z10;
        this.f78061b = gVar;
    }

    public final C11661g a() {
        return this.f78061b;
    }

    public final boolean b() {
        return this.f78060a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f78060a == sVar.f78060a && C17542s.e(this.f78061b, sVar.f78061b);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f78060a) * 31;
        C11661g gVar = this.f78061b;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public String toString() {
        boolean z10 = this.f78060a;
        C11661g gVar = this.f78061b;
        return "Recommendations(isLoading=" + z10 + ", promotionWithShoppingListData=" + gVar + ")";
    }
}
