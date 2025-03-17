package tw;

import GK.C15774B;
import GK.C15776D;
import GK.C15804w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ltw/d;", "LGK/w;", "<init>", "()V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f56768a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ltw/d$a;", "", "<init>", "()V", "", "REFERER_KEY", "Ljava/lang/String;", "APP_REFERER_URL", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        C15774B.a i10 = aVar.t().i();
        i10.a("Referer", "https://shop.api.ingka.ikea.com");
        return aVar.b(i10.b());
    }
}
