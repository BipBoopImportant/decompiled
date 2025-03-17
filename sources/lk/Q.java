package lK;

import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"LlK/Q;", "LlK/c;", "LkK/c;", "json", "Lkotlinx/serialization/json/JsonArray;", "value", "<init>", "(LkK/c;Lkotlinx/serialization/json/JsonArray;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "g0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "tag", "Lkotlinx/serialization/json/JsonElement;", "m0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "h", "Lkotlinx/serialization/json/JsonArray;", "D0", "()Lkotlinx/serialization/json/JsonArray;", "i", "I", "size", "j", "currentIndex", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Q extends C17572c {

    /* renamed from: h  reason: collision with root package name */
    private final JsonArray f144442h;

    /* renamed from: i  reason: collision with root package name */
    private final int f144443i = A0().size();

    /* renamed from: j  reason: collision with root package name */
    private int f144444j = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q(C17514c cVar, JsonArray jsonArray) {
        super(cVar, jsonArray, (String) null, 4, (DefaultConstructorMarker) null);
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(jsonArray, "value");
        this.f144442h = jsonArray;
    }

    /* renamed from: D0 */
    public JsonArray A0() {
        return this.f144442h;
    }

    /* access modifiers changed from: protected */
    public String g0(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return String.valueOf(i10);
    }

    /* access modifiers changed from: protected */
    public JsonElement m0(String str) {
        C17542s.j(str, "tag");
        return A0().get(Integer.parseInt(str));
    }

    public int p(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        int i10 = this.f144444j;
        if (i10 >= this.f144443i - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f144444j = i11;
        return i11;
    }
}
