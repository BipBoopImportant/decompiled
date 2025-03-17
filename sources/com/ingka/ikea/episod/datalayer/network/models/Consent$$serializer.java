package com.ingka.ikea.episod.datalayer.network.models;

import XH.C16814e;
import fK.C17247E;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/episod/datalayer/network/models/Consent.$serializer", "LjK/N;", "Lcom/ingka/ikea/episod/datalayer/network/models/Consent;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/episod/datalayer/network/models/Consent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/episod/datalayer/network/models/Consent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class Consent$$serializer implements N<Consent> {
    public static final Consent$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        Consent$$serializer consent$$serializer = new Consent$$serializer();
        INSTANCE = consent$$serializer;
        J0 j02 = new J0("com.ingka.ikea.episod.datalayer.network.models.Consent", consent$$serializer, 3);
        j02.p("analytics", false);
        j02.p("marketing", false);
        j02.p("personalisation", false);
        descriptor = j02;
    }

    private Consent$$serializer() {
    }

    /* renamed from: b */
    public Consent deserialize(Decoder decoder) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        if (b10.q()) {
            boolean D10 = b10.D(descriptor2, 0);
            boolean D11 = b10.D(descriptor2, 1);
            z12 = D10;
            z10 = b10.D(descriptor2, 2);
            z11 = D11;
            i10 = 7;
        } else {
            boolean z13 = true;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int i11 = 0;
            while (z13) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z13 = false;
                } else if (p10 == 0) {
                    z14 = b10.D(descriptor2, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    z16 = b10.D(descriptor2, 1);
                    i11 |= 2;
                } else if (p10 == 2) {
                    z15 = b10.D(descriptor2, 2);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            z12 = z14;
            z10 = z15;
            z11 = z16;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new Consent(i10, z12, z11, z10, (T0) null);
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, Consent consent) {
        C17542s.j(encoder, "encoder");
        C17542s.j(consent, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        Consent.a(consent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{iVar, iVar, iVar};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
