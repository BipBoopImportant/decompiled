package kK;

import XH.C16807N;
import XH.t;
import hK.C17335a;
import hK.C17338d;
import hK.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LkK/q;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "o", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "n", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements KSerializer<JsonElement> {

    /* renamed from: a  reason: collision with root package name */
    public static final q f144325a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f144326b = k.e("kotlinx.serialization.json.JsonElement", C17338d.b.f143438a, new SerialDescriptor[0], new k());

    private q() {
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17335a aVar) {
        C17542s.j(aVar, "$this$buildSerialDescriptor");
        C17335a aVar2 = aVar;
        C17335a.b(aVar2, "JsonPrimitive", r.f(new l()), (List) null, false, 12, (Object) null);
        C17335a.b(aVar2, "JsonNull", r.f(new m()), (List) null, false, 12, (Object) null);
        C17335a.b(aVar2, "JsonLiteral", r.f(new n()), (List) null, false, 12, (Object) null);
        C17335a.b(aVar2, "JsonObject", r.f(new o()), (List) null, false, 12, (Object) null);
        C17335a.b(aVar2, "JsonArray", r.f(new p()), (List) null, false, 12, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor i() {
        return C17511E.f144277a.getDescriptor();
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor j() {
        return C17507A.f144269a.getDescriptor();
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor k() {
        return x.f144331a.getDescriptor();
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor l() {
        return C17510D.f144272a.getDescriptor();
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor m() {
        return C17515d.f144284a.getDescriptor();
    }

    public SerialDescriptor getDescriptor() {
        return f144326b;
    }

    /* renamed from: n */
    public JsonElement deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return r.d(decoder).h();
    }

    /* renamed from: o */
    public void serialize(Encoder encoder, JsonElement jsonElement) {
        C17542s.j(encoder, "encoder");
        C17542s.j(jsonElement, "value");
        r.h(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.n(C17511E.f144277a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.n(C17510D.f144272a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.n(C17515d.f144284a, jsonElement);
        } else {
            throw new t();
        }
    }
}
