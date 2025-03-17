package EJ;

import kotlin.jvm.internal.C17542s;

/* renamed from: EJ.d  reason: case insensitive filesystem */
public final class C15663d {
    public static final boolean a(Throwable th2) {
        C17542s.j(th2, "<this>");
        Class cls = th2.getClass();
        while (!C17542s.e(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable th2) {
        C17542s.j(th2, "e");
        throw th2;
    }
}
