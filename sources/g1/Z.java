package G1;

import W0.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"LG1/Z;", "T", "", "<init>", "()V", "", "a", "()Z", "b", "()Ljava/lang/Object;", "LW0/b;", "vector", "LXH/N;", "c", "(LW0/b;)V", "", "I", "size", "", "[I", "currentIndexes", "", "[LW0/b;", "vectors", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Z<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f6407a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f6408b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private b<T>[] f6409c = new b[16];

    public final boolean a() {
        int i10 = this.f6407a;
        return i10 > 0 && this.f6408b[i10 - 1] >= 0;
    }

    public final T b() {
        int i10 = this.f6407a;
        if (i10 > 0) {
            int i11 = i10 - 1;
            int i12 = this.f6408b[i11];
            b<T> bVar = this.f6409c[i11];
            C17542s.g(bVar);
            if (i12 > 0) {
                int[] iArr = this.f6408b;
                iArr[i11] = iArr[i11] - 1;
            } else if (i12 == 0) {
                this.f6409c[i11] = null;
                this.f6407a--;
            }
            return bVar.q()[i12];
        }
        throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
    }

    public final void c(b<T> bVar) {
        if (!bVar.t()) {
            int i10 = this.f6407a;
            int[] iArr = this.f6408b;
            if (i10 >= iArr.length) {
                int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
                C17542s.i(copyOf, "copyOf(this, newSize)");
                this.f6408b = copyOf;
                b<T>[] bVarArr = this.f6409c;
                Object[] copyOf2 = Arrays.copyOf(bVarArr, bVarArr.length * 2);
                C17542s.i(copyOf2, "copyOf(this, newSize)");
                this.f6409c = (b[]) copyOf2;
            }
            this.f6408b[i10] = bVar.r() - 1;
            this.f6409c[i10] = bVar;
            this.f6407a++;
        }
    }
}
