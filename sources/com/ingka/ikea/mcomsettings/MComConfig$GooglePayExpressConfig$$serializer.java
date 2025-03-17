package com.ingka.ikea.mcomsettings;

import XH.C16814e;
import com.ingka.ikea.mcomsettings.MComConfig;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/mcomsettings/MComConfig.GooglePayExpressConfig.$serializer", "LjK/N;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class MComConfig$GooglePayExpressConfig$$serializer implements N<MComConfig.GooglePayExpressConfig> {
    public static final MComConfig$GooglePayExpressConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MComConfig$GooglePayExpressConfig$$serializer mComConfig$GooglePayExpressConfig$$serializer = new MComConfig$GooglePayExpressConfig$$serializer();
        INSTANCE = mComConfig$GooglePayExpressConfig$$serializer;
        J0 j02 = new J0("com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig", mComConfig$GooglePayExpressConfig$$serializer, 8);
        j02.p("cardAuthMethods", false);
        j02.p("cardNetworks", false);
        j02.p("termsAndConditionsLink", false);
        j02.p("privacyPolicyLink", false);
        j02.p("requiredTaxFields", true);
        j02.p("fiscalCodeField", true);
        j02.p("requiredRecipientFields", true);
        j02.p("countriesOfOrigin", true);
        descriptor = j02;
    }

    private MComConfig$GooglePayExpressConfig$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$FiscalCodeField} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c9, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ca, code lost:
        r7 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig.f96572i
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 7
            r8 = 6
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0072
            r3 = r2[r11]
            java.lang.Object r3 = r0.o(r1, r11, r3, r12)
            java.util.List r3 = (java.util.List) r3
            r11 = r2[r10]
            java.lang.Object r10 = r0.o(r1, r10, r11, r12)
            java.util.List r10 = (java.util.List) r10
            java.lang.String r6 = r0.n(r1, r6)
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r11, r12)
            java.lang.String r5 = (java.lang.String) r5
            r11 = r2[r9]
            java.lang.Object r9 = r0.A(r1, r9, r11, r12)
            java.util.List r9 = (java.util.List) r9
            com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$FiscalCodeField$$serializer r11 = com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$FiscalCodeField$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r11, r12)
            com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$FiscalCodeField r4 = (com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig.FiscalCodeField) r4
            r11 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r11, r12)
            java.util.List r8 = (java.util.List) r8
            r2 = r2[r7]
            java.lang.Object r2 = r0.A(r1, r7, r2, r12)
            java.util.List r2 = (java.util.List) r2
            r7 = 255(0xff, float:3.57E-43)
            r26 = r2
            r19 = r3
            r24 = r4
            r22 = r5
            r21 = r6
            r18 = r7
            r25 = r8
            r23 = r9
            r20 = r10
            goto L_0x0109
        L_0x0072:
            r16 = r10
            r3 = r11
            r5 = r12
            r6 = r5
            r10 = r6
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007c:
            if (r16 == 0) goto L_0x00f7
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00f2;
                case 0: goto L_0x00e4;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a2;
                case 6: goto L_0x0097;
                case 7: goto L_0x008b;
                default: goto L_0x0085;
            }
        L_0x0085:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x008b:
            r9 = r2[r7]
            java.lang.Object r5 = r0.A(r1, r7, r9, r5)
            java.util.List r5 = (java.util.List) r5
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0095:
            r9 = 4
            goto L_0x007c
        L_0x0097:
            r9 = r2[r8]
            java.lang.Object r6 = r0.A(r1, r8, r9, r6)
            java.util.List r6 = (java.util.List) r6
            r3 = r3 | 64
            goto L_0x0095
        L_0x00a2:
            com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$FiscalCodeField$$serializer r9 = com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$FiscalCodeField$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r4, r9, r10)
            r10 = r9
            com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$FiscalCodeField r10 = (com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig.FiscalCodeField) r10
            r3 = r3 | 32
            goto L_0x0095
        L_0x00ae:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r4 = r0.A(r1, r9, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 16
            r4 = 5
            goto L_0x007c
        L_0x00bc:
            r9 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r7 = 3
            java.lang.Object r4 = r0.A(r1, r7, r4, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 8
        L_0x00c9:
            r4 = 5
        L_0x00ca:
            r7 = 7
            goto L_0x007c
        L_0x00cc:
            r4 = 2
            r7 = 3
            r9 = 4
            java.lang.String r14 = r0.n(r1, r4)
            r3 = r3 | 4
            goto L_0x00c9
        L_0x00d6:
            r4 = 1
            r9 = 4
            r7 = r2[r4]
            java.lang.Object r7 = r0.o(r1, r4, r7, r13)
            r13 = r7
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 2
            goto L_0x00c9
        L_0x00e4:
            r7 = 0
            r9 = 4
            r4 = r2[r7]
            java.lang.Object r4 = r0.o(r1, r7, r4, r12)
            r12 = r4
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 1
            goto L_0x00c9
        L_0x00f2:
            r7 = 0
            r9 = 4
            r16 = r7
            goto L_0x00ca
        L_0x00f7:
            r18 = r3
            r26 = r5
            r25 = r6
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x0109:
            r0.c(r1)
            com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig r0 = new com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, MComConfig.GooglePayExpressConfig googlePayExpressConfig) {
        C17542s.j(encoder, "encoder");
        C17542s.j(googlePayExpressConfig, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        MComConfig.GooglePayExpressConfig.j(googlePayExpressConfig, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = MComConfig.GooglePayExpressConfig.f96572i;
        KSerializer<?> kSerializer = a10[0];
        KSerializer<?> kSerializer2 = a10[1];
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{kSerializer, kSerializer2, y02, C17294a.u(y02), C17294a.u(a10[4]), C17294a.u(MComConfig$GooglePayExpressConfig$FiscalCodeField$$serializer.INSTANCE), C17294a.u(a10[6]), C17294a.u(a10[7])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
