package TJ;

import QJ.Q;
import SJ.C16422A;
import SJ.C16428d;
import UJ.C16613f;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "LTJ/h;", "LSJ/A;", "channel", "LXH/N;", "c", "(LTJ/h;LSJ/A;LdI/e;)Ljava/lang/Object;", "", "consume", "d", "(LTJ/h;LSJ/A;ZLdI/e;)Ljava/lang/Object;", "LTJ/g;", "f", "(LSJ/A;)LTJ/g;", "b", "LQJ/Q;", "scope", "e", "(LTJ/g;LQJ/Q;)LSJ/A;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.k  reason: case insensitive filesystem */
final /* synthetic */ class C16536k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: TJ.k$a */
    static final class a<T> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f138654c;

        /* renamed from: d  reason: collision with root package name */
        Object f138655d;

        /* renamed from: e  reason: collision with root package name */
        Object f138656e;

        /* renamed from: f  reason: collision with root package name */
        boolean f138657f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f138658g;

        /* renamed from: h  reason: collision with root package name */
        int f138659h;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f138658g = obj;
            this.f138659h |= Integer.MIN_VALUE;
            return C16536k.d((C16533h) null, (C16422A) null, false, this);
        }
    }

    public static final <T> C16532g<T> b(C16422A<? extends T> a10) {
        return new C16528c(a10, true, (C17168i) null, 0, (C16428d) null, 28, (DefaultConstructorMarker) null);
    }

    public static final <T> Object c(C16533h<? super T> hVar, C16422A<? extends T> a10, C17164e<? super C16807N> eVar) {
        Object d10 = d(hVar, a10, true, eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r8 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        SJ.C16440p.a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ all -> 0x009e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object d(TJ.C16533h<? super T> r6, SJ.C16422A<? extends T> r7, boolean r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            boolean r0 = r9 instanceof TJ.C16536k.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            TJ.k$a r0 = (TJ.C16536k.a) r0
            int r1 = r0.f138659h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138659h = r1
            goto L_0x0018
        L_0x0013:
            TJ.k$a r0 = new TJ.k$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f138658g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138659h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            boolean r8 = r0.f138657f
            java.lang.Object r6 = r0.f138656e
            SJ.l r6 = (SJ.C16436l) r6
            java.lang.Object r7 = r0.f138655d
            SJ.A r7 = (SJ.C16422A) r7
            java.lang.Object r2 = r0.f138654c
            TJ.h r2 = (TJ.C16533h) r2
            XH.y.b(r9)     // Catch:{ all -> 0x003c }
        L_0x0039:
            r9 = r6
            r6 = r2
            goto L_0x0062
        L_0x003c:
            r6 = move-exception
            goto L_0x009d
        L_0x003e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0046:
            boolean r8 = r0.f138657f
            java.lang.Object r6 = r0.f138656e
            SJ.l r6 = (SJ.C16436l) r6
            java.lang.Object r7 = r0.f138655d
            SJ.A r7 = (SJ.C16422A) r7
            java.lang.Object r2 = r0.f138654c
            TJ.h r2 = (TJ.C16533h) r2
            XH.y.b(r9)     // Catch:{ all -> 0x003c }
            goto L_0x0077
        L_0x0058:
            XH.y.b(r9)
            TJ.C16534i.z(r6)
            SJ.l r9 = r7.iterator()     // Catch:{ all -> 0x003c }
        L_0x0062:
            r0.f138654c = r6     // Catch:{ all -> 0x003c }
            r0.f138655d = r7     // Catch:{ all -> 0x003c }
            r0.f138656e = r9     // Catch:{ all -> 0x003c }
            r0.f138657f = r8     // Catch:{ all -> 0x003c }
            r0.f138659h = r4     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r9.a(r0)     // Catch:{ all -> 0x003c }
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L_0x0077:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x003c }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x0094
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x003c }
            r0.f138654c = r2     // Catch:{ all -> 0x003c }
            r0.f138655d = r7     // Catch:{ all -> 0x003c }
            r0.f138656e = r6     // Catch:{ all -> 0x003c }
            r0.f138657f = r8     // Catch:{ all -> 0x003c }
            r0.f138659h = r3     // Catch:{ all -> 0x003c }
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch:{ all -> 0x003c }
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x0094:
            if (r8 == 0) goto L_0x009a
            r6 = 0
            SJ.C16440p.a(r7, r6)
        L_0x009a:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x009d:
            throw r6     // Catch:{ all -> 0x009e }
        L_0x009e:
            r9 = move-exception
            if (r8 == 0) goto L_0x00a4
            SJ.C16440p.a(r7, r6)
        L_0x00a4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16536k.d(TJ.h, SJ.A, boolean, dI.e):java.lang.Object");
    }

    public static final <T> C16422A<T> e(C16532g<? extends T> gVar, Q q10) {
        return C16613f.b(gVar).n(q10);
    }

    public static final <T> C16532g<T> f(C16422A<? extends T> a10) {
        return new C16528c(a10, false, (C17168i) null, 0, (C16428d) null, 28, (DefaultConstructorMarker) null);
    }
}
