package Ex;

import android.content.Context;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0006B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0019"}, d2 = {"LEx/d;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "clientId", "c", "clientSecret", "d", "getTenantId", "tenantId", "e", "redirectUri", "f", "scope", "authorizationUrl", "tokenUrl", "g", "publishersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: g  reason: collision with root package name */
    public static final a f109475g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f109476a;

    /* renamed from: b  reason: collision with root package name */
    private final String f109477b = "1681cac1-7189-4f44-a7c9-50d2a4de7ea6";

    /* renamed from: c  reason: collision with root package name */
    private final String f109478c = "5128Q~6Bn45paVAMKymua66g61BpOXbAcLn7AcaZ";

    /* renamed from: d  reason: collision with root package name */
    private final String f109479d = "720b637a-655a-40cf-816a-f22f40755c2c";

    /* renamed from: e  reason: collision with root package name */
    private final String f109480e;

    /* renamed from: f  reason: collision with root package name */
    private final String f109481f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LEx/d$a;", "", "<init>", "()V", "", "REDIRECT_URI", "Ljava/lang/String;", "publishersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Context context) {
        C17542s.j(context, "context");
        this.f109476a = context;
        String format = String.format("https://accounts.ikea.com/android/%s/sso", Arrays.copyOf(new Object[]{context.getPackageName()}, 1));
        C17542s.i(format, "format(...)");
        this.f109480e = format;
        this.f109481f = "1681cac1-7189-4f44-a7c9-50d2a4de7ea6" + "/.default";
    }

    public final String a() {
        String str = this.f109479d;
        return "https://login.microsoftonline.com/" + str + "/oauth2/v2.0/authorize";
    }

    public final String b() {
        return this.f109477b;
    }

    public final String c() {
        return this.f109478c;
    }

    public final String d() {
        return this.f109480e;
    }

    public final String e() {
        return this.f109481f;
    }

    public final String f() {
        String str = this.f109479d;
        return "https://login.microsoftonline.com/" + str + "/oauth2/v2.0/token";
    }
}
