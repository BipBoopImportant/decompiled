package com.sugarcube.app.base.external.interactions;

import XH.C16807N;
import XH.v;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u00020\b2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00120\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/app/base/external/interactions/CartInteractions;", "", "", "availabilityDisclaimer", "buttonString", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/Function0;", "LXH/N;", "callback", "addToCartWithDisclaimer", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;LnI/a;)V", "productNumber", "", "quantity", "addItem", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "", "LXH/v;", "productList", "addItems", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/view/View;", "rootView", "", "throwable", "productName", "showAddToCartException", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/Throwable;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CartInteractions {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(CartInteractions cartInteractions, String str, int i10, C17164e eVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    i10 = 1;
                }
                return cartInteractions.addItem(str, i10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
    }

    Object addItem(String str, int i10, C17164e<? super C16807N> eVar);

    Object addItems(List<v<String, Integer>> list, C17164e<? super C16807N> eVar);

    void addToCartWithDisclaimer(String str, String str2, FragmentManager fragmentManager, C17631a<C16807N> aVar);

    void showAddToCartException(Context context, View view, Throwable th2, String str);
}
