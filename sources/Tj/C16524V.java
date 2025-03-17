package TJ;

import XH.C16807N;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R6\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTJ/V;", "T", "LTJ/F;", "sharedFlow", "Lkotlin/Function2;", "LTJ/h;", "LdI/e;", "LXH/N;", "", "action", "<init>", "(LTJ/F;LnI/p;)V", "collector", "", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "a", "LTJ/F;", "b", "LnI/p;", "", "c", "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.V  reason: case insensitive filesystem */
final class C16524V<T> implements C16509F<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16509F<T> f138610a;

    /* renamed from: b  reason: collision with root package name */
    private final p<C16533h<? super T>, C17164e<? super C16807N>, Object> f138611b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {408}, m = "collect")
    /* renamed from: TJ.V$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f138612c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16524V<T> f138613d;

        /* renamed from: e  reason: collision with root package name */
        int f138614e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16524V<T> v10, C17164e<? super a> eVar) {
            super(eVar);
            this.f138613d = v10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f138612c = obj;
            this.f138614e |= Integer.MIN_VALUE;
            return this.f138613d.collect((C16533h) null, this);
        }
    }

    public C16524V(C16509F<? extends T> f10, p<? super C16533h<? super T>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        this.f138610a = f10;
        this.f138611b = pVar;
    }

    public List<T> c() {
        return this.f138610a.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(TJ.C16533h<? super T> r6, dI.C17164e<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof TJ.C16524V.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            TJ.V$a r0 = (TJ.C16524V.a) r0
            int r1 = r0.f138614e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138614e = r1
            goto L_0x0018
        L_0x0013:
            TJ.V$a r0 = new TJ.V$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f138612c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138614e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            XH.y.b(r7)
            goto L_0x0046
        L_0x0031:
            XH.y.b(r7)
            TJ.F<T> r7 = r5.f138610a
            TJ.U r2 = new TJ.U
            nI.p<TJ.h<? super T>, dI.e<? super XH.N>, java.lang.Object> r4 = r5.f138611b
            r2.<init>(r6, r4)
            r0.f138614e = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16524V.collect(TJ.h, dI.e):java.lang.Object");
    }
}
