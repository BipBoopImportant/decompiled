package je;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10025b;
import lg.C10027d;
import u2.C6012a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010 R\u0014\u0010*\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006+"}, d2 = {"Lje/b;", "Lje/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$G;", "viewHolder", "", "k", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$G;)I", "direction", "LXH/N;", "B", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "Landroid/graphics/Canvas;", "canvas", "", "dX", "dY", "actionState", "", "isCurrentlyActive", "u", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$G;FFIZ)V", "Landroid/graphics/drawable/Drawable;", "f", "Landroid/graphics/drawable/Drawable;", "swipeLeftIcon", "g", "I", "intrinsicWidthLeft", "h", "intrinsicHeightLeft", "Landroid/graphics/drawable/ColorDrawable;", "i", "Landroid/graphics/drawable/ColorDrawable;", "background", "j", "whiteColor", "backgroundColorLeft", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: je.b  reason: case insensitive filesystem */
public final class C9907b extends C9908c {

    /* renamed from: f  reason: collision with root package name */
    private final Drawable f74828f;

    /* renamed from: g  reason: collision with root package name */
    private final int f74829g;

    /* renamed from: h  reason: collision with root package name */
    private final int f74830h;

    /* renamed from: i  reason: collision with root package name */
    private final ColorDrawable f74831i;

    /* renamed from: j  reason: collision with root package name */
    private final int f74832j;

    /* renamed from: k  reason: collision with root package name */
    private final int f74833k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9907b(Context context) {
        super(16, 16);
        C17542s.j(context, "context");
        Drawable e10 = C6012a.e(context, C10027d.f75277h);
        if (e10 != null) {
            e10.mutate();
            this.f74828f = e10;
            this.f74829g = e10.getIntrinsicWidth();
            this.f74830h = e10.getIntrinsicHeight();
            this.f74831i = new ColorDrawable();
            this.f74832j = C6012a.c(context, C10025b.f75266h);
            this.f74833k = C6012a.c(context, C10025b.f75262d);
            return;
        }
        throw new IllegalArgumentException("Resource is missing.");
    }

    public void B(RecyclerView.G g10, int i10) {
        C17542s.j(g10, "viewHolder");
        if (g10 instanceof C9909d) {
            ((C9909d) g10).a(i10);
        }
    }

    public int k(RecyclerView recyclerView, RecyclerView.G g10) {
        C9906a aVar;
        C17542s.j(recyclerView, "recyclerView");
        C17542s.j(g10, "viewHolder");
        C9909d dVar = g10 instanceof C9909d ? (C9909d) g10 : null;
        if (dVar == null || (aVar = dVar.b()) == null) {
            aVar = C9906a.NONE;
        }
        if (aVar == C9906a.NONE) {
            return 0;
        }
        return super.k(recyclerView, g10);
    }

    public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.G g10, float f10, float f11, int i10, boolean z10) {
        RecyclerView.G g11 = g10;
        Canvas canvas2 = canvas;
        C17542s.j(canvas, "canvas");
        RecyclerView recyclerView2 = recyclerView;
        C17542s.j(recyclerView, "recyclerView");
        C17542s.j(g11, "viewHolder");
        View view = g11.itemView;
        C17542s.i(view, "itemView");
        int bottom = view.getBottom() - view.getTop();
        if (f10 != 0.0f || z10) {
            E(view, f10, canvas, this.f74833k, this.f74831i);
            int i11 = this.f74830h;
            Drawable drawable = this.f74828f;
            int G10 = G(view, bottom, Integer.valueOf(i11));
            int F10 = F(G10, Integer.valueOf(i11));
            H(view.getRight() - (this.f74829g * 2), G10, view.getRight() - this.f74829g, F10, canvas, drawable, this.f74832j);
            super.u(canvas, recyclerView, g10, f10, f11, i10, z10);
            return;
        }
        super.u(canvas, recyclerView, g10, f10, f11, i10, z10);
    }
}
