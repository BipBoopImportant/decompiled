package TK;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001c"}, d2 = {"LTK/a;", "LTK/c;", "LTK/e;", "trustRootIndex", "<init>", "(LTK/e;)V", "Ljava/security/cert/X509Certificate;", "toVerify", "signingCert", "", "b", "(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;)Z", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "LTK/e;", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: TK.a  reason: case insensitive filesystem */
public final class C16552a extends C16554c {

    /* renamed from: c  reason: collision with root package name */
    public static final C3400a f138915c = new C3400a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final C16556e f138916b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTK/a$a;", "", "<init>", "()V", "", "MAX_SIGNERS", "I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: TK.a$a  reason: collision with other inner class name */
    public static final class C3400a {
        public /* synthetic */ C3400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3400a() {
        }
    }

    public C16552a(C16556e eVar) {
        C17542s.j(eVar, "trustRootIndex");
        this.f138916b = eVar;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C17542s.e(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public List<Certificate> a(List<? extends Certificate> list, String str) {
        C17542s.j(list, "chain");
        C17542s.j(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C17542s.i(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            C17542s.h(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a10 = this.f138916b.a(x509Certificate);
            if (a10 != null) {
                if (arrayList.size() > 1 || !C17542s.e(x509Certificate, a10)) {
                    arrayList.add(a10);
                }
                if (b(a10, a10)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                C17542s.i(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    C17542s.h(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C16552a) && C17542s.e(((C16552a) obj).f138916b, this.f138916b);
    }

    public int hashCode() {
        return this.f138916b.hashCode();
    }
}
