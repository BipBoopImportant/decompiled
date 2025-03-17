package com.ingka.ikea.benefits.impl.data.models.remote;

import XH.C16814e;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class BenefitRemote$$serializer implements N<BenefitRemote> {
    public static final BenefitRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BenefitRemote$$serializer benefitRemote$$serializer = new BenefitRemote$$serializer();
        INSTANCE = benefitRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote", benefitRemote$$serializer, 9);
        j02.p("id", false);
        j02.p("loyaltyProgramme", false);
        j02.p("category", false);
        j02.p("name", false);
        j02.p("description", false);
        j02.p("smallDescription", false);
        j02.p("media", false);
        j02.p("icon", false);
        j02.p("callToAction", false);
        descriptor = j02;
    }

    private BenefitRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ca, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote deserialize(kotlinx.serialization.encoding.Decoder r35) {
        /*
            r34 = this;
            r0 = r35
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote.f93176j
            boolean r3 = r0.q()
            r4 = 7
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 6
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = r0.n(r1, r12)
            java.lang.String r11 = r0.n(r1, r11)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r6 = r0.n(r1, r6)
            java.lang.String r8 = r0.n(r1, r8)
            jK.Y0 r12 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r12, r13)
            java.lang.String r5 = (java.lang.String) r5
            r2 = r2[r10]
            java.lang.Object r2 = r0.o(r1, r10, r2, r13)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote$$serializer r10 = com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r10, r13)
            com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote r4 = (com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote) r4
            com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote$$serializer r10 = com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r10, r13)
            com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote r7 = (com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote) r7
            r10 = 511(0x1ff, float:7.16E-43)
            r30 = r2
            r24 = r3
            r31 = r4
            r29 = r5
            r27 = r6
            r32 = r7
            r28 = r8
            r26 = r9
            r23 = r10
            r25 = r11
            goto L_0x0115
        L_0x006e:
            r21 = r11
            r3 = r12
            r6 = r13
            r9 = r6
            r11 = r9
            r12 = r11
            r14 = r12
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x007b:
            if (r21 == 0) goto L_0x0101
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00f6;
                case 0: goto L_0x00e6;
                case 1: goto L_0x00d8;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0096;
                case 8: goto L_0x008a;
                default: goto L_0x0084;
            }
        L_0x0084:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x008a:
            com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote$$serializer r8 = com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r7, r8, r6)
            com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote r6 = (com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote) r6
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x0094:
            r8 = 4
            goto L_0x007b
        L_0x0096:
            com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote$$serializer r8 = com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r4, r8, r9)
            r9 = r8
            com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote r9 = (com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote) r9
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x0094
        L_0x00a2:
            r8 = r2[r10]
            java.lang.Object r8 = r0.o(r1, r10, r8, r11)
            r11 = r8
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 64
            goto L_0x0094
        L_0x00ae:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r5, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 32
            goto L_0x0094
        L_0x00ba:
            r8 = 4
            java.lang.String r17 = r0.n(r1, r8)
            r3 = r3 | 16
            goto L_0x007b
        L_0x00c2:
            r4 = 3
            r8 = 4
            java.lang.String r16 = r0.n(r1, r4)
            r3 = r3 | 8
        L_0x00ca:
            r4 = 7
            goto L_0x007b
        L_0x00cc:
            r4 = 3
            r8 = 4
            r15 = 2
            java.lang.String r19 = r0.n(r1, r15)
            r3 = r3 | 4
            r15 = r19
            goto L_0x00ca
        L_0x00d8:
            r4 = 3
            r8 = 4
            r14 = 1
            r18 = 2
            java.lang.String r19 = r0.n(r1, r14)
            r3 = r3 | 2
            r14 = r19
            goto L_0x00ca
        L_0x00e6:
            r4 = 3
            r8 = 4
            r13 = 0
            r18 = 2
            r19 = 1
            java.lang.String r20 = r0.n(r1, r13)
            r3 = r3 | 1
            r13 = r20
            goto L_0x00ca
        L_0x00f6:
            r4 = 3
            r8 = 4
            r18 = 2
            r19 = 1
            r20 = 0
            r21 = r20
            goto L_0x00ca
        L_0x0101:
            r23 = r3
            r32 = r6
            r31 = r9
            r30 = r11
            r29 = r12
            r24 = r13
            r25 = r14
            r26 = r15
            r27 = r16
            r28 = r17
        L_0x0115:
            r0.c(r1)
            com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote r0 = new com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote
            r33 = 0
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, BenefitRemote benefitRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(benefitRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        BenefitRemote.k(benefitRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = BenefitRemote.f93176j;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, y02, C17294a.u(y02), a10[6], C17294a.u(SvgIconRemote$$serializer.INSTANCE), C17294a.u(CallToActionRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
