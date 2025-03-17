package Tj;

import FB.C12860a;
import Op.h1;
import XH.x;
import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.PackageDetailsItem;
import com.ingka.ikea.core.model.product.PackageInformation;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import pp.C11767a;
import sz.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LTj/n;", "", "LFB/a;", "localStoreSelectionRepository", "Lsz/c;", "scanAndGoCombinationProductRepository", "LAx/b;", "productDetailsRepository", "LTj/y;", "productLargeResultMapper", "LTj/x;", "productCombinationResultMapper", "<init>", "(LFB/a;Lsz/c;LAx/b;LTj/y;LTj/x;)V", "", "itemNo", "", "isCombination", "Lpp/a;", "cacheStrategy", "LXH/x;", "LTj/n$a;", "a", "(Ljava/lang/String;ZLpp/a;LdI/e;)Ljava/lang/Object;", "LFB/a;", "b", "Lsz/c;", "c", "LAx/b;", "d", "LTj/y;", "e", "LTj/x;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f87639a;

    /* renamed from: b  reason: collision with root package name */
    private final c f87640b;

    /* renamed from: c  reason: collision with root package name */
    private final Ax.b f87641c;

    /* renamed from: d  reason: collision with root package name */
    private final y f87642d;

    /* renamed from: e  reason: collision with root package name */
    private final x f87643e;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"LTj/n$a;", "", "", "itemNo", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "moreInfo", "", "Lcom/ingka/ikea/core/model/product/PackageInformation;", "productMeasurements", "Lcom/ingka/ikea/core/model/product/PackageDetailsItem;", "packageDetailsItems", "LOp/h1;", "sections", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/product/MoreInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "()Lcom/ingka/ikea/core/model/product/MoreInfo;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f87644a;

        /* renamed from: b  reason: collision with root package name */
        private final MoreInfo f87645b;

        /* renamed from: c  reason: collision with root package name */
        private final List<PackageInformation> f87646c;

        /* renamed from: d  reason: collision with root package name */
        private final List<PackageDetailsItem> f87647d;

        /* renamed from: e  reason: collision with root package name */
        private final List<h1> f87648e;

        public a(String str, MoreInfo moreInfo, List<PackageInformation> list, List<PackageDetailsItem> list2, List<? extends h1> list3) {
            C17542s.j(str, "itemNo");
            C17542s.j(moreInfo, "moreInfo");
            C17542s.j(list3, "sections");
            this.f87644a = str;
            this.f87645b = moreInfo;
            this.f87646c = list;
            this.f87647d = list2;
            this.f87648e = list3;
        }

        public final String a() {
            return this.f87644a;
        }

        public final MoreInfo b() {
            return this.f87645b;
        }

        public final List<PackageDetailsItem> c() {
            return this.f87647d;
        }

        public final List<PackageInformation> d() {
            return this.f87646c;
        }

        public final List<h1> e() {
            return this.f87648e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f87644a, aVar.f87644a) && C17542s.e(this.f87645b, aVar.f87645b) && C17542s.e(this.f87646c, aVar.f87646c) && C17542s.e(this.f87647d, aVar.f87647d) && C17542s.e(this.f87648e, aVar.f87648e);
        }

        public int hashCode() {
            int hashCode = ((this.f87644a.hashCode() * 31) + this.f87645b.hashCode()) * 31;
            List<PackageInformation> list = this.f87646c;
            int i10 = 0;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<PackageDetailsItem> list2 = this.f87647d;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.f87648e.hashCode();
        }

        public String toString() {
            String str = this.f87644a;
            MoreInfo moreInfo = this.f87645b;
            List<PackageInformation> list = this.f87646c;
            List<PackageDetailsItem> list2 = this.f87647d;
            List<h1> list3 = this.f87648e;
            return "UseCaseResult(itemNo=" + str + ", moreInfo=" + moreInfo + ", productMeasurements=" + list + ", packageDetailsItems=" + list2 + ", sections=" + list3 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.GetProductDetailsUseCase", f = "GetProductDetailsUseCase.kt", l = {36, 41, 49}, m = "invoke-BWLJW6A")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87649c;

        /* renamed from: d  reason: collision with root package name */
        Object f87650d;

        /* renamed from: e  reason: collision with root package name */
        Object f87651e;

        /* renamed from: f  reason: collision with root package name */
        Object f87652f;

        /* renamed from: g  reason: collision with root package name */
        Object f87653g;

        /* renamed from: h  reason: collision with root package name */
        Object f87654h;

        /* renamed from: i  reason: collision with root package name */
        Object f87655i;

        /* renamed from: j  reason: collision with root package name */
        Object f87656j;

        /* renamed from: k  reason: collision with root package name */
        Object f87657k;

        /* renamed from: l  reason: collision with root package name */
        Object f87658l;

        /* renamed from: m  reason: collision with root package name */
        boolean f87659m;

        /* renamed from: n  reason: collision with root package name */
        int f87660n;

        /* renamed from: o  reason: collision with root package name */
        int f87661o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f87662p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ n f87663q;

        /* renamed from: r  reason: collision with root package name */
        int f87664r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f87663q = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87662p = obj;
            this.f87664r |= Integer.MIN_VALUE;
            Object a10 = this.f87663q.a((String) null, false, (C11767a) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public n(C12860a aVar, c cVar, Ax.b bVar, y yVar, x xVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(cVar, "scanAndGoCombinationProductRepository");
        C17542s.j(bVar, "productDetailsRepository");
        C17542s.j(yVar, "productLargeResultMapper");
        C17542s.j(xVar, "productCombinationResultMapper");
        this.f87639a = aVar;
        this.f87640b = cVar;
        this.f87641c = bVar;
        this.f87642d = yVar;
        this.f87643e = xVar;
    }

    public static /* synthetic */ Object b(n nVar, String str, boolean z10, C11767a aVar, C17164e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = C11767a.NETWORK;
        }
        return nVar.a(str, z10, aVar, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f5 A[Catch:{ CancellationException -> 0x0059, all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125 A[Catch:{ CancellationException -> 0x0059, all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r18, boolean r19, pp.C11767a r20, dI.C17164e<? super XH.x<Tj.n.a>> r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            boolean r5 = r4 instanceof Tj.n.b
            if (r5 == 0) goto L_0x001d
            r5 = r4
            Tj.n$b r5 = (Tj.n.b) r5
            int r6 = r5.f87664r
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f87664r = r6
            goto L_0x0022
        L_0x001d:
            Tj.n$b r5 = new Tj.n$b
            r5.<init>(r1, r4)
        L_0x0022:
            java.lang.Object r6 = r5.f87662p
            java.lang.Object r7 = eI.C17187b.f()
            int r8 = r5.f87664r
            r9 = 3
            r10 = 2
            r11 = 1
            if (r8 == 0) goto L_0x00bc
            if (r8 == r11) goto L_0x0091
            if (r8 == r10) goto L_0x0064
            if (r8 != r9) goto L_0x005c
            java.lang.Object r0 = r5.f87655i
            Tj.y r0 = (Tj.y) r0
            java.lang.Object r2 = r5.f87654h
            Tj.n r2 = (Tj.n) r2
            java.lang.Object r2 = r5.f87653g
            Tj.n r2 = (Tj.n) r2
            java.lang.Object r2 = r5.f87652f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r5.f87651e
            pp.a r2 = (pp.C11767a) r2
            java.lang.Object r2 = r5.f87650d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r5.f87649c
            Tj.n r2 = (Tj.n) r2
            XH.y.b(r6)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            goto L_0x014f
        L_0x0056:
            r0 = move-exception
            goto L_0x015e
        L_0x0059:
            r0 = move-exception
            goto L_0x0169
        L_0x005c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0064:
            java.lang.Object r0 = r5.f87658l
            Tj.x r0 = (Tj.x) r0
            java.lang.Object r2 = r5.f87657k
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r5.f87656j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r5.f87655i
            EB.d r2 = (EB.C12832d) r2
            java.lang.Object r2 = r5.f87654h
            Tj.n r2 = (Tj.n) r2
            java.lang.Object r2 = r5.f87653g
            Tj.n r2 = (Tj.n) r2
            java.lang.Object r2 = r5.f87652f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r5.f87651e
            pp.a r2 = (pp.C11767a) r2
            java.lang.Object r2 = r5.f87650d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r5.f87649c
            Tj.n r2 = (Tj.n) r2
            XH.y.b(r6)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            goto L_0x011e
        L_0x0091:
            int r0 = r5.f87661o
            int r2 = r5.f87660n
            boolean r3 = r5.f87659m
            java.lang.Object r4 = r5.f87654h
            Tj.n r4 = (Tj.n) r4
            java.lang.Object r8 = r5.f87653g
            Tj.n r8 = (Tj.n) r8
            java.lang.Object r9 = r5.f87652f
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r11 = r5.f87651e
            pp.a r11 = (pp.C11767a) r11
            java.lang.Object r12 = r5.f87650d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r5.f87649c
            Tj.n r13 = (Tj.n) r13
            XH.y.b(r6)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r16 = r6
            r6 = r2
            r2 = r3
            r3 = r4
            r4 = r9
            r9 = r8
            r8 = r16
            goto L_0x00eb
        L_0x00bc:
            XH.y.b(r6)
            XH.x$a r6 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r6 = 0
            if (r2 == 0) goto L_0x012d
            FB.a r8 = r1.f87639a     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            TJ.g r8 = r8.b()     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87649c = r1     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87650d = r0     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87651e = r3     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87652f = r4     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87653g = r1     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87654h = r1     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87659m = r2     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87660n = r6     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87661o = r6     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87664r = r11     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            java.lang.Object r8 = TJ.C16534i.D(r8, r5)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            if (r8 != r7) goto L_0x00e5
            return r7
        L_0x00e5:
            r12 = r0
            r9 = r1
            r13 = r9
            r11 = r3
            r0 = r6
            r3 = r13
        L_0x00eb:
            EB.d r8 = (EB.C12832d) r8     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            if (r8 == 0) goto L_0x0125
            java.lang.String r14 = r8.e()     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            if (r14 == 0) goto L_0x0125
            Tj.x r15 = r3.f87643e     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            sz.c r10 = r3.f87640b     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87649c = r13     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87650d = r12     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87651e = r11     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87652f = r4     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87653g = r9     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87654h = r3     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87655i = r8     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87656j = r14     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87657k = r14     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87658l = r15     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87659m = r2     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87660n = r6     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87661o = r0     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r0 = 2
            r5.f87664r = r0     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            java.lang.Object r6 = r10.a(r14, r12, r11, r5)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            if (r6 != r7) goto L_0x011d
            return r7
        L_0x011d:
            r0 = r15
        L_0x011e:
            rz.l r6 = (rz.C15019l) r6     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            Tj.n$a r0 = r0.a(r6)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            goto L_0x0159
        L_0x0125:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            java.lang.String r2 = "Store not selected."
            r0.<init>(r2)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            throw r0     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
        L_0x012d:
            Tj.y r8 = r1.f87642d     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            Ax.b r10 = r1.f87641c     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87649c = r1     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87650d = r0     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87651e = r3     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87652f = r4     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87653g = r1     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87654h = r1     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87655i = r8     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87659m = r2     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87660n = r6     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87661o = r6     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            r5.f87664r = r9     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            java.lang.Object r6 = r10.a(r0, r3, r5)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            if (r6 != r7) goto L_0x014e
            return r7
        L_0x014e:
            r0 = r8
        L_0x014f:
            op.j r6 = (op.C11699j) r6     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            com.ingka.ikea.core.model.product.ProductLarge r2 = r6.a()     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            Tj.n$a r0 = r0.a(r2)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
        L_0x0159:
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0059, all -> 0x0056 }
            goto L_0x0168
        L_0x015e:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0168:
            return r0
        L_0x0169:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.n.a(java.lang.String, boolean, pp.a, dI.e):java.lang.Object");
    }
}
