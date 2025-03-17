package Zc;

import Zc.C9392a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

final class s extends PhantomReference implements C9392a.C1138a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f65135a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f65136b;

    /* synthetic */ s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, r rVar) {
        super(obj, referenceQueue);
        this.f65135a = set;
        this.f65136b = runnable;
    }

    public final void a() {
        if (this.f65135a.remove(this)) {
            clear();
            this.f65136b.run();
        }
    }
}
