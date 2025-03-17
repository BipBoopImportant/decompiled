package G6;

import B6.d;
import B6.h;
import E6.e;
import H6.c;
import I6.j;
import android.graphics.Rect;
import j0.C5468y;
import j0.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w6.C8927i;
import w6.v;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36224a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    static c.a f36225b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f36226c = c.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    private static final c.a f36227d = c.a.a("cm", "tm", "dr");

    public static C8927i a(c cVar) {
        HashMap hashMap;
        ArrayList arrayList;
        c cVar2 = cVar;
        float e10 = j.e();
        C5468y yVar = new C5468y();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        c0 c0Var = new c0();
        C8927i iVar = new C8927i();
        cVar.e();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (cVar.hasNext()) {
            switch (cVar2.n(f36224a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i10 = cVar.G0();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i11 = cVar.G0();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f10 = (float) cVar.d2();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f11 = ((float) cVar.d2()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f12 = (float) cVar.d2();
                    break;
                case 5:
                    String[] split = cVar.C1().split("\\.");
                    if (j.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        break;
                    } else {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                case 6:
                    e(cVar2, iVar, arrayList2, yVar);
                    continue;
                case 7:
                    b(cVar2, iVar, hashMap2, hashMap3);
                    continue;
                case 8:
                    d(cVar2, hashMap4);
                    continue;
                case 9:
                    c(cVar2, iVar, c0Var);
                    continue;
                case 10:
                    f(cVar2, arrayList3);
                    continue;
                default:
                    cVar.o();
                    cVar.a0();
                    continue;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        ArrayList arrayList7 = arrayList3;
        iVar.s(new Rect(0, 0, (int) (((float) i10) * e10), (int) (((float) i11) * e10)), f10, f11, f12, arrayList2, yVar, hashMap2, hashMap3, c0Var, hashMap4, arrayList3);
        return iVar;
    }

    private static void b(c cVar, C8927i iVar, Map<String, List<e>> map, Map<String, v> map2) {
        cVar.d();
        while (cVar.hasNext()) {
            ArrayList arrayList = new ArrayList();
            C5468y yVar = new C5468y();
            cVar.e();
            int i10 = 0;
            int i11 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.hasNext()) {
                int n10 = cVar.n(f36225b);
                if (n10 == 0) {
                    str = cVar.C1();
                } else if (n10 == 1) {
                    cVar.d();
                    while (cVar.hasNext()) {
                        e a10 = v.a(cVar, iVar);
                        yVar.k(a10.e(), a10);
                        arrayList.add(a10);
                    }
                    cVar.f();
                } else if (n10 == 2) {
                    i10 = cVar.G0();
                } else if (n10 == 3) {
                    i11 = cVar.G0();
                } else if (n10 == 4) {
                    str2 = cVar.C1();
                } else if (n10 != 5) {
                    cVar.o();
                    cVar.a0();
                } else {
                    str3 = cVar.C1();
                }
            }
            cVar.g();
            if (str2 != null) {
                v vVar = new v(i10, i11, str, str2, str3);
                map2.put(vVar.d(), vVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.f();
    }

    private static void c(c cVar, C8927i iVar, c0<d> c0Var) {
        cVar.d();
        while (cVar.hasNext()) {
            d a10 = C6518m.a(cVar, iVar);
            c0Var.l(a10.hashCode(), a10);
        }
        cVar.f();
    }

    private static void d(c cVar, Map<String, B6.c> map) {
        cVar.e();
        while (cVar.hasNext()) {
            if (cVar.n(f36226c) != 0) {
                cVar.o();
                cVar.a0();
            } else {
                cVar.d();
                while (cVar.hasNext()) {
                    B6.c a10 = C6519n.a(cVar);
                    map.put(a10.b(), a10);
                }
                cVar.f();
            }
        }
        cVar.g();
    }

    private static void e(c cVar, C8927i iVar, List<e> list, C5468y<e> yVar) {
        cVar.d();
        int i10 = 0;
        while (cVar.hasNext()) {
            e a10 = v.a(cVar, iVar);
            if (a10.g() == e.a.IMAGE) {
                i10++;
            }
            list.add(a10);
            yVar.k(a10.e(), a10);
            if (i10 > 4) {
                I6.d.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.f();
    }

    private static void f(c cVar, List<h> list) {
        cVar.d();
        while (cVar.hasNext()) {
            cVar.e();
            float f10 = 0.0f;
            String str = null;
            float f11 = 0.0f;
            while (cVar.hasNext()) {
                int n10 = cVar.n(f36227d);
                if (n10 == 0) {
                    str = cVar.C1();
                } else if (n10 == 1) {
                    f10 = (float) cVar.d2();
                } else if (n10 != 2) {
                    cVar.o();
                    cVar.a0();
                } else {
                    f11 = (float) cVar.d2();
                }
            }
            cVar.g();
            list.add(new h(str, f10, f11));
        }
        cVar.f();
    }
}
