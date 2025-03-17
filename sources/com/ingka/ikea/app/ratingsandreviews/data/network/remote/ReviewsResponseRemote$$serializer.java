package com.ingka.ikea.app.ratingsandreviews.data.network.remote;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/ratingsandreviews/data/network/remote/ReviewsResponseRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ReviewsResponseRemote$$serializer implements N<ReviewsResponseRemote> {
    public static final ReviewsResponseRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f91089a = 8;
    private static final SerialDescriptor descriptor;

    static {
        ReviewsResponseRemote$$serializer reviewsResponseRemote$$serializer = new ReviewsResponseRemote$$serializer();
        INSTANCE = reviewsResponseRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote", reviewsResponseRemote$$serializer, 5);
        j02.p("totalResults", false);
        j02.p("sortedBy", false);
        j02.p("sortOptions", false);
        j02.p("reviews", false);
        j02.p("translations", false);
        descriptor = j02;
    }

    private ReviewsResponseRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote deserialize(kotlinx.serialization.encoding.Decoder r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote.f91083g
            boolean r3 = r0.q()
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x004d
            int r3 = r0.j(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote$$serializer r8 = com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r8, r9)
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote r4 = (com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote) r4
            r8 = r2[r5]
            java.lang.Object r5 = r0.o(r1, r5, r8, r9)
            java.util.List r5 = (java.util.List) r5
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r9)
            java.util.List r2 = (java.util.List) r2
            r6 = 31
            r21 = r2
            r17 = r3
            r19 = r4
            r20 = r5
            r16 = r6
            r18 = r7
            goto L_0x00b0
        L_0x004d:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r9 = r3
        L_0x0054:
            if (r14 == 0) goto L_0x00a4
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00a1
            if (r15 == 0) goto L_0x0099
            if (r15 == r7) goto L_0x0092
            if (r15 == r4) goto L_0x0086
            if (r15 == r5) goto L_0x007a
            if (r15 != r6) goto L_0x0074
            r8 = r2[r6]
            java.lang.Object r8 = r0.A(r1, r6, r8, r13)
            r13 = r8
            java.util.List r13 = (java.util.List) r13
            r9 = r9 | 16
        L_0x0072:
            r8 = 0
            goto L_0x0054
        L_0x0074:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x007a:
            r8 = r2[r5]
            java.lang.Object r8 = r0.o(r1, r5, r8, r12)
            r12 = r8
            java.util.List r12 = (java.util.List) r12
            r9 = r9 | 8
            goto L_0x0072
        L_0x0086:
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote$$serializer r8 = com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote$$serializer.INSTANCE
            java.lang.Object r8 = r0.o(r1, r4, r8, r11)
            r11 = r8
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote r11 = (com.ingka.ikea.app.ratingsandreviews.data.network.remote.AvailableSettingRemote) r11
            r9 = r9 | 4
            goto L_0x0072
        L_0x0092:
            java.lang.String r10 = r0.n(r1, r7)
            r9 = r9 | 2
            goto L_0x0072
        L_0x0099:
            r8 = 0
            int r3 = r0.j(r1, r8)
            r9 = r9 | 1
            goto L_0x0054
        L_0x00a1:
            r8 = 0
            r14 = r8
            goto L_0x0054
        L_0x00a4:
            r17 = r3
            r16 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
        L_0x00b0:
            r0.c(r1)
            com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote r0 = new com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote
            r22 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.ratingsandreviews.data.network.remote.ReviewsResponseRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ReviewsResponseRemote reviewsResponseRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(reviewsResponseRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ReviewsResponseRemote.c(reviewsResponseRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ReviewsResponseRemote.f91083g;
        return new KSerializer[]{X.f144073a, Y0.f144077a, AvailableSettingRemote$$serializer.INSTANCE, a10[3], C17294a.u(a10[4])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
