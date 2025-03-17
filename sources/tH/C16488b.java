package TH;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: TH.b  reason: case insensitive filesystem */
public final /* synthetic */ class C16488b {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
