package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17247E;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/ApiNotFoundErrorRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/ApiNotFoundErrorRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/ApiNotFoundErrorRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/ApiNotFoundErrorRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ApiNotFoundErrorRemoteModel$$serializer implements N<ApiNotFoundErrorRemoteModel> {
    public static final ApiNotFoundErrorRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ApiNotFoundErrorRemoteModel$$serializer apiNotFoundErrorRemoteModel$$serializer = new ApiNotFoundErrorRemoteModel$$serializer();
        INSTANCE = apiNotFoundErrorRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.ApiNotFoundErrorRemoteModel", apiNotFoundErrorRemoteModel$$serializer, 5);
        j02.p("errors", false);
        j02.p("reference", false);
        j02.p("title", false);
        j02.p("success", false);
        j02.p("type", false);
        descriptor = j02;
    }

    private ApiNotFoundErrorRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public ApiNotFoundErrorRemoteModel deserialize(Decoder decoder) {
        String str;
        boolean z10;
        String str2;
        String str3;
        List list;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        KSerializer[] a10 = ApiNotFoundErrorRemoteModel.f71056f;
        if (b10.q()) {
            String n10 = b10.n(descriptor2, 1);
            String n11 = b10.n(descriptor2, 2);
            boolean D10 = b10.D(descriptor2, 3);
            list = (List) b10.o(descriptor2, 0, a10[0], null);
            str3 = n10;
            z10 = D10;
            str = b10.n(descriptor2, 4);
            str2 = n11;
            i10 = 31;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            List list2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i11 = 0;
            while (z11) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z11 = false;
                } else if (p10 == 0) {
                    list2 = (List) b10.o(descriptor2, 0, a10[0], list2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str4 = b10.n(descriptor2, 1);
                    i11 |= 2;
                } else if (p10 == 2) {
                    str5 = b10.n(descriptor2, 2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    z12 = b10.D(descriptor2, 3);
                    i11 |= 8;
                } else if (p10 == 4) {
                    str6 = b10.n(descriptor2, 4);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            z10 = z12;
            i10 = i11;
            list = list2;
            str3 = str4;
            str2 = str5;
            str = str6;
        }
        b10.c(descriptor2);
        return new ApiNotFoundErrorRemoteModel(i10, list, str3, str2, z10, str, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, ApiNotFoundErrorRemoteModel apiNotFoundErrorRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(apiNotFoundErrorRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ApiNotFoundErrorRemoteModel.b(apiNotFoundErrorRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{ApiNotFoundErrorRemoteModel.f71056f[0], y02, y02, C17457i.f144111a, y02};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
