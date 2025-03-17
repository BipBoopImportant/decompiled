package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/ChildItemAvailabilityRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ChildItemAvailabilityRemoteModel$$serializer implements N<ChildItemAvailabilityRemoteModel> {
    public static final ChildItemAvailabilityRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ChildItemAvailabilityRemoteModel$$serializer childItemAvailabilityRemoteModel$$serializer = new ChildItemAvailabilityRemoteModel$$serializer();
        INSTANCE = childItemAvailabilityRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.ChildItemAvailabilityRemoteModel", childItemAvailabilityRemoteModel$$serializer, 3);
        j02.p("available", false);
        j02.p("deliveryMethods", false);
        j02.p("itemNo", false);
        descriptor = j02;
    }

    private ChildItemAvailabilityRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public ChildItemAvailabilityRemoteModel deserialize(Decoder decoder) {
        String str;
        List list;
        boolean z10;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        KSerializer[] a10 = ChildItemAvailabilityRemoteModel.f71101d;
        if (b10.q()) {
            boolean D10 = b10.D(descriptor2, 0);
            list = (List) b10.A(descriptor2, 1, a10[1], null);
            z10 = D10;
            str = b10.n(descriptor2, 2);
            i10 = 7;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            List list2 = null;
            String str2 = null;
            int i11 = 0;
            while (z11) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z11 = false;
                } else if (p10 == 0) {
                    z12 = b10.D(descriptor2, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    list2 = (List) b10.A(descriptor2, 1, a10[1], list2);
                    i11 |= 2;
                } else if (p10 == 2) {
                    str2 = b10.n(descriptor2, 2);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            z10 = z12;
            i10 = i11;
            list = list2;
            str = str2;
        }
        b10.c(descriptor2);
        return new ChildItemAvailabilityRemoteModel(i10, z10, list, str, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, ChildItemAvailabilityRemoteModel childItemAvailabilityRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(childItemAvailabilityRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ChildItemAvailabilityRemoteModel.b(childItemAvailabilityRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17457i.f144111a, C17294a.u(ChildItemAvailabilityRemoteModel.f71101d[1]), Y0.f144077a};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
