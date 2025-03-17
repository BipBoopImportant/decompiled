package nb;

import java.io.Serializable;
import java.util.Arrays;
import jb.l;

/* renamed from: nb.e  reason: case insensitive filesystem */
public final class C10075e implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    private static final C10075e f75510d = new C10075e(new int[0]);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f75511a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f75512b;

    /* renamed from: c  reason: collision with root package name */
    private final int f75513c;

    private C10075e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static C10075e a(int[] iArr) {
        return iArr.length == 0 ? f75510d : new C10075e(Arrays.copyOf(iArr, iArr.length));
    }

    public static C10075e e() {
        return f75510d;
    }

    public int b(int i10) {
        l.h(i10, d());
        return this.f75511a[this.f75512b + i10];
    }

    public boolean c() {
        return this.f75513c == this.f75512b;
    }

    public int d() {
        return this.f75513c - this.f75512b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10075e)) {
            return false;
        }
        C10075e eVar = (C10075e) obj;
        if (d() != eVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (b(i10) != eVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = this.f75512b; i11 < this.f75513c; i11++) {
            i10 = (i10 * 31) + C10076f.h(this.f75511a[i11]);
        }
        return i10;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(d() * 5);
        sb2.append('[');
        sb2.append(this.f75511a[this.f75512b]);
        int i10 = this.f75512b;
        while (true) {
            i10++;
            if (i10 < this.f75513c) {
                sb2.append(", ");
                sb2.append(this.f75511a[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }

    private C10075e(int[] iArr, int i10, int i11) {
        this.f75511a = iArr;
        this.f75512b = i10;
        this.f75513c = i11;
    }
}
