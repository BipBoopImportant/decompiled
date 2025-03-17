package t5;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C7043l;
import androidx.work.C7044m;
import androidx.work.C7052v;
import androidx.work.C7055y;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;
import java.util.UUID;
import ob.C10101e;
import r5.C8689a;
import s5.C8739u;
import s5.v;
import s5.z;
import u5.C8878b;

/* renamed from: t5.L  reason: case insensitive filesystem */
public class C8801L implements C7044m {

    /* renamed from: d  reason: collision with root package name */
    private static final String f56588d = C7055y.i("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final C8878b f56589a;

    /* renamed from: b  reason: collision with root package name */
    final C8689a f56590b;

    /* renamed from: c  reason: collision with root package name */
    final v f56591c;

    @SuppressLint({"LambdaLast"})
    public C8801L(WorkDatabase workDatabase, C8689a aVar, C8878b bVar) {
        this.f56590b = aVar;
        this.f56589a = bVar;
        this.f56591c = workDatabase.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void c(UUID uuid, C7043l lVar, Context context) {
        String uuid2 = uuid.toString();
        C8739u i10 = this.f56591c.i(uuid2);
        if (i10 == null || i10.f55911b.b()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        this.f56590b.a(uuid2, lVar);
        context.startService(a.e(context, z.a(i10), lVar));
        return null;
    }

    public C10101e<Void> a(Context context, UUID uuid, C7043l lVar) {
        return C7052v.f(this.f56589a.c(), "setForegroundAsync", new C8800K(this, uuid, lVar, context));
    }
}
