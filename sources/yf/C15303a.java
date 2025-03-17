package yF;

import QE.b0;
import YH.C16877v;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import bI.C17035a;
import com.squareup.picasso.t;
import com.sugarcube.common.R;
import com.sugarcube.core.network.models.LocalProduct;
import com.sugarcube.core.network.models.PlacedFurniture;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0016\u001a\u00020\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LyF/a;", "", "LQE/b0;", "binding", "<init>", "(LQE/b0;)V", "", "view", "anchorTop", "anchorEnd", "LXH/N;", "b", "(III)V", "", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "placedFurniture", "Landroid/content/Context;", "context", "Lcom/squareup/picasso/t;", "picasso", "Landroid/view/View$OnClickListener;", "listener", "a", "(Ljava/util/List;Landroid/content/Context;Lcom/squareup/picasso/t;Landroid/view/View$OnClickListener;)V", "LQE/b0;", "getBinding", "()LQE/b0;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yF.a  reason: case insensitive filesystem */
public class C15303a {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f132223a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yF.a$a  reason: collision with other inner class name */
    public static final class C3269a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((PlacedFurniture) t10).getFurnitureId(), ((PlacedFurniture) t11).getFurnitureId());
        }
    }

    public C15303a(b0 b0Var) {
        C17542s.j(b0Var, "binding");
        this.f132223a = b0Var;
    }

    private final void b(int i10, int i11, int i12) {
        ConstraintLayout constraintLayout = this.f132223a.f114518c;
        C17542s.i(constraintLayout, "boxedFurnitureConstraintLayout");
        c cVar = new c();
        cVar.g(constraintLayout);
        cVar.e(i10, 7);
        cVar.e(i10, 3);
        cVar.i(i10, 7, i12, 7);
        cVar.i(i10, 3, i11, 3);
        cVar.c(constraintLayout);
    }

    public void a(List<PlacedFurniture> list, Context context, t tVar, View.OnClickListener onClickListener) {
        int i10;
        C17542s.j(context, "context");
        C17542s.j(tVar, "picasso");
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            C16877v.g1(list, new C3269a());
            b0 b0Var = this.f132223a;
            b0Var.f114517b.setOnClickListener(onClickListener);
            if (!collection.isEmpty()) {
                ImageView[] imageViewArr = {b0Var.f114526k, b0Var.f114528m, b0Var.f114529n, b0Var.f114527l, b0Var.f114525j};
                int i11 = 0;
                while (true) {
                    i10 = 5;
                    if (i11 >= 5) {
                        break;
                    }
                    ImageView imageView = imageViewArr[i11];
                    imageView.setOnClickListener(onClickListener);
                    imageView.setVisibility(8);
                    i11++;
                }
                Integer valueOf = Integer.valueOf(list.size());
                if (valueOf.intValue() > 5) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i10 = valueOf.intValue();
                }
                int i12 = 0;
                for (Object next : list.subList(0, i10)) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C16877v.x();
                    }
                    LocalProduct localProduct = ((PlacedFurniture) next).getLocalProduct();
                    tVar.n(localProduct != null ? localProduct.getThumbUrl() : null).i(R.drawable.sc_ic_placeholder).d(imageViewArr[i12]);
                    imageViewArr[i12].setVisibility(0);
                    i12 = i13;
                }
                if (list.size() == 2) {
                    int id2 = b0Var.f114518c.getId();
                    b(imageViewArr[1].getId(), id2, id2);
                    return;
                }
                b(imageViewArr[1].getId(), b0Var.f114522g.getId(), b0Var.f114523h.getId());
                return;
            }
            b0Var.f114518c.setBackgroundResource(R.color.white);
            b0Var.f114517b.setForeground(C6012a.e(context, R.drawable.sc_furniture_box_rounded_rectangle_border_white));
        }
    }
}
