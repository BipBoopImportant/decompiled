package g1;

import U0.C4863c;
import U0.H1;
import YH.C16870n;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lg1/A;", "", "T", "<init>", "()V", "value", "", "hash", "b", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "c", "(ILjava/lang/Object;I)I", "", "a", "(Ljava/lang/Object;)Z", "I", "e", "()I", "g", "(I)V", "size", "", "[I", "d", "()[I", "setHashes$runtime_release", "([I)V", "hashes", "", "LU0/H1;", "[LU0/H1;", "f", "()[LU0/H1;", "setValues$runtime_release", "([LU0/H1;)V", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.A  reason: case insensitive filesystem */
public final class C5320A<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f23333a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f23334b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private H1<T>[] f23335c = new H1[16];

    private final int b(T t10, int i10) {
        int i11 = this.f23333a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f23334b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                H1<T> h12 = this.f23335c[i13];
                return t10 == (h12 != null ? h12.get() : null) ? i13 : c(i13, t10, i10);
            }
        }
        return -(i12 + 1);
    }

    private final int c(int i10, T t10, int i11) {
        int i12 = i10 - 1;
        while (true) {
            T t11 = null;
            if (-1 >= i12 || this.f23334b[i12] != i11) {
                int i13 = i10 + 1;
                int i14 = this.f23333a;
            } else {
                H1<T> h12 = this.f23335c[i12];
                if (h12 != null) {
                    t11 = h12.get();
                }
                if (t11 == t10) {
                    return i12;
                }
                i12--;
            }
        }
        int i132 = i10 + 1;
        int i142 = this.f23333a;
        while (true) {
            if (i132 >= i142) {
                i132 = this.f23333a;
                break;
            } else if (this.f23334b[i132] != i11) {
                break;
            } else {
                H1<T> h13 = this.f23335c[i132];
                if ((h13 != null ? h13.get() : null) == t10) {
                    return i132;
                }
                i132++;
            }
        }
        return -(i132 + 1);
    }

    public final boolean a(T t10) {
        int i10;
        int i11 = this.f23333a;
        int c10 = C4863c.c(t10);
        if (i11 > 0) {
            i10 = b(t10, c10);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i12 = -(i10 + 1);
        H1<T>[] h1Arr = this.f23335c;
        int length = h1Arr.length;
        if (i11 == length) {
            int i13 = length * 2;
            H1<T>[] h1Arr2 = new H1[i13];
            int[] iArr = new int[i13];
            int i14 = i12 + 1;
            C16870n.n(h1Arr, h1Arr2, i14, i12, i11);
            int i15 = i12;
            C16870n.r(this.f23335c, h1Arr2, 0, 0, i15, 6, (Object) null);
            C16870n.l(this.f23334b, iArr, i14, i12, i11);
            C16870n.q(this.f23334b, iArr, 0, 0, i15, 6, (Object) null);
            this.f23335c = h1Arr2;
            this.f23334b = iArr;
        } else {
            int i16 = i12 + 1;
            C16870n.n(h1Arr, h1Arr, i16, i12, i11);
            int[] iArr2 = this.f23334b;
            C16870n.l(iArr2, iArr2, i16, i12, i11);
        }
        this.f23335c[i12] = new H1<>(t10);
        this.f23334b[i12] = c10;
        this.f23333a++;
        return true;
    }

    public final int[] d() {
        return this.f23334b;
    }

    public final int e() {
        return this.f23333a;
    }

    public final H1<T>[] f() {
        return this.f23335c;
    }

    public final void g(int i10) {
        this.f23333a = i10;
    }
}
