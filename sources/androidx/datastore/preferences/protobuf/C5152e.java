package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5172z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.e  reason: case insensitive filesystem */
final class C5152e extends C5150c<Boolean> implements C5172z.a, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final C5152e f21302d = new C5152e(new boolean[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f21303b;

    /* renamed from: c  reason: collision with root package name */
    private int f21304c;

    C5152e() {
        this(new boolean[10], 0, true);
    }

    private void k(int i10, boolean z10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f21304c)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        boolean[] zArr = this.f21303b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f21303b, i10, zArr2, i10 + 1, this.f21304c - i10);
            this.f21303b = zArr2;
        }
        this.f21303b[i10] = z10;
        this.f21304c++;
        this.modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f21304c) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f21304c;
    }

    public boolean A(int i10, boolean z10) {
        b();
        p(i10);
        boolean[] zArr = this.f21303b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        b();
        C5172z.a(collection);
        if (!(collection instanceof C5152e)) {
            return super.addAll(collection);
        }
        C5152e eVar = (C5152e) collection;
        int i10 = eVar.f21304c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f21304c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f21303b;
            if (i12 > zArr.length) {
                this.f21303b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(eVar.f21303b, 0, this.f21303b, this.f21304c, eVar.f21304c);
            this.f21304c = i12;
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
        if (!(obj instanceof C5152e)) {
            return super.equals(obj);
        }
        C5152e eVar = (C5152e) obj;
        if (this.f21304c != eVar.f21304c) {
            return false;
        }
        boolean[] zArr = eVar.f21303b;
        for (int i10 = 0; i10 < this.f21304c; i10++) {
            if (this.f21303b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f21304c; i11++) {
            i10 = (i10 * 31) + C5172z.c(this.f21303b[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public void add(int i10, Boolean bool) {
        k(i10, bool.booleanValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f21303b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Boolean bool) {
        m(bool.booleanValue());
        return true;
    }

    public void m(boolean z10) {
        b();
        int i10 = this.f21304c;
        boolean[] zArr = this.f21303b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f21303b = zArr2;
        }
        boolean[] zArr3 = this.f21303b;
        int i11 = this.f21304c;
        this.f21304c = i11 + 1;
        zArr3[i11] = z10;
    }

    /* renamed from: q */
    public Boolean get(int i10) {
        return Boolean.valueOf(r(i10));
    }

    public boolean r(int i10) {
        p(i10);
        return this.f21303b[i10];
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            boolean[] zArr = this.f21303b;
            System.arraycopy(zArr, i11, zArr, i10, this.f21304c - i11);
            this.f21304c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f21304c;
    }

    /* renamed from: t */
    public C5172z.a f(int i10) {
        if (i10 >= this.f21304c) {
            return new C5152e(Arrays.copyOf(this.f21303b, i10), this.f21304c, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    public Boolean remove(int i10) {
        b();
        p(i10);
        boolean[] zArr = this.f21303b;
        boolean z10 = zArr[i10];
        int i11 = this.f21304c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f21304c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* renamed from: y */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(A(i10, bool.booleanValue()));
    }

    private C5152e(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f21303b = zArr;
        this.f21304c = i10;
    }
}
