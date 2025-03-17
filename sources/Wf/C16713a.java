package WF;

import com.sugarcube.core.network.models.StockLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LWF/a;", "", "LWF/b;", "type", "Lcom/sugarcube/core/network/models/StockLevel;", "stockLevel", "<init>", "(LWF/b;Lcom/sugarcube/core/network/models/StockLevel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWF/b;", "b", "()LWF/b;", "Lcom/sugarcube/core/network/models/StockLevel;", "()Lcom/sugarcube/core/network/models/StockLevel;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WF.a  reason: case insensitive filesystem */
public final class C16713a {

    /* renamed from: a  reason: collision with root package name */
    private final C16714b f139437a;

    /* renamed from: b  reason: collision with root package name */
    private final StockLevel f139438b;

    public C16713a(C16714b bVar, StockLevel stockLevel) {
        C17542s.j(bVar, "type");
        this.f139437a = bVar;
        this.f139438b = stockLevel;
    }

    public final StockLevel a() {
        return this.f139438b;
    }

    public final C16714b b() {
        return this.f139437a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16713a)) {
            return false;
        }
        C16713a aVar = (C16713a) obj;
        return this.f139437a == aVar.f139437a && this.f139438b == aVar.f139438b;
    }

    public int hashCode() {
        int hashCode = this.f139437a.hashCode() * 31;
        StockLevel stockLevel = this.f139438b;
        return hashCode + (stockLevel == null ? 0 : stockLevel.hashCode());
    }

    public String toString() {
        C16714b bVar = this.f139437a;
        StockLevel stockLevel = this.f139438b;
        return "BuyingOption(type=" + bVar + ", stockLevel=" + stockLevel + ")";
    }
}
