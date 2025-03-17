package lK;

import XH.C16807N;
import com.optimizely.ab.config.FeatureVariable;
import fK.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import nI.C17642l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u001c8\u0004X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LlK/P;", "LlK/e;", "LkK/c;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "LXH/N;", "nodeConsumer", "<init>", "(LkK/c;LnI/l;)V", "", "key", "element", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "LfK/r;", "serializer", "value", "B", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILfK/r;Ljava/lang/Object;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "", "g", "Ljava/util/Map;", "x0", "()Ljava/util/Map;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
class P extends C17574e {

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, JsonElement> f144441g = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P(C17514c cVar, C17642l<? super JsonElement, C16807N> lVar) {
        super(cVar, lVar, (DefaultConstructorMarker) null);
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(lVar, "nodeConsumer");
    }

    public <T> void B(SerialDescriptor serialDescriptor, int i10, r<? super T> rVar, T t10) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(rVar, "serializer");
        if (t10 != null || this.f144504d.j()) {
            super.B(serialDescriptor, i10, rVar, t10);
        }
    }

    public JsonElement s0() {
        return new JsonObject(this.f144441g);
    }

    public void w0(String str, JsonElement jsonElement) {
        C17542s.j(str, "key");
        C17542s.j(jsonElement, "element");
        this.f144441g.put(str, jsonElement);
    }

    /* access modifiers changed from: protected */
    public final Map<String, JsonElement> x0() {
        return this.f144441g;
    }
}
