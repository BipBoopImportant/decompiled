package b5;

import a5.d;
import a5.e;
import android.content.pm.PackageInfo;
import android.os.Build;
import b5.C7059a;
import b5.m;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class o {

    /* renamed from: A  reason: collision with root package name */
    public static final C7059a.b f45424A = new C7059a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B  reason: collision with root package name */
    public static final C7059a.b f45425B = new C7059a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C  reason: collision with root package name */
    public static final C7059a.d f45426C = new C7059a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* renamed from: D  reason: collision with root package name */
    public static final C7059a.b f45427D = new C7059a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: E  reason: collision with root package name */
    public static final C7059a.b f45428E = new C7059a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: F  reason: collision with root package name */
    public static final C7059a.b f45429F = new C7059a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: G  reason: collision with root package name */
    public static final C7059a.b f45430G = new C7059a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: H  reason: collision with root package name */
    public static final C7059a.e f45431H = new C7059a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: I  reason: collision with root package name */
    public static final C7059a.e f45432I = new C7059a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: J  reason: collision with root package name */
    public static final C7059a.h f45433J = new C7059a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: K  reason: collision with root package name */
    public static final C7059a.h f45434K = new C7059a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: L  reason: collision with root package name */
    public static final C7059a.g f45435L = new C7059a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: M  reason: collision with root package name */
    public static final m.b f45436M = new m.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: N  reason: collision with root package name */
    public static final m.a f45437N = new m.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* renamed from: O  reason: collision with root package name */
    public static final C7059a.h f45438O = new C7059a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: P  reason: collision with root package name */
    public static final C7059a.i f45439P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: Q  reason: collision with root package name */
    public static final C7059a.d f45440Q = new C7059a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: R  reason: collision with root package name */
    public static final C7059a.d f45441R = new C7059a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: S  reason: collision with root package name */
    public static final C7059a.h f45442S = new C7059a.h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: T  reason: collision with root package name */
    public static final C7059a.d f45443T = new C7059a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: U  reason: collision with root package name */
    public static final C7059a.d f45444U = new C7059a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: V  reason: collision with root package name */
    public static final C7059a.d f45445V = new C7059a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: W  reason: collision with root package name */
    public static final C7059a.d f45446W = new C7059a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: X  reason: collision with root package name */
    public static final C7059a.d f45447X = new C7059a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: Y  reason: collision with root package name */
    public static final C7059a.d f45448Y = new C7059a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: Z  reason: collision with root package name */
    public static final C7059a.d f45449Z = new C7059a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: a  reason: collision with root package name */
    public static final C7059a.b f45450a = new C7059a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: a0  reason: collision with root package name */
    public static final C7059a.d f45451a0 = new C7059a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: b  reason: collision with root package name */
    public static final C7059a.b f45452b = new C7059a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: b0  reason: collision with root package name */
    public static final C7059a.d f45453b0 = new C7059a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* renamed from: c  reason: collision with root package name */
    public static final C7059a.e f45454c = new C7059a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: c0  reason: collision with root package name */
    public static final C7059a.d f45455c0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* renamed from: d  reason: collision with root package name */
    public static final C7059a.c f45456d = new C7059a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: d0  reason: collision with root package name */
    public static final C7059a.d f45457d0 = new C7059a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* renamed from: e  reason: collision with root package name */
    public static final C7059a.f f45458e = new C7059a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: e0  reason: collision with root package name */
    public static final C7059a.d f45459e0 = new C7059a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final C7059a.f f45460f = new C7059a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: f0  reason: collision with root package name */
    public static final C7059a.d f45461f0 = new C7059a.d("MUTE_AUDIO", "MUTE_AUDIO");
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final C7059a.f f45462g = new C7059a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: g0  reason: collision with root package name */
    public static final C7059a.d f45463g0 = new C7059a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* renamed from: h  reason: collision with root package name */
    public static final C7059a.f f45464h = new C7059a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: h0  reason: collision with root package name */
    public static final C7059a.d f45465h0 = new C7059a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* renamed from: i  reason: collision with root package name */
    public static final C7059a.f f45466i = new C7059a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: i0  reason: collision with root package name */
    public static final C7059a.d f45467i0 = new C7059a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* renamed from: j  reason: collision with root package name */
    public static final C7059a.f f45468j = new C7059a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k  reason: collision with root package name */
    public static final C7059a.c f45469k = new C7059a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l  reason: collision with root package name */
    public static final C7059a.c f45470l = new C7059a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m  reason: collision with root package name */
    public static final C7059a.c f45471m = new C7059a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n  reason: collision with root package name */
    public static final C7059a.c f45472n = new C7059a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o  reason: collision with root package name */
    public static final C7059a.c f45473o = new C7059a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p  reason: collision with root package name */
    public static final C7059a.c f45474p = new C7059a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q  reason: collision with root package name */
    public static final C7059a.b f45475q = new C7059a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r  reason: collision with root package name */
    public static final C7059a.b f45476r = new C7059a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s  reason: collision with root package name */
    public static final C7059a.c f45477s = new C7059a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t  reason: collision with root package name */
    public static final C7059a.f f45478t = new C7059a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u  reason: collision with root package name */
    public static final C7059a.c f45479u = new C7059a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v  reason: collision with root package name */
    public static final C7059a.b f45480v = new C7059a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w  reason: collision with root package name */
    public static final C7059a.b f45481w = new C7059a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x  reason: collision with root package name */
    public static final C7059a.f f45482x = new C7059a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y  reason: collision with root package name */
    public static final C7059a.f f45483y = new C7059a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z  reason: collision with root package name */
    public static final C7059a.f f45484z = new C7059a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    class a extends C7059a.i {

        /* renamed from: d  reason: collision with root package name */
        private final Pattern f45485d = Pattern.compile("\\A\\d+");

        a(String str, String str2) {
            super(str, str2);
        }

        public boolean c() {
            boolean c10 = super.c();
            if (!c10 || Build.VERSION.SDK_INT >= 29) {
                return c10;
            }
            PackageInfo a10 = d.a();
            if (a10 == null) {
                return false;
            }
            Matcher matcher = this.f45485d.matcher(a10.versionName);
            return matcher.find() && Integer.parseInt(a10.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    class b extends C7059a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        public boolean c() {
            if (super.c() && e.a("MULTI_PROCESS")) {
                return d.c();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, C7059a.d());
    }

    public static <T extends C7067i> boolean c(String str, Collection<T> collection) {
        HashSet<C7067i> hashSet = new HashSet<>();
        for (T t10 : collection) {
            if (t10.a().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (!hashSet.isEmpty()) {
            for (C7067i isSupported : hashSet) {
                if (isSupported.isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }
}
