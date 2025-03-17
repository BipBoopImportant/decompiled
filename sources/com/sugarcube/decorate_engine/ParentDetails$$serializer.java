package com.sugarcube.decorate_engine;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/ParentDetails.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/ParentDetails;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/ParentDetails;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/ParentDetails;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ParentDetails$$serializer implements N<ParentDetails> {
    public static final ParentDetails$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ParentDetails$$serializer parentDetails$$serializer = new ParentDetails$$serializer();
        INSTANCE = parentDetails$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.ParentDetails", parentDetails$$serializer, 4);
        j02.p("pos", true);
        j02.p("rotQuat", true);
        j02.p("size", true);
        j02.p("type", true);
        descriptor = j02;
    }

    private ParentDetails$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = ParentDetails.$childSerializers;
        return new KSerializer[]{access$get$childSerializers$cp[0], access$get$childSerializers$cp[1], access$get$childSerializers$cp[2], RoomPolygonTypeSerializer.INSTANCE};
    }

    public ParentDetails deserialize(Decoder decoder) {
        RoomPolygonType roomPolygonType;
        List list;
        List list2;
        List list3;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        KSerializer[] access$get$childSerializers$cp = ParentDetails.$childSerializers;
        List list4 = null;
        if (b10.q()) {
            list = (List) b10.o(descriptor2, 2, access$get$childSerializers$cp[2], null);
            list3 = (List) b10.o(descriptor2, 0, access$get$childSerializers$cp[0], null);
            roomPolygonType = (RoomPolygonType) b10.o(descriptor2, 3, RoomPolygonTypeSerializer.INSTANCE, null);
            i10 = 15;
            list2 = (List) b10.o(descriptor2, 1, access$get$childSerializers$cp[1], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list5 = null;
            List list6 = null;
            RoomPolygonType roomPolygonType2 = null;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    list4 = (List) b10.o(descriptor2, 0, access$get$childSerializers$cp[0], list4);
                    i11 |= 1;
                } else if (p10 == 1) {
                    list5 = (List) b10.o(descriptor2, 1, access$get$childSerializers$cp[1], list5);
                    i11 |= 2;
                } else if (p10 == 2) {
                    list6 = (List) b10.o(descriptor2, 2, access$get$childSerializers$cp[2], list6);
                    i11 |= 4;
                } else if (p10 == 3) {
                    roomPolygonType2 = (RoomPolygonType) b10.o(descriptor2, 3, RoomPolygonTypeSerializer.INSTANCE, roomPolygonType2);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            list3 = list4;
            list2 = list5;
            list = list6;
            roomPolygonType = roomPolygonType2;
        }
        b10.c(descriptor2);
        return new ParentDetails(i10, list3, list2, list, roomPolygonType, (T0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ParentDetails parentDetails) {
        C17542s.j(encoder, "encoder");
        C17542s.j(parentDetails, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ParentDetails.write$Self$decorate_engine_release(parentDetails, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
