package P9;

import O9.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import java.util.concurrent.atomic.AtomicReference;
import xa.C8970k;
import xa.C8971l;
import xa.C8974o;

public final /* synthetic */ class n implements C8970k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f39456a;

    public /* synthetic */ n(AtomicReference atomicReference) {
        this.f39456a = atomicReference;
    }

    public final C8971l then(Object obj) {
        Void voidR = (Void) obj;
        int i10 = v.f39471n;
        AtomicReference atomicReference = this.f39456a;
        return atomicReference.get() != null ? C8974o.f((g) atomicReference.get()) : C8974o.e(new b(Status.f47985h));
    }
}
