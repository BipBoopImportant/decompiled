package DI;

public interface i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f133841a = new a();

    static class a implements i0 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"}));
        }

        public j0 b() {
            j0 j0Var = j0.f133843a;
            if (j0Var == null) {
                d(0);
            }
            return j0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    j0 b();
}
