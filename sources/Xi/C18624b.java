package xI;

import XH.x;
import XH.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "LxI/a;", "a", "(LnI/l;)LxI/a;", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.b  reason: case insensitive filesystem */
public final class C18624b {
    static {
        Object obj;
        try {
            x.a aVar = x.f139812b;
            obj = x.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        if (x.h(obj)) {
            Class cls = (Class) obj;
            obj = Boolean.TRUE;
        }
        Object b10 = x.b(obj);
        Boolean bool = Boolean.FALSE;
        if (x.g(b10)) {
            b10 = bool;
        }
        ((Boolean) b10).booleanValue();
    }

    public static final <V> C18622a<V> a(C17642l<? super Class<?>, ? extends V> lVar) {
        C17542s.j(lVar, "compute");
        return new C18638i(lVar);
    }
}
