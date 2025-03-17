package JB;

import GB.C12917b;
import GB.h;
import HB.C12962b;
import dI.C17164e;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"LJB/f;", "LHB/b;", "LJB/e;", "storeDetailsRemoteDataSource", "<init>", "(LJB/e;)V", "", "storeId", "LGB/h;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "date", "LGB/b;", "b", "(Ljava/lang/String;Ljava/time/LocalDate;LdI/e;)Ljava/lang/Object;", "LJB/e;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JB.f  reason: case insensitive filesystem */
public final class C13067f implements C12962b {

    /* renamed from: a  reason: collision with root package name */
    private final C13066e f111203a;

    public C13067f(C13066e eVar) {
        C17542s.j(eVar, "storeDetailsRemoteDataSource");
        this.f111203a = eVar;
    }

    public Object a(String str, C17164e<? super h> eVar) {
        return this.f111203a.a(str, eVar);
    }

    public Object b(String str, LocalDate localDate, C17164e<? super C12917b> eVar) {
        return this.f111203a.b(str, localDate, eVar);
    }
}
