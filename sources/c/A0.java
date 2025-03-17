package C;

import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class A0 implements c.C0320c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5178a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5179b;

    public /* synthetic */ A0(AtomicReference atomicReference, String str) {
        this.f5178a = atomicReference;
        this.f5179b = str;
    }

    public final Object a(c.a aVar) {
        return this.f5178a.set(aVar);
    }
}
