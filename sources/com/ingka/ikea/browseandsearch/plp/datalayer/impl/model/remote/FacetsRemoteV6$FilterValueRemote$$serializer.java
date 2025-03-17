package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import XH.C16814e;
import com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.FacetsRemoteV6;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6.FilterValueRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class FacetsRemoteV6$FilterValueRemote$$serializer implements N<FacetsRemoteV6.FilterValueRemote> {
    public static final FacetsRemoteV6$FilterValueRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FacetsRemoteV6$FilterValueRemote$$serializer facetsRemoteV6$FilterValueRemote$$serializer = new FacetsRemoteV6$FilterValueRemote$$serializer();
        INSTANCE = facetsRemoteV6$FilterValueRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.FacetsRemoteV6.FilterValueRemote", facetsRemoteV6$FilterValueRemote$$serializer, 7);
        j02.p("id", false);
        j02.p("name", false);
        j02.p("count", false);
        j02.p("enabled", false);
        j02.p("selected", false);
        j02.p("value", false);
        j02.p("image", false);
        descriptor = j02;
    }

    private FacetsRemoteV6$FilterValueRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.ingka.ikea.core.remotemodel.ImageRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.FacetsRemoteV6.FilterValueRemote deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0061
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r9, r2, r10)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.A(r1, r8, r2, r10)
            java.lang.String r8 = (java.lang.String) r8
            jK.X r11 = jK.X.f144073a
            java.lang.Object r7 = r0.A(r1, r7, r11, r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            jK.i r11 = jK.C17457i.f144111a
            java.lang.Object r5 = r0.A(r1, r5, r11, r10)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.lang.Object r6 = r0.A(r1, r6, r11, r10)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Object r2 = r0.A(r1, r4, r2, r10)
            java.lang.String r2 = (java.lang.String) r2
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r4 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r3, r4, r10)
            com.ingka.ikea.core.remotemodel.ImageRemote r3 = (com.ingka.ikea.core.remotemodel.ImageRemote) r3
            r4 = 127(0x7f, float:1.78E-43)
            r24 = r2
            r25 = r3
            r18 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r20 = r8
            r19 = r9
            goto L_0x00e8
        L_0x0061:
            r16 = r8
            r2 = r9
            r9 = r10
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006a:
            if (r16 == 0) goto L_0x00d8
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00d4;
                case 0: goto L_0x00c5;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00aa;
                case 3: goto L_0x009e;
                case 4: goto L_0x0092;
                case 5: goto L_0x0086;
                case 6: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x0079:
            com.ingka.ikea.core.remotemodel.ImageRemote$$serializer r8 = com.ingka.ikea.core.remotemodel.ImageRemote$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r3, r8, r9)
            r9 = r8
            com.ingka.ikea.core.remotemodel.ImageRemote r9 = (com.ingka.ikea.core.remotemodel.ImageRemote) r9
            r2 = r2 | 64
        L_0x0084:
            r8 = 1
            goto L_0x006a
        L_0x0086:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r15)
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 32
            goto L_0x0084
        L_0x0092:
            jK.i r8 = jK.C17457i.f144111a
            java.lang.Object r8 = r0.A(r1, r6, r8, r14)
            r14 = r8
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r2 = r2 | 16
            goto L_0x0084
        L_0x009e:
            jK.i r8 = jK.C17457i.f144111a
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r2 = r2 | 8
            goto L_0x0084
        L_0x00aa:
            jK.X r8 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r7, r8, r12)
            r12 = r8
            java.lang.Integer r12 = (java.lang.Integer) r12
            r2 = r2 | 4
            goto L_0x0084
        L_0x00b6:
            jK.Y0 r8 = jK.Y0.f144077a
            r3 = 1
            java.lang.Object r8 = r0.A(r1, r3, r8, r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 2
            r8 = r3
            r3 = 6
            goto L_0x006a
        L_0x00c5:
            r3 = 1
            jK.Y0 r8 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r8 = r0.A(r1, r3, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 1
        L_0x00d2:
            r3 = 6
            goto L_0x0084
        L_0x00d4:
            r3 = 0
            r16 = r3
            goto L_0x00d2
        L_0x00d8:
            r18 = r2
            r25 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00e8:
            r0.c(r1)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.FacetsRemoteV6$FilterValueRemote r0 = new com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.FacetsRemoteV6$FilterValueRemote
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.FacetsRemoteV6$FilterValueRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.FacetsRemoteV6$FilterValueRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, FacetsRemoteV6.FilterValueRemote filterValueRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(filterValueRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        FacetsRemoteV6.FilterValueRemote.b(filterValueRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(X.f144073a);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, u12, C17294a.u(iVar), C17294a.u(iVar), C17294a.u(y02), C17294a.u(ImageRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
