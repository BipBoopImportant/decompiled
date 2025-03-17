package com.sugarcube.decorate_engine;

import XH.C16814e;
import jK.G;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/RoomPolygonType.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/RoomPolygonType;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/RoomPolygonType;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class RoomPolygonType$$serializer implements N<RoomPolygonType> {
    public static final RoomPolygonType$$serializer INSTANCE = new RoomPolygonType$$serializer();
    private static final /* synthetic */ G descriptor;

    static {
        G g10 = new G("com.sugarcube.decorate_engine.RoomPolygonType", 8);
        g10.p("None", false);
        g10.p("Ceiling", false);
        g10.p("Door", false);
        g10.p("Floor", false);
        g10.p("Opening", false);
        g10.p("StackingSurface", false);
        g10.p("Wall", false);
        g10.p("Window", false);
        descriptor = g10;
    }

    private RoomPolygonType$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Y0.f144077a};
    }

    public RoomPolygonType deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        return RoomPolygonType.values()[decoder.f(getDescriptor())];
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, RoomPolygonType roomPolygonType) {
        C17542s.j(encoder, "encoder");
        C17542s.j(roomPolygonType, "value");
        encoder.j(getDescriptor(), roomPolygonType.ordinal());
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
