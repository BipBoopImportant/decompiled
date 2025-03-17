package com.sugarcube.decorate_engine;

import hK.C17339e;
import hK.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate_engine/RoomPolygonTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/RoomPolygonType;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/RoomPolygonType;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomPolygonTypeSerializer implements KSerializer<RoomPolygonType> {
    public static final RoomPolygonTypeSerializer INSTANCE = new RoomPolygonTypeSerializer();
    private static final SerialDescriptor descriptor = k.b("RoomPolygonType", C17339e.i.f143447a);

    private RoomPolygonTypeSerializer() {
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public RoomPolygonType deserialize(Decoder decoder) {
        RoomPolygonType roomPolygonType;
        C17542s.j(decoder, "decoder");
        String z10 = decoder.z();
        RoomPolygonType[] values = RoomPolygonType.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                roomPolygonType = null;
                break;
            }
            roomPolygonType = values[i10];
            if (C17542s.e(roomPolygonType.getStringValue(), z10)) {
                break;
            }
            i10++;
        }
        if (roomPolygonType != null) {
            return roomPolygonType;
        }
        return RoomPolygonType.None;
    }

    public void serialize(Encoder encoder, RoomPolygonType roomPolygonType) {
        C17542s.j(encoder, "encoder");
        C17542s.j(roomPolygonType, "value");
        encoder.G(roomPolygonType.getStringValue());
    }
}
