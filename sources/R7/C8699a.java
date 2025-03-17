package r7;

import c7.C7100a;
import dI.C17164e;
import e7.C7796c;
import e7.C7799f;
import e7.C7806m;
import h7.C7937a;
import h7.e;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import r7.C8703e;
import r7.C8708j;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lr7/a;", "Lc7/a;", "Lr7/e;", "Le7/c;", "inMemoryCache", "Lb7/b;", "diskCache", "Le7/m;", "resourcesCache", "Le7/f;", "networkCache", "Ljava/security/PublicKey;", "publicKey", "Lh7/e;", "transformer", "Lkotlin/Function0;", "Ljava/time/Instant;", "now", "<init>", "(Le7/c;Lb7/b;Le7/m;Le7/f;Ljava/security/PublicKey;Lh7/e;LnI/a;)V", "Lr7/j;", "Lr7/e$c;", "d", "(Lr7/j;Lh7/e;)Lr7/e$c;", "a", "(LdI/e;)Ljava/lang/Object;", "Le7/c;", "b", "Lb7/b;", "c", "Le7/m;", "Le7/f;", "e", "Ljava/security/PublicKey;", "f", "Lh7/e;", "g", "LnI/a;", "h", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: r7.a  reason: case insensitive filesystem */
public final class C8699a implements C7100a<C8703e> {

    /* renamed from: h  reason: collision with root package name */
    public static final C0899a f55720h = new C0899a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private static final Duration f55721i = Duration.ofMillis(86400000);

    /* renamed from: j  reason: collision with root package name */
    private static final Duration f55722j = Duration.ofMillis(1209600000);

    /* renamed from: k  reason: collision with root package name */
    private static final Duration f55723k = Duration.ofMillis(6048000000L);

    /* renamed from: a  reason: collision with root package name */
    private final C7796c f55724a;

    /* renamed from: b  reason: collision with root package name */
    private final b7.b f55725b;

    /* renamed from: c  reason: collision with root package name */
    private final C7806m f55726c;

    /* renamed from: d  reason: collision with root package name */
    private final C7799f f55727d;

    /* renamed from: e  reason: collision with root package name */
    private final PublicKey f55728e;

    /* renamed from: f  reason: collision with root package name */
    private final e f55729f;

    /* renamed from: g  reason: collision with root package name */
    private final C17631a<Instant> f55730g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001c\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lr7/a$a;", "", "<init>", "()V", "Ljava/time/Duration;", "kotlin.jvm.PlatformType", "ONE_DAY", "Ljava/time/Duration;", "FOURTEEN_DAYS", "SEVENTY_DAYS", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.a$a  reason: collision with other inner class name */
    public static final class C0899a {
        public /* synthetic */ C0899a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0899a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.appmattus.certificatetransparency.loglist.LogListCacheManagementDataSource", f = "LogListCacheManagementDataSource.kt", l = {43, 53, 59, 65, 71, 72, 82, 96, 97}, m = "get")
    /* renamed from: r7.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f55731c;

        /* renamed from: d  reason: collision with root package name */
        Object f55732d;

        /* renamed from: e  reason: collision with root package name */
        Object f55733e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f55734f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C8699a f55735g;

        /* renamed from: h  reason: collision with root package name */
        int f55736h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C8699a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f55735g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55734f = obj;
            this.f55736h |= Integer.MIN_VALUE;
            return this.f55735g.a(this);
        }
    }

    public C8699a(C7796c cVar, b7.b bVar, C7806m mVar, C7799f fVar, PublicKey publicKey, e eVar, C17631a<Instant> aVar) {
        C17542s.j(cVar, "inMemoryCache");
        C17542s.j(mVar, "resourcesCache");
        C17542s.j(fVar, "networkCache");
        C17542s.j(publicKey, "publicKey");
        C17542s.j(eVar, "transformer");
        C17542s.j(aVar, "now");
        this.f55724a = cVar;
        this.f55725b = bVar;
        this.f55726c = mVar;
        this.f55727d = fVar;
        this.f55728e = publicKey;
        this.f55729f = eVar;
        this.f55730g = aVar;
    }

    private final C8703e.c d(C8708j jVar, e eVar) {
        if (!(jVar instanceof C8708j.b)) {
            return null;
        }
        C8703e a10 = eVar.a(jVar);
        if (a10 instanceof C8703e.c) {
            return (C8703e.c) a10;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0275, code lost:
        r14 = new r7.C8703e.c.b(r0.a(), r0.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0289, code lost:
        if (r0 != null) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a3, code lost:
        if (r0.a().plus(f55723k).compareTo(r1.f55730g.invoke()) < 0) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02a6, code lost:
        r14 = new r7.C8703e.a(r0.a(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return new r7.C8703e.b.c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        r14 = (r7.C8708j) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bb, code lost:
        if (r14 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bd, code lost:
        r5 = r7.d(r14, r7.f55729f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c5, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
        if (r5 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        if (r5.a().plus(f55721i).compareTo(r7.f55730g.invoke()) < 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        r14 = r7.f55725b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e3, code lost:
        if (r14 == null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
        r3.f55731c = r7;
        r3.f55732d = r5;
        r3.f55736h = 2;
        r14 = r14.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        if (r14 != r4) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
        r14 = (r7.C8708j) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        if (r14 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f8, code lost:
        r8 = r7.d(r14, r7.f55729f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0100, code lost:
        if (r8 == null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0118, code lost:
        if (r8.a().plus(f55721i).compareTo(r7.f55730g.invoke()) < 0) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011a, code lost:
        r1 = r7.f55724a;
        r3.f55731c = r8;
        r3.f55732d = null;
        r3.f55736h = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0126, code lost:
        if (r1.c(r14, r3) != r4) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012b, code lost:
        r14 = r7.f55726c;
        r3.f55731c = r7;
        r3.f55732d = r5;
        r3.f55733e = r8;
        r3.f55736h = 4;
        r14 = r14.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        if (r14 != r4) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013d, code lost:
        r12 = r8;
        r8 = r5;
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0140, code lost:
        r14 = (r7.C8708j) r14;
        r9 = r7.d(r14, r7.f55729f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0148, code lost:
        if (r9 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0160, code lost:
        if (r9.a().plus(f55721i).compareTo(r7.f55730g.invoke()) < 0) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0162, code lost:
        r0 = r7.f55724a;
        r3.f55731c = r7;
        r3.f55732d = r14;
        r3.f55733e = r9;
        r3.f55736h = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0171, code lost:
        if (r0.c(r14, r3) != r4) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0173, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0174, code lost:
        r1 = r14;
        r2 = r7;
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0177, code lost:
        r14 = r2.f55725b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0179, code lost:
        if (r14 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017b, code lost:
        r3.f55731c = r0;
        r3.f55732d = null;
        r3.f55733e = null;
        r3.f55736h = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0188, code lost:
        if (r14.b(r1, r3) != r4) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018c, code lost:
        r14 = YH.C16877v.s(r5, r8, r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a3, code lost:
        if (r14.hasNext() != false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a7, code lost:
        r0 = r14.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01af, code lost:
        if (r14.hasNext() != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b2, code lost:
        r1 = ((r7.C8703e.c) r0).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b9, code lost:
        r2 = r14.next();
        r5 = ((r7.C8703e.c) r2).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c8, code lost:
        if (r1.compareTo(r5) >= 0) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        r0 = r2;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d0, code lost:
        if (r14.hasNext() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d2, code lost:
        r0 = (r7.C8703e.c) r0;
        r14 = r7.f55727d;
        r3.f55731c = r7;
        r3.f55732d = r0;
        r3.f55733e = null;
        r3.f55736h = 7;
        r14 = r14.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e3, code lost:
        if (r14 != r4) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e5, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e6, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e7, code lost:
        r14 = (r7.C8708j) r14;
        r2 = r1.f55729f.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f1, code lost:
        if ((r2 instanceof r7.C8703e.c) == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f3, code lost:
        if (r0 == null) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f5, code lost:
        r5 = (r7.C8703e.c) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0204, code lost:
        if (r5.a().compareTo(r0.a()) >= 0) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0206, code lost:
        r14 = new r7.C8703e.c.a(r0.a(), r0.b(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022f, code lost:
        if (((r7.C8703e.c) r2).a().plus(f55723k).compareTo(r1.f55730g.invoke()) < 0) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0231, code lost:
        r0 = r1.f55724a;
        r3.f55731c = r1;
        r3.f55732d = r14;
        r3.f55733e = r2;
        r3.f55736h = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0241, code lost:
        if (r0.c(r14, r3) != r4) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0243, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0244, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0245, code lost:
        r2 = r1.f55725b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0247, code lost:
        if (r2 == null) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0249, code lost:
        r3.f55731c = r1;
        r3.f55732d = r0;
        r3.f55733e = null;
        r3.f55736h = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0257, code lost:
        if (r2.b(r14, r3) != r4) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0259, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025a, code lost:
        r0 = (r7.C8703e.c) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0272, code lost:
        if (r0.a().plus(f55722j).compareTo(r1.f55730g.invoke()) < 0) goto L_0x0275;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super r7.C8703e> r14) {
        /*
            r13 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            boolean r3 = r14 instanceof r7.C8699a.b
            if (r3 == 0) goto L_0x0016
            r3 = r14
            r7.a$b r3 = (r7.C8699a.b) r3
            int r4 = r3.f55736h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0016
            int r4 = r4 - r5
            r3.f55736h = r4
            goto L_0x001b
        L_0x0016:
            r7.a$b r3 = new r7.a$b
            r3.<init>(r13, r14)
        L_0x001b:
            java.lang.Object r14 = r3.f55734f
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f55736h
            r6 = 0
            switch(r5) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x009f;
                case 2: goto L_0x0093;
                case 3: goto L_0x008a;
                case 4: goto L_0x0076;
                case 5: goto L_0x0065;
                case 6: goto L_0x005c;
                case 7: goto L_0x004f;
                case 8: goto L_0x003c;
                case 9: goto L_0x002f;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x002f:
            java.lang.Object r0 = r3.f55732d
            r7.e r0 = (r7.C8703e) r0
            java.lang.Object r1 = r3.f55731c
            r7.a r1 = (r7.C8699a) r1
            XH.y.b(r14)
            goto L_0x025a
        L_0x003c:
            java.lang.Object r0 = r3.f55733e
            r7.e r0 = (r7.C8703e) r0
            java.lang.Object r1 = r3.f55732d
            r7.j r1 = (r7.C8708j) r1
            java.lang.Object r2 = r3.f55731c
            r7.a r2 = (r7.C8699a) r2
            XH.y.b(r14)
            r14 = r1
            r1 = r2
            goto L_0x0245
        L_0x004f:
            java.lang.Object r0 = r3.f55732d
            r7.e$c r0 = (r7.C8703e.c) r0
            java.lang.Object r1 = r3.f55731c
            r7.a r1 = (r7.C8699a) r1
            XH.y.b(r14)
            goto L_0x01e7
        L_0x005c:
            java.lang.Object r0 = r3.f55731c
            r7.e$c r0 = (r7.C8703e.c) r0
            XH.y.b(r14)
            goto L_0x018b
        L_0x0065:
            java.lang.Object r0 = r3.f55733e
            r7.e$c r0 = (r7.C8703e.c) r0
            java.lang.Object r1 = r3.f55732d
            r7.j r1 = (r7.C8708j) r1
            java.lang.Object r2 = r3.f55731c
            r7.a r2 = (r7.C8699a) r2
            XH.y.b(r14)
            goto L_0x0177
        L_0x0076:
            java.lang.Object r5 = r3.f55733e
            r7.e$c r5 = (r7.C8703e.c) r5
            java.lang.Object r7 = r3.f55732d
            r7.e$c r7 = (r7.C8703e.c) r7
            java.lang.Object r8 = r3.f55731c
            r7.a r8 = (r7.C8699a) r8
            XH.y.b(r14)
            r12 = r8
            r8 = r7
            r7 = r12
            goto L_0x0140
        L_0x008a:
            java.lang.Object r0 = r3.f55731c
            r7.e$c r0 = (r7.C8703e.c) r0
            XH.y.b(r14)
            goto L_0x012a
        L_0x0093:
            java.lang.Object r5 = r3.f55732d
            r7.e$c r5 = (r7.C8703e.c) r5
            java.lang.Object r7 = r3.f55731c
            r7.a r7 = (r7.C8699a) r7
            XH.y.b(r14)
            goto L_0x00f2
        L_0x009f:
            java.lang.Object r5 = r3.f55731c
            r7.a r5 = (r7.C8699a) r5
            XH.y.b(r14)
            r7 = r5
            goto L_0x00b9
        L_0x00a8:
            XH.y.b(r14)
            e7.c r14 = r13.f55724a
            r3.f55731c = r13
            r3.f55736h = r2
            java.lang.Object r14 = r14.a(r3)
            if (r14 != r4) goto L_0x00b8
            return r4
        L_0x00b8:
            r7 = r13
        L_0x00b9:
            r7.j r14 = (r7.C8708j) r14
            if (r14 == 0) goto L_0x00c5
            h7.e r5 = r7.f55729f
            r7.e$c r14 = r7.d(r14, r5)
            r5 = r14
            goto L_0x00c6
        L_0x00c5:
            r5 = r6
        L_0x00c6:
            if (r5 == 0) goto L_0x00e1
            java.time.Instant r14 = r5.a()
            java.time.Duration r8 = f55721i
            java.time.Instant r14 = r14.plus(r8)
            nI.a<java.time.Instant> r8 = r7.f55730g
            java.lang.Object r8 = r8.invoke()
            java.time.Instant r8 = (java.time.Instant) r8
            int r14 = r14.compareTo(r8)
            if (r14 < 0) goto L_0x00e1
            return r5
        L_0x00e1:
            b7.b r14 = r7.f55725b
            if (r14 == 0) goto L_0x00f5
            r3.f55731c = r7
            r3.f55732d = r5
            r3.f55736h = r1
            java.lang.Object r14 = r14.a(r3)
            if (r14 != r4) goto L_0x00f2
            return r4
        L_0x00f2:
            r7.j r14 = (r7.C8708j) r14
            goto L_0x00f6
        L_0x00f5:
            r14 = r6
        L_0x00f6:
            if (r14 == 0) goto L_0x00ff
            h7.e r8 = r7.f55729f
            r7.e$c r8 = r7.d(r14, r8)
            goto L_0x0100
        L_0x00ff:
            r8 = r6
        L_0x0100:
            if (r8 == 0) goto L_0x012b
            java.time.Instant r9 = r8.a()
            java.time.Duration r10 = f55721i
            java.time.Instant r9 = r9.plus(r10)
            nI.a<java.time.Instant> r10 = r7.f55730g
            java.lang.Object r10 = r10.invoke()
            java.time.Instant r10 = (java.time.Instant) r10
            int r9 = r9.compareTo(r10)
            if (r9 < 0) goto L_0x012b
            e7.c r1 = r7.f55724a
            r3.f55731c = r8
            r3.f55732d = r6
            r3.f55736h = r0
            java.lang.Object r14 = r1.c(r14, r3)
            if (r14 != r4) goto L_0x0129
            return r4
        L_0x0129:
            r0 = r8
        L_0x012a:
            return r0
        L_0x012b:
            e7.m r14 = r7.f55726c
            r3.f55731c = r7
            r3.f55732d = r5
            r3.f55733e = r8
            r9 = 4
            r3.f55736h = r9
            java.lang.Object r14 = r14.a(r3)
            if (r14 != r4) goto L_0x013d
            return r4
        L_0x013d:
            r12 = r8
            r8 = r5
            r5 = r12
        L_0x0140:
            r7.j r14 = (r7.C8708j) r14
            h7.e r9 = r7.f55729f
            r7.e$c r9 = r7.d(r14, r9)
            if (r9 == 0) goto L_0x018c
            java.time.Instant r10 = r9.a()
            java.time.Duration r11 = f55721i
            java.time.Instant r10 = r10.plus(r11)
            nI.a<java.time.Instant> r11 = r7.f55730g
            java.lang.Object r11 = r11.invoke()
            java.time.Instant r11 = (java.time.Instant) r11
            int r10 = r10.compareTo(r11)
            if (r10 < 0) goto L_0x018c
            e7.c r0 = r7.f55724a
            r3.f55731c = r7
            r3.f55732d = r14
            r3.f55733e = r9
            r1 = 5
            r3.f55736h = r1
            java.lang.Object r0 = r0.c(r14, r3)
            if (r0 != r4) goto L_0x0174
            return r4
        L_0x0174:
            r1 = r14
            r2 = r7
            r0 = r9
        L_0x0177:
            b7.b r14 = r2.f55725b
            if (r14 == 0) goto L_0x018b
            r3.f55731c = r0
            r3.f55732d = r6
            r3.f55733e = r6
            r2 = 6
            r3.f55736h = r2
            java.lang.Object r14 = r14.b(r1, r3)
            if (r14 != r4) goto L_0x018b
            return r4
        L_0x018b:
            return r0
        L_0x018c:
            r7.e$c[] r14 = new r7.C8703e.c[r0]
            r0 = 0
            r14[r0] = r5
            r14[r2] = r8
            r14[r1] = r9
            java.util.List r14 = YH.C16877v.s(r14)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
            boolean r0 = r14.hasNext()
            if (r0 != 0) goto L_0x01a7
            r0 = r6
            goto L_0x01d2
        L_0x01a7:
            java.lang.Object r0 = r14.next()
            boolean r1 = r14.hasNext()
            if (r1 != 0) goto L_0x01b2
            goto L_0x01d2
        L_0x01b2:
            r1 = r0
            r7.e$c r1 = (r7.C8703e.c) r1
            java.time.Instant r1 = r1.a()
        L_0x01b9:
            java.lang.Object r2 = r14.next()
            r5 = r2
            r7.e$c r5 = (r7.C8703e.c) r5
            java.time.Instant r5 = r5.a()
            int r8 = r1.compareTo(r5)
            if (r8 >= 0) goto L_0x01cc
            r0 = r2
            r1 = r5
        L_0x01cc:
            boolean r2 = r14.hasNext()
            if (r2 != 0) goto L_0x01b9
        L_0x01d2:
            r7.e$c r0 = (r7.C8703e.c) r0
            e7.f r14 = r7.f55727d
            r3.f55731c = r7
            r3.f55732d = r0
            r3.f55733e = r6
            r1 = 7
            r3.f55736h = r1
            java.lang.Object r14 = r14.a(r3)
            if (r14 != r4) goto L_0x01e6
            return r4
        L_0x01e6:
            r1 = r7
        L_0x01e7:
            r7.j r14 = (r7.C8708j) r14
            h7.e r2 = r1.f55729f
            r7.e r2 = r2.a(r14)
            boolean r5 = r2 instanceof r7.C8703e.c
            if (r5 == 0) goto L_0x0289
            if (r0 == 0) goto L_0x0216
            r5 = r2
            r7.e$c r5 = (r7.C8703e.c) r5
            java.time.Instant r7 = r5.a()
            java.time.Instant r8 = r0.a()
            int r7 = r7.compareTo(r8)
            if (r7 >= 0) goto L_0x0216
            r7.e$c$a r14 = new r7.e$c$a
            java.time.Instant r1 = r0.a()
            java.util.List r0 = r0.b()
            r14.<init>(r1, r0, r5)
        L_0x0213:
            r0 = r14
            goto L_0x02b1
        L_0x0216:
            r0 = r2
            r7.e$c r0 = (r7.C8703e.c) r0
            java.time.Instant r0 = r0.a()
            java.time.Duration r5 = f55723k
            java.time.Instant r0 = r0.plus(r5)
            nI.a<java.time.Instant> r5 = r1.f55730g
            java.lang.Object r5 = r5.invoke()
            java.time.Instant r5 = (java.time.Instant) r5
            int r0 = r0.compareTo(r5)
            if (r0 < 0) goto L_0x0283
            e7.c r0 = r1.f55724a
            r3.f55731c = r1
            r3.f55732d = r14
            r3.f55733e = r2
            r5 = 8
            r3.f55736h = r5
            java.lang.Object r0 = r0.c(r14, r3)
            if (r0 != r4) goto L_0x0244
            return r4
        L_0x0244:
            r0 = r2
        L_0x0245:
            b7.b r2 = r1.f55725b
            if (r2 == 0) goto L_0x025a
            r3.f55731c = r1
            r3.f55732d = r0
            r3.f55733e = r6
            r5 = 9
            r3.f55736h = r5
            java.lang.Object r14 = r2.b(r14, r3)
            if (r14 != r4) goto L_0x025a
            return r4
        L_0x025a:
            r7.e$c r0 = (r7.C8703e.c) r0
            java.time.Instant r14 = r0.a()
            java.time.Duration r2 = f55722j
            java.time.Instant r14 = r14.plus(r2)
            nI.a<java.time.Instant> r1 = r1.f55730g
            java.lang.Object r1 = r1.invoke()
            java.time.Instant r1 = (java.time.Instant) r1
            int r14 = r14.compareTo(r1)
            if (r14 < 0) goto L_0x0275
            goto L_0x02b1
        L_0x0275:
            r7.e$c$b r14 = new r7.e$c$b
            java.time.Instant r1 = r0.a()
            java.util.List r0 = r0.b()
            r14.<init>(r1, r0)
            goto L_0x0213
        L_0x0283:
            r7.e$b$c r0 = new r7.e$b$c
            r0.<init>(r2)
            goto L_0x02b1
        L_0x0289:
            if (r0 != 0) goto L_0x028d
            r0 = r2
            goto L_0x02b1
        L_0x028d:
            java.time.Instant r14 = r0.a()
            java.time.Duration r3 = f55723k
            java.time.Instant r14 = r14.plus(r3)
            nI.a<java.time.Instant> r1 = r1.f55730g
            java.lang.Object r1 = r1.invoke()
            java.time.Instant r1 = (java.time.Instant) r1
            int r14 = r14.compareTo(r1)
            if (r14 < 0) goto L_0x02a6
            goto L_0x02b1
        L_0x02a6:
            r7.e$a r14 = new r7.e$a
            java.time.Instant r0 = r0.a()
            r14.<init>(r0, r2)
            goto L_0x0213
        L_0x02b1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.C8699a.a(dI.e):java.lang.Object");
    }

    public C7100a<C8703e> c() {
        return C7100a.C0797a.a(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8699a(C7796c cVar, b7.b bVar, C7806m mVar, C7799f fVar, PublicKey publicKey, e eVar, C17631a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, bVar, mVar, fVar, publicKey, (i10 & 32) != 0 ? new e(publicKey, (h7.d) null, (C7937a) null, 6, (DefaultConstructorMarker) null) : eVar, aVar);
    }
}
