package II;

import AI.C15435p;
import TI.C16503g;
import VI.C16690v;
import bJ.C17046e;
import cJ.C17065b;
import cJ.C17066c;
import java.io.InputStream;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rJ.C17856a;
import rJ.C17859d;

/* renamed from: II.g  reason: case insensitive filesystem */
public final class C15898g implements C16690v {

    /* renamed from: a  reason: collision with root package name */
    private final ClassLoader f135486a;

    /* renamed from: b  reason: collision with root package name */
    private final C17859d f135487b = new C17859d();

    public C15898g(ClassLoader classLoader) {
        C17542s.j(classLoader, "classLoader");
        this.f135486a = classLoader;
    }

    private final C16690v.a d(String str) {
        C15897f a10;
        Class<?> a11 = C15896e.a(this.f135486a, str);
        if (a11 == null || (a10 = C15897f.f135483c.a(a11)) == null) {
            return null;
        }
        return new C16690v.a.b(a10, (byte[]) null, 2, (DefaultConstructorMarker) null);
    }

    public InputStream a(C17066c cVar) {
        C17542s.j(cVar, "packageFqName");
        if (!cVar.h(C15435p.f133048z)) {
            return null;
        }
        return this.f135487b.a(C17856a.f146679r.r(cVar));
    }

    public C16690v.a b(C16503g gVar, C17046e eVar) {
        String a10;
        C17542s.j(gVar, "javaClass");
        C17542s.j(eVar, "jvmMetadataVersion");
        C17066c f10 = gVar.f();
        if (f10 == null || (a10 = f10.a()) == null) {
            return null;
        }
        return d(a10);
    }

    public C16690v.a c(C17065b bVar, C17046e eVar) {
        C17542s.j(bVar, "classId");
        C17542s.j(eVar, "jvmMetadataVersion");
        return d(C15899h.b(bVar));
    }
}
