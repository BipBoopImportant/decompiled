package VE;

import HJ.C15854t;
import TJ.C16505B;
import TJ.C16521S;
import VE.C13759a;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\n¨\u0006#"}, d2 = {"LVE/b;", "", "Lcom/sugarcube/app/base/external/config/a;", "config", "Landroid/content/Context;", "appContext", "<init>", "(Lcom/sugarcube/app/base/external/config/a;Landroid/content/Context;)V", "LVE/a;", "f", "()LVE/a;", "environment", "LXH/N;", "e", "(LVE/a;)V", "", "d", "()Ljava/lang/String;", "", "a", "()Ljava/util/List;", "Lcom/sugarcube/app/base/external/config/a;", "getConfig", "()Lcom/sugarcube/app/base/external/config/a;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "b", "Landroid/content/SharedPreferences;", "sharedPrefs", "LTJ/B;", "c", "LTJ/B;", "()LTJ/B;", "currentEnvironmentFlow", "currentEnvironment", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: VE.b  reason: case insensitive filesystem */
public final class C13760b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f117438d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f117439e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static final String f117440f = "NETWORK_ENVIRONMENT";

    /* renamed from: g  reason: collision with root package name */
    private static final C13759a f117441g;

    /* renamed from: h  reason: collision with root package name */
    private static final Map<String, C13759a> f117442h;

    /* renamed from: a  reason: collision with root package name */
    private final com.sugarcube.app.base.external.config.a f117443a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f117444b;

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<C13759a> f117445c = C16521S.a(f());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000bJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000bJ%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\u0017¨\u0006\""}, d2 = {"LVE/b$a;", "", "<init>", "()V", "", "country", "i", "(Ljava/lang/String;)Ljava/lang/String;", "language", "j", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "d", "sceneUuid", "compositionUuid", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "h", "e", "host", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "NETWORK_ENVIRONMENT_KEY", "Ljava/lang/String;", "SERVER_BASE_FORMAT", "SERVER_PROD", "SERVER_DEV", "AUTOCOMPLETE_BASE_URL", "DESIGN_URL_FORMAT", "WEB_ROOM_URL_FORMAT", "SUPPORT_URL_FORMAT", "SUPPORT_ARTICLE_DEVICE", "KITCHEN_PLANNER_URL_FORMAT", "SMARTA_API_URL_FORMAT", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: VE.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String i(String str) {
            String obj = C15854t.z1(str).toString();
            return obj.length() == 0 ? "us" : obj;
        }

        /* access modifiers changed from: private */
        public final String j(String str) {
            String obj = C15854t.z1(str).toString();
            return obj.length() == 0 ? "en" : obj;
        }

        public final String c(String str, String str2) {
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            String format = String.format("https://sik.search.blue.cdtapps.com/%s/%s/", Arrays.copyOf(new Object[]{i(str), j(str2)}, 2));
            C17542s.i(format, "format(...)");
            return format;
        }

        public final String d(String str, String str2) {
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            String format = String.format("https://ikea.com/%s/%s/home-design", Arrays.copyOf(new Object[]{i(str), j(str2)}, 2));
            C17542s.i(format, "format(...)");
            return format;
        }

        public final String e(String str, String str2) {
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            String format = String.format("https://www.ikea.com/%s/%s/planners/kitchen-planner/", Arrays.copyOf(new Object[]{i(str), j(str2)}, 2));
            C17542s.i(format, "format(...)");
            return format;
        }

        public final String f(String str, String str2, String str3, String str4) {
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            C17542s.j(str3, "sceneUuid");
            C17542s.j(str4, "compositionUuid");
            String format = String.format("https://www.ikea.com/%s/%s/home-design/room/#%s/%s", Arrays.copyOf(new Object[]{i(str), j(str2), str4, str3}, 4));
            C17542s.i(format, "format(...)");
            return format;
        }

        public final String g(String str, String str2, String str3) {
            C17542s.j(str, "host");
            C17542s.j(str2, PlaceTypes.COUNTRY);
            C17542s.j(str3, "language");
            String format = String.format("https://%s.home-design.ikea.com/%s/%s/ideas/sugarcube/api/", Arrays.copyOf(new Object[]{str, i(str2), j(str3)}, 3));
            C17542s.i(format, "format(...)");
            return format;
        }

        public final String h(String str, String str2) {
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            String format = String.format("https://support.home-design.ikea.com/hc/%s-%s/", Arrays.copyOf(new Object[]{j(str2), i(str)}, 2));
            C17542s.i(format, "format(...)");
            return format;
        }

        private a() {
        }
    }

    static {
        C13759a.c cVar = C13759a.c.f117437i;
        f117441g = cVar;
        v a10 = C16796C.a(cVar.e(), cVar);
        C13759a.b bVar = C13759a.b.f117436i;
        f117442h = X.m(a10, C16796C.a(bVar.e(), bVar));
    }

    public C13760b(com.sugarcube.app.base.external.config.a aVar, Context context) {
        C17542s.j(aVar, "config");
        C17542s.j(context, "appContext");
        this.f117443a = aVar;
        this.f117444b = context.getSharedPreferences("NETWORK_CONFIG", 0);
    }

    private final C13759a f() {
        return f117442h.getOrDefault(this.f117444b.getString(f117440f, (String) null), f117441g);
    }

    public final List<C13759a> a() {
        return C16877v.t1(f117442h.values());
    }

    public final C13759a b() {
        return this.f117445c.getValue();
    }

    public final C16505B<C13759a> c() {
        return this.f117445c;
    }

    public final String d() {
        String c10 = b().c();
        a aVar = f117438d;
        String format = String.format("https://%s/%s/%s/ideas/sugarcube/api/", Arrays.copyOf(new Object[]{c10, aVar.i(this.f117443a.getCountry()), aVar.j(this.f117443a.getLanguage())}, 3));
        C17542s.i(format, "format(...)");
        return format;
    }

    public final void e(C13759a aVar) {
        C17542s.j(aVar, "environment");
        this.f117444b.edit().putString(f117440f, aVar.e()).apply();
        this.f117445c.setValue(f());
    }
}
