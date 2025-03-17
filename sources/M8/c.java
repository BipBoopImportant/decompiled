package M8;

import HJ.C15854t;
import M8.a;
import R8.e;
import YH.C16877v;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y8.C8993b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"LM8/c;", "", "<init>", "()V", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;", "rule", "LM8/h;", "lazyBodyHolder", "", "d", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;LM8/h;)Z", "c", "Ly8/b;", "event", "f", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;Ly8/b;)Z", "g", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;", "bodyAttributePath", "b", "(Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;LM8/h;)Z", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;", "config", "LM8/a;", "a", "(Ly8/b;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2;LM8/h;)LM8/a;", "e", "(Ly8/b;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;LM8/h;)Z", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;", "defaultRule", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f38639a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final JsonConfig.ApiErrorsV2.CollectionRule f38640b = new JsonConfig.ApiErrorsV2.CollectionRule((String) null, (Integer) null, (String) null, false, false, false, C16877v.n(), C16877v.n());

    private c() {
    }

    private final boolean b(JsonConfig.ApiErrorsV2.BodyAttributePath bodyAttributePath, h hVar) {
        return R8.c.f39739a.j(bodyAttributePath.b(), hVar.b(), true) != null;
    }

    private final boolean c(JsonConfig.ApiErrorsV2.CollectionRule collectionRule, h hVar) {
        String c10 = collectionRule.c();
        if (c10 != null) {
            String c11 = hVar.c();
            Boolean bool = null;
            if (c11 != null) {
                bool = Boolean.valueOf(C15854t.d0(c11, c10, false, 2, (Object) null));
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    private final boolean d(JsonConfig.ApiErrorsV2.CollectionRule collectionRule, h hVar) {
        T t10;
        Iterator<T> it = collectionRule.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (((JsonConfig.ApiErrorsV2.BodyAttributePath) t10).c()) {
                break;
            }
        }
        JsonConfig.ApiErrorsV2.BodyAttributePath bodyAttributePath = (JsonConfig.ApiErrorsV2.BodyAttributePath) t10;
        return bodyAttributePath == null || b(bodyAttributePath, hVar);
    }

    private final boolean f(JsonConfig.ApiErrorsV2.CollectionRule collectionRule, C8993b bVar) {
        if (collectionRule.h() != null || bVar.C() < 400) {
            if (collectionRule.h() != null) {
                int C10 = bVar.C();
                Integer h10 = collectionRule.h();
                if (h10 != null && C10 == h10.intValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private final boolean g(JsonConfig.ApiErrorsV2.CollectionRule collectionRule, C8993b bVar) {
        String i10 = collectionRule.i();
        if (i10 != null) {
            return C15854t.d0(e.d(bVar.E()), i10, false, 2, (Object) null);
        }
        return true;
    }

    public final a a(C8993b bVar, JsonConfig.ApiErrorsV2 apiErrorsV2, h hVar) {
        List<T> list;
        List<JsonConfig.ApiErrorsV2.CollectionRule> c10;
        C17542s.j(bVar, "event");
        C17542s.j(hVar, "lazyBodyHolder");
        a.C0608a aVar = new a.C0608a();
        if (apiErrorsV2 == null || (c10 = apiErrorsV2.c()) == null || (list = C16877v.W0(c10, f38640b)) == null) {
            list = C16877v.e(f38640b);
        }
        ArrayList<JsonConfig.ApiErrorsV2.CollectionRule> arrayList = new ArrayList<>();
        for (T next : list) {
            if (f38639a.e(bVar, (JsonConfig.ApiErrorsV2.CollectionRule) next, hVar)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        for (JsonConfig.ApiErrorsV2.CollectionRule collectionRule : arrayList) {
            aVar.e(collectionRule.d());
            aVar.f(collectionRule.e());
            aVar.g(collectionRule.f());
            aVar.b(collectionRule.g());
            aVar.a(collectionRule.b());
            String c11 = collectionRule.c();
            if (c11 != null) {
                aVar.c(c11);
            }
        }
        aVar.h(apiErrorsV2 != null ? apiErrorsV2.b() : false);
        return aVar.d();
    }

    public final boolean e(C8993b bVar, JsonConfig.ApiErrorsV2.CollectionRule collectionRule, h hVar) {
        C17542s.j(bVar, "event");
        C17542s.j(collectionRule, "rule");
        C17542s.j(hVar, "lazyBodyHolder");
        return g(collectionRule, bVar) && f(collectionRule, bVar) && c(collectionRule, hVar) && d(collectionRule, hVar);
    }
}
