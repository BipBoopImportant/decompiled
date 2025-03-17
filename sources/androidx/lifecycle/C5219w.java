package androidx.lifecycle;

import QJ.C16311i0;
import QJ.F0;
import QJ.b1;
import d0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/r;", "Landroidx/lifecycle/s;", "a", "(Landroidx/lifecycle/r;)Landroidx/lifecycle/s;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.w  reason: case insensitive filesystem */
public final class C5219w {
    public static final C5215s a(r rVar) {
        C5216t tVar;
        C17542s.j(rVar, "<this>");
        do {
            C5216t tVar2 = (C5216t) rVar.f().get();
            if (tVar2 != null) {
                return tVar2;
            }
            tVar = new C5216t(rVar, b1.b((F0) null, 1, (Object) null).plus(C16311i0.c().P0()));
        } while (!i.a(rVar.f(), (Object) null, tVar));
        tVar.b();
        return tVar;
    }
}
