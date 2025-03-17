package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<e1> f16870a = new ArrayList();

    private static void b(List<int[]> list, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    b(list, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    private List<int[]> c(int i10) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    public boolean a(e1 e1Var) {
        return this.f16870a.add(e1Var);
    }

    public List<e1> d(List<e1> list) {
        int i10;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f16870a.size()) {
            return null;
        }
        List<int[]> c10 = c(this.f16870a.size());
        e1[] e1VarArr = new e1[list.size()];
        Iterator<int[]> it = c10.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean z10 = true;
            while (i10 < this.f16870a.size()) {
                if (next[i10] < list.size()) {
                    z10 &= this.f16870a.get(i10).g(list.get(next[i10]));
                    if (!z10) {
                        continue;
                        break;
                    }
                    e1VarArr[next[i10]] = this.f16870a.get(i10);
                }
                i10++;
            }
            if (z10) {
                i10 = 1;
                break;
            }
        }
        if (i10 != 0) {
            return Arrays.asList(e1VarArr);
        }
        return null;
    }
}
