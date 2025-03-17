package l5;

import androidx.work.C7034c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import java.util.List;
import s5.C8731m;

/* renamed from: l5.x  reason: case insensitive filesystem */
public final /* synthetic */ class C8527x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f54753a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8731m f54754b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C7034c f54755c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f54756d;

    public /* synthetic */ C8527x(List list, C8731m mVar, C7034c cVar, WorkDatabase workDatabase) {
        this.f54753a = list;
        this.f54754b = mVar;
        this.f54755c = cVar;
        this.f54756d = workDatabase;
    }

    public final void run() {
        a.d(this.f54753a, this.f54754b, this.f54755c, this.f54756d);
    }
}
