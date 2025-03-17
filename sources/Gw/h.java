package gw;

import XH.t;
import aA.C13909a;
import am.C11070a;
import dI.C17164e;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgw/h;", "Lgw/g;", "Lew/a;", "endpoint", "Lam/a;", "appApi", "LaA/a;", "sessionManager", "<init>", "(Lew/a;Lam/a;LaA/a;)V", "Lgw/h$a;", "b", "()Lgw/h$a;", "Lcom/ingka/ikea/messagecenter/impl/data/endpoint/MessagesRemote;", "a", "(LdI/e;)Ljava/lang/Object;", "Lew/a;", "Lam/a;", "c", "LaA/a;", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ew.a f73494a;

    /* renamed from: b  reason: collision with root package name */
    private final C11070a f73495b;

    /* renamed from: c  reason: collision with root package name */
    private final C13909a f73496c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lgw/h$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "FAMILY", "REGULAR", "GUEST", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        FAMILY("FAMILY"),
        REGULAR("REGULAR"),
        GUEST("UNREGISTERED");
        
        private final String value;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73497a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aA.b r1 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                aA.b r1 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                aA.b r1 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f73497a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.h.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.messagecenter.impl.data.source.MessagesRemoteSourceImpl", f = "MessagesRemoteSource.kt", l = {26}, m = "getMessages")
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f73498c;

        /* renamed from: d  reason: collision with root package name */
        Object f73499d;

        /* renamed from: e  reason: collision with root package name */
        Object f73500e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f73501f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f73502g;

        /* renamed from: h  reason: collision with root package name */
        int f73503h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f73502g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f73501f = obj;
            this.f73503h |= Integer.MIN_VALUE;
            return this.f73502g.a(this);
        }
    }

    public h(ew.a aVar, C11070a aVar2, C13909a aVar3) {
        C17542s.j(aVar, "endpoint");
        C17542s.j(aVar2, "appApi");
        C17542s.j(aVar3, "sessionManager");
        this.f73494a = aVar;
        this.f73495b = aVar2;
        this.f73496c = aVar3;
    }

    private final a b() {
        int i10 = b.f73497a[this.f73496c.o().ordinal()];
        if (i10 == 1) {
            return a.FAMILY;
        }
        if (i10 == 2) {
            return a.REGULAR;
        }
        if (i10 == 3) {
            return a.GUEST;
        }
        throw new t();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof gw.h.c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            gw.h$c r0 = (gw.h.c) r0
            int r1 = r0.f73503h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f73503h = r1
            goto L_0x0018
        L_0x0013:
            gw.h$c r0 = new gw.h$c
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f73501f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f73503h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r9 = r0.f73500e
            XH.v[] r9 = (XH.v[]) r9
            java.lang.Object r9 = r0.f73499d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f73498c
            gw.h r9 = (gw.h) r9
            XH.y.b(r1)
            goto L_0x007b
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003d:
            XH.y.b(r1)
            ew.a r1 = r8.f73494a
            am.a r3 = r8.f73495b
            java.lang.String r3 = r3.a()
            java.lang.String r5 = "version"
            XH.v r3 = XH.C16796C.a(r5, r3)
            java.lang.String r5 = "platform"
            java.lang.String r6 = "android"
            XH.v r5 = XH.C16796C.a(r5, r6)
            gw.h$a r6 = r8.b()
            java.lang.String r6 = r6.b()
            java.lang.String r7 = "userType"
            XH.v r6 = XH.C16796C.a(r7, r6)
            XH.v[] r3 = new XH.v[]{r3, r5, r6}
            java.util.Map r5 = YH.X.m(r3)
            r0.f73498c = r8
            r0.f73499d = r9
            r0.f73500e = r3
            r0.f73503h = r4
            java.lang.Object r1 = r1.a(r5, r0)
            if (r1 != r2) goto L_0x007b
            return r2
        L_0x007b:
            QL.x r1 = (QL.x) r1
            java.lang.Object r9 = r1.a()
            com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote r9 = (com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote) r9
            if (r9 != 0) goto L_0x009b
            com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote r9 = new com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote
            com.ingka.ikea.messagecenter.impl.data.endpoint.MessageListsRemote r0 = new com.ingka.ikea.messagecenter.impl.data.endpoint.MessageListsRemote
            java.util.List r1 = YH.C16877v.n()
            java.util.List r2 = YH.C16877v.n()
            java.util.List r3 = YH.C16877v.n()
            r0.<init>(r1, r2, r3)
            r9.<init>(r0)
        L_0x009b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.h.a(dI.e):java.lang.Object");
    }
}
