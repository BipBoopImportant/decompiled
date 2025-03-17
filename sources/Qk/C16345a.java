package QK;

import GK.C15773A;
import RK.C16390c;
import RK.C16391d;
import RK.C16395h;
import RK.C16396i;
import RK.k;
import RK.l;
import RK.m;
import TK.C16554c;
import YH.C16877v;
import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"LQK/a;", "LQK/j;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "j", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "LTK/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)LTK/c;", "LRK/m;", "d", "Ljava/util/List;", "socketAdapters", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: QK.a  reason: case insensitive filesystem */
public final class C16345a extends C16354j {

    /* renamed from: e  reason: collision with root package name */
    public static final C3372a f137689e = new C3372a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f137690f = (C16354j.f137719a.h() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: d  reason: collision with root package name */
    private final List<m> f137691d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LQK/a$a;", "", "<init>", "()V", "LQK/j;", "a", "()LQK/j;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: QK.a$a  reason: collision with other inner class name */
    public static final class C3372a {
        public /* synthetic */ C3372a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16354j a() {
            if (b()) {
                return new C16345a();
            }
            return null;
        }

        public final boolean b() {
            return C16345a.f137690f;
        }

        private C3372a() {
        }
    }

    public C16345a() {
        m[] mVarArr = {C16390c.f138027a.a(), new l(C16395h.f138035f.d()), new l(k.f138049a.a()), new l(C16396i.f138043a.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : C16877v.s(mVarArr)) {
            if (((m) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f137691d = arrayList;
    }

    public C16554c c(X509TrustManager x509TrustManager) {
        C17542s.j(x509TrustManager, "trustManager");
        C16391d a10 = C16391d.f138028d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    public void e(SSLSocket sSLSocket, String str, List<? extends C15773A> list) {
        Object obj;
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        Iterator it = this.f137691d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.c(sSLSocket, str, list);
        }
    }

    public String h(SSLSocket sSLSocket) {
        Object obj;
        C17542s.j(sSLSocket, "sslSocket");
        Iterator it = this.f137691d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public boolean j(String str) {
        C17542s.j(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
