package GK;

import HJ.C15854t;
import TK.C16554c;
import WK.C16773h;
import YH.C16877v;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.C17631a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0003\u000f\u0014\u0016B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LGK/g;", "", "", "LGK/g$c;", "pins", "LTK/c;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;LTK/c;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "LXH/N;", "a", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "b", "(Ljava/lang/String;LnI/a;)V", "c", "(Ljava/lang/String;)Ljava/util/List;", "e", "(LTK/c;)LGK/g;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "LTK/c;", "d", "()LTK/c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.g  reason: case insensitive filesystem */
public final class C15788g {

    /* renamed from: c  reason: collision with root package name */
    public static final b f134909c = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final C15788g f134910d = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Set<c> f134911a;

    /* renamed from: b  reason: collision with root package name */
    private final C16554c f134912b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LGK/g$a;", "", "<init>", "()V", "LGK/g;", "a", "()LGK/g;", "", "LGK/g$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "pins", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.g$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f134913a = new ArrayList();

        public final C15788g a() {
            return new C15788g(C16877v.y1(this.f134913a), (C16554c) null, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LGK/g$b;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "LWK/h;", "b", "(Ljava/security/cert/X509Certificate;)LWK/h;", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "LGK/g;", "DEFAULT", "LGK/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.g$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            C17542s.j(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + c((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final C16773h b(X509Certificate x509Certificate) {
            C17542s.j(x509Certificate, "<this>");
            C16773h.a aVar = C16773h.f139664d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C17542s.i(encoded, "publicKey.encoded");
            return C16773h.a.f(aVar, encoded, 0, 0, 3, (Object) null).U();
        }

        public final C16773h c(X509Certificate x509Certificate) {
            C17542s.j(x509Certificate, "<this>");
            C16773h.a aVar = C16773h.f139664d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C17542s.i(encoded, "publicKey.encoded");
            return C16773h.a.f(aVar, encoded, 0, 0, 3, (Object) null).V();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"LGK/g$c;", "", "", "hostname", "", "c", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getPattern", "pattern", "b", "hashAlgorithm", "LWK/h;", "LWK/h;", "()LWK/h;", "hash", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.g$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f134914a;

        /* renamed from: b  reason: collision with root package name */
        private final String f134915b;

        /* renamed from: c  reason: collision with root package name */
        private final C16773h f134916c;

        public final C16773h a() {
            return this.f134916c;
        }

        public final String b() {
            return this.f134915b;
        }

        public final boolean c(String str) {
            C17542s.j(str, "hostname");
            if (C15854t.W(this.f134914a, "**.", false, 2, (Object) null)) {
                int length = this.f134914a.length() - 3;
                int length2 = str.length() - length;
                if (!C15854t.L(str, str.length() - length, this.f134914a, 3, length, false, 16, (Object) null)) {
                    return false;
                }
                if (!(length2 == 0 || str.charAt(length2 - 1) == '.')) {
                    return false;
                }
            } else if (!C15854t.W(this.f134914a, "*.", false, 2, (Object) null)) {
                return C17542s.e(str, this.f134914a);
            } else {
                int length3 = this.f134914a.length() - 1;
                int length4 = str.length() - length3;
                if (!C15854t.L(str, str.length() - length3, this.f134914a, 1, length3, false, 16, (Object) null)) {
                    return false;
                }
                if (C15854t.y0(str, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f134914a, cVar.f134914a) && C17542s.e(this.f134915b, cVar.f134915b) && C17542s.e(this.f134916c, cVar.f134916c);
        }

        public int hashCode() {
            return (((this.f134914a.hashCode() * 31) + this.f134915b.hashCode()) * 31) + this.f134916c.hashCode();
        }

        public String toString() {
            return this.f134915b + '/' + this.f134916c.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: GK.g$d */
    static final class d extends C17544u implements C17631a<List<? extends X509Certificate>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15788g f134917c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<Certificate> f134918d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f134919e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C15788g gVar, List<? extends Certificate> list, String str) {
            super(0);
            this.f134917c = gVar;
            this.f134918d = list;
            this.f134919e = str;
        }

        /* renamed from: b */
        public final List<X509Certificate> invoke() {
            List<Certificate> list;
            C16554c d10 = this.f134917c.d();
            if (d10 == null || (list = d10.a(this.f134918d, this.f134919e)) == null) {
                list = this.f134918d;
            }
            Iterable<Certificate> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Certificate certificate : iterable) {
                C17542s.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C15788g(Set<c> set, C16554c cVar) {
        C17542s.j(set, "pins");
        this.f134911a = set;
        this.f134912b = cVar;
    }

    public final void a(String str, List<? extends Certificate> list) {
        C17542s.j(str, "hostname");
        C17542s.j(list, "peerCertificates");
        b(str, new d(this, list, str));
    }

    public final void b(String str, C17631a<? extends List<? extends X509Certificate>> aVar) {
        C17542s.j(str, "hostname");
        C17542s.j(aVar, "cleanedPeerCertificatesFn");
        List<c> c10 = c(str);
        if (!c10.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator<c> it = c10.iterator();
                C16773h hVar = null;
                C16773h hVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        c next = it.next();
                        String b10 = next.b();
                        if (C17542s.e(b10, "sha256")) {
                            if (hVar == null) {
                                hVar = f134909c.c(x509Certificate);
                            }
                            if (C17542s.e(next.a(), hVar)) {
                                return;
                            }
                        } else if (C17542s.e(b10, "sha1")) {
                            if (hVar2 == null) {
                                hVar2 = f134909c.b(x509Certificate);
                            }
                            if (C17542s.e(next.a(), hVar2)) {
                                return;
                            }
                        } else {
                            throw new AssertionError("unsupported hashAlgorithm: " + next.b());
                        }
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb2.append("\n    ");
                sb2.append(f134909c.a(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            for (c append : c10) {
                sb2.append("\n    ");
                sb2.append(append);
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
    }

    public final List<c> c(String str) {
        C17542s.j(str, "hostname");
        List<c> n10 = C16877v.n();
        for (Object next : this.f134911a) {
            if (((c) next).c(str)) {
                if (n10.isEmpty()) {
                    n10 = new ArrayList<>();
                }
                C17542s.h(n10, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                W.c(n10).add(next);
            }
        }
        return n10;
    }

    public final C16554c d() {
        return this.f134912b;
    }

    public final C15788g e(C16554c cVar) {
        C17542s.j(cVar, "certificateChainCleaner");
        return C17542s.e(this.f134912b, cVar) ? this : new C15788g(this.f134911a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15788g) {
            C15788g gVar = (C15788g) obj;
            return C17542s.e(gVar.f134911a, this.f134911a) && C17542s.e(gVar.f134912b, this.f134912b);
        }
    }

    public int hashCode() {
        int hashCode = (1517 + this.f134911a.hashCode()) * 41;
        C16554c cVar = this.f134912b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15788g(Set set, C16554c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
