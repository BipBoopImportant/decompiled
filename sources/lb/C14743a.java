package lB;

import XH.t;
import YH.C16877v;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b$c;", "b", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;)Ljava/util/List;", "listpicker-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lB.a  reason: case insensitive filesystem */
public final class C14743a {
    /* access modifiers changed from: private */
    public static final List<ListPickerNavigation.b.c> b(ListPickerNavigation.Operation operation) {
        if (operation instanceof ListPickerNavigation.Operation.AddOrRemove) {
            ListPickerNavigation.Operation.AddOrRemove addOrRemove = (ListPickerNavigation.Operation.AddOrRemove) operation;
            return C16877v.e(new ListPickerNavigation.b.c(addOrRemove.b(), addOrRemove.c(), addOrRemove.d()));
        } else if (operation instanceof ListPickerNavigation.Operation.AddAll) {
            Iterable<ListPickerNavigation.Operation.AddAll.ProductData> c10 = ((ListPickerNavigation.Operation.AddAll) operation).c();
            ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
            for (ListPickerNavigation.Operation.AddAll.ProductData productData : c10) {
                arrayList.add(new ListPickerNavigation.b.c(productData.a(), (String) null, productData.b()));
            }
            return arrayList;
        } else {
            throw new t();
        }
    }
}
