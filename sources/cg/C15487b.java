package CG;

import OE.q;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import pG.C17743d;
import zG.C18747a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LCG/b;", "LzG/a;", "LpG/d;", "goesWellWithUseCase", "LOE/q;", "sugarcube", "<init>", "(LpG/d;LOE/q;)V", "", "itemId", "LXH/N;", "h", "(ILdI/e;)Ljava/lang/Object;", "i", "o", "LpG/d;", "p", "LOE/q;", "getSugarcube", "()LOE/q;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: CG.b  reason: case insensitive filesystem */
public final class C15487b extends C18747a {

    /* renamed from: o  reason: collision with root package name */
    private final C17743d f133430o;

    /* renamed from: p  reason: collision with root package name */
    private final q f133431p;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.goeswith.GoesWellViewModel", f = "GoesWellViewModel.kt", l = {27}, m = "fetchItems")
    /* renamed from: CG.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f133432c;

        /* renamed from: d  reason: collision with root package name */
        Object f133433d;

        /* renamed from: e  reason: collision with root package name */
        int f133434e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f133435f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C15487b f133436g;

        /* renamed from: h  reason: collision with root package name */
        int f133437h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15487b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f133436g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f133435f = obj;
            this.f133437h |= Integer.MIN_VALUE;
            return this.f133436g.h(0, this);
        }
    }

    public C15487b(C17743d dVar, q qVar) {
        C17542s.j(dVar, "goesWellWithUseCase");
        C17542s.j(qVar, "sugarcube");
        this.f133430o = dVar;
        this.f133431p = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(int r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof CG.C15487b.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            CG.b$a r0 = (CG.C15487b.a) r0
            int r1 = r0.f133437h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f133437h = r1
            goto L_0x0018
        L_0x0013:
            CG.b$a r0 = new CG.b$a
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f133435f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f133437h
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r13 = r0.f133433d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f133432c
            CG.b r13 = (CG.C15487b) r13
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r14 = r1.j()
            goto L_0x0059
        L_0x0037:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003f:
            XH.y.b(r1)
            zG.e$b r1 = zG.e.b.f152779a
            r12.j(r1)
            pG.d r1 = r12.f133430o
            r0.f133432c = r12
            r0.f133433d = r14
            r0.f133434e = r13
            r0.f133437h = r4
            java.lang.Object r14 = r1.a(r13, r0)
            if (r14 != r2) goto L_0x0058
            return r2
        L_0x0058:
            r13 = r12
        L_0x0059:
            java.lang.Throwable r0 = XH.x.e(r14)
            if (r0 != 0) goto L_0x0072
            r6 = r14
            java.util.List r6 = (java.util.List) r6
            zG.e$c r14 = new zG.e$c
            r10 = 14
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.j(r14)
            goto L_0x007c
        L_0x0072:
            zG.e$a r14 = new zG.e$a
            r0 = 0
            r1 = 0
            r14.<init>(r0, r4, r1)
            r13.j(r14)
        L_0x007c:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: CG.C15487b.h(int, dI.e):java.lang.Object");
    }

    public Object i(int i10, C17164e<? super C16807N> eVar) {
        return C16807N.f139792a;
    }
}
