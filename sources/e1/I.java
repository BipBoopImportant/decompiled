package E1;

import c2.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0001\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\r\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ,\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"LE1/I;", "", "LE1/r;", "", "LE1/q;", "measurables", "", "height", "a", "(LE1/r;Ljava/util/List;I)I", "width", "j", "d", "h", "LE1/K;", "LE1/H;", "Lc2/b;", "constraints", "LE1/J;", "measure", "(LE1/K;Ljava/util/List;Lc2/b;)LE1/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface I {
    int a(r rVar, List<? extends C4484q> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C4480m((C4484q) list.get(i11), C4485s.Min, C4486t.Width));
        }
        return i(new C4487u(rVar, rVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i10, 7, (Object) null)).getWidth();
    }

    int d(r rVar, List<? extends C4484q> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C4480m((C4484q) list.get(i11), C4485s.Max, C4486t.Width));
        }
        return i(new C4487u(rVar, rVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i10, 7, (Object) null)).getWidth();
    }

    int h(r rVar, List<? extends C4484q> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C4480m((C4484q) list.get(i11), C4485s.Max, C4486t.Height));
        }
        return i(new C4487u(rVar, rVar.getLayoutDirection()), arrayList, c.b(0, i10, 0, 0, 13, (Object) null)).getHeight();
    }

    J i(K k10, List<? extends H> list, long j10);

    int j(r rVar, List<? extends C4484q> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C4480m((C4484q) list.get(i11), C4485s.Min, C4486t.Height));
        }
        return i(new C4487u(rVar, rVar.getLayoutDirection()), arrayList, c.b(0, i10, 0, 0, 13, (Object) null)).getHeight();
    }
}
