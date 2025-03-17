package TK;

import QK.C16354j;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LTK/c;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: TK.c  reason: case insensitive filesystem */
public abstract class C16554c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138918a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LTK/c$a;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "LTK/c;", "a", "(Ljavax/net/ssl/X509TrustManager;)LTK/c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: TK.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16554c a(X509TrustManager x509TrustManager) {
            C17542s.j(x509TrustManager, "trustManager");
            return C16354j.f137719a.g().c(x509TrustManager);
        }

        private a() {
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str);
}
