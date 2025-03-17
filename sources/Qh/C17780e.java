package qH;

import AH.C15411b;
import BH.C15458c;
import dI.C17164e;
import io.ktor.utils.io.d;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pH.C17746a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0014XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"LqH/e;", "LqH/b;", "LpH/a;", "client", "LAH/b;", "request", "LBH/c;", "response", "", "responseBody", "<init>", "(LpH/a;LAH/b;LBH/c;[B)V", "Lio/ktor/utils/io/g;", "g", "(LdI/e;)Ljava/lang/Object;", "h", "[B", "", "i", "Z", "b", "()Z", "allowDoubleReceive", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: qH.e  reason: case insensitive filesystem */
public final class C17780e extends C17777b {

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f146454h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f146455i = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17780e(C17746a aVar, C15411b bVar, C15458c cVar, byte[] bArr) {
        super(aVar);
        C17542s.j(aVar, "client");
        C17542s.j(bVar, "request");
        C17542s.j(cVar, "response");
        C17542s.j(bArr, "responseBody");
        this.f146454h = bArr;
        i(new C17781f(this, bVar));
        j(new C17782g(this, bArr, cVar));
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.f146455i;
    }

    /* access modifiers changed from: protected */
    public Object g(C17164e<? super g> eVar) {
        return d.a(this.f146454h);
    }
}
