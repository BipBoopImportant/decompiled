package Qa;

import Ea.C9068b;
import K2.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.activity.C4987b;

/* renamed from: Qa.a  reason: case insensitive filesystem */
public abstract class C9234a<V extends View> {

    /* renamed from: a  reason: collision with root package name */
    private final TimeInterpolator f62875a;

    /* renamed from: b  reason: collision with root package name */
    protected final V f62876b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f62877c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f62878d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f62879e;

    /* renamed from: f  reason: collision with root package name */
    private C4987b f62880f;

    public C9234a(V v10) {
        this.f62876b = v10;
        Context context = v10.getContext();
        this.f62875a = C9242i.g(context, C9068b.f59314T, a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f62877c = C9242i.f(context, C9068b.f59304J, 300);
        this.f62878d = C9242i.f(context, C9068b.f59308N, 150);
        this.f62879e = C9242i.f(context, C9068b.f59307M, 100);
    }

    public float a(float f10) {
        return this.f62875a.getInterpolation(f10);
    }

    /* access modifiers changed from: protected */
    public C4987b b() {
        if (this.f62880f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C4987b bVar = this.f62880f;
        this.f62880f = null;
        return bVar;
    }

    public C4987b c() {
        C4987b bVar = this.f62880f;
        this.f62880f = null;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void d(C4987b bVar) {
        this.f62880f = bVar;
    }

    /* access modifiers changed from: protected */
    public C4987b e(C4987b bVar) {
        if (this.f62880f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C4987b bVar2 = this.f62880f;
        this.f62880f = bVar;
        return bVar2;
    }
}
