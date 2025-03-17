package Zc;

import java.util.concurrent.Executor;
import mc.C10036b;

/* renamed from: Zc.d  reason: case insensitive filesystem */
public class C9395d {

    /* renamed from: a  reason: collision with root package name */
    private final C10036b f65089a;

    public C9395d(C10036b bVar) {
        this.f65089a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f65089a.get();
    }
}
