package com.ingka.ikea.dynamicfields.datalayer;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/dynamicfields/datalayer/FieldAttributes.$serializer", "LjK/N;", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class FieldAttributes$$serializer implements N<FieldAttributes> {
    public static final FieldAttributes$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FieldAttributes$$serializer fieldAttributes$$serializer = new FieldAttributes$$serializer();
        INSTANCE = fieldAttributes$$serializer;
        J0 j02 = new J0("com.ingka.ikea.dynamicfields.datalayer.FieldAttributes", fieldAttributes$$serializer, 15);
        j02.p("key", false);
        j02.p("targetKey", false);
        j02.p("title", false);
        j02.p("text", false);
        j02.p("textAsCollapsed", false);
        j02.p("inputValue", false);
        j02.p("inputDisplay", false);
        j02.p("mandatory", false);
        j02.p("errorText", false);
        j02.p("inputType", false);
        j02.p("uiType", false);
        j02.p("accountType", false);
        j02.p("data", false);
        j02.p("validation", false);
        j02.p("visibility", false);
        descriptor = j02;
    }

    private FieldAttributes$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ingka.ikea.dynamicfields.datalayer.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.ingka.ikea.dynamicfields.datalayer.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.dynamicfields.datalayer.FieldAttributes deserialize(kotlinx.serialization.encoding.Decoder r45) {
        /*
            r44 = this;
            r0 = r45
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.dynamicfields.datalayer.FieldAttributes.f95666p
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 2
            r15 = 10
            r11 = 9
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x00b4
            java.lang.String r3 = r0.n(r1, r13)
            java.lang.String r12 = r0.n(r1, r12)
            java.lang.String r10 = r0.n(r1, r10)
            java.lang.String r7 = r0.n(r1, r7)
            jK.Y0 r13 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r9, r13, r14)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r0.A(r1, r6, r13, r14)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.A(r1, r5, r13, r14)
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = r0.D(r1, r4)
            java.lang.String r8 = r0.n(r1, r8)
            r13 = r2[r11]
            java.lang.Object r11 = r0.o(r1, r11, r13, r14)
            com.ingka.ikea.dynamicfields.datalayer.b r11 = (com.ingka.ikea.dynamicfields.datalayer.b) r11
            r13 = r2[r15]
            java.lang.Object r13 = r0.o(r1, r15, r13, r14)
            com.ingka.ikea.dynamicfields.datalayer.c r13 = (com.ingka.ikea.dynamicfields.datalayer.c) r13
            r18 = r3
            r15 = 11
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r14)
            com.ingka.ikea.dynamicfields.datalayer.a r3 = (com.ingka.ikea.dynamicfields.datalayer.a) r3
            r17 = r3
            r15 = 12
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r14)
            java.util.List r3 = (java.util.List) r3
            r16 = r3
            r15 = 13
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r14)
            java.util.List r3 = (java.util.List) r3
            r15 = 14
            r2 = r2[r15]
            java.lang.Object r2 = r0.o(r1, r15, r2, r14)
            java.util.List r2 = (java.util.List) r2
            r14 = 32767(0x7fff, float:4.5916E-41)
            r42 = r2
            r41 = r3
            r35 = r4
            r34 = r5
            r33 = r6
            r31 = r7
            r36 = r8
            r32 = r9
            r30 = r10
            r37 = r11
            r29 = r12
            r38 = r13
            r27 = r14
            r40 = r16
            r39 = r17
            r28 = r18
            goto L_0x01d3
        L_0x00b4:
            r3 = 14
            r25 = r12
            r4 = r14
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r19 = r12
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r14 = r13
        L_0x00cc:
            if (r25 == 0) goto L_0x01b3
            int r15 = r0.p(r1)
            switch(r15) {
                case -1: goto L_0x01ac;
                case 0: goto L_0x01a0;
                case 1: goto L_0x0194;
                case 2: goto L_0x0188;
                case 3: goto L_0x017c;
                case 4: goto L_0x016b;
                case 5: goto L_0x015b;
                case 6: goto L_0x014a;
                case 7: goto L_0x013c;
                case 8: goto L_0x0131;
                case 9: goto L_0x0123;
                case 10: goto L_0x0113;
                case 11: goto L_0x0105;
                case 12: goto L_0x00f8;
                case 13: goto L_0x00e8;
                case 14: goto L_0x00db;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x00db:
            r15 = r2[r3]
            java.lang.Object r11 = r0.o(r1, r3, r15, r11)
            java.util.List r11 = (java.util.List) r11
            r13 = r13 | 16384(0x4000, float:2.2959E-41)
        L_0x00e5:
            r15 = 10
            goto L_0x00cc
        L_0x00e8:
            r15 = 13
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r8)
            r8 = r3
            java.util.List r8 = (java.util.List) r8
            r13 = r13 | 8192(0x2000, float:1.14794E-41)
        L_0x00f5:
            r3 = 14
            goto L_0x00e5
        L_0x00f8:
            r3 = 12
            r15 = r2[r3]
            java.lang.Object r4 = r0.o(r1, r3, r15, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            goto L_0x00f5
        L_0x0105:
            r15 = 11
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r5)
            r5 = r3
            com.ingka.ikea.dynamicfields.datalayer.a r5 = (com.ingka.ikea.dynamicfields.datalayer.a) r5
            r13 = r13 | 2048(0x800, float:2.87E-42)
            goto L_0x00f5
        L_0x0113:
            r3 = 10
            r15 = r2[r3]
            java.lang.Object r6 = r0.o(r1, r3, r15, r6)
            com.ingka.ikea.dynamicfields.datalayer.c r6 = (com.ingka.ikea.dynamicfields.datalayer.c) r6
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r15 = r3
            r3 = 14
            goto L_0x00cc
        L_0x0123:
            r15 = 9
            r3 = r2[r15]
            java.lang.Object r3 = r0.o(r1, r15, r3, r9)
            r9 = r3
            com.ingka.ikea.dynamicfields.datalayer.b r9 = (com.ingka.ikea.dynamicfields.datalayer.b) r9
            r13 = r13 | 512(0x200, float:7.175E-43)
            goto L_0x00f5
        L_0x0131:
            r3 = 8
            r15 = 9
            java.lang.String r23 = r0.n(r1, r3)
            r13 = r13 | 256(0x100, float:3.59E-43)
            goto L_0x00f5
        L_0x013c:
            r3 = 8
            r14 = 7
            r15 = 9
            boolean r24 = r0.D(r1, r14)
            r13 = r13 | 128(0x80, float:1.794E-43)
            r14 = r24
            goto L_0x00f5
        L_0x014a:
            r15 = 9
            r24 = 7
            jK.Y0 r3 = jK.Y0.f144077a
            r15 = 6
            java.lang.Object r3 = r0.A(r1, r15, r3, r7)
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            r13 = r13 | 64
            goto L_0x00f5
        L_0x015b:
            r15 = 6
            r24 = 7
            jK.Y0 r3 = jK.Y0.f144077a
            r15 = 5
            java.lang.Object r3 = r0.A(r1, r15, r3, r10)
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            r13 = r13 | 32
            goto L_0x00f5
        L_0x016b:
            r15 = 5
            r24 = 7
            jK.Y0 r3 = jK.Y0.f144077a
            r15 = 4
            java.lang.Object r3 = r0.A(r1, r15, r3, r12)
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            r13 = r13 | 16
            goto L_0x00f5
        L_0x017c:
            r3 = 3
            r15 = 4
            r24 = 7
            java.lang.String r22 = r0.n(r1, r3)
            r13 = r13 | 8
            goto L_0x00f5
        L_0x0188:
            r3 = 2
            r15 = 4
            r24 = 7
            java.lang.String r21 = r0.n(r1, r3)
            r13 = r13 | 4
            goto L_0x00f5
        L_0x0194:
            r3 = 1
            r15 = 4
            r24 = 7
            java.lang.String r20 = r0.n(r1, r3)
            r13 = r13 | 2
            goto L_0x00f5
        L_0x01a0:
            r3 = 0
            r15 = 4
            r24 = 7
            java.lang.String r19 = r0.n(r1, r3)
            r13 = r13 | 1
            goto L_0x00f5
        L_0x01ac:
            r3 = 0
            r24 = 7
            r25 = r3
            goto L_0x00f5
        L_0x01b3:
            r40 = r4
            r39 = r5
            r38 = r6
            r34 = r7
            r41 = r8
            r37 = r9
            r33 = r10
            r42 = r11
            r32 = r12
            r27 = r13
            r35 = r14
            r28 = r19
            r29 = r20
            r30 = r21
            r31 = r22
            r36 = r23
        L_0x01d3:
            r0.c(r1)
            com.ingka.ikea.dynamicfields.datalayer.FieldAttributes r0 = new com.ingka.ikea.dynamicfields.datalayer.FieldAttributes
            r26 = r0
            r43 = 0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.dynamicfields.datalayer.FieldAttributes$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.dynamicfields.datalayer.FieldAttributes");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, FieldAttributes fieldAttributes) {
        C17542s.j(encoder, "encoder");
        C17542s.j(fieldAttributes, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        FieldAttributes.q(fieldAttributes, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = FieldAttributes.f95666p;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17457i.f144111a, y02, a10[9], a10[10], a10[11], a10[12], a10[13], a10[14]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
