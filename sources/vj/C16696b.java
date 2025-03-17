package VJ;

import QJ.C16293K;
import QJ.Q;
import QJ.T;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "LQJ/Q;", "LdI/i;", "context", "LQJ/T;", "start", "Lkotlin/Function2;", "LdI/e;", "", "block", "Ljava/util/concurrent/CompletableFuture;", "a", "(LQJ/Q;LdI/i;LQJ/T;LnI/p;)Ljava/util/concurrent/CompletableFuture;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: VJ.b  reason: case insensitive filesystem */
public final class C16696b {
    public static final <T> CompletableFuture<T> a(Q q10, C17168i iVar, T t10, p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar) {
        if (!t10.j()) {
            C17168i j10 = C16293K.j(q10, iVar);
            CompletableFuture<T> completableFuture = new CompletableFuture<>();
            C16695a aVar = new C16695a(j10, completableFuture);
            completableFuture.handle(aVar);
            aVar.e1(t10, aVar, pVar);
            return completableFuture;
        }
        throw new IllegalArgumentException((t10 + " start is not supported").toString());
    }

    public static /* synthetic */ CompletableFuture b(Q q10, C17168i iVar, T t10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i10 & 2) != 0) {
            t10 = T.DEFAULT;
        }
        return a(q10, iVar, t10, pVar);
    }
}
