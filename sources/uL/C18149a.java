package uL;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18055d;
import vL.C18207b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"$\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"LuI/d;", "", "a", "(LuI/d;)Ljava/lang/String;", "b", "", "Ljava/util/Map;", "classNames", "koin-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: uL.a  reason: case insensitive filesystem */
public final class C18149a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<C18055d<?>, String> f148751a = C18207b.f149085a.f();

    public static final String a(C18055d<?> dVar) {
        C17542s.j(dVar, "<this>");
        String str = f148751a.get(dVar);
        return str == null ? b(dVar) : str;
    }

    public static final String b(C18055d<?> dVar) {
        C17542s.j(dVar, "<this>");
        String d10 = C18207b.f149085a.d(dVar);
        f148751a.put(dVar, d10);
        return d10;
    }
}
