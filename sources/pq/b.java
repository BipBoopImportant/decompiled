package Pq;

import Qq.i;
import Qq.l;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006H@¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"LPq/b;", "LPq/a;", "<init>", "()V", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;", "rewards", "LXH/N;", "e", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;LdI/e;)Ljava/lang/Object;", "LQq/l;", "faq", "g", "(LQq/l;LdI/e;)Ljava/lang/Object;", "LQq/i;", "rewardInteractions", "h", "(LQq/i;LdI/e;)Ljava/lang/Object;", "a", "(LdI/e;)Ljava/lang/Object;", "LTJ/B;", "LTJ/B;", "_rewards", "LTJ/g;", "b", "LTJ/g;", "d", "()LTJ/g;", "c", "_faq", "i", "_rewardInteractions", "f", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C16505B<FamilyCustomerRewardRemote> f85685a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<FamilyCustomerRewardRemote> f85686b;

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<l> f85687c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<l> f85688d;

    /* renamed from: e  reason: collision with root package name */
    private final C16505B<i> f85689e;

    /* renamed from: f  reason: collision with root package name */
    private final C16532g<i> f85690f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.familyrewards.datalayer.impl.source.FamilyRewardsLocalCacheImpl", f = "FamilyRewardsLocalCache.kt", l = {49, 50, 51}, m = "clear")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f85691c;

        /* renamed from: d  reason: collision with root package name */
        Object f85692d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f85693e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f85694f;

        /* renamed from: g  reason: collision with root package name */
        int f85695g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f85694f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f85693e = obj;
            this.f85695g |= Integer.MIN_VALUE;
            return this.f85694f.a(this);
        }
    }

    public b() {
        C16505B<FamilyCustomerRewardRemote> a10 = C16521S.a(null);
        this.f85685a = a10;
        this.f85686b = C16534i.c(a10);
        C16505B<l> a11 = C16521S.a(null);
        this.f85687c = a11;
        this.f85688d = C16534i.c(a11);
        C16505B<i> a12 = C16521S.a(null);
        this.f85689e = a12;
        this.f85690f = C16534i.c(a12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.C16807N> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof Pq.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Pq.b$a r0 = (Pq.b.a) r0
            int r1 = r0.f85695g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f85695g = r1
            goto L_0x0018
        L_0x0013:
            Pq.b$a r0 = new Pq.b$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f85693e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f85695g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x0058
            if (r3 == r6) goto L_0x004c
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r9 = r0.f85692d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f85691c
            Pq.b r9 = (Pq.b) r9
            XH.y.b(r1)
            goto L_0x0089
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0040:
            java.lang.Object r9 = r0.f85692d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r3 = r0.f85691c
            Pq.b r3 = (Pq.b) r3
            XH.y.b(r1)
            goto L_0x007a
        L_0x004c:
            java.lang.Object r9 = r0.f85692d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r3 = r0.f85691c
            Pq.b r3 = (Pq.b) r3
            XH.y.b(r1)
            goto L_0x006b
        L_0x0058:
            XH.y.b(r1)
            TJ.B<com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote> r1 = r8.f85685a
            r0.f85691c = r8
            r0.f85692d = r9
            r0.f85695g = r6
            java.lang.Object r1 = r1.emit(r7, r0)
            if (r1 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r3 = r8
        L_0x006b:
            TJ.B<Qq.l> r1 = r3.f85687c
            r0.f85691c = r3
            r0.f85692d = r9
            r0.f85695g = r5
            java.lang.Object r1 = r1.emit(r7, r0)
            if (r1 != r2) goto L_0x007a
            return r2
        L_0x007a:
            TJ.B<Qq.i> r1 = r3.f85689e
            r0.f85691c = r3
            r0.f85692d = r9
            r0.f85695g = r4
            java.lang.Object r9 = r1.emit(r7, r0)
            if (r9 != r2) goto L_0x0089
            return r2
        L_0x0089:
            XH.N r9 = XH.C16807N.f139792a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.b.a(dI.e):java.lang.Object");
    }

    public C16532g<FamilyCustomerRewardRemote> d() {
        return this.f85686b;
    }

    public Object e(FamilyCustomerRewardRemote familyCustomerRewardRemote, C17164e<? super C16807N> eVar) {
        Object emit = this.f85685a.emit(familyCustomerRewardRemote, eVar);
        return emit == C17187b.f() ? emit : C16807N.f139792a;
    }

    public C16532g<i> f() {
        return this.f85690f;
    }

    public Object g(l lVar, C17164e<? super C16807N> eVar) {
        Object emit = this.f85687c.emit(lVar, eVar);
        return emit == C17187b.f() ? emit : C16807N.f139792a;
    }

    public Object h(i iVar, C17164e<? super C16807N> eVar) {
        Object emit = this.f85689e.emit(iVar, eVar);
        return emit == C17187b.f() ? emit : C16807N.f139792a;
    }

    public C16532g<l> i() {
        return this.f85688d;
    }
}
