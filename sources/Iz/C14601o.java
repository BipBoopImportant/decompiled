package iz;

import XH.t;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.U;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liz/o;", "", "<init>", "()V", "Lrz/U;", "limits", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "a", "(Lrz/U;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.o  reason: case insensitive filesystem */
public final class C14601o {
    public final QuantityPickerDataModel a(U u10) {
        C17542s.j(u10, "limits");
        if (u10 instanceof U.a) {
            U.a aVar = (U.a) u10;
            int c10 = aVar.c();
            int b10 = aVar.b();
            return new QuantityPickerDataModel(Boolean.TRUE, Integer.valueOf(aVar.d()), Integer.valueOf(b10), Integer.valueOf(c10));
        } else if (u10 instanceof U.b) {
            U.b bVar = (U.b) u10;
            int c11 = bVar.c();
            return new QuantityPickerDataModel(Boolean.FALSE, (Integer) null, Integer.valueOf(bVar.b()), Integer.valueOf(c11));
        } else if (u10 instanceof U.c) {
            return null;
        } else {
            throw new t();
        }
    }
}
