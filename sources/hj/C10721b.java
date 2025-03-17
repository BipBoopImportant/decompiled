package Hj;

import XH.C16807N;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LHj/b;", "Landroid/view/View$OnLayoutChangeListener;", "Lkotlin/Function1;", "Landroid/view/View;", "LXH/N;", "onLayout", "<init>", "(LnI/l;)V", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "a", "LnI/l;", "getOnLayout", "()LnI/l;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hj.b  reason: case insensitive filesystem */
final class C10721b implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<View, C16807N> f81276a;

    public C10721b(C17642l<? super View, C16807N> lVar) {
        C17542s.j(lVar, "onLayout");
        this.f81276a = lVar;
    }

    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        C17542s.j(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.f81276a.invoke(view);
    }
}
