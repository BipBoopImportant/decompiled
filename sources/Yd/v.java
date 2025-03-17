package Yd;

import com.ingka.ikea.useraccount.model.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LYd/v;", "LYd/a;", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "addressType", "<init>", "(Lcom/ingka/ikea/useraccount/model/Address$Type;)V", "a", "Lcom/ingka/ikea/useraccount/model/Address$Type;", "()Lcom/ingka/ikea/useraccount/model/Address$Type;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Address.Type f64963a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(Address.Type type) {
        super((DefaultConstructorMarker) null);
        C17542s.j(type, "addressType");
        this.f64963a = type;
    }

    public final Address.Type a() {
        return this.f64963a;
    }
}
