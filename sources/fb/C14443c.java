package fB;

import bH.C17034a;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import jB.C14613b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"LfB/c;", "Lgp/b;", "LbH/a;", "LjB/b;", "shoppingListRepository", "<init>", "(LbH/a;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LbH/a;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fB.c  reason: case insensitive filesystem */
public final class C14443c implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C17034a<C14613b> f126875a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f126876b = C11346e.SHOPPING_LISTS_RESET_ON_LOGOUT;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.task.ShoppingListsResetOnLogoutTask", f = "ShoppingListsResetOnLogoutTask.kt", l = {22}, m = "execute")
    /* renamed from: fB.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f126877c;

        /* renamed from: d  reason: collision with root package name */
        Object f126878d;

        /* renamed from: e  reason: collision with root package name */
        Object f126879e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f126880f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14443c f126881g;

        /* renamed from: h  reason: collision with root package name */
        int f126882h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14443c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f126881g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126880f = obj;
            this.f126882h |= Integer.MIN_VALUE;
            return this.f126881g.b((Object) null, this);
        }
    }

    public C14443c(C17034a<C14613b> aVar) {
        C17542s.j(aVar, "shoppingListRepository");
        this.f126875a = aVar;
    }

    public C11346e a() {
        return this.f126876b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fB.C14443c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            fB.c$a r0 = (fB.C14443c.a) r0
            int r1 = r0.f126882h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126882h = r1
            goto L_0x0018
        L_0x0013:
            fB.c$a r0 = new fB.c$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f126880f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126882h
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f126879e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f126877c
            fB.c r6 = (fB.C14443c) r6
            XH.y.b(r1)
            goto L_0x0053
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            bH.a<jB.b> r1 = r5.f126875a
            java.lang.Object r1 = r1.get()
            jB.b r1 = (jB.C14613b) r1
            r0.f126877c = r5
            r0.f126878d = r6
            r0.f126879e = r7
            r0.f126882h = r4
            java.lang.Object r6 = r1.v(r0)
            if (r6 != r2) goto L_0x0053
            return r2
        L_0x0053:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fB.C14443c.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
