package TJ;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000HA¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LTJ/U;", "T", "LTJ/h;", "collector", "Lkotlin/Function2;", "LdI/e;", "LXH/N;", "", "action", "<init>", "(LTJ/h;LnI/p;)V", "c", "(LdI/e;)Ljava/lang/Object;", "value", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LTJ/h;", "b", "LnI/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.U  reason: case insensitive filesystem */
public final class C16523U<T> implements C16533h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16533h<T> f138603a;

    /* renamed from: b  reason: collision with root package name */
    private final p<C16533h<? super T>, C17164e<? super C16807N>, Object> f138604b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {418, 422}, m = "onSubscription")
    /* renamed from: TJ.U$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f138605c;

        /* renamed from: d  reason: collision with root package name */
        Object f138606d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f138607e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16523U<T> f138608f;

        /* renamed from: g  reason: collision with root package name */
        int f138609g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16523U<T> u10, C17164e<? super a> eVar) {
            super(eVar);
            this.f138608f = u10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f138607e = obj;
            this.f138609g |= Integer.MIN_VALUE;
            return this.f138608f.c(this);
        }
    }

    public C16523U(C16533h<? super T> hVar, p<? super C16533h<? super T>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        this.f138603a = hVar;
        this.f138604b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof TJ.C16523U.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            TJ.U$a r0 = (TJ.C16523U.a) r0
            int r1 = r0.f138609g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138609g = r1
            goto L_0x0018
        L_0x0013:
            TJ.U$a r0 = new TJ.U$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f138607e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138609g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r7)
            goto L_0x0079
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.f138606d
            UJ.v r2 = (UJ.C16629v) r2
            java.lang.Object r4 = r0.f138605c
            TJ.U r4 = (TJ.C16523U) r4
            XH.y.b(r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0060
        L_0x0040:
            r7 = move-exception
            goto L_0x007f
        L_0x0042:
            XH.y.b(r7)
            UJ.v r2 = new UJ.v
            TJ.h<T> r7 = r6.f138603a
            dI.i r5 = r0.getContext()
            r2.<init>(r7, r5)
            nI.p<TJ.h<? super T>, dI.e<? super XH.N>, java.lang.Object> r7 = r6.f138604b     // Catch:{ all -> 0x0040 }
            r0.f138605c = r6     // Catch:{ all -> 0x0040 }
            r0.f138606d = r2     // Catch:{ all -> 0x0040 }
            r0.f138609g = r4     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x0040 }
            if (r7 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r4 = r6
        L_0x0060:
            r2.releaseIntercepted()
            TJ.h<T> r7 = r4.f138603a
            boolean r2 = r7 instanceof TJ.C16523U
            if (r2 == 0) goto L_0x007c
            TJ.U r7 = (TJ.C16523U) r7
            r2 = 0
            r0.f138605c = r2
            r0.f138606d = r2
            r0.f138609g = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L_0x0079
            return r1
        L_0x0079:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x007c:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x007f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16523U.c(dI.e):java.lang.Object");
    }

    public Object emit(T t10, C17164e<? super C16807N> eVar) {
        return this.f138603a.emit(t10, eVar);
    }
}
