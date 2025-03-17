package com.contentsquare.android.internal.features.webviewbridge.assets;

import G8.g;
import HJ.C15854t;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import com.adjust.sdk.Constants;
import fK.p;
import jK.E0;
import jK.J;
import java.security.MessageDigest;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlinx.serialization.KSerializer;
import nI.C17631a;

@p
public final class WebViewAsset {
    public static final c Companion = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f46854h = C16877v.q("http", Constants.SCHEME);

    /* renamed from: i  reason: collision with root package name */
    public static final C16824o<MessageDigest> f46855i = C16825p.b(b.f46871c);

    /* renamed from: j  reason: collision with root package name */
    public static final D8.c f46856j = new D8.c("WebViewAsset");

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f46857k = {null, null, null, null, null, J.b("com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.AssetType", a.values()), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f46858a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46859b;

    /* renamed from: c  reason: collision with root package name */
    public final String f46860c;

    /* renamed from: d  reason: collision with root package name */
    public WebViewAssetContent f46861d;

    /* renamed from: e  reason: collision with root package name */
    public final String f46862e;

    /* renamed from: f  reason: collision with root package name */
    public final a f46863f;

    /* renamed from: g  reason: collision with root package name */
    public String f46864g;

    public enum a {
        DATA_CSS,
        DATA,
        REMOTE,
        UNSUPPORTED
    }

    public static final class b extends C17544u implements C17631a<MessageDigest> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f46871c = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return MessageDigest.getInstance(Constants.SHA256);
        }
    }

    public static final class c {
        public final KSerializer<WebViewAsset> serializer() {
            return WebViewAsset$$serializer.INSTANCE;
        }
    }

    @C16814e
    public WebViewAsset(int i10, String str, String str2, String str3, WebViewAssetContent webViewAssetContent, String str4, a aVar, String str5) {
        String str6;
        byte[] bArr;
        if (7 != (i10 & 7)) {
            WebViewAsset$$serializer.INSTANCE.getClass();
            E0.b(i10, 7, WebViewAsset$$serializer.f46865a);
        }
        this.f46858a = str;
        this.f46859b = str2;
        this.f46860c = str3;
        if ((i10 & 8) == 0) {
            this.f46861d = null;
        } else {
            this.f46861d = webViewAssetContent;
        }
        if ((i10 & 16) == 0) {
            WebViewAssetContent webViewAssetContent2 = this.f46861d;
            if (webViewAssetContent2 == null || (bArr = webViewAssetContent2.f46875c) == null) {
                str6 = null;
            } else {
                Companion.getClass();
                MessageDigest value = f46855i.getValue();
                C17542s.i(value, "<get-hashMessageDigest>(...)");
                byte[] digest = value.digest(bArr);
                C17542s.i(digest, "hashMessageDigest.digest(it)");
                str6 = g.p(digest);
            }
            this.f46862e = str6;
        } else {
            this.f46862e = str4;
        }
        if ((i10 & 32) == 0) {
            this.f46863f = b() ? a.DATA_CSS : a() ? a.DATA : c() ? a.REMOTE : a.UNSUPPORTED;
        } else {
            this.f46863f = aVar;
        }
        if ((i10 & 64) == 0) {
            this.f46864g = null;
        } else {
            this.f46864g = str5;
        }
    }

    public final boolean a() {
        return (this.f46861d == null && this.f46862e == null) ? false : true;
    }

    public final boolean b() {
        if (!a()) {
            return false;
        }
        WebViewAssetContent webViewAssetContent = this.f46861d;
        return C17542s.e(webViewAssetContent != null ? webViewAssetContent.f46873a : null, "text/css") || C15854t.G(this.f46858a, ".css", false, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r8 = this;
            boolean r0 = r8.a()
            r1 = 0
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = r8.f46858a
            r2 = 1
            if (r0 == 0) goto L_0x0059
            HJ.p r3 = new HJ.p
            java.lang.String r4 = "^(.*?)://([^:/]+)(?:\\d+)?"
            r3.<init>((java.lang.String) r4)
            r4 = 2
            r5 = 0
            HJ.l r3 = HJ.C15850p.d(r3, r0, r1, r4, r5)
            if (r3 == 0) goto L_0x0028
            java.util.List r3 = r3.b()
            if (r3 == 0) goto L_0x0028
            java.lang.Object r3 = YH.C16877v.z0(r3, r2)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
        L_0x0028:
            if (r5 == 0) goto L_0x0059
            java.util.List<java.lang.String> r3 = f46854h
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r4 = r5.toLowerCase(r4)
            java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.C17542s.i(r4, r6)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x005a
            D8.c r4 = f46856j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unsupported scheme found: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " in "
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.l(r0)
            goto L_0x005a
        L_0x0059:
            r3 = r1
        L_0x005a:
            if (r3 == 0) goto L_0x005d
            r1 = r2
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset.c():boolean");
    }

    public WebViewAsset(String str, String str2, String str3, WebViewAssetContent webViewAssetContent) {
        String str4;
        C17542s.j(str, "id");
        C17542s.j(str2, "rawPath");
        C17542s.j(str3, "basePath");
        this.f46858a = str;
        this.f46859b = str2;
        this.f46860c = str3;
        this.f46861d = webViewAssetContent;
        byte[] bArr = webViewAssetContent.f46875c;
        if (bArr != null) {
            Companion.getClass();
            MessageDigest value = f46855i.getValue();
            C17542s.i(value, "<get-hashMessageDigest>(...)");
            byte[] digest = value.digest(bArr);
            C17542s.i(digest, "hashMessageDigest.digest(it)");
            str4 = g.p(digest);
        } else {
            str4 = null;
        }
        this.f46862e = str4;
        this.f46863f = b() ? a.DATA_CSS : a() ? a.DATA : c() ? a.REMOTE : a.UNSUPPORTED;
    }
}
