package BH;

import AH.C15416g;
import EH.C15627l;
import EH.C15637v;
import EH.C15638w;
import LH.C16012b;
import dI.C17168i;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qH.C17777b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!R\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u001f\u0010!R\u001a\u0010'\u001a\u00020$8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\r\u0010&R\u001a\u0010,\u001a\u00020(8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\b\u0010+¨\u0006-"}, d2 = {"LBH/a;", "LBH/c;", "LqH/b;", "call", "LAH/g;", "responseData", "<init>", "(LqH/b;LAH/g;)V", "a", "LqH/b;", "h0", "()LqH/b;", "LdI/i;", "b", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "LEH/w;", "c", "LEH/w;", "f", "()LEH/w;", "status", "LEH/v;", "d", "LEH/v;", "g", "()LEH/v;", "version", "LLH/b;", "e", "LLH/b;", "()LLH/b;", "requestTime", "responseTime", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/g;", "()Lio/ktor/utils/io/g;", "content", "LEH/l;", "h", "LEH/l;", "()LEH/l;", "headers", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: BH.a  reason: case insensitive filesystem */
public final class C15456a extends C15458c {

    /* renamed from: a  reason: collision with root package name */
    private final C17777b f133227a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f133228b;

    /* renamed from: c  reason: collision with root package name */
    private final C15638w f133229c;

    /* renamed from: d  reason: collision with root package name */
    private final C15637v f133230d;

    /* renamed from: e  reason: collision with root package name */
    private final C16012b f133231e;

    /* renamed from: f  reason: collision with root package name */
    private final C16012b f133232f;

    /* renamed from: g  reason: collision with root package name */
    private final g f133233g;

    /* renamed from: h  reason: collision with root package name */
    private final C15627l f133234h;

    public C15456a(C17777b bVar, C15416g gVar) {
        C17542s.j(bVar, "call");
        C17542s.j(gVar, "responseData");
        this.f133227a = bVar;
        this.f133228b = gVar.b();
        this.f133229c = gVar.f();
        this.f133230d = gVar.g();
        this.f133231e = gVar.d();
        this.f133232f = gVar.e();
        Object a10 = gVar.a();
        g gVar2 = a10 instanceof g ? (g) a10 : null;
        this.f133233g = gVar2 == null ? g.f143712a.a() : gVar2;
        this.f133234h = gVar.c();
    }

    public C15627l a() {
        return this.f133234h;
    }

    public g b() {
        return this.f133233g;
    }

    public C16012b c() {
        return this.f133231e;
    }

    public C16012b e() {
        return this.f133232f;
    }

    public C15638w f() {
        return this.f133229c;
    }

    public C15637v g() {
        return this.f133230d;
    }

    public C17168i getCoroutineContext() {
        return this.f133228b;
    }

    public C17777b h0() {
        return this.f133227a;
    }
}
