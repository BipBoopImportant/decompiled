package t7;

import GK.C15803v;
import com.auth0.android.request.internal.GsonAdapter;
import com.auth0.android.request.internal.g;
import com.auth0.android.request.internal.j;
import com.auth0.android.result.Credentials;
import com.google.gson.Gson;
import java.io.Reader;
import java.security.PublicKey;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s7.C8742a;
import s7.C8743b;
import t7.C8838c;
import w7.C8929b;
import w7.f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\u001bB'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0011J1\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0011\u0010$\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\"¨\u0006%"}, d2 = {"Lt7/a;", "", "Ls7/a;", "auth0", "Lcom/auth0/android/request/internal/j;", "Lt7/b;", "factory", "Lcom/google/gson/Gson;", "gson", "<init>", "(Ls7/a;Lcom/auth0/android/request/internal/j;Lcom/google/gson/Gson;)V", "(Ls7/a;)V", "", "refreshToken", "Lw7/f;", "Ljava/lang/Void;", "e", "(Ljava/lang/String;)Lw7/f;", "Lcom/auth0/android/result/Credentials;", "d", "authorizationCode", "codeVerifier", "redirectUri", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw7/f;", "", "Ljava/security/PublicKey;", "a", "()Lw7/f;", "Ls7/a;", "b", "Lcom/auth0/android/request/internal/j;", "c", "Lcom/google/gson/Gson;", "()Ljava/lang/String;", "clientId", "baseURL", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t7.a  reason: case insensitive filesystem */
public final class C8836a {

    /* renamed from: d  reason: collision with root package name */
    private static final C0908a f56647d = new C0908a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C8742a f56648a;

    /* renamed from: b  reason: collision with root package name */
    private final j<C8837b> f56649b;

    /* renamed from: c  reason: collision with root package name */
    private final Gson f56650c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b*\u0010\n¨\u0006+"}, d2 = {"Lt7/a$a;", "", "<init>", "()V", "Lw7/b;", "Lt7/b;", "b", "()Lw7/b;", "", "AUTHENTICATOR_ID_KEY", "Ljava/lang/String;", "BINDING_CODE_KEY", "CHALLENGE_PATH", "CHALLENGE_TYPE_KEY", "CHANGE_PASSWORD_PATH", "DB_CONNECTIONS_PATH", "EMAIL_CONNECTION", "EMAIL_KEY", "HEADER_AUTHORIZATION", "JWKS_FILE_PATH", "MFA_PATH", "MFA_TOKEN_KEY", "OAUTH_CODE_KEY", "OAUTH_PATH", "ONE_TIME_PASSWORD_KEY", "OUT_OF_BAND_CODE_KEY", "PASSWORDLESS_PATH", "PASSWORD_KEY", "PHONE_NUMBER_KEY", "RECOVERY_CODE_KEY", "REDIRECT_URI_KEY", "REVOKE_PATH", "SIGN_UP_PATH", "SMS_CONNECTION", "START_PATH", "SUBJECT_TOKEN_KEY", "SUBJECT_TOKEN_TYPE_KEY", "TOKEN_KEY", "TOKEN_PATH", "USERNAME_KEY", "USER_INFO_PATH", "USER_METADATA_KEY", "WELL_KNOWN_PATH", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t7.a$a  reason: collision with other inner class name */
    private static final class C0908a {

        @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J9\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"t7/a$a$a", "Lw7/b;", "Lt7/b;", "", "statusCode", "", "bodyText", "", "", "headers", "f", "(ILjava/lang/String;Ljava/util/Map;)Lt7/b;", "Ljava/io/Reader;", "reader", "e", "(ILjava/io/Reader;)Lt7/b;", "", "cause", "d", "(Ljava/lang/Throwable;)Lt7/b;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: t7.a$a$a  reason: collision with other inner class name */
        public static final class C0909a implements C8929b<C8837b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GsonAdapter<Map<String, Object>> f56651a;

            C0909a(GsonAdapter<Map<String, Object>> gsonAdapter) {
                this.f56651a = gsonAdapter;
            }

            /* renamed from: d */
            public C8837b b(Throwable th2) {
                C17542s.j(th2, "cause");
                return new C8837b("Something went wrong", (Exception) new C8743b("Something went wrong", th2));
            }

            /* renamed from: e */
            public C8837b a(int i10, Reader reader) {
                C17542s.j(reader, "reader");
                return new C8837b((Map<String, ? extends Object>) this.f56651a.a(reader), i10);
            }

            /* renamed from: f */
            public C8837b c(int i10, String str, Map<String, ? extends List<String>> map) {
                C17542s.j(str, "bodyText");
                C17542s.j(map, "headers");
                return new C8837b(str, i10);
            }
        }

        public /* synthetic */ C0908a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C8929b<C8837b> b() {
            return new C0909a(GsonAdapter.f46409b.a(g.f46454a.a()));
        }

        private C0908a() {
        }
    }

    public C8836a(C8742a aVar, j<C8837b> jVar, Gson gson) {
        C17542s.j(aVar, "auth0");
        C17542s.j(jVar, "factory");
        C17542s.j(gson, "gson");
        this.f56648a = aVar;
        this.f56649b = jVar;
        this.f56650c = gson;
        jVar.e(aVar.b().a());
    }

    public final f<Map<String, PublicKey>, C8837b> a() {
        C15803v e10 = C15803v.f135109k.d(this.f56648a.e()).k().c(".well-known").c("jwks.json").e();
        return this.f56649b.b(e10.toString(), GsonAdapter.f46409b.b(PublicKey.class, this.f56650c));
    }

    public final String b() {
        return this.f56648a.e();
    }

    public final String c() {
        return this.f56648a.d();
    }

    public final f<Credentials, C8837b> d(String str) {
        C17542s.j(str, "refreshToken");
        Map<String, String> a10 = C8838c.a.b(C8838c.f56657b, (Map) null, 1, (Object) null).c(c()).e(str).d("refresh_token").a();
        C15803v e10 = C15803v.f135109k.d(this.f56648a.e()).k().c("oauth").c("token").e();
        return this.f56649b.d(e10.toString(), new GsonAdapter(Credentials.class, this.f56650c)).b(a10);
    }

    public final f<Void, C8837b> e(String str) {
        C17542s.j(str, "refreshToken");
        return this.f56649b.c(C15803v.f135109k.d(this.f56648a.e()).k().c("oauth").c("revoke").e().toString()).b(C8838c.a.b(C8838c.f56657b, (Map) null, 1, (Object) null).c(c()).b("token", str).a());
    }

    public final f<Credentials, C8837b> f(String str, String str2, String str3) {
        C17542s.j(str, "authorizationCode");
        C17542s.j(str2, "codeVerifier");
        C17542s.j(str3, "redirectUri");
        Map<String, String> a10 = C8838c.a.b(C8838c.f56657b, (Map) null, 1, (Object) null).c(c()).d("authorization_code").b("code", str).b("redirect_uri", str3).b("code_verifier", str2).a();
        C15803v e10 = C15803v.f135109k.d(this.f56648a.e()).k().c("oauth").c("token").e();
        f<T, C8837b> d10 = this.f56649b.d(e10.toString(), new GsonAdapter(Credentials.class, this.f56650c));
        d10.b(a10);
        return d10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8836a(C8742a aVar) {
        this(aVar, new j(aVar.f(), f56647d.b()), g.f46454a.a());
        C17542s.j(aVar, "auth0");
    }
}
