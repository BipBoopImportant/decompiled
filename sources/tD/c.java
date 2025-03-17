package Td;

import Ae.e;
import XH.C16796C;
import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LTd/c;", "LTd/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "hasFamilyPrivileges", "", "f", "(Ljava/lang/Boolean;)Ljava/lang/String;", "LTd/b;", "event", "", "", "values", "LXH/N;", "g", "(LTd/b;Ljava/util/Map;)V", "d", "(Ljava/lang/Boolean;)V", "reasonCode", "h", "(LTd/b;Ljava/lang/String;)V", "a", "LAe/e;", "getAnalytics", "()LAe/e;", "b", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f63887b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f63888c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f63889a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTd/c$a;", "", "<init>", "()V", "", "ACCOUNT_TYPE", "Ljava/lang/String;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f63889a = eVar;
    }

    private final String f(Boolean bool) {
        return (bool == null || !bool.booleanValue()) ? "regular" : "family";
    }

    public void d(Boolean bool) {
        this.f63889a.track(b.LOGOUT.b(), X.f(C16796C.a("account_type", f(bool))));
    }

    /* renamed from: g */
    public void b(b bVar, Map<String, ? extends Object> map) {
        C17542s.j(bVar, "event");
        this.f63889a.track(bVar.b(), map);
    }

    /* renamed from: h */
    public void e(b bVar, String str) {
        C17542s.j(bVar, "event");
        C17542s.j(str, "reasonCode");
        this.f63889a.track(bVar.b(), X.f(C16796C.a("reason_code", str)));
    }
}
