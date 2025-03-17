package lK;

import XH.C16807N;
import com.optimizely.ab.config.FeatureVariable;
import java.util.ArrayList;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import nI.C17642l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0017j\b\u0012\u0004\u0012\u00020\u0005`\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LlK/S;", "LlK/e;", "LkK/c;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "LXH/N;", "nodeConsumer", "<init>", "(LkK/c;LnI/l;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "b0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "key", "element", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "array", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class S extends C17574e {

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<JsonElement> f144445g = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S(C17514c cVar, C17642l<? super JsonElement, C16807N> lVar) {
        super(cVar, lVar, (DefaultConstructorMarker) null);
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(lVar, "nodeConsumer");
    }

    /* access modifiers changed from: protected */
    public String b0(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return String.valueOf(i10);
    }

    public JsonElement s0() {
        return new JsonArray(this.f144445g);
    }

    public void w0(String str, JsonElement jsonElement) {
        C17542s.j(str, "key");
        C17542s.j(jsonElement, "element");
        this.f144445g.add(Integer.parseInt(str), jsonElement);
    }
}
