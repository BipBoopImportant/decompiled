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
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class SalesLocationRemoteModel$$serializer implements N<SalesLocationRemoteModel> {
    public static final SalesLocationRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        SalesLocationRemoteModel$$serializer salesLocationRemoteModel$$serializer = new SalesLocationRemoteModel$$serializer();
        INSTANCE = salesLocationRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.SalesLocationRemoteModel", salesLocationRemoteModel$$serializer, 4);
        j02.p("aisleAndBin", false);
        j02.p("department", false);
        j02.p("fullServe", false);
        j02.p("recommendationRank", false);
        descriptor = j02;
    }

    private SalesLocationRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public SalesLocationRemoteModel deserialize(Decoder decoder) {
        int i10;
        boolean z10;
        NullableSalesLocationDepartmentRemoteModel nullableSalesLocationDepartmentRemoteModel;
        NullableSalesLocationAisleAndBinRemoteModel nullableSalesLocationAisleAndBinRemoteModel;
        int i11;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        if (b10.q()) {
            boolean D10 = b10.D(descriptor2, 2);
            nullableSalesLocationAisleAndBinRemoteModel = (NullableSalesLocationAisleAndBinRemoteModel) b10.A(descriptor2, 0, NullableSalesLocationAisleAndBinRemoteModel$$serializer.INSTANCE, null);
            i10 = b10.j(descriptor2, 3);
            z10 = D10;
            nullableSalesLocationDepartmentRemoteModel = (NullableSalesLocationDepartmentRemoteModel) b10.A(descriptor2, 1, NullableSalesLocationDepartmentRemoteModel$$serializer.INSTANCE, null);
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            int i13 = 0;
            NullableSalesLocationAisleAndBinRemoteModel nullableSalesLocationAisleAndBinRemoteModel2 = null;
            NullableSalesLocationDepartmentRemoteModel nullableSalesLocationDepartmentRemoteModel2 = null;
            boolean z12 = false;
            while (z11) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z11 = false;
                } else if (p10 == 0) {
                    nullableSalesLocationAisleAndBinRemoteModel2 = (NullableSalesLocationAisleAndBinRemoteModel) b10.A(descriptor2, 0, NullableSalesLocationAisleAndBinRemoteModel$$serializer.INSTANCE, nullableSalesLocationAisleAndBinRemoteModel2);
                    i13 |= 1;
                } else if (p10 == 1) {
                    nullableSalesLocationDepartmentRemoteModel2 = (NullableSalesLocationDepartmentRemoteModel) b10.A(descriptor2, 1, NullableSalesLocationDepartmentRemoteModel$$serializer.INSTANCE, nullableSalesLocationDepartmentRemoteModel2);
                    i13 |= 2;
                } else if (p10 == 2) {
                    z12 = b10.D(descriptor2, 2);
                    i13 |= 4;
                } else if (p10 == 3) {
                    i12 = b10.j(descriptor2, 3);
                    i13 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i12;
            z10 = z12;
            i11 = i13;
            nullableSalesLocationAisleAndBinRemoteModel = nullableSalesLocationAisleAndBinRemoteModel2;
            nullableSalesLocationDepartmentRemoteModel = nullableSalesLocationDepartmentRemoteModel2;
        }
        b10.c(descriptor2);
        return new SalesLocationRemoteModel(i11, nullableSalesLocationAisleAndBinRemoteModel, nullableSalesLocationDepartmentRemoteModel, z10, i10, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, SalesLocationRemoteModel salesLocationRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(salesLocationRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        SalesLocationRemoteModel.d(salesLocationRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17294a.u(NullableSalesLocationAisleAndBinRemoteModel$$serializer.INSTANCE), C17294a.u(NullableSalesLocationDepartmentRemoteModel$$serializer.INSTANCE), C17457i.f144111a, X.f144073a};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
