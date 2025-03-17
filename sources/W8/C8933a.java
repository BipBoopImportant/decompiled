package w8;

import XH.v;
import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import nI.C17642l;
import z8.C9036b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lw8/a;", "", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)Z", "d", "Lz8/b;", "nativeViewLight", "isSnapshotFromSrEnabled", "LXH/N;", "e", "(Landroid/view/View;Lz8/b;Z)V", "LXH/v;", "", "targetCoordinates", "Lw8/d;", "g", "(Landroid/view/View;LXH/v;)Lw8/d;", "clipToParent", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "", "bitmapProvider", "Lw8/e;", "c", "(Landroid/view/View;ZLnI/l;)Lw8/e;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w8.a  reason: case insensitive filesystem */
public interface C8933a {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w8.a$a  reason: collision with other inner class name */
    public static final class C0923a {
        public static /* synthetic */ d a(C8933a aVar, View view, v vVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    vVar = null;
                }
                return aVar.g(view, vVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getComposeScroller");
        }
    }

    boolean a(View view);

    e c(View view, boolean z10, C17642l<? super Rect, String> lVar);

    boolean d(View view);

    void e(View view, C9036b bVar, boolean z10);

    d g(View view, v<Integer, Integer> vVar);
}
