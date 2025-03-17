package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class FamilyRewardInteractionRemote$$serializer implements N<FamilyRewardInteractionRemote> {
    public static final FamilyRewardInteractionRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FamilyRewardInteractionRemote$$serializer familyRewardInteractionRemote$$serializer = new FamilyRewardInteractionRemote$$serializer();
        INSTANCE = familyRewardInteractionRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionRemote", familyRewardInteractionRemote$$serializer, 10);
        j02.p("id", false);
        j02.p("title", false);
        j02.p("url", false);
        j02.p("keys", false);
        j02.p("image", false);
        j02.p("frequencyRepeat", false);
        j02.p("frequencyPeriod", false);
        j02.p("itemRelatedToSpending", false);
        j02.p("amountRanges", false);
        j02.p("amountRangesPickerStart", false);
        descriptor = j02;
    }

    private FamilyRewardInteractionRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ad, code lost:
        r11 = 8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionRemote deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionRemote.f95815k
            boolean r3 = r0.q()
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 4
            r10 = 2
            r11 = 8
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0084
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r13 = r0.A(r1, r13, r3, r14)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.A(r1, r12, r3, r14)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r0.A(r1, r10, r3, r14)
            java.lang.String r10 = (java.lang.String) r10
            jK.X r15 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r8, r15, r14)
            java.lang.Integer r8 = (java.lang.Integer) r8
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote$$serializer r4 = com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r9, r4, r14)
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote r4 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote) r4
            java.lang.Object r7 = r0.A(r1, r7, r15, r14)
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r3 = r0.A(r1, r6, r3, r14)
            java.lang.String r3 = (java.lang.String) r3
            jK.i r6 = jK.C17457i.f144111a
            java.lang.Object r5 = r0.A(r1, r5, r6, r14)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r2 = r2[r11]
            java.lang.Object r2 = r0.A(r1, r11, r2, r14)
            java.util.List r2 = (java.util.List) r2
            r6 = 9
            java.lang.Object r6 = r0.A(r1, r6, r15, r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r9 = 1023(0x3ff, float:1.434E-42)
            r27 = r2
            r25 = r3
            r23 = r4
            r26 = r5
            r28 = r6
            r24 = r7
            r22 = r8
            r18 = r9
            r21 = r10
            r20 = r12
            r19 = r13
            goto L_0x0144
        L_0x0084:
            r16 = r12
            r3 = r13
            r4 = r14
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
        L_0x0090:
            if (r16 == 0) goto L_0x012e
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x012a;
                case 0: goto L_0x011c;
                case 1: goto L_0x010f;
                case 2: goto L_0x0101;
                case 3: goto L_0x00f3;
                case 4: goto L_0x00e5;
                case 5: goto L_0x00d8;
                case 6: goto L_0x00cb;
                case 7: goto L_0x00be;
                case 8: goto L_0x00b0;
                case 9: goto L_0x009f;
                default: goto L_0x0099;
            }
        L_0x0099:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x009f:
            jK.X r5 = jK.X.f144073a
            r11 = 9
            java.lang.Object r5 = r0.A(r1, r11, r5, r6)
            r6 = r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00ac:
            r5 = 7
        L_0x00ad:
            r11 = 8
            goto L_0x0090
        L_0x00b0:
            r5 = r11
            r11 = r2[r5]
            java.lang.Object r7 = r0.A(r1, r5, r11, r7)
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 256(0x100, float:3.59E-43)
            r11 = r5
        L_0x00bc:
            r5 = 7
            goto L_0x0090
        L_0x00be:
            r5 = r11
            jK.i r11 = jK.C17457i.f144111a
            r5 = 7
            java.lang.Object r9 = r0.A(r1, r5, r11, r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00ad
        L_0x00cb:
            r5 = 7
            jK.Y0 r11 = jK.Y0.f144077a
            r5 = 6
            java.lang.Object r8 = r0.A(r1, r5, r11, r8)
            java.lang.String r8 = (java.lang.String) r8
            r3 = r3 | 64
            goto L_0x00ac
        L_0x00d8:
            r5 = 6
            jK.X r11 = jK.X.f144073a
            r5 = 5
            java.lang.Object r10 = r0.A(r1, r5, r11, r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r3 = r3 | 32
            goto L_0x00ac
        L_0x00e5:
            r5 = 5
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote$$serializer r11 = com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote$$serializer.INSTANCE
            r5 = 4
            java.lang.Object r11 = r0.A(r1, r5, r11, r12)
            r12 = r11
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote r12 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote) r12
            r3 = r3 | 16
            goto L_0x00ac
        L_0x00f3:
            r5 = 4
            jK.X r11 = jK.X.f144073a
            r5 = 3
            java.lang.Object r11 = r0.A(r1, r5, r11, r13)
            r13 = r11
            java.lang.Integer r13 = (java.lang.Integer) r13
            r3 = r3 | 8
            goto L_0x00ac
        L_0x0101:
            r5 = 3
            jK.Y0 r11 = jK.Y0.f144077a
            r5 = 2
            java.lang.Object r11 = r0.A(r1, r5, r11, r15)
            r15 = r11
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 4
            goto L_0x00ac
        L_0x010f:
            r5 = 2
            jK.Y0 r11 = jK.Y0.f144077a
            r5 = 1
            java.lang.Object r4 = r0.A(r1, r5, r11, r4)
            java.lang.String r4 = (java.lang.String) r4
            r3 = r3 | 2
            goto L_0x00ac
        L_0x011c:
            r5 = 1
            jK.Y0 r11 = jK.Y0.f144077a
            r5 = 0
            java.lang.Object r11 = r0.A(r1, r5, r11, r14)
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 1
            goto L_0x00ac
        L_0x012a:
            r5 = 0
            r16 = r5
            goto L_0x00bc
        L_0x012e:
            r18 = r3
            r20 = r4
            r28 = r6
            r27 = r7
            r25 = r8
            r26 = r9
            r24 = r10
            r23 = r12
            r22 = r13
            r19 = r14
            r21 = r15
        L_0x0144:
            r0.c(r1)
            com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionRemote r0 = new com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionRemote
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, FamilyRewardInteractionRemote familyRewardInteractionRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(familyRewardInteractionRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        FamilyRewardInteractionRemote.j(familyRewardInteractionRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = FamilyRewardInteractionRemote.f95815k;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(y02);
        X x10 = X.f144073a;
        return new KSerializer[]{u10, u11, u12, C17294a.u(x10), C17294a.u(ImageRemote$$serializer.INSTANCE), C17294a.u(x10), C17294a.u(y02), C17294a.u(C17457i.f144111a), C17294a.u(a10[8]), C17294a.u(x10)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
