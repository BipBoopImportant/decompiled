package com.ingka.ikea.app.caasremote.models;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/SetInstallationServiceRequestRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/SetInstallationServiceRequestRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/SetInstallationServiceRequestRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/SetInstallationServiceRequestRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class SetInstallationServiceRequestRemoteModel$$serializer implements N<SetInstallationServiceRequestRemoteModel> {
    public static final SetInstallationServiceRequestRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        SetInstallationServiceRequestRemoteModel$$serializer setInstallationServiceRequestRemoteModel$$serializer = new SetInstallationServiceRequestRemoteModel$$serializer();
        INSTANCE = setInstallationServiceRequestRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.SetInstallationServiceRequestRemoteModel", setInstallationServiceRequestRemoteModel$$serializer, 6);
        j02.p("group", true);
        j02.p("items", true);
        j02.p("plans", true);
        j02.p("populateCart", true);
        j02.p("serviceArea", true);
        j02.p("shoppingProfile", true);
        descriptor = j02;
    }

    private SetInstallationServiceRequestRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.ingka.ikea.app.caasremote.models.h} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c3, code lost:
        r4 = 3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.SetInstallationServiceRequestRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r26.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.SetInstallationServiceRequestRemoteModel.f71533g
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 5
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0062
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r3 = r0.A(r1, r9, r3, r10)
            java.lang.String r3 = (java.lang.String) r3
            r9 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r9, r10)
            java.util.List r8 = (java.util.List) r8
            r9 = r2[r7]
            java.lang.Object r7 = r0.A(r1, r7, r9, r10)
            java.util.List r7 = (java.util.List) r7
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r9, r10)
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r4 = (com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel) r4
            com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r9, r10)
            com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel r5 = (com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel) r5
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r10)
            com.ingka.ikea.app.caasremote.models.h r2 = (com.ingka.ikea.app.caasremote.models.h) r2
            r6 = 63
            r24 = r2
            r19 = r3
            r22 = r4
            r23 = r5
            r18 = r6
            r21 = r7
            r20 = r8
            goto L_0x00d8
        L_0x0062:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006a:
            if (r16 == 0) goto L_0x00ca
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00c5;
                case 0: goto L_0x00b6;
                case 1: goto L_0x00aa;
                case 2: goto L_0x009e;
                case 3: goto L_0x0092;
                case 4: goto L_0x0086;
                case 5: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0079:
            r9 = r2[r6]
            java.lang.Object r9 = r0.A(r1, r6, r9, r15)
            r15 = r9
            com.ingka.ikea.app.caasremote.models.h r15 = (com.ingka.ikea.app.caasremote.models.h) r15
            r3 = r3 | 32
        L_0x0084:
            r9 = 0
            goto L_0x006a
        L_0x0086:
            com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r5, r9, r14)
            r14 = r9
            com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel) r14
            r3 = r3 | 16
            goto L_0x0084
        L_0x0092:
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r4, r9, r13)
            r13 = r9
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r13 = (com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel) r13
            r3 = r3 | 8
            goto L_0x0084
        L_0x009e:
            r9 = r2[r7]
            java.lang.Object r9 = r0.A(r1, r7, r9, r12)
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 4
            goto L_0x0084
        L_0x00aa:
            r9 = r2[r8]
            java.lang.Object r9 = r0.A(r1, r8, r9, r11)
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 2
            goto L_0x0084
        L_0x00b6:
            jK.Y0 r9 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r9 = r0.A(r1, r4, r9, r10)
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 1
            r9 = r4
        L_0x00c3:
            r4 = 3
            goto L_0x006a
        L_0x00c5:
            r4 = 0
            r9 = r4
            r16 = r9
            goto L_0x00c3
        L_0x00ca:
            r18 = r3
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00d8:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.SetInstallationServiceRequestRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.SetInstallationServiceRequestRemoteModel
            r25 = 0
            r17 = r0
            r17.<init>((int) r18, (java.lang.String) r19, (java.util.List) r20, (java.util.List) r21, (com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel) r22, (com.ingka.ikea.app.caasremote.models.NullableServiceAreaRemoteModel) r23, (com.ingka.ikea.app.caasremote.models.h) r24, (jK.T0) r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.SetInstallationServiceRequestRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.SetInstallationServiceRequestRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, SetInstallationServiceRequestRemoteModel setInstallationServiceRequestRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(setInstallationServiceRequestRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        SetInstallationServiceRequestRemoteModel.b(setInstallationServiceRequestRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = SetInstallationServiceRequestRemoteModel.f71533g;
        return new KSerializer[]{C17294a.u(Y0.f144077a), C17294a.u(a10[1]), C17294a.u(a10[2]), C17294a.u(NullablePopulateCartRemoteModel$$serializer.INSTANCE), C17294a.u(NullableServiceAreaRemoteModel$$serializer.INSTANCE), C17294a.u(a10[5])};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
