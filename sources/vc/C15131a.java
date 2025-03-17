package vC;

import com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotCartItemRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uC.C15114b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LvC/a;", "", "<init>", "()V", "LuC/b;", "cartItem", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotCartItemRequest;", "a", "(LuC/b;)Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotCartItemRequest;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vC.a  reason: case insensitive filesystem */
public final class C15131a {
    public final TimeslotCartItemRequest a(C15114b bVar) {
        C17542s.j(bVar, "cartItem");
        return new TimeslotCartItemRequest(bVar.a(), bVar.b());
    }
}
