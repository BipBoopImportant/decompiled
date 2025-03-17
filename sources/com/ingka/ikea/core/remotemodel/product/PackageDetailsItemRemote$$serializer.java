package com.ingka.ikea.core.remotemodel.product;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/remotemodel/product/PackageDetailsItemRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsItemRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsItemRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/remotemodel/product/PackageDetailsItemRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PackageDetailsItemRemote$$serializer implements N<PackageDetailsItemRemote> {
    public static final PackageDetailsItemRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PackageDetailsItemRemote$$serializer packageDetailsItemRemote$$serializer = new PackageDetailsItemRemote$$serializer();
        INSTANCE = packageDetailsItemRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.remotemodel.product.PackageDetailsItemRemote", packageDetailsItemRemote$$serializer, 5);
        j02.p("type", false);
        j02.p("packages", false);
        j02.p("details", false);
        j02.p("totalCount", false);
        j02.p("packageCount", false);
        descriptor = j02;
    }

    private PackageDetailsItemRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.remotemodel.product.PackageDetailsItemRemote deserialize(kotlinx.serialization.encoding.Decoder r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.core.remotemodel.product.PackageDetailsItemRemote.f95317f
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0053
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r8, r3, r9)
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2[r7]
            java.lang.Object r2 = r0.A(r1, r7, r2, r9)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote$$serializer r7 = com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r7, r9)
            com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote r6 = (com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote) r6
            java.lang.Object r3 = r0.A(r1, r4, r3, r9)
            java.lang.String r3 = (java.lang.String) r3
            jK.X r4 = jK.X.f144073a
            java.lang.Object r4 = r0.A(r1, r5, r4, r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r5 = 31
            r19 = r2
            r21 = r3
            r22 = r4
            r17 = r5
            r20 = r6
            r18 = r8
            goto L_0x00c1
        L_0x0053:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0059:
            if (r14 == 0) goto L_0x00b5
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00b1
            if (r15 == 0) goto L_0x00a3
            if (r15 == r7) goto L_0x0097
            if (r15 == r6) goto L_0x008b
            if (r15 == r4) goto L_0x007f
            if (r15 != r5) goto L_0x0079
            jK.X r8 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.lang.Integer r13 = (java.lang.Integer) r13
            r3 = r3 | 16
        L_0x0077:
            r8 = 0
            goto L_0x0059
        L_0x0079:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x007f:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x0077
        L_0x008b:
            com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote$$serializer r8 = com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote r11 = (com.ingka.ikea.core.remotemodel.product.ProductDimensionRemote) r11
            r3 = r3 | 4
            goto L_0x0077
        L_0x0097:
            r8 = r2[r7]
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 2
            goto L_0x0077
        L_0x00a3:
            jK.Y0 r8 = jK.Y0.f144077a
            r15 = 0
            java.lang.Object r8 = r0.A(r1, r15, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 1
            r8 = r15
            goto L_0x0059
        L_0x00b1:
            r15 = 0
            r8 = r15
            r14 = r8
            goto L_0x0059
        L_0x00b5:
            r17 = r3
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
        L_0x00c1:
            r0.c(r1)
            com.ingka.ikea.core.remotemodel.product.PackageDetailsItemRemote r0 = new com.ingka.ikea.core.remotemodel.product.PackageDetailsItemRemote
            r23 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.PackageDetailsItemRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.remotemodel.product.PackageDetailsItemRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PackageDetailsItemRemote packageDetailsItemRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(packageDetailsItemRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PackageDetailsItemRemote.c(packageDetailsItemRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = PackageDetailsItemRemote.f95317f;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(a10[1]), C17294a.u(ProductDimensionRemote$$serializer.INSTANCE), C17294a.u(y02), C17294a.u(X.f144073a)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
