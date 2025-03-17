package B1;

import A1.A;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\fJ\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\fJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\fR$\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"LB1/b;", "", "<init>", "()V", "", "index", "LA1/A;", "e", "(I)J", "pointerId", "", "i", "(J)Z", "", "pointerIdValue", "h", "j", "(I)Z", "g", "()Z", "value", "a", "b", "LXH/N;", "k", "(IJ)V", "c", "d", "<set-?>", "I", "f", "()I", "size", "", "[J", "internalArray", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f5160a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f5161b = new long[2];

    public final boolean a(long j10) {
        if (d(j10)) {
            return false;
        }
        k(this.f5160a, j10);
        return true;
    }

    public final boolean b(long j10) {
        return a(j10);
    }

    public final void c() {
        this.f5160a = 0;
    }

    public final boolean d(long j10) {
        int i10 = this.f5160a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f5161b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final long e(int i10) {
        return A.b(this.f5161b[i10]);
    }

    public final int f() {
        return this.f5160a;
    }

    public final boolean g() {
        return this.f5160a == 0;
    }

    public final boolean h(long j10) {
        int i10 = this.f5160a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j10 == e(i11)) {
                j(i11);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long j10) {
        return h(j10);
    }

    public final boolean j(int i10) {
        int i11 = this.f5160a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f5161b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f5160a--;
        return true;
    }

    public final void k(int i10, long j10) {
        long[] jArr = this.f5161b;
        if (i10 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i10 + 1, jArr.length * 2));
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f5161b = copyOf;
        }
        this.f5161b[i10] = j10;
        if (i10 >= this.f5160a) {
            this.f5160a = i10 + 1;
        }
    }
}
