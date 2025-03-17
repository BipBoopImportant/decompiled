package com.ingka.ikea.timeslot.impl.data.remote.model;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData.$serializer", "LjK/N;", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class TimeslotRemoteData$$serializer implements N<TimeslotRemoteData> {
    public static final TimeslotRemoteData$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f120536a = 8;
    private static final SerialDescriptor descriptor;

    static {
        TimeslotRemoteData$$serializer timeslotRemoteData$$serializer = new TimeslotRemoteData$$serializer();
        INSTANCE = timeslotRemoteData$$serializer;
        J0 j02 = new J0("com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotRemoteData", timeslotRemoteData$$serializer, 5);
        j02.p("id", false);
        j02.p("startDateTime", false);
        j02.p("endDateTime", false);
        j02.p("paymentCutOffDateTime", false);
        j02.p("hardCutOffDateTime", false);
        descriptor = j02;
    }

    private TimeslotRemoteData$$serializer() {
    }

    /* renamed from: b */
    public final TimeslotRemoteData deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        if (b10.q()) {
            String n10 = b10.n(serialDescriptor, 0);
            String n11 = b10.n(serialDescriptor, 1);
            String n12 = b10.n(serialDescriptor, 2);
            str5 = n10;
            str2 = b10.n(serialDescriptor, 3);
            str = b10.n(serialDescriptor, 4);
            str3 = n12;
            str4 = n11;
            i10 = 31;
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str6 = b10.n(serialDescriptor, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str10 = b10.n(serialDescriptor, 1);
                    i11 |= 2;
                } else if (p10 == 2) {
                    str9 = b10.n(serialDescriptor, 2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    str7 = b10.n(serialDescriptor, 3);
                    i11 |= 8;
                } else if (p10 == 4) {
                    str8 = b10.n(serialDescriptor, 4);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            str5 = str6;
            str2 = str7;
            str = str8;
            str3 = str9;
            str4 = str10;
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new TimeslotRemoteData(i10, str5, str4, str3, str2, str, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, TimeslotRemoteData timeslotRemoteData) {
        C17542s.j(encoder, "encoder");
        C17542s.j(timeslotRemoteData, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        TimeslotRemoteData.f(timeslotRemoteData, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, y02};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
