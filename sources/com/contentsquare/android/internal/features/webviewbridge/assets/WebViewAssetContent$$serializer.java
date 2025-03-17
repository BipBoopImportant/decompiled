package com.contentsquare.android.internal.features.webviewbridge.assets;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17461k;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/features/webviewbridge/assets/WebViewAssetContent.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/features/webviewbridge/assets/WebViewAssetContent;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class WebViewAssetContent$$serializer implements N<WebViewAssetContent> {
    public static final WebViewAssetContent$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46876a;

    static {
        WebViewAssetContent$$serializer webViewAssetContent$$serializer = new WebViewAssetContent$$serializer();
        INSTANCE = webViewAssetContent$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAssetContent", webViewAssetContent$$serializer, 3);
        j02.p("mimeType", false);
        j02.p("data", false);
        j02.p("payload", true);
        f46876a = j02;
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(C17461k.f144123c);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, u10};
    }

    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        Object obj;
        String str2;
        C17542s.j(decoder, "decoder");
        J0 j02 = f46876a;
        C17394c b10 = decoder.b(j02);
        String str3 = null;
        if (b10.q()) {
            str2 = b10.n(j02, 0);
            str = b10.n(j02, 1);
            obj = b10.A(j02, 2, C17461k.f144123c, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            Object obj2 = null;
            while (z10) {
                int p10 = b10.p(j02);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str3 = b10.n(j02, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str4 = b10.n(j02, 1);
                    i11 |= 2;
                } else if (p10 == 2) {
                    obj2 = b10.A(j02, 2, C17461k.f144123c, obj2);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str2 = str3;
            str = str4;
            obj = obj2;
        }
        b10.c(j02);
        return new WebViewAssetContent(i10, str2, str, (byte[]) obj);
    }

    public final SerialDescriptor getDescriptor() {
        return f46876a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        WebViewAssetContent webViewAssetContent = (WebViewAssetContent) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(webViewAssetContent, "value");
        J0 j02 = f46876a;
        C17395d b10 = encoder.b(j02);
        WebViewAssetContent.a(webViewAssetContent, b10, j02);
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
