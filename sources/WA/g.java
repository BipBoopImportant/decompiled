package WA;

import com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LWA/g;", "", "", "id", "", "listId", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "syncEventModel", "<init>", "(JLjava/lang/String;Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "()Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final long f117482a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117483b;

    /* renamed from: c  reason: collision with root package name */
    private final SyncEventModel f117484c;

    public g(long j10, String str, SyncEventModel syncEventModel) {
        C17542s.j(str, "listId");
        C17542s.j(syncEventModel, "syncEventModel");
        this.f117482a = j10;
        this.f117483b = str;
        this.f117484c = syncEventModel;
    }

    public final long a() {
        return this.f117482a;
    }

    public final String b() {
        return this.f117483b;
    }

    public final SyncEventModel c() {
        return this.f117484c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f117482a == gVar.f117482a && C17542s.e(this.f117483b, gVar.f117483b) && C17542s.e(this.f117484c, gVar.f117484c);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f117482a) * 31) + this.f117483b.hashCode()) * 31) + this.f117484c.hashCode();
    }

    public String toString() {
        long j10 = this.f117482a;
        String str = this.f117483b;
        SyncEventModel syncEventModel = this.f117484c;
        return "ShoppingListEventEntity(id=" + j10 + ", listId=" + str + ", syncEventModel=" + syncEventModel + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(long j10, String str, SyncEventModel syncEventModel, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : j10, str, syncEventModel);
    }
}
