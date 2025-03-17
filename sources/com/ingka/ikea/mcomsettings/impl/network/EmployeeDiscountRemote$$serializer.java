package com.ingka.ikea.mcomsettings.impl.network;

import XH.C16814e;
import com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class EmployeeDiscountRemote$$serializer implements N<EmployeeDiscountRemote> {
    public static final EmployeeDiscountRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EmployeeDiscountRemote$$serializer employeeDiscountRemote$$serializer = new EmployeeDiscountRemote$$serializer();
        INSTANCE = employeeDiscountRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote", employeeDiscountRemote$$serializer, 3);
        j02.p("enabled", false);
        j02.p("card", false);
        j02.p("readMore", false);
        descriptor = j02;
    }

    private EmployeeDiscountRemote$$serializer() {
    }

    /* renamed from: b */
    public final EmployeeDiscountRemote deserialize(Decoder decoder) {
        EmployeeDiscountRemote.ReadMoreRemote readMoreRemote;
        EmployeeDiscountRemote.CardRemote cardRemote;
        Boolean bool;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        Boolean bool2 = null;
        if (b10.q()) {
            bool = (Boolean) b10.A(serialDescriptor, 0, C17457i.f144111a, null);
            readMoreRemote = (EmployeeDiscountRemote.ReadMoreRemote) b10.A(serialDescriptor, 2, EmployeeDiscountRemote$ReadMoreRemote$$serializer.INSTANCE, null);
            cardRemote = (EmployeeDiscountRemote.CardRemote) b10.A(serialDescriptor, 1, EmployeeDiscountRemote$CardRemote$$serializer.INSTANCE, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            EmployeeDiscountRemote.CardRemote cardRemote2 = null;
            EmployeeDiscountRemote.ReadMoreRemote readMoreRemote2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    bool2 = (Boolean) b10.A(serialDescriptor, 0, C17457i.f144111a, bool2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    cardRemote2 = (EmployeeDiscountRemote.CardRemote) b10.A(serialDescriptor, 1, EmployeeDiscountRemote$CardRemote$$serializer.INSTANCE, cardRemote2);
                    i11 |= 2;
                } else if (p10 == 2) {
                    readMoreRemote2 = (EmployeeDiscountRemote.ReadMoreRemote) b10.A(serialDescriptor, 2, EmployeeDiscountRemote$ReadMoreRemote$$serializer.INSTANCE, readMoreRemote2);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            bool = bool2;
            cardRemote = cardRemote2;
            readMoreRemote = readMoreRemote2;
        }
        b10.c(serialDescriptor);
        return new EmployeeDiscountRemote(i10, bool, cardRemote, readMoreRemote, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, EmployeeDiscountRemote employeeDiscountRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(employeeDiscountRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        EmployeeDiscountRemote.b(employeeDiscountRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17294a.u(C17457i.f144111a), C17294a.u(EmployeeDiscountRemote$CardRemote$$serializer.INSTANCE), C17294a.u(EmployeeDiscountRemote$ReadMoreRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
