package NI;

import DI.C15558e;
import DI.C15565l;
import DI.a0;
import DI.h0;
import TI.C16503g;
import TI.l;
import TI.n;
import TI.q;
import cJ.C17066c;

public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f136563a = new a();

    static class a implements j {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(l lVar, C15565l lVar2) {
            if (lVar == null) {
                f(3);
            }
            if (lVar2 == null) {
                f(4);
            }
        }

        public void b(C16503g gVar, C15558e eVar) {
            if (gVar == null) {
                f(7);
            }
            if (eVar == null) {
                f(8);
            }
        }

        public void c(n nVar, a0 a0Var) {
            if (nVar == null) {
                f(5);
            }
            if (a0Var == null) {
                f(6);
            }
        }

        public void d(q qVar, h0 h0Var) {
            if (qVar == null) {
                f(1);
            }
            if (h0Var == null) {
                f(2);
            }
        }

        public C15558e e(C17066c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }
    }

    void a(l lVar, C15565l lVar2);

    void b(C16503g gVar, C15558e eVar);

    void c(n nVar, a0 a0Var);

    void d(q qVar, h0 h0Var);

    C15558e e(C17066c cVar);
}
