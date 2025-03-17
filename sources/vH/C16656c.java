package VH;

import RH.j;
import RH.k;
import RH.n;
import RH.q;
import RH.t;
import TH.C16492f;
import VH.C16655b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVH/b$b;", "LVH/a;", "a", "(LVH/b$b;)LVH/a;", "ktor-websockets"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: VH.c  reason: case insensitive filesystem */
public final class C16656c {
    public static final C16654a a(C16655b.C3411b bVar) {
        C17542s.j(bVar, "<this>");
        if (bVar.b().length < 2) {
            return null;
        }
        j jVar = new j((C16492f) null, 1, (DefaultConstructorMarker) null);
        try {
            t.d(jVar, bVar.b(), 0, 0, 6, (Object) null);
            k t02 = jVar.t0();
            return new C16654a(q.a(t02), n.K0(t02, 0, 0, 3, (Object) null));
        } catch (Throwable th2) {
            jVar.J();
            throw th2;
        }
    }
}
