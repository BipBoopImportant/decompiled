package H9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: H9.w  reason: case insensitive filesystem */
final class C6548w implements i.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BasePendingResult f36650a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C6550y f36651b;

    C6548w(C6550y yVar, BasePendingResult basePendingResult) {
        this.f36651b = yVar;
        this.f36650a = basePendingResult;
    }

    public final void a(Status status) {
        this.f36651b.f36654a.remove(this.f36650a);
    }
}
