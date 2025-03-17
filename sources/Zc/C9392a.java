package Zc;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Zc.a  reason: case insensitive filesystem */
public class C9392a {

    /* renamed from: a  reason: collision with root package name */
    private final ReferenceQueue f65085a = new ReferenceQueue();

    /* renamed from: b  reason: collision with root package name */
    private final Set f65086b = Collections.synchronizedSet(new HashSet());

    /* renamed from: Zc.a$a  reason: collision with other inner class name */
    public interface C1138a {
        void a();
    }

    private C9392a() {
    }

    public static C9392a a() {
        C9392a aVar = new C9392a();
        aVar.b(aVar, q.f65134a);
        Thread thread = new Thread(new p(aVar.f65085a, aVar.f65086b), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    public C1138a b(Object obj, Runnable runnable) {
        s sVar = new s(obj, this.f65085a, this.f65086b, runnable, (r) null);
        this.f65086b.add(sVar);
        return sVar;
    }
}
