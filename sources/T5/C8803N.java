package t5;

import android.content.Context;
import androidx.work.C7037f;
import androidx.work.C7052v;
import androidx.work.C7055y;
import androidx.work.J;
import androidx.work.Q;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import ob.C10101e;
import s5.C8735q;
import s5.C8739u;
import u5.C8878b;

/* renamed from: t5.N  reason: case insensitive filesystem */
public class C8803N implements J {

    /* renamed from: c  reason: collision with root package name */
    static final String f56595c = C7055y.i("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    final WorkDatabase f56596a;

    /* renamed from: b  reason: collision with root package name */
    final C8878b f56597b;

    public C8803N(WorkDatabase workDatabase, C8878b bVar) {
        this.f56596a = workDatabase;
        this.f56597b = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void c(UUID uuid, C7037f fVar) {
        String uuid2 = uuid.toString();
        C7055y e10 = C7055y.e();
        String str = f56595c;
        e10.a(str, "Updating progress for " + uuid + " (" + fVar + ")");
        this.f56596a.beginTransaction();
        try {
            C8739u i10 = this.f56596a.f().i(uuid2);
            if (i10 != null) {
                if (i10.f55911b == Q.c.RUNNING) {
                    this.f56596a.e().b(new C8735q(uuid2, fVar));
                } else {
                    C7055y e11 = C7055y.e();
                    e11.k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                this.f56596a.setTransactionSuccessful();
                this.f56596a.endTransaction();
                return null;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        } catch (Throwable th2) {
            this.f56596a.endTransaction();
            throw th2;
        }
    }

    public C10101e<Void> a(Context context, UUID uuid, C7037f fVar) {
        return C7052v.f(this.f56597b.c(), "updateProgress", new C8802M(this, uuid, fVar));
    }
}
