package Zk;

import android.content.Context;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import ow.h;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"LZk/e;", "Lgp/b;", "Landroid/content/Context;", "context", "", "Low/h;", "shortcutBuilders", "<init>", "(Landroid/content/Context;Ljava/util/Set;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Ljava/util/Set;", "Lgp/e;", "c", "Lgp/e;", "()Lgp/e;", "taskId", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f89946a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<h> f89947b;

    /* renamed from: c  reason: collision with root package name */
    private final C11346e f89948c = C11346e.SETUP_SHORTCUTS;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.task.SetupShortcutsTask", f = "SetupShortcutsTask.kt", l = {33}, m = "execute")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f89949c;

        /* renamed from: d  reason: collision with root package name */
        Object f89950d;

        /* renamed from: e  reason: collision with root package name */
        Object f89951e;

        /* renamed from: f  reason: collision with root package name */
        Object f89952f;

        /* renamed from: g  reason: collision with root package name */
        Object f89953g;

        /* renamed from: h  reason: collision with root package name */
        Object f89954h;

        /* renamed from: i  reason: collision with root package name */
        Object f89955i;

        /* renamed from: j  reason: collision with root package name */
        int f89956j;

        /* renamed from: k  reason: collision with root package name */
        int f89957k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f89958l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e f89959m;

        /* renamed from: n  reason: collision with root package name */
        int f89960n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f89959m = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89958l = obj;
            this.f89960n |= Integer.MIN_VALUE;
            return this.f89959m.b((Object) null, this);
        }
    }

    public e(Context context, Set<h> set) {
        C17542s.j(context, "context");
        C17542s.j(set, "shortcutBuilders");
        this.f89946a = context;
        this.f89947b = set;
    }

    public C11346e a() {
        return this.f89948c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r11, dI.C17164e<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof Zk.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            Zk.e$a r0 = (Zk.e.a) r0
            int r1 = r0.f89960n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89960n = r1
            goto L_0x0018
        L_0x0013:
            Zk.e$a r0 = new Zk.e$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f89958l
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f89960n
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0050
            if (r3 != r5) goto L_0x0048
            int r11 = r0.f89956j
            java.lang.Object r12 = r0.f89955i
            ow.h r12 = (ow.h) r12
            java.lang.Object r12 = r0.f89953g
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r3 = r0.f89952f
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r6 = r0.f89951e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r0.f89950d
            java.lang.Object r8 = r0.f89949c
            Zk.e r8 = (Zk.e) r8
            XH.y.b(r1)
            r1 = r0
            r0 = r6
            r6 = r3
            r3 = r12
            r12 = r11
            r11 = r7
            goto L_0x0065
        L_0x0048:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0050:
            XH.y.b(r1)
            android.content.Context r1 = r10.f89946a
            v2.C6164i.g(r1)
            java.util.Set<ow.h> r1 = r10.f89947b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r3 = r1.iterator()
            r8 = r10
            r6 = r1
            r1 = r0
            r0 = r12
            r12 = r4
        L_0x0065:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x008d
            java.lang.Object r7 = r3.next()
            r9 = r7
            ow.h r9 = (ow.h) r9
            r1.f89949c = r8
            r1.f89950d = r11
            r1.f89951e = r0
            r1.f89952f = r6
            r1.f89953g = r3
            r1.f89954h = r7
            r1.f89955i = r9
            r1.f89956j = r12
            r1.f89957k = r4
            r1.f89960n = r5
            java.lang.Object r7 = r9.a(r1)
            if (r7 != r2) goto L_0x0065
            return r2
        L_0x008d:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Zk.e.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
