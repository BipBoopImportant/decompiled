package ia;

import java.util.Arrays;

class K3 extends C8302l4 {

    /* renamed from: a  reason: collision with root package name */
    Object[] f53308a = new Object[4];

    /* renamed from: b  reason: collision with root package name */
    int f53309b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f53310c;

    K3(int i10) {
    }

    private final void b(int i10) {
        Object[] objArr = this.f53308a;
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
            this.f53308a = Arrays.copyOf(objArr, i11);
            this.f53310c = false;
        } else if (this.f53310c) {
            this.f53308a = (Object[]) objArr.clone();
            this.f53310c = false;
        }
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f53309b + 1);
        Object[] objArr = this.f53308a;
        int i10 = this.f53309b;
        this.f53309b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
