package com.auth0.android.provider;

import HJ.C15854t;
import YH.X;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.auth0.android.request.internal.Jwt;
import com.auth0.android.request.internal.i;
import com.auth0.android.result.Credentials;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import s7.C8742a;
import s7.C8743b;
import t7.C8836a;
import t7.C8837b;
import u7.C8884a;
import v7.k;
import v7.x;
import v7.y;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001@BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00130\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u00020\u00152\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001f2\u0006\u0010 \u001a\u00020\t2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u00152\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001fH\u0002¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u00152\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001f2\u0006\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J+\u0010(\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\t2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b3\u00104J%\u00108\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u0010 \u001a\u00020\t2\u0006\u00107\u001a\u00020.¢\u0006\u0004\b8\u00109J!\u0010:\u001a\u00020\u00152\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b:\u0010%J\u0017\u0010=\u001a\u00020\r2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010BR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010CR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u00107\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010XR$\u0010_\u001a\u00020S2\u0006\u0010Z\u001a\u00020S8@@AX\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006`"}, d2 = {"Lcom/auth0/android/provider/l;", "Lcom/auth0/android/provider/n;", "Ls7/a;", "account", "Lu7/a;", "Lcom/auth0/android/result/Credentials;", "Lt7/b;", "callback", "", "", "parameters", "Lcom/auth0/android/provider/i;", "ctOptions", "", "launchAsTwa", "<init>", "(Ls7/a;Lu7/a;Ljava/util/Map;Lcom/auth0/android/provider/i;Z)V", "idToken", "Ljava/lang/Void;", "Ls7/b;", "validationCallback", "LXH/N;", "n", "(Ljava/lang/String;Lu7/a;)V", "errorValue", "errorDescription", "m", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/net/Uri;", "o", "()Landroid/net/Uri;", "", "redirectUri", "headers", "k", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "l", "(Ljava/util/Map;)V", "j", "(Ljava/util/Map;Ljava/lang/String;)V", "p", "(Ljava/lang/String;Ljava/util/Map;)V", "Lcom/auth0/android/provider/m;", "pkce", "u", "(Lcom/auth0/android/provider/m;)V", "", "leeway", "t", "(Ljava/lang/Integer;)V", "issuer", "s", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "requestCode", "v", "(Landroid/content/Context;Ljava/lang/String;I)V", "r", "Lcom/auth0/android/provider/c;", "result", "b", "(Lcom/auth0/android/provider/c;)Z", "exception", "a", "(Lt7/b;)V", "Ls7/a;", "Lu7/a;", "c", "Z", "d", "Ljava/util/Map;", "e", "f", "Lcom/auth0/android/provider/i;", "Lt7/a;", "g", "Lt7/a;", "apiClient", "h", "I", "i", "Lcom/auth0/android/provider/m;", "", "Ljava/lang/Long;", "_currentTimeInMillis", "Ljava/lang/Integer;", "idTokenVerificationLeeway", "Ljava/lang/String;", "idTokenVerificationIssuer", "value", "q", "()J", "setCurrentTimeInMillis$auth0_release", "(J)V", "currentTimeInMillis", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends n {

    /* renamed from: m  reason: collision with root package name */
    public static final a f46359m = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final String f46360n = l.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final C8742a f46361a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C8884a<Credentials, C8837b> f46362b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f46363c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f46364d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f46365e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final i f46366f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C8836a f46367g;

    /* renamed from: h  reason: collision with root package name */
    private int f46368h;

    /* renamed from: i  reason: collision with root package name */
    private m f46369i;

    /* renamed from: j  reason: collision with root package name */
    private Long f46370j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Integer f46371k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public String f46372l;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u0014\u0010 \u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u0014\u0010\"\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u0014\u0010#\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u0014\u0010$\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b$\u0010\u0010R\u0014\u0010%\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u0014\u0010&\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b&\u0010\u0010R\u0014\u0010'\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b'\u0010\u0010R\u0014\u0010(\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b(\u0010\u0010R\u001c\u0010*\u001a\n )*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010¨\u0006+"}, d2 = {"Lcom/auth0/android/provider/l$a;", "", "<init>", "()V", "", "c", "()Ljava/lang/String;", "requestState", "responseState", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "defaultValue", "b", "(Ljava/lang/String;)Ljava/lang/String;", "DEFAULT_SCOPE", "Ljava/lang/String;", "ERROR_VALUE_ACCESS_DENIED", "ERROR_VALUE_ID_TOKEN_VALIDATION_FAILED", "ERROR_VALUE_INVALID_CONFIGURATION", "ERROR_VALUE_LOGIN_REQUIRED", "ERROR_VALUE_UNAUTHORIZED", "KEY_AUTH0_CLIENT_INFO", "KEY_CLIENT_ID", "KEY_CODE", "KEY_CODE_CHALLENGE", "KEY_CODE_CHALLENGE_METHOD", "KEY_CONNECTION", "KEY_ERROR", "KEY_ERROR_DESCRIPTION", "KEY_INVITATION", "KEY_MAX_AGE", "KEY_NONCE", "KEY_ORGANIZATION", "KEY_REDIRECT_URI", "KEY_RESPONSE_TYPE", "KEY_SCOPE", "KEY_STATE", "METHOD_SHA_256", "REQUIRED_SCOPE", "RESPONSE_TYPE_CODE", "kotlin.jvm.PlatformType", "TAG", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String c() {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            String encodeToString = Base64.encodeToString(bArr, 11);
            C17542s.i(encodeToString, "encodeToString(\n        ….NO_PADDING\n            )");
            return encodeToString;
        }

        public final void a(String str, String str2) {
            C17542s.j(str, "requestState");
            if (!C17542s.e(str, str2)) {
                String i10 = l.f46360n;
                V v10 = V.f144353a;
                String format = String.format("Received state doesn't match. Received %s but expected %s", Arrays.copyOf(new Object[]{str2, str}, 2));
                C17542s.i(format, "format(format, *args)");
                Log.e(i10, format);
                throw new C8837b("access_denied", "The received state is invalid. Try again.");
            }
        }

        public final String b(String str) {
            return str == null ? c() : str;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/auth0/android/provider/l$b", "Lu7/a;", "Lcom/auth0/android/provider/o;", "Lv7/x;", "error", "LXH/N;", "c", "(Lv7/x;)V", "result", "d", "(Lcom/auth0/android/provider/o;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements C8884a<o, x> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8884a<Void, C8743b> f46373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f46374b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Jwt f46375c;

        b(C8884a<Void, C8743b> aVar, l lVar, Jwt jwt) {
            this.f46373a = aVar;
            this.f46374b = lVar;
            this.f46375c = jwt;
        }

        /* renamed from: c */
        public void b(x xVar) {
            C17542s.j(xVar, UiComponentContainer.RESULT_ERROR);
            this.f46373a.b(xVar);
        }

        /* renamed from: d */
        public void a(o oVar) {
            C17542s.j(oVar, "result");
            String f10 = this.f46374b.f46372l;
            C17542s.g(f10);
            j jVar = new j(f10, this.f46374b.f46367g.c(), oVar);
            String str = (String) this.f46374b.f46364d.get("max_age");
            if (!TextUtils.isEmpty(str)) {
                C17542s.g(str);
                jVar.k(Integer.valueOf(str));
            }
            jVar.j(this.f46374b.f46371k);
            jVar.l((String) this.f46374b.f46364d.get("nonce"));
            jVar.i(new Date(this.f46374b.q()));
            jVar.m((String) this.f46374b.f46364d.get("organization"));
            try {
                new k().a(this.f46375c, jVar, true);
                this.f46373a.a(null);
            } catch (x e10) {
                this.f46373a.b(e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/auth0/android/provider/l$c", "Lu7/a;", "Lcom/auth0/android/result/Credentials;", "Lt7/b;", "credentials", "LXH/N;", "d", "(Lcom/auth0/android/result/Credentials;)V", "error", "c", "(Lt7/b;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements C8884a<Credentials, C8837b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f46376a;

        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/auth0/android/provider/l$c$a", "Lu7/a;", "Ljava/lang/Void;", "Ls7/b;", "result", "LXH/N;", "c", "(Ljava/lang/Void;)V", "error", "b", "(Ls7/b;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements C8884a<Void, C8743b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f46377a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Credentials f46378b;

            a(l lVar, Credentials credentials) {
                this.f46377a = lVar;
                this.f46378b = credentials;
            }

            public void b(C8743b bVar) {
                C17542s.j(bVar, UiComponentContainer.RESULT_ERROR);
                this.f46377a.f46362b.b(new C8837b("Could not verify the ID token", (Exception) bVar));
            }

            /* renamed from: c */
            public void a(Void voidR) {
                this.f46377a.f46362b.a(this.f46378b);
            }
        }

        c(l lVar) {
            this.f46376a = lVar;
        }

        /* renamed from: c */
        public void b(C8837b bVar) {
            C17542s.j(bVar, UiComponentContainer.RESULT_ERROR);
            if (C17542s.e("Unauthorized", bVar.b())) {
                String str = m.f46379f;
                Log.e(str, "Unable to complete authentication with PKCE. PKCE support can be enabled by setting Application Type to 'Native' and Token Endpoint Authentication Method to 'None' for this app at 'https://manage.auth0.com/#/applications/" + this.f46376a.f46367g.c() + "/settings'.");
            }
            this.f46376a.f46362b.b(bVar);
        }

        /* renamed from: d */
        public void a(Credentials credentials) {
            C17542s.j(credentials, "credentials");
            this.f46376a.n(credentials.c(), new a(this.f46376a, credentials));
        }
    }

    public l(C8742a aVar, C8884a<Credentials, C8837b> aVar2, Map<String, String> map, i iVar, boolean z10) {
        C17542s.j(aVar, "account");
        C17542s.j(aVar2, "callback");
        C17542s.j(map, "parameters");
        C17542s.j(iVar, "ctOptions");
        this.f46361a = aVar;
        this.f46362b = aVar2;
        this.f46363c = z10;
        Map<String, String> z11 = X.z(map);
        this.f46364d = z11;
        z11.put("response_type", "code");
        this.f46367g = new C8836a(aVar);
        this.f46366f = iVar;
    }

    private final void j(Map<String, String> map, String str) {
        map.put("auth0Client", this.f46361a.b().a());
        map.put("client_id", this.f46361a.d());
        map.put("redirect_uri", str);
    }

    private final void k(Map<String, String> map, String str, Map<String, String> map2) {
        p(str, map2);
        m mVar = this.f46369i;
        C17542s.g(mVar);
        String a10 = mVar.a();
        C17542s.i(a10, "codeChallenge");
        map.put("code_challenge", a10);
        map.put("code_challenge_method", "S256");
        Log.v(f46360n, "Using PKCE authentication flow");
    }

    private final void l(Map<String, String> map) {
        a aVar = f46359m;
        String b10 = aVar.b(map.get("state"));
        String b11 = aVar.b(map.get("nonce"));
        map.put("state", b10);
        map.put("nonce", b11);
    }

    private final void m(String str, String str2) {
        if (str != null) {
            Log.e(f46360n, "Error, access denied. Check that the required Permissions are granted and that the Application has this Connection configured in Auth0 Dashboard.");
            if (C15854t.H("access_denied", str, true)) {
                if (str2 == null) {
                    str2 = "Permissions were not granted. Try again.";
                }
                throw new C8837b("access_denied", str2);
            } else if (C15854t.H("unauthorized", str, true)) {
                if (str2 == null) {
                    str2 = "An unexpected error occurred.";
                }
                throw new C8837b("unauthorized", str2);
            } else if (C17542s.e("login_required", str)) {
                if (str2 == null) {
                    str2 = "An unexpected error occurred.";
                }
                throw new C8837b(str, str2);
            } else {
                if (str2 == null) {
                    str2 = "An unexpected error occurred.";
                }
                throw new C8837b(str, str2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void n(String str, C8884a<Void, C8743b> aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.b(new k());
            return;
        }
        try {
            C17542s.g(str);
            Jwt jwt = new Jwt(str);
            o.c(jwt.h(), this.f46367g, new b(aVar, this, jwt));
        } catch (Exception e10) {
            aVar.b(new y(e10));
        }
    }

    private final Uri o() {
        Uri.Builder buildUpon = Uri.parse(this.f46361a.c()).buildUpon();
        for (Map.Entry next : this.f46364d.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        Uri build = buildUpon.build();
        String str = f46360n;
        Log.d(str, "Using the following Authorize URI: " + build);
        C17542s.i(build, "uri");
        return build;
    }

    private final void p(String str, Map<String, String> map) {
        if (this.f46369i == null) {
            this.f46369i = new m(this.f46367g, str, map);
        }
    }

    public void a(C8837b bVar) {
        C17542s.j(bVar, "exception");
        this.f46362b.b(bVar);
    }

    public boolean b(c cVar) {
        C17542s.j(cVar, "result");
        if (!cVar.c(this.f46368h)) {
            Log.w(f46360n, "The Authorize Result is invalid.");
            return false;
        } else if (cVar.b()) {
            this.f46362b.b(new C8837b("a0.authentication_canceled", "The user closed the browser app and the authentication was canceled."));
            return true;
        } else {
            Map<String, String> c10 = e.c(cVar.a());
            C17542s.i(c10, "getValuesFromUri(result.intentData)");
            if (c10.isEmpty()) {
                Log.w(f46360n, "The response didn't contain any of these values: code, state");
                return false;
            }
            String str = f46360n;
            Log.d(str, "The parsed CallbackURI contains the following parameters: " + c10.keySet());
            try {
                m(c10.get(UiComponentContainer.RESULT_ERROR), c10.get("error_description"));
                a aVar = f46359m;
                String str2 = this.f46364d.get("state");
                C17542s.g(str2);
                aVar.a(str2, c10.get("state"));
                m mVar = this.f46369i;
                C17542s.g(mVar);
                mVar.b(c10.get("code"), new c(this));
                return true;
            } catch (C8837b e10) {
                this.f46362b.b(e10);
                return true;
            }
        }
    }

    public final long q() {
        Long l10 = this.f46370j;
        if (l10 == null) {
            return System.currentTimeMillis();
        }
        C17542s.g(l10);
        return l10.longValue();
    }

    public final void r(Map<String, String> map) {
        C17542s.j(map, "headers");
        this.f46365e.putAll(map);
    }

    public final void s(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f46367g.b();
        }
        this.f46372l = str;
    }

    public final void t(Integer num) {
        this.f46371k = num;
    }

    public final void u(m mVar) {
        this.f46369i = mVar;
    }

    public final void v(Context context, String str, int i10) {
        C17542s.j(context, "context");
        C17542s.j(str, "redirectUri");
        i.f46457a.a(this.f46364d);
        k(this.f46364d, str, this.f46365e);
        j(this.f46364d, str);
        l(this.f46364d);
        Uri o10 = o();
        this.f46368h = i10;
        AuthenticationActivity.f46313c.a(context, o10, this.f46363c, this.f46366f);
    }
}
