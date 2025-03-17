package WJ;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LWJ/y;", "T", "", "", "initialLength", "<init>", "(I)V", "a", "()I", "index", "b", "(I)Ljava/lang/Object;", "value", "LXH/N;", "c", "(ILjava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y<T> {
    private volatile AtomicReferenceArray<T> array;

    public y(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    public final int a() {
        return this.array.length();
    }

    public final T b(int i10) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    public final void c(int i10, T t10) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, t10);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(C17978n.e(i10 + 1, length * 2));
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i10, t10);
        this.array = atomicReferenceArray2;
    }
}
