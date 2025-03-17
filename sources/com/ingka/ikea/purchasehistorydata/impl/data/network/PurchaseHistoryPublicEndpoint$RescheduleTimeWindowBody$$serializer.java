package com.ingka.ikea.purchasehistorydata.impl.data.network;

import XH.C16814e;
import com.ingka.ikea.purchasehistorydata.impl.data.network.PurchaseHistoryPublicEndpoint;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody.$serializer", "LjK/N;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/purchasehistorydata/impl/data/network/PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer implements N<PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody> {
    public static final PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f119401a = 8;
    private static final SerialDescriptor descriptor;

    static {
        PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer purchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer = new PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer();
        INSTANCE = purchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer;
        J0 j02 = new J0("com.ingka.ikea.purchasehistorydata.impl.data.network.PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody", purchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer, 2);
        j02.p("token", false);
        j02.p("selectedTimeWindows", false);
        descriptor = j02;
    }

    private PurchaseHistoryPublicEndpoint$RescheduleTimeWindowBody$$serializer() {
    }

    /* renamed from: b */
    public final PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody deserialize(Decoder decoder) {
        int i10;
        String str;
        List list;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        KSerializer[] a10 = PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody.f119408d;
        if (b10.q()) {
            str = b10.n(serialDescriptor, 0);
            list = (List) b10.o(serialDescriptor, 1, a10[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list2 = null;
            String str2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str2 = b10.n(serialDescriptor, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    list2 = (List) b10.o(serialDescriptor, 1, a10[1], list2);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            list = list2;
            str = str2;
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody(i10, str, list, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody rescheduleTimeWindowBody) {
        C17542s.j(encoder, "encoder");
        C17542s.j(rescheduleTimeWindowBody, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody.b(rescheduleTimeWindowBody, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Y0.f144077a, PurchaseHistoryPublicEndpoint.RescheduleTimeWindowBody.f119408d[1]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
