package q9;

/* renamed from: q9.b  reason: case insensitive filesystem */
public final class C8687b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i10, TInput tinput, C8686a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult apply;
        if (i10 < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            if (tinput == null || i10 - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            break;
        } while (i10 - 1 < 1);
        return apply;
    }
}
