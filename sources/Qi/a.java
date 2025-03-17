package qi;

import Ln.h;
import QJ.M;
import aA.C13909a;
import android.content.Context;
import com.ingka.ikea.app.providers.cart.db.CartItemDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nA.C14838a;
import si.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lqi/a;", "", "a", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1402a f76250a = new C1402a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqi/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LaA/a;", "sessionManager", "LnA/a;", "getUserIdFromTokenUseCase", "Lti/a;", "cartNetworkWrapper", "LLn/h;", "a", "(Landroid/content/Context;LaA/a;LnA/a;Lti/a;)LLn/h;", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qi.a$a  reason: collision with other inner class name */
    public static final class C1402a {
        public /* synthetic */ C1402a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(Context context, C13909a aVar, C14838a aVar2, ti.a aVar3) {
            C17542s.j(context, "context");
            C17542s.j(aVar, "sessionManager");
            C17542s.j(aVar2, "getUserIdFromTokenUseCase");
            C17542s.j(aVar3, "cartNetworkWrapper");
            return new b(aVar3, aVar, CartItemDatabase.f72301a.b(context), (M) null, aVar2, 8, (DefaultConstructorMarker) null);
        }

        private C1402a() {
        }
    }
}
