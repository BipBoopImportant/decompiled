package ha;

import java.util.Arrays;

/* renamed from: ha.e0  reason: case insensitive filesystem */
class C7989e0 extends C7999f0 {

    /* renamed from: a  reason: collision with root package name */
    Object[] f52480a = new Object[4];

    /* renamed from: b  reason: collision with root package name */
    int f52481b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f52482c;

    C7989e0(int i10) {
    }

    private final void d(int i10) {
        Object[] objArr = this.f52480a;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
            this.f52480a = Arrays.copyOf(objArr, i11);
            this.f52482c = false;
        } else if (this.f52482c) {
            this.f52480a = (Object[]) objArr.clone();
            this.f52482c = false;
        }
    }

    public final C7989e0 b(Object obj) {
        obj.getClass();
        d(this.f52481b + 1);
        Object[] objArr = this.f52480a;
        int i10 = this.f52481b;
        this.f52481b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ha.C7999f0 c(java.lang.Iterable r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0020
            int r0 = r2.f52481b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.d(r0)
            boolean r0 = r3 instanceof ha.C8009g0
            if (r0 != 0) goto L_0x0013
            goto L_0x0020
        L_0x0013:
            ha.g0 r3 = (ha.C8009g0) r3
            java.lang.Object[] r0 = r2.f52480a
            int r1 = r2.f52481b
            int r3 = r3.b(r0, r1)
            r2.f52481b = r3
            return r2
        L_0x0020:
            java.util.Iterator r3 = r3.iterator()
        L_0x0024:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r3.next()
            r2.a(r0)
            goto L_0x0024
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.C7989e0.c(java.lang.Iterable):ha.f0");
    }
}
