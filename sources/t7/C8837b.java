package t7;

import android.text.TextUtils;
import android.util.Log;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import s7.C8743b;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u0005\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0005\u0010\fB\u001b\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010B'\b\u0017\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0011\u0010$\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010#¨\u0006&"}, d2 = {"Lt7/b;", "Ls7/b;", "", "code", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "(Ljava/lang/String;Ljava/lang/Exception;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V", "payload", "", "statusCode", "(Ljava/lang/String;I)V", "", "", "values", "(Ljava/util/Map;I)V", "LXH/N;", "e", "()V", "a", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "c", "<set-?>", "d", "I", "()I", "Ljava/util/Map;", "", "()Z", "isPasswordNotStrongEnough", "f", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t7.b  reason: case insensitive filesystem */
public final class C8837b extends C8743b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f56652f = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private String f56653b;

    /* renamed from: c  reason: collision with root package name */
    private String f56654c;

    /* renamed from: d  reason: collision with root package name */
    private int f56655d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, ? extends Object> f56656e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lt7/b$a;", "", "<init>", "()V", "", "CODE_KEY", "Ljava/lang/String;", "DEFAULT_MESSAGE", "DESCRIPTION_KEY", "ERROR_DESCRIPTION_KEY", "ERROR_KEY", "ERROR_OIDC_ACCESS_TOKEN", "ERROR_OIDC_RO", "ERROR_VALUE_AUTHENTICATION_CANCELED", "NAME_KEY", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t7.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8837b(String str, String str2) {
        this("An error occurred when trying to authenticate with the server.", (Exception) null, 2, (DefaultConstructorMarker) null);
        C17542s.j(str, "code");
        C17542s.j(str2, "description");
        this.f56653b = str;
        this.f56654c = str2;
    }

    private final void e() {
        if (!C17542s.e("invalid_request", a())) {
            return;
        }
        if (C17542s.e("OIDC conformant clients cannot use /oauth/access_token", b()) || C17542s.e("OIDC conformant clients cannot use /oauth/ro", b())) {
            Log.w(C8836a.class.getSimpleName(), "Your Auth0 Application is configured as 'OIDC Conformant' but this instance it's not. To authenticate you will need to enable the flag by calling Auth0#setOIDCConformant(true) on the Auth0 instance you used in the setup.");
        }
    }

    public final String a() {
        String str = this.f56653b;
        if (str == null) {
            return "a0.sdk.internal_error.unknown";
        }
        C17542s.g(str);
        return str;
    }

    public final String b() {
        if (!TextUtils.isEmpty(this.f56654c)) {
            String str = this.f56654c;
            C17542s.g(str);
            return str;
        } else if (!C17542s.e("a0.sdk.internal_error.unknown", a())) {
            return "Failed with unknown error";
        } else {
            V v10 = V.f144353a;
            String format = String.format("Received error with code %s", Arrays.copyOf(new Object[]{a()}, 1));
            C17542s.i(format, "format(format, *args)");
            return format;
        }
    }

    public final int c() {
        return this.f56655d;
    }

    public final boolean d() {
        if (C17542s.e("invalid_password", this.f56653b)) {
            Map<String, ? extends Object> map = this.f56656e;
            C17542s.g(map);
            if (C17542s.e("PasswordStrengthError", map.get("name"))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8837b(String str, Exception exc) {
        super(str, exc);
        C17542s.j(str, "message");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8837b(String str, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : exc);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8837b(String str, String str2, Exception exc) {
        this("An error occurred when trying to authenticate with the server.", exc);
        C17542s.j(str, "code");
        C17542s.j(str2, "description");
        C17542s.j(exc, "cause");
        this.f56653b = str;
        this.f56654c = str2;
    }

    public C8837b(String str, int i10) {
        this("An error occurred when trying to authenticate with the server.", (Exception) null, 2, (DefaultConstructorMarker) null);
        this.f56653b = str != null ? "a0.sdk.internal_error.plain" : "a0.sdk.internal_error.empty";
        this.f56654c = str == null ? "Empty response body" : str;
        this.f56655d = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8837b(Map<String, ? extends Object> map, int i10) {
        this("An error occurred when trying to authenticate with the server.", (Exception) null, 2, (DefaultConstructorMarker) null);
        C17542s.j(map, "values");
        this.f56655d = i10;
        this.f56656e = map;
        String str = UiComponentContainer.RESULT_ERROR;
        String str2 = (String) map.get(!map.containsKey(str) ? "code" : str);
        this.f56653b = str2 == null ? "a0.sdk.internal_error.unknown" : str2;
        if (!map.containsKey("description")) {
            this.f56654c = (String) map.get("error_description");
            e();
            return;
        }
        Object obj = map.get("description");
        if (obj instanceof String) {
            this.f56654c = (String) obj;
        } else if ((obj instanceof Map) && d()) {
            this.f56654c = new C8839d((Map) obj).d();
        }
    }
}
