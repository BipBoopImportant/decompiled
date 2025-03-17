package zI;

import DI.i0;
import MI.C16047H;
import MI.C16048I;
import VI.C16692x;
import YH.C16877v;
import cJ.C17065b;
import cJ.C17066c;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.K;

/* renamed from: zI.a  reason: case insensitive filesystem */
public final class C18751a {

    /* renamed from: a  reason: collision with root package name */
    public static final C18751a f152800a = new C18751a();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<C17065b> f152801b;

    /* renamed from: c  reason: collision with root package name */
    private static final C17065b f152802c;

    /* renamed from: zI.a$a  reason: collision with other inner class name */
    public static final class C4332a implements C16692x.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f152803a;

        C4332a(K k10) {
            this.f152803a = k10;
        }

        public void a() {
        }

        public C16692x.a c(C17065b bVar, i0 i0Var) {
            C17542s.j(bVar, "classId");
            C17542s.j(i0Var, "source");
            if (!C17542s.e(bVar, C16047H.f136284a.a())) {
                return null;
            }
            this.f152803a.f144344a = true;
            return null;
        }
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C17065b.a aVar = C17065b.f141241d;
        for (C17066c c10 : C16877v.q(C16048I.f136289a, C16048I.f136300l, C16048I.f136301m, C16048I.f136292d, C16048I.f136294f, C16048I.f136297i)) {
            linkedHashSet.add(aVar.c(c10));
        }
        f152801b = linkedHashSet;
        C17065b.a aVar2 = C17065b.f141241d;
        C17066c cVar = C16048I.f136298j;
        C17542s.i(cVar, "REPEATABLE_ANNOTATION");
        f152802c = aVar2.c(cVar);
    }

    private C18751a() {
    }

    public final C17065b a() {
        return f152802c;
    }

    public final Set<C17065b> b() {
        return f152801b;
    }

    public final boolean c(C16692x xVar) {
        C17542s.j(xVar, "klass");
        K k10 = new K();
        xVar.c(new C4332a(k10), (byte[]) null);
        return k10.f144344a;
    }
}
