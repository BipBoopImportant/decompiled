package com.contentsquare.android.internal.features.webviewbridge.assets;

import D8.c;
import XH.C16814e;
import a9.H1;
import android.util.Base64;
import fK.p;
import iK.C17395d;
import jK.C17461k;
import jK.E0;
import jK.J0;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

@p
public final class WebViewAssetContent {
    public static final a Companion = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final c f46872d = new c("WebViewAssetContent");

    /* renamed from: a  reason: collision with root package name */
    public final String f46873a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46874b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f46875c;

    public static final class a {
        public final KSerializer<WebViewAssetContent> serializer() {
            return WebViewAssetContent$$serializer.INSTANCE;
        }
    }

    @C16814e
    public WebViewAssetContent(int i10, String str, String str2, byte[] bArr) {
        byte[] bArr2;
        if (3 != (i10 & 3)) {
            WebViewAssetContent$$serializer.INSTANCE.getClass();
            E0.b(i10, 3, WebViewAssetContent$$serializer.f46876a);
        }
        this.f46873a = str;
        this.f46874b = str2;
        if ((i10 & 4) == 0) {
            try {
                bArr2 = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e10) {
                H1.a(f46872d, "Cannot decode Base64 data", e10);
                bArr2 = null;
            }
            this.f46875c = bArr2;
            return;
        }
        this.f46875c = bArr;
    }

    public static final /* synthetic */ void a(WebViewAssetContent webViewAssetContent, C17395d dVar, J0 j02) {
        byte[] bArr;
        dVar.y(j02, 0, webViewAssetContent.f46873a);
        dVar.y(j02, 1, webViewAssetContent.f46874b);
        if (!dVar.z(j02, 2)) {
            byte[] bArr2 = webViewAssetContent.f46875c;
            try {
                bArr = Base64.decode(webViewAssetContent.f46874b, 0);
            } catch (IllegalArgumentException e10) {
                H1.a(f46872d, "Cannot decode Base64 data", e10);
                bArr = null;
            }
            if (C17542s.e(bArr2, bArr)) {
                return;
            }
        }
        dVar.B(j02, 2, C17461k.f144123c, webViewAssetContent.f46875c);
    }

    public WebViewAssetContent(String str) {
        byte[] bArr;
        C17542s.j("text/css", "mimeType");
        C17542s.j(str, "data");
        this.f46873a = "text/css";
        this.f46874b = str;
        try {
            bArr = Base64.decode(str, 0);
        } catch (IllegalArgumentException e10) {
            H1.a(f46872d, "Cannot decode Base64 data", e10);
            bArr = null;
        }
        this.f46875c = bArr;
    }
}
