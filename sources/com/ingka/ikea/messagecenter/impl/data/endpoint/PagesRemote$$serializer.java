package com.ingka.ikea.messagecenter.impl.data.endpoint;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.C17458i0;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/messagecenter/impl/data/endpoint/PagesRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/messagecenter/impl/data/endpoint/PagesRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/messagecenter/impl/data/endpoint/PagesRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/messagecenter/impl/data/endpoint/PagesRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PagesRemote$$serializer implements N<PagesRemote> {
    public static final PagesRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PagesRemote$$serializer pagesRemote$$serializer = new PagesRemote$$serializer();
        INSTANCE = pagesRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.messagecenter.impl.data.endpoint.PagesRemote", pagesRemote$$serializer, 12);
        j02.p("id", false);
        j02.p("text", false);
        j02.p("icon", false);
        j02.p("type", false);
        j02.p("whitelist", false);
        j02.p("blacklist", false);
        j02.p("linkTo", false);
        j02.p("linkNewWindow", false);
        j02.p("startMs", false);
        j02.p("endMs", false);
        j02.p("childpages", false);
        j02.p("hideOnPip", false);
        descriptor = j02;
    }

    private PagesRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.messagecenter.impl.data.endpoint.PagesRemote deserialize(kotlinx.serialization.encoding.Decoder r35) {
        /*
            r34 = this;
            r0 = r35
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r4 = 10
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 0
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = r0.n(r1, r14)
            java.lang.String r13 = r0.n(r1, r13)
            jK.Y0 r14 = jK.Y0.f144077a
            java.lang.Object r12 = r0.A(r1, r12, r14, r15)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.Object r11 = r0.A(r1, r11, r14, r15)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r0.A(r1, r8, r14, r15)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.A(r1, r7, r14, r15)
            java.lang.String r7 = (java.lang.String) r7
            jK.i r14 = jK.C17457i.f144111a
            java.lang.Object r6 = r0.A(r1, r6, r14, r15)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            jK.i0 r3 = jK.C17458i0.f144113a
            java.lang.Object r10 = r0.A(r1, r10, r3, r15)
            java.lang.Long r10 = (java.lang.Long) r10
            java.lang.Object r3 = r0.A(r1, r5, r3, r15)
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r4 = r0.A(r1, r4, r14, r15)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r5 = 11
            java.lang.Object r5 = r0.A(r1, r5, r14, r15)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r14 = 4095(0xfff, float:5.738E-42)
            r21 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            r28 = r6
            r27 = r7
            r26 = r8
            r24 = r9
            r29 = r10
            r25 = r11
            r23 = r12
            r22 = r13
            r20 = r14
            goto L_0x0173
        L_0x008a:
            r18 = r13
            r2 = r14
            r3 = r15
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r17 = r14
        L_0x0099:
            if (r18 == 0) goto L_0x0159
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x0153;
                case 0: goto L_0x0146;
                case 1: goto L_0x013c;
                case 2: goto L_0x012d;
                case 3: goto L_0x0124;
                case 4: goto L_0x0116;
                case 5: goto L_0x0108;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00eb;
                case 8: goto L_0x00db;
                case 9: goto L_0x00ca;
                case 10: goto L_0x00ba;
                case 11: goto L_0x00a8;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x00a8:
            jK.i r5 = jK.C17457i.f144111a
            r4 = 11
            java.lang.Object r5 = r0.A(r1, r4, r5, r10)
            r10 = r5
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L_0x00b5:
            r4 = 10
        L_0x00b7:
            r5 = 9
            goto L_0x0099
        L_0x00ba:
            r4 = 11
            jK.i r5 = jK.C17457i.f144111a
            r4 = 10
            java.lang.Object r5 = r0.A(r1, r4, r5, r6)
            r6 = r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r2 = r2 | 1024(0x400, float:1.435E-42)
            goto L_0x00b7
        L_0x00ca:
            jK.i0 r5 = jK.C17458i0.f144113a
            r4 = 9
            java.lang.Object r5 = r0.A(r1, r4, r5, r7)
            r7 = r5
            java.lang.Long r7 = (java.lang.Long) r7
            r2 = r2 | 512(0x200, float:7.175E-43)
            r5 = r4
            r4 = 10
            goto L_0x0099
        L_0x00db:
            r4 = 9
            jK.i0 r5 = jK.C17458i0.f144113a
            r4 = 8
            java.lang.Object r5 = r0.A(r1, r4, r5, r8)
            r8 = r5
            java.lang.Long r8 = (java.lang.Long) r8
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x00b5
        L_0x00eb:
            r4 = 8
            jK.i r5 = jK.C17457i.f144111a
            r4 = 7
            java.lang.Object r5 = r0.A(r1, r4, r5, r11)
            r11 = r5
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00b5
        L_0x00fa:
            r4 = 7
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 6
            java.lang.Object r5 = r0.A(r1, r4, r5, r9)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
            goto L_0x00b5
        L_0x0108:
            r4 = 6
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 5
            java.lang.Object r5 = r0.A(r1, r4, r5, r12)
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 32
            goto L_0x00b5
        L_0x0116:
            r4 = 5
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 4
            java.lang.Object r5 = r0.A(r1, r4, r5, r13)
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 16
            goto L_0x00b5
        L_0x0124:
            r4 = 4
            r5 = 3
            java.lang.String r17 = r0.n(r1, r5)
            r2 = r2 | 8
            goto L_0x00b5
        L_0x012d:
            r5 = 3
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 2
            java.lang.Object r4 = r0.A(r1, r5, r4, r14)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 4
            goto L_0x00b5
        L_0x013c:
            r4 = 1
            r5 = 2
            java.lang.String r3 = r0.n(r1, r4)
            r2 = r2 | 2
            goto L_0x00b5
        L_0x0146:
            r4 = 1
            r5 = 2
            r15 = 0
            java.lang.String r16 = r0.n(r1, r15)
            r2 = r2 | 1
            r15 = r16
            goto L_0x00b5
        L_0x0153:
            r16 = 0
            r18 = r16
            goto L_0x00b7
        L_0x0159:
            r20 = r2
            r22 = r3
            r31 = r6
            r30 = r7
            r29 = r8
            r27 = r9
            r32 = r10
            r28 = r11
            r26 = r12
            r25 = r13
            r23 = r14
            r21 = r15
            r24 = r17
        L_0x0173:
            r0.c(r1)
            com.ingka.ikea.messagecenter.impl.data.endpoint.PagesRemote r0 = new com.ingka.ikea.messagecenter.impl.data.endpoint.PagesRemote
            r33 = 0
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.messagecenter.impl.data.endpoint.PagesRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.messagecenter.impl.data.endpoint.PagesRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PagesRemote pagesRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(pagesRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PagesRemote.l(pagesRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(y02);
        C17457i iVar = C17457i.f144111a;
        KSerializer<?> u14 = C17294a.u(iVar);
        C17458i0 i0Var = C17458i0.f144113a;
        return new KSerializer[]{y02, y02, u10, y02, u11, u12, u13, u14, C17294a.u(i0Var), C17294a.u(i0Var), C17294a.u(iVar), C17294a.u(iVar)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
