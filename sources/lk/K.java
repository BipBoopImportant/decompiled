package lK;

import XH.C16807N;
import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import nI.C17642l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LlK/K;", "LlK/e;", "LkK/c;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "LXH/N;", "nodeConsumer", "<init>", "(LkK/c;LnI/l;)V", "", "key", "element", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "g", "Lkotlinx/serialization/json/JsonElement;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class K extends C17574e {

    /* renamed from: g  reason: collision with root package name */
    private JsonElement f144430g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K(C17514c cVar, C17642l<? super JsonElement, C16807N> lVar) {
        super(cVar, lVar, (DefaultConstructorMarker) null);
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(lVar, "nodeConsumer");
        Z("primitive");
    }

    public JsonElement s0() {
        JsonElement jsonElement = this.f144430g;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    public void w0(String str, JsonElement jsonElement) {
        C17542s.j(str, "key");
        C17542s.j(jsonElement, "element");
        if (str != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        } else if (this.f144430g == null) {
            this.f144430g = jsonElement;
            t0().invoke(jsonElement);
        } else {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
    }
}
