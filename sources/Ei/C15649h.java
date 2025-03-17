package EI;

import YH.C16877v;
import cJ.C17066c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

/* renamed from: EI.h  reason: case insensitive filesystem */
public interface C15649h extends Iterable<C15644c>, C17693a {

    /* renamed from: V  reason: collision with root package name */
    public static final a f134231V = a.f134232a;

    /* renamed from: EI.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f134232a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C15649h f134233b = new C3304a();

        /* renamed from: EI.h$a$a  reason: collision with other inner class name */
        public static final class C3304a implements C15649h {
            C3304a() {
            }

            public Void b(C17066c cVar) {
                C17542s.j(cVar, "fqName");
                return null;
            }

            public boolean f2(C17066c cVar) {
                return b.b(this, cVar);
            }

            public boolean isEmpty() {
                return true;
            }

            public Iterator<C15644c> iterator() {
                return C16877v.n().iterator();
            }

            public String toString() {
                return "EMPTY";
            }

            public /* bridge */ /* synthetic */ C15644c v(C17066c cVar) {
                return (C15644c) b(cVar);
            }
        }

        private a() {
        }

        public final C15649h a(List<? extends C15644c> list) {
            C17542s.j(list, "annotations");
            return list.isEmpty() ? f134233b : new C15650i(list);
        }

        public final C15649h b() {
            return f134233b;
        }
    }

    /* renamed from: EI.h$b */
    public static final class b {
        public static C15644c a(C15649h hVar, C17066c cVar) {
            Object obj;
            C17542s.j(cVar, "fqName");
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((C15644c) obj).f(), cVar)) {
                    break;
                }
            }
            return (C15644c) obj;
        }

        public static boolean b(C15649h hVar, C17066c cVar) {
            C17542s.j(cVar, "fqName");
            return hVar.v(cVar) != null;
        }
    }

    boolean f2(C17066c cVar);

    boolean isEmpty();

    C15644c v(C17066c cVar);
}
