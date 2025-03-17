package G6;

import B6.a;
import D6.o;
import H6.c;
import I6.i;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H implements N<o> {

    /* renamed from: a  reason: collision with root package name */
    public static final H f36170a = new H();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36171b = c.a.a("c", "v", "i", "o");

    private H() {
    }

    /* renamed from: b */
    public o a(c cVar, float f10) {
        if (cVar.i() == c.b.BEGIN_ARRAY) {
            cVar.d();
        }
        cVar.e();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z10 = false;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36171b);
            if (n10 == 0) {
                z10 = cVar.w1();
            } else if (n10 == 1) {
                list = s.f(cVar, f10);
            } else if (n10 == 2) {
                list2 = s.f(cVar, f10);
            } else if (n10 != 3) {
                cVar.o();
                cVar.a0();
            } else {
                list3 = s.f(cVar, f10);
            }
        }
        cVar.g();
        if (cVar.i() == c.b.END_ARRAY) {
            cVar.f();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new o(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = list.get(i10);
                int i11 = i10 - 1;
                arrayList.add(new a(i.a(list.get(i11), list3.get(i11)), i.a(pointF2, list2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = list.get(0);
                int i12 = size - 1;
                arrayList.add(new a(i.a(list.get(i12), list3.get(i12)), i.a(pointF3, list2.get(0)), pointF3));
            }
            return new o(pointF, z10, arrayList);
        }
    }
}
