package gD;

import Ae.e;
import Il.a;
import aA.C13909a;
import cD.C14029a;
import cD.C14031c;
import cD.C14032d;
import eD.C14381b;
import eD.s;
import eD.u;
import eD.v;
import fD.C14446a;
import jD.C14627i;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C10242c;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LgD/a;", "", "a", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gD.a  reason: case insensitive filesystem */
public abstract class C14510a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3119a f127305a = new C3119a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LgD/a$a;", "", "<init>", "()V", "LaA/a;", "sessionManager", "LAe/e;", "analytics", "Lsf/c;", "appUserDataRepository", "Ltw/h;", "secureNetworkService", "LIl/a;", "appConfigApi", "LcD/a;", "a", "(LaA/a;LAe/e;Lsf/c;Ltw/h;LIl/a;)LcD/a;", "LcD/d;", "c", "(Ltw/h;)LcD/d;", "editProfileRepository", "LcD/c;", "b", "(LcD/a;)LcD/c;", "", "PROFILE_LIMITER_TIMEOUT_MINUTES", "J", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gD.a$a  reason: collision with other inner class name */
    public static final class C3119a {
        public /* synthetic */ C3119a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C14029a a(C13909a aVar, e eVar, C10242c cVar, h hVar, a aVar2) {
            C17542s.j(aVar, "sessionManager");
            C17542s.j(eVar, "analytics");
            C17542s.j(cVar, "appUserDataRepository");
            C17542s.j(hVar, "secureNetworkService");
            C17542s.j(aVar2, "appConfigApi");
            return new s((C14381b) hVar.b(C14381b.class), new C14627i(10, TimeUnit.MINUTES), aVar, cVar, aVar2, new C14446a(eVar));
        }

        public final C14031c b(C14029a aVar) {
            C17542s.j(aVar, "editProfileRepository");
            return aVar;
        }

        public final C14032d c(h hVar) {
            C17542s.j(hVar, "secureNetworkService");
            return new v((u) hVar.b(u.class));
        }

        private C3119a() {
        }
    }
}
