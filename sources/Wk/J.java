package WK;

import com.google.ar.core.ImageMetadata;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LWK/J;", "", "<init>", "()V", "LWK/I;", "c", "()LWK/I;", "segment", "LXH/N;", "b", "(LWK/I;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "LWK/I;", "LOCK", "d", "HASH_BUCKET_COUNT", "", "e", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f139617a = new J();

    /* renamed from: b  reason: collision with root package name */
    private static final int f139618b = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;

    /* renamed from: c  reason: collision with root package name */
    private static final I f139619c = new I(new byte[0], 0, 0, false, false);

    /* renamed from: d  reason: collision with root package name */
    private static final int f139620d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<I>[] f139621e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f139620d = highestOneBit;
        AtomicReference<I>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f139621e = atomicReferenceArr;
    }

    private J() {
    }

    private final AtomicReference<I> a() {
        return f139621e[(int) (Thread.currentThread().getId() & (((long) f139620d) - 1))];
    }

    public static final void b(I i10) {
        AtomicReference<I> a10;
        I i11;
        I andSet;
        C17542s.j(i10, "segment");
        if (i10.f139615f != null || i10.f139616g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!i10.f139613d && (andSet = a10.getAndSet(i11)) != (i11 = f139619c)) {
            int i12 = andSet != null ? andSet.f139612c : 0;
            if (i12 >= f139618b) {
                a10.set(andSet);
                return;
            }
            i10.f139615f = andSet;
            i10.f139611b = 0;
            i10.f139612c = i12 + 8192;
            (a10 = f139617a.a()).set(i10);
        }
    }

    public static final I c() {
        AtomicReference<I> a10 = f139617a.a();
        I i10 = f139619c;
        I andSet = a10.getAndSet(i10);
        if (andSet == i10) {
            return new I();
        }
        if (andSet == null) {
            a10.set((Object) null);
            return new I();
        }
        a10.set(andSet.f139615f);
        andSet.f139615f = null;
        andSet.f139612c = 0;
        return andSet;
    }
}
