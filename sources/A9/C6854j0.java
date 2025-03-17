package a9;

import HJ.C15854t;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.j0  reason: case insensitive filesystem */
public final class C6854j0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6949v0 f42616a;

    public C6854j0(C6949v0 v0Var) {
        C17542s.j(v0Var, "pathFilter");
        this.f42616a = v0Var;
    }

    public final String a(View view) {
        StringBuilder sb2 = new StringBuilder("[root]");
        if (view != null) {
            b(view, sb2);
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "data.toString()");
        return sb3;
    }

    public final void b(View view, StringBuilder sb2) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            String cls = view.getClass().toString();
            C17542s.i(cls, "view.javaClass.toString()");
            if (!C15854t.G(cls, "DecorView", false, 2, (Object) null)) {
                b((View) parent, sb2);
                c(view, sb2, true);
            }
        }
    }

    public final void c(View view, StringBuilder sb2, boolean z10) {
        ViewParent parent = view.getParent();
        String cls = view.getClass().toString();
        C17542s.i(cls, "view.javaClass.toString()");
        int i10 = 0;
        if (C15854t.G(cls, "DecorView", false, 2, (Object) null)) {
            sb2.append("[root]");
        } else if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            int i11 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i11 = -1;
                    break;
                }
                View childAt = viewGroup.getChildAt(i10);
                if (childAt == view) {
                    break;
                }
                C6949v0 v0Var = this.f42616a;
                C17542s.i(childAt, "child");
                if (!v0Var.a(childAt, viewGroup)) {
                    i11++;
                }
                i10++;
            }
            if (i11 != -1) {
                if (z10) {
                    sb2.append('>');
                }
                sb2.append(view.getClass().getSimpleName());
                if (viewGroup instanceof RecyclerView) {
                    i11 = ((RecyclerView) viewGroup).m0(view);
                }
                sb2.append(":eq(");
                sb2.append(i11);
                sb2.append(")");
                String a10 = C6862k0.a(view, "");
                C17542s.i(a10, "getResourceEntryName(chi…rceUtils.EMPTY_STRING_ID)");
                if (a10.length() > 0) {
                    sb2.append('#');
                    sb2.append(a10);
                }
            }
        }
    }
}
