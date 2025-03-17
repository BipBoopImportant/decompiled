package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.C17438C;
import jK.C17457i;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableAssemblyServiceResponseConfigRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceResponseConfigRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceResponseConfigRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceResponseConfigRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableAssemblyServiceResponseConfigRemoteModel$$serializer implements N<NullableAssemblyServiceResponseConfigRemoteModel> {
    public static final NullableAssemblyServiceResponseConfigRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableAssemblyServiceResponseConfigRemoteModel$$serializer nullableAssemblyServiceResponseConfigRemoteModel$$serializer = new NullableAssemblyServiceResponseConfigRemoteModel$$serializer();
        INSTANCE = nullableAssemblyServiceResponseConfigRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceResponseConfigRemoteModel", nullableAssemblyServiceResponseConfigRemoteModel$$serializer, 7);
        j02.p("basePrice", false);
        j02.p("basePriceType", false);
        j02.p("id", false);
        j02.p("payToProvider", false);
        j02.p("provider", false);
        j02.p("secureIt", false);
        j02.p("type", false);
        descriptor = j02;
    }

    private NullableAssemblyServiceResponseConfigRemoteModel$$serializer() {
    }

    /* renamed from: b */
    public NullableAssemblyServiceResponseConfigRemoteModel deserialize(Decoder decoder) {
        String str;
        boolean z10;
        String str2;
        boolean z11;
        String str3;
        String str4;
        double d10;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        if (b10.q()) {
            double H10 = b10.H(descriptor2, 0);
            String n10 = b10.n(descriptor2, 1);
            String n11 = b10.n(descriptor2, 2);
            boolean D10 = b10.D(descriptor2, 3);
            String n12 = b10.n(descriptor2, 4);
            boolean D11 = b10.D(descriptor2, 5);
            str4 = n10;
            str = b10.n(descriptor2, 6);
            z10 = D11;
            z11 = D10;
            str2 = n12;
            str3 = n11;
            i10 = 127;
            d10 = H10;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            boolean z12 = true;
            boolean z13 = false;
            int i11 = 0;
            double d11 = 0.0d;
            String str8 = null;
            boolean z14 = false;
            while (z12) {
                int p10 = b10.p(descriptor2);
                switch (p10) {
                    case -1:
                        z12 = false;
                        continue;
                    case 0:
                        d11 = b10.H(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str5 = b10.n(descriptor2, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        str7 = b10.n(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        z13 = b10.D(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        str6 = b10.n(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        z14 = b10.D(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        str8 = b10.n(descriptor2, 6);
                        i11 |= 64;
                        break;
                    default:
                        throw new C17247E(p10);
                }
            }
            str4 = str5;
            str = str8;
            z10 = z14;
            z11 = z13;
            str2 = str6;
            str3 = str7;
            i10 = i11;
            d10 = d11;
        }
        b10.c(descriptor2);
        return new NullableAssemblyServiceResponseConfigRemoteModel(i10, d10, str4, str3, z11, str2, z10, str, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableAssemblyServiceResponseConfigRemoteModel nullableAssemblyServiceResponseConfigRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableAssemblyServiceResponseConfigRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableAssemblyServiceResponseConfigRemoteModel.a(nullableAssemblyServiceResponseConfigRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{C17438C.f144010a, y02, y02, iVar, y02, iVar, y02};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
