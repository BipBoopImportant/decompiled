package vI;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LvI/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/lang/IllegalAccessException;", "cause", "<init>", "(Ljava/lang/IllegalAccessException;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vI.a  reason: case insensitive filesystem */
public final class C18188a extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18188a(IllegalAccessException illegalAccessException) {
        super(illegalAccessException);
        C17542s.j(illegalAccessException, "cause");
    }
}
