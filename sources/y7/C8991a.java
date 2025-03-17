package y7;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.auth0.android.request.internal.g;
import com.optimizely.ab.config.FeatureVariable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\nB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR.\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u001a"}, d2 = {"Ly7/a;", "", "", "name", "version", "libraryVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getVersion", "", "c", "Ljava/util/Map;", "getEnvironment", "()Ljava/util/Map;", "getEnvironment$annotations", "environment", "d", "value", "e", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y7.a  reason: case insensitive filesystem */
public final class C8991a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0935a f57985e = new C0935a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f57986a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57987b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f57988c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57989d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Ly7/a$a;", "", "<init>", "()V", "", "ANDROID_KEY", "Ljava/lang/String;", "ENV_KEY", "HEADER_NAME", "LIBRARY_VERSION_KEY", "NAME_KEY", "VERSION_KEY", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y7.a$a  reason: collision with other inner class name */
    public static final class C0935a {
        public /* synthetic */ C0935a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0935a() {
        }
    }

    public C8991a(String str, String str2, String str3) {
        C17542s.j(str, "name");
        C17542s.j(str2, "version");
        this.f57986a = TextUtils.isEmpty(str) ? "Auth0.Android" : str;
        this.f57987b = TextUtils.isEmpty(str2) ? "2.11.0" : str2;
        HashMap hashMap = new HashMap();
        hashMap.put("android", String.valueOf(Build.VERSION.SDK_INT));
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("auth0.android", str3);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(hashMap);
        C17542s.i(unmodifiableMap, "unmodifiableMap(tmpEnv)");
        this.f57988c = unmodifiableMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", str);
        hashMap2.put("version", str2);
        hashMap2.put("env", unmodifiableMap);
        String w10 = g.f46454a.a().w(hashMap2);
        C17542s.i(w10, FeatureVariable.JSON_TYPE);
        Charset charset = StandardCharsets.UTF_8;
        C17542s.i(charset, "UTF_8");
        byte[] bytes = w10.getBytes(charset);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] encode = Base64.encode(bytes, 10);
        C17542s.i(encode, "encode(bytes, Base64.URL_SAFE or Base64.NO_WRAP)");
        C17542s.i(charset, "UTF_8");
        this.f57989d = new String(encode, charset);
    }

    public final String a() {
        return this.f57989d;
    }

    public C8991a() {
        this("Auth0.Android", "2.11.0");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8991a(String str, String str2) {
        this(str, str2, (String) null);
        C17542s.j(str, "name");
        C17542s.j(str2, "version");
    }
}
