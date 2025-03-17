package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.M;
import jK.N;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableItemResponseInstallationServiceRemoteModel$$serializer implements N<NullableItemResponseInstallationServiceRemoteModel> {
    public static final NullableItemResponseInstallationServiceRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableItemResponseInstallationServiceRemoteModel$$serializer nullableItemResponseInstallationServiceRemoteModel$$serializer = new NullableItemResponseInstallationServiceRemoteModel$$serializer();
        INSTANCE = nullableItemResponseInstallationServiceRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel", nullableItemResponseInstallationServiceRemoteModel$$serializer, 4);
        j02.p("consents", false);
        j02.p("isAvailable", false);
        j02.p("price", false);
        j02.p("selectedItemQuantityForInstallation", false);
        descriptor = j02;
    }

    private NullableItemResponseInstallationServiceRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public NullableItemResponseInstallationServiceRemoteModel deserialize(Decoder decoder) {
        Float f10;
        NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel;
        Boolean bool;
        List list;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        KSerializer[] a10 = NullableItemResponseInstallationServiceRemoteModel.f71349e;
        List list2 = null;
        if (b10.q()) {
            list = (List) b10.o(descriptor2, 0, a10[0], null);
            bool = (Boolean) b10.A(descriptor2, 1, C17457i.f144111a, null);
            f10 = (Float) b10.A(descriptor2, 3, M.f144051a, null);
            nullableItemResponseInstallationServicePriceRemoteModel = (NullableItemResponseInstallationServicePriceRemoteModel) b10.A(descriptor2, 2, NullableItemResponseInstallationServicePriceRemoteModel$$serializer.INSTANCE, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Boolean bool2 = null;
            NullableItemResponseInstallationServicePriceRemoteModel nullableItemResponseInstallationServicePriceRemoteModel2 = null;
            Float f11 = null;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    list2 = (List) b10.o(descriptor2, 0, a10[0], list2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    bool2 = (Boolean) b10.A(descriptor2, 1, C17457i.f144111a, bool2);
                    i11 |= 2;
                } else if (p10 == 2) {
                    nullableItemResponseInstallationServicePriceRemoteModel2 = (NullableItemResponseInstallationServicePriceRemoteModel) b10.A(descriptor2, 2, NullableItemResponseInstallationServicePriceRemoteModel$$serializer.INSTANCE, nullableItemResponseInstallationServicePriceRemoteModel2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    f11 = (Float) b10.A(descriptor2, 3, M.f144051a, f11);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            list = list2;
            bool = bool2;
            nullableItemResponseInstallationServicePriceRemoteModel = nullableItemResponseInstallationServicePriceRemoteModel2;
            f10 = f11;
        }
        b10.c(descriptor2);
        return new NullableItemResponseInstallationServiceRemoteModel(i10, list, bool, nullableItemResponseInstallationServicePriceRemoteModel, f10, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableItemResponseInstallationServiceRemoteModel nullableItemResponseInstallationServiceRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableItemResponseInstallationServiceRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableItemResponseInstallationServiceRemoteModel.b(nullableItemResponseInstallationServiceRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{NullableItemResponseInstallationServiceRemoteModel.f71349e[0], C17294a.u(C17457i.f144111a), C17294a.u(NullableItemResponseInstallationServicePriceRemoteModel$$serializer.INSTANCE), C17294a.u(M.f144051a)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
