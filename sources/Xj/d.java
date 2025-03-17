package Xj;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"LXj/d;", "LXj/c;", "LXj/a;", "viewReference", "<init>", "(LXj/a;)V", "Landroid/view/View;", "viewport", "preview", "(Landroid/view/View;Landroid/view/View;)V", "Landroid/graphics/Rect;", "bounds", "", "frameWidth", "frameHeight", "", "a", "(Landroid/graphics/Rect;II)Z", "b", "(Landroid/graphics/Rect;II)Landroid/graphics/Rect;", "LXj/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f89196a;

    public d(a aVar) {
        C17542s.j(aVar, "viewReference");
        this.f89196a = aVar;
    }

    public boolean a(Rect rect, int i10, int i11) {
        C17542s.j(rect, "bounds");
        if (!this.f89196a.b()) {
            return false;
        }
        return this.f89196a.a().contains(b(rect, i10, i11));
    }

    public Rect b(Rect rect, int i10, int i11) {
        C17542s.j(rect, "bounds");
        if (!this.f89196a.b()) {
            return rect;
        }
        float d10 = (float) this.f89196a.d();
        float f10 = (float) i10;
        float c10 = (float) this.f89196a.c();
        float f11 = (float) i11;
        float max = Math.max(d10 / f10, c10 / f11);
        float f12 = (float) 2;
        float f13 = ((f10 * max) - d10) / f12;
        float f14 = ((f11 * max) - c10) / f12;
        return new Rect((int) ((((float) rect.left) * max) - f13), (int) ((((float) rect.top) * max) - f14), (int) ((((float) rect.right) * max) - f13), (int) ((((float) rect.bottom) * max) - f14));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(View view, View view2) {
        this(new b(view, view2));
        C17542s.j(view, "viewport");
        C17542s.j(view2, "preview");
    }
}
