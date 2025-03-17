package androidx.compose.ui.platform;

import T1.C4856z;
import T1.G;
import W0.b;
import XH.C16807N;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R,\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00190\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/r0;", "", "Landroidx/compose/ui/platform/H0;", "request", "Lkotlin/Function0;", "LXH/N;", "onAllConnectionsClosed", "<init>", "(Landroidx/compose/ui/platform/H0;LnI/a;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "c", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "d", "()V", "a", "Landroidx/compose/ui/platform/H0;", "b", "LnI/a;", "Ljava/lang/Object;", "lock", "LW0/b;", "Ljava/lang/ref/WeakReference;", "LT1/z;", "Landroidx/compose/ui/node/WeakReference;", "LW0/b;", "connections", "", "e", "Z", "disposed", "()Z", "isActive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.r0  reason: case insensitive filesystem */
final class C5129r0 {

    /* renamed from: a  reason: collision with root package name */
    private final H0 f19563a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f19564b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f19565c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public b<WeakReference<C4856z>> f19566d = new b<>(new WeakReference[16], 0);

    /* renamed from: e  reason: collision with root package name */
    private boolean f19567e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT1/z;", "closedConnection", "LXH/N;", "a", "(LT1/z;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.r0$a */
    static final class a extends C17544u implements C17642l<C4856z, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5129r0 f19568c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5129r0 r0Var) {
            super(1);
            this.f19568c = r0Var;
        }

        public final void a(C4856z zVar) {
            int i10;
            zVar.a();
            b a10 = this.f19568c.f19566d;
            int r10 = a10.r();
            if (r10 > 0) {
                Object[] q10 = a10.q();
                i10 = 0;
                while (true) {
                    if (C17542s.e((WeakReference) q10[i10], zVar)) {
                        break;
                    }
                    i10++;
                    if (i10 >= r10) {
                        break;
                    }
                }
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                this.f19568c.f19566d.B(i10);
            }
            if (this.f19568c.f19566d.t()) {
                this.f19568c.f19564b.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4856z) obj);
            return C16807N.f139792a;
        }
    }

    public C5129r0(H0 h02, C17631a<C16807N> aVar) {
        this.f19563a = h02;
        this.f19564b = aVar;
    }

    public final InputConnection c(EditorInfo editorInfo) {
        synchronized (this.f19565c) {
            if (this.f19567e) {
                return null;
            }
            C4856z a10 = G.a(this.f19563a.a(editorInfo), new a(this));
            this.f19566d.b(new WeakReference(a10));
            return a10;
        }
    }

    public final void d() {
        synchronized (this.f19565c) {
            try {
                this.f19567e = true;
                b<WeakReference<C4856z>> bVar = this.f19566d;
                int r10 = bVar.r();
                if (r10 > 0) {
                    Object[] q10 = bVar.q();
                    int i10 = 0;
                    do {
                        C4856z zVar = (C4856z) ((WeakReference) q10[i10]).get();
                        if (zVar != null) {
                            zVar.a();
                        }
                        i10++;
                    } while (i10 < r10);
                }
                this.f19566d.k();
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return !this.f19567e;
    }
}
