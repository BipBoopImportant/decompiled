package qH;

import BH.C15458c;
import EH.C15627l;
import EH.C15637v;
import EH.C15638w;
import LH.C16012b;
import QJ.C16283A;
import QJ.F0;
import dI.C17168i;
import io.ktor.utils.io.d;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 R\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010&\u001a\u00020#8\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\t\u0010%R\u001a\u0010+\u001a\u00020'8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R \u00102\u001a\u00020,8\u0016X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b\u000e\u0010/¨\u00063"}, d2 = {"LqH/g;", "LBH/c;", "LqH/e;", "call", "", "body", "origin", "<init>", "(LqH/e;[BLBH/c;)V", "a", "LqH/e;", "h", "()LqH/e;", "LQJ/A;", "b", "LQJ/A;", "context", "LEH/w;", "c", "LEH/w;", "f", "()LEH/w;", "status", "LEH/v;", "d", "LEH/v;", "g", "()LEH/v;", "version", "LLH/b;", "e", "LLH/b;", "()LLH/b;", "requestTime", "responseTime", "LEH/l;", "LEH/l;", "()LEH/l;", "headers", "LdI/i;", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "Lio/ktor/utils/io/g;", "i", "Lio/ktor/utils/io/g;", "()Lio/ktor/utils/io/g;", "getContent$annotations", "()V", "content", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: qH.g  reason: case insensitive filesystem */
public final class C17782g extends C15458c {

    /* renamed from: a  reason: collision with root package name */
    private final C17780e f146458a;

    /* renamed from: b  reason: collision with root package name */
    private final C16283A f146459b;

    /* renamed from: c  reason: collision with root package name */
    private final C15638w f146460c;

    /* renamed from: d  reason: collision with root package name */
    private final C15637v f146461d;

    /* renamed from: e  reason: collision with root package name */
    private final C16012b f146462e;

    /* renamed from: f  reason: collision with root package name */
    private final C16012b f146463f;

    /* renamed from: g  reason: collision with root package name */
    private final C15627l f146464g;

    /* renamed from: h  reason: collision with root package name */
    private final C17168i f146465h;

    /* renamed from: i  reason: collision with root package name */
    private final g f146466i;

    public C17782g(C17780e eVar, byte[] bArr, C15458c cVar) {
        C17542s.j(eVar, "call");
        C17542s.j(bArr, "body");
        C17542s.j(cVar, "origin");
        this.f146458a = eVar;
        C16283A b10 = J0.b((F0) null, 1, (Object) null);
        this.f146459b = b10;
        this.f146460c = cVar.f();
        this.f146461d = cVar.g();
        this.f146462e = cVar.c();
        this.f146463f = cVar.e();
        this.f146464g = cVar.a();
        this.f146465h = cVar.getCoroutineContext().plus(b10);
        this.f146466i = d.a(bArr);
    }

    public C15627l a() {
        return this.f146464g;
    }

    public g b() {
        return this.f146466i;
    }

    public C16012b c() {
        return this.f146462e;
    }

    public C16012b e() {
        return this.f146463f;
    }

    public C15638w f() {
        return this.f146460c;
    }

    public C15637v g() {
        return this.f146461d;
    }

    public C17168i getCoroutineContext() {
        return this.f146465h;
    }

    /* renamed from: h */
    public C17780e h0() {
        return this.f146458a;
    }
}
