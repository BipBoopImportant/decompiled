package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

public abstract class AsyncTaskExecutor<Params, Result> {

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object[] f45936a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Handler f45937b;

        /* renamed from: com.adjust.sdk.scheduler.AsyncTaskExecutor$a$a  reason: collision with other inner class name */
        public class C0804a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f45939a;

            public C0804a(Object obj) {
                this.f45939a = obj;
            }

            public final void run() {
                AsyncTaskExecutor.this.onPostExecute(this.f45939a);
            }
        }

        public a(Object[] objArr, Handler handler) {
            this.f45936a = objArr;
            this.f45937b = handler;
        }

        public final void run() {
            this.f45937b.post(new C0804a(AsyncTaskExecutor.this.doInBackground(this.f45936a)));
        }
    }

    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new a(paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }
}
