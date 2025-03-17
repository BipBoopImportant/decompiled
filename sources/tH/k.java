package tH;

import QJ.C16289G;
import VH.C16655b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LtH/k;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "LQJ/G;", "LVH/b;", "frame", "<init>", "(LVH/b;)V", "b", "()LtH/k;", "a", "LVH/b;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k extends IllegalArgumentException implements C16289G<k> {

    /* renamed from: a  reason: collision with root package name */
    private final C16655b f147312a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(C16655b bVar) {
        super("Unsupported frame type: " + bVar);
        C17542s.j(bVar, "frame");
        this.f147312a = bVar;
    }

    /* renamed from: b */
    public k a() {
        k kVar = new k(this.f147312a);
        kVar.initCause(this);
        return kVar;
    }
}
