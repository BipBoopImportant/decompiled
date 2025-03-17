package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.M;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ItemResponseRemoteModel$$serializer implements N<ItemResponseRemoteModel> {
    public static final ItemResponseRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ItemResponseRemoteModel$$serializer itemResponseRemoteModel$$serializer = new ItemResponseRemoteModel$$serializer();
        INSTANCE = itemResponseRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel", itemResponseRemoteModel$$serializer, 13);
        j02.p("assemblyService", false);
        j02.p("availabilityIndication", false);
        j02.p("childItems", false);
        j02.p("fees", false);
        j02.p("info", false);
        j02.p("installationService", false);
        j02.p("itemNo", false);
        j02.p("itemType", false);
        j02.p("maxQuantity", false);
        j02.p("metadata", false);
        j02.p("price", false);
        j02.p("quantity", false);
        j02.p("shoppingProfile", false);
        descriptor = j02;
    }

    private ItemResponseRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.ingka.ikea.app.caasremote.models.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.ingka.ikea.app.caasremote.models.l} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00df, code lost:
        r4 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01ad, code lost:
        r2 = r38;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r38) {
        /*
            r37 = this;
            r0 = r38
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r37.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel.f71185n
            boolean r3 = r0.q()
            r5 = 10
            r6 = 9
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r13 = 7
            r14 = 2
            r15 = 1
            r12 = 0
            r4 = 0
            if (r3 == 0) goto L_0x00ae
            com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServiceRemoteModel$$serializer r3 = com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r12, r3, r4)
            com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServiceRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServiceRemoteModel) r3
            com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel$$serializer r12 = com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r15, r12, r4)
            com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel r12 = (com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel) r12
            r15 = r2[r14]
            java.lang.Object r14 = r0.o(r1, r14, r15, r4)
            java.util.List r14 = (java.util.List) r14
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer r15 = com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r9, r15, r4)
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel r9 = (com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel) r9
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer r15 = com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r11 = r0.A(r1, r11, r15, r4)
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel) r11
            com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel$$serializer r15 = com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r15, r4)
            com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel r8 = (com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel) r8
            java.lang.String r7 = r0.n(r1, r7)
            r15 = r2[r13]
            java.lang.Object r13 = r0.A(r1, r13, r15, r4)
            com.ingka.ikea.app.caasremote.models.e r13 = (com.ingka.ikea.app.caasremote.models.e) r13
            jK.M r15 = jK.M.f144051a
            java.lang.Object r10 = r0.A(r1, r10, r15, r4)
            java.lang.Float r10 = (java.lang.Float) r10
            com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel$$serializer r15 = com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r15, r4)
            com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel r6 = (com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel) r6
            com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel$$serializer r15 = com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r15, r4)
            com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel r5 = (com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel) r5
            r15 = 11
            float r15 = r0.v(r1, r15)
            r16 = r3
            r3 = 12
            r2 = r2[r3]
            java.lang.Object r2 = r0.o(r1, r3, r2, r4)
            com.ingka.ikea.app.caasremote.models.l r2 = (com.ingka.ikea.app.caasremote.models.l) r2
            r3 = 8191(0x1fff, float:1.1478E-41)
            r34 = r2
            r21 = r3
            r32 = r5
            r31 = r6
            r28 = r7
            r27 = r8
            r25 = r9
            r30 = r10
            r26 = r11
            r23 = r12
            r29 = r13
            r24 = r14
            r33 = r15
            r22 = r16
            goto L_0x01d8
        L_0x00ae:
            r3 = 0
            r18 = r3
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r17 = r14
            r3 = r12
            r19 = r15
            r12 = r17
            r15 = r12
        L_0x00c1:
            if (r19 == 0) goto L_0x01bb
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x01b1;
                case 0: goto L_0x0196;
                case 1: goto L_0x0185;
                case 2: goto L_0x0175;
                case 3: goto L_0x0164;
                case 4: goto L_0x0153;
                case 5: goto L_0x0143;
                case 6: goto L_0x0138;
                case 7: goto L_0x0129;
                case 8: goto L_0x0117;
                case 9: goto L_0x0105;
                case 10: goto L_0x00f1;
                case 11: goto L_0x00e4;
                case 12: goto L_0x00d0;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x00d0:
            r38 = r4
            r5 = 12
            r4 = r2[r5]
            java.lang.Object r4 = r0.o(r1, r5, r4, r6)
            r6 = r4
            com.ingka.ikea.app.caasremote.models.l r6 = (com.ingka.ikea.app.caasremote.models.l) r6
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        L_0x00df:
            r4 = r38
            r5 = 10
            goto L_0x00c1
        L_0x00e4:
            r38 = r4
            r4 = 11
            r5 = 12
            float r18 = r0.v(r1, r4)
            r3 = r3 | 2048(0x800, float:2.87E-42)
            goto L_0x00df
        L_0x00f1:
            r38 = r4
            r5 = 12
            com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel$$serializer.INSTANCE
            r5 = 10
            java.lang.Object r4 = r0.A(r1, r5, r4, r10)
            r10 = r4
            com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel r10 = (com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel) r10
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r4 = r38
            goto L_0x00c1
        L_0x0105:
            r38 = r4
            r5 = 10
            com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel$$serializer.INSTANCE
            r5 = 9
            java.lang.Object r4 = r0.A(r1, r5, r4, r13)
            r13 = r4
            com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel r13 = (com.ingka.ikea.app.caasremote.models.NullableItemResponseMetadataRemoteModel) r13
            r3 = r3 | 512(0x200, float:7.175E-43)
            goto L_0x00df
        L_0x0117:
            r38 = r4
            r5 = 9
            jK.M r4 = jK.M.f144051a
            r5 = 8
            java.lang.Object r4 = r0.A(r1, r5, r4, r7)
            r7 = r4
            java.lang.Float r7 = (java.lang.Float) r7
            r3 = r3 | 256(0x100, float:3.59E-43)
            goto L_0x00df
        L_0x0129:
            r38 = r4
            r4 = 7
            r5 = r2[r4]
            java.lang.Object r5 = r0.A(r1, r4, r5, r8)
            r8 = r5
            com.ingka.ikea.app.caasremote.models.e r8 = (com.ingka.ikea.app.caasremote.models.e) r8
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00df
        L_0x0138:
            r38 = r4
            r4 = 7
            r5 = 6
            java.lang.String r17 = r0.n(r1, r5)
            r3 = r3 | 64
            goto L_0x00df
        L_0x0143:
            r38 = r4
            r5 = 6
            com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel$$serializer.INSTANCE
            r5 = 5
            java.lang.Object r4 = r0.A(r1, r5, r4, r11)
            r11 = r4
            com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullableItemResponseInstallationServiceRemoteModel) r11
            r3 = r3 | 32
            goto L_0x00df
        L_0x0153:
            r38 = r4
            r5 = 5
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer.INSTANCE
            r5 = 4
            java.lang.Object r4 = r0.A(r1, r5, r4, r9)
            r9 = r4
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel r9 = (com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel) r9
            r3 = r3 | 16
            goto L_0x00df
        L_0x0164:
            r38 = r4
            r5 = 4
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer.INSTANCE
            r5 = 3
            java.lang.Object r4 = r0.A(r1, r5, r4, r14)
            r14 = r4
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel) r14
            r3 = r3 | 8
            goto L_0x00df
        L_0x0175:
            r38 = r4
            r4 = 2
            r5 = r2[r4]
            java.lang.Object r5 = r0.o(r1, r4, r5, r15)
            r15 = r5
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 4
            goto L_0x00df
        L_0x0185:
            r38 = r4
            r4 = 2
            com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel$$serializer r5 = com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel$$serializer.INSTANCE
            r4 = 1
            java.lang.Object r5 = r0.A(r1, r4, r5, r12)
            r12 = r5
            com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel r12 = (com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel) r12
            r3 = r3 | 2
            goto L_0x00df
        L_0x0196:
            r38 = r4
            r4 = 1
            com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServiceRemoteModel$$serializer r5 = com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE
            r4 = 0
            r36 = r2
            r2 = r38
            r38 = r36
            java.lang.Object r2 = r0.A(r1, r4, r5, r2)
            com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServiceRemoteModel r2 = (com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServiceRemoteModel) r2
            r3 = r3 | 1
            r4 = r2
            r5 = 10
        L_0x01ad:
            r2 = r38
            goto L_0x00c1
        L_0x01b1:
            r38 = r2
            r2 = r4
            r4 = 0
            r19 = r4
            r5 = 10
            r4 = r2
            goto L_0x01ad
        L_0x01bb:
            r2 = r4
            r22 = r2
            r21 = r3
            r34 = r6
            r30 = r7
            r29 = r8
            r26 = r9
            r32 = r10
            r27 = r11
            r23 = r12
            r31 = r13
            r25 = r14
            r24 = r15
            r28 = r17
            r33 = r18
        L_0x01d8:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel
            r35 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, ItemResponseRemoteModel itemResponseRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(itemResponseRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ItemResponseRemoteModel.j(itemResponseRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ItemResponseRemoteModel.f71185n;
        KSerializer<?> u10 = C17294a.u(NullableItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(NullableItemLevelAvailabilityIndicationResponseRemoteModel$$serializer.INSTANCE);
        KSerializer<?> kSerializer = a10[2];
        KSerializer<?> u12 = C17294a.u(NullableFeesRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u13 = C17294a.u(NullableItemInfoResponseRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u14 = C17294a.u(NullableItemResponseInstallationServiceRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u15 = C17294a.u(a10[7]);
        M m10 = M.f144051a;
        return new KSerializer[]{u10, u11, kSerializer, u12, u13, u14, Y0.f144077a, u15, C17294a.u(m10), C17294a.u(NullableItemResponseMetadataRemoteModel$$serializer.INSTANCE), C17294a.u(NullableItemResponsePriceRemoteModel$$serializer.INSTANCE), m10, a10[12]};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
