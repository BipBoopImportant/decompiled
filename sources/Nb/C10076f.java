package nb;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import jb.l;

/* renamed from: nb.f  reason: case insensitive filesystem */
public final class C10076f extends C10077g {

    /* renamed from: nb.f$a */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final int[] f75514a;

        /* renamed from: b  reason: collision with root package name */
        final int f75515b;

        /* renamed from: c  reason: collision with root package name */
        final int f75516c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        /* renamed from: b */
        public Integer get(int i10) {
            l.h(i10, size());
            return Integer.valueOf(this.f75514a[this.f75515b + i10]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C10076f.i(this.f75514a, ((Integer) obj).intValue(), this.f75515b, this.f75516c) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f75514a[this.f75515b + i10] != aVar.f75514a[aVar.f75515b + i10]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f75515b; i11 < this.f75516c; i11++) {
                i10 = (i10 * 31) + C10076f.h(this.f75514a[i11]);
            }
            return i10;
        }

        /* renamed from: i */
        public Integer set(int i10, Integer num) {
            l.h(i10, size());
            int[] iArr = this.f75514a;
            int i11 = this.f75515b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) l.j(num)).intValue();
            return Integer.valueOf(i12);
        }

        public int indexOf(Object obj) {
            int a10;
            if (!(obj instanceof Integer) || (a10 = C10076f.i(this.f75514a, ((Integer) obj).intValue(), this.f75515b, this.f75516c)) < 0) {
                return -1;
            }
            return a10 - this.f75515b;
        }

        public boolean isEmpty() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public int[] j() {
            return Arrays.copyOfRange(this.f75514a, this.f75515b, this.f75516c);
        }

        public int lastIndexOf(Object obj) {
            int b10;
            if (!(obj instanceof Integer) || (b10 = C10076f.j(this.f75514a, ((Integer) obj).intValue(), this.f75515b, this.f75516c)) < 0) {
                return -1;
            }
            return b10 - this.f75515b;
        }

        public int size() {
            return this.f75516c - this.f75515b;
        }

        public List<Integer> subList(int i10, int i11) {
            l.n(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f75514a;
            int i12 = this.f75515b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f75514a[this.f75515b]);
            int i10 = this.f75515b;
            while (true) {
                i10++;
                if (i10 < this.f75516c) {
                    sb2.append(", ");
                    sb2.append(this.f75514a[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        a(int[] iArr, int i10, int i11) {
            this.f75514a = iArr;
            this.f75515b = i10;
            this.f75516c = i11;
        }
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        l.g(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11, int i12) {
        l.f(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int f(byte[] bArr) {
        l.f(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return g(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int g(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int h(int i10) {
        return i10;
    }

    /* access modifiers changed from: private */
    public static int i(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static int j(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int k(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] l(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).j();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) l.j(array[i10])).intValue();
        }
        return iArr;
    }

    public static Integer m(String str) {
        return n(str, 10);
    }

    public static Integer n(String str, int i10) {
        Long c10 = C10078h.c(str, i10);
        if (c10 == null || c10.longValue() != ((long) c10.intValue())) {
            return null;
        }
        return Integer.valueOf(c10.intValue());
    }
}
