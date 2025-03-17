package QK;

import GK.C15773A;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u0015B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d¨\u0006 "}, d2 = {"LQK/e;", "LQK/j;", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "d", "Ljava/lang/reflect/Method;", "f", "g", "Ljava/lang/Class;", "i", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: QK.e  reason: case insensitive filesystem */
public final class C16349e extends C16354j {

    /* renamed from: i  reason: collision with root package name */
    public static final b f137705i = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final Method f137706d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f137707e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f137708f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f137709g;

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f137710h;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LQK/e$a;", "Ljava/lang/reflect/InvocationHandler;", "", "", "protocols", "<init>", "(Ljava/util/List;)V", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/util/List;", "", "b", "Z", "()Z", "setUnsupported", "(Z)V", "unsupported", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "selected", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: QK.e$a */
    private static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f137711a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f137712b;

        /* renamed from: c  reason: collision with root package name */
        private String f137713c;

        public a(List<String> list) {
            C17542s.j(list, "protocols");
            this.f137711a = list;
        }

        public final String a() {
            return this.f137713c;
        }

        public final boolean b() {
            return this.f137712b;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C17542s.j(obj, "proxy");
            C17542s.j(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C17542s.e(name, "supports") && C17542s.e(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C17542s.e(name, "unsupported") && C17542s.e(Void.TYPE, returnType)) {
                this.f137712b = true;
                return null;
            } else if (C17542s.e(name, "protocols") && objArr.length == 0) {
                return this.f137711a;
            } else {
                if ((C17542s.e(name, "selectProtocol") || C17542s.e(name, "select")) && C17542s.e(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        C17542s.h(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i10 = 0;
                            while (true) {
                                Object obj3 = list.get(i10);
                                C17542s.h(obj3, "null cannot be cast to non-null type kotlin.String");
                                String str = (String) obj3;
                                if (!this.f137711a.contains(str)) {
                                    if (i10 == size) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    this.f137713c = str;
                                    return str;
                                }
                            }
                        }
                        String str2 = this.f137711a.get(0);
                        this.f137713c = str2;
                        return str2;
                    }
                }
                if ((!C17542s.e(name, "protocolSelected") && !C17542s.e(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                C17542s.h(obj4, "null cannot be cast to non-null type kotlin.String");
                this.f137713c = (String) obj4;
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LQK/e$b;", "", "<init>", "()V", "LQK/j;", "a", "()LQK/j;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: QK.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16354j a() {
            Class<SSLSocket> cls = SSLSocket.class;
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C17542s.i(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls2.getMethod("put", new Class[]{cls, cls3});
                Method method2 = cls2.getMethod("get", new Class[]{cls});
                Method method3 = cls2.getMethod("remove", new Class[]{cls});
                C17542s.i(method, "putMethod");
                C17542s.i(method2, "getMethod");
                C17542s.i(method3, "removeMethod");
                C17542s.i(cls4, "clientProviderClass");
                C17542s.i(cls5, "serverProviderClass");
                return new C16349e(method, method2, method3, cls4, cls5);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private b() {
        }
    }

    public C16349e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        C17542s.j(method, "putMethod");
        C17542s.j(method2, "getMethod");
        C17542s.j(method3, "removeMethod");
        C17542s.j(cls, "clientProviderClass");
        C17542s.j(cls2, "serverProviderClass");
        this.f137706d = method;
        this.f137707e = method2;
        this.f137708f = method3;
        this.f137709g = cls;
        this.f137710h = cls2;
    }

    public void b(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        try {
            this.f137708f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List<? extends C15773A> list) {
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        try {
            this.f137706d.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(C16354j.class.getClassLoader(), new Class[]{this.f137709g, this.f137710h}, new a(C16354j.f137719a.b(list)))});
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    public String h(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f137707e.invoke((Object) null, new Object[]{sSLSocket}));
            C17542s.h(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                C16354j.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                return null;
            } else if (aVar.b()) {
                return null;
            } else {
                return aVar.a();
            }
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
