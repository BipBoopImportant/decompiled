package Gn;

import GK.C15786e;
import GK.z;
import java.util.List;
import jm.C11429a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGn/a;", "", "a", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1580a f81182a = C1580a.f81183a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LGn/a$a;", "", "<init>", "()V", "Ljm/a;", "backendUrls", "Ltw/h;", "networkService", "LIf/a;", "a", "(Ljm/a;Ltw/h;)LIf/a;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gn.a$a  reason: collision with other inner class name */
    public static final class C1580a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C1580a f81183a = new C1580a();

        private C1580a() {
        }

        public final If.a a(C11429a aVar, h hVar) {
            C17542s.j(aVar, "backendUrls");
            C17542s.j(hVar, "networkService");
            z.a b10 = hVar.a().H().b(new In.a());
            String a10 = aVar.a();
            return (If.a) new Jf.a(a10 + "/checkout/v6/cart/", b10, (C15786e.a) null, (List) null, (List) null, 28, (DefaultConstructorMarker) null).h(If.a.class);
        }
    }
}
