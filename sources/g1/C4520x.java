package G1;

import D1.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0016J-\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u000bJ\r\u0010!\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\"¨\u0006,"}, d2 = {"LG1/x;", "", "", "initialCapacity", "<init>", "(I)V", "start", "end", "elSize", "LXH/N;", "i", "(III)V", "e", "(III)I", "j", "k", "(II)V", "a", "b", "", "(II)Z", "index", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "h", "(IIII)V", "x", "y", "size", "g", "f", "()I", "d", "()Z", "()V", "", "[I", "stack", "I", "lastIndex", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.x  reason: case insensitive filesystem */
final class C4520x {

    /* renamed from: a  reason: collision with root package name */
    private int[] f6598a;

    /* renamed from: b  reason: collision with root package name */
    private int f6599b;

    public C4520x(int i10) {
        this.f6598a = new int[i10];
    }

    private final boolean a(int i10, int i11) {
        int[] iArr = this.f6598a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        if (i12 >= i13) {
            return i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1];
        }
        return true;
    }

    private final int e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (a(i10, i11)) {
                i13 += i12;
                k(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        k(i14, i11);
        return i14;
    }

    private final void i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int e10 = e(i10, i11, i12);
            i(i10, e10 - i12, i12);
            i(e10 + i12, i11, i12);
        }
    }

    private final void k(int i10, int i11) {
        int[] iArr = this.f6598a;
        Y.i(iArr, i10, i11);
        Y.i(iArr, i10 + 1, i11 + 1);
        Y.i(iArr, i10 + 2, i11 + 2);
    }

    public final int b(int i10) {
        return this.f6598a[i10];
    }

    public final int c() {
        return this.f6599b;
    }

    public final boolean d() {
        return this.f6599b != 0;
    }

    public final int f() {
        int[] iArr = this.f6598a;
        int i10 = this.f6599b - 1;
        this.f6599b = i10;
        return iArr[i10];
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f6599b;
        int i14 = i13 + 3;
        int[] iArr = this.f6598a;
        if (i14 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f6598a = copyOf;
        }
        int[] iArr2 = this.f6598a;
        iArr2[i13] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f6599b = i14;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = this.f6599b;
        int i15 = i14 + 4;
        int[] iArr = this.f6598a;
        if (i15 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f6598a = copyOf;
        }
        int[] iArr2 = this.f6598a;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f6599b = i15;
    }

    public final void j() {
        int i10 = this.f6599b;
        if (!(i10 % 3 == 0)) {
            a.b("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }
}
