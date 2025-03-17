package g1;

import YH.C16870n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\bR$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006!"}, d2 = {"Lg1/m;", "", "<init>", "()V", "", "index", "LXH/N;", "h", "(I)V", "g", "a", "b", "i", "(II)V", "atLeast", "c", "()I", "handle", "d", "default", "e", "(I)I", "value", "f", "<set-?>", "I", "getSize", "size", "", "[I", "values", "handles", "firstFreeHandle", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.m  reason: case insensitive filesystem */
public final class C5344m {

    /* renamed from: a  reason: collision with root package name */
    private int f23403a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f23404b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private int[] f23405c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    private int[] f23406d;

    /* renamed from: e  reason: collision with root package name */
    private int f23407e;

    public C5344m() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f23406d = iArr;
    }

    private final int b() {
        int length = this.f23406d.length;
        if (this.f23407e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            C16870n.q(this.f23406d, iArr, 0, 0, 0, 14, (Object) null);
            this.f23406d = iArr;
        }
        int i13 = this.f23407e;
        this.f23407e = this.f23406d[i13];
        return i13;
    }

    private final void c(int i10) {
        int[] iArr = this.f23404b;
        int length = iArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            C16870n.q(iArr, iArr2, 0, 0, 0, 14, (Object) null);
            C16870n.q(this.f23405c, iArr3, 0, 0, 0, 14, (Object) null);
            this.f23404b = iArr2;
            this.f23405c = iArr3;
        }
    }

    private final void d(int i10) {
        this.f23406d[i10] = this.f23407e;
        this.f23407e = i10;
    }

    private final void g(int i10) {
        int i11;
        int[] iArr = this.f23404b;
        int i12 = this.f23403a >> 1;
        while (i10 < i12) {
            int i13 = (i10 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 >= this.f23403a || (i11 = iArr[i13]) >= iArr[i14]) {
                if (iArr[i14] < iArr[i10]) {
                    i(i14, i10);
                    i10 = i14;
                } else {
                    return;
                }
            } else if (i11 < iArr[i10]) {
                i(i13, i10);
                i10 = i13;
            } else {
                return;
            }
        }
    }

    private final void h(int i10) {
        int[] iArr = this.f23404b;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] > i11) {
                i(i12, i10);
                i10 = i12;
            } else {
                return;
            }
        }
    }

    private final void i(int i10, int i11) {
        int[] iArr = this.f23404b;
        int[] iArr2 = this.f23405c;
        int[] iArr3 = this.f23406d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    public final int a(int i10) {
        c(this.f23403a + 1);
        int i11 = this.f23403a;
        this.f23403a = i11 + 1;
        int b10 = b();
        this.f23404b[i11] = i10;
        this.f23405c[i11] = b10;
        this.f23406d[b10] = i11;
        h(i11);
        return b10;
    }

    public final int e(int i10) {
        return this.f23403a > 0 ? this.f23404b[0] : i10;
    }

    public final void f(int i10) {
        int i11 = this.f23406d[i10];
        i(i11, this.f23403a - 1);
        this.f23403a--;
        h(i11);
        g(i11);
        d(i10);
    }
}
