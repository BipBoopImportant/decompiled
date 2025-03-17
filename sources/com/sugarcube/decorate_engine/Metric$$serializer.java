package com.sugarcube.decorate_engine;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sugarcube/decorate_engine/Metric.$serializer", "LjK/N;", "Lcom/sugarcube/decorate_engine/Metric;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/Metric;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/Metric;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class Metric$$serializer implements N<Metric> {
    public static final Metric$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        Metric$$serializer metric$$serializer = new Metric$$serializer();
        INSTANCE = metric$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate_engine.Metric", metric$$serializer, 3);
        j02.p("name", false);
        j02.p("value", true);
        j02.p("context", true);
        descriptor = j02;
    }

    private Metric$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, C17438C.f144010a, C17294a.u(y02)};
    }

    public Metric deserialize(Decoder decoder) {
        String str;
        double d10;
        String str2;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder2.b(descriptor2);
        if (b10.q()) {
            String n10 = b10.n(descriptor2, 0);
            double H10 = b10.H(descriptor2, 1);
            str2 = n10;
            str = (String) b10.A(descriptor2, 2, Y0.f144077a, null);
            d10 = H10;
            i10 = 7;
        } else {
            double d11 = 0.0d;
            boolean z10 = true;
            String str3 = null;
            String str4 = null;
            int i11 = 0;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str3 = b10.n(descriptor2, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    d11 = b10.H(descriptor2, 1);
                    i11 |= 2;
                } else if (p10 == 2) {
                    str4 = (String) b10.A(descriptor2, 2, Y0.f144077a, str4);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            str2 = str3;
            i10 = i11;
            d10 = d11;
            str = str4;
        }
        b10.c(descriptor2);
        return new Metric(i10, str2, d10, str, (T0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, Metric metric) {
        C17542s.j(encoder, "encoder");
        C17542s.j(metric, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        Metric.write$Self$decorate_engine_release(metric, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
