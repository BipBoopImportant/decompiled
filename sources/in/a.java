package In;

import GK.C15776D;
import GK.C15804w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LIn/a;", "LGK/w;", "<init>", "()V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    public static final C1604a f81943a = new C1604a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LIn/a$a;", "", "<init>", "()V", "", "CAAS_CLIENT_ID_HEADER", "Ljava/lang/String;", "CAAS_CLIENT_ID_VALUE", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: In.a$a  reason: collision with other inner class name */
    public static final class C1604a {
        public /* synthetic */ C1604a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1604a() {
        }
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        return aVar.b(aVar.t().i().a("X-Client-Id", "ikea-app").b());
    }
}
