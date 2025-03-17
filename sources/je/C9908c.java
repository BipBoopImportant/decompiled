package je;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0004¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b%\u0010&J)\u0010)\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lje/c;", "Landroidx/recyclerview/widget/l$h;", "", "dragDirs", "swipeDirs", "<init>", "(II)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$G;", "viewHolder", "target", "", "y", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$G;Landroidx/recyclerview/widget/RecyclerView$G;)Z", "iconLeft", "iconTop", "iconRight", "iconBottom", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/drawable/Drawable;", "icon", "tintColor", "LXH/N;", "H", "(IIIILandroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;I)V", "Landroid/view/View;", "itemView", "", "dX", "backgroundColor", "Landroid/graphics/drawable/ColorDrawable;", "background", "E", "(Landroid/view/View;FLandroid/graphics/Canvas;ILandroid/graphics/drawable/ColorDrawable;)V", "intrinsicHeight", "F", "(ILjava/lang/Integer;)I", "itemHeight", "inartisticHeight", "G", "(Landroid/view/View;ILjava/lang/Integer;)I", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: je.c  reason: case insensitive filesystem */
public abstract class C9908c extends l.h {
    public C9908c(int i10, int i11) {
        super(i10, i11);
    }

    /* access modifiers changed from: protected */
    public final void E(View view, float f10, Canvas canvas, int i10, ColorDrawable colorDrawable) {
        C17542s.j(view, "itemView");
        C17542s.j(canvas, "canvas");
        C17542s.j(colorDrawable, "background");
        colorDrawable.setColor(i10);
        if (f10 < 0.0f) {
            colorDrawable.setBounds(view.getRight() + ((int) f10), view.getTop(), view.getRight(), view.getBottom());
        } else {
            colorDrawable.setBounds(view.getLeft(), view.getTop(), view.getLeft() + ((int) f10), view.getBottom());
        }
        colorDrawable.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final int F(int i10, Integer num) {
        return i10 + (num != null ? num.intValue() : 0);
    }

    /* access modifiers changed from: protected */
    public final int G(View view, int i10, Integer num) {
        C17542s.j(view, "itemView");
        return view.getTop() + ((i10 - (num != null ? num.intValue() : 0)) / 2);
    }

    /* access modifiers changed from: protected */
    public final void H(int i10, int i11, int i12, int i13, Canvas canvas, Drawable drawable, int i14) {
        C17542s.j(canvas, "canvas");
        if (drawable != null) {
            drawable.setTint(i14);
            drawable.setBounds(i10, i11, i12, i13);
            drawable.draw(canvas);
        }
    }

    public boolean y(RecyclerView recyclerView, RecyclerView.G g10, RecyclerView.G g11) {
        C17542s.j(recyclerView, "recyclerView");
        C17542s.j(g10, "viewHolder");
        C17542s.j(g11, "target");
        return false;
    }
}
