package a7;

import GK.C15804w;
import YH.C16877v;
import b7.b;
import c7.C7100a;
import com.appmattus.certificatetransparency.chaincleaner.CertificateChainCleanerFactory;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import nI.C17631a;
import p7.C8633f;
import q7.C8680b;
import r7.C8703e;
import r7.C8704f;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b\u0019\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00108\u001a\u0004\u0018\u0001028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b\u0014\u00107¨\u00069"}, d2 = {"La7/b;", "", "<init>", "()V", "LGK/w;", "c", "()LGK/w;", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "a", "Lcom/appmattus/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "certificateChainCleanerFactory", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lr7/f;", "Lr7/f;", "logListService", "Lc7/a;", "Lr7/e;", "d", "Lc7/a;", "logListDataSource", "", "Lq7/b;", "e", "Ljava/util/Set;", "includeHosts", "f", "excludeHosts", "Lkotlin/Function0;", "", "g", "LnI/a;", "_failOnError", "La7/d;", "h", "La7/d;", "getLogger", "()La7/d;", "(La7/d;)V", "logger", "La7/e;", "i", "La7/e;", "getPolicy", "()La7/e;", "setPolicy", "(La7/e;)V", "policy", "Lb7/b;", "j", "Lb7/b;", "getDiskCache", "()Lb7/b;", "(Lb7/b;)V", "diskCache", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: a7.b  reason: case insensitive filesystem */
public final class C6747b {

    /* renamed from: a  reason: collision with root package name */
    private CertificateChainCleanerFactory f41514a;

    /* renamed from: b  reason: collision with root package name */
    private X509TrustManager f41515b;

    /* renamed from: c  reason: collision with root package name */
    private C8704f f41516c;

    /* renamed from: d  reason: collision with root package name */
    private C7100a<C8703e> f41517d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<C8680b> f41518e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Set<C8680b> f41519f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    private C17631a<Boolean> f41520g = new C6746a();

    /* renamed from: h  reason: collision with root package name */
    private C6749d f41521h;

    /* renamed from: i  reason: collision with root package name */
    private C6750e f41522i;

    /* renamed from: j  reason: collision with root package name */
    private b f41523j;

    /* access modifiers changed from: private */
    public static final boolean b() {
        return true;
    }

    public final C15804w c() {
        return new C8633f(C16877v.y1(this.f41518e), C16877v.y1(this.f41519f), this.f41514a, this.f41515b, this.f41516c, this.f41517d, this.f41522i, this.f41523j, this.f41520g, this.f41521h);
    }

    public final /* synthetic */ void d(b bVar) {
        this.f41523j = bVar;
    }

    public final /* synthetic */ void e(C6749d dVar) {
        this.f41521h = dVar;
    }
}
