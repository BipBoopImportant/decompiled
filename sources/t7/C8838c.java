package t7;

import YH.X;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0012B\u001d\b\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\tJ\"\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lt7/c;", "", "", "", "parameters", "<init>", "(Ljava/util/Map;)V", "clientId", "c", "(Ljava/lang/String;)Lt7/c;", "grantType", "d", "refreshToken", "e", "key", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lt7/c;", "a", "()Ljava/util/Map;", "", "Ljava/util/Map;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t7.c  reason: case insensitive filesystem */
public final class C8838c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56657b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f56658a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lt7/c$a;", "", "<init>", "()V", "", "", "parameters", "Lt7/c;", "a", "(Ljava/util/Map;)Lt7/c;", "AUDIENCE_KEY", "Ljava/lang/String;", "CLIENT_ID_KEY", "CONNECTION_KEY", "GRANT_TYPE_AUTHORIZATION_CODE", "GRANT_TYPE_KEY", "GRANT_TYPE_MFA_OOB", "GRANT_TYPE_MFA_OTP", "GRANT_TYPE_MFA_RECOVERY_CODE", "GRANT_TYPE_PASSWORD", "GRANT_TYPE_PASSWORDLESS_OTP", "GRANT_TYPE_PASSWORD_REALM", "GRANT_TYPE_REFRESH_TOKEN", "GRANT_TYPE_TOKEN_EXCHANGE", "REALM_KEY", "REFRESH_TOKEN_KEY", "SCOPE_KEY", "SCOPE_OFFLINE_ACCESS", "SCOPE_OPENID", "SEND_KEY", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t7.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C8838c b(a aVar, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = new LinkedHashMap();
            }
            return aVar.a(map);
        }

        public final C8838c a(Map<String, String> map) {
            C17542s.j(map, "parameters");
            return new C8838c(map, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C8838c(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map<String, String> a() {
        return X.x(this.f56658a);
    }

    public final C8838c b(String str, String str2) {
        C17542s.j(str, "key");
        if (str2 == null) {
            this.f56658a.remove(str);
        } else {
            this.f56658a.put(str, str2);
        }
        return this;
    }

    public final C8838c c(String str) {
        C17542s.j(str, "clientId");
        return b("client_id", str);
    }

    public final C8838c d(String str) {
        C17542s.j(str, "grantType");
        return b("grant_type", str);
    }

    public final C8838c e(String str) {
        C17542s.j(str, "refreshToken");
        return b("refresh_token", str);
    }

    private C8838c(Map<String, String> map) {
        this.f56658a = X.z(map);
    }
}
