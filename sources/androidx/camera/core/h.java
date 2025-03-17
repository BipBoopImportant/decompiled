package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.f;
import androidx.concurrent.futures.c;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f16687a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f16688b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f16689c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n f16690d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Rect f16691e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f.a f16692f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c.a f16693g;

    public /* synthetic */ h(i iVar, n nVar, Matrix matrix, n nVar2, Rect rect, f.a aVar, c.a aVar2) {
        this.f16687a = iVar;
        this.f16688b = nVar;
        this.f16689c = matrix;
        this.f16690d = nVar2;
        this.f16691e = rect;
        this.f16692f = aVar;
        this.f16693g = aVar2;
    }

    public final void run() {
        this.f16687a.m(this.f16688b, this.f16689c, this.f16690d, this.f16691e, this.f16692f, this.f16693g);
    }
}
