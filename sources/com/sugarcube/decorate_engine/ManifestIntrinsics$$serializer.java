package com.sugarcube.decorate_engine;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.C17438C;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/ManifestIntrinsics.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/ManifestIntrinsics;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/ManifestIntrinsics;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/ManifestIntrinsics;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ManifestIntrinsics$$serializer implements N<ManifestIntrinsics> {
    public static final ManifestIntrinsics$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ManifestIntrinsics$$serializer manifestIntrinsics$$serializer = new ManifestIntrinsics$$serializer();
        INSTANCE = manifestIntrinsics$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.ManifestIntrinsics", manifestIntrinsics$$serializer, 6);
        j02.p("fx", true);
        j02.p("fy", true);
        j02.p("cx", true);
        j02.p("cy", true);
        j02.p("w", true);
        j02.p("h", true);
        descriptor = j02;
    }

    private ManifestIntrinsics$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        C17438C c10 = C17438C.f144010a;
        X x10 = X.f144073a;
        return new KSerializer[]{c10, c10, c10, c10, x10, x10};
    }

    public ManifestIntrinsics deserialize(Decoder decoder) {
        int i10;
        int i11;
        double d10;
        double d11;
        double d12;
        double d13;
        int i12;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        if (b10.q()) {
            double H10 = b10.H(descriptor2, 0);
            double H11 = b10.H(descriptor2, 1);
            double H12 = b10.H(descriptor2, 2);
            double H13 = b10.H(descriptor2, 3);
            i11 = b10.j(descriptor2, 4);
            i10 = b10.j(descriptor2, 5);
            i12 = 63;
            d11 = H12;
            d13 = H10;
            d12 = H11;
            d10 = H13;
        } else {
            boolean z10 = true;
            int i13 = 0;
            double d14 = 0.0d;
            double d15 = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            int i14 = 0;
            int i15 = 0;
            while (z10) {
                int p10 = b10.p(descriptor2);
                switch (p10) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        d15 = b10.H(descriptor2, 0);
                        i15 |= 1;
                        continue;
                    case 1:
                        d16 = b10.H(descriptor2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        d14 = b10.H(descriptor2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        d17 = b10.H(descriptor2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        i13 = b10.j(descriptor2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        i14 = b10.j(descriptor2, 5);
                        i15 |= 32;
                        break;
                    default:
                        throw new C17247E(p10);
                }
            }
            i11 = i13;
            i10 = i14;
            i12 = i15;
            d11 = d14;
            d13 = d15;
            d12 = d16;
            d10 = d17;
        }
        b10.c(descriptor2);
        return new ManifestIntrinsics(i12, d13, d12, d11, d10, i11, i10, (T0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ManifestIntrinsics manifestIntrinsics) {
        C17542s.j(encoder, "encoder");
        C17542s.j(manifestIntrinsics, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ManifestIntrinsics.write$Self$decorate_engine_release(manifestIntrinsics, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
