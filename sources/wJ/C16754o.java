package WJ;

import QJ.V;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.E;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00060\u0000j\u0002`\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b \u0010\u0010J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0015\u0010)\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0015\u0010+\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u0011\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u00018\u0002X\u0004R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000\u00018\u0002X\u0004R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00018\u0002X\u0004¨\u0006/"}, d2 = {"LWJ/o;", "", "<init>", "()V", "LWJ/x;", "u", "()LWJ/x;", "Lkotlinx/coroutines/internal/Node;", "current", "i", "(LWJ/o;)LWJ/o;", "next", "LXH/N;", "k", "(LWJ/o;)V", "h", "()LWJ/o;", "node", "", "f", "(LWJ/o;)Z", "", "permissionsBitmask", "d", "(LWJ/o;I)Z", "forbiddenElementsBit", "g", "(I)V", "e", "(LWJ/o;LWJ/o;)Z", "s", "()Z", "t", "", "toString", "()Ljava/lang/String;", "r", "isRemoved", "l", "()Ljava/lang/Object;", "m", "nextNode", "n", "prevNode", "_next", "_prev", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.o  reason: case insensitive filesystem */
public class C16754o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139567a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139568b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139569c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WJ.o$a */
    /* synthetic */ class a extends E {
        a(Object obj) {
            super(obj, V.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return V.a(this.receiver);
        }
    }

    static {
        Class<C16754o> cls = C16754o.class;
        Class<Object> cls2 = Object.class;
        f139567a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        f139568b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
        f139569c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef$volatile");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: WJ.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (androidx.concurrent.futures.b.a(o(), r3, r2, ((WJ.x) r4).f139585a) != false) goto L_0x0042;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final WJ.C16754o h() {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f139568b
            java.lang.Object r0 = r0.get(r7)
            WJ.o r0 = (WJ.C16754o) r0
            r1 = 0
            r2 = r0
        L_0x000c:
            r3 = r1
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f139567a
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L_0x0026
            if (r0 != r2) goto L_0x001a
            return r2
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f139568b
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0025
            goto L_0x0000
        L_0x0025:
            return r2
        L_0x0026:
            boolean r5 = r7.r()
            if (r5 == 0) goto L_0x002d
            return r1
        L_0x002d:
            boolean r5 = r4 instanceof WJ.x
            if (r5 == 0) goto L_0x004f
            if (r3 == 0) goto L_0x0044
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f139567a
            WJ.x r4 = (WJ.x) r4
            WJ.o r4 = r4.f139585a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x0042
            goto L_0x0000
        L_0x0042:
            r2 = r3
            goto L_0x000c
        L_0x0044:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f139568b
            java.lang.Object r2 = r4.get(r2)
            WJ.o r2 = (WJ.C16754o) r2
            goto L_0x000d
        L_0x004f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.C17542s.h(r4, r3)
            r3 = r4
            WJ.o r3 = (WJ.C16754o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: WJ.C16754o.h():WJ.o");
    }

    private final C16754o i(C16754o oVar) {
        while (oVar.r()) {
            oVar = (C16754o) f139568b.get(oVar);
        }
        return oVar;
    }

    private final void k(C16754o oVar) {
        C16754o oVar2;
        AtomicReferenceFieldUpdater p10 = f139568b;
        do {
            oVar2 = (C16754o) p10.get(oVar);
            if (l() != oVar) {
                return;
            }
        } while (!b.a(f139568b, oVar, oVar2, this));
        if (r()) {
            oVar.h();
        }
    }

    private final x u() {
        x xVar = (x) f139569c.get(this);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        f139569c.set(this, xVar2);
        return xVar2;
    }

    public final boolean d(C16754o oVar, int i10) {
        C16754o n10;
        do {
            n10 = n();
            if (n10 instanceof C16752m) {
                return (((C16752m) n10).f139566d & i10) == 0 && n10.d(oVar, i10);
            }
        } while (!n10.e(oVar, this));
        return true;
    }

    public final boolean e(C16754o oVar, C16754o oVar2) {
        f139568b.set(oVar, this);
        f139567a.set(oVar, oVar2);
        if (!b.a(f139567a, this, oVar2, oVar)) {
            return false;
        }
        oVar.k(oVar2);
        return true;
    }

    public final boolean f(C16754o oVar) {
        f139568b.set(oVar, this);
        f139567a.set(oVar, this);
        while (l() == this) {
            if (b.a(f139567a, this, this, oVar)) {
                oVar.k(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        d(new C16752m(i10), i10);
    }

    public final Object l() {
        return f139567a.get(this);
    }

    public final C16754o m() {
        C16754o oVar;
        Object l10 = l();
        x xVar = l10 instanceof x ? (x) l10 : null;
        if (xVar != null && (oVar = xVar.f139585a) != null) {
            return oVar;
        }
        C17542s.h(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C16754o) l10;
    }

    public final C16754o n() {
        C16754o h10 = h();
        return h10 == null ? i((C16754o) f139568b.get(this)) : h10;
    }

    public boolean r() {
        return l() instanceof x;
    }

    public boolean s() {
        return t() == null;
    }

    public final C16754o t() {
        Object l10;
        C16754o oVar;
        do {
            l10 = l();
            if (l10 instanceof x) {
                return ((x) l10).f139585a;
            }
            if (l10 == this) {
                return (C16754o) l10;
            }
            C17542s.h(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            oVar = (C16754o) l10;
        } while (!b.a(f139567a, this, l10, oVar.u()));
        oVar.h();
        return null;
    }

    public String toString() {
        return new a(this) + '@' + V.b(this);
    }
}
