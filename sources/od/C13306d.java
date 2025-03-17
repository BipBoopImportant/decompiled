package OD;

import PD.d;
import XH.C16796C;
import YH.X;
import am.C11070a;
import android.net.Uri;
import com.oppwa.mobile.connect.provider.AsyncPaymentActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C10242c;
import up.C12071a;
import up.C12074d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u001a"}, d2 = {"LOD/d;", "LPD/d;", "Lsf/c;", "appUserDataRepo", "Lam/a;", "appApi", "Lup/d;", "dataConsentRepository", "<init>", "(Lsf/c;Lam/a;Lup/d;)V", "", "baseUrl", "redirectUrl", "", "darkModeParameters", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lsf/c;", "b", "Lam/a;", "c", "Lup/d;", "", "()Z", "testMode", "consentToAnalytics", "webview-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OD.d  reason: case insensitive filesystem */
public final class C13306d implements d {

    /* renamed from: a  reason: collision with root package name */
    private final C10242c f112782a;

    /* renamed from: b  reason: collision with root package name */
    private final C11070a f112783b;

    /* renamed from: c  reason: collision with root package name */
    private final C12074d f112784c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001a\b\b\u0018\u0000 (2\u00020\u0001:\u0001\u0015BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR%\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b\u0015\u0010\u001c¨\u0006)"}, d2 = {"LOD/d$a;", "", "", "allowAnalytics", "", "", "uiModeParameters", "testMode", "cc", "lc", "redirectUrl", "<init>", "(ZLjava/util/Map;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getAllowAnalytics", "()Z", "b", "Ljava/util/Map;", "getUiModeParameters", "()Ljava/util/Map;", "c", "getTestMode", "d", "Ljava/lang/String;", "getCc", "e", "getLc", "f", "getRedirectUrl", "g", "queryMap", "h", "webview-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: OD.d$a */
    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C2783a f112785h = new C2783a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f112786a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f112787b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f112788c;

        /* renamed from: d  reason: collision with root package name */
        private final String f112789d;

        /* renamed from: e  reason: collision with root package name */
        private final String f112790e;

        /* renamed from: f  reason: collision with root package name */
        private final String f112791f;

        /* renamed from: g  reason: collision with root package name */
        private final Map<String, String> f112792g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"LOD/d$a$a;", "", "<init>", "()V", "", "ALLOW_ANALYTICS", "Ljava/lang/String;", "PLATFORM", "TEST_MODE", "CC", "LC", "REDIRECT_URL", "ANDROID", "webview-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: OD.d$a$a  reason: collision with other inner class name */
        public static final class C2783a {
            public /* synthetic */ C2783a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2783a() {
            }
        }

        public a(boolean z10, Map<String, String> map, boolean z11, String str, String str2, String str3) {
            C17542s.j(map, "uiModeParameters");
            C17542s.j(str3, "redirectUrl");
            this.f112786a = z10;
            this.f112787b = map;
            this.f112788c = z11;
            this.f112789d = str;
            this.f112790e = str2;
            this.f112791f = str3;
            this.f112792g = X.s(X.m(C16796C.a("allow_analytics", String.valueOf(z10)), C16796C.a("platform", "Android"), C16796C.a("test_mode", String.valueOf(z11)), C16796C.a("cc", str), C16796C.a("lc", str2), C16796C.a(AsyncPaymentActivity.EXTRA_REDIRECT_URL, str3)), map);
        }

        public final Map<String, String> a() {
            return this.f112792g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f112786a == aVar.f112786a && C17542s.e(this.f112787b, aVar.f112787b) && this.f112788c == aVar.f112788c && C17542s.e(this.f112789d, aVar.f112789d) && C17542s.e(this.f112790e, aVar.f112790e) && C17542s.e(this.f112791f, aVar.f112791f);
        }

        public int hashCode() {
            int hashCode = ((((Boolean.hashCode(this.f112786a) * 31) + this.f112787b.hashCode()) * 31) + Boolean.hashCode(this.f112788c)) * 31;
            String str = this.f112789d;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f112790e;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.f112791f.hashCode();
        }

        public String toString() {
            boolean z10 = this.f112786a;
            Map<String, String> map = this.f112787b;
            boolean z11 = this.f112788c;
            String str = this.f112789d;
            String str2 = this.f112790e;
            String str3 = this.f112791f;
            return "QueryData(allowAnalytics=" + z10 + ", uiModeParameters=" + map + ", testMode=" + z11 + ", cc=" + str + ", lc=" + str2 + ", redirectUrl=" + str3 + ")";
        }
    }

    public C13306d(C10242c cVar, C11070a aVar, C12074d dVar) {
        C17542s.j(cVar, "appUserDataRepo");
        C17542s.j(aVar, "appApi");
        C17542s.j(dVar, "dataConsentRepository");
        this.f112782a = cVar;
        this.f112783b = aVar;
        this.f112784c = dVar;
    }

    private final boolean b() {
        return this.f112784c.b(C12071a.b.f103980e);
    }

    private final boolean c() {
        return this.f112783b.b();
    }

    public String a(String str, String str2, Map<String, String> map) {
        C17542s.j(str, "baseUrl");
        C17542s.j(str2, "redirectUrl");
        C17542s.j(map, "darkModeParameters");
        a aVar = new a(b(), map, c(), this.f112782a.c(), this.f112782a.a(), str2);
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry next : aVar.a().entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        String uri = buildUpon.build().toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }
}
