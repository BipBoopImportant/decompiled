package rk;

import Ae.e;
import XH.C16796C;
import YH.X;
import jk.C11423a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrk/a;", "Lrk/b;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "storeId", "itemNo", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "a", "LAe/e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rk.a  reason: case insensitive filesystem */
public final class C11828a implements C11829b {

    /* renamed from: a  reason: collision with root package name */
    private final e f102029a;

    public C11828a(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f102029a = eVar;
    }

    public void a(String str, String str2) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "itemNo");
        this.f102029a.o(X.m(C16796C.a("store_id", str), C16796C.a("item_id", str2)), C11423a.f98576a.b());
    }

    public void b(String str, String str2) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "itemNo");
        this.f102029a.o(X.m(C16796C.a("store_id", str), C16796C.a("item_id", str2)), C11423a.f98576a.c());
    }

    public void c(String str, String str2) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "itemNo");
        e.c.b(this.f102029a, C11423a.f98576a.d(), (String) null, X.m(C16796C.a("store_id", str), C16796C.a("item_id", str2)), (e.b) null, 10, (Object) null);
    }
}
