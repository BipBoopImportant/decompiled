package U6;

import TJ.C16533h;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001b\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LU6/a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "LTJ/h;", "owner", "<init>", "(LTJ/h;)V", "LXH/N;", "a", "LTJ/h;", "getOwner", "()LTJ/h;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class a extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    private final C16533h<?> f40256a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(C16533h<?> hVar) {
        super("Flow was aborted, no more elements needed");
        C17542s.j(hVar, "owner");
        this.f40256a = hVar;
    }

    public final void a(C16533h<?> hVar) {
        C17542s.j(hVar, "owner");
        if (this.f40256a != hVar) {
            throw this;
        }
    }
}
