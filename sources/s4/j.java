package s4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.C8427k;
import s3.a;
import t3.C5950a;
import t3.N;

final class j implements C8427k {

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f55856a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f55857b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f55858c;

    public j(List<d> list) {
        this.f55856a = Collections.unmodifiableList(new ArrayList(list));
        this.f55857b = new long[(list.size() * 2)];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f55857b;
            jArr[i11] = dVar.f55827b;
            jArr[i11 + 1] = dVar.f55828c;
        }
        long[] jArr2 = this.f55857b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f55858c = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j10) {
        int e10 = N.e(this.f55858c, j10, false, false);
        if (e10 < this.f55858c.length) {
            return e10;
        }
        return -1;
    }

    public List<a> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f55856a.size(); i10++) {
            long[] jArr = this.f55857b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = this.f55856a.get(i10);
                a aVar = dVar.f55826a;
                if (aVar.f29045e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new i());
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f55826a.a().h((float) (-1 - i12), 1).a());
        }
        return arrayList;
    }

    public long j(int i10) {
        boolean z10 = false;
        C5950a.a(i10 >= 0);
        if (i10 < this.f55858c.length) {
            z10 = true;
        }
        C5950a.a(z10);
        return this.f55858c[i10];
    }

    public int m() {
        return this.f55858c.length;
    }
}
