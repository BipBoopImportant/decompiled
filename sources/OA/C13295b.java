package OA;

import LA.C13173a;
import NA.g0;
import Op.B0;
import Op.f1;
import YH.C16877v;
import com.ingka.ikea.core.model.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import kp.j;
import mp.C11589b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LLA/a;", "Lkp/d;", "currencyConfig", "", "allowAddToCart", "", "", "allProductNumbersInShoppingLists", "", "itemsNumbersAddingToCart", "showImageSwipeNudge", "LOA/a;", "a", "(LLA/a;Lkp/d;ZLjava/util/Set;Ljava/util/List;Z)LOA/a;", "shoppableimage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: OA.b  reason: case insensitive filesystem */
public final class C13295b {
    public static final C13294a a(C13173a aVar, C11522d dVar, boolean z10, Set<String> set, List<String> list, boolean z11) {
        Image image;
        ArrayList arrayList;
        C17542s.j(aVar, "<this>");
        C17542s.j(dVar, "currencyConfig");
        C17542s.j(set, "allProductNumbersInShoppingLists");
        C17542s.j(list, "itemsNumbersAddingToCart");
        String i10 = aVar.i();
        String d10 = aVar.d();
        Image image2 = new Image(aVar.j(), aVar.c());
        List<C11589b> g10 = aVar.g();
        if (g10 != null) {
            Iterable<C11589b> iterable = g10;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
            for (C11589b bVar : iterable) {
                f1 f1Var = new f1(bVar.a(), B0.o(bVar.b(), list, set, dVar, false, z10, true, true, false, false, 392, (Object) null), z11);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(f1Var);
                List<String> list2 = list;
                arrayList2 = arrayList3;
                image2 = image2;
            }
            image = image2;
            arrayList = arrayList2;
        } else {
            image = image2;
            arrayList = null;
        }
        j h10 = aVar.h();
        return new C13294a(i10, d10, image, arrayList, h10 != null ? new g0(h10.a(), h10.b()) : null, aVar.f(), aVar.e());
    }
}
