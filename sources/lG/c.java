package Lg;

import HJ.C15854t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0016\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001&B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0012J%\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001e\u0010\u001cR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0011\u0010%\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"LLg/c;", "T", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "", "isClickable", "<init>", "(Landroid/view/View;Z)V", "LX4/a;", "binding", "(LX4/a;Z)V", "view", "LXH/N;", "i", "(Landroid/view/View;)V", "viewModel", "e", "(Ljava/lang/Object;)V", "c", "", "", "payloads", "f", "(Ljava/lang/Object;Ljava/util/List;)V", "d", "(Ljava/lang/Object;Ljava/util/List;)Z", "h", "()V", "j", "k", "Z", "inBindWithPayload", "Ljava/lang/Object;", "_boundViewModel", "g", "()Ljava/lang/Object;", "boundViewModel", "a", "listdelegate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c<T> extends RecyclerView.G {

    /* renamed from: g  reason: collision with root package name */
    public static final a f61673g = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private boolean f61674e;

    /* renamed from: f  reason: collision with root package name */
    private T f61675f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLg/c$a;", "", "<init>", "()V", "listdelegate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(View view, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i10 & 2) != 0 ? false : z10);
    }

    public void c(T t10) {
        if (this.f61674e) {
            Throwable th2 = new Throwable();
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Don't call bind(vm) from bind(vm, payloads), return false", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public boolean d(T t10, List<? extends Object> list) {
        C17542s.j(list, "payloads");
        return false;
    }

    public final void e(T t10) {
        this.f61675f = t10;
        c(t10);
    }

    public final void f(T t10, List<? extends Object> list) {
        C17542s.j(list, "payloads");
        this.f61675f = t10;
        if (list.isEmpty()) {
            c(t10);
            return;
        }
        this.f61674e = true;
        boolean d10 = d(t10, list);
        this.f61674e = false;
        if (!d10) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Payloads not handled in " + getClass().getSimpleName() + ": " + list, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            c(t10);
        }
    }

    public final T g() {
        T t10 = this.f61675f;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void h() {
    }

    public void i(View view) {
        C17542s.j(view, "view");
    }

    public void j() {
    }

    public void k() {
        this.f61675f = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, boolean z10) {
        super(view);
        C17542s.j(view, "itemView");
        if (z10) {
            view.setOnClickListener(new b(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(X4.a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(X4.a r2, boolean r3) {
        /*
            r1 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            android.view.View r2 = r2.getRoot()
            java.lang.String r0 = "getRoot(...)"
            kotlin.jvm.internal.C17542s.i(r2, r0)
            r1.<init>((android.view.View) r2, (boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Lg.c.<init>(X4.a, boolean):void");
    }
}
