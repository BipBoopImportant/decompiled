package uJ;

import DI.m0;
import DI.n0;
import EI.C15644c;
import kotlin.jvm.internal.C17542s;

/* renamed from: uJ.r0  reason: case insensitive filesystem */
public interface C18137r0 {

    /* renamed from: uJ.r0$a */
    public static final class a implements C18137r0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f147928a = new a();

        private a() {
        }

        public void a(J0 j02, C18096U u10, C18096U u11, n0 n0Var) {
            C17542s.j(j02, "substitutor");
            C17542s.j(u10, "unsubstitutedArgument");
            C17542s.j(u11, "argument");
            C17542s.j(n0Var, "typeParameter");
        }

        public void b(m0 m0Var) {
            C17542s.j(m0Var, "typeAlias");
        }

        public void c(C15644c cVar) {
            C17542s.j(cVar, "annotation");
        }

        public void d(m0 m0Var, n0 n0Var, C18096U u10) {
            C17542s.j(m0Var, "typeAlias");
            C17542s.j(u10, "substitutedArgument");
        }
    }

    void a(J0 j02, C18096U u10, C18096U u11, n0 n0Var);

    void b(m0 m0Var);

    void c(C15644c cVar);

    void d(m0 m0Var, n0 n0Var, C18096U u10);
}
