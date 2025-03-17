package RK;

import QK.C16354j;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"LRK/n;", "LRK/h;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryClass", "paramClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "h", "Ljava/lang/Class;", "i", "j", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n extends C16395h {

    /* renamed from: j  reason: collision with root package name */
    public static final a f138053j = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private final Class<? super SSLSocketFactory> f138054h;

    /* renamed from: i  reason: collision with root package name */
    private final Class<?> f138055i;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LRK/n$a;", "", "<init>", "()V", "", "packageName", "LRK/m;", "a", "(Ljava/lang/String;)LRK/m;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ m b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final m a(String str) {
            C17542s.j(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                C17542s.h(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                C17542s.h(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C17542s.i(cls3, "paramsClass");
                return new n(cls, cls2, cls3);
            } catch (Exception e10) {
                C16354j.f137719a.g().k("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        C17542s.j(cls, "sslSocketClass");
        C17542s.j(cls2, "sslSocketFactoryClass");
        C17542s.j(cls3, "paramClass");
        this.f138054h = cls2;
        this.f138055i = cls3;
    }
}
