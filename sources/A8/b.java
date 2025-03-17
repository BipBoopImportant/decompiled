package A8;

import E8.c;
import G8.y;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\u001dB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\"\u0010%\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b$\u0010\u0013R\u0013\u0010(\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010'¨\u0006)"}, d2 = {"LA8/b;", "LE8/c$b;", "LE8/c;", "preferencesStore", "LG8/a;", "buildInstantiable", "<init>", "(LE8/c;LG8/a;)V", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;", "e", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;", "config", "", "c", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;)Z", "", "jsonConfiguration", "LXH/N;", "g", "(Ljava/lang/String;)V", "f", "()Ljava/lang/String;", "LE8/b;", "key", "o", "(LE8/b;)V", "name", "d", "(Ljava/lang/String;)Z", "a", "LE8/c;", "b", "LG8/a;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$RootConfig;", "rootConfig", "Ljava/lang/String;", "h", "lastETag", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "()Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "projectConfig", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements c.b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f32754e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final D8.c f32755f = new D8.c("Configuration");

    /* renamed from: a  reason: collision with root package name */
    private final c f32756a;

    /* renamed from: b  reason: collision with root package name */
    private final G8.a f32757b;

    /* renamed from: c  reason: collision with root package name */
    private JsonConfig.RootConfig f32758c;

    /* renamed from: d  reason: collision with root package name */
    private String f32759d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LA8/b$a;", "", "<init>", "()V", "LD8/c;", "logger", "LD8/c;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(c cVar, G8.a aVar) {
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(aVar, "buildInstantiable");
        this.f32756a = cVar;
        this.f32757b = aVar;
        this.f32758c = e();
        this.f32759d = "";
        cVar.n(this);
    }

    private final JsonConfig.RootConfig e() {
        String f10 = f();
        if (f10 == null) {
            return null;
        }
        return JsonConfig.f46695a.a(f10);
    }

    public final String a() {
        return this.f32759d;
    }

    public final JsonConfig.ProjectConfiguration b() {
        JsonConfig.ProjectConfigurations b10;
        JsonConfig.RootConfig rootConfig = this.f32758c;
        if (rootConfig == null || (b10 = rootConfig.b()) == null) {
            return null;
        }
        return b10.a();
    }

    public final boolean c(JsonConfig.RootConfig rootConfig) {
        C17542s.j(rootConfig, "config");
        return !C17542s.e(rootConfig, this.f32758c);
    }

    public final boolean d(String str) {
        List<JsonConfig.FeatureFlag> k10;
        T t10;
        C17542s.j(str, "name");
        JsonConfig.ProjectConfiguration b10 = b();
        if (!(b10 == null || (k10 = b10.k()) == null)) {
            Iterator<T> it = k10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((JsonConfig.FeatureFlag) t10).c(), str)) {
                    break;
                }
            }
            JsonConfig.FeatureFlag featureFlag = (JsonConfig.FeatureFlag) t10;
            if (featureFlag != null && featureFlag.a()) {
                if (y.a(">=" + featureFlag.b(), this.f32757b.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        D8.c cVar = f32755f;
        cVar.f("retrieving last config from preferences...");
        String f10 = this.f32756a.f(E8.b.RAW_CONFIGURATION_AS_JSON, (String) null);
        if (f10 == null || f10.length() == 0) {
            cVar.f("No configuration saved.");
            return null;
        }
        cVar.f("config is: " + f10);
        return f10;
    }

    public final void g(String str) {
        C17542s.j(str, "jsonConfiguration");
        JsonConfig.RootConfig a10 = JsonConfig.f46695a.a(str);
        if (!C17542s.e(a10, this.f32758c)) {
            this.f32758c = a10;
            this.f32756a.l(E8.b.RAW_CONFIGURATION_AS_JSON, str);
        }
    }

    public final void h(String str) {
        C17542s.j(str, "<set-?>");
        this.f32759d = str;
    }

    public void o(E8.b bVar) {
        C17542s.j(bVar, "key");
        if (bVar == E8.b.RAW_CONFIGURATION_AS_JSON) {
            this.f32758c = e();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, G8.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i10 & 2) != 0 ? new G8.a() : aVar);
    }
}
