package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.f;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;

public final /* synthetic */ class g implements c.C0320c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f16680a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f16681b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f16682c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f16683d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f16684e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Rect f16685f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f.a f16686g;

    public /* synthetic */ g(i iVar, Executor executor, n nVar, Matrix matrix, n nVar2, Rect rect, f.a aVar) {
        this.f16680a = iVar;
        this.f16681b = executor;
        this.f16682c = nVar;
        this.f16683d = matrix;
        this.f16684e = nVar2;
        this.f16685f = rect;
        this.f16686g = aVar;
    }

    public final Object a(c.a aVar) {
        return this.f16680a.n(this.f16681b, this.f16682c, this.f16683d, this.f16684e, this.f16685f, this.f16686g, aVar);
    }
}
