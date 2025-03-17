package qJ;

import DI.C15544O;
import DI.C15545P;
import DI.C15549U;
import cJ.C17065b;
import kotlin.jvm.internal.C17542s;

/* renamed from: qJ.q  reason: case insensitive filesystem */
public final class C17829q implements C17822j {

    /* renamed from: a  reason: collision with root package name */
    private final C15545P f146599a;

    public C17829q(C15545P p10) {
        C17542s.j(p10, "packageFragmentProvider");
        this.f146599a = p10;
    }

    public C17821i a(C17065b bVar) {
        C17821i a10;
        C17542s.j(bVar, "classId");
        for (C15544O next : C15549U.c(this.f146599a, bVar.f())) {
            if ((next instanceof C17830r) && (a10 = ((C17830r) next).H0().a(bVar)) != null) {
                return a10;
            }
        }
        return null;
    }
}
