package ox;

import Il.a;
import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import px.C14927a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lox/a;", "Lpx/a;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "", "cardNumber", "", "b", "(Ljava/lang/String;)Z", "d", "pin", "c", "a", "LIl/a;", "()Z", "hasConfig", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ox.a  reason: case insensitive filesystem */
public final class C14900a implements C14927a {

    /* renamed from: a  reason: collision with root package name */
    private final a f130162a;

    public C14900a(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f130162a = aVar;
    }

    public boolean a() {
        return this.f130162a.q() != null;
    }

    public boolean b(String str) {
        C17542s.j(str, "cardNumber");
        GiftCardConfiguration q10 = this.f130162a.q();
        return b.e(str, q10 != null ? q10.a() : null);
    }

    public boolean c(String str) {
        C17542s.j(str, "pin");
        GiftCardConfiguration q10 = this.f130162a.q();
        if (q10 != null) {
            return b.c(str, q10.b());
        }
        return true;
    }

    public boolean d(String str) {
        C17542s.j(str, "cardNumber");
        GiftCardConfiguration q10 = this.f130162a.q();
        if (q10 != null) {
            return b.c(str, q10.a());
        }
        return true;
    }
}
