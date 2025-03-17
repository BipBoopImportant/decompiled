package a9;

import a9.C6824f2;
import android.view.PixelCopy;

/* renamed from: a9.g2  reason: case insensitive filesystem */
public final /* synthetic */ class C6832g2 implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6825f3 f42572a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6824f2.c f42573b;

    public /* synthetic */ C6832g2(C6825f3 f3Var, C6824f2.c cVar) {
        this.f42572a = f3Var;
        this.f42573b = cVar;
    }

    public final void onPixelCopyFinished(int i10) {
        C6824f2.b.b(this.f42572a, this.f42573b, i10);
    }
}
