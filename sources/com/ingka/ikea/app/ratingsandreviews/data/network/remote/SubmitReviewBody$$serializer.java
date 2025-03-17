package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

import XH.C16814e;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewBody.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewBody;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewBody;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/SubmitReviewBody;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class SubmitReviewBody$$serializer implements N<SubmitReviewBody> {
    public static final SubmitReviewBody$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f91099a = 8;
    private static final SerialDescriptor descriptor;

    static {
        SubmitReviewBody$$serializer submitReviewBody$$serializer = new SubmitReviewBody$$serializer();
        INSTANCE = submitReviewBody$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewBody", submitReviewBody$$serializer, 7);
        j02.p("rating", false);
        j02.p("title", false);
        j02.p("text", false);
        j02.p("recommended", false);
        j02.p("secondaryRatings", false);
        j02.p("order", false);
        j02.p("sourceName", false);
        descriptor = j02;
    }

    private SubmitReviewBody$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewBody deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewBody.f91091i
            boolean r3 = r0.q()
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            r8 = 4
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0057
            int r3 = r0.j(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r7 = r0.n(r1, r7)
            boolean r6 = r0.D(r1, r6)
            r2 = r2[r8]
            java.lang.Object r2 = r0.A(r1, r8, r2, r11)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote$$serializer r8 = com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r8, r11)
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote r5 = (com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote) r5
            java.lang.String r4 = r0.n(r1, r4)
            r8 = 127(0x7f, float:1.78E-43)
            r24 = r2
            r20 = r3
            r26 = r4
            r25 = r5
            r23 = r6
            r22 = r7
            r19 = r8
            r21 = r9
            goto L_0x00c6
        L_0x0057:
            r17 = r9
            r3 = r10
            r12 = r3
            r13 = r11
            r14 = r13
            r15 = r14
            r16 = r15
            r10 = r16
            r11 = r12
        L_0x0063:
            if (r17 == 0) goto L_0x00b6
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00b3;
                case 0: goto L_0x00a8;
                case 1: goto L_0x00a0;
                case 2: goto L_0x0099;
                case 3: goto L_0x0092;
                case 4: goto L_0x0086;
                case 5: goto L_0x007a;
                case 6: goto L_0x0072;
                default: goto L_0x006c;
            }
        L_0x006c:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0072:
            java.lang.String r16 = r0.n(r1, r4)
            r12 = r12 | 64
        L_0x0078:
            r9 = 1
            goto L_0x0063
        L_0x007a:
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote$$serializer r9 = com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r5, r9, r10)
            r10 = r9
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote r10 = (com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewOrderRemote) r10
            r12 = r12 | 32
            goto L_0x0078
        L_0x0086:
            r9 = r2[r8]
            java.lang.Object r9 = r0.A(r1, r8, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r12 = r12 | 16
            goto L_0x0078
        L_0x0092:
            boolean r11 = r0.D(r1, r6)
            r12 = r12 | 8
            goto L_0x0078
        L_0x0099:
            java.lang.String r14 = r0.n(r1, r7)
            r12 = r12 | 4
            goto L_0x0078
        L_0x00a0:
            r9 = 1
            java.lang.String r13 = r0.n(r1, r9)
            r12 = r12 | 2
            goto L_0x0063
        L_0x00a8:
            r3 = 0
            r9 = 1
            int r18 = r0.j(r1, r3)
            r12 = r12 | 1
            r3 = r18
            goto L_0x0063
        L_0x00b3:
            r17 = 0
            goto L_0x0078
        L_0x00b6:
            r20 = r3
            r25 = r10
            r23 = r11
            r19 = r12
            r21 = r13
            r22 = r14
            r24 = r15
            r26 = r16
        L_0x00c6:
            r0.c(r1)
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewBody r0 = new com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewBody
            r27 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewBody$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.ratingsandreviews.data.network.remote.SubmitReviewBody");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, SubmitReviewBody submitReviewBody) {
        C17542s.j(encoder, "encoder");
        C17542s.j(submitReviewBody, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        SubmitReviewBody.b(submitReviewBody, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(SubmitReviewBody.f91091i[4]);
        KSerializer<?> u11 = C17294a.u(SubmitReviewOrderRemote$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{X.f144073a, y02, y02, C17457i.f144111a, u10, u11, y02};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
