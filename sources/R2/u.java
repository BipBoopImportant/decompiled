package R2;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"LR2/u;", "LR2/n;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "LdI/e;", "", "block", "c", "(LnI/l;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "a", "(LnI/p;LdI/e;)Ljava/lang/Object;", "", "e", "(LdI/e;)Ljava/lang/Object;", "d", "Ljava/lang/String;", "LbK/a;", "b", "LbK/a;", "mutex", "LR2/a;", "LR2/a;", "version", "LTJ/g;", "LXH/N;", "LTJ/g;", "()LTJ/g;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u implements n {

    /* renamed from: a  reason: collision with root package name */
    private final String f12491a;

    /* renamed from: b  reason: collision with root package name */
    private final C17052a f12492b = g.b(false, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final C4797a f12493c = new C4797a(0);

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<C16807N> f12494d = C16534i.H(new c((C17164e<? super c>) null));

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
    static final class a<T> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f12495c;

        /* renamed from: d  reason: collision with root package name */
        Object f12496d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f12497e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f12498f;

        /* renamed from: g  reason: collision with root package name */
        int f12499g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f12498f = uVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12497e = obj;
            this.f12499g |= Integer.MIN_VALUE;
            return this.f12498f.c((C17642l) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
    static final class b<T> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f12500c;

        /* renamed from: d  reason: collision with root package name */
        boolean f12501d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f12502e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f12503f;

        /* renamed from: g  reason: collision with root package name */
        int f12504g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u uVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f12503f = uVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12502e = obj;
            this.f12504g |= Integer.MIN_VALUE;
            return this.f12503f.a((p) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<C16533h<? super C16807N>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12505c;

        c(C17164e<? super c> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(eVar);
        }

        public final Object invoke(C16533h<? super C16807N> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f12505c == 0) {
                y.b(obj);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public u(String str) {
        C17542s.j(str, "filePath");
        this.f12491a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> java.lang.Object a(nI.p<? super java.lang.Boolean, ? super dI.C17164e<? super T>, ? extends java.lang.Object> r7, dI.C17164e<? super T> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof R2.u.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            R2.u$b r0 = (R2.u.b) r0
            int r1 = r0.f12504g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12504g = r1
            goto L_0x0018
        L_0x0013:
            R2.u$b r0 = new R2.u$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12502e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12504g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r7 = r0.f12501d
            java.lang.Object r0 = r0.f12500c
            bK.a r0 = (bK.C17052a) r0
            XH.y.b(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0057
        L_0x0030:
            r8 = move-exception
            goto L_0x0061
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            XH.y.b(r8)
            bK.a r8 = r6.f12492b
            boolean r2 = r8.a(r4)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch:{ all -> 0x005d }
            r0.f12500c = r8     // Catch:{ all -> 0x005d }
            r0.f12501d = r2     // Catch:{ all -> 0x005d }
            r0.f12504g = r3     // Catch:{ all -> 0x005d }
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch:{ all -> 0x005d }
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r8
            r8 = r7
            r7 = r2
        L_0x0057:
            if (r7 == 0) goto L_0x005c
            r0.d(r4)
        L_0x005c:
            return r8
        L_0x005d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L_0x0061:
            if (r7 == 0) goto L_0x0066
            r0.d(r4)
        L_0x0066:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.u.a(nI.p, dI.e):java.lang.Object");
    }

    public C16532g<C16807N> b() {
        return this.f12494d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> java.lang.Object c(nI.C17642l<? super dI.C17164e<? super T>, ? extends java.lang.Object> r8, dI.C17164e<? super T> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof R2.u.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            R2.u$a r0 = (R2.u.a) r0
            int r1 = r0.f12499g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12499g = r1
            goto L_0x0018
        L_0x0013:
            R2.u$a r0 = new R2.u$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f12497e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f12499g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.f12495c
            bK.a r8 = (bK.C17052a) r8
            XH.y.b(r9)     // Catch:{ all -> 0x0031 }
            goto L_0x006b
        L_0x0031:
            r9 = move-exception
            goto L_0x0073
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.f12496d
            bK.a r8 = (bK.C17052a) r8
            java.lang.Object r2 = r0.f12495c
            nI.l r2 = (nI.C17642l) r2
            XH.y.b(r9)
            r9 = r8
            r8 = r2
            goto L_0x005b
        L_0x0049:
            XH.y.b(r9)
            bK.a r9 = r7.f12492b
            r0.f12495c = r8
            r0.f12496d = r9
            r0.f12499g = r4
            java.lang.Object r2 = r9.e(r5, r0)
            if (r2 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r0.f12495c = r9     // Catch:{ all -> 0x006f }
            r0.f12496d = r5     // Catch:{ all -> 0x006f }
            r0.f12499g = r3     // Catch:{ all -> 0x006f }
            java.lang.Object r8 = r8.invoke(r0)     // Catch:{ all -> 0x006f }
            if (r8 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x006b:
            r8.d(r5)
            return r9
        L_0x006f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0073:
            r8.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.u.c(nI.l, dI.e):java.lang.Object");
    }

    public Object d(C17164e<? super Integer> eVar) {
        return kotlin.coroutines.jvm.internal.b.e(this.f12493c.d());
    }

    public Object e(C17164e<? super Integer> eVar) {
        return kotlin.coroutines.jvm.internal.b.e(this.f12493c.b());
    }
}
