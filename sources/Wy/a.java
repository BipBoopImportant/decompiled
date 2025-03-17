package Wy;

import QJ.C16310i;
import QJ.M;
import QJ.Q;
import TJ.C16532g;
import Ty.b;
import XH.C16807N;
import Xy.c;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00178\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"LWy/a;", "LTy/b;", "LXy/a;", "localDataSource", "LXy/c;", "remoteDataSource", "LQJ/M;", "ioDispatcher", "<init>", "(LXy/a;LXy/c;LQJ/M;)V", "", "storeId", "", "LTy/a;", "items", "LTy/c;", "b", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "a", "LXy/a;", "LXy/c;", "c", "LQJ/M;", "LTJ/g;", "d", "LTJ/g;", "()LTJ/g;", "pickupWaitingTime", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Xy.a f117749a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f117750b;

    /* renamed from: c  reason: collision with root package name */
    private final M f117751c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<Ty.c> f117752d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LTy/c;", "<anonymous>", "(LQJ/Q;)LTy/c;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.repo.ScanAndGoFullServePickupWaitingTimeRepositoryImpl$updatePickupWaitingTime$2", f = "ScanAndGoFullServePickupWaitingTimeRepositoryImpl.kt", l = {32, 37}, m = "invokeSuspend")
    /* renamed from: Wy.a$a  reason: collision with other inner class name */
    static final class C2909a extends l implements p<Q, C17164e<? super Ty.c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f117753c;

        /* renamed from: d  reason: collision with root package name */
        Object f117754d;

        /* renamed from: e  reason: collision with root package name */
        Object f117755e;

        /* renamed from: f  reason: collision with root package name */
        Object f117756f;

        /* renamed from: g  reason: collision with root package name */
        Object f117757g;

        /* renamed from: h  reason: collision with root package name */
        int f117758h;

        /* renamed from: i  reason: collision with root package name */
        int f117759i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List<Ty.a> f117760j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a f117761k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f117762l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2909a(List<Ty.a> list, a aVar, String str, C17164e<? super C2909a> eVar) {
            super(2, eVar);
            this.f117760j = list;
            this.f117761k = aVar;
            this.f117762l = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2909a(this.f117760j, this.f117761k, this.f117762l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Ty.c> eVar) {
            return ((C2909a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f117759i
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x003f
                if (r1 == r4) goto L_0x0027
                if (r1 != r3) goto L_0x001f
                java.lang.Object r0 = r7.f117755e
                Ty.c r0 = (Ty.c) r0
                java.lang.Object r0 = r7.f117754d
                Wy.a r0 = (Wy.a) r0
                java.lang.Object r0 = r7.f117753c
                Ty.c r0 = (Ty.c) r0
                XH.y.b(r8)
                goto L_0x008b
            L_0x001f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0027:
                java.lang.Object r1 = r7.f117757g
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r7.f117756f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r7.f117755e
                Wy.a r1 = (Wy.a) r1
                java.lang.Object r1 = r7.f117754d
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r7.f117753c
                java.util.List r1 = (java.util.List) r1
                XH.y.b(r8)
                goto L_0x006f
            L_0x003f:
                XH.y.b(r8)
                java.util.List<Ty.a> r8 = r7.f117760j
                r1 = r8
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                r5 = 0
                if (r1 != 0) goto L_0x004f
                goto L_0x0050
            L_0x004f:
                r8 = r5
            L_0x0050:
                if (r8 == 0) goto L_0x0072
                Wy.a r1 = r7.f117761k
                java.lang.String r5 = r7.f117762l
                Xy.c r6 = r1.f117750b
                r7.f117753c = r8
                r7.f117754d = r8
                r7.f117755e = r1
                r7.f117756f = r5
                r7.f117757g = r8
                r7.f117758h = r2
                r7.f117759i = r4
                java.lang.Object r8 = r6.a(r5, r8, r7)
                if (r8 != r0) goto L_0x006f
                return r0
            L_0x006f:
                Ty.c r8 = (Ty.c) r8
                goto L_0x0073
            L_0x0072:
                r8 = r5
            L_0x0073:
                Wy.a r1 = r7.f117761k
                Xy.a r4 = r1.f117749a
                r7.f117753c = r8
                r7.f117754d = r1
                r7.f117755e = r8
                r7.f117758h = r2
                r7.f117759i = r3
                java.lang.Object r1 = r4.b(r8, r7)
                if (r1 != r0) goto L_0x008a
                return r0
            L_0x008a:
                r0 = r8
            L_0x008b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Wy.a.C2909a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Xy.a aVar, c cVar, M m10) {
        C17542s.j(aVar, "localDataSource");
        C17542s.j(cVar, "remoteDataSource");
        C17542s.j(m10, "ioDispatcher");
        this.f117749a = aVar;
        this.f117750b = cVar;
        this.f117751c = m10;
        this.f117752d = aVar.a();
    }

    public C16532g<Ty.c> a() {
        return this.f117752d;
    }

    public Object b(String str, List<Ty.a> list, C17164e<? super Ty.c> eVar) {
        return C16310i.g(this.f117751c, new C2909a(list, this, str, (C17164e<? super C2909a>) null), eVar);
    }
}
