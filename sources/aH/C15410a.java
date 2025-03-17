package AH;

import EH.C15612Q;
import EH.C15627l;
import EH.C15636u;
import FH.d;
import JH.C15955b;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qH.C17777b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\b\u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"LAH/a;", "LAH/b;", "LqH/b;", "call", "LAH/d;", "data", "<init>", "(LqH/b;LAH/d;)V", "a", "LqH/b;", "h0", "()LqH/b;", "LEH/u;", "b", "LEH/u;", "U", "()LEH/u;", "method", "LEH/Q;", "c", "LEH/Q;", "getUrl", "()LEH/Q;", "url", "LFH/d;", "d", "LFH/d;", "getContent", "()LFH/d;", "content", "LEH/l;", "e", "LEH/l;", "()LEH/l;", "headers", "LJH/b;", "f", "LJH/b;", "getAttributes", "()LJH/b;", "attributes", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: AH.a  reason: case insensitive filesystem */
public class C15410a implements C15411b {

    /* renamed from: a  reason: collision with root package name */
    private final C17777b f132932a;

    /* renamed from: b  reason: collision with root package name */
    private final C15636u f132933b;

    /* renamed from: c  reason: collision with root package name */
    private final C15612Q f132934c;

    /* renamed from: d  reason: collision with root package name */
    private final d f132935d;

    /* renamed from: e  reason: collision with root package name */
    private final C15627l f132936e;

    /* renamed from: f  reason: collision with root package name */
    private final C15955b f132937f;

    public C15410a(C17777b bVar, C15413d dVar) {
        C17542s.j(bVar, "call");
        C17542s.j(dVar, "data");
        this.f132932a = bVar;
        this.f132933b = dVar.f();
        this.f132934c = dVar.h();
        this.f132935d = dVar.b();
        this.f132936e = dVar.e();
        this.f132937f = dVar.a();
    }

    public C15636u U() {
        return this.f132933b;
    }

    public C15627l a() {
        return this.f132936e;
    }

    public C15955b getAttributes() {
        return this.f132937f;
    }

    public C17168i getCoroutineContext() {
        return h0().getCoroutineContext();
    }

    public C15612Q getUrl() {
        return this.f132934c;
    }

    public C17777b h0() {
        return this.f132932a;
    }
}
