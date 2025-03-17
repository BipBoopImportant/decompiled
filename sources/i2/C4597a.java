package I2;

import J2.t;
import J2.u;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import t2.C5947e;

/* renamed from: I2.a  reason: case insensitive filesystem */
public class C4597a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f8619c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f8620a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f8621b;

    /* renamed from: I2.a$a  reason: collision with other inner class name */
    static final class C0118a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final C4597a f8622a;

        C0118a(C4597a aVar) {
            this.f8622a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f8622a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            u b10 = this.f8622a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f8622a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            t a12 = t.a1(accessibilityNodeInfo);
            a12.K0(C4600b0.V(view));
            a12.v0(C4600b0.Q(view));
            a12.E0(C4600b0.o(view));
            a12.Q0(C4600b0.H(view));
            this.f8622a.g(view, a12);
            a12.e(accessibilityNodeInfo.getText(), view);
            List<t.a> c10 = C4597a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                a12.b(c10.get(i10));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f8622a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f8622a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f8622a.j(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            this.f8622a.l(view, i10);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f8622a.m(view, accessibilityEvent);
        }
    }

    public C4597a() {
        this(f8619c);
    }

    static List<t.a> c(View view) {
        List<t.a> list = (List) view.getTag(C5947e.f29346H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] p10 = t.p(view.createAccessibilityNodeInfo().getText());
            int i10 = 0;
            while (p10 != null && i10 < p10.length) {
                if (clickableSpan.equals(p10[i10])) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C5947e.f29347I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f8620a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public u b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f8620a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new u(accessibilityNodeProvider);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f8621b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f8620a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, t tVar) {
        this.f8620a.onInitializeAccessibilityNodeInfo(view, tVar.Z0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f8620a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f8620a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<t.a> c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            t.a aVar = c10.get(i11);
            if (aVar.b() == i10) {
                z10 = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = this.f8620a.performAccessibilityAction(view, i10, bundle);
        }
        return (z10 || i10 != C5947e.f29358a || bundle == null) ? z10 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f8620a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f8620a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C4597a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f8620a = accessibilityDelegate;
        this.f8621b = new C0118a(this);
    }
}
