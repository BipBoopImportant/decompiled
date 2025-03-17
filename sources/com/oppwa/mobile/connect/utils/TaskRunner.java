package com.oppwa.mobile.connect.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TaskRunner {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f122174a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final Executor f122175b = Executors.newCachedThreadPool();

    public static class RunnableTask<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f122176a;

        /* renamed from: b  reason: collision with root package name */
        private final BaseTask<T> f122177b;

        public RunnableTask(Handler handler, BaseTask<T> baseTask) {
            this.f122176a = handler;
            this.f122177b = baseTask;
        }

        public void run() {
            try {
                this.f122176a.post(new RunnableTaskForHandler(this.f122177b, this.f122177b.call()));
            } catch (Exception e10) {
                this.f122177b.onError(e10);
            }
        }
    }

    public static class RunnableTaskForHandler<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final BaseTask<T> f122178a;

        /* renamed from: b  reason: collision with root package name */
        private final T f122179b;

        public RunnableTaskForHandler(BaseTask<T> baseTask, T t10) {
            this.f122178a = baseTask;
            this.f122179b = t10;
        }

        public void run() {
            this.f122178a.onPostExecute(this.f122179b);
        }
    }

    public <R> void executeAsync(BaseTask<R> baseTask) {
        try {
            this.f122175b.execute(new RunnableTask(this.f122174a, baseTask));
        } catch (Exception e10) {
            baseTask.onError(e10);
        }
    }
}
