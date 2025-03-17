package RK;

import GK.C15773A;
import HJ.C15838d;
import HJ.C15854t;
import QK.C16346b;
import QK.C16354j;
import RK.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001\u000bB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006\""}, d2 = {"LRK/h;", "LRK/m;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "", "isSupported", "()Z", "sslSocket", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "c", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "setHostname", "d", "getAlpnSelectedProtocol", "e", "setAlpnProtocols", "f", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: RK.h  reason: case insensitive filesystem */
public class C16395h implements m {

    /* renamed from: f  reason: collision with root package name */
    public static final a f138035f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final l.a f138036g;

    /* renamed from: a  reason: collision with root package name */
    private final Class<? super SSLSocket> f138037a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f138038b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f138039c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f138040d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f138041e;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LRK/h$a;", "", "<init>", "()V", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "LRK/h;", "b", "(Ljava/lang/Class;)LRK/h;", "", "packageName", "LRK/l$a;", "c", "(Ljava/lang/String;)LRK/l$a;", "playProviderFactory", "LRK/l$a;", "d", "()LRK/l$a;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: RK.h$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"RK/h$a$a", "LRK/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "LRK/m;", "b", "(Ljavax/net/ssl/SSLSocket;)LRK/m;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: RK.h$a$a  reason: collision with other inner class name */
        public static final class C3377a implements l.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f138042a;

            C3377a(String str) {
                this.f138042a = str;
            }

            public boolean a(SSLSocket sSLSocket) {
                C17542s.j(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                C17542s.i(name, "sslSocket.javaClass.name");
                return C15854t.W(name, this.f138042a + '.', false, 2, (Object) null);
            }

            public m b(SSLSocket sSLSocket) {
                C17542s.j(sSLSocket, "sslSocket");
                return C16395h.f138035f.b(sSLSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C16395h b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && !C17542s.e(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            C17542s.g(cls2);
            return new C16395h(cls2);
        }

        public final l.a c(String str) {
            C17542s.j(str, "packageName");
            return new C3377a(str);
        }

        public final l.a d() {
            return C16395h.f138036g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f138035f = aVar;
        f138036g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public C16395h(Class<? super SSLSocket> cls) {
        C17542s.j(cls, "sslSocketClass");
        this.f138037a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C17542s.i(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f138038b = declaredMethod;
        this.f138039c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f138040d = cls.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.f138041e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public boolean a(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        return this.f138037a.isInstance(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f138040d.invoke(sSLSocket, (Object[]) null);
            if (bArr != null) {
                return new String(bArr, C15838d.f135279b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && C17542s.e(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    public void c(SSLSocket sSLSocket, String str, List<? extends C15773A> list) {
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f138038b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f138039c.invoke(sSLSocket, new Object[]{str});
                }
                this.f138041e.invoke(sSLSocket, new Object[]{C16354j.f137719a.c(list)});
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public boolean isSupported() {
        return C16346b.f137692f.b();
    }
}
