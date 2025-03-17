package com.ingka.ikea.mcomsettings.impl.network;

import XH.C16814e;
import com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote.RequiredTaxFieldRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredTaxFieldRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredTaxFieldRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote$RequiredTaxFieldRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class GooglePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer implements N<GooglePayExpressConfigRemote.RequiredTaxFieldRemote> {
    public static final GooglePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        GooglePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer googlePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer = new GooglePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer();
        INSTANCE = googlePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote.RequiredTaxFieldRemote", googlePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer, 5);
        j02.p("displayText", false);
        j02.p("regex", false);
        j02.p("showCountryOfOrigin", false);
        j02.p("taxCodeType", false);
        j02.p("requiresInput", false);
        descriptor = j02;
    }

    private GooglePayExpressConfigRemote$RequiredTaxFieldRemote$$serializer() {
    }

    /* renamed from: b */
    public final GooglePayExpressConfigRemote.RequiredTaxFieldRemote deserialize(Decoder decoder) {
        Boolean bool;
        String str;
        Boolean bool2;
        String str2;
        String str3;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        String str4 = null;
        if (b10.q()) {
            Y0 y02 = Y0.f144077a;
            C17457i iVar = C17457i.f144111a;
            str = (String) b10.A(serialDescriptor, 3, y02, null);
            bool = (Boolean) b10.A(serialDescriptor, 4, iVar, null);
            i10 = 31;
            bool2 = (Boolean) b10.A(serialDescriptor, 2, iVar, null);
            str2 = (String) b10.A(serialDescriptor, 1, y02, null);
            str3 = (String) b10.A(serialDescriptor, 0, y02, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str5 = null;
            Boolean bool3 = null;
            String str6 = null;
            Boolean bool4 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str4 = (String) b10.A(serialDescriptor, 0, Y0.f144077a, str4);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str5 = (String) b10.A(serialDescriptor, 1, Y0.f144077a, str5);
                    i11 |= 2;
                } else if (p10 == 2) {
                    bool3 = (Boolean) b10.A(serialDescriptor, 2, C17457i.f144111a, bool3);
                    i11 |= 4;
                } else if (p10 == 3) {
                    str6 = (String) b10.A(serialDescriptor, 3, Y0.f144077a, str6);
                    i11 |= 8;
                } else if (p10 == 4) {
                    bool4 = (Boolean) b10.A(serialDescriptor, 4, C17457i.f144111a, bool4);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str3 = str4;
            str2 = str5;
            bool2 = bool3;
            str = str6;
            bool = bool4;
        }
        b10.c(serialDescriptor);
        return new GooglePayExpressConfigRemote.RequiredTaxFieldRemote(i10, str3, str2, bool2, str, bool, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, GooglePayExpressConfigRemote.RequiredTaxFieldRemote requiredTaxFieldRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(requiredTaxFieldRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        GooglePayExpressConfigRemote.RequiredTaxFieldRemote.d(requiredTaxFieldRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, C17294a.u(iVar), C17294a.u(y02), C17294a.u(iVar)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
