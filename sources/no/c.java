package No;

import HJ.C15854t;
import Jo.a;
import KJ.C15985a;
import KJ.C15987c;
import Mp.b;
import Mp.d;
import Op.B0;
import YH.C16877v;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import kp.g;
import kp.i;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aG\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LMp/d;", "Lkp/d;", "currencyConfig", "", "allowAddToCart", "", "", "itemsNumbersAddingToCart", "", "allProductNumbersInShoppingLists", "LNo/i;", "d", "(LMp/d;Lkp/d;ZLjava/util/List;Ljava/util/Set;)LNo/i;", "LMp/c;", "storyId", "LNo/h;", "c", "(LMp/c;Lkp/d;ZLjava/util/List;Ljava/util/Set;Ljava/lang/String;)LNo/h;", "LJo/a$a;", "a", "(LMp/c;)LJo/a$a;", "LMp/b;", "LNo/g;", "b", "(LMp/b;)LNo/g;", "commercialcontent-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final a.C1624a a(Mp.c cVar) {
        return cVar.d() != null ? a.C1624a.VISUAL_MESSAGE : a.C1624a.PRODUCT_LISTING;
    }

    public static final g b(b bVar) {
        String str;
        C17542s.j(bVar, "<this>");
        String a10 = bVar.a();
        String f10 = bVar.f();
        String d10 = bVar.d();
        if (C15854t.v0(bVar.c())) {
            str = bVar.e();
        } else {
            str = bVar.e() + ", " + bVar.c();
        }
        return new g(a10, f10, d10, str, bVar.b());
    }

    public static final h c(Mp.c cVar, C11522d dVar, boolean z10, List<String> list, Set<String> set, String str) {
        a aVar;
        C15987c cVar2;
        C15987c cVar3;
        C17542s.j(cVar, "<this>");
        C17542s.j(dVar, "currencyConfig");
        C17542s.j(list, "itemsNumbersAddingToCart");
        C17542s.j(set, "allProductNumbersInShoppingLists");
        C17542s.j(str, "storyId");
        String c10 = cVar.c();
        String i10 = cVar.i();
        String a10 = cVar.a();
        List<i> d10 = cVar.d();
        C15987c h10 = d10 != null ? C15985a.h(d10) : null;
        a aVar2 = new a(cVar.j(), cVar.b(), cVar.g());
        List<ProductItem> f10 = cVar.f();
        if (f10 != null) {
            Iterable<ProductItem> iterable = f10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (ProductItem o10 : iterable) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(B0.o(o10, list, set, dVar, false, z10, true, false, false, false, 456, (Object) null));
                Set<String> set2 = set;
                String str2 = str;
                arrayList = arrayList2;
                aVar2 = aVar2;
            }
            aVar = aVar2;
            cVar2 = C15985a.h(arrayList);
        } else {
            aVar = aVar2;
            cVar2 = null;
        }
        g e10 = cVar.e();
        List<b> h11 = cVar.h();
        if (h11 != null) {
            Iterable<b> iterable2 = h11;
            ArrayList arrayList3 = new ArrayList(C16877v.y(iterable2, 10));
            for (b b10 : iterable2) {
                arrayList3.add(b(b10));
            }
            cVar3 = C15985a.h(arrayList3);
        } else {
            cVar3 = null;
        }
        return new h(c10, i10, a10, h10, aVar, cVar2, e10, cVar3, str, a(cVar));
    }

    public static final i d(d dVar, C11522d dVar2, boolean z10, List<String> list, Set<String> set) {
        C15987c cVar;
        C17542s.j(dVar, "<this>");
        C17542s.j(dVar2, "currencyConfig");
        C17542s.j(list, "itemsNumbersAddingToCart");
        C17542s.j(set, "allProductNumbersInShoppingLists");
        String c10 = dVar.c();
        String h10 = dVar.h();
        String d10 = dVar.d();
        Media b10 = dVar.b();
        List<b> a10 = dVar.a();
        if (a10 != null) {
            Iterable<b> iterable = a10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (b b11 : iterable) {
                arrayList.add(b(b11));
            }
            cVar = C15985a.h(arrayList);
        } else {
            cVar = null;
        }
        Iterable<Mp.c> f10 = dVar.f();
        ArrayList arrayList2 = new ArrayList(C16877v.y(f10, 10));
        for (Mp.c c11 : f10) {
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(c(c11, dVar2, z10, list, set, dVar.c()));
            arrayList2 = arrayList3;
        }
        C15987c h11 = C15985a.h(arrayList2);
        String g10 = dVar.g();
        List<String> e10 = dVar.e();
        return new i(c10, h10, d10, b10, cVar, h11, g10, e10 != null ? C15985a.h(e10) : null);
    }
}
