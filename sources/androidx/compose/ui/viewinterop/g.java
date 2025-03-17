package androidx.compose.ui.viewinterop;

import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import G1.m0;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.f;
import androidx.compose.ui.focus.i;
import androidx.compose.ui.focus.m;
import androidx.compose.ui.focus.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import n1.C5629i;
import n1.C5630j;
import n1.C5640t;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0018\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u001e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/viewinterop/g;", "Landroidx/compose/ui/d$c;", "Ln1/j;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/view/View$OnAttachStateChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "C2", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/i;", "focusProperties", "LXH/N;", "m1", "(Landroidx/compose/ui/focus/i;)V", "Landroidx/compose/ui/focus/d;", "focusDirection", "Landroidx/compose/ui/focus/m;", "D2", "(I)Landroidx/compose/ui/focus/m;", "E2", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "m2", "n2", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "n", "Landroid/view/View;", "getFocusedChild", "()Landroid/view/View;", "setFocusedChild", "focusedChild", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g extends d.c implements C5630j, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: n  reason: collision with root package name */
    private View f19836n;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<androidx.compose.ui.focus.d, m> {
        a(Object obj) {
            super(1, obj, g.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return t(((androidx.compose.ui.focus.d) obj).o());
        }

        public final m t(int i10) {
            return ((g) this.receiver).D2(i10);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<androidx.compose.ui.focus.d, m> {
        b(Object obj) {
            super(1, obj, g.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return t(((androidx.compose.ui.focus.d) obj).o());
        }

        public final m t(int i10) {
            return ((g) this.receiver).E2(i10);
        }
    }

    private final FocusTargetNode C2() {
        int a10 = C4502e0.a(1024);
        if (!E0().j2()) {
            D1.a.b("visitLocalDescendants called on an unattached node");
        }
        d.c E02 = E0();
        if ((E02.Z1() & a10) != 0) {
            boolean z10 = false;
            for (d.c a22 = E02.a2(); a22 != null; a22 = a22.a2()) {
                if ((a22.e2() & a10) != 0) {
                    d.c cVar = a22;
                    W0.b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                            int i10 = 0;
                            for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                if ((D22.e2() & a10) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVar = D22;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new W0.b(new d.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(D22);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVar = C4508k.g(bVar);
                    }
                    continue;
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    public final m D2(int i10) {
        View c10 = f.g(this);
        if (c10.isFocused() || c10.hasFocus()) {
            return m.f18861b.c();
        }
        C5629i focusOwner = C4508k.n(this).getFocusOwner();
        m0 n10 = C4508k.n(this);
        C17542s.h(n10, "null cannot be cast to non-null type android.view.View");
        return f.b(c10, f.c(i10), f.f(focusOwner, (View) n10, c10)) ? m.f18861b.c() : m.f18861b.b();
    }

    public final m E2(int i10) {
        View c10 = f.g(this);
        if (!c10.hasFocus()) {
            return m.f18861b.c();
        }
        C5629i focusOwner = C4508k.n(this).getFocusOwner();
        m0 n10 = C4508k.n(this);
        C17542s.h(n10, "null cannot be cast to non-null type android.view.View");
        View view = (View) n10;
        if (c10 instanceof ViewGroup) {
            Rect b10 = f.f(focusOwner, view, c10);
            Integer c11 = f.c(i10);
            int intValue = c11 != null ? c11.intValue() : 130;
            FocusFinder instance = FocusFinder.getInstance();
            View view2 = this.f19836n;
            View findNextFocus = view2 != null ? instance.findNextFocus((ViewGroup) view, view2, intValue) : instance.findNextFocusFromRect((ViewGroup) view, b10, intValue);
            if (findNextFocus != null && f.d(c10, findNextFocus)) {
                findNextFocus.requestFocus(intValue, b10);
                return m.f18861b.b();
            } else if (view.requestFocus()) {
                return m.f18861b.c();
            } else {
                throw new IllegalStateException("host view did not take focus");
            }
        } else if (view.requestFocus()) {
            return m.f18861b.c();
        } else {
            throw new IllegalStateException("host view did not take focus");
        }
    }

    public void m1(i iVar) {
        iVar.w(false);
        iVar.z(new a(this));
        iVar.r(new b(this));
    }

    public void m2() {
        super.m2();
        f.g(this).addOnAttachStateChangeListener(this);
    }

    public void n2() {
        f.g(this).removeOnAttachStateChangeListener(this);
        this.f19836n = null;
        super.n2();
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (C4508k.m(this).p0() != null) {
            View c10 = f.g(this);
            C5629i focusOwner = C4508k.n(this).getFocusOwner();
            m0 n10 = C4508k.n(this);
            boolean z10 = view != null && !C17542s.e(view, n10) && f.d(c10, view);
            boolean z11 = view2 != null && !C17542s.e(view2, n10) && f.d(c10, view2);
            if (z10 && z11) {
                this.f19836n = view2;
            } else if (z11) {
                this.f19836n = view2;
                FocusTargetNode C22 = C2();
                if (!C22.J2().b()) {
                    C5640t c11 = focusOwner.c();
                    try {
                        if (c11.f26514c) {
                            c11.g();
                        }
                        c11.f();
                        q.i(C22);
                        c11.h();
                    } catch (Throwable th2) {
                        c11.h();
                        throw th2;
                    }
                }
            } else if (z10) {
                this.f19836n = null;
                if (C2().J2().a()) {
                    focusOwner.j(false, true, false, androidx.compose.ui.focus.d.f18832b.c());
                }
            } else {
                this.f19836n = null;
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
