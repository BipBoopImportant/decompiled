package fD;

import Ae.d;
import Ae.e;
import XH.C16796C;
import YH.X;
import dD.C14339a;
import dD.C14340b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LfD/a;", "LdD/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LdD/b;", "event", "", "", "", "values", "LXH/N;", "f", "(LdD/b;Ljava/util/Map;)V", "reasonCode", "g", "(LdD/b;Ljava/lang/String;)V", "c", "(Ljava/lang/String;)V", "a", "LAe/e;", "b", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fD.a  reason: case insensitive filesystem */
public final class C14446a implements C14339a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3108a f126886b = new C3108a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final e f126887a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LfD/a$a;", "", "<init>", "()V", "", "ACCOUNT_TYPE", "Ljava/lang/String;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fD.a$a  reason: collision with other inner class name */
    public static final class C3108a {
        public /* synthetic */ C3108a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3108a() {
        }
    }

    public C14446a(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f126887a = eVar;
    }

    public void c(String str) {
        C17542s.j(str, "reasonCode");
        e.c.a(this.f126887a, "sign_up", d.SYS_ERROR, str, (Map) null, 8, (Object) null);
    }

    /* renamed from: f */
    public void b(C14340b bVar, Map<String, ? extends Object> map) {
        C17542s.j(bVar, "event");
        this.f126887a.track(bVar.b(), map);
    }

    /* renamed from: g */
    public void e(C14340b bVar, String str) {
        C17542s.j(bVar, "event");
        C17542s.j(str, "reasonCode");
        this.f126887a.track(bVar.b(), X.f(C16796C.a("reason_code", str)));
    }
}
