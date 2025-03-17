package C;

import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class y0 implements c.C0320c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5462a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5463b;

    public /* synthetic */ y0(AtomicReference atomicReference, String str) {
        this.f5462a = atomicReference;
        this.f5463b = str;
    }

    public final Object a(c.a aVar) {
        return this.f5462a.set(aVar);
    }
}
