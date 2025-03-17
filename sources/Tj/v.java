package Tj;

import Ry.h;
import Sy.a;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.I;
import rz.O;
import xj.C12314a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nHB¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"LTj/v;", "", "LRy/h;", "scanAndGoProductRepository", "LSy/a;", "scanAndGoAnalytics", "Lxj/a;", "productDetailsAnalytics", "<init>", "(LRy/h;LSy/a;Lxj/a;)V", "LTj/v$a;", "params", "Lrz/I;", "scanAndGoProduct", "LXH/N;", "c", "(LTj/v$a;Lrz/I;)V", "b", "(LTj/v$a;)V", "a", "(LTj/v$a;LdI/e;)Ljava/lang/Object;", "LRy/h;", "LSy/a;", "Lxj/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final h f87690a;

    /* renamed from: b  reason: collision with root package name */
    private final Sy.a f87691b;

    /* renamed from: c  reason: collision with root package name */
    private final C12314a f87692c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.LookupProductUseCase", f = "LookupProductUseCase.kt", l = {25}, m = "invoke")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87701c;

        /* renamed from: d  reason: collision with root package name */
        Object f87702d;

        /* renamed from: e  reason: collision with root package name */
        Object f87703e;

        /* renamed from: f  reason: collision with root package name */
        Object f87704f;

        /* renamed from: g  reason: collision with root package name */
        Object f87705g;

        /* renamed from: h  reason: collision with root package name */
        Object f87706h;

        /* renamed from: i  reason: collision with root package name */
        Object f87707i;

        /* renamed from: j  reason: collision with root package name */
        Object f87708j;

        /* renamed from: k  reason: collision with root package name */
        Object f87709k;

        /* renamed from: l  reason: collision with root package name */
        Object f87710l;

        /* renamed from: m  reason: collision with root package name */
        Object f87711m;

        /* renamed from: n  reason: collision with root package name */
        Object f87712n;

        /* renamed from: o  reason: collision with root package name */
        int f87713o;

        /* renamed from: p  reason: collision with root package name */
        int f87714p;

        /* renamed from: q  reason: collision with root package name */
        boolean f87715q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f87716r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ v f87717s;

        /* renamed from: t  reason: collision with root package name */
        int f87718t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(v vVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f87717s = vVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87716r = obj;
            this.f87718t |= Integer.MIN_VALUE;
            return this.f87717s.a((a) null, this);
        }
    }

    public v(h hVar, Sy.a aVar, C12314a aVar2) {
        C17542s.j(hVar, "scanAndGoProductRepository");
        C17542s.j(aVar, "scanAndGoAnalytics");
        C17542s.j(aVar2, "productDetailsAnalytics");
        this.f87690a = hVar;
        this.f87691b = aVar;
        this.f87692c = aVar2;
    }

    private final void b(a aVar) {
        this.f87691b.s(aVar.a(), aVar.f().b(), aVar.f() == O.MANUAL_INPUT ? Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY : Interaction$Component.SHOP_AND_GO_SCANNER, a.d.SERVER);
    }

    private final void c(a aVar, I i10) {
        this.f87692c.c(i10, aVar.h(), aVar.f(), aVar.g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(Tj.v.a r14, dI.C17164e<? super rz.I> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Tj.v.b
            if (r0 == 0) goto L_0x0014
            r0 = r15
            Tj.v$b r0 = (Tj.v.b) r0
            int r1 = r0.f87718t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f87718t = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            Tj.v$b r0 = new Tj.v$b
            r0.<init>(r13, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r10.f87716r
            java.lang.Object r11 = eI.C17187b.f()
            int r1 = r10.f87718t
            r2 = 1
            if (r1 == 0) goto L_0x0065
            if (r1 != r2) goto L_0x005d
            java.lang.Object r14 = r10.f87712n
            Sy.a$b r14 = (Sy.a.b) r14
            java.lang.Object r14 = r10.f87711m
            rz.O r14 = (rz.O) r14
            java.lang.Object r14 = r10.f87710l
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r10.f87709k
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r10.f87708j
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r10.f87707i
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r10.f87706h
            Ry.h r14 = (Ry.h) r14
            java.lang.Object r14 = r10.f87705g
            Tj.v r14 = (Tj.v) r14
            java.lang.Object r14 = r10.f87704f
            Tj.v r14 = (Tj.v) r14
            java.lang.Object r14 = r10.f87703e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r10.f87702d
            Tj.v$a r14 = (Tj.v.a) r14
            java.lang.Object r15 = r10.f87701c
            Tj.v r15 = (Tj.v) r15
            XH.y.b(r0)     // Catch:{ all -> 0x005b }
            goto L_0x00b6
        L_0x005b:
            r0 = move-exception
            goto L_0x00bf
        L_0x005d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0065:
            XH.y.b(r0)
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x00bd }
            Ry.h r1 = r13.f87690a     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r14.h()     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = r14.a()     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = r14.c()     // Catch:{ all -> 0x00bd }
            int r4 = r14.e()     // Catch:{ all -> 0x00bd }
            java.lang.String r6 = r14.d()     // Catch:{ all -> 0x00bd }
            rz.O r7 = r14.f()     // Catch:{ all -> 0x00bd }
            Sy.a$b r8 = r14.g()     // Catch:{ all -> 0x00bd }
            boolean r9 = r14.b()     // Catch:{ all -> 0x00bd }
            r12 = 0
            r10.f87701c = r13     // Catch:{ all -> 0x00bd }
            r10.f87702d = r14     // Catch:{ all -> 0x00bd }
            r10.f87703e = r15     // Catch:{ all -> 0x00bd }
            r10.f87704f = r13     // Catch:{ all -> 0x00bd }
            r10.f87705g = r13     // Catch:{ all -> 0x00bd }
            r10.f87706h = r1     // Catch:{ all -> 0x00bd }
            r10.f87707i = r0     // Catch:{ all -> 0x00bd }
            r10.f87708j = r3     // Catch:{ all -> 0x00bd }
            r10.f87709k = r5     // Catch:{ all -> 0x00bd }
            r10.f87710l = r6     // Catch:{ all -> 0x00bd }
            r10.f87711m = r7     // Catch:{ all -> 0x00bd }
            r10.f87712n = r8     // Catch:{ all -> 0x00bd }
            r10.f87713o = r12     // Catch:{ all -> 0x00bd }
            r10.f87714p = r4     // Catch:{ all -> 0x00bd }
            r10.f87715q = r9     // Catch:{ all -> 0x00bd }
            r10.f87718t = r2     // Catch:{ all -> 0x00bd }
            r2 = r0
            java.lang.Object r0 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00bd }
            if (r0 != r11) goto L_0x00b5
            return r11
        L_0x00b5:
            r15 = r13
        L_0x00b6:
            rz.I r0 = (rz.I) r0     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ all -> 0x005b }
            goto L_0x00c9
        L_0x00bd:
            r0 = move-exception
            r15 = r13
        L_0x00bf:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x00c9:
            boolean r1 = XH.x.h(r0)
            if (r1 == 0) goto L_0x00d5
            r1 = r0
            rz.I r1 = (rz.I) r1
            r15.c(r14, r1)
        L_0x00d5:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 == 0) goto L_0x00de
            r15.b(r14)
        L_0x00de:
            XH.y.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.v.a(Tj.v$a, dI.e):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b\u001b\u0010'¨\u0006("}, d2 = {"LTj/v$a;", "", "", "storeId", "barcode", "productType", "ptagSize", "Lrz/O;", "scanType", "", "quantity", "LSy/a$b;", "specialType", "", "overrideWithItemNoWhenPersisting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrz/O;ILSy/a$b;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "c", "d", "e", "Lrz/O;", "f", "()Lrz/O;", "I", "g", "LSy/a$b;", "()LSy/a$b;", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f87693a;

        /* renamed from: b  reason: collision with root package name */
        private final String f87694b;

        /* renamed from: c  reason: collision with root package name */
        private final String f87695c;

        /* renamed from: d  reason: collision with root package name */
        private final String f87696d;

        /* renamed from: e  reason: collision with root package name */
        private final O f87697e;

        /* renamed from: f  reason: collision with root package name */
        private final int f87698f;

        /* renamed from: g  reason: collision with root package name */
        private final a.b f87699g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f87700h;

        public a(String str, String str2, String str3, String str4, O o10, int i10, a.b bVar, boolean z10) {
            C17542s.j(str, "storeId");
            C17542s.j(str2, "barcode");
            C17542s.j(str3, "productType");
            C17542s.j(o10, "scanType");
            this.f87693a = str;
            this.f87694b = str2;
            this.f87695c = str3;
            this.f87696d = str4;
            this.f87697e = o10;
            this.f87698f = i10;
            this.f87699g = bVar;
            this.f87700h = z10;
        }

        public final String a() {
            return this.f87694b;
        }

        public final boolean b() {
            return this.f87700h;
        }

        public final String c() {
            return this.f87695c;
        }

        public final String d() {
            return this.f87696d;
        }

        public final int e() {
            return this.f87698f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f87693a, aVar.f87693a) && C17542s.e(this.f87694b, aVar.f87694b) && C17542s.e(this.f87695c, aVar.f87695c) && C17542s.e(this.f87696d, aVar.f87696d) && this.f87697e == aVar.f87697e && this.f87698f == aVar.f87698f && this.f87699g == aVar.f87699g && this.f87700h == aVar.f87700h;
        }

        public final O f() {
            return this.f87697e;
        }

        public final a.b g() {
            return this.f87699g;
        }

        public final String h() {
            return this.f87693a;
        }

        public int hashCode() {
            int hashCode = ((((this.f87693a.hashCode() * 31) + this.f87694b.hashCode()) * 31) + this.f87695c.hashCode()) * 31;
            String str = this.f87696d;
            int i10 = 0;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f87697e.hashCode()) * 31) + Integer.hashCode(this.f87698f)) * 31;
            a.b bVar = this.f87699g;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f87700h);
        }

        public String toString() {
            String str = this.f87693a;
            String str2 = this.f87694b;
            String str3 = this.f87695c;
            String str4 = this.f87696d;
            O o10 = this.f87697e;
            int i10 = this.f87698f;
            a.b bVar = this.f87699g;
            boolean z10 = this.f87700h;
            return "ScanItemParams(storeId=" + str + ", barcode=" + str2 + ", productType=" + str3 + ", ptagSize=" + str4 + ", scanType=" + o10 + ", quantity=" + i10 + ", specialType=" + bVar + ", overrideWithItemNoWhenPersisting=" + z10 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, rz.O r16, int r17, Sy.a.b r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r11 = this;
                r0 = r20
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0009
                r1 = 1
                r8 = r1
                goto L_0x000b
            L_0x0009:
                r8 = r17
            L_0x000b:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0012
                r0 = 0
                r10 = r0
                goto L_0x0014
            L_0x0012:
                r10 = r19
            L_0x0014:
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r9 = r18
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tj.v.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, rz.O, int, Sy.a$b, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
