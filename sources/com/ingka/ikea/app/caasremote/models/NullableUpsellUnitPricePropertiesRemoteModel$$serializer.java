package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17438C;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableUpsellUnitPricePropertiesRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableUpsellUnitPricePropertiesRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableUpsellUnitPricePropertiesRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableUpsellUnitPricePropertiesRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableUpsellUnitPricePropertiesRemoteModel$$serializer implements N<NullableUpsellUnitPricePropertiesRemoteModel> {
    public static final NullableUpsellUnitPricePropertiesRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableUpsellUnitPricePropertiesRemoteModel$$serializer nullableUpsellUnitPricePropertiesRemoteModel$$serializer = new NullableUpsellUnitPricePropertiesRemoteModel$$serializer();
        INSTANCE = nullableUpsellUnitPricePropertiesRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel", nullableUpsellUnitPricePropertiesRemoteModel$$serializer, 5);
        j02.p("exclTax", false);
        j02.p("inclTax", false);
        j02.p("tax", false);
        j02.p("validFromDate", false);
        j02.p("validToDate", false);
        descriptor = j02;
    }

    private NullableUpsellUnitPricePropertiesRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public NullableUpsellUnitPricePropertiesRemoteModel deserialize(Decoder decoder) {
        String str;
        String str2;
        Double d10;
        Double d11;
        Double d12;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        Double d13 = null;
        if (b10.q()) {
            C17438C c10 = C17438C.f144010a;
            Y0 y02 = Y0.f144077a;
            d10 = (Double) b10.A(descriptor2, 2, c10, null);
            str2 = (String) b10.A(descriptor2, 3, y02, null);
            str = (String) b10.A(descriptor2, 4, y02, null);
            i10 = 31;
            d11 = (Double) b10.A(descriptor2, 1, c10, null);
            d12 = (Double) b10.A(descriptor2, 0, c10, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            Double d14 = null;
            Double d15 = null;
            String str3 = null;
            String str4 = null;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    d13 = (Double) b10.A(descriptor2, 0, C17438C.f144010a, d13);
                    i11 |= 1;
                } else if (p10 == 1) {
                    d14 = (Double) b10.A(descriptor2, 1, C17438C.f144010a, d14);
                    i11 |= 2;
                } else if (p10 == 2) {
                    d15 = (Double) b10.A(descriptor2, 2, C17438C.f144010a, d15);
                    i11 |= 4;
                } else if (p10 == 3) {
                    str3 = (String) b10.A(descriptor2, 3, Y0.f144077a, str3);
                    i11 |= 8;
                } else if (p10 == 4) {
                    str4 = (String) b10.A(descriptor2, 4, Y0.f144077a, str4);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            d12 = d13;
            d11 = d14;
            d10 = d15;
            str2 = str3;
            str = str4;
        }
        b10.c(descriptor2);
        return new NullableUpsellUnitPricePropertiesRemoteModel(i10, d12, d11, d10, str2, str, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableUpsellUnitPricePropertiesRemoteModel nullableUpsellUnitPricePropertiesRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableUpsellUnitPricePropertiesRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableUpsellUnitPricePropertiesRemoteModel.b(nullableUpsellUnitPricePropertiesRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        C17438C c10 = C17438C.f144010a;
        KSerializer<?> u10 = C17294a.u(c10);
        KSerializer<?> u11 = C17294a.u(c10);
        KSerializer<?> u12 = C17294a.u(c10);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, u11, u12, C17294a.u(y02), C17294a.u(y02)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
