package com.ingka.ikea.liveshopping.impl.data.network.model;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/liveshopping/impl/data/network/model/ShowRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ShowRemote$$serializer implements N<ShowRemote> {
    public static final ShowRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f96527a = 8;
    private static final SerialDescriptor descriptor;

    static {
        ShowRemote$$serializer showRemote$$serializer = new ShowRemote$$serializer();
        INSTANCE = showRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.liveshopping.impl.data.network.model.ShowRemote", showRemote$$serializer, 20);
        j02.p("business", false);
        j02.p("businessFeatured", false);
        j02.p("categories", false);
        j02.p("channels", false);
        j02.p("description", false);
        j02.p("family", false);
        j02.p("featured", false);
        j02.p("id", false);
        j02.p("image", false);
        j02.p("label", false);
        j02.p("live", false);
        j02.p("orgId", false);
        j02.p("scheduledStart", false);
        j02.p("startedDate", false);
        j02.p("comingSoon", false);
        j02.p("startingSoon", false);
        j02.p("productSkus", false);
        j02.p("state", false);
        j02.p("statistics", false);
        j02.p("title", false);
        descriptor = j02;
    }

    private ShowRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.ingka.ikea.core.remotemodel.ImageRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x014c, code lost:
        r3 = r3 | r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x014d, code lost:
        r13 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x014f, code lost:
        r11 = r35;
        r35 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0155, code lost:
        r3 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x017b, code lost:
        r3 = r37;
        r61 = r35;
        r35 = r11;
        r11 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0290, code lost:
        r13 = r16;
        r11 = r35;
        r3 = r37;
        r35 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.liveshopping.impl.data.network.model.ShowRemote deserialize(kotlinx.serialization.encoding.Decoder r63) {
        /*
            r62 = this;
            r0 = r63
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.liveshopping.impl.data.network.model.ShowRemote.f96506v
            boolean r3 = r0.q()
            r14 = 7
            r15 = 6
            r4 = 5
            r5 = 8
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x00f5
            jK.i r3 = jK.C17457i.f144111a
            java.lang.Object r10 = r0.A(r1, r10, r3, r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r9 = r0.A(r1, r9, r3, r11)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r12 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r12, r11)
            java.util.List r8 = (java.util.List) r8
            r12 = r2[r7]
            java.lang.Object r7 = r0.A(r1, r7, r12, r11)
            java.util.List r7 = (java.util.List) r7
            jK.Y0 r12 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r6, r12, r11)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r0.A(r1, r4, r3, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r15 = r0.A(r1, r15, r3, r11)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.String r14 = r0.n(r1, r14)
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r13 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.o(r1, r5, r13, r11)
            com.ingka.ikea.core.remotemodel.ImageRemote r5 = (com.ingka.ikea.core.remotemodel.ImageRemote) r5
            r13 = 9
            java.lang.String r13 = r0.n(r1, r13)
            r24 = r4
            r4 = 10
            java.lang.Object r4 = r0.A(r1, r4, r3, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r23 = r4
            r4 = 11
            java.lang.Object r4 = r0.A(r1, r4, r12, r11)
            java.lang.String r4 = (java.lang.String) r4
            r22 = r4
            r4 = 12
            java.lang.Object r4 = r0.A(r1, r4, r12, r11)
            java.lang.String r4 = (java.lang.String) r4
            r21 = r4
            r4 = 13
            java.lang.Object r4 = r0.A(r1, r4, r12, r11)
            java.lang.String r4 = (java.lang.String) r4
            r20 = r4
            r4 = 14
            java.lang.Object r4 = r0.A(r1, r4, r3, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r19 = r4
            r4 = 15
            java.lang.Object r3 = r0.A(r1, r4, r3, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r4 = 16
            r2 = r2[r4]
            java.lang.Object r2 = r0.A(r1, r4, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r4 = 17
            java.lang.Object r4 = r0.A(r1, r4, r12, r11)
            java.lang.String r4 = (java.lang.String) r4
            com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote$$serializer r12 = com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote$$serializer.INSTANCE
            r17 = r2
            r2 = 18
            java.lang.Object r2 = r0.A(r1, r2, r12, r11)
            com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote r2 = (com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote) r2
            r12 = 19
            java.lang.String r11 = r0.n(r1, r12)
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r58 = r2
            r55 = r3
            r57 = r4
            r48 = r5
            r44 = r6
            r43 = r7
            r42 = r8
            r41 = r9
            r40 = r10
            r59 = r11
            r39 = r12
            r49 = r13
            r47 = r14
            r46 = r15
            r56 = r17
            r54 = r19
            r53 = r20
            r52 = r21
            r51 = r22
            r50 = r23
            r45 = r24
            goto L_0x0432
        L_0x00f5:
            r12 = 19
            r36 = r9
            r35 = r10
            r3 = r11
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r13 = r10
            r14 = r13
            r15 = r14
            r27 = r15
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
        L_0x0116:
            if (r36 == 0) goto L_0x03f9
            int r12 = r0.p(r1)
            switch(r12) {
                case -1: goto L_0x03dc;
                case 0: goto L_0x03aa;
                case 1: goto L_0x037c;
                case 2: goto L_0x0352;
                case 3: goto L_0x0333;
                case 4: goto L_0x0314;
                case 5: goto L_0x02f5;
                case 6: goto L_0x02d5;
                case 7: goto L_0x02bb;
                case 8: goto L_0x029a;
                case 9: goto L_0x0276;
                case 10: goto L_0x0255;
                case 11: goto L_0x0234;
                case 12: goto L_0x0213;
                case 13: goto L_0x01f2;
                case 14: goto L_0x01ca;
                case 15: goto L_0x01a3;
                case 16: goto L_0x0186;
                case 17: goto L_0x0158;
                case 18: goto L_0x0134;
                case 19: goto L_0x0125;
                default: goto L_0x011f;
            }
        L_0x011f:
            fK.E r0 = new fK.E
            r0.<init>((int) r12)
            throw r0
        L_0x0125:
            r12 = 19
            java.lang.String r34 = r0.n(r1, r12)
            r37 = 524288(0x80000, float:7.34684E-40)
            r12 = r35
            r35 = r12 | r37
        L_0x0131:
            r12 = 19
            goto L_0x0116
        L_0x0134:
            r12 = r35
            r35 = r11
            com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote$$serializer r11 = com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote$$serializer.INSTANCE
            r37 = r3
            r16 = r13
            r3 = r33
            r13 = 18
            java.lang.Object r3 = r0.A(r1, r13, r11, r3)
            r33 = r3
            com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote r33 = (com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote) r33
            r3 = 262144(0x40000, float:3.67342E-40)
        L_0x014c:
            r3 = r3 | r12
        L_0x014d:
            r13 = r16
        L_0x014f:
            r11 = r35
            r12 = 19
            r35 = r3
        L_0x0155:
            r3 = r37
            goto L_0x0116
        L_0x0158:
            r37 = r3
            r16 = r13
            r3 = r33
            r12 = r35
            r13 = 18
            r35 = r11
            jK.Y0 r11 = jK.Y0.f144077a
            r17 = r3
            r13 = r32
            r3 = 17
            java.lang.Object r11 = r0.A(r1, r3, r11, r13)
            r32 = r11
            java.lang.String r32 = (java.lang.String) r32
            r11 = 131072(0x20000, float:1.83671E-40)
            r11 = r11 | r12
            r13 = r16
            r33 = r17
        L_0x017b:
            r3 = r37
            r12 = 19
            r61 = r35
            r35 = r11
            r11 = r61
            goto L_0x0116
        L_0x0186:
            r37 = r3
            r16 = r13
            r13 = r32
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 16
            r3 = r2[r11]
            r13 = r31
            java.lang.Object r3 = r0.A(r1, r11, r3, r13)
            r31 = r3
            java.util.List r31 = (java.util.List) r31
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x014c
        L_0x01a3:
            r37 = r3
            r16 = r13
            r13 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 16
            jK.i r3 = jK.C17457i.f144111a
            r18 = r13
            r11 = r30
            r13 = 15
            java.lang.Object r3 = r0.A(r1, r13, r3, r11)
            r30 = r3
            java.lang.Boolean r30 = (java.lang.Boolean) r30
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r12
            r13 = r16
            r31 = r18
            goto L_0x014f
        L_0x01ca:
            r37 = r3
            r16 = r13
            r18 = r31
            r17 = r33
            r12 = r35
            r13 = 15
            r35 = r11
            r11 = r30
            jK.i r3 = jK.C17457i.f144111a
            r19 = r11
            r13 = r29
            r11 = 14
            java.lang.Object r3 = r0.A(r1, r11, r3, r13)
            r29 = r3
            java.lang.Boolean r29 = (java.lang.Boolean) r29
            r3 = r12 | 16384(0x4000, float:2.2959E-41)
            r13 = r16
            r30 = r19
            goto L_0x014f
        L_0x01f2:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 14
            jK.Y0 r3 = jK.Y0.f144077a
            r11 = 13
            java.lang.Object r3 = r0.A(r1, r11, r3, r5)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r3 = r12 | 8192(0x2000, float:1.14794E-41)
            goto L_0x014d
        L_0x0213:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 13
            jK.Y0 r3 = jK.Y0.f144077a
            r11 = 12
            java.lang.Object r3 = r0.A(r1, r11, r3, r14)
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            r3 = r12 | 4096(0x1000, float:5.74E-42)
            goto L_0x014d
        L_0x0234:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 12
            jK.Y0 r3 = jK.Y0.f144077a
            r11 = 11
            java.lang.Object r3 = r0.A(r1, r11, r3, r15)
            r15 = r3
            java.lang.String r15 = (java.lang.String) r15
            r3 = r12 | 2048(0x800, float:2.87E-42)
            goto L_0x014d
        L_0x0255:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 11
            jK.i r3 = jK.C17457i.f144111a
            r11 = 10
            java.lang.Object r3 = r0.A(r1, r11, r3, r4)
            r4 = r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r3 = r12 | 1024(0x400, float:1.435E-42)
            goto L_0x014d
        L_0x0276:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r3 = 9
            r35 = r11
            r11 = 10
            java.lang.String r28 = r0.n(r1, r3)
            r12 = r12 | 512(0x200, float:7.175E-43)
        L_0x0290:
            r13 = r16
            r11 = r35
            r3 = r37
            r35 = r12
            goto L_0x0131
        L_0x029a:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 10
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r3 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            r11 = 8
            java.lang.Object r3 = r0.o(r1, r11, r3, r6)
            r6 = r3
            com.ingka.ikea.core.remotemodel.ImageRemote r6 = (com.ingka.ikea.core.remotemodel.ImageRemote) r6
            r3 = r12 | 256(0x100, float:3.59E-43)
            goto L_0x014d
        L_0x02bb:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r3 = 7
            r35 = r11
            r11 = 8
            java.lang.String r27 = r0.n(r1, r3)
            r12 = r12 | 128(0x80, float:1.794E-43)
            goto L_0x0290
        L_0x02d5:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 8
            jK.i r3 = jK.C17457i.f144111a
            r11 = 6
            java.lang.Object r3 = r0.A(r1, r11, r3, r7)
            r7 = r3
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r3 = r12 | 64
            goto L_0x014d
        L_0x02f5:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 6
            jK.i r3 = jK.C17457i.f144111a
            r11 = 5
            java.lang.Object r3 = r0.A(r1, r11, r3, r8)
            r8 = r3
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r3 = r12 | 32
            goto L_0x014d
        L_0x0314:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 5
            jK.Y0 r3 = jK.Y0.f144077a
            r11 = 4
            java.lang.Object r3 = r0.A(r1, r11, r3, r9)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r3 = r12 | 16
            goto L_0x014d
        L_0x0333:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r3 = 3
            r35 = r11
            r11 = r2[r3]
            java.lang.Object r10 = r0.A(r1, r3, r11, r10)
            java.util.List r10 = (java.util.List) r10
            r11 = r12 | 8
            r13 = r16
            goto L_0x017b
        L_0x0352:
            r37 = r3
            r16 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 2
            r3 = r2[r11]
            r26 = r2
            r2 = r16
            java.lang.Object r2 = r0.A(r1, r11, r3, r2)
            java.util.List r2 = (java.util.List) r2
            r3 = r12 | 4
            r11 = r35
            r12 = 19
            r13 = r2
            r35 = r3
            r2 = r26
            goto L_0x0155
        L_0x037c:
            r26 = r2
            r37 = r3
            r2 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 2
            jK.i r3 = jK.C17457i.f144111a
            r25 = r2
            r2 = r37
            r11 = 1
            java.lang.Object r2 = r0.A(r1, r11, r3, r2)
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r2 = r12 | 2
            r13 = r25
            r11 = r35
            r12 = 19
            r35 = r2
            r2 = r26
            goto L_0x0116
        L_0x03aa:
            r26 = r2
            r2 = r3
            r25 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r11
            r11 = 1
            jK.i r3 = jK.C17457i.f144111a
            r11 = 0
            r61 = r35
            r35 = r2
            r2 = r61
            java.lang.Object r2 = r0.A(r1, r11, r3, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r3 = r12 | 1
            r11 = r2
            r13 = r25
            r2 = r26
            r12 = 19
            r61 = r35
            r35 = r3
            r3 = r61
            goto L_0x0116
        L_0x03dc:
            r26 = r2
            r2 = r11
            r25 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r11 = 0
            r35 = r3
            r36 = r11
            r13 = r25
            r11 = r2
            r35 = r12
            r2 = r26
            goto L_0x0131
        L_0x03f9:
            r2 = r11
            r25 = r13
            r13 = r29
            r19 = r30
            r18 = r31
            r17 = r33
            r12 = r35
            r35 = r3
            r40 = r2
            r50 = r4
            r53 = r5
            r48 = r6
            r46 = r7
            r45 = r8
            r44 = r9
            r43 = r10
            r39 = r12
            r54 = r13
            r52 = r14
            r51 = r15
            r58 = r17
            r56 = r18
            r55 = r19
            r42 = r25
            r47 = r27
            r49 = r28
            r57 = r32
            r59 = r34
            r41 = r35
        L_0x0432:
            r0.c(r1)
            com.ingka.ikea.liveshopping.impl.data.network.model.ShowRemote r0 = new com.ingka.ikea.liveshopping.impl.data.network.model.ShowRemote
            r38 = r0
            r60 = 0
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.liveshopping.impl.data.network.model.ShowRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.liveshopping.impl.data.network.model.ShowRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ShowRemote showRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(showRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ShowRemote.d(showRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = ShowRemote.f96506v;
        C17457i iVar = C17457i.f144111a;
        KSerializer<?> u10 = C17294a.u(iVar);
        KSerializer<?> u11 = C17294a.u(iVar);
        KSerializer<?> u12 = C17294a.u(a10[2]);
        KSerializer<?> u13 = C17294a.u(a10[3]);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, u11, u12, u13, C17294a.u(y02), C17294a.u(iVar), C17294a.u(iVar), y02, ImageRemote$$serializer.INSTANCE, y02, C17294a.u(iVar), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(a10[16]), C17294a.u(y02), C17294a.u(StatisticsRemote$$serializer.INSTANCE), y02};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
