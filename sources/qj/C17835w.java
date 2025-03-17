package qJ;

import DI.C15555b;
import DI.C15558e;
import java.util.List;

/* renamed from: qJ.w  reason: case insensitive filesystem */
public interface C17835w {

    /* renamed from: a  reason: collision with root package name */
    public static final C17835w f146610a = new a();

    /* renamed from: qJ.w$a */
    static class a implements C17835w {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(C15555b bVar) {
            if (bVar == null) {
                c(2);
            }
        }

        public void b(C15558e eVar, List<String> list) {
            if (eVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(C15555b bVar);

    void b(C15558e eVar, List<String> list);
}
