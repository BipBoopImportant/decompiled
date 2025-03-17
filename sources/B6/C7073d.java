package b6;

import a6.i;
import android.graphics.Canvas;
import android.graphics.PostProcessor;

/* renamed from: b6.d  reason: case insensitive filesystem */
public final /* synthetic */ class C7073d implements PostProcessor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f45493a;

    public /* synthetic */ C7073d(i iVar) {
        this.f45493a = iVar;
    }

    public final int onPostProcess(Canvas canvas) {
        return C7074e.e(this.f45493a, canvas);
    }
}
