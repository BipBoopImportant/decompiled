package com.ingka.ikea.familyrewards.datalayer.impl.remote;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ContentRemote$$serializer implements N<ContentRemote> {
    public static final ContentRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ContentRemote$$serializer contentRemote$$serializer = new ContentRemote$$serializer();
        INSTANCE = contentRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote", contentRemote$$serializer, 10);
        j02.p("rewardType", false);
        j02.p("rewardDescription", false);
        j02.p("inStoreDiscountCode", false);
        j02.p("inStoreDiscountCodeTitle", false);
        j02.p("inStoreDiscountCodeBody", false);
        j02.p("onlineDiscountCode", false);
        j02.p("termsTitle", false);
        j02.p("termsBody", false);
        j02.p("image", false);
        j02.p("spotlightBody", false);
        descriptor = j02;
    }

    private ContentRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 9
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 2
            r11 = 1
            r12 = 0
            r13 = 0
            if (r2 == 0) goto L_0x0078
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r12 = r0.A(r1, r12, r2, r13)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.A(r1, r11, r2, r13)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r2, r13)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r0.A(r1, r7, r2, r13)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r0.A(r1, r9, r2, r13)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r0.A(r1, r6, r2, r13)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.A(r1, r5, r2, r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.A(r1, r4, r2, r13)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r0.A(r1, r8, r2, r13)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.A(r1, r3, r2, r13)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1023(0x3ff, float:1.434E-42)
            r28 = r2
            r18 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r22 = r7
            r27 = r8
            r23 = r9
            r21 = r10
            r20 = r11
            r19 = r12
            goto L_0x013a
        L_0x0078:
            r16 = r11
            r2 = r12
            r5 = r13
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
        L_0x0084:
            if (r16 == 0) goto L_0x0124
            int r4 = r0.p(r1)
            switch(r4) {
                case -1: goto L_0x0120;
                case 0: goto L_0x0112;
                case 1: goto L_0x0104;
                case 2: goto L_0x00f6;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00da;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00ac;
                case 8: goto L_0x00a0;
                case 9: goto L_0x0093;
                default: goto L_0x008d;
            }
        L_0x008d:
            fK.E r0 = new fK.E
            r0.<init>((int) r4)
            throw r0
        L_0x0093:
            jK.Y0 r4 = jK.Y0.f144077a
            java.lang.Object r4 = r0.A(r1, r3, r4, r5)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r2 = r2 | 512(0x200, float:7.175E-43)
        L_0x009e:
            r4 = 7
            goto L_0x0084
        L_0x00a0:
            jK.Y0 r4 = jK.Y0.f144077a
            java.lang.Object r4 = r0.A(r1, r8, r4, r6)
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x009e
        L_0x00ac:
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 7
            java.lang.Object r4 = r0.A(r1, r3, r4, r9)
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4 = r3
            r3 = 9
            goto L_0x0084
        L_0x00bc:
            r3 = 7
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 6
            java.lang.Object r4 = r0.A(r1, r3, r4, r7)
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            r2 = r2 | 64
        L_0x00c9:
            r3 = 9
            goto L_0x009e
        L_0x00cc:
            r3 = 6
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 5
            java.lang.Object r4 = r0.A(r1, r3, r4, r10)
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 32
            goto L_0x00c9
        L_0x00da:
            r3 = 5
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 4
            java.lang.Object r4 = r0.A(r1, r3, r4, r11)
            r11 = r4
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 16
            goto L_0x00c9
        L_0x00e8:
            r3 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 3
            java.lang.Object r4 = r0.A(r1, r3, r4, r12)
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 8
            goto L_0x00c9
        L_0x00f6:
            r3 = 3
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 2
            java.lang.Object r4 = r0.A(r1, r3, r4, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 4
            goto L_0x00c9
        L_0x0104:
            r3 = 2
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 1
            java.lang.Object r4 = r0.A(r1, r3, r4, r14)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 2
            goto L_0x00c9
        L_0x0112:
            r3 = 1
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r4 = r0.A(r1, r3, r4, r13)
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 1
            goto L_0x00c9
        L_0x0120:
            r3 = 0
            r16 = r3
            goto L_0x00c9
        L_0x0124:
            r18 = r2
            r28 = r5
            r27 = r6
            r25 = r7
            r26 = r9
            r24 = r10
            r23 = r11
            r22 = r12
            r19 = r13
            r20 = r14
            r21 = r15
        L_0x013a:
            r0.c(r1)
            com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote r0 = new com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.familyrewards.datalayer.impl.remote.ContentRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ContentRemote contentRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(contentRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ContentRemote.k(contentRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
