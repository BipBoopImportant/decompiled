package K8;

import I8.f;
import L8.a;
import L8.c;
import L8.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y8.C8993b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LK8/b;", "LI8/f;", "LL8/e;", "urlProcessor", "LL8/a;", "eventCompressor", "LL8/c;", "encryptor", "<init>", "(LL8/e;LL8/a;LL8/c;)V", "Ly8/b;", "rawEvent", "a", "(Ly8/b;)Ly8/b;", "LL8/e;", "b", "LL8/a;", "c", "LL8/c;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final e f37756a;

    /* renamed from: b  reason: collision with root package name */
    private final a f37757b;

    /* renamed from: c  reason: collision with root package name */
    private final c f37758c;

    public b(e eVar, a aVar, c cVar) {
        C17542s.j(eVar, "urlProcessor");
        C17542s.j(aVar, "eventCompressor");
        C17542s.j(cVar, "encryptor");
        this.f37756a = eVar;
        this.f37757b = aVar;
        this.f37758c = cVar;
    }

    public C8993b a(C8993b bVar) {
        C17542s.j(bVar, "rawEvent");
        if (bVar.C() < 400) {
            return null;
        }
        return this.f37758c.a(this.f37757b.a(this.f37756a.a(bVar)));
    }
}
