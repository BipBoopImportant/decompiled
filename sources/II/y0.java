package ii;

import Rh.c;
import YH.C16877v;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import fi.a;
import gi.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00101R\u0016\u00105\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00109\u001a\u00020\u000e8@X\u0004¢\u0006\u0006\u001a\u0004\b3\u00108¨\u0006:"}, d2 = {"Lii/y0;", "Landroidx/recyclerview/widget/RecyclerView$v;", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroid/content/Context;", "context", "LRh/c;", "pipLayoutBinding", "Lkotlin/Function0;", "Lgi/K;", "viewModel", "Landroidx/appcompat/app/a;", "supportActionBar", "<init>", "(Landroid/content/Context;LRh/c;LnI/a;LnI/a;)V", "", "block", "LXH/N;", "l", "(LnI/a;)V", "k", "()V", "", "Lfi/a;", "items", "", "m", "(Ljava/util/List;)Ljava/util/List;", "Landroid/view/View;", "view", "b", "(Landroid/view/View;)V", "d", "g", "a", "LRh/c;", "LnI/a;", "c", "", "Z", "firstTimeShown", "Landroidx/recyclerview/widget/RecyclerView$B;", "e", "Landroidx/recyclerview/widget/RecyclerView$B;", "smoothScroller", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "scrollCallback", "h", "I", "_pricePackagePosition", "i", "mustCompleteWithPosition", "()I", "pricePackagePosition", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 extends RecyclerView.v implements RecyclerView.s {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f74766a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<K> f74767b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<androidx.appcompat.app.a> f74768c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f74769d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView.B f74770e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f74771f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f74772g;

    /* renamed from: h  reason: collision with root package name */
    private int f74773h;

    /* renamed from: i  reason: collision with root package name */
    private int f74774i;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"ii/y0$a", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a f74775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y0 f74776b;

        public a(C17631a aVar, y0 y0Var) {
            this.f74775a = aVar;
            this.f74776b = y0Var;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            if (((Number) this.f74775a.invoke()).intValue() != Integer.MAX_VALUE) {
                this.f74776b.f74770e.p(((Number) this.f74775a.invoke()).intValue());
                RecyclerView.q layoutManager = this.f74776b.f74766a.f63227c.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.j2(this.f74776b.f74770e);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ii/y0$b", "Landroidx/recyclerview/widget/p;", "", "B", "()I", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p {
        b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public int B() {
            return -1;
        }
    }

    public y0(Context context, c cVar, C17631a<K> aVar, C17631a<? extends androidx.appcompat.app.a> aVar2) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "pipLayoutBinding");
        C17542s.j(aVar, "viewModel");
        C17542s.j(aVar2, "supportActionBar");
        this.f74766a = cVar;
        this.f74767b = aVar;
        this.f74768c = aVar2;
        this.f74770e = new b(context);
        this.f74771f = new Handler(Looper.getMainLooper());
        this.f74772g = new w0(this);
        this.f74773h = Integer.MAX_VALUE;
        this.f74774i = Integer.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    public static final void i(y0 y0Var) {
        RecyclerView recyclerView = y0Var.f74766a.f63227c;
        y0Var.onScrolled(recyclerView, recyclerView.getScrollX(), recyclerView.getScrollY());
    }

    /* access modifiers changed from: private */
    public static final int j(y0 y0Var) {
        return y0Var.f74774i;
    }

    private final void l(C17631a<Integer> aVar) {
        RecyclerView recyclerView = this.f74766a.f63227c;
        C17542s.i(recyclerView, "delegateRecyclerView");
        recyclerView.addOnLayoutChangeListener(new a(aVar, this));
    }

    public void b(View view) {
        C17542s.j(view, "view");
        if (this.f74766a.f63227c.m0(view) == this.f74773h) {
            androidx.appcompat.app.a invoke = this.f74768c.invoke();
            if (invoke != null) {
                invoke.v(true);
            }
            K invoke2 = this.f74767b.invoke();
            if (invoke2 != null) {
                Context context = view.getContext();
                C17542s.i(context, "getContext(...)");
                invoke2.R1(context, true);
            }
        }
    }

    public void d(View view) {
        androidx.appcompat.app.a invoke;
        C17542s.j(view, "view");
        int m02 = this.f74766a.f63227c.m0(view);
        if (this.f74769d && m02 == 0) {
            K invoke2 = this.f74767b.invoke();
            if (invoke2 != null) {
                Context context = view.getContext();
                C17542s.i(context, "getContext(...)");
                invoke2.R1(context, true);
            }
            this.f74769d = false;
        }
        if (m02 == this.f74773h) {
            Context context2 = view.getContext();
            C17542s.i(context2, "getContext(...)");
            if (!Xo.c.b(context2) && (invoke = this.f74768c.invoke()) != null) {
                invoke.v(false);
            }
            K invoke3 = this.f74767b.invoke();
            if (invoke3 != null) {
                Context context3 = view.getContext();
                C17542s.i(context3, "getContext(...)");
                invoke3.R1(context3, false);
            }
        }
    }

    public final void g() {
        this.f74771f.removeCallbacks(this.f74772g);
        this.f74769d = true;
    }

    public final int h() {
        return this.f74773h;
    }

    public final void k() {
        l(new x0(this));
    }

    public final List<Object> m(List<? extends fi.a> list) {
        C17542s.j(list, "items");
        this.f74774i = Integer.MAX_VALUE;
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            fi.a aVar = (fi.a) next;
            if (aVar instanceof a.A) {
                this.f74773h = i10;
            } else if (aVar instanceof a.t) {
                this.f74774i = i10;
            }
            arrayList.add(aVar.a());
            i10 = i11;
        }
        if (this.f74766a.f63227c.getScrollState() == 0) {
            this.f74771f.post(this.f74772g);
        }
        return arrayList;
    }
}
