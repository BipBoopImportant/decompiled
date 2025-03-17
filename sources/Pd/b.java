package Pd;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPd/b;", "LPd/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "flagKey", "ruleKey", "variationKey", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eventName", "", "", "values", "a", "(Ljava/lang/String;Ljava/util/Map;)V", "LAe/e;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62738b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final e f62739a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPd/b$a;", "", "<init>", "()V", "", "ANALYTICS_EVENT_PREFIX", "Ljava/lang/String;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f62739a = eVar;
    }

    public void a(String str, Map<String, ? extends Object> map) {
        C17542s.j(str, "eventName");
        e eVar = this.f62739a;
        eVar.track("OPTI_" + str, map);
    }

    public void b(String str, String str2, String str3) {
        C17542s.j(str, "flagKey");
        C17542s.j(str2, "ruleKey");
        C17542s.j(str3, "variationKey");
        e.c.c(this.f62739a, j.OPTIMIZELY.b(), X.m(C16796C.a("ab_test_flag", str), C16796C.a("ab_test_rule", str2), C16796C.a("ab_test_variant", str3)), Interaction$Component.OPTIMIZELY_USER_BUCKETED, (e.b) null, 8, (Object) null);
    }
}
