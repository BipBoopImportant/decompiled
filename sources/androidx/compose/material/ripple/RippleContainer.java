package androidx.compose.material.ripple;

import N0.j;
import YH.C16877v;
import android.content.Context;
import android.view.ViewGroup;
import i1.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\f\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\f\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002XD¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "LXH/N;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "LN0/j;", "Landroidx/compose/material/ripple/RippleHostView;", "(LN0/j;)Landroidx/compose/material/ripple/RippleHostView;", "a", "(LN0/j;)V", "I", "MaxRippleHosts", "", "Ljava/util/List;", "rippleHosts", "c", "unusedRippleHosts", "Landroidx/compose/material/ripple/a;", "d", "Landroidx/compose/material/ripple/a;", "rippleHostMap", "e", "nextHostIndex", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RippleContainer extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final int f18620a = 5;

    /* renamed from: b  reason: collision with root package name */
    private final List<RippleHostView> f18621b;

    /* renamed from: c  reason: collision with root package name */
    private final List<RippleHostView> f18622c;

    /* renamed from: d  reason: collision with root package name */
    private final a f18623d;

    /* renamed from: e  reason: collision with root package name */
    private int f18624e;

    public RippleContainer(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f18621b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f18622c = arrayList2;
        this.f18623d = new a();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f18624e = 1;
        setTag(i.f24338J, Boolean.TRUE);
    }

    public final void a(j jVar) {
        jVar.u1();
        RippleHostView b10 = this.f18623d.b(jVar);
        if (b10 != null) {
            b10.d();
            this.f18623d.c(jVar);
            this.f18622c.add(b10);
        }
    }

    public final RippleHostView b(j jVar) {
        RippleHostView b10 = this.f18623d.b(jVar);
        if (b10 != null) {
            return b10;
        }
        RippleHostView rippleHostView = (RippleHostView) C16877v.N(this.f18622c);
        if (rippleHostView == null) {
            if (this.f18624e > C16877v.p(this.f18621b)) {
                rippleHostView = new RippleHostView(getContext());
                addView(rippleHostView);
                this.f18621b.add(rippleHostView);
            } else {
                rippleHostView = this.f18621b.get(this.f18624e);
                j a10 = this.f18623d.a(rippleHostView);
                if (a10 != null) {
                    a10.u1();
                    this.f18623d.c(a10);
                    rippleHostView.d();
                }
            }
            int i10 = this.f18624e;
            if (i10 < this.f18620a - 1) {
                this.f18624e = i10 + 1;
            } else {
                this.f18624e = 0;
            }
        }
        this.f18623d.d(jVar, rippleHostView);
        return rippleHostView;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void requestLayout() {
    }
}
