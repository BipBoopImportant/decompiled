package t0;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\u001aM\u0010\u000b\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lt0/s;", "composedVisibleItems", "Lt0/t;", "itemProvider", "", "", "headerIndexes", "beforeContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;Lt0/t;Ljava/util/List;III)Lt0/s;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final s a(List<s> list, t tVar, List<Integer> list2, int i10, int i11, int i12) {
        List<s> list3 = list;
        List<Integer> list4 = list2;
        int i13 = i10;
        int index = ((s) C16877v.w0(list)).getIndex();
        int size = list2.size();
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        while (i16 < size && list4.get(i16).intValue() <= index) {
            i15 = list4.get(i16).intValue();
            i16++;
            i14 = ((i16 < 0 || i16 > C16877v.p(list2)) ? -1 : list4.get(i16)).intValue();
        }
        int size2 = list.size();
        int i17 = Integer.MIN_VALUE;
        int i18 = Integer.MIN_VALUE;
        int i19 = -1;
        for (int i20 = 0; i20 < size2; i20++) {
            s sVar = list3.get(i20);
            if (sVar.getIndex() == i15) {
                i17 = sVar.c();
                i19 = i20;
            } else if (sVar.getIndex() == i14) {
                i18 = sVar.c();
            }
        }
        if (i15 == -1) {
            return null;
        }
        s e10 = t.e(tVar, i15, 0, 2, (Object) null);
        e10.e(true);
        int max = i17 != Integer.MIN_VALUE ? Math.max(-i13, i17) : -i13;
        if (i18 != Integer.MIN_VALUE) {
            max = Math.min(max, i18 - e10.a());
        }
        e10.s(max, i11, i12);
        if (i19 != -1) {
            list3.set(i19, e10);
        } else {
            list3.add(0, e10);
        }
        return e10;
    }
}
