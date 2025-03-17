package f7;

import XH.C16796C;
import YH.C16877v;
import YH.X;
import com.appmattus.certificatetransparency.internal.loglist.model.v3.State;
import kK.G;
import kK.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf7/d;", "LkK/G;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/State;", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "b", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f7.d  reason: case insensitive filesystem */
public final class C7861d extends G<State> {
    public C7861d() {
        super(State.Companion.serializer());
    }

    /* access modifiers changed from: protected */
    public JsonElement b(JsonElement jsonElement) {
        C17542s.j(jsonElement, "element");
        if (!(jsonElement instanceof JsonObject)) {
            return jsonElement;
        }
        JsonObject jsonObject = (JsonObject) jsonElement;
        String str = (String) C16877v.v0(jsonObject.keySet());
        Object obj = jsonObject.get(str);
        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
        return new JsonObject(X.r((JsonObject) obj, C16796C.a("type", j.c(str))));
    }
}
