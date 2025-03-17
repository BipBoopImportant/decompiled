package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/ItemUnitPriceRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ItemUnitPriceRemoteModel$$serializer implements N<ItemUnitPriceRemoteModel> {
    public static final ItemUnitPriceRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ItemUnitPriceRemoteModel$$serializer itemUnitPriceRemoteModel$$serializer = new ItemUnitPriceRemoteModel$$serializer();
        INSTANCE = itemUnitPriceRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.ItemUnitPriceRemoteModel", itemUnitPriceRemoteModel$$serializer, 7);
        j02.p("base", false);
        j02.p("current", false);
        j02.p("isFamilyItem", false);
        j02.p("lowestPreviousPrice", false);
        j02.p("previousSalesPrice", false);
        j02.p("priceType", false);
        j02.p("upsell", false);
        descriptor = j02;
    }

    private ItemUnitPriceRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.app.caasremote.models.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.ItemUnitPriceRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r27.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.ItemUnitPriceRemoteModel.f71203h
            boolean r3 = r0.q()
            r4 = 6
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 5
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x006d
            com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel$$serializer r3 = com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r10, r3, r11)
            com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel) r3
            com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel$$serializer r10 = com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r9, r10, r11)
            com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel r9 = (com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel) r9
            jK.i r10 = jK.C17457i.f144111a
            java.lang.Object r7 = r0.A(r1, r7, r10, r11)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel$$serializer r10 = com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r10, r11)
            com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel r5 = (com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel) r5
            com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel$$serializer r10 = com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r10, r11)
            com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel r6 = (com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel) r6
            r2 = r2[r8]
            java.lang.Object r2 = r0.A(r1, r8, r2, r11)
            com.ingka.ikea.app.caasremote.models.g r2 = (com.ingka.ikea.app.caasremote.models.g) r2
            com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r8, r11)
            com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel r4 = (com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel) r4
            r8 = 127(0x7f, float:1.78E-43)
            r24 = r2
            r19 = r3
            r25 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r18 = r8
            r20 = r9
            goto L_0x00f6
        L_0x006d:
            r16 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0076:
            if (r16 == 0) goto L_0x00e6
            int r7 = r0.p(r1)
            switch(r7) {
                case -1: goto L_0x00e2;
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00aa;
                case 4: goto L_0x009e;
                case 5: goto L_0x0092;
                case 6: goto L_0x0085;
                default: goto L_0x007f;
            }
        L_0x007f:
            fK.E r0 = new fK.E
            r0.<init>((int) r7)
            throw r0
        L_0x0085:
            com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel$$serializer r7 = com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r4, r7, r9)
            r9 = r7
            com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel r9 = (com.ingka.ikea.app.caasremote.models.NullableUpsellUnitPricePropertiesRemoteModel) r9
            r3 = r3 | 64
        L_0x0090:
            r7 = 2
            goto L_0x0076
        L_0x0092:
            r7 = r2[r8]
            java.lang.Object r7 = r0.A(r1, r8, r7, r10)
            r10 = r7
            com.ingka.ikea.app.caasremote.models.g r10 = (com.ingka.ikea.app.caasremote.models.g) r10
            r3 = r3 | 32
            goto L_0x0090
        L_0x009e:
            com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel$$serializer r7 = com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r6, r7, r15)
            r15 = r7
            com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel r15 = (com.ingka.ikea.app.caasremote.models.NullablePreviousSalesPriceRemoteModel) r15
            r3 = r3 | 16
            goto L_0x0090
        L_0x00aa:
            com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel$$serializer r7 = com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r5, r7, r14)
            r14 = r7
            com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.NullableLowestPreviousPriceRemoteModel) r14
            r3 = r3 | 8
            goto L_0x0090
        L_0x00b6:
            jK.i r7 = jK.C17457i.f144111a
            r4 = 2
            java.lang.Object r7 = r0.A(r1, r4, r7, r13)
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r3 = r3 | 4
            r7 = r4
            r4 = 6
            goto L_0x0076
        L_0x00c5:
            r4 = 2
            com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel$$serializer r7 = com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel$$serializer.INSTANCE
            r4 = 1
            java.lang.Object r7 = r0.o(r1, r4, r7, r12)
            r12 = r7
            com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel r12 = (com.ingka.ikea.app.caasremote.models.CurrentUnitPricePropertiesRemoteModel) r12
            r3 = r3 | 2
        L_0x00d2:
            r4 = 6
            goto L_0x0090
        L_0x00d4:
            r4 = 1
            com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel$$serializer r7 = com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel$$serializer.INSTANCE
            r4 = 0
            java.lang.Object r7 = r0.A(r1, r4, r7, r11)
            r11 = r7
            com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel) r11
            r3 = r3 | 1
            goto L_0x00d2
        L_0x00e2:
            r4 = 0
            r16 = r4
            goto L_0x00d2
        L_0x00e6:
            r18 = r3
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00f6:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.ItemUnitPriceRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.ItemUnitPriceRemoteModel
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.ItemUnitPriceRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.ItemUnitPriceRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, ItemUnitPriceRemoteModel itemUnitPriceRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(itemUnitPriceRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ItemUnitPriceRemoteModel.g(itemUnitPriceRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = ItemUnitPriceRemoteModel.f71203h;
        return new KSerializer[]{C17294a.u(NullableBasePricePropertiesRemoteModel$$serializer.INSTANCE), CurrentUnitPricePropertiesRemoteModel$$serializer.INSTANCE, C17294a.u(C17457i.f144111a), C17294a.u(NullableLowestPreviousPriceRemoteModel$$serializer.INSTANCE), C17294a.u(NullablePreviousSalesPriceRemoteModel$$serializer.INSTANCE), C17294a.u(a10[5]), C17294a.u(NullableUpsellUnitPricePropertiesRemoteModel$$serializer.INSTANCE)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
