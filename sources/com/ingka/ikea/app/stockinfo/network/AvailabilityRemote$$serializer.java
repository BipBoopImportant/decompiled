package com.ingka.ikea.app.stockinfo.network;

import XH.C16814e;
import com.ingka.ikea.app.stockinfo.network.AvailabilityRemote;
import fK.C17247E;
import gK.C17294a;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/stockinfo/network/AvailabilityRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class AvailabilityRemote$$serializer implements N<AvailabilityRemote> {
    public static final AvailabilityRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AvailabilityRemote$$serializer availabilityRemote$$serializer = new AvailabilityRemote$$serializer();
        INSTANCE = availabilityRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.stockinfo.network.AvailabilityRemote", availabilityRemote$$serializer, 4);
        j02.p("availabilities", false);
        j02.p("errorStatus", false);
        j02.p("homeDeliveryPrice", false);
        j02.p("homeDeliveryTime", false);
        descriptor = j02;
    }

    private AvailabilityRemote$$serializer() {
    }

    /* renamed from: b */
    public final AvailabilityRemote deserialize(Decoder decoder) {
        AvailabilityRemote.HomeDeliveryTimeRemote homeDeliveryTimeRemote;
        AvailabilityRemote.HomeDeliveryPriceRemote homeDeliveryPriceRemote;
        List list;
        List list2;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = AvailabilityRemote.f92555e;
        List list3 = null;
        if (b10.q()) {
            list = (List) b10.A(serialDescriptor, 1, a10[1], null);
            list2 = (List) b10.A(serialDescriptor, 0, a10[0], null);
            homeDeliveryTimeRemote = (AvailabilityRemote.HomeDeliveryTimeRemote) b10.A(serialDescriptor, 3, AvailabilityRemote$HomeDeliveryTimeRemote$$serializer.INSTANCE, null);
            homeDeliveryPriceRemote = (AvailabilityRemote.HomeDeliveryPriceRemote) b10.A(serialDescriptor, 2, AvailabilityRemote$HomeDeliveryPriceRemote$$serializer.INSTANCE, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list4 = null;
            AvailabilityRemote.HomeDeliveryPriceRemote homeDeliveryPriceRemote2 = null;
            AvailabilityRemote.HomeDeliveryTimeRemote homeDeliveryTimeRemote2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    list3 = (List) b10.A(serialDescriptor, 0, a10[0], list3);
                    i11 |= 1;
                } else if (p10 == 1) {
                    list4 = (List) b10.A(serialDescriptor, 1, a10[1], list4);
                    i11 |= 2;
                } else if (p10 == 2) {
                    homeDeliveryPriceRemote2 = (AvailabilityRemote.HomeDeliveryPriceRemote) b10.A(serialDescriptor, 2, AvailabilityRemote$HomeDeliveryPriceRemote$$serializer.INSTANCE, homeDeliveryPriceRemote2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    homeDeliveryTimeRemote2 = (AvailabilityRemote.HomeDeliveryTimeRemote) b10.A(serialDescriptor, 3, AvailabilityRemote$HomeDeliveryTimeRemote$$serializer.INSTANCE, homeDeliveryTimeRemote2);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            list2 = list3;
            list = list4;
            homeDeliveryPriceRemote = homeDeliveryPriceRemote2;
            homeDeliveryTimeRemote = homeDeliveryTimeRemote2;
        }
        b10.c(serialDescriptor);
        return new AvailabilityRemote(i10, list2, list, homeDeliveryPriceRemote, homeDeliveryTimeRemote, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, AvailabilityRemote availabilityRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(availabilityRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        AvailabilityRemote.c(availabilityRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = AvailabilityRemote.f92555e;
        return new KSerializer[]{C17294a.u(a10[0]), C17294a.u(a10[1]), C17294a.u(AvailabilityRemote$HomeDeliveryPriceRemote$$serializer.INSTANCE), C17294a.u(AvailabilityRemote$HomeDeliveryTimeRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
