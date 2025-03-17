package zd;

import GK.z;
import QL.y;
import RL.C16397a;
import XH.C16824o;
import XH.C16825p;
import com.google.gson.Gson;
import com.ikea.kompassmap.api.GeometryDeserializer;
import com.ikea.kompassmap.api.GeometrySerializer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.maplibre.geojson.Geometry;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lzd/f;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "b", "Lcom/google/gson/Gson;", "c", "()Lcom/google/gson/Gson;", "gson", "LGK/z;", "LGK/z;", "client", "LQL/y;", "d", "LXH/o;", "e", "()LQL/y;", "retrofit", "Lzd/b;", "()Lzd/b;", "kompassApi", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f78115a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final Gson f78116b;

    /* renamed from: c  reason: collision with root package name */
    private static final z f78117c;

    /* renamed from: d  reason: collision with root package name */
    private static final C16824o f78118d = C16825p.b(new C10492d());

    /* renamed from: e  reason: collision with root package name */
    private static final C16824o f78119e = C16825p.b(new e());

    /* renamed from: f  reason: collision with root package name */
    public static final int f78120f = 8;

    static {
        Class<Geometry> cls = Geometry.class;
        Gson b10 = new com.google.gson.f().d(cls, new GeometryDeserializer()).d(cls, new GeometrySerializer()).b();
        C17542s.i(b10, "create(...)");
        f78116b = b10;
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f78117c = aVar.f(30, timeUnit).R(30, timeUnit).a(new C10489a()).a(C10491c.a()).c();
    }

    private f() {
    }

    private final y e() {
        Object value = f78118d.getValue();
        C17542s.i(value, "getValue(...)");
        return (y) value;
    }

    /* access modifiers changed from: private */
    public static final C10490b f() {
        return (C10490b) f78115a.e().b(C10490b.class);
    }

    /* access modifiers changed from: private */
    public static final y g() {
        return new y.b().d("https://metro.ikea.net/").g(f78117c).b(C16397a.f(f78116b)).e();
    }

    public final Gson c() {
        return f78116b;
    }

    public final C10490b d() {
        Object value = f78119e.getValue();
        C17542s.i(value, "getValue(...)");
        return (C10490b) value;
    }
}
