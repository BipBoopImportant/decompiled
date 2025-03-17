package UB;

import Ae.e;
import UB.C13716a;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LUB/b;", "LUB/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "storeId", "LUB/a$a;", "componentValue", "LXH/N;", "a", "(Ljava/lang/String;LUB/a$a;)V", "LAe/e;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UB.b  reason: case insensitive filesystem */
public final class C13717b implements C13716a {

    /* renamed from: a  reason: collision with root package name */
    private final e f116994a;

    public C13717b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f116994a = eVar;
    }

    public void a(String str, C13716a.C2873a aVar) {
        C17542s.j(str, "storeId");
        C17542s.j(aVar, "componentValue");
        e.c.b(this.f116994a, Interaction$Component.STORE_DETAILS_SMALL_STORE_EXPAND, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("component_value", aVar.b())), (e.b) null, 10, (Object) null);
    }
}
