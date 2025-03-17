package lK;

import YH.C16877v;
import YH.X;
import com.optimizely.ab.config.FeatureVariable;
import java.util.List;
import kK.C17514c;
import kK.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006%"}, d2 = {"LlK/T;", "LlK/O;", "LkK/c;", "json", "Lkotlinx/serialization/json/JsonObject;", "value", "<init>", "(LkK/c;Lkotlinx/serialization/json/JsonObject;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "g0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "tag", "Lkotlinx/serialization/json/JsonElement;", "m0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "LXH/N;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "l", "Lkotlinx/serialization/json/JsonObject;", "F0", "()Lkotlinx/serialization/json/JsonObject;", "", "m", "Ljava/util/List;", "keys", "n", "I", "size", "o", "position", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class T extends O {

    /* renamed from: l  reason: collision with root package name */
    private final JsonObject f144446l;

    /* renamed from: m  reason: collision with root package name */
    private final List<String> f144447m;

    /* renamed from: n  reason: collision with root package name */
    private final int f144448n;

    /* renamed from: o  reason: collision with root package name */
    private int f144449o = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(C17514c cVar, JsonObject jsonObject) {
        super(cVar, jsonObject, (String) null, (SerialDescriptor) null, 12, (DefaultConstructorMarker) null);
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(jsonObject, "value");
        this.f144446l = jsonObject;
        List<String> t12 = C16877v.t1(A0().keySet());
        this.f144447m = t12;
        this.f144448n = t12.size() * 2;
    }

    /* renamed from: F0 */
    public JsonObject A0() {
        return this.f144446l;
    }

    public void c(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
    }

    /* access modifiers changed from: protected */
    public String g0(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return this.f144447m.get(i10 / 2);
    }

    /* access modifiers changed from: protected */
    public JsonElement m0(String str) {
        C17542s.j(str, "tag");
        return this.f144449o % 2 == 0 ? j.c(str) : (JsonElement) X.k(A0(), str);
    }

    public int p(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        int i10 = this.f144449o;
        if (i10 >= this.f144448n - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f144449o = i11;
        return i11;
    }
}
