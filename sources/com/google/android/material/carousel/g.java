package com.google.android.material.carousel;

import B2.a;
import Fa.C9081a;
import com.google.android.material.carousel.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final f f66339a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f66340b;

    /* renamed from: c  reason: collision with root package name */
    private final List<f> f66341c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f66342d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f66343e;

    /* renamed from: f  reason: collision with root package name */
    private final float f66344f;

    /* renamed from: g  reason: collision with root package name */
    private final float f66345g;

    private g(f fVar, List<f> list, List<f> list2) {
        this.f66339a = fVar;
        this.f66340b = Collections.unmodifiableList(list);
        this.f66341c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f66331a - fVar.c().f66331a;
        this.f66344f = f10;
        float f11 = fVar.j().f66331a - list2.get(list2.size() - 1).j().f66331a;
        this.f66345g = f11;
        this.f66342d = m(f10, list, true);
        this.f66343e = m(f11, list2, false);
    }

    private f a(List<f> list, float f10, float[] fArr) {
        float[] o10 = o(list, f10, fArr);
        return o10[0] >= 0.5f ? list.get((int) o10[2]) : list.get((int) o10[1]);
    }

    private static int b(f fVar, float f10) {
        for (int i10 = fVar.i(); i10 < fVar.g().size(); i10++) {
            if (f10 == fVar.g().get(i10).f66333c) {
                return i10;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(f fVar) {
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            if (!fVar.g().get(i10).f66335e) {
                return i10;
            }
        }
        return -1;
    }

    private static int d(f fVar, float f10) {
        for (int b10 = fVar.b() - 1; b10 >= 0; b10--) {
            if (f10 == fVar.g().get(b10).f66333c) {
                return b10;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!fVar.g().get(size).f66335e) {
                return size;
            }
        }
        return -1;
    }

    static g f(b bVar, f fVar, float f10, float f11, float f12) {
        return new g(fVar, p(bVar, fVar, f10, f11), n(bVar, fVar, f10, f12));
    }

    private static float[] m(float f10, List<f> list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            f fVar = list.get(i11);
            f fVar2 = list.get(i10);
            fArr[i10] = i10 == size + -1 ? 1.0f : fArr[i11] + ((z10 ? fVar2.c().f66331a - fVar.c().f66331a : fVar.j().f66331a - fVar2.j().f66331a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List<f> n(b bVar, f fVar, float f10, float f11) {
        f fVar2 = fVar;
        float f12 = f10;
        float f13 = f11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar2);
        int e10 = e(fVar);
        float b10 = (float) (bVar.f() ? bVar.b() : bVar.e());
        if (r(bVar, fVar) || e10 == -1) {
            if (f13 > 0.0f) {
                arrayList.add(u(fVar2, f13, b10, false, f12));
            }
            return arrayList;
        }
        int i10 = e10 - fVar.i();
        float f14 = fVar.c().f66332b - (fVar.c().f66334d / 2.0f);
        if (i10 > 0 || fVar.h().f66336f <= 0.0f) {
            float f15 = 0.0f;
            int i11 = 0;
            while (i11 < i10) {
                f fVar3 = (f) arrayList.get(arrayList.size() - 1);
                int i12 = e10 - i11;
                float f16 = f15 + fVar.g().get(i12).f66336f;
                int i13 = i12 + 1;
                int i14 = i11;
                f t10 = t(fVar3, e10, i13 < fVar.g().size() ? d(fVar3, fVar.g().get(i13).f66333c) + 1 : 0, f14 - f16, fVar.b() + i11 + 1, fVar.i() + i11 + 1, b10);
                if (i14 == i10 - 1 && f13 > 0.0f) {
                    t10 = u(t10, f13, b10, false, f12);
                }
                arrayList.add(t10);
                i11 = i14 + 1;
                f15 = f16;
            }
            return arrayList;
        }
        arrayList.add(v(fVar2, f14 - fVar.h().f66336f, b10));
        return arrayList;
    }

    private static float[] o(List<f> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{C9081a.b(0.0f, 1.0f, f11, f12, f10), (float) (i10 - 1), (float) i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<f> p(b bVar, f fVar, float f10, float f11) {
        f fVar2 = fVar;
        float f12 = f10;
        float f13 = f11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar2);
        int c10 = c(fVar);
        float b10 = (float) (bVar.f() ? bVar.b() : bVar.e());
        int i10 = 1;
        if (q(fVar) || c10 == -1) {
            if (f13 > 0.0f) {
                arrayList.add(u(fVar2, f13, b10, true, f12));
            }
            return arrayList;
        }
        int b11 = fVar.b() - c10;
        float f14 = fVar.c().f66332b - (fVar.c().f66334d / 2.0f);
        if (b11 > 0 || fVar.a().f66336f <= 0.0f) {
            int i11 = 0;
            float f15 = 0.0f;
            while (i11 < b11) {
                f fVar3 = (f) arrayList.get(arrayList.size() - i10);
                int i12 = c10 + i11;
                int size = fVar.g().size() - i10;
                float f16 = f15 + fVar.g().get(i12).f66336f;
                int i13 = i12 - i10;
                int b12 = i13 >= 0 ? b(fVar3, fVar.g().get(i13).f66333c) - i10 : size;
                int i14 = i11;
                f t10 = t(fVar3, c10, b12, f14 + f16, (fVar.b() - i11) - 1, (fVar.i() - i11) - 1, b10);
                if (i14 == b11 - 1 && f13 > 0.0f) {
                    t10 = u(t10, f13, b10, true, f12);
                }
                arrayList.add(t10);
                i11 = i14 + 1;
                f15 = f16;
                i10 = 1;
            }
            return arrayList;
        }
        arrayList.add(v(fVar2, f14 + fVar.a().f66336f, b10));
        return arrayList;
    }

    private static boolean q(f fVar) {
        return fVar.a().f66332b - (fVar.a().f66334d / 2.0f) >= 0.0f && fVar.a() == fVar.d();
    }

    private static boolean r(b bVar, f fVar) {
        int e10 = bVar.e();
        if (bVar.f()) {
            e10 = bVar.b();
        }
        return fVar.h().f66332b + (fVar.h().f66334d / 2.0f) <= ((float) e10) && fVar.h() == fVar.k();
    }

    private static f s(List<f> list, float f10, float[] fArr) {
        float[] o10 = o(list, f10, fArr);
        return f.m(list.get((int) o10[1]), list.get((int) o10[2]), o10[0]);
    }

    private static f t(f fVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i11, (f.c) arrayList.remove(i10));
        f.b bVar = new f.b(fVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i14);
            float f12 = cVar.f66334d;
            bVar.e(f10 + (f12 / 2.0f), cVar.f66333c, f12, i14 >= i12 && i14 <= i13, cVar.f66335e, cVar.f66336f);
            f10 += cVar.f66334d;
            i14++;
        }
        return bVar.i();
    }

    private static f u(f fVar, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(fVar.g());
        f.b bVar = new f.b(fVar.f(), f11);
        float l10 = f10 / ((float) fVar.l());
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i10);
            if (cVar.f66335e) {
                bVar.e(cVar.f66332b, cVar.f66333c, cVar.f66334d, false, true, cVar.f66336f);
            } else {
                boolean z11 = i10 >= fVar.b() && i10 <= fVar.i();
                float f14 = cVar.f66334d - l10;
                float b10 = d.b(f14, fVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.f66332b;
                bVar.f(f15, b10, f14, z11, false, cVar.f66336f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return bVar.i();
    }

    private static f v(f fVar, float f10, float f11) {
        return t(fVar, 0, 0, f10, fVar.b(), fVar.i(), f11);
    }

    /* access modifiers changed from: package-private */
    public f g() {
        return this.f66339a;
    }

    /* access modifiers changed from: package-private */
    public f h() {
        List<f> list = this.f66341c;
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public Map<Integer, f> i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f66339a.f();
        HashMap hashMap = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = -1;
            if (i13 >= i10) {
                break;
            }
            int i16 = z10 ? (i10 - i13) - 1 : i13;
            float f11 = ((float) i16) * f10;
            if (!z10) {
                i15 = 1;
            }
            if (f11 * ((float) i15) > ((float) i12) - this.f66345g || i13 >= i10 - this.f66341c.size()) {
                Integer valueOf = Integer.valueOf(i16);
                List<f> list = this.f66341c;
                hashMap.put(valueOf, list.get(a.c(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i17 = 0;
        for (int i18 = i10 - 1; i18 >= 0; i18--) {
            int i19 = z10 ? (i10 - i18) - 1 : i18;
            if (((float) i19) * f10 * ((float) (z10 ? -1 : 1)) < ((float) i11) + this.f66344f || i18 < this.f66340b.size()) {
                Integer valueOf2 = Integer.valueOf(i19);
                List<f> list2 = this.f66340b;
                hashMap.put(valueOf2, list2.get(a.c(i17, 0, list2.size() - 1)));
                i17++;
            }
        }
        return hashMap;
    }

    public f j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    /* access modifiers changed from: package-private */
    public f k(float f10, float f11, float f12, boolean z10) {
        float[] fArr;
        List<f> list;
        float f13;
        float f14 = this.f66344f + f11;
        float f15 = f12 - this.f66345g;
        float f16 = l().a().f66337g;
        float f17 = h().h().f66338h;
        if (this.f66344f == f16) {
            f14 += f16;
        }
        if (this.f66345g == f17) {
            f15 -= f17;
        }
        if (f10 < f14) {
            f13 = C9081a.b(1.0f, 0.0f, f11, f14, f10);
            list = this.f66340b;
            fArr = this.f66342d;
        } else if (f10 <= f15) {
            return this.f66339a;
        } else {
            f13 = C9081a.b(0.0f, 1.0f, f15, f12, f10);
            list = this.f66341c;
            fArr = this.f66343e;
        }
        return z10 ? a(list, f13, fArr) : s(list, f13, fArr);
    }

    /* access modifiers changed from: package-private */
    public f l() {
        List<f> list = this.f66340b;
        return list.get(list.size() - 1);
    }
}
