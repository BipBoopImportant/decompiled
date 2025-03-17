package AH;

import EH.C15627l;
import EH.C15637v;
import EH.C15638w;
import LH.C16011a;
import LH.C16012b;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0012\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b\u0016\u0010$R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006&"}, d2 = {"LAH/g;", "", "LEH/w;", "statusCode", "LLH/b;", "requestTime", "LEH/l;", "headers", "LEH/v;", "version", "body", "LdI/i;", "callContext", "<init>", "(LEH/w;LLH/b;LEH/l;LEH/v;Ljava/lang/Object;LdI/i;)V", "", "toString", "()Ljava/lang/String;", "a", "LEH/w;", "f", "()LEH/w;", "b", "LLH/b;", "d", "()LLH/b;", "c", "LEH/l;", "()LEH/l;", "LEH/v;", "g", "()LEH/v;", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "LdI/i;", "()LdI/i;", "responseTime", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: AH.g  reason: case insensitive filesystem */
public final class C15416g {

    /* renamed from: a  reason: collision with root package name */
    private final C15638w f132960a;

    /* renamed from: b  reason: collision with root package name */
    private final C16012b f132961b;

    /* renamed from: c  reason: collision with root package name */
    private final C15627l f132962c;

    /* renamed from: d  reason: collision with root package name */
    private final C15637v f132963d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f132964e;

    /* renamed from: f  reason: collision with root package name */
    private final C17168i f132965f;

    /* renamed from: g  reason: collision with root package name */
    private final C16012b f132966g = C16011a.b((Long) null, 1, (Object) null);

    public C15416g(C15638w wVar, C16012b bVar, C15627l lVar, C15637v vVar, Object obj, C17168i iVar) {
        C17542s.j(wVar, "statusCode");
        C17542s.j(bVar, "requestTime");
        C17542s.j(lVar, "headers");
        C17542s.j(vVar, "version");
        C17542s.j(obj, "body");
        C17542s.j(iVar, "callContext");
        this.f132960a = wVar;
        this.f132961b = bVar;
        this.f132962c = lVar;
        this.f132963d = vVar;
        this.f132964e = obj;
        this.f132965f = iVar;
    }

    public final Object a() {
        return this.f132964e;
    }

    public final C17168i b() {
        return this.f132965f;
    }

    public final C15627l c() {
        return this.f132962c;
    }

    public final C16012b d() {
        return this.f132961b;
    }

    public final C16012b e() {
        return this.f132966g;
    }

    public final C15638w f() {
        return this.f132960a;
    }

    public final C15637v g() {
        return this.f132963d;
    }

    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f132960a + ')';
    }
}
