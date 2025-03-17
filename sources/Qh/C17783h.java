package qH;

import FH.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LqH/h;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "LFH/d;", "content", "<init>", "(LFH/d;)V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: qH.h  reason: case insensitive filesystem */
public final class C17783h extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17783h(d dVar) {
        super("Failed to write body: " + P.b(dVar.getClass()));
        C17542s.j(dVar, "content");
    }
}
