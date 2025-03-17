package lK;

import XH.C16807N;
import XH.t;
import com.optimizely.ab.config.FeatureVariable;
import java.util.Map;
import kK.C17510D;
import kK.C17514c;
import kK.C17515d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LlK/U;", "LlK/P;", "LkK/c;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "LXH/N;", "nodeConsumer", "<init>", "(LkK/c;LnI/l;)V", "", "key", "element", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "h", "Ljava/lang/String;", "tag", "", "i", "Z", "isKey", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class U extends P {

    /* renamed from: h  reason: collision with root package name */
    private String f144450h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f144451i = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(C17514c cVar, C17642l<? super JsonElement, C16807N> lVar) {
        super(cVar, lVar);
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(lVar, "nodeConsumer");
    }

    public JsonElement s0() {
        return new JsonObject(x0());
    }

    public void w0(String str, JsonElement jsonElement) {
        C17542s.j(str, "key");
        C17542s.j(jsonElement, "element");
        if (!this.f144451i) {
            Map<String, JsonElement> x02 = x0();
            String str2 = this.f144450h;
            if (str2 == null) {
                C17542s.z("tag");
                str2 = null;
            }
            x02.put(str2, jsonElement);
            this.f144451i = true;
        } else if (jsonElement instanceof JsonPrimitive) {
            this.f144450h = ((JsonPrimitive) jsonElement).b();
            this.f144451i = false;
        } else if (jsonElement instanceof JsonObject) {
            throw C17562C.d(C17510D.f144272a.getDescriptor());
        } else if (jsonElement instanceof JsonArray) {
            throw C17562C.d(C17515d.f144284a.getDescriptor());
        } else {
            throw new t();
        }
    }
}
