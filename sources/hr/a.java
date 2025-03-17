package Hr;

import GK.C15774B;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LHr/a;", "Ltw/a;", "<init>", "()V", "LGK/B;", "request", "", "token", "a", "(LGK/B;Ljava/lang/String;)LGK/B;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements tw.a {

    /* renamed from: a  reason: collision with root package name */
    private static final C1595a f81682a = new C1595a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LHr/a$a;", "", "<init>", "()V", "", "AUTHORIZATION_KEY", "Ljava/lang/String;", "AUTHORIZATION_VALUE", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hr.a$a  reason: collision with other inner class name */
    private static final class C1595a {
        public /* synthetic */ C1595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1595a() {
        }
    }

    public C15774B a(C15774B b10, String str) {
        C17542s.j(b10, "request");
        C17542s.j(str, "token");
        C15774B.a i10 = b10.i();
        String format = String.format("Bearer %s", Arrays.copyOf(new Object[]{str}, 1));
        C17542s.i(format, "format(...)");
        return i10.e("Authorization", format).b();
    }
}
