package a9;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.contentsquare.android.sdk.C7141n1;
import com.contentsquare.android.sdk.r1;
import dI.C17164e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.RecyclerViewCaptureUseCase", f = "RecyclerViewCaptureUseCase.kt", l = {141, 150}, m = "scrollViewUntilTargetPosition")
/* renamed from: a9.d  reason: case insensitive filesystem */
public final class C6805d extends d {

    /* renamed from: c  reason: collision with root package name */
    public C7141n1 f42487c;

    /* renamed from: d  reason: collision with root package name */
    public r1 f42488d;

    /* renamed from: e  reason: collision with root package name */
    public String f42489e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f42490f;

    /* renamed from: g  reason: collision with root package name */
    public Rect f42491g;

    /* renamed from: h  reason: collision with root package name */
    public int f42492h;

    /* renamed from: i  reason: collision with root package name */
    public int f42493i;

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f42494j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C7141n1 f42495k;

    /* renamed from: l  reason: collision with root package name */
    public int f42496l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6805d(C7141n1 n1Var, C17164e<? super C6805d> eVar) {
        super(eVar);
        this.f42495k = n1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f42494j = obj;
        this.f42496l |= Integer.MIN_VALUE;
        return C7141n1.b(this.f42495k, (r1) null, (String) null, (RecyclerView) null, (Rect) null, 0, 0, this);
    }
}
