package GK;

import HK.C15864d;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 \u00192\u00020\u0001:\u0001\u0017B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010 R\u0018\u0010%\u001a\u00020\u0014*\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010$¨\u0006&"}, d2 = {"LGK/t;", "", "LGK/G;", "tlsVersion", "LGK/i;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(LGK/G;LGK/i;Ljava/util/List;LnI/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LGK/G;", "e", "()LGK/G;", "b", "LGK/i;", "()LGK/i;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "LXH/o;", "peerCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.t  reason: case insensitive filesystem */
public final class C15801t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f135098e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15779G f135099a;

    /* renamed from: b  reason: collision with root package name */
    private final C15790i f135100b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Certificate> f135101c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f135102d;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006*\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LGK/t$a;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "", "c", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "LGK/t;", "b", "(Ljavax/net/ssl/SSLSession;)LGK/t;", "LGK/G;", "tlsVersion", "LGK/i;", "cipherSuite", "peerCertificates", "localCertificates", "a", "(LGK/G;LGK/i;Ljava/util/List;Ljava/util/List;)LGK/t;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.t$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: GK.t$a$a  reason: collision with other inner class name */
        static final class C3323a extends C17544u implements C17631a<List<? extends Certificate>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<Certificate> f135103c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3323a(List<? extends Certificate> list) {
                super(0);
                this.f135103c = list;
            }

            /* renamed from: b */
            public final List<Certificate> invoke() {
                return this.f135103c;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: GK.t$a$b */
        static final class b extends C17544u implements C17631a<List<? extends Certificate>> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<Certificate> f135104c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(List<? extends Certificate> list) {
                super(0);
                this.f135104c = list;
            }

            /* renamed from: b */
            public final List<Certificate> invoke() {
                return this.f135104c;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Certificate> c(Certificate[] certificateArr) {
            return certificateArr != null ? C15864d.w(Arrays.copyOf(certificateArr, certificateArr.length)) : C16877v.n();
        }

        public final C15801t a(C15779G g10, C15790i iVar, List<? extends Certificate> list, List<? extends Certificate> list2) {
            C17542s.j(g10, "tlsVersion");
            C17542s.j(iVar, "cipherSuite");
            C17542s.j(list, "peerCertificates");
            C17542s.j(list2, "localCertificates");
            return new C15801t(g10, iVar, C15864d.W(list2), new C3323a(C15864d.W(list)));
        }

        public final C15801t b(SSLSession sSLSession) {
            List<Certificate> list;
            C17542s.j(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!(C17542s.e(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : C17542s.e(cipherSuite, "SSL_NULL_WITH_NULL_NULL"))) {
                    C15790i b10 = C15790i.f134976b.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null");
                    } else if (!C17542s.e("NONE", protocol)) {
                        C15779G a10 = C15779G.Companion.a(protocol);
                        try {
                            list = c(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = C16877v.n();
                        }
                        return new C15801t(a10, b10, c(sSLSession.getLocalCertificates()), new b(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
            } else {
                throw new IllegalStateException("cipherSuite == null");
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: GK.t$b */
    static final class b extends C17544u implements C17631a<List<? extends Certificate>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<List<Certificate>> f135105c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17631a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f135105c = aVar;
        }

        /* renamed from: b */
        public final List<Certificate> invoke() {
            try {
                return this.f135105c.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C16877v.n();
            }
        }
    }

    public C15801t(C15779G g10, C15790i iVar, List<? extends Certificate> list, C17631a<? extends List<? extends Certificate>> aVar) {
        C17542s.j(g10, "tlsVersion");
        C17542s.j(iVar, "cipherSuite");
        C17542s.j(list, "localCertificates");
        C17542s.j(aVar, "peerCertificatesFn");
        this.f135099a = g10;
        this.f135100b = iVar;
        this.f135101c = list;
        this.f135102d = C16825p.b(new b(aVar));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C17542s.i(type, "type");
        return type;
    }

    public final C15790i a() {
        return this.f135100b;
    }

    public final List<Certificate> c() {
        return this.f135101c;
    }

    public final List<Certificate> d() {
        return (List) this.f135102d.getValue();
    }

    public final C15779G e() {
        return this.f135099a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15801t) {
            C15801t tVar = (C15801t) obj;
            return tVar.f135099a == this.f135099a && C17542s.e(tVar.f135100b, this.f135100b) && C17542s.e(tVar.d(), d()) && C17542s.e(tVar.f135101c, this.f135101c);
        }
    }

    public int hashCode() {
        return ((((((527 + this.f135099a.hashCode()) * 31) + this.f135100b.hashCode()) * 31) + d().hashCode()) * 31) + this.f135101c.hashCode();
    }

    public String toString() {
        Iterable<Certificate> d10 = d();
        ArrayList arrayList = new ArrayList(C16877v.y(d10, 10));
        for (Certificate b10 : d10) {
            arrayList.add(b(b10));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f135099a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f135100b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        Iterable<Certificate> iterable = this.f135101c;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (Certificate b11 : iterable) {
            arrayList2.add(b(b11));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
