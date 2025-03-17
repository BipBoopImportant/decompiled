package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C7003a;
import java.util.List;

class s {

    /* renamed from: a  reason: collision with root package name */
    final a f44178a;

    interface a {
        C7003a.b a(int i10, int i11, int i12, Object obj);

        void b(C7003a.b bVar);
    }

    s(a aVar) {
        this.f44178a = aVar;
    }

    private int a(List<C7003a.b> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f43938a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<C7003a.b> list, int i10, C7003a.b bVar, int i11, C7003a.b bVar2) {
        int i12 = bVar.f43941d;
        int i13 = bVar2.f43939b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f43939b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f43939b = i15 + bVar2.f43941d;
        }
        int i16 = bVar2.f43939b;
        if (i16 <= i12) {
            bVar.f43941d = i12 + bVar2.f43941d;
        }
        bVar2.f43939b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List<C7003a.b> list, int i10, int i11) {
        C7003a.b bVar = list.get(i10);
        C7003a.b bVar2 = list.get(i11);
        int i12 = bVar2.f43938a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else if (i12 == 4) {
            f(list, i10, bVar, i11, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(List<C7003a.b> list) {
        while (true) {
            int a10 = a(list);
            if (a10 != -1) {
                d(list, a10, a10 + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(List<C7003a.b> list, int i10, C7003a.b bVar, int i11, C7003a.b bVar2) {
        boolean z10;
        int i12 = bVar.f43939b;
        int i13 = bVar.f43941d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f43939b == i12 && bVar2.f43941d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f43939b == i13 + 1 && bVar2.f43941d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f43939b;
        if (i13 < i14) {
            bVar2.f43939b = i14 - 1;
        } else {
            int i15 = bVar2.f43941d;
            if (i13 < i14 + i15) {
                bVar2.f43941d = i15 - 1;
                bVar.f43938a = 2;
                bVar.f43941d = 1;
                if (bVar2.f43941d == 0) {
                    list.remove(i11);
                    this.f44178a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f43939b;
        int i17 = bVar2.f43939b;
        C7003a.b bVar3 = null;
        if (i16 <= i17) {
            bVar2.f43939b = i17 + 1;
        } else {
            int i18 = bVar2.f43941d;
            if (i16 < i17 + i18) {
                bVar3 = this.f44178a.a(2, i16 + 1, (i17 + i18) - i16, (Object) null);
                bVar2.f43941d = bVar.f43939b - bVar2.f43939b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f44178a.b(bVar);
            return;
        }
        if (z10) {
            if (bVar3 != null) {
                int i19 = bVar.f43939b;
                if (i19 > bVar3.f43939b) {
                    bVar.f43939b = i19 - bVar3.f43941d;
                }
                int i20 = bVar.f43941d;
                if (i20 > bVar3.f43939b) {
                    bVar.f43941d = i20 - bVar3.f43941d;
                }
            }
            int i21 = bVar.f43939b;
            if (i21 > bVar2.f43939b) {
                bVar.f43939b = i21 - bVar2.f43941d;
            }
            int i22 = bVar.f43941d;
            if (i22 > bVar2.f43939b) {
                bVar.f43941d = i22 - bVar2.f43941d;
            }
        } else {
            if (bVar3 != null) {
                int i23 = bVar.f43939b;
                if (i23 >= bVar3.f43939b) {
                    bVar.f43939b = i23 - bVar3.f43941d;
                }
                int i24 = bVar.f43941d;
                if (i24 >= bVar3.f43939b) {
                    bVar.f43941d = i24 - bVar3.f43941d;
                }
            }
            int i25 = bVar.f43939b;
            if (i25 >= bVar2.f43939b) {
                bVar.f43939b = i25 - bVar2.f43941d;
            }
            int i26 = bVar.f43941d;
            if (i26 >= bVar2.f43939b) {
                bVar.f43941d = i26 - bVar2.f43941d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f43939b != bVar.f43941d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVar3 != null) {
            list.add(i10, bVar3);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.util.List<androidx.recyclerview.widget.C7003a.b> r9, int r10, androidx.recyclerview.widget.C7003a.b r11, int r12, androidx.recyclerview.widget.C7003a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f43941d
            int r1 = r13.f43939b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r3
            r13.f43939b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f43941d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r3
            r13.f43941d = r5
            androidx.recyclerview.widget.s$a r0 = r8.f44178a
            int r1 = r11.f43939b
            java.lang.Object r5 = r13.f43940c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r3, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r4
        L_0x0021:
            int r1 = r11.f43939b
            int r5 = r13.f43939b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r3
            r13.f43939b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f43941d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.s$a r4 = r8.f44178a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f43940c
            androidx.recyclerview.widget.a$b r4 = r4.a(r2, r1, r5, r3)
            int r1 = r13.f43941d
            int r1 = r1 - r5
            r13.f43941d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f43941d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.s$a r11 = r8.f44178a
            r11.b(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r9.add(r10, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.s.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
