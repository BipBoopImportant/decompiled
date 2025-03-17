package t5;

import androidx.work.impl.WorkDatabase;
import l5.O;

/* renamed from: t5.b  reason: case insensitive filesystem */
public final /* synthetic */ class C8807b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f56606a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f56607b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ O f56608c;

    public /* synthetic */ C8807b(WorkDatabase workDatabase, String str, O o10) {
        this.f56606a = workDatabase;
        this.f56607b = str;
        this.f56608c = o10;
    }

    public final void run() {
        C8809d.h(this.f56606a, this.f56607b, this.f56608c);
    }
}
