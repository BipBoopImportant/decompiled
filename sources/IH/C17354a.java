package iH;

import androidx.activity.j;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.i0;
import cH.C17062a;
import hH.C17327f;
import java.util.Map;
import mH.C17601d;

/* renamed from: iH.a  reason: case insensitive filesystem */
public final class C17354a {

    /* renamed from: iH.a$a  reason: collision with other inner class name */
    public interface C3501a {
        c a();
    }

    /* renamed from: iH.a$b */
    public interface b {
        c a();
    }

    /* renamed from: iH.a$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, Boolean> f143485a;

        /* renamed from: b  reason: collision with root package name */
        private final C17327f f143486b;

        c(Map<Class<?>, Boolean> map, C17327f fVar) {
            this.f143485a = map;
            this.f143486b = fVar;
        }

        private i0.c c(i0.c cVar) {
            return new C17356c(this.f143485a, (i0.c) C17601d.b(cVar), this.f143486b);
        }

        /* access modifiers changed from: package-private */
        public i0.c a(j jVar, i0.c cVar) {
            return c(cVar);
        }

        /* access modifiers changed from: package-private */
        public i0.c b(C5187o oVar, i0.c cVar) {
            return c(cVar);
        }
    }

    public static i0.c a(j jVar, i0.c cVar) {
        return ((C3501a) C17062a.a(jVar, C3501a.class)).a().a(jVar, cVar);
    }

    public static i0.c b(C5187o oVar, i0.c cVar) {
        return ((b) C17062a.a(oVar, b.class)).a().b(oVar, cVar);
    }
}
