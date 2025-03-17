package com.ingka.ikea.prepaidcarddata.impl.data.model.remote;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/prepaidcarddata/impl/data/model/remote/AttachDetachRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/AttachDetachRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/AttachDetachRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/AttachDetachRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class AttachDetachRemote$$serializer implements N<AttachDetachRemote> {
    public static final AttachDetachRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AttachDetachRemote$$serializer attachDetachRemote$$serializer = new AttachDetachRemote$$serializer();
        INSTANCE = attachDetachRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.prepaidcarddata.impl.data.model.remote.AttachDetachRemote", attachDetachRemote$$serializer, 5);
        j02.p("status", false);
        j02.p("type", false);
        j02.p("title", false);
        j02.p("detail", false);
        j02.p("instance", false);
        descriptor = j02;
    }

    private AttachDetachRemote$$serializer() {
    }

    /* renamed from: b */
    public final AttachDetachRemote deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        Integer num2 = null;
        if (b10.q()) {
            Y0 y02 = Y0.f144077a;
            num = (Integer) b10.A(serialDescriptor, 0, X.f144073a, null);
            str2 = (String) b10.A(serialDescriptor, 3, y02, null);
            str = (String) b10.A(serialDescriptor, 4, y02, null);
            str3 = (String) b10.A(serialDescriptor, 2, y02, null);
            str4 = (String) b10.A(serialDescriptor, 1, y02, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    num2 = (Integer) b10.A(serialDescriptor, 0, X.f144073a, num2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str5 = (String) b10.A(serialDescriptor, 1, Y0.f144077a, str5);
                    i11 |= 2;
                } else if (p10 == 2) {
                    str6 = (String) b10.A(serialDescriptor, 2, Y0.f144077a, str6);
                    i11 |= 4;
                } else if (p10 == 3) {
                    str7 = (String) b10.A(serialDescriptor, 3, Y0.f144077a, str7);
                    i11 |= 8;
                } else if (p10 == 4) {
                    str8 = (String) b10.A(serialDescriptor, 4, Y0.f144077a, str8);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            num = num2;
            str4 = str5;
            str3 = str6;
            str2 = str7;
            str = str8;
        }
        b10.c(serialDescriptor);
        return new AttachDetachRemote(i10, num, str4, str3, str2, str, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, AttachDetachRemote attachDetachRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(attachDetachRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        AttachDetachRemote.a(attachDetachRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(X.f144073a);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
