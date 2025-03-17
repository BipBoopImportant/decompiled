package oE;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: oE.m  reason: case insensitive filesystem */
class C14890m {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f130126a = Executors.newSingleThreadExecutor();

    /* renamed from: oE.m$a */
    private static class a implements Callable<SharedPreferences> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f130127a;

        /* renamed from: b  reason: collision with root package name */
        private final String f130128b;

        /* renamed from: c  reason: collision with root package name */
        private final b f130129c;

        public a(Context context, String str, b bVar) {
            this.f130127a = context;
            this.f130128b = str;
            this.f130129c = bVar;
        }

        /* renamed from: a */
        public SharedPreferences call() {
            SharedPreferences sharedPreferences = this.f130127a.getSharedPreferences(this.f130128b, 0);
            b bVar = this.f130129c;
            if (bVar != null) {
                bVar.a(sharedPreferences);
            }
            return sharedPreferences;
        }
    }

    /* renamed from: oE.m$b */
    interface b {
        void a(SharedPreferences sharedPreferences);
    }

    public Future<SharedPreferences> a(Context context, String str, b bVar) {
        FutureTask futureTask = new FutureTask(new a(context, str, bVar));
        this.f130126a.execute(futureTask);
        return futureTask;
    }
}
