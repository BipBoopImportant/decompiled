package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5172z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y  reason: case insensitive filesystem */
final class C5171y extends C5150c<Integer> implements C5172z.g, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C5171y f21465d = new C5171y(new int[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    private int[] f21466b;

    /* renamed from: c  reason: collision with root package name */
    private int f21467c;

    C5171y() {
        this(new int[10], 0, true);
    }

    private void k(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f21467c)) {
            throw new IndexOutOfBoundsException(q(i10));
        }
        int[] iArr = this.f21466b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f21466b, i10, iArr2, i10 + 1, this.f21467c - i10);
            this.f21466b = iArr2;
        }
        this.f21466b[i10] = i11;
        this.f21467c++;
        this.modCount++;
    }

    private void m(int i10) {
        if (i10 < 0 || i10 >= this.f21467c) {
            throw new IndexOutOfBoundsException(q(i10));
        }
    }

    private String q(int i10) {
        return "Index:" + i10 + ", Size:" + this.f21467c;
    }

    public void P1(int i10) {
        b();
        int i11 = this.f21467c;
        int[] iArr = this.f21466b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f21466b = iArr2;
        }
        int[] iArr3 = this.f21466b;
        int i12 = this.f21467c;
        this.f21467c = i12 + 1;
        iArr3[i12] = i10;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        C5172z.a(collection);
        if (!(collection instanceof C5171y)) {
            return super.addAll(collection);
        }
        C5171y yVar = (C5171y) collection;
        int i10 = yVar.f21467c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f21467c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f21466b;
            if (i12 > iArr.length) {
                this.f21466b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(yVar.f21466b, 0, this.f21466b, this.f21467c, yVar.f21467c);
            this.f21467c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5171y)) {
            return super.equals(obj);
        }
        C5171y yVar = (C5171y) obj;
        if (this.f21467c != yVar.f21467c) {
            return false;
        }
        int[] iArr = yVar.f21466b;
        for (int i10 = 0; i10 < this.f21467c; i10++) {
            if (this.f21466b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i10) {
        m(i10);
        return this.f21466b[i10];
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f21467c; i11++) {
            i10 = (i10 * 31) + this.f21466b[i11];
        }
        return i10;
    }

    /* renamed from: i */
    public void add(int i10, Integer num) {
        k(i10, num.intValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f21466b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Integer num) {
        P1(num.intValue());
        return true;
    }

    /* renamed from: p */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    /* renamed from: r */
    public C5172z.g f(int i10) {
        if (i10 >= this.f21467c) {
            return new C5171y(Arrays.copyOf(this.f21466b, i10), this.f21467c, true);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f21466b;
            System.arraycopy(iArr, i11, iArr, i10, this.f21467c - i11);
            this.f21467c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer remove(int i10) {
        b();
        m(i10);
        int[] iArr = this.f21466b;
        int i11 = iArr[i10];
        int i12 = this.f21467c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f21467c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public int size() {
        return this.f21467c;
    }

    /* renamed from: t */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(x(i10, num.intValue()));
    }

    public int x(int i10, int i11) {
        b();
        m(i10);
        int[] iArr = this.f21466b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    private C5171y(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f21466b = iArr;
        this.f21467c = i10;
    }
}
