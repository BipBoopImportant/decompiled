package kK;

import hK.C17339e;
import hK.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import lK.C17562C;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LkK/E;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonPrimitive;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kK.E  reason: case insensitive filesystem */
public final class C17511E implements KSerializer<JsonPrimitive> {

    /* renamed from: a  reason: collision with root package name */
    public static final C17511E f144277a = new C17511E();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f144278b = k.f("kotlinx.serialization.json.JsonPrimitive", C17339e.i.f143447a, new SerialDescriptor[0], (C17642l) null, 8, (Object) null);

    private C17511E() {
    }

    /* renamed from: b */
    public JsonPrimitive deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        JsonElement h10 = r.d(decoder).h();
        if (h10 instanceof JsonPrimitive) {
            return (JsonPrimitive) h10;
        }
        throw C17562C.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + P.b(h10.getClass()), h10.toString());
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonPrimitive jsonPrimitive) {
        C17542s.j(encoder, "encoder");
        C17542s.j(jsonPrimitive, "value");
        r.h(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.n(C17507A.f144269a, JsonNull.INSTANCE);
        } else {
            encoder.n(x.f144331a, (w) jsonPrimitive);
        }
    }

    public SerialDescriptor getDescriptor() {
        return f144278b;
    }
}
