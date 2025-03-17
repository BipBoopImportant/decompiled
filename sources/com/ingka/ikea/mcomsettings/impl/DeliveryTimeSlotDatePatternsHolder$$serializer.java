package com.ingka.ikea.mcomsettings.impl;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder.$serializer", "LjK/N;", "Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class DeliveryTimeSlotDatePatternsHolder$$serializer implements N<DeliveryTimeSlotDatePatternsHolder> {
    public static final DeliveryTimeSlotDatePatternsHolder$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DeliveryTimeSlotDatePatternsHolder$$serializer deliveryTimeSlotDatePatternsHolder$$serializer = new DeliveryTimeSlotDatePatternsHolder$$serializer();
        INSTANCE = deliveryTimeSlotDatePatternsHolder$$serializer;
        J0 j02 = new J0("com.ingka.ikea.mcomsettings.impl.DeliveryTimeSlotDatePatternsHolder", deliveryTimeSlotDatePatternsHolder$$serializer, 6);
        j02.p("dayPattern", false);
        j02.p("monthPattern", false);
        j02.p("weekdayPattern", false);
        j02.p("timePattern", false);
        j02.p("weekdayAndDate", false);
        j02.p("dateAndMonth", false);
        descriptor = j02;
    }

    private DeliveryTimeSlotDatePatternsHolder$$serializer() {
    }

    /* renamed from: b */
    public final DeliveryTimeSlotDatePatternsHolder deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        if (b10.q()) {
            String n10 = b10.n(serialDescriptor, 0);
            String n11 = b10.n(serialDescriptor, 1);
            String n12 = b10.n(serialDescriptor, 2);
            String n13 = b10.n(serialDescriptor, 3);
            String n14 = b10.n(serialDescriptor, 4);
            str6 = n10;
            str = b10.n(serialDescriptor, 5);
            str3 = n13;
            str2 = n14;
            str4 = n12;
            str5 = n11;
            i10 = 63;
        } else {
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                switch (p10) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        str7 = b10.n(serialDescriptor, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str12 = b10.n(serialDescriptor, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        str11 = b10.n(serialDescriptor, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        str9 = b10.n(serialDescriptor, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        str10 = b10.n(serialDescriptor, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        str8 = b10.n(serialDescriptor, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new C17247E(p10);
                }
            }
            str6 = str7;
            str = str8;
            str3 = str9;
            str2 = str10;
            str4 = str11;
            str5 = str12;
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new DeliveryTimeSlotDatePatternsHolder(i10, str6, str5, str4, str3, str2, str, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, DeliveryTimeSlotDatePatternsHolder deliveryTimeSlotDatePatternsHolder) {
        C17542s.j(encoder, "encoder");
        C17542s.j(deliveryTimeSlotDatePatternsHolder, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        DeliveryTimeSlotDatePatternsHolder.g(deliveryTimeSlotDatePatternsHolder, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, y02, y02};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
