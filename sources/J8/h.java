package j8;

import F8.e;
import F8.i;
import QJ.F0;
import QJ.T;
import XH.C16796C;
import XH.C16807N;
import YH.X;
import a9.A1;
import a9.L1;
import android.webkit.WebView;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import dI.C17164e;
import dI.C17168i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import u8.C8886a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001$B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\rH\u0001¢\u0006\u0004\b#\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u0014\u0010-\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,¨\u0006/"}, d2 = {"Lj8/h;", "", "", "tagId", "packageName", "userId", "La9/L1;", "tagDownloader", "LF8/i;", "networkProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La9/L1;LF8/i;)V", "Lkotlin/Function0;", "LXH/N;", "onTagDownloaded", "Lkotlin/Function1;", "onFetchLocalTag", "f", "(Ljava/lang/String;LnI/a;LnI/l;)V", "n", "()V", "", "isLocal", "m", "(Z)V", "Landroid/webkit/WebView;", "view", "tagData", "h", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "j", "k", "(Landroid/webkit/WebView;)V", "webView", "e", "l", "a", "Ljava/lang/String;", "b", "c", "d", "La9/L1;", "LF8/i;", "LD8/c;", "LD8/c;", "logger", "g", "library_release"}, k = 1, mv = {1, 8, 0})
public final class h {

    /* renamed from: g  reason: collision with root package name */
    public static final a f54077g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f54078a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54079b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54080c;

    /* renamed from: d  reason: collision with root package name */
    private final L1 f54081d;

    /* renamed from: e  reason: collision with root package name */
    private final i f54082e;

    /* renamed from: f  reason: collision with root package name */
    private final D8.c f54083f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj8/h$a;", "", "<init>", "()V", "", "d", "()Ljava/lang/String;", "LF8/i;", "c", "()LF8/i;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r0 = r0.b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final F8.i c() {
            /*
                r8 = this;
                X8.b r0 = X8.b.i()
                r1 = 0
                if (r0 == 0) goto L_0x0013
                android.app.Application r0 = r0.b()
                if (r0 == 0) goto L_0x0013
                android.content.Context r0 = r0.getBaseContext()
                r3 = r0
                goto L_0x0014
            L_0x0013:
                r3 = r1
            L_0x0014:
                if (r3 == 0) goto L_0x0020
                F8.i r1 = new F8.i
                r6 = 6
                r7 = 0
                r4 = 0
                r5 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0020:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j8.h.a.c():F8.i");
        }

        /* access modifiers changed from: private */
        public final String d() {
            JsonConfig.ProjectConfiguration b10;
            JsonConfig.WebView s10;
            C8886a a10 = C8886a.f56874d.a();
            A8.b c10 = a10 != null ? a10.c() : null;
            if (c10 == null || (b10 = c10.b()) == null || (s10 = b10.s()) == null) {
                return null;
            }
            return s10.a();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        public b(Object obj) {
            super(0, obj, h.class, "logTagNotAvailable", "logTagNotAvailable$library_release()V", 0);
        }

        public final Object invoke() {
            ((h) this.receiver).l();
            return C16807N.f139792a;
        }
    }

    public static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h f54084c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ WebView f54085d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f54086e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h hVar, WebView webView, String str) {
            super(0);
            this.f54084c = hVar;
            this.f54085d = webView;
            this.f54086e = str;
        }

        public final Object invoke() {
            this.f54084c.j(this.f54085d, this.f54086e);
            return C16807N.f139792a;
        }
    }

    public static final class d extends C17544u implements C17642l<String, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h f54087c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ WebView f54088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(h hVar, WebView webView) {
            super(1);
            this.f54087c = hVar;
            this.f54088d = webView;
        }

        public final Object invoke(Object obj) {
            String str = (String) obj;
            C17542s.j(str, "data");
            this.f54087c.h(this.f54088d, str);
            return C16807N.f139792a;
        }
    }

    public h() {
        this((String) null, (String) null, (String) null, (L1) null, (i) null, 31, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final void d(String str) {
    }

    private final void f(String str, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar) {
        L1 l12 = this.f54081d;
        String str2 = this.f54079b;
        String str3 = this.f54080c;
        b bVar = new b(this);
        l12.getClass();
        C17542s.j(str, "tagId");
        C17542s.j(str2, "packageName");
        C17542s.j(aVar, "onDownloaded");
        C17542s.j(lVar, "onFetchLocalTag");
        C17542s.j(bVar, "onTagNotAvailable");
        F0 unused = C16314k.d(l12.f42124d, (C17168i) null, (T) null, new A1(l12, str, str3, str2, bVar, lVar, aVar, (C17164e) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void g(String str) {
    }

    /* access modifiers changed from: private */
    public static final void i(String str) {
    }

    private final void m(boolean z10) {
        e h10;
        Map p10 = X.p(C16796C.a("injectionType", z10 ? "local" : "remote"));
        i iVar = this.f54082e;
        p10.put("connectionType", String.valueOf((iVar == null || (h10 = iVar.h()) == null) ? -1 : h10.b()));
        U8.a.f40370a.d("tag_injection", p10);
    }

    private final void n() {
        e h10;
        Map p10 = X.p(C16796C.a("tagAvailable", String.valueOf(this.f54078a != null)));
        i iVar = this.f54082e;
        p10.put("connectionType", String.valueOf((iVar == null || (h10 = iVar.h()) == null) ? -1 : h10.b()));
        U8.a.f40370a.d("tag_injection", p10);
    }

    public final void e(WebView webView) {
        if (webView != null) {
            webView.evaluateJavascript("window.CS_isWebView = true;", new g());
        }
    }

    public final void h(WebView webView, String str) {
        C17542s.j(str, "tagData");
        this.f54083f.k("Injecting local tag into the WebView");
        m(true);
        e(webView);
        if (webView != null) {
            webView.evaluateJavascript("\n            if (!Array.from(document.getElementsByTagName(\"script\")).some(script => {\n            const src = script.src;\n            return src && src.includes(\"contentsquare.net\") && /t.*\\\\.contentsquare\\\\.net/.test(src);\n        })) {\n            window._uxa = window._uxa || [];           \n            window._uxa.push(['setOption', 'isWebView', true]);\n            " + str + "\n        }", new f());
        }
    }

    public final void j(WebView webView, String str) {
        C17542s.j(str, "tagId");
        this.f54083f.k("Injecting tag into the WebView");
        m(false);
        e(webView);
        if (webView != null) {
            webView.evaluateJavascript("(function () {\n    window._uxa = window._uxa || [];\n    window._uxa.push(['setOption', 'isWebView', true]);\n\n    var newScriptSrc = \"https://t.contentsquare.net/uxa/" + str + ".js\";\n    // match any subdomain of contentsquare.net in the old script's src\n    var oldScriptRegex = /https?:\\/\\/.*\\.contentsquare\\.net\\/wvt\\/web-view\\.js/;\n\n    var scripts = document.getElementsByTagName(\"script\");\n\n    // Remove old script if it matches the regex\n    for (var i = 0; i < scripts.length; i++) {\n        if (oldScriptRegex.test(scripts[i].src)) {\n            scripts[i].parentNode.removeChild(scripts[i]);\n            break; // Assuming there's only one instance of the old script\n        }\n    }\n\n    // Check if new script already exists\n    var scriptExists = Array.from(scripts).some(script => script.src === newScriptSrc);\n\n    // Inject new script if it doesn't exist\n    if (!scriptExists) {\n        var mt = document.createElement(\"script\");\n        mt.type = \"text/javascript\";\n        mt.async = true;\n        mt.src = newScriptSrc;\n        document.getElementsByTagName(\"head\")[0].appendChild(mt);\n    }\n})();", new e());
        }
    }

    public final void k(WebView webView) {
        C16807N n10;
        String str = this.f54078a;
        if (str != null) {
            if (str.length() <= 0 || C17542s.e(str, "null")) {
                l();
            } else {
                f(str, new c(this, webView, str), new d(this, webView));
            }
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            l();
        }
    }

    public final void l() {
        this.f54083f.k("Tracking tag is null or not available!");
        n();
    }

    public h(String str, String str2, String str3, L1 l12, i iVar) {
        C17542s.j(str2, "packageName");
        C17542s.j(l12, "tagDownloader");
        this.f54078a = str;
        this.f54079b = str2;
        this.f54080c = str3;
        this.f54081d = l12;
        this.f54082e = iVar;
        this.f54083f = new D8.c("CsWebViewTagInjector");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h(java.lang.String r4, java.lang.String r5, java.lang.String r6, a9.L1 r7, F8.i r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x000a
            j8.h$a r4 = f54077g
            java.lang.String r4 = r4.d()
        L_0x000a:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L_0x0025
            X8.b r5 = X8.b.i()
            if (r5 == 0) goto L_0x0020
            android.app.Application r5 = r5.b()
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = r5.getPackageName()
            goto L_0x0021
        L_0x0020:
            r5 = r0
        L_0x0021:
            if (r5 != 0) goto L_0x0025
            java.lang.String r5 = ""
        L_0x0025:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x003a
            X8.c r5 = X8.c.c()
            if (r5 == 0) goto L_0x003b
            a9.c1 r5 = r5.f()
            if (r5 == 0) goto L_0x003b
            java.lang.String r6 = r5.a()
        L_0x003a:
            r0 = r6
        L_0x003b:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0044
            a9.L1 r7 = new a9.L1
            r7.<init>()
        L_0x0044:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x004f
            j8.h$a r5 = f54077g
            F8.i r8 = r5.c()
        L_0x004f:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.h.<init>(java.lang.String, java.lang.String, java.lang.String, a9.L1, F8.i, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
