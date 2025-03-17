package TJ;

import SJ.C16428d;
import SJ.C16449y;
import UJ.C16612e;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LTJ/b;", "T", "LTJ/d;", "Lkotlin/Function2;", "LSJ/y;", "LdI/e;", "LXH/N;", "", "block", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "<init>", "(LnI/p;LdI/i;ILSJ/d;)V", "scope", "i", "(LSJ/y;LdI/e;)Ljava/lang/Object;", "LUJ/e;", "j", "(LdI/i;ILSJ/d;)LUJ/e;", "e", "LnI/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.b  reason: case insensitive filesystem */
final class C16527b<T> extends C16529d<T> {

    /* renamed from: e  reason: collision with root package name */
    private final p<C16449y<? super T>, C17164e<? super C16807N>, Object> f138620e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    /* renamed from: TJ.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f138621c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f138622d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16527b<T> f138623e;

        /* renamed from: f  reason: collision with root package name */
        int f138624f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16527b<T> bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f138623e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f138622d = obj;
            this.f138624f |= Integer.MIN_VALUE;
            return this.f138623e.i((C16449y) null, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16527b(p pVar, C17168i iVar, int i10, C16428d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i11 & 2) != 0 ? C17169j.f142968a : iVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? C16428d.SUSPEND : dVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object i(SJ.C16449y<? super T> r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof TJ.C16527b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            TJ.b$a r0 = (TJ.C16527b.a) r0
            int r1 = r0.f138624f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138624f = r1
            goto L_0x0018
        L_0x0013:
            TJ.b$a r0 = new TJ.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f138622d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138624f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f138621c
            SJ.y r5 = (SJ.C16449y) r5
            XH.y.b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            XH.y.b(r6)
            r0.f138621c = r5
            r0.f138624f = r3
            java.lang.Object r6 = super.i(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.A()
            if (r5 == 0) goto L_0x004c
            XH.N r5 = XH.C16807N.f139792a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16527b.i(SJ.y, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public C16612e<T> j(C17168i iVar, int i10, C16428d dVar) {
        return new C16527b(this.f138620e, iVar, i10, dVar);
    }

    public C16527b(p<? super C16449y<? super T>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17168i iVar, int i10, C16428d dVar) {
        super(pVar, iVar, i10, dVar);
        this.f138620e = pVar;
    }
}
