package s7;

import GK.C15803v;
import HJ.C15854t;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import w7.C8928a;
import w7.C8932e;
import y7.C8991a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\nB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Ls7/a;", "", "", "clientId", "domain", "configurationDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "url", "LGK/v;", "a", "(Ljava/lang/String;)LGK/v;", "e", "()Ljava/lang/String;", "Ljava/lang/String;", "d", "b", "LGK/v;", "domainUrl", "c", "configurationUrl", "Ly7/a;", "Ly7/a;", "()Ly7/a;", "setAuth0UserAgent", "(Ly7/a;)V", "auth0UserAgent", "Lw7/e;", "Lw7/e;", "f", "()Lw7/e;", "setNetworkingClient", "(Lw7/e;)V", "networkingClient", "authorizeUrl", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s7.a  reason: case insensitive filesystem */
public class C8742a {

    /* renamed from: f  reason: collision with root package name */
    private static final C0907a f55992f = new C0907a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f55993a;

    /* renamed from: b  reason: collision with root package name */
    private final C15803v f55994b;

    /* renamed from: c  reason: collision with root package name */
    private final C15803v f55995c;

    /* renamed from: d  reason: collision with root package name */
    private C8991a f55996d;

    /* renamed from: e  reason: collision with root package name */
    private C8932e f55997e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls7/a$a;", "", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s7.a$a  reason: collision with other inner class name */
    private static final class C0907a {
        public /* synthetic */ C0907a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0907a() {
        }
    }

    public C8742a(String str, String str2, String str3) {
        C17542s.j(str, "clientId");
        C17542s.j(str2, "domain");
        this.f55993a = str;
        this.f55997e = new C8928a(0, 0, (Map) null, false, 15, (DefaultConstructorMarker) null);
        C15803v a10 = a(str2);
        this.f55994b = a10;
        if (a10 != null) {
            C15803v a11 = a(str3);
            this.f55995c = a11 != null ? a11 : a10;
            this.f55996d = new C8991a();
            return;
        }
        V v10 = V.f144353a;
        String format = String.format("Invalid domain url: '%s'", Arrays.copyOf(new Object[]{str2}, 1));
        C17542s.i(format, "format(format, *args)");
        throw new IllegalArgumentException(format.toString());
    }

    private final C15803v a(String str) {
        if (str == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        C17542s.i(locale, "ROOT");
        String lowerCase = str.toLowerCase(locale);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!C15854t.W(lowerCase, "http://", false, 2, (Object) null)) {
            if (!C15854t.W(lowerCase, "https://", false, 2, (Object) null)) {
                lowerCase = "https://" + lowerCase;
            }
            return C15803v.f135109k.f(lowerCase);
        }
        throw new IllegalArgumentException(("Invalid domain url: '" + str + "'. Only HTTPS domain URLs are supported. If no scheme is passed, HTTPS will be used.").toString());
    }

    public final C8991a b() {
        return this.f55996d;
    }

    public String c() {
        C15803v vVar = this.f55994b;
        C17542s.g(vVar);
        return vVar.k().a("authorize").e().toString();
    }

    public final String d() {
        return this.f55993a;
    }

    public final String e() {
        return String.valueOf(this.f55994b);
    }

    public final C8932e f() {
        return this.f55997e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8742a(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
