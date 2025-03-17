package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableAssemblyServiceResponseRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceResponseRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceResponseRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceResponseRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableAssemblyServiceResponseRemoteModel$$serializer implements N<NullableAssemblyServiceResponseRemoteModel> {
    public static final NullableAssemblyServiceResponseRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableAssemblyServiceResponseRemoteModel$$serializer nullableAssemblyServiceResponseRemoteModel$$serializer = new NullableAssemblyServiceResponseRemoteModel$$serializer();
        INSTANCE = nullableAssemblyServiceResponseRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceResponseRemoteModel", nullableAssemblyServiceResponseRemoteModel$$serializer, 5);
        j02.p("config", false);
        j02.p(UiComponentContainer.RESULT_ERROR, false);
        j02.p("isAnyItemEligibleForAssembly", false);
        j02.p("isAvailableForPostCode", false);
        j02.p("isAvailableForRU", false);
        descriptor = j02;
    }

    private NullableAssemblyServiceResponseRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public NullableAssemblyServiceResponseRemoteModel deserialize(Decoder decoder) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        NullableServiceErrorResponseRemoteModel nullableServiceErrorResponseRemoteModel;
        NullableAssemblyServiceResponseConfigRemoteModel nullableAssemblyServiceResponseConfigRemoteModel;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        NullableAssemblyServiceResponseConfigRemoteModel nullableAssemblyServiceResponseConfigRemoteModel2 = null;
        if (b10.q()) {
            C17457i iVar = C17457i.f144111a;
            nullableAssemblyServiceResponseConfigRemoteModel = (NullableAssemblyServiceResponseConfigRemoteModel) b10.A(descriptor2, 0, NullableAssemblyServiceResponseConfigRemoteModel$$serializer.INSTANCE, null);
            bool2 = (Boolean) b10.A(descriptor2, 3, iVar, null);
            bool = (Boolean) b10.A(descriptor2, 4, iVar, null);
            bool3 = (Boolean) b10.A(descriptor2, 2, iVar, null);
            nullableServiceErrorResponseRemoteModel = (NullableServiceErrorResponseRemoteModel) b10.A(descriptor2, 1, NullableServiceErrorResponseRemoteModel$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            NullableServiceErrorResponseRemoteModel nullableServiceErrorResponseRemoteModel2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    nullableAssemblyServiceResponseConfigRemoteModel2 = (NullableAssemblyServiceResponseConfigRemoteModel) b10.A(descriptor2, 0, NullableAssemblyServiceResponseConfigRemoteModel$$serializer.INSTANCE, nullableAssemblyServiceResponseConfigRemoteModel2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    nullableServiceErrorResponseRemoteModel2 = (NullableServiceErrorResponseRemoteModel) b10.A(descriptor2, 1, NullableServiceErrorResponseRemoteModel$$serializer.INSTANCE, nullableServiceErrorResponseRemoteModel2);
                    i11 |= 2;
                } else if (p10 == 2) {
                    bool4 = (Boolean) b10.A(descriptor2, 2, C17457i.f144111a, bool4);
                    i11 |= 4;
                } else if (p10 == 3) {
                    bool5 = (Boolean) b10.A(descriptor2, 3, C17457i.f144111a, bool5);
                    i11 |= 8;
                } else if (p10 == 4) {
                    bool6 = (Boolean) b10.A(descriptor2, 4, C17457i.f144111a, bool6);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            nullableAssemblyServiceResponseConfigRemoteModel = nullableAssemblyServiceResponseConfigRemoteModel2;
            nullableServiceErrorResponseRemoteModel = nullableServiceErrorResponseRemoteModel2;
            bool3 = bool4;
            bool2 = bool5;
            bool = bool6;
        }
        b10.c(descriptor2);
        return new NullableAssemblyServiceResponseRemoteModel(i10, nullableAssemblyServiceResponseConfigRemoteModel, nullableServiceErrorResponseRemoteModel, bool3, bool2, bool, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableAssemblyServiceResponseRemoteModel nullableAssemblyServiceResponseRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableAssemblyServiceResponseRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableAssemblyServiceResponseRemoteModel.a(nullableAssemblyServiceResponseRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(NullableAssemblyServiceResponseConfigRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(NullableServiceErrorResponseRemoteModel$$serializer.INSTANCE);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
