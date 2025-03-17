package qg;

import IC.C13026h;
import YH.C16877v;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import com.ingka.ikea.dynamicfields.datalayer.KeyValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "", "Lqg/y;", "b", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;)Ljava/util/List;", "validationList", "dynamicfields_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    /* access modifiers changed from: private */
    public static final List<y> b(FieldAttributes fieldAttributes) {
        ArrayList arrayList = new ArrayList();
        boolean p10 = fieldAttributes.p();
        boolean z10 = !p10;
        if (p10) {
            arrayList.add(new p(fieldAttributes.d(), C13026h.c(fieldAttributes.d())));
        }
        ArrayList<KeyValue> arrayList2 = new ArrayList<>();
        for (Object next : fieldAttributes.n()) {
            if (((KeyValue) next).c().length() > 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
        for (KeyValue keyValue : arrayList2) {
            arrayList3.add(new r(keyValue.c(), z10, keyValue.a(), C13026h.c(keyValue.a())));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
