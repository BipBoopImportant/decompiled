package t5;

import androidx.work.impl.WorkDatabase;
import l5.O;
import t5.C8809d;

/* renamed from: t5.e  reason: case insensitive filesystem */
public final /* synthetic */ class C8810e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f56617a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f56618b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ O f56619c;

    public /* synthetic */ C8810e(WorkDatabase workDatabase, String str, O o10) {
        this.f56617a = workDatabase;
        this.f56618b = str;
        this.f56619c = o10;
    }

    public final void run() {
        C8809d.c.b(this.f56617a, this.f56618b, this.f56619c);
    }
}
