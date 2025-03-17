package com.sugarcube.app.base.external.shoppinglist;

import kotlin.Metadata;
import x4.C8951o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J>\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH¦\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "", "Lx4/o;", "navController", "", "productName", "itemNo", "itemType", "", "quantity", "LXH/N;", "invoke", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AddToShoppingListUseCase {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(AddToShoppingListUseCase addToShoppingListUseCase, C8951o oVar, String str, String str2, String str3, int i10, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    str3 = "ART";
                }
                String str4 = str3;
                if ((i11 & 16) != 0) {
                    i10 = 1;
                }
                addToShoppingListUseCase.invoke(oVar, str, str2, str4, i10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    void invoke(C8951o oVar, String str, String str2, String str3, int i10);
}
