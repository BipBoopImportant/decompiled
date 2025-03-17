package v0;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tI.C17974j;
import v0.C6131E;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv0/t;", "Lv0/E;", "pinnedItemList", "Lv0/j;", "beyondBoundsInfo", "", "", "a", "(Lv0/t;Lv0/E;Lv0/j;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.n  reason: case insensitive filesystem */
public final class C6148n {
    public static final List<Integer> a(t tVar, C6131E e10, C6144j jVar) {
        if (!jVar.d() && e10.isEmpty()) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        C17974j jVar2 = jVar.d() ? new C17974j(jVar.c(), Math.min(jVar.b(), tVar.a() - 1)) : C17974j.f147335e.a();
        int size = e10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6131E.a aVar = (C6131E.a) e10.get(i10);
            int a10 = u.a(tVar, aVar.getKey(), aVar.getIndex());
            int p10 = jVar2.p();
            if ((a10 > jVar2.q() || p10 > a10) && a10 >= 0 && a10 < tVar.a()) {
                arrayList.add(Integer.valueOf(a10));
            }
        }
        int p11 = jVar2.p();
        int q10 = jVar2.q();
        if (p11 <= q10) {
            while (true) {
                arrayList.add(Integer.valueOf(p11));
                if (p11 == q10) {
                    break;
                }
                p11++;
            }
        }
        return arrayList;
    }
}
