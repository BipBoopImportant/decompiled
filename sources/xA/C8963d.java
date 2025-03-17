package xa;

/* renamed from: xa.d  reason: case insensitive filesystem */
public final class C8963d extends IllegalStateException {
    private C8963d(String str, Throwable th2) {
        super(str, th2);
    }

    public static IllegalStateException a(C8971l<?> lVar) {
        if (!lVar.p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception l10 = lVar.l();
        return new C8963d("Complete with: ".concat(l10 != null ? "failure" : lVar.q() ? "result ".concat(String.valueOf(lVar.m())) : lVar.o() ? "cancellation" : "unknown issue"), l10);
    }
}
