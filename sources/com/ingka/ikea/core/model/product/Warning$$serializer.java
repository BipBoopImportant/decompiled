package com.ingka.ikea.core.model.product;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/model/product/Warning.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/model/product/Warning;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/model/product/Warning;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/model/product/Warning;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class Warning$$serializer implements N<Warning> {
    public static final Warning$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Warning$$serializer warning$$serializer = new Warning$$serializer();
        INSTANCE = warning$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.model.product.Warning", warning$$serializer, 4);
        j02.p("imageType", false);
        j02.p("text", false);
        j02.p("boldText", false);
        j02.p("moreInfo", false);
        descriptor = j02;
    }

    private Warning$$serializer() {
    }

    /* renamed from: b */
    public final Warning deserialize(Decoder decoder) {
        WarningMoreInfo warningMoreInfo;
        String str;
        String str2;
        WarningImageType warningImageType;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = Warning.f95167e;
        WarningImageType warningImageType2 = null;
        if (b10.q()) {
            String n10 = b10.n(serialDescriptor, 1);
            warningImageType = (WarningImageType) b10.o(serialDescriptor, 0, a10[0], null);
            str2 = n10;
            warningMoreInfo = (WarningMoreInfo) b10.A(serialDescriptor, 3, WarningMoreInfo$$serializer.INSTANCE, null);
            str = (String) b10.A(serialDescriptor, 2, Y0.f144077a, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str3 = null;
            String str4 = null;
            WarningMoreInfo warningMoreInfo2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    warningImageType2 = (WarningImageType) b10.o(serialDescriptor, 0, a10[0], warningImageType2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str3 = b10.n(serialDescriptor, 1);
                    i11 |= 2;
                } else if (p10 == 2) {
                    str4 = (String) b10.A(serialDescriptor, 2, Y0.f144077a, str4);
                    i11 |= 4;
                } else if (p10 == 3) {
                    warningMoreInfo2 = (WarningMoreInfo) b10.A(serialDescriptor, 3, WarningMoreInfo$$serializer.INSTANCE, warningMoreInfo2);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            warningImageType = warningImageType2;
            str2 = str3;
            str = str4;
            warningMoreInfo = warningMoreInfo2;
        }
        b10.c(serialDescriptor);
        return new Warning(i10, warningImageType, str2, str, warningMoreInfo, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, Warning warning) {
        C17542s.j(encoder, "encoder");
        C17542s.j(warning, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        Warning.f(warning, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = Warning.f95167e[0];
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{kSerializer, y02, C17294a.u(y02), C17294a.u(WarningMoreInfo$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
