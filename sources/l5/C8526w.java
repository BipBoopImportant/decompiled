package l5;

import androidx.work.C7034c;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;
import s5.C8731m;

/* renamed from: l5.w  reason: case insensitive filesystem */
public final /* synthetic */ class C8526w implements C8510f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f54749a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f54750b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C7034c f54751c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f54752d;

    public /* synthetic */ C8526w(Executor executor, List list, C7034c cVar, WorkDatabase workDatabase) {
        this.f54749a = executor;
        this.f54750b = list;
        this.f54751c = cVar;
        this.f54752d = workDatabase;
    }

    public final void b(C8731m mVar, boolean z10) {
        this.f54749a.execute(new C8527x(this.f54750b, mVar, this.f54751c, this.f54752d));
    }
}
