package NI;

import DI.C15555b;
import DI.C15558e;
import DI.n0;
import DI.u0;
import TI.r;
import java.util.Collections;
import java.util.List;
import uJ.C18096U;

public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f136570a = new a();

    static class a implements o {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public b a(r rVar, C15558e eVar, C18096U u10, C18096U u11, List<u0> list, List<n0> list2) {
            if (rVar == null) {
                c(0);
            }
            if (eVar == null) {
                c(1);
            }
            if (u10 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(u10, u11, list, list2, Collections.emptyList(), false);
        }

        public void b(C15555b bVar, List<String> list) {
            if (bVar == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C18096U f136571a;

        /* renamed from: b  reason: collision with root package name */
        private final C18096U f136572b;

        /* renamed from: c  reason: collision with root package name */
        private final List<u0> f136573c;

        /* renamed from: d  reason: collision with root package name */
        private final List<n0> f136574d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f136575e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f136576f;

        public b(C18096U u10, C18096U u11, List<u0> list, List<n0> list2, List<String> list3, boolean z10) {
            if (u10 == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f136571a = u10;
            this.f136572b = u11;
            this.f136573c = list;
            this.f136574d = list2;
            this.f136575e = list3;
            this.f136576f = z10;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3)];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public List<String> b() {
            List<String> list = this.f136575e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public C18096U c() {
            return this.f136572b;
        }

        public C18096U d() {
            C18096U u10 = this.f136571a;
            if (u10 == null) {
                a(4);
            }
            return u10;
        }

        public List<n0> e() {
            List<n0> list = this.f136574d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List<u0> f() {
            List<u0> list = this.f136573c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f136576f;
        }
    }

    b a(r rVar, C15558e eVar, C18096U u10, C18096U u11, List<u0> list, List<n0> list2);

    void b(C15555b bVar, List<String> list);
}
