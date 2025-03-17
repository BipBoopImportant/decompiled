package JF;

import android.view.View;

public final /* synthetic */ class W implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f111306a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f111307b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f111308c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f111309d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f111310e;

    public /* synthetic */ W(View view, int i10, int i11, int i12, int i13) {
        this.f111306a = view;
        this.f111307b = i10;
        this.f111308c = i11;
        this.f111309d = i12;
        this.f111310e = i13;
    }

    public final void run() {
        Z.f(this.f111306a, this.f111307b, this.f111308c, this.f111309d, this.f111310e);
    }
}
