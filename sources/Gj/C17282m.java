package gJ;

import DI.C15555b;
import kotlin.jvm.internal.C17542s;

/* renamed from: gJ.m  reason: case insensitive filesystem */
public abstract class C17282m extends C17283n {
    public void b(C15555b bVar, C15555b bVar2) {
        C17542s.j(bVar, "first");
        C17542s.j(bVar2, "second");
        e(bVar, bVar2);
    }

    public void c(C15555b bVar, C15555b bVar2) {
        C17542s.j(bVar, "fromSuper");
        C17542s.j(bVar2, "fromCurrent");
        e(bVar, bVar2);
    }

    /* access modifiers changed from: protected */
    public abstract void e(C15555b bVar, C15555b bVar2);
}
