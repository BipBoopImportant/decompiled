package a9;

import androidx.recyclerview.widget.RecyclerView;
import com.contentsquare.android.sdk.C7129i;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.RecyclerViewScroller", f = "RecyclerViewScroller.kt", l = {17, 20}, m = "scrollToPositionAndWait")
public final class D extends d {

    /* renamed from: c  reason: collision with root package name */
    public int f41945c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f41946d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C7129i f41947e;

    /* renamed from: f  reason: collision with root package name */
    public int f41948f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public D(C7129i iVar, C17164e<? super D> eVar) {
        super(eVar);
        this.f41947e = iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f41946d = obj;
        this.f41948f |= Integer.MIN_VALUE;
        return this.f41947e.b((RecyclerView) null, 0, this);
    }
}
