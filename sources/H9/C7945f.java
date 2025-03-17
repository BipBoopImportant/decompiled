package h9;

import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.P;
import U0.p1;
import XH.C16796C;
import XH.C16807N;
import XH.C16814e;
import XH.C16820k;
import XH.y;
import YH.X;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import c2.C5267b;
import dI.C17164e;
import dI.C17169j;
import eI.C17187b;
import f1.C5300b;
import f1.C5309k;
import h9.C7943d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5859e;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0001\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010!\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001fH\u0007¢\u0006\u0004\b!\u0010\"\",\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020$0#8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lh9/h;", "state", "Landroidx/compose/ui/d;", "modifier", "", "captureBackPresses", "Lh9/g;", "navigator", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "LXH/N;", "onCreated", "onDispose", "Lh9/b;", "client", "Lh9/a;", "chromeClient", "Landroid/content/Context;", "factory", "b", "(Lh9/h;Landroidx/compose/ui/d;ZLh9/g;LnI/l;LnI/l;Lh9/b;Lh9/a;LnI/l;LU0/m;II)V", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "a", "(Lh9/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/d;ZLh9/g;LnI/l;LnI/l;Lh9/b;Lh9/a;LnI/l;LU0/m;II)V", "LQJ/Q;", "coroutineScope", "c", "(LQJ/Q;LU0/m;II)Lh9/g;", "", "url", "", "additionalHttpHeaders", "d", "(Ljava/lang/String;Ljava/util/Map;LU0/m;II)Lh9/h;", "Lf1/k;", "", "Lf1/k;", "getWebStateSaver", "()Lf1/k;", "getWebStateSaver$annotations", "()V", "WebStateSaver", "web_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: h9.f  reason: case insensitive filesystem */
public final class C7945f {

    /* renamed from: a  reason: collision with root package name */
    private static final C5309k<C7947h, Object> f51685a = C5300b.a(new a("pagetitle", "lastloaded", "bundle"), new b("pagetitle", "lastloaded", "bundle"));

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf1/m;", "Lh9/h;", "it", "", "", "", "a", "(Lf1/m;Lh9/h;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h9.f$a */
    static final class a extends C17544u implements p<f1.m, C7947h, Map<String, ? extends Object>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51686c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f51687d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f51688e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3) {
            super(2);
            this.f51686c = str;
            this.f51687d = str2;
            this.f51688e = str3;
        }

        /* renamed from: a */
        public final Map<String, Object> invoke(f1.m mVar, C7947h hVar) {
            C17542s.j(mVar, "$this$mapSaver");
            C17542s.j(hVar, "it");
            Bundle bundle = new Bundle();
            WebView g10 = hVar.g();
            if (g10 != null) {
                g10.saveState(bundle);
            }
            return X.m(C16796C.a(this.f51686c, hVar.e()), C16796C.a(this.f51687d, hVar.c()), C16796C.a(this.f51688e, bundle));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "it", "Lh9/h;", "a", "(Ljava/util/Map;)Lh9/h;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h9.f$b */
    static final class b extends C17544u implements C17642l<Map<String, ? extends Object>, C7947h> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f51690d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f51691e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3) {
            super(1);
            this.f51689c = str;
            this.f51690d = str2;
            this.f51691e = str3;
        }

        /* renamed from: a */
        public final C7947h invoke(Map<String, ? extends Object> map) {
            C17542s.j(map, "it");
            C7947h hVar = new C7947h(C7943d.b.f51678a);
            String str = this.f51689c;
            String str2 = this.f51690d;
            String str3 = this.f51691e;
            hVar.m((String) map.get(str));
            hVar.j((String) map.get(str2));
            hVar.n((Bundle) map.get(str3));
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h9.f$c */
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WebView f51692c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(WebView webView) {
            super(0);
            this.f51692c = webView;
        }

        public final void invoke() {
            WebView webView = this.f51692c;
            if (webView != null) {
                webView.goBack();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "com.google.accompanist.web.WebViewKt$WebView$12$1", f = "WebView.kt", l = {191}, m = "invokeSuspend")
    /* renamed from: h9.f$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f51693c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7946g f51694d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WebView f51695e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C7946g gVar, WebView webView, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f51694d = gVar;
            this.f51695e = webView;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f51694d, this.f51695e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f51693c;
            if (i10 == 0) {
                y.b(obj);
                C7946g gVar = this.f51694d;
                WebView webView = this.f51695e;
                this.f51693c = 1;
                if (gVar.c(webView, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "com.google.accompanist.web.WebViewKt$WebView$12$2", f = "WebView.kt", l = {196}, m = "invokeSuspend")
    /* renamed from: h9.f$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f51696c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7947h f51697d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WebView f51698e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh9/d;", "b", "()Lh9/d;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h9.f$e$a */
        static final class a extends C17544u implements C17631a<C7943d> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C7947h f51699c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C7947h hVar) {
                super(0);
                this.f51699c = hVar;
            }

            /* renamed from: b */
            public final C7943d invoke() {
                return this.f51699c.a();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh9/d;", "content", "LXH/N;", "c", "(Lh9/d;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h9.f$e$b */
        static final class b<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WebView f51700a;

            b(WebView webView) {
                this.f51700a = webView;
            }

            /* renamed from: c */
            public final Object emit(C7943d dVar, C17164e<? super C16807N> eVar) {
                if (dVar instanceof C7943d.C0851d) {
                    C7943d.C0851d dVar2 = (C7943d.C0851d) dVar;
                    this.f51700a.loadUrl(dVar2.b(), dVar2.a());
                } else if (dVar instanceof C7943d.a) {
                    C7943d.a aVar = (C7943d.a) dVar;
                    this.f51700a.loadDataWithBaseURL(aVar.a(), aVar.b(), aVar.e(), aVar.c(), aVar.d());
                } else if (dVar instanceof C7943d.c) {
                    C7943d.c cVar = (C7943d.c) dVar;
                    this.f51700a.postUrl(cVar.b(), cVar.a());
                } else {
                    boolean z10 = dVar instanceof C7943d.b;
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C7947h hVar, WebView webView, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f51697d = hVar;
            this.f51698e = webView;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f51697d, this.f51698e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f51696c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new a(this.f51697d));
                b bVar = new b(this.f51698e);
                this.f51696c = 1;
                if (r10.collect(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Landroid/webkit/WebView;", "a", "(Landroid/content/Context;)Landroid/webkit/WebView;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h9.f$f  reason: collision with other inner class name */
    static final class C0852f extends C17544u implements C17642l<Context, WebView> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Context, WebView> f51701c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<WebView, C16807N> f51702d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f51703e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C7947h f51704f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C7940a f51705g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C7941b f51706h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0852f(C17642l<? super Context, ? extends WebView> lVar, C17642l<? super WebView, C16807N> lVar2, FrameLayout.LayoutParams layoutParams, C7947h hVar, C7940a aVar, C7941b bVar) {
            super(1);
            this.f51701c = lVar;
            this.f51702d = lVar2;
            this.f51703e = layoutParams;
            this.f51704f = hVar;
            this.f51705g = aVar;
            this.f51706h = bVar;
        }

        /* renamed from: a */
        public final WebView invoke(Context context) {
            WebView webView;
            C17542s.j(context, "context");
            C17642l<Context, WebView> lVar = this.f51701c;
            if (lVar == null || (webView = lVar.invoke(context)) == null) {
                webView = new WebView(context);
            }
            C17642l<WebView, C16807N> lVar2 = this.f51702d;
            FrameLayout.LayoutParams layoutParams = this.f51703e;
            C7947h hVar = this.f51704f;
            C7940a aVar = this.f51705g;
            C7941b bVar = this.f51706h;
            lVar2.invoke(webView);
            webView.setLayoutParams(layoutParams);
            Bundle f10 = hVar.f();
            if (f10 != null) {
                webView.restoreState(f10);
            }
            webView.setWebChromeClient(aVar);
            webView.setWebViewClient(bVar);
            this.f51704f.o(webView);
            return webView;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/webkit/WebView;", "it", "LXH/N;", "a", "(Landroid/webkit/WebView;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h9.f$g */
    static final class g extends C17544u implements C17642l<WebView, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<WebView, C16807N> f51707c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C17642l<? super WebView, C16807N> lVar) {
            super(1);
            this.f51707c = lVar;
        }

        public final void a(WebView webView) {
            C17542s.j(webView, "it");
            this.f51707c.invoke(webView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.f$h */
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7947h f51708c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f51709d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f51710e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f51711f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C7946g f51712g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<WebView, C16807N> f51713h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<WebView, C16807N> f51714i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C7941b f51715j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C7940a f51716k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17642l<Context, WebView> f51717l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f51718m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f51719n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C7947h hVar, FrameLayout.LayoutParams layoutParams, androidx.compose.ui.d dVar, boolean z10, C7946g gVar, C17642l<? super WebView, C16807N> lVar, C17642l<? super WebView, C16807N> lVar2, C7941b bVar, C7940a aVar, C17642l<? super Context, ? extends WebView> lVar3, int i10, int i11) {
            super(2);
            this.f51708c = hVar;
            this.f51709d = layoutParams;
            this.f51710e = dVar;
            this.f51711f = z10;
            this.f51712g = gVar;
            this.f51713h = lVar;
            this.f51714i = lVar2;
            this.f51715j = bVar;
            this.f51716k = aVar;
            this.f51717l = lVar3;
            this.f51718m = i10;
            this.f51719n = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C7945f.a(this.f51708c, this.f51709d, this.f51710e, this.f51711f, this.f51712g, this.f51713h, this.f51714i, this.f51715j, this.f51716k, this.f51717l, mVar, M0.a(this.f51718m | 1), this.f51719n);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.f$i */
    static final class i extends C17544u implements C17642l<WebView, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f51720c = new i();

        i() {
            super(1);
        }

        public final void a(WebView webView) {
            C17542s.j(webView, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.f$j */
    static final class j extends C17544u implements C17642l<WebView, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f51721c = new j();

        j() {
            super(1);
        }

        public final void a(WebView webView) {
            C17542s.j(webView, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/e;", "LXH/N;", "a", "(Ls0/e;LU0/m;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h9.f$k */
    static final class k extends C17544u implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7947h f51722c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f51723d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C7946g f51724e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<WebView, C16807N> f51725f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<WebView, C16807N> f51726g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C7941b f51727h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C7940a f51728i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<Context, WebView> f51729j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C7947h hVar, boolean z10, C7946g gVar, C17642l<? super WebView, C16807N> lVar, C17642l<? super WebView, C16807N> lVar2, C7941b bVar, C7940a aVar, C17642l<? super Context, ? extends WebView> lVar3) {
            super(3);
            this.f51722c = hVar;
            this.f51723d = z10;
            this.f51724e = gVar;
            this.f51725f = lVar;
            this.f51726g = lVar2;
            this.f51727h = bVar;
            this.f51728i = aVar;
            this.f51729j = lVar3;
        }

        public final void a(C5859e eVar, C4889m mVar, int i10) {
            int i11;
            C5859e eVar2 = eVar;
            C17542s.j(eVar2, "$this$BoxWithConstraints");
            if ((i10 & 14) == 0) {
                i11 = i10 | (mVar.V(eVar2) ? 4 : 2);
            } else {
                C4889m mVar2 = mVar;
                i11 = i10;
            }
            if ((i11 & 91) != 18 || !mVar.l()) {
                int i12 = -1;
                if (C4895p.J()) {
                    C4895p.S(-1606035789, i11, -1, "com.google.accompanist.web.WebView.<anonymous> (WebView.kt:105)");
                }
                int i13 = C5267b.j(eVar.b()) ? -1 : -2;
                if (!C5267b.i(eVar.b())) {
                    i12 = -2;
                }
                C7945f.a(this.f51722c, new FrameLayout.LayoutParams(i13, i12), androidx.compose.ui.d.f18749a, this.f51723d, this.f51724e, this.f51725f, this.f51726g, this.f51727h, this.f51728i, this.f51729j, mVar, 150995392, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.f$l */
    static final class l extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C7947h f51730c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f51731d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f51732e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C7946g f51733f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<WebView, C16807N> f51734g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<WebView, C16807N> f51735h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C7941b f51736i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C7940a f51737j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<Context, WebView> f51738k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f51739l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f51740m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C7947h hVar, androidx.compose.ui.d dVar, boolean z10, C7946g gVar, C17642l<? super WebView, C16807N> lVar, C17642l<? super WebView, C16807N> lVar2, C7941b bVar, C7940a aVar, C17642l<? super Context, ? extends WebView> lVar3, int i10, int i11) {
            super(2);
            this.f51730c = hVar;
            this.f51731d = dVar;
            this.f51732e = z10;
            this.f51733f = gVar;
            this.f51734g = lVar;
            this.f51735h = lVar2;
            this.f51736i = bVar;
            this.f51737j = aVar;
            this.f51738k = lVar3;
            this.f51739l = i10;
            this.f51740m = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C7945f.b(this.f51730c, this.f51731d, this.f51732e, this.f51733f, this.f51734g, this.f51735h, this.f51736i, this.f51737j, this.f51738k, mVar, M0.a(this.f51739l | 1), this.f51740m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.f$m */
    static final class m extends C17544u implements C17642l<WebView, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f51741c = new m();

        m() {
            super(1);
        }

        public final void a(WebView webView) {
            C17542s.j(webView, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.f$n */
    static final class n extends C17544u implements C17642l<WebView, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final n f51742c = new n();

        n() {
            super(1);
        }

        public final void a(WebView webView) {
            C17542s.j(webView, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: h9.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @XH.C16814e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(h9.C7947h r18, android.widget.FrameLayout.LayoutParams r19, androidx.compose.ui.d r20, boolean r21, h9.C7946g r22, nI.C17642l<? super android.webkit.WebView, XH.C16807N> r23, nI.C17642l<? super android.webkit.WebView, XH.C16807N> r24, h9.C7941b r25, h9.C7940a r26, nI.C17642l<? super android.content.Context, ? extends android.webkit.WebView> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r18
            r12 = r30
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "layoutParams"
            r2 = r19
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = -1401343589(0xffffffffac79319b, float:-3.5412565E-12)
            r3 = r28
            U0.m r3 = r3.k(r0)
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0020
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x0022
        L_0x0020:
            r4 = r20
        L_0x0022:
            r5 = r12 & 8
            r6 = 1
            if (r5 == 0) goto L_0x0029
            r5 = r6
            goto L_0x002b
        L_0x0029:
            r5 = r21
        L_0x002b:
            r7 = r12 & 16
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x003b
            h9.g r7 = c(r8, r3, r9, r6)
            r10 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = r29 & r10
            goto L_0x003f
        L_0x003b:
            r7 = r22
            r10 = r29
        L_0x003f:
            r11 = r12 & 32
            if (r11 == 0) goto L_0x0046
            h9.f$m r11 = h9.C7945f.m.f51741c
            goto L_0x0048
        L_0x0046:
            r11 = r23
        L_0x0048:
            r13 = r12 & 64
            if (r13 == 0) goto L_0x004f
            h9.f$n r13 = h9.C7945f.n.f51742c
            goto L_0x0051
        L_0x004f:
            r13 = r24
        L_0x0051:
            r14 = r12 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x0079
            r14 = 1370705963(0x51b3502b, float:9.6268018E10)
            r3.C(r14)
            java.lang.Object r14 = r3.D()
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r15 = r15.a()
            if (r14 != r15) goto L_0x006f
            h9.b r14 = new h9.b
            r14.<init>()
            r3.u(r14)
        L_0x006f:
            h9.b r14 = (h9.C7941b) r14
            r3.U()
            r15 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r10 = r10 & r15
            goto L_0x007b
        L_0x0079:
            r14 = r25
        L_0x007b:
            r15 = r12 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x00a9
            r15 = 1370706051(0x51b35083, float:9.6268739E10)
            r3.C(r15)
            java.lang.Object r15 = r3.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r6 = r16.a()
            if (r15 != r6) goto L_0x0099
            h9.a r15 = new h9.a
            r15.<init>()
            r3.u(r15)
        L_0x0099:
            r6 = r15
            h9.a r6 = (h9.C7940a) r6
            r3.U()
            r15 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r10 = r10 & r15
            r17 = r10
            r10 = r6
            r6 = r17
            goto L_0x00ac
        L_0x00a9:
            r6 = r10
            r10 = r26
        L_0x00ac:
            r15 = r12 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x00b2
            r15 = r8
            goto L_0x00b4
        L_0x00b2:
            r15 = r27
        L_0x00b4:
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x00c0
            r8 = -1
            java.lang.String r9 = "com.google.accompanist.web.WebView (WebView.kt:180)"
            U0.C4895p.S(r0, r6, r8, r9)
        L_0x00c0:
            android.webkit.WebView r0 = r18.g()
            if (r5 == 0) goto L_0x00ce
            boolean r8 = r7.b()
            if (r8 == 0) goto L_0x00ce
            r8 = 1
            goto L_0x00cf
        L_0x00ce:
            r8 = 0
        L_0x00cf:
            h9.f$c r9 = new h9.f$c
            r9.<init>(r0)
            r2 = 0
            e.C5281d.a(r8, r9, r3, r2, r2)
            r8 = 1370706283(0x51b3516b, float:9.6270639E10)
            r3.C(r8)
            if (r0 != 0) goto L_0x00e1
            goto L_0x0100
        L_0x00e1:
            h9.f$d r8 = new h9.f$d
            r9 = 0
            r8.<init>(r7, r0, r9)
            int r16 = r6 >> 9
            r2 = r16 & 112(0x70, float:1.57E-43)
            r2 = r2 | 520(0x208, float:7.29E-43)
            U0.P.f(r0, r7, r8, r3, r2)
            h9.f$e r2 = new h9.f$e
            r2.<init>(r1, r0, r9)
            int r8 = r6 << 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r8 = r8 | 520(0x208, float:7.29E-43)
            U0.P.f(r0, r1, r2, r3, r8)
            XH.N r0 = XH.C16807N.f139792a
        L_0x0100:
            r3.U()
            r14.d(r1)
            r14.c(r7)
            r10.b(r1)
            h9.f$f r0 = new h9.f$f
            r20 = r0
            r21 = r15
            r22 = r11
            r23 = r19
            r24 = r18
            r25 = r10
            r26 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r2 = 1370708191(0x51b358df, float:9.6286269E10)
            r3.C(r2)
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r29 & r2
            r8 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 ^ r8
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r2 <= r9) goto L_0x0136
            boolean r2 = r3.F(r13)
            if (r2 != 0) goto L_0x013a
        L_0x0136:
            r2 = r29 & r8
            if (r2 != r9) goto L_0x013c
        L_0x013a:
            r2 = 1
            goto L_0x013d
        L_0x013c:
            r2 = 0
        L_0x013d:
            java.lang.Object r8 = r3.D()
            if (r2 != 0) goto L_0x014b
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x0153
        L_0x014b:
            h9.f$g r8 = new h9.f$g
            r8.<init>(r13)
            r3.u(r8)
        L_0x0153:
            r2 = r8
            nI.l r2 = (nI.C17642l) r2
            r3.U()
            int r6 = r6 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r8 = 20
            r9 = 0
            r16 = 0
            r20 = r0
            r21 = r4
            r22 = r9
            r23 = r2
            r24 = r16
            r25 = r3
            r26 = r6
            r27 = r8
            androidx.compose.ui.viewinterop.e.b(r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x017e
            U0.C4895p.R()
        L_0x017e:
            U0.Y0 r9 = r3.n()
            if (r9 == 0) goto L_0x019f
            h9.f$h r8 = new h9.f$h
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r4
            r4 = r5
            r5 = r7
            r6 = r11
            r7 = r13
            r13 = r8
            r8 = r14
            r14 = r9
            r9 = r10
            r10 = r15
            r11 = r29
            r12 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.a(r13)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.C7945f.a(h9.h, android.widget.FrameLayout$LayoutParams, androidx.compose.ui.d, boolean, h9.g, nI.l, nI.l, h9.b, h9.a, nI.l, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010e  */
    @XH.C16814e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(h9.C7947h r19, androidx.compose.ui.d r20, boolean r21, h9.C7946g r22, nI.C17642l<? super android.webkit.WebView, XH.C16807N> r23, nI.C17642l<? super android.webkit.WebView, XH.C16807N> r24, h9.C7941b r25, h9.C7940a r26, nI.C17642l<? super android.content.Context, ? extends android.webkit.WebView> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r19
            r10 = r29
            r11 = r30
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            r0 = 1473276617(0x57d06ac9, float:4.58314115E14)
            r2 = r28
            U0.m r2 = r2.k(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.V(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r20
            goto L_0x0046
        L_0x0034:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0031
            r5 = r20
            boolean r6 = r2.V(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r21
            goto L_0x0061
        L_0x004f:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x004c
            r7 = r21
            boolean r8 = r2.b(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007a
            r8 = r11 & 8
            if (r8 != 0) goto L_0x0074
            r8 = r22
            boolean r9 = r2.V(r8)
            if (r9 == 0) goto L_0x0076
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0074:
            r8 = r22
        L_0x0076:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r9
            goto L_0x007c
        L_0x007a:
            r8 = r22
        L_0x007c:
            r9 = r11 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r23
            goto L_0x0099
        L_0x0085:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x0082
            r12 = r23
            boolean r13 = r2.F(r12)
            if (r13 == 0) goto L_0x0096
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r13
        L_0x0099:
            r13 = r11 & 32
            if (r13 == 0) goto L_0x00a3
            r14 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r14
        L_0x00a0:
            r14 = r24
            goto L_0x00b6
        L_0x00a3:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00a0
            r14 = r24
            boolean r15 = r2.F(r14)
            if (r15 == 0) goto L_0x00b3
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r15
        L_0x00b6:
            r15 = r11 & 64
            if (r15 == 0) goto L_0x00be
            r16 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r16
        L_0x00be:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00c6
            r17 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 | r17
        L_0x00c6:
            r1 = r11 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x00d1
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r17
            r5 = r27
            goto L_0x00e6
        L_0x00d1:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r10 & r17
            r5 = r27
            if (r17 != 0) goto L_0x00e6
            boolean r17 = r2.F(r5)
            if (r17 == 0) goto L_0x00e2
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00e4
        L_0x00e2:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00e4:
            r3 = r3 | r17
        L_0x00e6:
            r5 = r11 & 192(0xc0, float:2.69E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r5 != r7) goto L_0x010e
            r5 = 191739611(0xb6db6db, float:4.5782105E-32)
            r5 = r5 & r3
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 != r7) goto L_0x010e
            boolean r5 = r2.l()
            if (r5 != 0) goto L_0x00fc
            goto L_0x010e
        L_0x00fc:
            r2.L()
            r4 = r20
            r3 = r21
            r7 = r25
            r6 = r8
            r5 = r12
            r9 = r14
            r8 = r26
            r12 = r27
            goto L_0x0218
        L_0x010e:
            r2.G()
            r5 = r10 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r5 == 0) goto L_0x0141
            boolean r5 = r2.O()
            if (r5 == 0) goto L_0x011f
            goto L_0x0141
        L_0x011f:
            r2.L()
            r1 = r11 & 8
            if (r1 == 0) goto L_0x0128
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0128:
            if (r15 == 0) goto L_0x012c
            r3 = r3 & r17
        L_0x012c:
            if (r0 == 0) goto L_0x0132
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x0132:
            r4 = r20
            r5 = r21
            r0 = r26
            r7 = r27
            r6 = r8
            r8 = r12
            r9 = r14
            r12 = r25
            goto L_0x01bc
        L_0x0141:
            if (r4 == 0) goto L_0x0146
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x0148
        L_0x0146:
            r4 = r20
        L_0x0148:
            if (r6 == 0) goto L_0x014c
            r5 = 1
            goto L_0x014e
        L_0x014c:
            r5 = r21
        L_0x014e:
            r6 = r11 & 8
            r7 = 0
            if (r6 == 0) goto L_0x015c
            r6 = 0
            r8 = 1
            h9.g r6 = c(r7, r2, r6, r8)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x015d
        L_0x015c:
            r6 = r8
        L_0x015d:
            if (r9 == 0) goto L_0x0162
            h9.f$i r8 = h9.C7945f.i.f51720c
            goto L_0x0163
        L_0x0162:
            r8 = r12
        L_0x0163:
            if (r13 == 0) goto L_0x0168
            h9.f$j r9 = h9.C7945f.j.f51721c
            goto L_0x0169
        L_0x0168:
            r9 = r14
        L_0x0169:
            if (r15 == 0) goto L_0x018d
            r12 = 1370702801(0x51b343d1, float:9.6242115E10)
            r2.C(r12)
            java.lang.Object r12 = r2.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r12 != r13) goto L_0x0185
            h9.b r12 = new h9.b
            r12.<init>()
            r2.u(r12)
        L_0x0185:
            h9.b r12 = (h9.C7941b) r12
            r2.U()
            r3 = r3 & r17
            goto L_0x018f
        L_0x018d:
            r12 = r25
        L_0x018f:
            if (r0 == 0) goto L_0x01b5
            r0 = 1370702889(0x51b34429, float:9.6242835E10)
            r2.C(r0)
            java.lang.Object r0 = r2.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x01ab
            h9.a r0 = new h9.a
            r0.<init>()
            r2.u(r0)
        L_0x01ab:
            h9.a r0 = (h9.C7940a) r0
            r2.U()
            r13 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r13
            goto L_0x01b7
        L_0x01b5:
            r0 = r26
        L_0x01b7:
            if (r1 == 0) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r7 = r27
        L_0x01bc:
            r2.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01ce
            r1 = -1
            java.lang.String r13 = "com.google.accompanist.web.WebView (WebView.kt:100)"
            r14 = 1473276617(0x57d06ac9, float:4.58314115E14)
            U0.C4895p.S(r14, r3, r1, r13)
        L_0x01ce:
            h9.f$k r1 = new h9.f$k
            r20 = r1
            r21 = r19
            r22 = r5
            r23 = r6
            r24 = r8
            r25 = r9
            r26 = r12
            r27 = r0
            r28 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r13 = -1606035789(0xffffffffa045d6b3, float:-1.6757587E-19)
            r14 = 1
            c1.a r1 = c1.c.b(r2, r13, r14, r1)
            int r3 = r3 >> 3
            r3 = r3 & 14
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r13 = 6
            r14 = 0
            r15 = 0
            r20 = r4
            r21 = r14
            r22 = r15
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r13
            s0.C5858d.a(r20, r21, r22, r23, r24, r25, r26)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0210
            U0.C4895p.R()
        L_0x0210:
            r3 = r5
            r5 = r8
            r8 = r0
            r18 = r12
            r12 = r7
            r7 = r18
        L_0x0218:
            U0.Y0 r13 = r2.n()
            if (r13 == 0) goto L_0x0231
            h9.f$l r14 = new h9.f$l
            r0 = r14
            r1 = r19
            r2 = r4
            r4 = r6
            r6 = r9
            r9 = r12
            r10 = r29
            r11 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.a(r14)
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.C7945f.b(h9.h, androidx.compose.ui.d, boolean, h9.g, nI.l, nI.l, h9.b, h9.a, nI.l, U0.m, int, int):void");
    }

    @C16814e
    public static final C7946g c(Q q10, C4889m mVar, int i10, int i11) {
        mVar.C(1602323198);
        if ((i11 & 1) != 0) {
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                B b10 = new B(P.k(C17169j.f142968a, mVar));
                mVar.u(b10);
                D10 = b10;
            }
            q10 = ((B) D10).a();
        }
        if (C4895p.J()) {
            C4895p.S(1602323198, i10, -1, "com.google.accompanist.web.rememberWebViewNavigator (WebView.kt:691)");
        }
        mVar.C(948350619);
        boolean V10 = mVar.V(q10);
        Object D11 = mVar.D();
        if (V10 || D11 == C4889m.f14007a.a()) {
            D11 = new C7946g(q10);
            mVar.u(D11);
        }
        C7946g gVar = (C7946g) D11;
        mVar.U();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return gVar;
    }

    @C16814e
    public static final C7947h d(String str, Map<String, String> map, C4889m mVar, int i10, int i11) {
        C17542s.j(str, "url");
        mVar.C(1238013775);
        if ((i11 & 2) != 0) {
            map = X.j();
        }
        if (C4895p.J()) {
            C4895p.S(1238013775, i10, -1, "com.google.accompanist.web.rememberWebViewState (WebView.kt:736)");
        }
        mVar.C(400020825);
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = new C7947h(new C7943d.C0851d(str, map));
            mVar.u(D10);
        }
        C7947h hVar = (C7947h) D10;
        mVar.U();
        hVar.i(new C7943d.C0851d(str, map));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return hVar;
    }
}
