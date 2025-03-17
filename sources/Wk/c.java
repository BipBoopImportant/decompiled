package Wk;

import Vk.b;
import Wk.e;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\f\u0010\rJB\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0012\u001a\u00020\u0006H@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LWk/c;", "LWk/b;", "LVk/b;", "availabilityRemoteDataSource", "<init>", "(LVk/b;)V", "", "productNumber", "postalCode", "areaCode", "storeId", "LWk/e;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "productNumbers", "b", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "itemNo", "LWk/e$a$b;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LVk/b;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f88883a;

    public c(b bVar) {
        C17542s.j(bVar, "availabilityRemoteDataSource");
        this.f88883a = bVar;
    }

    public Object a(String str, C17164e<? super List<e.a.b>> eVar) {
        return this.f88883a.a(str, eVar);
    }

    public Object b(List<String> list, String str, String str2, String str3, C17164e<? super List<e>> eVar) {
        return this.f88883a.c(list, str, str2, str3, false, eVar);
    }

    public Object c(String str, String str2, String str3, String str4, C17164e<? super e> eVar) {
        return this.f88883a.b(str, str2, str3, str4, true, eVar);
    }
}
