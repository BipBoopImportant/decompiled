package a9;

import F8.g;
import java.util.ArrayList;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

public final class I4 implements N5, S1 {

    /* renamed from: a  reason: collision with root package name */
    public final g f42069a;

    /* renamed from: b  reason: collision with root package name */
    public final L3 f42070b;

    public I4(g gVar) {
        L3 l32 = new L3();
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(l32, "mutationDetector");
        this.f42069a = gVar;
        this.f42070b = l32;
    }

    public final void a() {
        L3 l32 = this.f42070b;
        synchronized (l32) {
            try {
                C9036b bVar = l32.f42127a;
                if (bVar != null) {
                    C9036b.f58523D.d(bVar);
                }
                l32.f42127a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(C9036b bVar) {
        C17542s.j(bVar, "viewLight");
        bVar.Z(this.f42069a.r(bVar.p()));
        bVar.a0(this.f42069a.r(bVar.q()));
        bVar.j0(this.f42069a.r(bVar.w()));
        bVar.T(this.f42069a.r(bVar.l()));
        for (C9036b b10 : bVar.h()) {
            b(b10);
        }
    }

    public final ArrayList c(C9036b bVar, long j10) {
        C17542s.j(bVar, "viewLight");
        b(bVar);
        return this.f42070b.a(bVar, j10);
    }
}
