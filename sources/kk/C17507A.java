package kK;

import hK.k;
import hK.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import lK.C17593y;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LkK/A;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonNull;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonNull;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kK.A  reason: case insensitive filesystem */
public final class C17507A implements KSerializer<JsonNull> {

    /* renamed from: a  reason: collision with root package name */
    public static final C17507A f144269a = new C17507A();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f144270b = k.f("kotlinx.serialization.json.JsonNull", l.b.f143469a, new SerialDescriptor[0], (C17642l) null, 8, (Object) null);

    private C17507A() {
    }

    /* renamed from: b */
    public JsonNull deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        r.g(decoder);
        if (!decoder.F()) {
            decoder.k();
            return JsonNull.INSTANCE;
        }
        throw new C17593y("Expected 'null' literal");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonNull jsonNull) {
        C17542s.j(encoder, "encoder");
        C17542s.j(jsonNull, "value");
        r.h(encoder);
        encoder.o();
    }

    public SerialDescriptor getDescriptor() {
        return f144270b;
    }
}
