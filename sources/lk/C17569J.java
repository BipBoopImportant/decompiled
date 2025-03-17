package lK;

import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LlK/J;", "LlK/c;", "LkK/c;", "json", "Lkotlinx/serialization/json/JsonElement;", "value", "", "polymorphicDiscriminator", "<init>", "(LkK/c;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "tag", "m0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "h", "Lkotlinx/serialization/json/JsonElement;", "A0", "()Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.J  reason: case insensitive filesystem */
final class C17569J extends C17572c {

    /* renamed from: h  reason: collision with root package name */
    private final JsonElement f144429h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17569J(C17514c cVar, JsonElement jsonElement, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, jsonElement, (i10 & 4) != 0 ? null : str);
    }

    public JsonElement A0() {
        return this.f144429h;
    }

    /* access modifiers changed from: protected */
    public JsonElement m0(String str) {
        C17542s.j(str, "tag");
        if (str == "primitive") {
            return A0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    public int p(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17569J(C17514c cVar, JsonElement jsonElement, String str) {
        super(cVar, jsonElement, str, (DefaultConstructorMarker) null);
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(jsonElement, "value");
        this.f144429h = jsonElement;
        d0("primitive");
    }
}
