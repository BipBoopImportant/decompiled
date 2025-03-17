package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountValidityRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountValidityRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountValidityRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableCartProximityDiscountValidityRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableCartProximityDiscountValidityRemoteModel$$serializer implements N<NullableCartProximityDiscountValidityRemoteModel> {
    public static final NullableCartProximityDiscountValidityRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableCartProximityDiscountValidityRemoteModel$$serializer nullableCartProximityDiscountValidityRemoteModel$$serializer = new NullableCartProximityDiscountValidityRemoteModel$$serializer();
        INSTANCE = nullableCartProximityDiscountValidityRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel", nullableCartProximityDiscountValidityRemoteModel$$serializer, 2);
        j02.p("endDate", false);
        j02.p("startDate", false);
        descriptor = j02;
    }

    private NullableCartProximityDiscountValidityRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public NullableCartProximityDiscountValidityRemoteModel deserialize(Decoder decoder) {
        String str;
        int i10;
        String str2;
        C17542s.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder.b(descriptor2);
        if (b10.q()) {
            Y0 y02 = Y0.f144077a;
            str = (String) b10.A(descriptor2, 0, y02, null);
            str2 = (String) b10.A(descriptor2, 1, y02, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            str2 = null;
            String str3 = null;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str3 = (String) b10.A(descriptor2, 0, Y0.f144077a, str3);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str2 = (String) b10.A(descriptor2, 1, Y0.f144077a, str2);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str = str3;
        }
        b10.c(descriptor2);
        return new NullableCartProximityDiscountValidityRemoteModel(i10, str, str2, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableCartProximityDiscountValidityRemoteModel nullableCartProximityDiscountValidityRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableCartProximityDiscountValidityRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableCartProximityDiscountValidityRemoteModel.a(nullableCartProximityDiscountValidityRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
