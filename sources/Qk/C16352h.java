package QK;

import GK.C15773A;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"LQK/h;", "LQK/j;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "d", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: QK.h  reason: case insensitive filesystem */
public class C16352h extends C16354j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f137714d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f137715e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LQK/h$a;", "", "<init>", "()V", "LQK/h;", "a", "()LQK/h;", "", "isAvailable", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: QK.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16352h a() {
            if (b()) {
                return new C16352h();
            }
            return null;
        }

        public final boolean b() {
            return C16352h.f137715e;
        }

        private a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.intValue() >= 9) goto L_0x0022;
     */
    static {
        /*
            QK.h$a r0 = new QK.h$a
            r1 = 0
            r0.<init>(r1)
            f137714d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.Integer r0 = HJ.C15854t.t(r0)
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0024
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L_0x002c
        L_0x0022:
            r2 = r3
            goto L_0x002c
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch:{ NoSuchMethodException -> 0x002c }
            goto L_0x0022
        L_0x002c:
            f137715e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QK.C16352h.<clinit>():void");
    }

    public void e(SSLSocket sSLSocket, String str, List<C15773A> list) {
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) C16354j.f137719a.b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public String h(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        try {
            String a10 = sSLSocket.getApplicationProtocol();
            if (a10 == null ? true : C17542s.e(a10, "")) {
                return null;
            }
            return a10;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
