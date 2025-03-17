package BJ;

import BJ.C15472g;
import DI.C15579z;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: BJ.b  reason: case insensitive filesystem */
public abstract class C15467b {
    public final C15472g a(C15579z zVar) {
        C17542s.j(zVar, "functionDescriptor");
        for (C15473h next : b()) {
            if (next.b(zVar)) {
                return next.a(zVar);
            }
        }
        return C15472g.a.f133310b;
    }

    public abstract List<C15473h> b();
}
