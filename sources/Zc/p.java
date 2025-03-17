package Zc;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReferenceQueue f65132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f65133b;

    public /* synthetic */ p(ReferenceQueue referenceQueue, Set set) {
        this.f65132a = referenceQueue;
        this.f65133b = set;
    }

    public final void run() {
        ReferenceQueue referenceQueue = this.f65132a;
        Set set = this.f65133b;
        while (!set.isEmpty()) {
            try {
                ((s) referenceQueue.remove()).a();
            } catch (InterruptedException unused) {
            }
        }
    }
}
