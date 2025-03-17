package com.ingka.ikea.core.model.product;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/model/product/Price.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/model/product/Price;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/model/product/Price;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/model/product/Price;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class Price$$serializer implements N<Price> {
    public static final Price$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Price$$serializer price$$serializer = new Price$$serializer();
        INSTANCE = price$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.model.product.Price", price$$serializer, 7);
        j02.p("sellingPrice", false);
        j02.p("priceLabel", false);
        j02.p("unitPrice", false);
        j02.p("regularPrice", false);
        j02.p("rawPrice", false);
        j02.p("fees", false);
        j02.p("unit", true);
        descriptor = j02;
    }

    private Price$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.model.product.Price deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.model.product.Price.f95046h
            boolean r3 = r0.q()
            r4 = 6
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 5
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x005b
            java.lang.String r3 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            jK.Y0 r10 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r7, r10, r11)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.A(r1, r5, r10, r11)
            java.lang.String r5 = (java.lang.String) r5
            double r12 = r0.H(r1, r6)
            r2 = r2[r8]
            java.lang.Object r2 = r0.A(r1, r8, r2, r11)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.A(r1, r4, r10, r11)
            java.lang.String r4 = (java.lang.String) r4
            r6 = 127(0x7f, float:1.78E-43)
            r27 = r2
            r21 = r3
            r28 = r4
            r24 = r5
            r20 = r6
            r23 = r7
            r22 = r9
            r25 = r12
            goto L_0x00d4
        L_0x005b:
            r12 = 0
            r18 = r9
            r3 = r10
            r10 = r11
            r14 = r10
            r15 = r14
            r16 = r12
            r12 = r15
            r13 = r12
        L_0x0067:
            if (r18 == 0) goto L_0x00c4
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00c1;
                case 0: goto L_0x00b6;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0096;
                case 4: goto L_0x008f;
                case 5: goto L_0x0083;
                case 6: goto L_0x0076;
                default: goto L_0x0070;
            }
        L_0x0070:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0076:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r4, r9, r10)
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 64
        L_0x0081:
            r9 = 1
            goto L_0x0067
        L_0x0083:
            r9 = r2[r8]
            java.lang.Object r9 = r0.A(r1, r8, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 32
            goto L_0x0081
        L_0x008f:
            double r16 = r0.H(r1, r6)
            r3 = r3 | 16
            goto L_0x0081
        L_0x0096:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r5, r9, r14)
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 8
            goto L_0x0081
        L_0x00a2:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r7, r9, r13)
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 4
            goto L_0x0081
        L_0x00ae:
            r9 = 1
            java.lang.String r12 = r0.n(r1, r9)
            r3 = r3 | 2
            goto L_0x0067
        L_0x00b6:
            r9 = 1
            r11 = 0
            java.lang.String r19 = r0.n(r1, r11)
            r3 = r3 | 1
            r11 = r19
            goto L_0x0067
        L_0x00c1:
            r18 = 0
            goto L_0x0081
        L_0x00c4:
            r20 = r3
            r28 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r24 = r14
            r27 = r15
            r25 = r16
        L_0x00d4:
            r0.c(r1)
            com.ingka.ikea.core.model.product.Price r0 = new com.ingka.ikea.core.model.product.Price
            r29 = 0
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.model.product.Price$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.model.product.Price");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, Price price) {
        C17542s.j(encoder, "encoder");
        C17542s.j(price, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        Price.f(price, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = Price.f95046h;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, C17294a.u(y02), C17294a.u(y02), C17438C.f144010a, C17294a.u(a10[5]), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
