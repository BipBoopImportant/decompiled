package pH;

import XH.C16807N;
import YH.C16877v;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import sH.h;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t\"\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "LpH/b;", "LXH/N;", "block", "LpH/a;", "a", "(LnI/l;)LpH/a;", "", "LpH/c;", "Ljava/util/List;", "engines", "LsH/h;", "b", "LsH/h;", "FACTORY", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: pH.d  reason: case insensitive filesystem */
public final class C17749d {

    /* renamed from: a  reason: collision with root package name */
    private static final List<C17748c> f146335a;

    /* renamed from: b  reason: collision with root package name */
    private static final h<?> f146336b;

    static {
        h<?> a10;
        Class<C17748c> cls = C17748c.class;
        ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
        C17542s.i(load, "load(it, it.classLoader)");
        List<C17748c> t12 = C16877v.t1(load);
        f146335a = t12;
        C17748c cVar = (C17748c) C16877v.y0(t12);
        if (cVar == null || (a10 = cVar.a()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation in the classpath: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        f146336b = a10;
    }

    public static final C17746a a(C17642l<? super C17747b<?>, C16807N> lVar) {
        C17542s.j(lVar, "block");
        return C17750e.a(f146336b, lVar);
    }
}
