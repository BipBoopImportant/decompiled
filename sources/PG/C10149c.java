package pg;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qg.x;
import rg.C10218a;
import uK.C18146a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\"\u0010\u001a\u001a\u00020\t8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0014X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lpg/c;", "Lqg/x;", "T", "Lpg/G;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "view", "", "hasFocus", "LXH/N;", "x", "(Landroid/view/View;Z)V", "viewModel", "q", "(Lqg/x;)V", "k", "()V", "E", "i", "Z", "D", "()Z", "setRecycled", "(Z)V", "isRecycled", "Lrg/a;", "j", "Lrg/a;", "u", "()Lrg/a;", "textInput", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pg.c  reason: case insensitive filesystem */
public abstract class C10149c<T extends x> extends G<T> {

    /* renamed from: i  reason: collision with root package name */
    private boolean f75895i;

    /* renamed from: j  reason: collision with root package name */
    private final C10218a f75896j = C10218a.SELECTABLE;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10149c(View view) {
        super(view);
        C17542s.j(view, "itemView");
    }

    /* access modifiers changed from: protected */
    public final boolean D() {
        return this.f75895i;
    }

    public abstract void E();

    public void k() {
        super.k();
        this.f75895i = true;
    }

    /* renamed from: q */
    public void c(T t10) {
        C17542s.j(t10, "viewModel");
        super.c(t10);
        this.f75895i = false;
        t().setEndDrawable(Integer.valueOf(C18146a.f148036F1));
    }

    /* access modifiers changed from: protected */
    public C10218a u() {
        return this.f75896j;
    }

    public void x(View view, boolean z10) {
        C17542s.j(view, "view");
        if (z10) {
            E();
        }
    }
}
