package com.optimizely.ab.config;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f122318a;

    public /* synthetic */ a(ThreadFactory threadFactory) {
        this.f122318a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return PollingProjectConfigManager.lambda$new$0(this.f122318a, runnable);
    }
}
