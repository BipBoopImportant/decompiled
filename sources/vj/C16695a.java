package VJ;

import QJ.C16294a;
import QJ.F0;
import XH.C16807N;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LVJ/a;", "T", "LQJ/a;", "Ljava/util/function/BiFunction;", "", "LXH/N;", "LdI/i;", "context", "Ljava/util/concurrent/CompletableFuture;", "future", "<init>", "(LdI/i;Ljava/util/concurrent/CompletableFuture;)V", "value", "exception", "f1", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "d1", "(Ljava/lang/Object;)V", "cause", "", "handled", "c1", "(Ljava/lang/Throwable;Z)V", "d", "Ljava/util/concurrent/CompletableFuture;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: VJ.a  reason: case insensitive filesystem */
final class C16695a<T> extends C16294a<T> implements BiFunction<T, Throwable, C16807N> {

    /* renamed from: d  reason: collision with root package name */
    private final CompletableFuture<T> f139430d;

    public C16695a(C17168i iVar, CompletableFuture<T> completableFuture) {
        super(iVar, true, true);
        this.f139430d = completableFuture;
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        f1(obj, (Throwable) obj2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void c1(Throwable th2, boolean z10) {
        this.f139430d.completeExceptionally(th2);
    }

    /* access modifiers changed from: protected */
    public void d1(T t10) {
        this.f139430d.complete(t10);
    }

    public void f1(T t10, Throwable th2) {
        F0.a.a(this, (CancellationException) null, 1, (Object) null);
    }
}
