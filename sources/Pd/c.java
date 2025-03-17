package pd;

import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C10135a f75851a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C10136b> f75852b;

    public c(C10135a aVar) {
        this.f75851a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f75852b = arrayList;
        arrayList.add(new C10136b(aVar, new int[]{1}));
    }

    private C10136b a(int i10) {
        if (i10 >= this.f75852b.size()) {
            List<C10136b> list = this.f75852b;
            C10136b bVar = list.get(list.size() - 1);
            for (int size = this.f75852b.size(); size <= i10; size++) {
                C10135a aVar = this.f75851a;
                bVar = bVar.g(new C10136b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f75852b.add(bVar);
            }
        }
        return this.f75852b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length > 0) {
                C10136b a10 = a(i10);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] d10 = new C10136b(this.f75851a, iArr2).h(i10, 1).b(a10)[1].d();
                int length2 = i10 - d10.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    iArr[length + i11] = 0;
                }
                System.arraycopy(d10, 0, iArr, length + length2, d10.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
