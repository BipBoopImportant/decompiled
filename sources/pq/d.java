package Pq;

import Jq.c;
import XH.x;
import am.i;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0016\u0010\fJ\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"LPq/d;", "LPq/c;", "LMq/a;", "endpoint", "LNq/b;", "mapper", "Lam/i;", "timeZoneProvider", "<init>", "(LMq/a;LNq/b;Lam/i;)V", "LQq/o;", "c", "(LdI/e;)Ljava/lang/Object;", "LJq/c$a;", "scope", "LXH/x;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;", "a", "(LJq/c$a;LdI/e;)Ljava/lang/Object;", "LQq/l;", "f", "LQq/i;", "d", "", "id", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "purchaseValue", "", "b", "(DLdI/e;)Ljava/lang/Object;", "LMq/a;", "LNq/b;", "Lam/i;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Mq.a f85696a;

    /* renamed from: b  reason: collision with root package name */
    private final Nq.b f85697b;

    /* renamed from: c  reason: collision with root package name */
    private final i f85698c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85699a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.CART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f85699a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.source.FamilyRewardsRemoteSourceImpl", f = "FamilyRewardsRemoteSource.kt", l = {86}, m = "claimFamilyReward-gIAlu-s")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85700c;

        /* renamed from: d  reason: collision with root package name */
        Object f85701d;

        /* renamed from: e  reason: collision with root package name */
        Object f85702e;

        /* renamed from: f  reason: collision with root package name */
        Object f85703f;

        /* renamed from: g  reason: collision with root package name */
        Object f85704g;

        /* renamed from: h  reason: collision with root package name */
        Object f85705h;

        /* renamed from: i  reason: collision with root package name */
        int f85706i;

        /* renamed from: j  reason: collision with root package name */
        int f85707j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f85708k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ d f85709l;

        /* renamed from: m  reason: collision with root package name */
        int f85710m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f85709l = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85708k = obj;
            this.f85710m |= Integer.MIN_VALUE;
            Object e10 = this.f85709l.e((String) null, this);
            return e10 == C17187b.f() ? e10 : x.a(e10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.source.FamilyRewardsRemoteSourceImpl", f = "FamilyRewardsRemoteSource.kt", l = {100}, m = "fetchEstimatedFamilyRewards-gIAlu-s")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85711c;

        /* renamed from: d  reason: collision with root package name */
        Object f85712d;

        /* renamed from: e  reason: collision with root package name */
        Object f85713e;

        /* renamed from: f  reason: collision with root package name */
        Object f85714f;

        /* renamed from: g  reason: collision with root package name */
        double f85715g;

        /* renamed from: h  reason: collision with root package name */
        int f85716h;

        /* renamed from: i  reason: collision with root package name */
        int f85717i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f85718j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d f85719k;

        /* renamed from: l  reason: collision with root package name */
        int f85720l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f85719k = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85718j = obj;
            this.f85720l |= Integer.MIN_VALUE;
            Object b10 = this.f85719k.b(0.0d, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.source.FamilyRewardsRemoteSourceImpl", f = "FamilyRewardsRemoteSource.kt", l = {80}, m = "fetchFamilyRewardInteractions")
    /* renamed from: Pq.d$d  reason: collision with other inner class name */
    static final class C1736d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85721c;

        /* renamed from: d  reason: collision with root package name */
        Object f85722d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f85723e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f85724f;

        /* renamed from: g  reason: collision with root package name */
        int f85725g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1736d(d dVar, C17164e<? super C1736d> eVar) {
            super(eVar);
            this.f85724f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85723e = obj;
            this.f85725g |= Integer.MIN_VALUE;
            return this.f85724f.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.source.FamilyRewardsRemoteSourceImpl", f = "FamilyRewardsRemoteSource.kt", l = {68}, m = "fetchFamilyRewards-gIAlu-s")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85726c;

        /* renamed from: d  reason: collision with root package name */
        Object f85727d;

        /* renamed from: e  reason: collision with root package name */
        Object f85728e;

        /* renamed from: f  reason: collision with root package name */
        Object f85729f;

        /* renamed from: g  reason: collision with root package name */
        Object f85730g;

        /* renamed from: h  reason: collision with root package name */
        Object f85731h;

        /* renamed from: i  reason: collision with root package name */
        int f85732i;

        /* renamed from: j  reason: collision with root package name */
        int f85733j;

        /* renamed from: k  reason: collision with root package name */
        int f85734k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f85735l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f85736m;

        /* renamed from: n  reason: collision with root package name */
        int f85737n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f85736m = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85735l = obj;
            this.f85737n |= Integer.MIN_VALUE;
            Object a10 = this.f85736m.a((c.a) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.source.FamilyRewardsRemoteSourceImpl", f = "FamilyRewardsRemoteSource.kt", l = {77}, m = "fetchFamilyRewardsFAQ")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85738c;

        /* renamed from: d  reason: collision with root package name */
        Object f85739d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f85740e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f85741f;

        /* renamed from: g  reason: collision with root package name */
        int f85742g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f85741f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85740e = obj;
            this.f85742g |= Integer.MIN_VALUE;
            return this.f85741f.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.source.FamilyRewardsRemoteSourceImpl", f = "FamilyRewardsRemoteSource.kt", l = {62}, m = "fetchFamilyRewardsHistory")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f85743c;

        /* renamed from: d  reason: collision with root package name */
        Object f85744d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f85745e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f85746f;

        /* renamed from: g  reason: collision with root package name */
        int f85747g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f85746f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85745e = obj;
            this.f85747g |= Integer.MIN_VALUE;
            return this.f85746f.c(this);
        }
    }

    public d(Mq.a aVar, Nq.b bVar, i iVar) {
        C17542s.j(aVar, "endpoint");
        C17542s.j(bVar, "mapper");
        C17542s.j(iVar, "timeZoneProvider");
        this.f85696a = aVar;
        this.f85697b = bVar;
        this.f85698c = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(Jq.c.a r9, dI.C17164e<? super XH.x<com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Pq.d.e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Pq.d$e r0 = (Pq.d.e) r0
            int r1 = r0.f85737n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85737n = r1
            goto L_0x0018
        L_0x0013:
            Pq.d$e r0 = new Pq.d$e
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f85735l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85737n
            r4 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r9 = r0.f85731h
            Jq.c$a r9 = (Jq.c.a) r9
            java.lang.Object r9 = r0.f85730g
            Pq.d r9 = (Pq.d) r9
            java.lang.Object r9 = r0.f85729f
            Pq.d r9 = (Pq.d) r9
            java.lang.Object r9 = r0.f85728e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f85727d
            Jq.c$a r9 = (Jq.c.a) r9
            java.lang.Object r9 = r0.f85726c
            Pq.d r9 = (Pq.d) r9
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            goto L_0x009a
        L_0x0041:
            r9 = move-exception
            goto L_0x00a1
        L_0x0043:
            r9 = move-exception
            goto L_0x00ac
        L_0x0045:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004d:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            Mq.a r1 = r8.f85696a     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            am.i r3 = r8.f85698c     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.util.TimeZone r3 = r3.a()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.String r3 = r3.getID()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.String r5 = "getID(...)"
            kotlin.jvm.internal.C17542s.i(r3, r5)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r5 = -1
            if (r9 != 0) goto L_0x0068
            r6 = r5
            goto L_0x0070
        L_0x0068:
            int[] r6 = Pq.d.a.f85699a     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            int r7 = r9.ordinal()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r6 = r6[r7]     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
        L_0x0070:
            if (r6 == r5) goto L_0x007d
            if (r6 != r4) goto L_0x0077
            java.lang.String r5 = "cart"
            goto L_0x007e
        L_0x0077:
            XH.t r9 = new XH.t     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r9.<init>()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            throw r9     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
        L_0x007d:
            r5 = 0
        L_0x007e:
            r0.f85726c = r8     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85727d = r9     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85728e = r10     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85729f = r8     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85730g = r8     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85731h = r9     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r9 = 0
            r0.f85732i = r9     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85733j = r9     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85734k = r6     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85737n = r4     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r1 = r1.d(r3, r5, r0)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r1 != r2) goto L_0x009a
            return r2
        L_0x009a:
            com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r1     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r9 = XH.x.b(r1)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            goto L_0x00ab
        L_0x00a1:
            XH.x$a r10 = XH.x.f139812b
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
        L_0x00ab:
            return r9
        L_0x00ac:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.d.a(Jq.c$a, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f A[Catch:{ CancellationException -> 0x003d, all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d A[Catch:{ CancellationException -> 0x003d, all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(double r13, dI.C17164e<? super XH.x<java.lang.Integer>> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof Pq.d.c
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Pq.d$c r0 = (Pq.d.c) r0
            int r1 = r0.f85720l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85720l = r1
            goto L_0x0018
        L_0x0013:
            Pq.d$c r0 = new Pq.d$c
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f85718j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85720l
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 != r5) goto L_0x0040
            java.lang.Object r13 = r0.f85714f
            Pq.d r13 = (Pq.d) r13
            java.lang.Object r14 = r0.f85713e
            Pq.d r14 = (Pq.d) r14
            java.lang.Object r14 = r0.f85712d
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f85711c
            Pq.d r14 = (Pq.d) r14
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            goto L_0x0067
        L_0x003a:
            r13 = move-exception
            goto L_0x0128
        L_0x003d:
            r13 = move-exception
            goto L_0x0133
        L_0x0040:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0048:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            Mq.a r1 = r12.f85696a     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f85711c = r12     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f85712d = r15     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f85713e = r12     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f85714f = r12     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f85715g = r13     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f85716h = r4     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f85717i = r4     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r0.f85720l = r5     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.Object r1 = r1.a(r13, r0)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r1 != r2) goto L_0x0066
            return r2
        L_0x0066:
            r13 = r12
        L_0x0067:
            com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardEstimatedPointsRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardEstimatedPointsRemote) r1     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.Integer r14 = r1.a()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r14 == 0) goto L_0x007d
            int r13 = r14.intValue()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.e(r13)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.Object r13 = XH.x.b(r13)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            goto L_0x0132
        L_0x007d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r15 = "Points should not be null"
            r14.<init>(r15)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            qv.e r15 = qv.e.ERROR     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            qv.d r0 = qv.d.f102012a     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.util.List r0 = r0.a()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r1.<init>()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x0097:
            boolean r2 = r0.hasNext()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r2 = r0.next()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r3 = r2
            qv.b r3 = (qv.C11819b) r3     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            boolean r3 = r3.b(r15, r4)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r3 == 0) goto L_0x0097
            r1.add(r2)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            goto L_0x0097
        L_0x00ae:
            java.util.Iterator r0 = r1.iterator()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x00b5:
            boolean r4 = r0.hasNext()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r4 == 0) goto L_0x0127
            java.lang.Object r4 = r0.next()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r6 = r4
            qv.b r6 = (qv.C11819b) r6     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r2 != 0) goto L_0x00ce
            java.lang.String r2 = qv.C11818a.a(r1, r14)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r2 == 0) goto L_0x0127
            java.lang.String r2 = qv.C11820c.a(r2)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x00ce:
            if (r3 != 0) goto L_0x011e
            java.lang.Class r3 = r13.getClass()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r3 = r3.getName()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r4 = 36
            r7 = 2
            java.lang.String r4 = HJ.C15854t.s1(r3, r4, r1, r7, r1)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r8 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r8, r1, r7, r1)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            int r7 = r4.length()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r7 != 0) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r4, r3)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x00f5:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r4 = r4.getName()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r7 = "main"
            boolean r4 = HJ.C15854t.b0(r4, r7, r5)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            if (r4 == 0) goto L_0x0108
            java.lang.String r4 = "m"
            goto L_0x010a
        L_0x0108:
            java.lang.String r4 = "b"
        L_0x010a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r7.<init>()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r7.append(r4)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r4 = "|"
            r7.append(r4)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            r7.append(r3)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            java.lang.String r3 = r7.toString()     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x011e:
            r9 = 0
            r7 = r15
            r8 = r3
            r10 = r14
            r11 = r2
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
            goto L_0x00b5
        L_0x0127:
            throw r14     // Catch:{ CancellationException -> 0x003d, all -> 0x003a }
        L_0x0128:
            XH.x$a r14 = XH.x.f139812b
            java.lang.Object r13 = XH.y.a(r13)
            java.lang.Object r13 = XH.x.b(r13)
        L_0x0132:
            return r13
        L_0x0133:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.d.b(double, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(dI.C17164e<? super Qq.o> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Pq.d.g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Pq.d$g r0 = (Pq.d.g) r0
            int r1 = r0.f85747g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85747g = r1
            goto L_0x0018
        L_0x0013:
            Pq.d$g r0 = new Pq.d$g
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f85745e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85747g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f85744d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f85743c
            Pq.d r6 = (Pq.d) r6
            XH.y.b(r1)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Mq.a r1 = r5.f85696a
            r0.f85743c = r5
            r0.f85744d = r6
            r0.f85747g = r4
            java.lang.Object r1 = r1.b(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardsHistoryRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardsHistoryRemote) r1
            Qq.o r6 = r1.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.d.c(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(dI.C17164e<? super Qq.i> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Pq.d.C1736d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Pq.d$d r0 = (Pq.d.C1736d) r0
            int r1 = r0.f85725g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85725g = r1
            goto L_0x0018
        L_0x0013:
            Pq.d$d r0 = new Pq.d$d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f85723e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85725g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f85722d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f85721c
            Pq.d r6 = (Pq.d) r6
            XH.y.b(r1)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Mq.a r1 = r5.f85696a
            r0.f85721c = r5
            r0.f85722d = r6
            r0.f85725g = r4
            java.lang.Object r1 = r1.f(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            r6 = r5
        L_0x004c:
            com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionsRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionsRemote) r1
            Nq.b r6 = r6.f85697b
            Qq.i r6 = r6.b(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.d.d(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(java.lang.String r7, dI.C17164e<? super XH.x<com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Pq.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Pq.d$b r0 = (Pq.d.b) r0
            int r1 = r0.f85710m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85710m = r1
            goto L_0x0018
        L_0x0013:
            Pq.d$b r0 = new Pq.d$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f85708k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85710m
            r4 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r7 = r0.f85705h
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f85704g
            Pq.d r7 = (Pq.d) r7
            java.lang.Object r7 = r0.f85703f
            Pq.d r7 = (Pq.d) r7
            java.lang.Object r7 = r0.f85702e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f85701d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f85700c
            Pq.d r8 = (Pq.d) r8
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            goto L_0x007d
        L_0x0041:
            r7 = move-exception
            goto L_0x009c
        L_0x0043:
            r7 = move-exception
            goto L_0x00a7
        L_0x0045:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x004d:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            Mq.a r1 = r6.f85696a     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            am.i r3 = r6.f85698c     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.util.TimeZone r3 = r3.a()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.String r3 = r3.getID()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.String r5 = "getID(...)"
            kotlin.jvm.internal.C17542s.i(r3, r5)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85700c = r6     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85701d = r7     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85702e = r8     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85703f = r6     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85704g = r6     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85705h = r3     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r8 = 0
            r0.f85706i = r8     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85707j = r8     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.f85710m = r4     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r1 = r1.c(r7, r3, r0)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r1 != r2) goto L_0x007d
            return r2
        L_0x007d:
            QL.x r1 = (QL.x) r1     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r8 = r1.a()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote r8 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote) r8     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            boolean r0 = r1.e()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r0 == 0) goto L_0x0092
            if (r8 == 0) goto L_0x0092
            java.lang.Object r7 = XH.x.b(r8)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            goto L_0x00a6
        L_0x0092:
            Jq.a r8 = new Jq.a     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            int r0 = r1.b()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r8.<init>(r7, r0)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            throw r8     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
        L_0x009c:
            XH.x$a r8 = XH.x.f139812b
            java.lang.Object r7 = XH.y.a(r7)
            java.lang.Object r7 = XH.x.b(r7)
        L_0x00a6:
            return r7
        L_0x00a7:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.d.e(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(dI.C17164e<? super Qq.l> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Pq.d.f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Pq.d$f r0 = (Pq.d.f) r0
            int r1 = r0.f85742g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85742g = r1
            goto L_0x0018
        L_0x0013:
            Pq.d$f r0 = new Pq.d$f
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f85740e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85742g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f85739d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f85738c
            Pq.d r6 = (Pq.d) r6
            XH.y.b(r1)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Mq.a r1 = r5.f85696a
            r0.f85738c = r5
            r0.f85739d = r6
            r0.f85742g = r4
            java.lang.Object r1 = r1.e(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardsFAQRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardsFAQRemote) r1
            Qq.l r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.d.f(dI.e):java.lang.Object");
    }
}
