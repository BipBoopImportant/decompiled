package com.auth0.android.provider;

import HJ.C15854t;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.C16320n;
import QJ.C16324p;
import QJ.Q;
import XH.C16807N;
import XH.x;
import XH.y;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.auth0.android.result.Credentials;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import s7.C8742a;
import t7.C8837b;
import u7.C8884a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R.\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178A@BX\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/auth0/android/provider/p;", "", "<init>", "()V", "Ls7/a;", "account", "Lcom/auth0/android/provider/p$a;", "c", "(Ls7/a;)Lcom/auth0/android/provider/p$a;", "Landroid/content/Intent;", "intent", "", "e", "(Landroid/content/Intent;)Z", "LXH/N;", "d", "Lt7/b;", "exception", "b", "(Lt7/b;)V", "", "Ljava/lang/String;", "TAG", "Lcom/auth0/android/provider/n;", "<set-?>", "Lcom/auth0/android/provider/n;", "getManagerInstance$auth0_release", "()Lcom/auth0/android/provider/n;", "getManagerInstance$auth0_release$annotations", "managerInstance", "a", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f46388a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final String f46389b = P.b(p.class).f();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static n f46390c;

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 <2\u00020\u0001:\u0001\u001fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ#\u0010\u0010\u001a\u00020\u00002\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H@ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010-R\u0016\u00103\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcom/auth0/android/provider/p$a;", "", "Ls7/a;", "account", "<init>", "(Ls7/a;)V", "", "audience", "d", "(Ljava/lang/String;)Lcom/auth0/android/provider/p$a;", "redirectUri", "g", "scope", "h", "", "parameters", "f", "(Ljava/util/Map;)Lcom/auth0/android/provider/p$a;", "Lcom/auth0/android/provider/i;", "options", "e", "(Lcom/auth0/android/provider/i;)Lcom/auth0/android/provider/p$a;", "Landroid/content/Context;", "context", "Lu7/a;", "Lcom/auth0/android/result/Credentials;", "Lt7/b;", "callback", "LXH/N;", "c", "(Landroid/content/Context;Lu7/a;)V", "a", "(Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "LdI/i;", "coroutineContext", "b", "(Landroid/content/Context;LdI/i;LdI/e;)Ljava/lang/Object;", "Ls7/a;", "", "Ljava/util/Map;", "values", "headers", "Lcom/auth0/android/provider/m;", "Lcom/auth0/android/provider/m;", "pkce", "Ljava/lang/String;", "issuer", "scheme", "invitationUrl", "i", "Lcom/auth0/android/provider/i;", "ctOptions", "", "j", "Ljava/lang/Integer;", "leeway", "", "k", "Z", "launchAsTwa", "l", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: l  reason: collision with root package name */
        private static final C0807a f46391l = new C0807a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final C8742a f46392a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f46393b = new LinkedHashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, String> f46394c = new LinkedHashMap();

        /* renamed from: d  reason: collision with root package name */
        private m f46395d;

        /* renamed from: e  reason: collision with root package name */
        private String f46396e;

        /* renamed from: f  reason: collision with root package name */
        private String f46397f = Constants.SCHEME;

        /* renamed from: g  reason: collision with root package name */
        private String f46398g;

        /* renamed from: h  reason: collision with root package name */
        private String f46399h;

        /* renamed from: i  reason: collision with root package name */
        private i f46400i;

        /* renamed from: j  reason: collision with root package name */
        private Integer f46401j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f46402k;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/auth0/android/provider/p$a$a;", "", "<init>", "()V", "", "KEY_AUDIENCE", "Ljava/lang/String;", "KEY_CONNECTION_SCOPE", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.auth0.android.provider.p$a$a  reason: collision with other inner class name */
        private static final class C0807a {
            public /* synthetic */ C0807a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0807a() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/auth0/android/result/Credentials;", "<anonymous>", "(LQJ/Q;)Lcom/auth0/android/result/Credentials;"}, k = 3, mv = {1, 8, 0})
        @f(c = "com.auth0.android.provider.WebAuthProvider$Builder$await$3", f = "WebAuthProvider.kt", l = {560}, m = "invokeSuspend")
        static final class b extends l implements nI.p<Q, C17164e<? super Credentials>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f46403c;

            /* renamed from: d  reason: collision with root package name */
            Object f46404d;

            /* renamed from: e  reason: collision with root package name */
            int f46405e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f46406f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Context f46407g;

            @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/auth0/android/provider/p$a$b$a", "Lu7/a;", "Lcom/auth0/android/result/Credentials;", "Lt7/b;", "result", "LXH/N;", "d", "(Lcom/auth0/android/result/Credentials;)V", "error", "c", "(Lt7/b;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.auth0.android.provider.p$a$b$a  reason: collision with other inner class name */
            public static final class C0808a implements C8884a<Credentials, C8837b> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16320n<Credentials> f46408a;

                C0808a(C16320n<? super Credentials> nVar) {
                    this.f46408a = nVar;
                }

                /* renamed from: c */
                public void b(C8837b bVar) {
                    C17542s.j(bVar, UiComponentContainer.RESULT_ERROR);
                    C16320n<Credentials> nVar = this.f46408a;
                    x.a aVar = x.f139812b;
                    nVar.resumeWith(x.b(y.a(bVar)));
                }

                /* renamed from: d */
                public void a(Credentials credentials) {
                    C17542s.j(credentials, "result");
                    this.f46408a.resumeWith(x.b(credentials));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, Context context, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f46406f = aVar;
                this.f46407g = context;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f46406f, this.f46407g, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super Credentials> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f46405e;
                if (i10 == 0) {
                    y.b(obj);
                    a aVar = this.f46406f;
                    Context context = this.f46407g;
                    this.f46403c = aVar;
                    this.f46404d = context;
                    this.f46405e = 1;
                    C16324p pVar = new C16324p(C17187b.c(this), 1);
                    pVar.C();
                    aVar.c(context, new C0808a(pVar));
                    obj = pVar.w();
                    if (obj == C17187b.f()) {
                        h.c(this);
                    }
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    Context context2 = (Context) this.f46404d;
                    a aVar2 = (a) this.f46403c;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        public a(C8742a aVar) {
            C17542s.j(aVar, "account");
            this.f46392a = aVar;
            i a10 = i.c().a();
            C17542s.i(a10, "newBuilder().build()");
            this.f46400i = a10;
        }

        public final /* synthetic */ Object a(Context context, C17164e eVar) {
            return b(context, C16311i0.c().P0(), eVar);
        }

        public final Object b(Context context, C17168i iVar, C17164e<? super Credentials> eVar) {
            return C16310i.g(iVar, new b(this, context, (C17164e<? super b>) null), eVar);
        }

        public final void c(Context context, C8884a<Credentials, C8837b> aVar) {
            C17542s.j(context, "context");
            C17542s.j(aVar, "callback");
            p.d();
            if (!this.f46400i.b(context.getPackageManager())) {
                aVar.b(new C8837b("a0.browser_not_available", "No compatible Browser application is installed."));
                return;
            }
            String str = this.f46399h;
            if (str != null) {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("organization");
                String queryParameter2 = parse.getQueryParameter("invitation");
                if (queryParameter == null || C15854t.v0(queryParameter) || queryParameter2 == null || C15854t.v0(queryParameter2)) {
                    aVar.b(new C8837b("a0.invalid_invitation_url", "The invitation URL provided doesn't contain the 'organization' or 'invitation' values."));
                    return;
                } else {
                    this.f46393b.put("organization", queryParameter);
                    this.f46393b.put("invitation", queryParameter2);
                }
            }
            l lVar = new l(this.f46392a, aVar, this.f46393b, this.f46400i, this.f46402k);
            lVar.r(this.f46394c);
            lVar.u(this.f46395d);
            lVar.t(this.f46401j);
            lVar.s(this.f46396e);
            p.f46390c = lVar;
            if (this.f46398g == null) {
                this.f46398g = e.b(this.f46397f, context.getApplicationContext().getPackageName(), this.f46392a.e());
            }
            String str2 = this.f46398g;
            C17542s.g(str2);
            lVar.v(context, str2, 110);
        }

        public final a d(String str) {
            C17542s.j(str, "audience");
            this.f46393b.put("audience", str);
            return this;
        }

        public final a e(i iVar) {
            C17542s.j(iVar, "options");
            this.f46400i = iVar;
            return this;
        }

        public final a f(Map<String, ? extends Object> map) {
            C17542s.j(map, "parameters");
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value != null) {
                    this.f46393b.put(str, value.toString());
                }
            }
            return this;
        }

        public final a g(String str) {
            C17542s.j(str, "redirectUri");
            this.f46398g = str;
            return this;
        }

        public final a h(String str) {
            C17542s.j(str, "scope");
            this.f46393b.put("scope", str);
            return this;
        }
    }

    private p() {
    }

    public static final a c(C8742a aVar) {
        C17542s.j(aVar, "account");
        return new a(aVar);
    }

    public static final void d() {
        f46390c = null;
    }

    public static final boolean e(Intent intent) {
        if (f46390c == null) {
            Log.w(f46389b, "There is no previous instance of this provider.");
            return false;
        }
        c cVar = new c(intent);
        n nVar = f46390c;
        C17542s.g(nVar);
        boolean b10 = nVar.b(cVar);
        if (b10) {
            d();
        }
        return b10;
    }

    public final void b(C8837b bVar) {
        C17542s.j(bVar, "exception");
        n nVar = f46390c;
        C17542s.g(nVar);
        nVar.a(bVar);
    }
}
