package com.contentsquare.android.internal.features.webviewbridge.assets;

import XH.C16814e;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/features/webviewbridge/assets/WebViewAsset.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/features/webviewbridge/assets/WebViewAsset;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class WebViewAsset$$serializer implements N<WebViewAsset> {
    public static final WebViewAsset$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46865a;

    static {
        WebViewAsset$$serializer webViewAsset$$serializer = new WebViewAsset$$serializer();
        INSTANCE = webViewAsset$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset", webViewAsset$$serializer, 7);
        j02.p("assetId", false);
        j02.p("assetRawPath", false);
        j02.p("assetBasePath", false);
        j02.p("retrievedAssetContent", true);
        j02.p("hash", true);
        j02.p("type", true);
        j02.p("serializationId", true);
        f46865a = j02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlinx.serialization.KSerializer<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        /*
            r8 = this;
            kotlinx.serialization.KSerializer<java.lang.Object>[] r0 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.f46857k
            jK.Y0 r1 = jK.Y0.f144077a
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent$$serializer r2 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent$$serializer.INSTANCE
            kotlinx.serialization.KSerializer r2 = gK.C17294a.u(r2)
            kotlinx.serialization.KSerializer r3 = gK.C17294a.u(r1)
            r4 = 5
            r0 = r0[r4]
            kotlinx.serialization.KSerializer r5 = gK.C17294a.u(r1)
            r6 = 7
            kotlinx.serialization.KSerializer[] r6 = new kotlinx.serialization.KSerializer[r6]
            r7 = 0
            r6[r7] = r1
            r7 = 1
            r6[r7] = r1
            r7 = 2
            r6[r7] = r1
            r1 = 3
            r6[r1] = r2
            r1 = 4
            r6[r1] = r3
            r6[r4] = r0
            r0 = 6
            r6[r0] = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$$serializer.childSerializers():kotlinx.serialization.KSerializer[]");
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            jK.J0 r1 = f46865a
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer<java.lang.Object>[] r2 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.f46857k
            boolean r3 = r0.q()
            r4 = 6
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 5
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r7 = r0.n(r1, r7)
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent$$serializer r10 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r10, r11)
            jK.Y0 r10 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r6, r10, r11)
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r11)
            java.lang.Object r4 = r0.A(r1, r4, r10, r11)
            r8 = 127(0x7f, float:1.78E-43)
            r14 = r5
            r5 = r3
            goto L_0x00ae
        L_0x0045:
            r17 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x004e:
            if (r17 == 0) goto L_0x00a7
            int r7 = r0.p(r1)
            switch(r7) {
                case -1: goto L_0x00a2;
                case 0: goto L_0x0095;
                case 1: goto L_0x008a;
                case 2: goto L_0x0082;
                case 3: goto L_0x0079;
                case 4: goto L_0x0070;
                case 5: goto L_0x0067;
                case 6: goto L_0x005d;
                default: goto L_0x0057;
            }
        L_0x0057:
            fK.E r0 = new fK.E
            r0.<init>((int) r7)
            throw r0
        L_0x005d:
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r4, r7, r9)
            r3 = r3 | 64
        L_0x0065:
            r7 = 2
            goto L_0x004e
        L_0x0067:
            r7 = r2[r8]
            java.lang.Object r10 = r0.o(r1, r8, r7, r10)
            r3 = r3 | 32
            goto L_0x0065
        L_0x0070:
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r15 = r0.A(r1, r6, r7, r15)
            r3 = r3 | 16
            goto L_0x0065
        L_0x0079:
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent$$serializer r7 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent$$serializer.INSTANCE
            java.lang.Object r14 = r0.A(r1, r5, r7, r14)
            r3 = r3 | 8
            goto L_0x0065
        L_0x0082:
            r7 = 2
            java.lang.String r13 = r0.n(r1, r7)
            r3 = r3 | 4
            goto L_0x004e
        L_0x008a:
            r7 = 2
            r12 = 1
            java.lang.String r16 = r0.n(r1, r12)
            r3 = r3 | 2
            r12 = r16
            goto L_0x004e
        L_0x0095:
            r7 = 2
            r11 = 0
            r16 = 1
            java.lang.String r18 = r0.n(r1, r11)
            r3 = r3 | 1
            r11 = r18
            goto L_0x004e
        L_0x00a2:
            r16 = 1
            r17 = 0
            goto L_0x0065
        L_0x00a7:
            r8 = r3
            r4 = r9
            r2 = r10
            r5 = r11
            r9 = r12
            r7 = r13
            r6 = r15
        L_0x00ae:
            r0.c(r1)
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset r0 = new com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset
            r1 = r14
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent r1 = (com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent) r1
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$a r2 = (com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a) r2
            r11 = r4
            java.lang.String r11 = (java.lang.String) r11
            r3 = r0
            r4 = r8
            r6 = r9
            r8 = r1
            r9 = r10
            r10 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    public final SerialDescriptor getDescriptor() {
        return f46865a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        if (kotlin.jvm.internal.C17542s.e(r3, r4) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        if (r9.f46863f != (r9.b() ? com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a.DATA_CSS : r9.a() ? com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a.DATA : r9.c() ? com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a.REMOTE : com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a.UNSUPPORTED)) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void serialize(kotlinx.serialization.encoding.Encoder r8, java.lang.Object r9) {
        /*
            r7 = this;
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset r9 = (com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset) r9
            java.lang.String r0 = "encoder"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            jK.J0 r0 = f46865a
            iK.d r8 = r8.b(r0)
            kotlinx.serialization.KSerializer<java.lang.Object>[] r1 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.f46857k
            java.lang.String r2 = r9.f46858a
            r3 = 0
            r8.y(r0, r3, r2)
            java.lang.String r2 = r9.f46859b
            r3 = 1
            r8.y(r0, r3, r2)
            java.lang.String r2 = r9.f46860c
            r3 = 2
            r8.y(r0, r3, r2)
            r2 = 3
            boolean r3 = r8.z(r0, r2)
            if (r3 == 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent r3 = r9.f46861d
            if (r3 == 0) goto L_0x0039
        L_0x0032:
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent$$serializer r3 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent$$serializer.INSTANCE
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent r4 = r9.f46861d
            r8.B(r0, r2, r3, r4)
        L_0x0039:
            r2 = 4
            boolean r3 = r8.z(r0, r2)
            if (r3 == 0) goto L_0x0041
            goto L_0x0072
        L_0x0041:
            java.lang.String r3 = r9.f46862e
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent r4 = r9.f46861d
            if (r4 == 0) goto L_0x006b
            byte[] r4 = r4.f46875c
            if (r4 == 0) goto L_0x006b
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$c r5 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.Companion
            r5.getClass()
            XH.o<java.security.MessageDigest> r5 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.f46855i
            java.lang.Object r5 = r5.getValue()
            java.lang.String r6 = "<get-hashMessageDigest>(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            java.security.MessageDigest r5 = (java.security.MessageDigest) r5
            byte[] r4 = r5.digest(r4)
            java.lang.String r5 = "hashMessageDigest.digest(it)"
            kotlin.jvm.internal.C17542s.i(r4, r5)
            java.lang.String r4 = G8.g.p(r4)
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 != 0) goto L_0x0079
        L_0x0072:
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.String r4 = r9.f46862e
            r8.B(r0, r2, r3, r4)
        L_0x0079:
            r2 = 5
            boolean r3 = r8.z(r0, r2)
            if (r3 == 0) goto L_0x0081
            goto L_0x00a2
        L_0x0081:
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$a r3 = r9.f46863f
            boolean r4 = r9.b()
            if (r4 == 0) goto L_0x008c
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$a r4 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a.DATA_CSS
            goto L_0x00a0
        L_0x008c:
            boolean r4 = r9.a()
            if (r4 == 0) goto L_0x0095
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$a r4 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a.DATA
            goto L_0x00a0
        L_0x0095:
            boolean r4 = r9.c()
            if (r4 == 0) goto L_0x009e
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$a r4 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a.REMOTE
            goto L_0x00a0
        L_0x009e:
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$a r4 = com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.a.UNSUPPORTED
        L_0x00a0:
            if (r3 == r4) goto L_0x00a9
        L_0x00a2:
            r1 = r1[r2]
            com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$a r3 = r9.f46863f
            r8.i(r0, r2, r1, r3)
        L_0x00a9:
            r1 = 6
            boolean r2 = r8.z(r0, r1)
            if (r2 == 0) goto L_0x00b1
            goto L_0x00b5
        L_0x00b1:
            java.lang.String r2 = r9.f46864g
            if (r2 == 0) goto L_0x00bc
        L_0x00b5:
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.String r9 = r9.f46864g
            r8.B(r0, r1, r2, r9)
        L_0x00bc:
            r8.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset$$serializer.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
