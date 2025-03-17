package EI;

/* renamed from: EI.b  reason: case insensitive filesystem */
public class C15643b implements C15642a {

    /* renamed from: a  reason: collision with root package name */
    private final C15649h f134221a;

    public C15643b(C15649h hVar) {
        if (hVar == null) {
            S(0);
        }
        this.f134221a = hVar;
    }

    private static /* synthetic */ void S(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 != 1 ? 3 : 2)];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i10 != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public C15649h getAnnotations() {
        C15649h hVar = this.f134221a;
        if (hVar == null) {
            S(1);
        }
        return hVar;
    }
}
