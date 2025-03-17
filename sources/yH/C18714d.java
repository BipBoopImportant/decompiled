package yH;

import BH.C15458c;
import EH.C15627l;
import EH.C15637v;
import EH.C15638w;
import LH.C16012b;
import dI.C17168i;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qH.C17777b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010!R\u0014\u0010$\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010&¨\u0006("}, d2 = {"LyH/d;", "LBH/c;", "LqH/b;", "call", "Lio/ktor/utils/io/g;", "content", "origin", "<init>", "(LqH/b;Lio/ktor/utils/io/g;LBH/c;)V", "a", "LqH/b;", "h0", "()LqH/b;", "b", "Lio/ktor/utils/io/g;", "()Lio/ktor/utils/io/g;", "c", "LBH/c;", "LdI/i;", "d", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "LEH/w;", "f", "()LEH/w;", "status", "LEH/v;", "g", "()LEH/v;", "version", "LLH/b;", "()LLH/b;", "requestTime", "e", "responseTime", "LEH/l;", "()LEH/l;", "headers", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: yH.d  reason: case insensitive filesystem */
public final class C18714d extends C15458c {

    /* renamed from: a  reason: collision with root package name */
    private final C17777b f152684a;

    /* renamed from: b  reason: collision with root package name */
    private final g f152685b;

    /* renamed from: c  reason: collision with root package name */
    private final C15458c f152686c;

    /* renamed from: d  reason: collision with root package name */
    private final C17168i f152687d;

    public C18714d(C17777b bVar, g gVar, C15458c cVar) {
        C17542s.j(bVar, "call");
        C17542s.j(gVar, "content");
        C17542s.j(cVar, "origin");
        this.f152684a = bVar;
        this.f152685b = gVar;
        this.f152686c = cVar;
        this.f152687d = cVar.getCoroutineContext();
    }

    public C15627l a() {
        return this.f152686c.a();
    }

    public g b() {
        return this.f152685b;
    }

    public C16012b c() {
        return this.f152686c.c();
    }

    public C16012b e() {
        return this.f152686c.e();
    }

    public C15638w f() {
        return this.f152686c.f();
    }

    public C15637v g() {
        return this.f152686c.g();
    }

    public C17168i getCoroutineContext() {
        return this.f152687d;
    }

    public C17777b h0() {
        return this.f152684a;
    }
}
