package jp;

import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import dI.C17164e;
import eI.C17187b;
import ip.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a9\u0010\n\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroid/view/View;", "LXH/N;", "c", "(Landroid/view/View;)V", "b", "", "left", "top", "right", "bottom", "d", "(Landroid/view/View;IIII)V", "a", "(Landroid/view/View;LdI/e;)Ljava/lang/Object;", "view_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f98636a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f98637b;

        a(View view, b bVar) {
            this.f98636a = view;
            this.f98637b = bVar;
        }

        public final void a(Throwable th2) {
            this.f98636a.removeOnLayoutChangeListener(this.f98637b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"jp/g$b", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16320n<C16807N> f98638a;

        b(C16320n<? super C16807N> nVar) {
            this.f98638a = nVar;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C17542s.j(view, "view");
            view.removeOnLayoutChangeListener(this);
            e.a(this.f98638a, C16807N.f139792a);
        }
    }

    public static final Object a(View view, C17164e<? super C16807N> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        b bVar = new b(pVar);
        pVar.K(new a(view, bVar));
        view.addOnLayoutChangeListener(bVar);
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    public static final void b(View view) {
        C17542s.j(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void c(View view) {
        C17542s.j(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }

    public static final void d(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        C17542s.j(view, "<this>");
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i10;
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.bottomMargin = i13;
            layoutParams = marginLayoutParams;
        } else {
            layoutParams = view.getLayoutParams();
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void e(android.view.View r2, int r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
        /*
            r8 = r7 & 1
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L_0x0018
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            boolean r8 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x0011
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0012
        L_0x0011:
            r3 = r1
        L_0x0012:
            if (r3 == 0) goto L_0x0017
            int r3 = r3.leftMargin
            goto L_0x0018
        L_0x0017:
            r3 = r0
        L_0x0018:
            r8 = r7 & 2
            if (r8 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            boolean r8 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x0027
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            if (r4 == 0) goto L_0x002d
            int r4 = r4.topMargin
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            r8 = r7 & 4
            if (r8 == 0) goto L_0x0044
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            boolean r8 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x003d
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            goto L_0x003e
        L_0x003d:
            r5 = r1
        L_0x003e:
            if (r5 == 0) goto L_0x0043
            int r5 = r5.rightMargin
            goto L_0x0044
        L_0x0043:
            r5 = r0
        L_0x0044:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0059
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0053
            r1 = r6
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0053:
            if (r1 == 0) goto L_0x0058
            int r6 = r1.bottomMargin
            goto L_0x0059
        L_0x0058:
            r6 = r0
        L_0x0059:
            d(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.g.e(android.view.View, int, int, int, int, int, java.lang.Object):void");
    }
}
