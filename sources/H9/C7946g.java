package h9;

import QJ.Q;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16533h;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.C16814e;
import XH.C16820k;
import XH.y;
import android.webkit.WebView;
import dI.C17164e;
import eI.C17187b;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0006H@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@@X\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@@X\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Lh9/g;", "", "LQJ/Q;", "coroutineScope", "<init>", "(LQJ/Q;)V", "Landroid/webkit/WebView;", "", "c", "(Landroid/webkit/WebView;LdI/e;)Ljava/lang/Object;", "a", "LQJ/Q;", "LTJ/A;", "Lh9/g$a;", "b", "LTJ/A;", "navigationEvents", "", "<set-?>", "LU0/r0;", "()Z", "d", "(Z)V", "canGoBack", "getCanGoForward", "e", "canGoForward", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
/* renamed from: h9.g  reason: case insensitive filesystem */
public final class C7946g {

    /* renamed from: a  reason: collision with root package name */
    private final Q f51743a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C16504A<a> f51744b = C16511H.b(1, 0, (C16428d) null, 6, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f51745c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f51746d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lh9/g$a;", "", "a", "b", "c", "Lh9/g$a$a;", "Lh9/g$a$b;", "Lh9/g$a$c;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h9.g$a */
    private interface a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0004R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0004R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0018"}, d2 = {"Lh9/g$a$a;", "Lh9/g$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "html", "b", "baseUrl", "c", "e", "mimeType", "encoding", "historyUrl", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: h9.g$a$a  reason: collision with other inner class name */
        public static final class C0853a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f51747a;

            /* renamed from: b  reason: collision with root package name */
            private final String f51748b;

            /* renamed from: c  reason: collision with root package name */
            private final String f51749c;

            /* renamed from: d  reason: collision with root package name */
            private final String f51750d;

            /* renamed from: e  reason: collision with root package name */
            private final String f51751e;

            public final String a() {
                return this.f51748b;
            }

            public final String b() {
                return this.f51750d;
            }

            public final String c() {
                return this.f51751e;
            }

            public final String d() {
                return this.f51747a;
            }

            public final String e() {
                return this.f51749c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0853a)) {
                    return false;
                }
                C0853a aVar = (C0853a) obj;
                return C17542s.e(this.f51747a, aVar.f51747a) && C17542s.e(this.f51748b, aVar.f51748b) && C17542s.e(this.f51749c, aVar.f51749c) && C17542s.e(this.f51750d, aVar.f51750d) && C17542s.e(this.f51751e, aVar.f51751e);
            }

            public int hashCode() {
                int hashCode = this.f51747a.hashCode() * 31;
                String str = this.f51748b;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f51749c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f51750d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f51751e;
                if (str4 != null) {
                    i10 = str4.hashCode();
                }
                return hashCode4 + i10;
            }

            public String toString() {
                return "LoadHtml(html=" + this.f51747a + ", baseUrl=" + this.f51748b + ", mimeType=" + this.f51749c + ", encoding=" + this.f51750d + ", historyUrl=" + this.f51751e + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lh9/g$a$b;", "Lh9/g$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "url", "", "Ljava/util/Map;", "()Ljava/util/Map;", "additionalHttpHeaders", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: h9.g$a$b */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f51752a;

            /* renamed from: b  reason: collision with root package name */
            private final Map<String, String> f51753b;

            public final Map<String, String> a() {
                return this.f51753b;
            }

            public final String b() {
                return this.f51752a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f51752a, bVar.f51752a) && C17542s.e(this.f51753b, bVar.f51753b);
            }

            public int hashCode() {
                return (this.f51752a.hashCode() * 31) + this.f51753b.hashCode();
            }

            public String toString() {
                return "LoadUrl(url=" + this.f51752a + ", additionalHttpHeaders=" + this.f51753b + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lh9/g$a$c;", "Lh9/g$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "url", "", "[B", "()[B", "postData", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: h9.g$a$c */
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f51754a;

            /* renamed from: b  reason: collision with root package name */
            private final byte[] f51755b;

            public final byte[] a() {
                return this.f51755b;
            }

            public final String b() {
                return this.f51754a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!C17542s.e(c.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                C17542s.h(obj, "null cannot be cast to non-null type com.google.accompanist.web.WebViewNavigator.NavigationEvent.PostUrl");
                c cVar = (c) obj;
                return C17542s.e(this.f51754a, cVar.f51754a) && Arrays.equals(this.f51755b, cVar.f51755b);
            }

            public int hashCode() {
                return (this.f51754a.hashCode() * 31) + Arrays.hashCode(this.f51755b);
            }

            public String toString() {
                return "PostUrl(url=" + this.f51754a + ", postData=" + Arrays.toString(this.f51755b) + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "com.google.accompanist.web.WebViewNavigator", f = "WebView.kt", l = {566}, m = "handleNavigationEvents$web_release")
    /* renamed from: h9.g$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f51756c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7946g f51757d;

        /* renamed from: e  reason: collision with root package name */
        int f51758e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C7946g gVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f51757d = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f51756c = obj;
            this.f51758e |= Integer.MIN_VALUE;
            return this.f51757d.c((WebView) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    @f(c = "com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$2", f = "WebView.kt", l = {567}, m = "invokeSuspend")
    /* renamed from: h9.g$c */
    static final class c extends l implements p<Q, C17164e<?>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f51759c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7946g f51760d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ WebView f51761e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh9/g$a;", "event", "LXH/N;", "c", "(Lh9/g$a;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h9.g$c$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WebView f51762a;

            a(WebView webView) {
                this.f51762a = webView;
            }

            /* renamed from: c */
            public final Object emit(a aVar, C17164e<? super C16807N> eVar) {
                if (aVar instanceof a.C0853a) {
                    a.C0853a aVar2 = (a.C0853a) aVar;
                    this.f51762a.loadDataWithBaseURL(aVar2.a(), aVar2.d(), aVar2.e(), aVar2.b(), aVar2.c());
                } else if (aVar instanceof a.b) {
                    a.b bVar = (a.b) aVar;
                    this.f51762a.loadUrl(bVar.b(), bVar.a());
                } else if (aVar instanceof a.c) {
                    a.c cVar = (a.c) aVar;
                    this.f51762a.postUrl(cVar.b(), cVar.a());
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C7946g gVar, WebView webView, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f51760d = gVar;
            this.f51761e = webView;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f51760d, this.f51761e, eVar);
        }

        public final Object invoke(Q q10, C17164e<?> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f51759c;
            if (i10 == 0) {
                y.b(obj);
                C16504A a10 = this.f51760d.f51744b;
                a aVar = new a(this.f51761e);
                this.f51759c = 1;
                if (a10.collect(aVar, this) == f10) {
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

    public C7946g(Q q10) {
        C17542s.j(q10, "coroutineScope");
        this.f51743a = q10;
        Boolean bool = Boolean.FALSE;
        this.f51745c = u1.e(bool, (o1) null, 2, (Object) null);
        this.f51746d = u1.e(bool, (o1) null, 2, (Object) null);
    }

    public final boolean b() {
        return ((Boolean) this.f51745c.getValue()).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(android.webkit.WebView r6, dI.C17164e<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h9.C7946g.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            h9.g$b r0 = (h9.C7946g.b) r0
            int r1 = r0.f51758e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51758e = r1
            goto L_0x0018
        L_0x0013:
            h9.g$b r0 = new h9.g$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f51756c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f51758e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            XH.y.b(r7)
            goto L_0x0047
        L_0x0031:
            XH.y.b(r7)
            QJ.P0 r7 = QJ.C16311i0.c()
            h9.g$c r2 = new h9.g$c
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f51758e = r3
            java.lang.Object r6 = QJ.C16310i.g(r7, r2, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.C7946g.c(android.webkit.WebView, dI.e):java.lang.Object");
    }

    public final void d(boolean z10) {
        this.f51745c.setValue(Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.f51746d.setValue(Boolean.valueOf(z10));
    }
}
