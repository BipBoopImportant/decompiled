package Ex;

import AK.e;
import Cx.b;
import HJ.C15854t;
import XH.C16796C;
import YH.X;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.openid.appauth.f;
import net.openid.appauth.g;
import net.openid.appauth.h;
import net.openid.appauth.i;
import net.openid.appauth.q;
import net.openid.appauth.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001\u0018B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u001c\u0010'\u001a\n $*\u0004\u0018\u00010\f0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"LEx/c;", "LEx/a;", "Landroid/content/Context;", "context", "LCx/b;", "publisherTokenManager", "LEx/d;", "oAuthConfig", "Lnet/openid/appauth/h;", "authService", "<init>", "(Landroid/content/Context;LCx/b;LEx/d;Lnet/openid/appauth/h;)V", "", "authorizationCode", "LXH/N;", "e", "(Ljava/lang/String;)V", "Lnet/openid/appauth/f;", "d", "()Lnet/openid/appauth/f;", "Landroid/content/Intent;", "data", "b", "(Landroid/content/Intent;)V", "a", "()Landroid/content/Intent;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "LCx/b;", "c", "LEx/d;", "Lnet/openid/appauth/h;", "Lnet/openid/appauth/c;", "Lnet/openid/appauth/c;", "authState", "kotlin.jvm.PlatformType", "f", "Ljava/lang/String;", "randomCodeVerifier", "g", "publishersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f109468g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f109469a;

    /* renamed from: b  reason: collision with root package name */
    private final b f109470b;

    /* renamed from: c  reason: collision with root package name */
    private final d f109471c;

    /* renamed from: d  reason: collision with root package name */
    private final h f109472d;

    /* renamed from: e  reason: collision with root package name */
    private final net.openid.appauth.c f109473e = new net.openid.appauth.c();

    /* renamed from: f  reason: collision with root package name */
    private final String f109474f = e.c();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LEx/c$a;", "", "<init>", "()V", "", "FORCE_LOGIN_PROMPT", "Ljava/lang/String;", "publishersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(Context context, b bVar, d dVar, h hVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "publisherTokenManager");
        C17542s.j(dVar, "oAuthConfig");
        C17542s.j(hVar, "authService");
        this.f109469a = context;
        this.f109470b = bVar;
        this.f109471c = dVar;
        this.f109472d = hVar;
    }

    private final f d() {
        f.b j10 = new f.b(new i(Uri.parse(this.f109471c.a()), Uri.parse(this.f109471c.f())), this.f109471c.b(), "code", Uri.parse(this.f109471c.d())).j(this.f109471c.e());
        String str = this.f109474f;
        f a10 = j10.e(str, e.b(str), e.e()).g("login").a();
        C17542s.i(a10, "build(...)");
        return a10;
    }

    private final void e(String str) {
        if (this.f109473e.a() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Authorization service configuration is missing");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = c.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
            return;
        }
        i a11 = this.f109473e.a();
        C17542s.g(a11);
        q a12 = new q.b(a11, this.f109471c.b()).d(str).h(Uri.parse(this.f109471c.d())).f(this.f109474f).c(X.f(C16796C.a("client_secret", this.f109471c.c()))).a();
        C17542s.i(a12, "build(...)");
        this.f109472d.f(a12, new b(this));
    }

    /* access modifiers changed from: private */
    public static final void f(c cVar, r rVar, net.openid.appauth.d dVar) {
        if (rVar != null) {
            cVar.f109470b.e(rVar.f145183c);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Error fetching publisher token: " + (dVar != null ? dVar.f144988d : null));
        qv.e eVar = qv.e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = cVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalStateException, str3);
            str = str3;
            str2 = str4;
        }
    }

    public Intent a() {
        Intent c10 = this.f109472d.c(d());
        C17542s.i(c10, "getAuthorizationRequestIntent(...)");
        return c10;
    }

    public void b(Intent intent) {
        C17542s.j(intent, "data");
        g f10 = g.f(intent);
        net.openid.appauth.d g10 = net.openid.appauth.d.g(intent);
        if (f10 != null) {
            this.f109473e.b(f10, (net.openid.appauth.d) null);
            String str = f10.f145061d;
            if (str != null) {
                e(str);
                return;
            }
            throw new IllegalStateException("Authorization code is missing");
        }
        IllegalStateException illegalStateException = new IllegalStateException("publisher authorization failed: " + (g10 != null ? g10.f144988d : null));
        qv.e eVar = qv.e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 != null) {
                    str2 = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str4 = str2;
            if (str3 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalStateException, str4);
            str2 = str4;
            str3 = str5;
        }
    }
}
