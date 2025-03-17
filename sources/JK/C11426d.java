package jk;

import Ae.r;
import C4.j;
import XH.C16796C;
import YH.X;
import android.annotation.SuppressLint;
import androidx.lifecycle.U;
import com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$AllLists;
import com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ListDetails;
import fK.z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00060\u0004H\u0017¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljk/d;", "LAe/r;", "<init>", "()V", "", "", "Lkotlin/Function1;", "Landroidx/lifecycle/U;", "a", "()Ljava/util/Map;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jk.d  reason: case insensitive filesystem */
public final class C11426d implements r {
    /* access modifiers changed from: private */
    public static final String d(U u10) {
        C17542s.j(u10, "it");
        return "all_lists";
    }

    /* access modifiers changed from: private */
    public static final String e(U u10) {
        C17542s.j(u10, "it");
        return "list_details";
    }

    @SuppressLint({"RestrictedApi"})
    public Map<String, C17642l<U, String>> a() {
        return X.m(C16796C.a(String.valueOf(j.g(z.e(P.b(ShoppingListsRoutes$AllLists.class)))), new C11424b()), C16796C.a(String.valueOf(j.g(z.e(P.b(ShoppingListsRoutes$ListDetails.class)))), new C11425c()));
    }
}
