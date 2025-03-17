package Kq;

import HJ.C15854t;
import Jq.c;
import Jq.d;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import bK.C17052a;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002;BB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0015\u001a\u00020\u0014*\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H@¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001a\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJS\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001a\"\u0004\b\u0000\u0010\u001920\b\u0001\u0010!\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001aH\u0016¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0 0\u001a2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b*\u0010+J-\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0 0\u001a2\u0006\u0010-\u001a\u00020,2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010 0\u001aH\u0016¢\u0006\u0004\b2\u0010&J\u001b\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030 0\u001aH\u0016¢\u0006\u0004\b4\u0010&J\u001a\u00105\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H@¢\u0006\u0004\b5\u00106J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u00108\u001a\u000207H@¢\u0006\u0004\b;\u0010<J\u001a\u0010>\u001a\u00020=2\b\u0010(\u001a\u0004\u0018\u00010'H@¢\u0006\u0004\b>\u00106J(\u0010@\u001a\b\u0012\u0004\u0012\u00020.092\u0006\u0010?\u001a\u00020,2\b\u0010(\u001a\u0004\u0018\u00010'H@¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0011H@¢\u0006\u0004\bB\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010GR\u0014\u0010I\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010HR\u0014\u0010J\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u0014\u0010K\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010H¨\u0006L"}, d2 = {"LKq/b;", "LJq/c;", "LPq/c;", "remoteSource", "LPq/a;", "localCache", "LJq/b;", "familyRewardsIntegration", "LNq/e;", "familyRewardsDataMapper", "LNq/c;", "familyRewardMapper", "<init>", "(LPq/c;LPq/a;LJq/b;LNq/e;LNq/c;)V", "LbK/a;", "Lkotlin/Function1;", "LdI/e;", "LXH/N;", "", "withLockAction", "", "v", "(LbK/a;LnI/l;LdI/e;)Ljava/lang/Object;", "s", "(LdI/e;)Ljava/lang/Object;", "T", "LTJ/g;", "LJq/d$d;", "t", "(LTJ/g;)LTJ/g;", "Lkotlin/Function2;", "LTJ/h;", "LJq/d;", "block", "u", "(LnI/p;)LTJ/g;", "LQq/o;", "i", "()LTJ/g;", "LJq/c$a;", "scope", "LQq/k;", "f", "(LJq/c$a;)LTJ/g;", "", "id", "LQq/g;", "g", "(Ljava/lang/String;LJq/c$a;)LTJ/g;", "LQq/l;", "h", "LQq/i;", "d", "c", "(LJq/c$a;LdI/e;)Ljava/lang/Object;", "", "purchaseValue", "LXH/x;", "", "b", "(DLdI/e;)Ljava/lang/Object;", "LKq/b$b;", "r", "rewardId", "e", "(Ljava/lang/String;LJq/c$a;LdI/e;)Ljava/lang/Object;", "a", "LPq/c;", "LPq/a;", "LJq/b;", "LNq/e;", "LNq/c;", "LbK/a;", "faqMutex", "rewardsMutex", "rewardInteractionsMutex", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Jq.c {

    /* renamed from: i  reason: collision with root package name */
    public static final a f82925i = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Pq.c f82926a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Pq.a f82927b;

    /* renamed from: c  reason: collision with root package name */
    private final Jq.b f82928c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Nq.e f82929d;

    /* renamed from: e  reason: collision with root package name */
    private final Nq.c f82930e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C17052a f82931f = bK.g.b(false, 1, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    private final C17052a f82932g = bK.g.b(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C17052a f82933h = bK.g.b(false, 1, (Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LKq/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LKq/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "NotEligible", "Success", "RequestInProgress", "Error", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kq.b$b  reason: collision with other inner class name */
    public enum C1648b {
        NotEligible,
        Success,
        RequestInProgress,
        Error;

        static {
            C1648b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl", f = "FamilyRewardsRepositoryImpl.kt", l = {175, 177, 180}, m = "claimFamilyReward-0E7RQCE")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f82934c;

        /* renamed from: d  reason: collision with root package name */
        Object f82935d;

        /* renamed from: e  reason: collision with root package name */
        Object f82936e;

        /* renamed from: f  reason: collision with root package name */
        Object f82937f;

        /* renamed from: g  reason: collision with root package name */
        Object f82938g;

        /* renamed from: h  reason: collision with root package name */
        Object f82939h;

        /* renamed from: i  reason: collision with root package name */
        int f82940i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f82941j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ b f82942k;

        /* renamed from: l  reason: collision with root package name */
        int f82943l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f82942k = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82941j = obj;
            this.f82943l |= Integer.MIN_VALUE;
            Object e10 = this.f82942k.e((String) null, (c.a) null, this);
            return e10 == C17187b.f() ? e10 : x.a(e10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl", f = "FamilyRewardsRepositoryImpl.kt", l = {145}, m = "fetchEstimatedFamilyRewards-gIAlu-s")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f82944c;

        /* renamed from: d  reason: collision with root package name */
        Object f82945d;

        /* renamed from: e  reason: collision with root package name */
        double f82946e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f82947f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f82948g;

        /* renamed from: h  reason: collision with root package name */
        int f82949h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f82948g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82947f = obj;
            this.f82949h |= Integer.MIN_VALUE;
            Object b10 = this.f82948g.b(0.0d, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "LJq/d;", "LQq/g;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardFlow$1", f = "FamilyRewardsRepositoryImpl.kt", l = {77, 80, 81, 83, 99}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super Jq.d<Qq.g>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82950c;

        /* renamed from: d  reason: collision with root package name */
        Object f82951d;

        /* renamed from: e  reason: collision with root package name */
        Object f82952e;

        /* renamed from: f  reason: collision with root package name */
        Object f82953f;

        /* renamed from: g  reason: collision with root package name */
        Object f82954g;

        /* renamed from: h  reason: collision with root package name */
        int f82955h;

        /* renamed from: i  reason: collision with root package name */
        int f82956i;

        /* renamed from: j  reason: collision with root package name */
        int f82957j;

        /* renamed from: k  reason: collision with root package name */
        int f82958k;

        /* renamed from: l  reason: collision with root package name */
        private /* synthetic */ Object f82959l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f82960m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c.a f82961n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f82962o;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements C16532g<Qq.k> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f82963a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Nq.e f82964b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Kq.b$e$a$a  reason: collision with other inner class name */
            public static final class C1649a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f82965a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Nq.e f82966b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardFlow$1$invokeSuspend$$inlined$map$1$2", f = "FamilyRewardsRepositoryImpl.kt", l = {50}, m = "emit")
                /* renamed from: Kq.b$e$a$a$a  reason: collision with other inner class name */
                public static final class C1650a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f82967c;

                    /* renamed from: d  reason: collision with root package name */
                    int f82968d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C1649a f82969e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C1650a(C1649a aVar, C17164e eVar) {
                        super(eVar);
                        this.f82969e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f82967c = obj;
                        this.f82968d |= Integer.MIN_VALUE;
                        return this.f82969e.emit((Object) null, this);
                    }
                }

                public C1649a(C16533h hVar, Nq.e eVar) {
                    this.f82965a = hVar;
                    this.f82966b = eVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof Kq.b.e.a.C1649a.C1650a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        Kq.b$e$a$a$a r0 = (Kq.b.e.a.C1649a.C1650a) r0
                        int r1 = r0.f82968d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f82968d = r1
                        goto L_0x0018
                    L_0x0013:
                        Kq.b$e$a$a$a r0 = new Kq.b$e$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f82967c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f82968d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x0047
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f82965a
                        com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r5 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r5
                        Nq.e r2 = r4.f82966b
                        Qq.k r5 = r2.a(r5)
                        r0.f82968d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Kq.b.e.a.C1649a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public a(C16532g gVar, Nq.e eVar) {
                this.f82963a = gVar;
                this.f82964b = eVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f82963a.collect(new C1649a(hVar, this.f82964b), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Kq.b$e$b  reason: collision with other inner class name */
        public static final class C1651b implements C16532g<Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f82970a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f82971b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Kq.b$e$b$a */
            public static final class a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f82972a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f82973b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardFlow$1$invokeSuspend$$inlined$map$2$2", f = "FamilyRewardsRepositoryImpl.kt", l = {50}, m = "emit")
                /* renamed from: Kq.b$e$b$a$a  reason: collision with other inner class name */
                public static final class C1652a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f82974c;

                    /* renamed from: d  reason: collision with root package name */
                    int f82975d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ a f82976e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C1652a(a aVar, C17164e eVar) {
                        super(eVar);
                        this.f82976e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f82974c = obj;
                        this.f82975d |= Integer.MIN_VALUE;
                        return this.f82976e.emit((Object) null, this);
                    }
                }

                public a(C16533h hVar, String str) {
                    this.f82972a = hVar;
                    this.f82973b = str;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof Kq.b.e.C1651b.a.C1652a
                        if (r0 == 0) goto L_0x0013
                        r0 = r10
                        Kq.b$e$b$a$a r0 = (Kq.b.e.C1651b.a.C1652a) r0
                        int r1 = r0.f82975d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f82975d = r1
                        goto L_0x0018
                    L_0x0013:
                        Kq.b$e$b$a$a r0 = new Kq.b$e$b$a$a
                        r0.<init>(r8, r10)
                    L_0x0018:
                        java.lang.Object r10 = r0.f82974c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f82975d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r10)
                        goto L_0x008f
                    L_0x0029:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L_0x0031:
                        XH.y.b(r10)
                        TJ.h r10 = r8.f82972a
                        Qq.k r9 = (Qq.k) r9
                        java.util.List r9 = r9.c()
                        java.lang.Iterable r9 = (java.lang.Iterable) r9
                        java.util.Iterator r9 = r9.iterator()
                    L_0x0042:
                        boolean r2 = r9.hasNext()
                        r4 = 0
                        if (r2 == 0) goto L_0x005d
                        java.lang.Object r2 = r9.next()
                        r5 = r2
                        Qq.g r5 = (Qq.g) r5
                        java.lang.String r5 = r5.getId()
                        java.lang.String r6 = r8.f82973b
                        boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
                        if (r5 == 0) goto L_0x0042
                        goto L_0x005e
                    L_0x005d:
                        r2 = r4
                    L_0x005e:
                        Qq.g r2 = (Qq.g) r2
                        if (r2 != 0) goto L_0x0081
                        Jq.d$b r9 = new Jq.d$b
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r5 = r8.f82973b
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r7 = "Could not find reward: "
                        r6.append(r7)
                        r6.append(r5)
                        java.lang.String r5 = r6.toString()
                        r2.<init>(r5)
                        r5 = 2
                        r9.<init>(r2, r4, r5, r4)
                        goto L_0x0086
                    L_0x0081:
                        Jq.d$d r9 = new Jq.d$d
                        r9.<init>(r2)
                    L_0x0086:
                        r0.f82975d = r3
                        java.lang.Object r9 = r10.emit(r9, r0)
                        if (r9 != r1) goto L_0x008f
                        return r1
                    L_0x008f:
                        XH.N r9 = XH.C16807N.f139792a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Kq.b.e.C1651b.a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public C1651b(C16532g gVar, String str) {
                this.f82970a = gVar;
                this.f82971b = str;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f82970a.collect(new a(hVar, this.f82971b), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, c.a aVar, String str, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f82960m = bVar;
            this.f82961n = aVar;
            this.f82962o = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f82960m, this.f82961n, this.f82962o, eVar);
            eVar2.f82959l = obj;
            return eVar2;
        }

        public final Object invoke(C16533h<? super Jq.d<Qq.g>> hVar, C17164e<? super C16807N> eVar) {
            return ((e) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0111 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f82958k
                r2 = 5
                r3 = 4
                r4 = 2
                r5 = 3
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x006e
                if (r1 == r6) goto L_0x0066
                if (r1 == r4) goto L_0x005a
                if (r1 == r5) goto L_0x004e
                if (r1 == r3) goto L_0x003d
                if (r1 != r2) goto L_0x0035
                java.lang.Object r0 = r10.f82954g
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r10.f82953f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r10.f82952e
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r10.f82951d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r10.f82950c
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r0 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r0
                java.lang.Object r0 = r10.f82959l
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r11)
                goto L_0x0112
            L_0x0035:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x003d:
                java.lang.Object r1 = r10.f82951d
                Kq.b$b r1 = (Kq.b.C1648b) r1
                java.lang.Object r1 = r10.f82950c
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r1
                java.lang.Object r3 = r10.f82959l
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r11)
                goto L_0x00d1
            L_0x004e:
                java.lang.Object r1 = r10.f82950c
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r1
                java.lang.Object r4 = r10.f82959l
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r11)
                goto L_0x00b6
            L_0x005a:
                java.lang.Object r1 = r10.f82950c
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r1
                java.lang.Object r4 = r10.f82959l
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r11)
                goto L_0x00a5
            L_0x0066:
                java.lang.Object r1 = r10.f82959l
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r11)
                goto L_0x008d
            L_0x006e:
                XH.y.b(r11)
                java.lang.Object r11 = r10.f82959l
                TJ.h r11 = (TJ.C16533h) r11
                Kq.b r1 = r10.f82960m
                Pq.a r1 = r1.f82927b
                TJ.g r1 = r1.d()
                r10.f82959l = r11
                r10.f82958k = r6
                java.lang.Object r1 = TJ.C16534i.D(r1, r10)
                if (r1 != r0) goto L_0x008a
                return r0
            L_0x008a:
                r9 = r1
                r1 = r11
                r11 = r9
            L_0x008d:
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r11 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r11
                if (r11 != 0) goto L_0x00d6
                Jq.d$c r8 = new Jq.d$c
                r8.<init>(r7, r6, r7)
                r10.f82959l = r1
                r10.f82950c = r11
                r10.f82958k = r4
                java.lang.Object r4 = r1.emit(r8, r10)
                if (r4 != r0) goto L_0x00a3
                return r0
            L_0x00a3:
                r4 = r1
                r1 = r11
            L_0x00a5:
                Kq.b r11 = r10.f82960m
                Jq.c$a r6 = r10.f82961n
                r10.f82959l = r4
                r10.f82950c = r1
                r10.f82958k = r5
                java.lang.Object r11 = r11.r(r6, r10)
                if (r11 != r0) goto L_0x00b6
                return r0
            L_0x00b6:
                Kq.b$b r11 = (Kq.b.C1648b) r11
                Kq.b$b r6 = Kq.b.C1648b.Error
                if (r11 != r6) goto L_0x00d4
                Jq.d$b r6 = new Jq.d$b
                r6.<init>(r7, r7, r5, r7)
                r10.f82959l = r4
                r10.f82950c = r1
                r10.f82951d = r11
                r10.f82958k = r3
                java.lang.Object r11 = r4.emit(r6, r10)
                if (r11 != r0) goto L_0x00d0
                return r0
            L_0x00d0:
                r3 = r4
            L_0x00d1:
                r11 = r1
                r1 = r3
                goto L_0x00d6
            L_0x00d4:
                r11 = r1
                r1 = r4
            L_0x00d6:
                Kq.b r3 = r10.f82960m
                Pq.a r3 = r3.f82927b
                TJ.g r3 = r3.d()
                TJ.g r3 = TJ.C16534i.A(r3)
                Kq.b r4 = r10.f82960m
                Nq.e r4 = r4.f82929d
                Kq.b$e$a r5 = new Kq.b$e$a
                r5.<init>(r3, r4)
                java.lang.String r3 = r10.f82962o
                Kq.b$e$b r4 = new Kq.b$e$b
                r4.<init>(r5, r3)
                r10.f82959l = r1
                r10.f82950c = r11
                r10.f82951d = r4
                r10.f82952e = r5
                r10.f82953f = r3
                r10.f82954g = r5
                r11 = 0
                r10.f82955h = r11
                r10.f82956i = r11
                r10.f82957j = r11
                r10.f82958k = r2
                java.lang.Object r11 = TJ.C16534i.x(r1, r4, r10)
                if (r11 != r0) goto L_0x0112
                return r0
            L_0x0112:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Kq.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "LJq/d;", "LQq/i;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardInteractionsFlow$1", f = "FamilyRewardsRepositoryImpl.kt", l = {121, 124, 125, 135}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super Jq.d<Qq.i>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82977c;

        /* renamed from: d  reason: collision with root package name */
        Object f82978d;

        /* renamed from: e  reason: collision with root package name */
        int f82979e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f82980f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f82981g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardInteractionsFlow$1$1", f = "FamilyRewardsRepositoryImpl.kt", l = {127, 127}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f82982c;

            /* renamed from: d  reason: collision with root package name */
            Object f82983d;

            /* renamed from: e  reason: collision with root package name */
            Object f82984e;

            /* renamed from: f  reason: collision with root package name */
            Object f82985f;

            /* renamed from: g  reason: collision with root package name */
            Object f82986g;

            /* renamed from: h  reason: collision with root package name */
            Object f82987h;

            /* renamed from: i  reason: collision with root package name */
            Object f82988i;

            /* renamed from: j  reason: collision with root package name */
            Object f82989j;

            /* renamed from: k  reason: collision with root package name */
            Object f82990k;

            /* renamed from: l  reason: collision with root package name */
            int f82991l;

            /* renamed from: m  reason: collision with root package name */
            int f82992m;

            /* renamed from: n  reason: collision with root package name */
            int f82993n;

            /* renamed from: o  reason: collision with root package name */
            int f82994o;

            /* renamed from: p  reason: collision with root package name */
            int f82995p;

            /* renamed from: q  reason: collision with root package name */
            int f82996q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ b f82997r;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f82997r = bVar;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f82997r, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super C16807N> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                qv.e eVar;
                String str;
                String str2;
                Iterable iterable;
                Iterator it;
                Object obj3;
                Pq.a aVar;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                String str3;
                Object obj4;
                Object f10 = C17187b.f();
                int i15 = this.f82996q;
                if (i15 == 0) {
                    y.b(obj);
                    qv.e eVar2 = qv.e.DEBUG;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = qv.d.f102012a.a().iterator();
                    while (true) {
                        i12 = 0;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((C11819b) next).b(eVar2, false)) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    String str4 = null;
                    String str5 = null;
                    Object obj5 = arrayList;
                    while (it3.hasNext()) {
                        obj5 = it3.next();
                        C11819b bVar = (C11819b) obj5;
                        if (str5 == null) {
                            String a10 = C11818a.a("Loading RewardInteractions data from backend", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str5 = C11820c.a(a10);
                        }
                        if (str4 == null) {
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "FamilyRewardsRepository";
                        }
                        bVar.a(eVar2, str4, false, (Throwable) null, str5);
                    }
                    Object obj6 = obj5;
                    Pq.a l10 = this.f82997r.f82927b;
                    Pq.c m10 = this.f82997r.f82926a;
                    this.f82982c = "FamilyRewardsRepository";
                    this.f82983d = eVar2;
                    this.f82984e = str5;
                    this.f82985f = str4;
                    this.f82986g = arrayList;
                    this.f82987h = it3;
                    this.f82988i = obj6;
                    this.f82989j = l10;
                    this.f82991l = 0;
                    this.f82992m = 0;
                    this.f82993n = 0;
                    this.f82994o = 0;
                    this.f82995p = 0;
                    this.f82996q = 1;
                    obj4 = m10.d(this);
                    if (obj4 == f10) {
                        return f10;
                    }
                    obj2 = f10;
                    i14 = 0;
                    i13 = 0;
                    i11 = 0;
                    str3 = "FamilyRewardsRepository";
                    eVar = eVar2;
                    str = str5;
                    str2 = str4;
                    iterable = arrayList;
                    it = it3;
                    obj3 = obj6;
                    aVar = l10;
                    i10 = 0;
                } else if (i15 == 1) {
                    int i16 = this.f82995p;
                    i14 = this.f82994o;
                    i13 = this.f82993n;
                    int i17 = this.f82992m;
                    int i18 = this.f82991l;
                    Object obj7 = this.f82988i;
                    y.b(obj);
                    obj2 = f10;
                    str3 = (String) this.f82982c;
                    eVar = (qv.e) this.f82983d;
                    str = (String) this.f82984e;
                    str2 = (String) this.f82985f;
                    iterable = (Iterable) this.f82986g;
                    it = (Iterator) this.f82987h;
                    obj3 = obj7;
                    aVar = (Pq.a) this.f82989j;
                    i10 = i18;
                    i11 = i17;
                    i12 = i16;
                    obj4 = obj;
                } else if (i15 == 2) {
                    Pq.a aVar2 = (Pq.a) this.f82989j;
                    Iterator it4 = (Iterator) this.f82987h;
                    Iterable iterable2 = (Iterable) this.f82986g;
                    String str6 = (String) this.f82985f;
                    String str7 = (String) this.f82984e;
                    qv.e eVar3 = (qv.e) this.f82983d;
                    String str8 = (String) this.f82982c;
                    y.b(obj);
                    return C16807N.f139792a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f82982c = str3;
                this.f82983d = eVar;
                this.f82984e = str;
                this.f82985f = str2;
                this.f82986g = iterable;
                this.f82987h = it;
                this.f82988i = obj3;
                this.f82989j = aVar;
                this.f82990k = obj4;
                this.f82991l = i10;
                this.f82992m = i11;
                this.f82993n = i13;
                this.f82994o = i14;
                this.f82995p = i12;
                this.f82996q = 2;
                Object h10 = aVar.h((Qq.i) obj4, this);
                Object obj8 = obj2;
                if (h10 == obj8) {
                    return obj8;
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f82981g = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f82981g, eVar);
            fVar.f82980f = obj;
            return fVar;
        }

        public final Object invoke(C16533h<? super Jq.d<Qq.i>> hVar, C17164e<? super C16807N> eVar) {
            return ((f) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f82979e
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L_0x004e
                if (r1 == r6) goto L_0x0046
                if (r1 == r4) goto L_0x003a
                if (r1 == r3) goto L_0x002e
                if (r1 != r2) goto L_0x0026
                java.lang.Object r0 = r9.f82978d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r9.f82977c
                Qq.i r0 = (Qq.i) r0
                java.lang.Object r0 = r9.f82980f
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r10)
                goto L_0x00c1
            L_0x0026:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x002e:
                java.lang.Object r1 = r9.f82977c
                Qq.i r1 = (Qq.i) r1
                java.lang.Object r3 = r9.f82980f
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r10)
                goto L_0x009e
            L_0x003a:
                java.lang.Object r1 = r9.f82977c
                Qq.i r1 = (Qq.i) r1
                java.lang.Object r4 = r9.f82980f
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r10)
                goto L_0x0083
            L_0x0046:
                java.lang.Object r1 = r9.f82980f
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r10)
                goto L_0x006b
            L_0x004e:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f82980f
                r1 = r10
                TJ.h r1 = (TJ.C16533h) r1
                Kq.b r10 = r9.f82981g
                Pq.a r10 = r10.f82927b
                TJ.g r10 = r10.f()
                r9.f82980f = r1
                r9.f82979e = r6
                java.lang.Object r10 = TJ.C16534i.B(r10, r9)
                if (r10 != r0) goto L_0x006b
                return r0
            L_0x006b:
                Qq.i r10 = (Qq.i) r10
                if (r10 != 0) goto L_0x00a0
                Jq.d$c r7 = new Jq.d$c
                r7.<init>(r5, r6, r5)
                r9.f82980f = r1
                r9.f82977c = r10
                r9.f82979e = r4
                java.lang.Object r4 = r1.emit(r7, r9)
                if (r4 != r0) goto L_0x0081
                return r0
            L_0x0081:
                r4 = r1
                r1 = r10
            L_0x0083:
                Kq.b r10 = r9.f82981g
                bK.a r6 = r10.f82933h
                Kq.b$f$a r7 = new Kq.b$f$a
                Kq.b r8 = r9.f82981g
                r7.<init>(r8, r5)
                r9.f82980f = r4
                r9.f82977c = r1
                r9.f82979e = r3
                java.lang.Object r10 = r10.v(r6, r7, r9)
                if (r10 != r0) goto L_0x009d
                return r0
            L_0x009d:
                r3 = r4
            L_0x009e:
                r10 = r1
                r1 = r3
            L_0x00a0:
                Kq.b r3 = r9.f82981g
                Pq.a r4 = r3.f82927b
                TJ.g r4 = r4.f()
                TJ.g r4 = TJ.C16534i.A(r4)
                TJ.g r3 = r3.t(r4)
                r9.f82980f = r1
                r9.f82977c = r10
                r9.f82978d = r3
                r9.f82979e = r2
                java.lang.Object r10 = TJ.C16534i.x(r1, r3, r9)
                if (r10 != r0) goto L_0x00c1
                return r0
            L_0x00c1:
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Kq.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "LJq/d;", "LQq/l;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardsFAQFlow$1", f = "FamilyRewardsRepositoryImpl.kt", l = {103, 106, 107, 117}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super Jq.d<Qq.l>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82998c;

        /* renamed from: d  reason: collision with root package name */
        Object f82999d;

        /* renamed from: e  reason: collision with root package name */
        int f83000e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f83001f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f83002g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardsFAQFlow$1$1", f = "FamilyRewardsRepositoryImpl.kt", l = {109, 109}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f83003c;

            /* renamed from: d  reason: collision with root package name */
            Object f83004d;

            /* renamed from: e  reason: collision with root package name */
            Object f83005e;

            /* renamed from: f  reason: collision with root package name */
            Object f83006f;

            /* renamed from: g  reason: collision with root package name */
            Object f83007g;

            /* renamed from: h  reason: collision with root package name */
            Object f83008h;

            /* renamed from: i  reason: collision with root package name */
            Object f83009i;

            /* renamed from: j  reason: collision with root package name */
            Object f83010j;

            /* renamed from: k  reason: collision with root package name */
            Object f83011k;

            /* renamed from: l  reason: collision with root package name */
            int f83012l;

            /* renamed from: m  reason: collision with root package name */
            int f83013m;

            /* renamed from: n  reason: collision with root package name */
            int f83014n;

            /* renamed from: o  reason: collision with root package name */
            int f83015o;

            /* renamed from: p  reason: collision with root package name */
            int f83016p;

            /* renamed from: q  reason: collision with root package name */
            int f83017q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ b f83018r;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f83018r = bVar;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f83018r, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super C16807N> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                qv.e eVar;
                String str;
                String str2;
                Iterable iterable;
                Iterator it;
                Object obj3;
                Pq.a aVar;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                String str3;
                Object obj4;
                Object f10 = C17187b.f();
                int i15 = this.f83017q;
                if (i15 == 0) {
                    y.b(obj);
                    qv.e eVar2 = qv.e.DEBUG;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = qv.d.f102012a.a().iterator();
                    while (true) {
                        i12 = 0;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((C11819b) next).b(eVar2, false)) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    String str4 = null;
                    String str5 = null;
                    Object obj5 = arrayList;
                    while (it3.hasNext()) {
                        obj5 = it3.next();
                        C11819b bVar = (C11819b) obj5;
                        if (str5 == null) {
                            String a10 = C11818a.a("Loading FAQ data from backend", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str5 = C11820c.a(a10);
                        }
                        if (str4 == null) {
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "FamilyRewardsRepository";
                        }
                        bVar.a(eVar2, str4, false, (Throwable) null, str5);
                    }
                    Object obj6 = obj5;
                    Pq.a l10 = this.f83018r.f82927b;
                    Pq.c m10 = this.f83018r.f82926a;
                    this.f83003c = "FamilyRewardsRepository";
                    this.f83004d = eVar2;
                    this.f83005e = str5;
                    this.f83006f = str4;
                    this.f83007g = arrayList;
                    this.f83008h = it3;
                    this.f83009i = obj6;
                    this.f83010j = l10;
                    this.f83012l = 0;
                    this.f83013m = 0;
                    this.f83014n = 0;
                    this.f83015o = 0;
                    this.f83016p = 0;
                    this.f83017q = 1;
                    obj4 = m10.f(this);
                    if (obj4 == f10) {
                        return f10;
                    }
                    obj2 = f10;
                    i14 = 0;
                    i13 = 0;
                    i11 = 0;
                    str3 = "FamilyRewardsRepository";
                    eVar = eVar2;
                    str = str5;
                    str2 = str4;
                    iterable = arrayList;
                    it = it3;
                    obj3 = obj6;
                    aVar = l10;
                    i10 = 0;
                } else if (i15 == 1) {
                    int i16 = this.f83016p;
                    i14 = this.f83015o;
                    i13 = this.f83014n;
                    int i17 = this.f83013m;
                    int i18 = this.f83012l;
                    Object obj7 = this.f83009i;
                    y.b(obj);
                    obj2 = f10;
                    str3 = (String) this.f83003c;
                    eVar = (qv.e) this.f83004d;
                    str = (String) this.f83005e;
                    str2 = (String) this.f83006f;
                    iterable = (Iterable) this.f83007g;
                    it = (Iterator) this.f83008h;
                    obj3 = obj7;
                    aVar = (Pq.a) this.f83010j;
                    i10 = i18;
                    i11 = i17;
                    i12 = i16;
                    obj4 = obj;
                } else if (i15 == 2) {
                    Pq.a aVar2 = (Pq.a) this.f83010j;
                    Iterator it4 = (Iterator) this.f83008h;
                    Iterable iterable2 = (Iterable) this.f83007g;
                    String str6 = (String) this.f83006f;
                    String str7 = (String) this.f83005e;
                    qv.e eVar3 = (qv.e) this.f83004d;
                    String str8 = (String) this.f83003c;
                    y.b(obj);
                    return C16807N.f139792a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f83003c = str3;
                this.f83004d = eVar;
                this.f83005e = str;
                this.f83006f = str2;
                this.f83007g = iterable;
                this.f83008h = it;
                this.f83009i = obj3;
                this.f83010j = aVar;
                this.f83011k = obj4;
                this.f83012l = i10;
                this.f83013m = i11;
                this.f83014n = i13;
                this.f83015o = i14;
                this.f83016p = i12;
                this.f83017q = 2;
                Object g10 = aVar.g((Qq.l) obj4, this);
                Object obj8 = obj2;
                if (g10 == obj8) {
                    return obj8;
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f83002g = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f83002g, eVar);
            gVar.f83001f = obj;
            return gVar;
        }

        public final Object invoke(C16533h<? super Jq.d<Qq.l>> hVar, C17164e<? super C16807N> eVar) {
            return ((g) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f83000e
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L_0x004e
                if (r1 == r6) goto L_0x0046
                if (r1 == r4) goto L_0x003a
                if (r1 == r3) goto L_0x002e
                if (r1 != r2) goto L_0x0026
                java.lang.Object r0 = r9.f82999d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r9.f82998c
                Qq.l r0 = (Qq.l) r0
                java.lang.Object r0 = r9.f83001f
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r10)
                goto L_0x00c1
            L_0x0026:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x002e:
                java.lang.Object r1 = r9.f82998c
                Qq.l r1 = (Qq.l) r1
                java.lang.Object r3 = r9.f83001f
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r10)
                goto L_0x009e
            L_0x003a:
                java.lang.Object r1 = r9.f82998c
                Qq.l r1 = (Qq.l) r1
                java.lang.Object r4 = r9.f83001f
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r10)
                goto L_0x0083
            L_0x0046:
                java.lang.Object r1 = r9.f83001f
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r10)
                goto L_0x006b
            L_0x004e:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f83001f
                r1 = r10
                TJ.h r1 = (TJ.C16533h) r1
                Kq.b r10 = r9.f83002g
                Pq.a r10 = r10.f82927b
                TJ.g r10 = r10.i()
                r9.f83001f = r1
                r9.f83000e = r6
                java.lang.Object r10 = TJ.C16534i.B(r10, r9)
                if (r10 != r0) goto L_0x006b
                return r0
            L_0x006b:
                Qq.l r10 = (Qq.l) r10
                if (r10 != 0) goto L_0x00a0
                Jq.d$c r7 = new Jq.d$c
                r7.<init>(r5, r6, r5)
                r9.f83001f = r1
                r9.f82998c = r10
                r9.f83000e = r4
                java.lang.Object r4 = r1.emit(r7, r9)
                if (r4 != r0) goto L_0x0081
                return r0
            L_0x0081:
                r4 = r1
                r1 = r10
            L_0x0083:
                Kq.b r10 = r9.f83002g
                bK.a r6 = r10.f82931f
                Kq.b$g$a r7 = new Kq.b$g$a
                Kq.b r8 = r9.f83002g
                r7.<init>(r8, r5)
                r9.f83001f = r4
                r9.f82998c = r1
                r9.f83000e = r3
                java.lang.Object r10 = r10.v(r6, r7, r9)
                if (r10 != r0) goto L_0x009d
                return r0
            L_0x009d:
                r3 = r4
            L_0x009e:
                r10 = r1
                r1 = r3
            L_0x00a0:
                Kq.b r3 = r9.f83002g
                Pq.a r4 = r3.f82927b
                TJ.g r4 = r4.i()
                TJ.g r4 = TJ.C16534i.A(r4)
                TJ.g r3 = r3.t(r4)
                r9.f83001f = r1
                r9.f82998c = r10
                r9.f82999d = r3
                r9.f83000e = r2
                java.lang.Object r10 = TJ.C16534i.x(r1, r3, r9)
                if (r10 != r0) goto L_0x00c1
                return r0
            L_0x00c1:
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Kq.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "LJq/d;", "LQq/k;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardsFlow$1", f = "FamilyRewardsRepositoryImpl.kt", l = {55, 58, 59, 61, 70}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super Jq.d<Qq.k>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f83019c;

        /* renamed from: d  reason: collision with root package name */
        Object f83020d;

        /* renamed from: e  reason: collision with root package name */
        Object f83021e;

        /* renamed from: f  reason: collision with root package name */
        Object f83022f;

        /* renamed from: g  reason: collision with root package name */
        Object f83023g;

        /* renamed from: h  reason: collision with root package name */
        int f83024h;

        /* renamed from: i  reason: collision with root package name */
        int f83025i;

        /* renamed from: j  reason: collision with root package name */
        int f83026j;

        /* renamed from: k  reason: collision with root package name */
        int f83027k;

        /* renamed from: l  reason: collision with root package name */
        private /* synthetic */ Object f83028l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f83029m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c.a f83030n;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements C16532g<Qq.k> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f83031a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Nq.e f83032b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Kq.b$h$a$a  reason: collision with other inner class name */
            public static final class C1653a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f83033a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Nq.e f83034b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardsFlow$1$invokeSuspend$$inlined$map$1$2", f = "FamilyRewardsRepositoryImpl.kt", l = {50}, m = "emit")
                /* renamed from: Kq.b$h$a$a$a  reason: collision with other inner class name */
                public static final class C1654a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f83035c;

                    /* renamed from: d  reason: collision with root package name */
                    int f83036d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C1653a f83037e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C1654a(C1653a aVar, C17164e eVar) {
                        super(eVar);
                        this.f83037e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f83035c = obj;
                        this.f83036d |= Integer.MIN_VALUE;
                        return this.f83037e.emit((Object) null, this);
                    }
                }

                public C1653a(C16533h hVar, Nq.e eVar) {
                    this.f83033a = hVar;
                    this.f83034b = eVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof Kq.b.h.a.C1653a.C1654a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        Kq.b$h$a$a$a r0 = (Kq.b.h.a.C1653a.C1654a) r0
                        int r1 = r0.f83036d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f83036d = r1
                        goto L_0x0018
                    L_0x0013:
                        Kq.b$h$a$a$a r0 = new Kq.b$h$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f83035c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f83036d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x0047
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        TJ.h r6 = r4.f83033a
                        com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r5 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r5
                        Nq.e r2 = r4.f83034b
                        Qq.k r5 = r2.a(r5)
                        r0.f83036d = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Kq.b.h.a.C1653a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public a(C16532g gVar, Nq.e eVar) {
                this.f83031a = gVar;
                this.f83032b = eVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f83031a.collect(new C1653a(hVar, this.f83032b), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, c.a aVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f83029m = bVar;
            this.f83030n = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f83029m, this.f83030n, eVar);
            hVar.f83028l = obj;
            return hVar;
        }

        public final Object invoke(C16533h<? super Jq.d<Qq.k>> hVar, C17164e<? super C16807N> eVar) {
            return ((h) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x010e A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f83027k
                r2 = 5
                r3 = 4
                r4 = 2
                r5 = 3
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x006e
                if (r1 == r6) goto L_0x0066
                if (r1 == r4) goto L_0x005a
                if (r1 == r5) goto L_0x004e
                if (r1 == r3) goto L_0x003d
                if (r1 != r2) goto L_0x0035
                java.lang.Object r0 = r10.f83023g
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r10.f83022f
                Nq.e r0 = (Nq.e) r0
                java.lang.Object r0 = r10.f83021e
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r10.f83020d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r10.f83019c
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r0 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r0
                java.lang.Object r0 = r10.f83028l
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r11)
                goto L_0x010f
            L_0x0035:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x003d:
                java.lang.Object r1 = r10.f83020d
                Kq.b$b r1 = (Kq.b.C1648b) r1
                java.lang.Object r1 = r10.f83019c
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r1
                java.lang.Object r3 = r10.f83028l
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r11)
                goto L_0x00d1
            L_0x004e:
                java.lang.Object r1 = r10.f83019c
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r1
                java.lang.Object r4 = r10.f83028l
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r11)
                goto L_0x00b6
            L_0x005a:
                java.lang.Object r1 = r10.f83019c
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r1
                java.lang.Object r4 = r10.f83028l
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r11)
                goto L_0x00a5
            L_0x0066:
                java.lang.Object r1 = r10.f83028l
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r11)
                goto L_0x008d
            L_0x006e:
                XH.y.b(r11)
                java.lang.Object r11 = r10.f83028l
                TJ.h r11 = (TJ.C16533h) r11
                Kq.b r1 = r10.f83029m
                Pq.a r1 = r1.f82927b
                TJ.g r1 = r1.d()
                r10.f83028l = r11
                r10.f83027k = r6
                java.lang.Object r1 = TJ.C16534i.D(r1, r10)
                if (r1 != r0) goto L_0x008a
                return r0
            L_0x008a:
                r9 = r1
                r1 = r11
                r11 = r9
            L_0x008d:
                com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote r11 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote) r11
                if (r11 != 0) goto L_0x00d6
                Jq.d$c r8 = new Jq.d$c
                r8.<init>(r7, r6, r7)
                r10.f83028l = r1
                r10.f83019c = r11
                r10.f83027k = r4
                java.lang.Object r4 = r1.emit(r8, r10)
                if (r4 != r0) goto L_0x00a3
                return r0
            L_0x00a3:
                r4 = r1
                r1 = r11
            L_0x00a5:
                Kq.b r11 = r10.f83029m
                Jq.c$a r6 = r10.f83030n
                r10.f83028l = r4
                r10.f83019c = r1
                r10.f83027k = r5
                java.lang.Object r11 = r11.r(r6, r10)
                if (r11 != r0) goto L_0x00b6
                return r0
            L_0x00b6:
                Kq.b$b r11 = (Kq.b.C1648b) r11
                Kq.b$b r6 = Kq.b.C1648b.Error
                if (r11 != r6) goto L_0x00d4
                Jq.d$b r6 = new Jq.d$b
                r6.<init>(r7, r7, r5, r7)
                r10.f83028l = r4
                r10.f83019c = r1
                r10.f83020d = r11
                r10.f83027k = r3
                java.lang.Object r11 = r4.emit(r6, r10)
                if (r11 != r0) goto L_0x00d0
                return r0
            L_0x00d0:
                r3 = r4
            L_0x00d1:
                r11 = r1
                r1 = r3
                goto L_0x00d6
            L_0x00d4:
                r11 = r1
                r1 = r4
            L_0x00d6:
                Kq.b r3 = r10.f83029m
                Pq.a r4 = r3.f82927b
                TJ.g r4 = r4.d()
                TJ.g r4 = TJ.C16534i.A(r4)
                Kq.b r5 = r10.f83029m
                Nq.e r5 = r5.f82929d
                Kq.b$h$a r6 = new Kq.b$h$a
                r6.<init>(r4, r5)
                TJ.g r3 = r3.t(r6)
                r10.f83028l = r1
                r10.f83019c = r11
                r10.f83020d = r3
                r10.f83021e = r4
                r10.f83022f = r5
                r10.f83023g = r4
                r11 = 0
                r10.f83024h = r11
                r10.f83025i = r11
                r10.f83026j = r11
                r10.f83027k = r2
                java.lang.Object r11 = TJ.C16534i.x(r1, r3, r10)
                if (r11 != r0) goto L_0x010f
                return r0
            L_0x010f:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Kq.b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LQq/o;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardsHistory$1", f = "FamilyRewardsRepositoryImpl.kt", l = {49, 49}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super Qq.o>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f83038c;

        /* renamed from: d  reason: collision with root package name */
        Object f83039d;

        /* renamed from: e  reason: collision with root package name */
        int f83040e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f83041f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f83042g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f83042g = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f83042g, eVar);
            iVar.f83041f = obj;
            return iVar;
        }

        public final Object invoke(C16533h<? super Qq.o> hVar, C17164e<? super C16807N> eVar) {
            return ((i) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f83040e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r0 = r4.f83038c
                TJ.h r0 = (TJ.C16533h) r0
                java.lang.Object r0 = r4.f83041f
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r5)
                goto L_0x0059
            L_0x001a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0022:
                java.lang.Object r1 = r4.f83038c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r3 = r4.f83041f
                TJ.h r3 = (TJ.C16533h) r3
                XH.y.b(r5)
                goto L_0x004a
            L_0x002e:
                XH.y.b(r5)
                java.lang.Object r5 = r4.f83041f
                r1 = r5
                TJ.h r1 = (TJ.C16533h) r1
                Kq.b r5 = r4.f83042g
                Pq.c r5 = r5.f82926a
                r4.f83041f = r1
                r4.f83038c = r1
                r4.f83040e = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L_0x0049
                return r0
            L_0x0049:
                r3 = r1
            L_0x004a:
                r4.f83041f = r3
                r4.f83038c = r1
                r4.f83039d = r5
                r4.f83040e = r2
                java.lang.Object r5 = r1.emit(r5, r4)
                if (r5 != r0) goto L_0x0059
                return r0
            L_0x0059:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Kq.b.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl", f = "FamilyRewardsRepositoryImpl.kt", l = {151, 153}, m = "fetchFamilyRewardsInternal$familyrewards_datalayer_impl_release")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f83043c;

        /* renamed from: d  reason: collision with root package name */
        Object f83044d;

        /* renamed from: e  reason: collision with root package name */
        Object f83045e;

        /* renamed from: f  reason: collision with root package name */
        Object f83046f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f83047g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f83048h;

        /* renamed from: i  reason: collision with root package name */
        int f83049i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f83048h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f83047g = obj;
            this.f83049i |= Integer.MIN_VALUE;
            return this.f83048h.r((c.a) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$fetchFamilyRewardsInternal$2", f = "FamilyRewardsRepositoryImpl.kt", l = {155, 158}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f83050c;

        /* renamed from: d  reason: collision with root package name */
        Object f83051d;

        /* renamed from: e  reason: collision with root package name */
        Object f83052e;

        /* renamed from: f  reason: collision with root package name */
        Object f83053f;

        /* renamed from: g  reason: collision with root package name */
        Object f83054g;

        /* renamed from: h  reason: collision with root package name */
        Object f83055h;

        /* renamed from: i  reason: collision with root package name */
        Object f83056i;

        /* renamed from: j  reason: collision with root package name */
        Object f83057j;

        /* renamed from: k  reason: collision with root package name */
        Object f83058k;

        /* renamed from: l  reason: collision with root package name */
        Object f83059l;

        /* renamed from: m  reason: collision with root package name */
        Object f83060m;

        /* renamed from: n  reason: collision with root package name */
        int f83061n;

        /* renamed from: o  reason: collision with root package name */
        int f83062o;

        /* renamed from: p  reason: collision with root package name */
        int f83063p;

        /* renamed from: q  reason: collision with root package name */
        int f83064q;

        /* renamed from: r  reason: collision with root package name */
        int f83065r;

        /* renamed from: s  reason: collision with root package name */
        int f83066s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ O<C1648b> f83067t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ b f83068u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ c.a f83069v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(O<C1648b> o10, b bVar, c.a aVar, C17164e<? super k> eVar) {
            super(1, eVar);
            this.f83067t = o10;
            this.f83068u = bVar;
            this.f83069v = aVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new k(this.f83067t, this.f83068u, this.f83069v, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((k) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            O<C1648b> o10;
            T t10;
            O<C1648b> o11;
            Object obj2;
            qv.e eVar;
            String str;
            String str2;
            Iterable iterable;
            Iterator it;
            Object obj3;
            int i10;
            int i11;
            int i12;
            Object f10 = C17187b.f();
            int i13 = this.f83066s;
            if (i13 == 0) {
                y.b(obj);
                eVar = qv.e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                it = arrayList.iterator();
                str2 = null;
                str = null;
                Object obj4 = arrayList;
                while (it.hasNext()) {
                    obj4 = it.next();
                    C11819b bVar = (C11819b) obj4;
                    if (str == null) {
                        String a10 = C11818a.a("Loading Rewards data from backend", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "FamilyRewardsRepository";
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str);
                }
                obj3 = obj4;
                o10 = this.f83067t;
                Pq.c m10 = this.f83068u.f82926a;
                c.a aVar = this.f83069v;
                this.f83050c = "FamilyRewardsRepository";
                this.f83051d = eVar;
                this.f83052e = str;
                this.f83053f = str2;
                this.f83054g = arrayList;
                this.f83055h = it;
                this.f83056i = obj3;
                this.f83057j = o10;
                this.f83061n = 0;
                this.f83062o = 0;
                this.f83063p = 0;
                this.f83064q = 0;
                this.f83065r = 0;
                this.f83066s = 1;
                obj2 = m10.a(aVar, this);
                if (obj2 == f10) {
                    return f10;
                }
                i12 = 0;
                i11 = 0;
                i10 = 0;
                iterable = arrayList;
            } else if (i13 == 1) {
                int i14 = this.f83065r;
                int i15 = this.f83064q;
                int i16 = this.f83063p;
                obj3 = this.f83056i;
                it = (Iterator) this.f83055h;
                str2 = (String) this.f83053f;
                str = (String) this.f83052e;
                eVar = (qv.e) this.f83051d;
                String str3 = (String) this.f83050c;
                y.b(obj);
                obj2 = ((x) obj).j();
                int i17 = i15;
                i12 = i14;
                o10 = (O) this.f83057j;
                i10 = i16;
                i11 = i17;
                iterable = (Iterable) this.f83054g;
            } else if (i13 == 2) {
                o11 = (O) this.f83059l;
                Iterator it2 = (Iterator) this.f83057j;
                Iterable iterable2 = (Iterable) this.f83056i;
                String str4 = (String) this.f83055h;
                String str5 = (String) this.f83054g;
                qv.e eVar2 = (qv.e) this.f83053f;
                FamilyCustomerRewardRemote familyCustomerRewardRemote = (FamilyCustomerRewardRemote) this.f83052e;
                b bVar2 = (b) this.f83051d;
                y.b(obj);
                o10 = o11;
                t10 = C1648b.Success;
                o10.f144348a = t10;
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar3 = this.f83068u;
            if (x.e(obj2) == null) {
                FamilyCustomerRewardRemote familyCustomerRewardRemote2 = (FamilyCustomerRewardRemote) obj2;
                Pq.a l10 = bVar3.f82927b;
                this.f83050c = obj2;
                this.f83051d = bVar3;
                this.f83052e = familyCustomerRewardRemote2;
                this.f83053f = eVar;
                this.f83054g = str;
                this.f83055h = str2;
                this.f83056i = iterable;
                this.f83057j = it;
                this.f83058k = obj3;
                this.f83059l = o10;
                this.f83060m = obj2;
                this.f83061n = 0;
                this.f83062o = i10;
                this.f83063p = i11;
                this.f83064q = i12;
                this.f83066s = 2;
                if (l10.e(familyCustomerRewardRemote2, this) == f10) {
                    return f10;
                }
                o11 = o10;
                o10 = o11;
                t10 = C1648b.Success;
                o10.f144348a = t10;
                return C16807N.f139792a;
            }
            t10 = C1648b.Error;
            o10.f144348a = t10;
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl", f = "FamilyRewardsRepositoryImpl.kt", l = {205}, m = "isFeatureEnabled")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f83070c;

        /* renamed from: d  reason: collision with root package name */
        Object f83071d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f83072e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f83073f;

        /* renamed from: g  reason: collision with root package name */
        int f83074g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar, C17164e<? super l> eVar) {
            super(eVar);
            this.f83073f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f83072e = obj;
            this.f83074g |= Integer.MIN_VALUE;
            return this.f83073f.s(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements C16532g<d.C1628d<T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f83075a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f83076a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$mapToResource$$inlined$map$1$2", f = "FamilyRewardsRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: Kq.b$m$a$a  reason: collision with other inner class name */
            public static final class C1655a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f83077c;

                /* renamed from: d  reason: collision with root package name */
                int f83078d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f83079e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1655a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f83079e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f83077c = obj;
                    this.f83078d |= Integer.MIN_VALUE;
                    return this.f83079e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f83076a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Kq.b.m.a.C1655a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Kq.b$m$a$a r0 = (Kq.b.m.a.C1655a) r0
                    int r1 = r0.f83078d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f83078d = r1
                    goto L_0x0018
                L_0x0013:
                    Kq.b$m$a$a r0 = new Kq.b$m$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f83077c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f83078d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0044
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f83076a
                    Jq.d$d r2 = new Jq.d$d
                    r2.<init>(r5)
                    r0.f83078d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0044
                    return r1
                L_0x0044:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Kq.b.m.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public m(C16532g gVar) {
            this.f83075a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f83075a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$resourceFlow$$inlined$flatMapLatest$1", f = "FamilyRewardsRepositoryImpl.kt", l = {189}, m = "invokeSuspend")
    public static final class n extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super Jq.d<T>>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f83080c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f83081d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f83082e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ nI.p f83083f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C17164e eVar, nI.p pVar) {
            super(3, eVar);
            this.f83083f = pVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Jq.d<T>> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            n nVar = new n(eVar, this.f83083f);
            nVar.f83081d = hVar;
            nVar.f83082e = bool;
            return nVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f83080c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f83081d;
                C16532g g10 = ((Boolean) this.f83082e).booleanValue() ? C16534i.g(C16534i.H(new o(this.f83083f, (C17164e<? super o>) null)), new p((C17164e<? super p>) null)) : C16534i.J(new d.a());
                this.f83080c = 1;
                if (C16534i.x(hVar, g10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LTJ/h;", "LJq/d;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$resourceFlow$1$1", f = "FamilyRewardsRepositoryImpl.kt", l = {216}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super Jq.d<T>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f83084c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f83085d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.p<C16533h<? super Jq.d<T>>, C17164e<? super C16807N>, Object> f83086e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(nI.p<? super C16533h<? super Jq.d<T>>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f83086e = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            o oVar = new o(this.f83086e, eVar);
            oVar.f83085d = obj;
            return oVar;
        }

        public final Object invoke(C16533h<? super Jq.d<T>> hVar, C17164e<? super C16807N> eVar) {
            return ((o) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f83084c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f83085d;
                nI.p<C16533h<? super Jq.d<T>>, C17164e<? super C16807N>, Object> pVar = this.f83086e;
                this.f83085d = hVar;
                this.f83084c = 1;
                if (pVar.invoke(hVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f83085d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "LTJ/h;", "LJq/d;", "", "cause", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl$resourceFlow$1$2", f = "FamilyRewardsRepositoryImpl.kt", l = {219}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super Jq.d<T>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f83087c;

        /* renamed from: d  reason: collision with root package name */
        Object f83088d;

        /* renamed from: e  reason: collision with root package name */
        Object f83089e;

        /* renamed from: f  reason: collision with root package name */
        Object f83090f;

        /* renamed from: g  reason: collision with root package name */
        Object f83091g;

        /* renamed from: h  reason: collision with root package name */
        Object f83092h;

        /* renamed from: i  reason: collision with root package name */
        Object f83093i;

        /* renamed from: j  reason: collision with root package name */
        Object f83094j;

        /* renamed from: k  reason: collision with root package name */
        int f83095k;

        /* renamed from: l  reason: collision with root package name */
        int f83096l;

        /* renamed from: m  reason: collision with root package name */
        int f83097m;

        /* renamed from: n  reason: collision with root package name */
        int f83098n;

        /* renamed from: o  reason: collision with root package name */
        int f83099o;

        /* renamed from: p  reason: collision with root package name */
        int f83100p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f83101q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f83102r;

        p(C17164e<? super p> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super Jq.d<T>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            p pVar = new p(eVar);
            pVar.f83101q = hVar;
            pVar.f83102r = th2;
            return pVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f83100p
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r1 = r0.f83093i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f83092h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f83091g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f83090f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f83089e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f83088d
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f83087c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f83102r
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f83101q
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r20)
                goto L_0x012f
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f83101q
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r4 = r0.f83102r
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                qv.e r11 = qv.e.WARN
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x005c:
                boolean r6 = r5.hasNext()
                r13 = 0
                if (r6 == 0) goto L_0x0074
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r11, r13)
                if (r7 == 0) goto L_0x005c
                r12.add(r6)
                goto L_0x005c
            L_0x0074:
                java.util.Iterator r14 = r12.iterator()
                r15 = 0
                r7 = r12
                r5 = r15
                r6 = r5
            L_0x007c:
                boolean r8 = r14.hasNext()
                r9 = 2
                if (r8 == 0) goto L_0x0103
                java.lang.Object r16 = r14.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x009d
                java.lang.String r8 = "Exception caught while loading resource"
                java.lang.String r8 = qv.C11818a.a(r8, r4)
                if (r8 != 0) goto L_0x0099
                r7 = r16
                goto L_0x0103
            L_0x0099:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x009d:
                r17 = r5
                if (r6 != 0) goto L_0x00ee
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r9, r15)
                r8 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r8, r15, r9, r15)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x00bf
                goto L_0x00c5
            L_0x00bf:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x00c5:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                if (r6 == 0) goto L_0x00d8
                java.lang.String r6 = "m"
                goto L_0x00da
            L_0x00d8:
                java.lang.String r6 = "b"
            L_0x00da:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x00ee:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r11
                r7 = r18
                r9 = r4
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                goto L_0x007c
            L_0x0103:
                Jq.d$b r8 = new Jq.d$b
                r8.<init>(r4, r15, r9, r15)
                r0.f83101q = r2
                r0.f83102r = r4
                r0.f83087c = r2
                r0.f83088d = r2
                r0.f83089e = r11
                r0.f83090f = r5
                r0.f83091g = r6
                r0.f83092h = r12
                r0.f83093i = r14
                r0.f83094j = r7
                r0.f83095k = r13
                r0.f83096l = r13
                r0.f83097m = r13
                r0.f83098n = r13
                r0.f83099o = r13
                r0.f83100p = r3
                java.lang.Object r2 = r2.emit(r8, r0)
                if (r2 != r1) goto L_0x012f
                return r1
            L_0x012f:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Kq.b.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.datalayer.impl.FamilyRewardsRepositoryImpl", f = "FamilyRewardsRepositoryImpl.kt", l = {193}, m = "withLockOrIgnore")
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f83103c;

        /* renamed from: d  reason: collision with root package name */
        Object f83104d;

        /* renamed from: e  reason: collision with root package name */
        Object f83105e;

        /* renamed from: f  reason: collision with root package name */
        Object f83106f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f83107g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f83108h;

        /* renamed from: i  reason: collision with root package name */
        int f83109i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar, C17164e<? super q> eVar) {
            super(eVar);
            this.f83108h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f83107g = obj;
            this.f83109i |= Integer.MIN_VALUE;
            return this.f83108h.v((C17052a) null, (C17642l<? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    public b(Pq.c cVar, Pq.a aVar, Jq.b bVar, Nq.e eVar, Nq.c cVar2) {
        C17542s.j(cVar, "remoteSource");
        C17542s.j(aVar, "localCache");
        C17542s.j(bVar, "familyRewardsIntegration");
        C17542s.j(eVar, "familyRewardsDataMapper");
        C17542s.j(cVar2, "familyRewardMapper");
        this.f82926a = cVar;
        this.f82927b = aVar;
        this.f82928c = bVar;
        this.f82929d = eVar;
        this.f82930e = cVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Kq.b.l
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Kq.b$l r0 = (Kq.b.l) r0
            int r1 = r0.f83074g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f83074g = r1
            goto L_0x0018
        L_0x0013:
            Kq.b$l r0 = new Kq.b$l
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f83072e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f83074g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f83071d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f83070c
            Kq.b r6 = (Kq.b) r6
            XH.y.b(r1)
            goto L_0x004f
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Jq.b r1 = r5.f82928c
            TJ.g r1 = r1.isEnabled()
            r0.f83070c = r5
            r0.f83071d = r6
            r0.f83074g = r4
            java.lang.Object r1 = TJ.C16534i.D(r1, r0)
            if (r1 != r2) goto L_0x004f
            return r2
        L_0x004f:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Kq.b.s(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final <T> C16532g<d.C1628d<T>> t(C16532g<? extends T> gVar) {
        return new m(gVar);
    }

    private final <T> C16532g<Jq.d<T>> u(nI.p<? super C16533h<? super Jq.d<T>>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        return C16534i.g0(this.f82928c.isEnabled(), new n((C17164e) null, pVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(bK.C17052a r13, nI.C17642l<? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r14, dI.C17164e<? super java.lang.Boolean> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof Kq.b.q
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Kq.b$q r0 = (Kq.b.q) r0
            int r1 = r0.f83109i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f83109i = r1
            goto L_0x0018
        L_0x0013:
            Kq.b$q r0 = new Kq.b$q
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f83107g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f83109i
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            java.lang.Object r13 = r0.f83106f
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f83105e
            nI.l r13 = (nI.C17642l) r13
            java.lang.Object r13 = r0.f83104d
            bK.a r13 = (bK.C17052a) r13
            java.lang.Object r14 = r0.f83103c
            Kq.b r14 = (Kq.b) r14
            XH.y.b(r1)     // Catch:{ all -> 0x003a }
            goto L_0x005e
        L_0x003a:
            r14 = move-exception
            goto L_0x0066
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0044:
            XH.y.b(r1)
            boolean r1 = bK.C17052a.C3460a.b(r13, r5, r4, r5)
            if (r1 == 0) goto L_0x006a
            r0.f83103c = r12     // Catch:{ all -> 0x003a }
            r0.f83104d = r13     // Catch:{ all -> 0x003a }
            r0.f83105e = r14     // Catch:{ all -> 0x003a }
            r0.f83106f = r15     // Catch:{ all -> 0x003a }
            r0.f83109i = r4     // Catch:{ all -> 0x003a }
            java.lang.Object r14 = r14.invoke(r0)     // Catch:{ all -> 0x003a }
            if (r14 != r2) goto L_0x005e
            return r2
        L_0x005e:
            bK.C17052a.C3460a.c(r13, r5, r4, r5)
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r13
        L_0x0066:
            bK.C17052a.C3460a.c(r13, r5, r4, r5)
            throw r14
        L_0x006a:
            qv.e r13 = qv.e.DEBUG
            qv.d r14 = qv.d.f102012a
            java.util.List r14 = r14.a()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x007d:
            boolean r0 = r14.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r14.next()
            r2 = r0
            qv.b r2 = (qv.C11819b) r2
            boolean r1 = r2.b(r13, r1)
            if (r1 == 0) goto L_0x007d
            r15.add(r0)
            goto L_0x007d
        L_0x0095:
            java.util.Iterator r14 = r15.iterator()
            r15 = r5
        L_0x009a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r14.next()
            r6 = r0
            qv.b r6 = (qv.C11819b) r6
            r10 = 0
            if (r5 != 0) goto L_0x00b8
            java.lang.String r0 = "Mutex was already locked, ignoring"
            java.lang.String r0 = qv.C11818a.a(r0, r10)
            if (r0 != 0) goto L_0x00b3
            goto L_0x00ed
        L_0x00b3:
            java.lang.String r0 = qv.C11820c.a(r0)
            r5 = r0
        L_0x00b8:
            if (r15 != 0) goto L_0x00e5
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            java.lang.String r0 = "main"
            boolean r15 = HJ.C15854t.b0(r15, r0, r4)
            if (r15 == 0) goto L_0x00cd
            java.lang.String r15 = "m"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r15 = "b"
        L_0x00cf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            java.lang.String r15 = "|"
            r0.append(r15)
            java.lang.String r15 = "FamilyRewardsRepository"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
        L_0x00e5:
            r9 = 0
            r7 = r13
            r8 = r15
            r11 = r5
            r6.a(r7, r8, r9, r10, r11)
            goto L_0x009a
        L_0x00ed:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Kq.b.v(bK.a, nI.l, dI.e):java.lang.Object");
    }

    public Object a(C17164e<? super C16807N> eVar) {
        Object a10 = this.f82927b.a(eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(double r6, dI.C17164e<? super XH.x<java.lang.Integer>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Kq.b.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Kq.b$d r0 = (Kq.b.d) r0
            int r1 = r0.f82949h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f82949h = r1
            goto L_0x0018
        L_0x0013:
            Kq.b$d r0 = new Kq.b$d
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f82947f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f82949h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f82945d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f82944c
            Kq.b r6 = (Kq.b) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0053
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            Pq.c r1 = r5.f82926a
            r0.f82944c = r5
            r0.f82945d = r8
            r0.f82946e = r6
            r0.f82949h = r4
            java.lang.Object r6 = r1.b(r6, r0)
            if (r6 != r2) goto L_0x0053
            return r2
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Kq.b.b(double, dI.e):java.lang.Object");
    }

    public Object c(c.a aVar, C17164e<? super C16807N> eVar) {
        Object r10 = r(aVar, eVar);
        return r10 == C17187b.f() ? r10 : C16807N.f139792a;
    }

    public C16532g<Jq.d<Qq.i>> d() {
        return u(new f(this, (C17164e<? super f>) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: dI.e<? super XH.x<? extends Qq.g>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: Jq.c$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b7 A[SYNTHETIC, Splitter:B:28:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(java.lang.String r9, Jq.c.a r10, dI.C17164e<? super XH.x<? extends Qq.g>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof Kq.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Kq.b$c r0 = (Kq.b.c) r0
            int r1 = r0.f82943l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f82943l = r1
            goto L_0x0018
        L_0x0013:
            Kq.b$c r0 = new Kq.b$c
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f82941j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f82943l
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x007e
            if (r3 == r6) goto L_0x0068
            if (r3 == r5) goto L_0x004e
            if (r3 != r4) goto L_0x0046
            java.lang.Object r9 = r0.f82939h
            Qq.g r9 = (Qq.g) r9
            java.lang.Object r9 = r0.f82938g
            java.lang.Object r10 = r0.f82937f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f82936e
            Jq.c$a r10 = (Jq.c.a) r10
            java.lang.Object r10 = r0.f82935d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f82934c
            Kq.b r10 = (Kq.b) r10
            XH.y.b(r1)
            goto L_0x00fc
        L_0x0046:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004e:
            java.lang.Object r9 = r0.f82937f
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r10 = r0.f82936e
            Jq.c$a r10 = (Jq.c.a) r10
            java.lang.Object r11 = r0.f82935d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.f82934c
            Kq.b r3 = (Kq.b) r3
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x00b1
        L_0x0068:
            java.lang.Object r9 = r0.f82937f
            r11 = r9
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r9 = r0.f82936e
            r10 = r9
            Jq.c$a r10 = (Jq.c.a) r10
            java.lang.Object r9 = r0.f82935d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r0.f82934c
            Kq.b r3 = (Kq.b) r3
            XH.y.b(r1)
            goto L_0x0093
        L_0x007e:
            XH.y.b(r1)
            r0.f82934c = r8
            r0.f82935d = r9
            r0.f82936e = r10
            r0.f82937f = r11
            r0.f82943l = r6
            java.lang.Object r1 = r8.s(r0)
            if (r1 != r2) goto L_0x0092
            return r2
        L_0x0092:
            r3 = r8
        L_0x0093:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00fe
            Pq.c r1 = r3.f82926a
            r0.f82934c = r3
            r0.f82935d = r9
            r0.f82936e = r10
            r0.f82937f = r11
            r0.f82943l = r5
            java.lang.Object r1 = r1.e(r9, r0)
            if (r1 != r2) goto L_0x00ae
            return r2
        L_0x00ae:
            r7 = r11
            r11 = r9
            r9 = r7
        L_0x00b1:
            boolean r5 = XH.x.h(r1)
            if (r5 == 0) goto L_0x00d6
            com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote r1 = (com.ingka.ikea.familyrewards.datalayer.impl.remote.RewardRemote) r1     // Catch:{ all -> 0x00c6 }
            Nq.c r5 = r3.f82930e     // Catch:{ all -> 0x00c6 }
            Qq.g r1 = r5.a(r1)     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = XH.x.b(r1)     // Catch:{ all -> 0x00c6 }
            goto L_0x00da
        L_0x00c6:
            r1 = move-exception
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c6 }
            r5.<init>(r1)     // Catch:{ all -> 0x00c6 }
            throw r5     // Catch:{ all -> 0x00c6 }
        L_0x00d0:
            XH.x$a r5 = XH.x.f139812b
            java.lang.Object r1 = XH.y.a(r1)
        L_0x00d6:
            java.lang.Object r1 = XH.x.b(r1)
        L_0x00da:
            boolean r5 = XH.x.h(r1)
            if (r5 == 0) goto L_0x010f
            r5 = r1
            Qq.g r5 = (Qq.g) r5
            r0.f82934c = r3
            r0.f82935d = r11
            r0.f82936e = r10
            r0.f82937f = r9
            r0.f82938g = r1
            r0.f82939h = r5
            r9 = 0
            r0.f82940i = r9
            r0.f82943l = r4
            java.lang.Object r9 = r3.c(r10, r0)
            if (r9 != r2) goto L_0x00fb
            return r2
        L_0x00fb:
            r9 = r1
        L_0x00fc:
            r1 = r9
            goto L_0x010f
        L_0x00fe:
            XH.x$a r9 = XH.x.f139812b
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Not allowed to claim reward"
            r9.<init>(r10)
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r1 = XH.x.b(r9)
        L_0x010f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Kq.b.e(java.lang.String, Jq.c$a, dI.e):java.lang.Object");
    }

    public C16532g<Jq.d<Qq.k>> f(c.a aVar) {
        return u(new h(this, aVar, (C17164e<? super h>) null));
    }

    public C16532g<Jq.d<Qq.g>> g(String str, c.a aVar) {
        C17542s.j(str, "id");
        return u(new e(this, aVar, str, (C17164e<? super e>) null));
    }

    public C16532g<Jq.d<Qq.l>> h() {
        return u(new g(this, (C17164e<? super g>) null));
    }

    public C16532g<Qq.o> i() {
        return C16534i.H(new i(this, (C17164e<? super i>) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: dI.e<? super Kq.b$b>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(Jq.c.a r14, dI.C17164e<? super Kq.b.C1648b> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Kq.b.j
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Kq.b$j r0 = (Kq.b.j) r0
            int r1 = r0.f83049i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f83049i = r1
            goto L_0x0018
        L_0x0013:
            Kq.b$j r0 = new Kq.b$j
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f83047g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f83049i
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x0055
            if (r3 == r4) goto L_0x0044
            if (r3 != r5) goto L_0x003c
            java.lang.Object r14 = r0.f83046f
            kotlin.jvm.internal.O r14 = (kotlin.jvm.internal.O) r14
            java.lang.Object r15 = r0.f83045e
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r0.f83044d
            Jq.c$a r15 = (Jq.c.a) r15
            java.lang.Object r15 = r0.f83043c
            Kq.b r15 = (Kq.b) r15
            XH.y.b(r1)
            goto L_0x0093
        L_0x003c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0044:
            java.lang.Object r14 = r0.f83045e
            r15 = r14
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r14 = r0.f83044d
            Jq.c$a r14 = (Jq.c.a) r14
            java.lang.Object r3 = r0.f83043c
            Kq.b r3 = (Kq.b) r3
            XH.y.b(r1)
            goto L_0x0068
        L_0x0055:
            XH.y.b(r1)
            r0.f83043c = r13
            r0.f83044d = r14
            r0.f83045e = r15
            r0.f83049i = r4
            java.lang.Object r1 = r13.s(r0)
            if (r1 != r2) goto L_0x0067
            return r2
        L_0x0067:
            r3 = r13
        L_0x0068:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r6 = 0
            if (r1 == 0) goto L_0x0096
            kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
            r1.<init>()
            Kq.b$b r4 = Kq.b.C1648b.RequestInProgress
            r1.f144348a = r4
            bK.a r4 = r3.f82932g
            Kq.b$k r7 = new Kq.b$k
            r7.<init>(r1, r3, r14, r6)
            r0.f83043c = r3
            r0.f83044d = r14
            r0.f83045e = r15
            r0.f83046f = r1
            r0.f83049i = r5
            java.lang.Object r14 = r3.v(r4, r7, r0)
            if (r14 != r2) goto L_0x0092
            return r2
        L_0x0092:
            r14 = r1
        L_0x0093:
            T r14 = r14.f144348a
            return r14
        L_0x0096:
            qv.e r14 = qv.e.INFO
            qv.d r15 = qv.d.f102012a
            java.util.List r15 = r15.a()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x00a9:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x00c1
            java.lang.Object r1 = r15.next()
            r2 = r1
            qv.b r2 = (qv.C11819b) r2
            r7 = 0
            boolean r2 = r2.b(r14, r7)
            if (r2 == 0) goto L_0x00a9
            r0.add(r1)
            goto L_0x00a9
        L_0x00c1:
            java.util.Iterator r15 = r0.iterator()
            r0 = r6
            r1 = r0
        L_0x00c7:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x013b
            java.lang.Object r2 = r15.next()
            r7 = r2
            qv.b r7 = (qv.C11819b) r7
            r11 = 0
            if (r0 != 0) goto L_0x00e4
            java.lang.String r0 = "Not a family user, do not fetch family rewards"
            java.lang.String r0 = qv.C11818a.a(r0, r11)
            if (r0 != 0) goto L_0x00e0
            goto L_0x013b
        L_0x00e0:
            java.lang.String r0 = qv.C11820c.a(r0)
        L_0x00e4:
            if (r1 != 0) goto L_0x0133
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r2 = 36
            java.lang.String r2 = HJ.C15854t.s1(r1, r2, r6, r5, r6)
            r8 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r8, r6, r5, r6)
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0104
            goto L_0x010a
        L_0x0104:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r2, r1)
        L_0x010a:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.String r8 = "main"
            boolean r2 = HJ.C15854t.b0(r2, r8, r4)
            if (r2 == 0) goto L_0x011d
            java.lang.String r2 = "m"
            goto L_0x011f
        L_0x011d:
            java.lang.String r2 = "b"
        L_0x011f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r2 = "|"
            r8.append(r2)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
        L_0x0133:
            r10 = 0
            r8 = r14
            r9 = r1
            r12 = r0
            r7.a(r8, r9, r10, r11, r12)
            goto L_0x00c7
        L_0x013b:
            Kq.b$b r14 = Kq.b.C1648b.NotEligible
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Kq.b.r(Jq.c$a, dI.e):java.lang.Object");
    }
}
