package Xj;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0016¨\u0006\u0018"}, d2 = {"LXj/b;", "LXj/a;", "Landroid/view/View;", "viewport", "preview", "<init>", "(Landroid/view/View;Landroid/view/View;)V", "a", "Landroid/view/View;", "b", "Landroid/graphics/Rect;", "c", "Landroid/graphics/Rect;", "viewportRect", "()Landroid/graphics/Rect;", "viewportBounds", "", "d", "()I", "previewWidth", "previewHeight", "", "()Z", "isLaidOut", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f89193a;

    /* renamed from: b  reason: collision with root package name */
    private final View f89194b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f89195c = new Rect();

    public b(View view, View view2) {
        C17542s.j(view, "viewport");
        C17542s.j(view2, "preview");
        this.f89193a = view;
        this.f89194b = view2;
    }

    public Rect a() {
        Rect rect = this.f89195c;
        this.f89193a.getHitRect(rect);
        return rect;
    }

    public boolean b() {
        return this.f89193a.isLaidOut() && this.f89194b.isLaidOut();
    }

    public int c() {
        return this.f89194b.getMeasuredHeight();
    }

    public int d() {
        return this.f89194b.getMeasuredWidth();
    }
}
