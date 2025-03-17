package Ho;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"LHo/a;", "LGo/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()Ljava/lang/String;", "b", "c", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sharedPreferences", "Ljava/lang/String;", "sessionId", "clientidentity-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Go.a {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f81659a;

    /* renamed from: b  reason: collision with root package name */
    private final String f81660b;

    public a(Context context) {
        C17542s.j(context, "context");
        this.f81659a = context.getSharedPreferences("ClientIdentityPrefs", 0);
        String uuid = UUID.randomUUID().toString();
        C17542s.i(uuid, "toString(...)");
        this.f81660b = uuid;
    }

    private final String a() {
        String uuid = UUID.randomUUID().toString();
        C17542s.i(uuid, "toString(...)");
        Charset charset = StandardCharsets.UTF_8;
        C17542s.i(charset, "UTF_8");
        byte[] bytes = uuid.getBytes(charset);
        C17542s.i(bytes, "getBytes(...)");
        this.f81659a.edit().putString("installation_id", Base64.encodeToString(bytes, 0)).apply();
        return uuid;
    }

    public String b() {
        return this.f81660b;
    }

    public String c() {
        String string = this.f81659a.getString("installation_id", (String) null);
        if (string == null) {
            return a();
        }
        byte[] decode = Base64.decode(string, 0);
        C17542s.i(decode, "decode(...)");
        Charset charset = StandardCharsets.UTF_8;
        C17542s.i(charset, "UTF_8");
        return new String(decode, charset);
    }
}
