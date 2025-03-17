package E1;

import c2.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bç\u0001\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J/\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J/\u0010\u0014\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010ø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"LE1/O;", "", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "a", "(LE1/r;Ljava/util/List;I)I", "width", "j", "d", "h", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface O {
    int a(r rVar, List<? extends List<? extends C4484q>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C4480m((C4484q) list2.get(i12), C4485s.Min, C4486t.Width));
            }
            arrayList.add(arrayList2);
        }
        return i(new C4487u(rVar, rVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i10, 7, (Object) null)).getWidth();
    }

    int d(r rVar, List<? extends List<? extends C4484q>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C4480m((C4484q) list2.get(i12), C4485s.Max, C4486t.Width));
            }
            arrayList.add(arrayList2);
        }
        return i(new C4487u(rVar, rVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i10, 7, (Object) null)).getWidth();
    }

    int h(r rVar, List<? extends List<? extends C4484q>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C4480m((C4484q) list2.get(i12), C4485s.Max, C4486t.Height));
            }
            arrayList.add(arrayList2);
        }
        return i(new C4487u(rVar, rVar.getLayoutDirection()), arrayList, c.b(0, i10, 0, 0, 13, (Object) null)).getHeight();
    }

    J i(K k10, List<? extends List<? extends H>> list, long j10);

    int j(r rVar, List<? extends List<? extends C4484q>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C4480m((C4484q) list2.get(i12), C4485s.Min, C4486t.Height));
            }
            arrayList.add(arrayList2);
        }
        return i(new C4487u(rVar, rVar.getLayoutDirection()), arrayList, c.b(0, i10, 0, 0, 13, (Object) null)).getHeight();
    }
}
