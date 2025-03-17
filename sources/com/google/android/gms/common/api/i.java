package com.google.android.gms.common.api;

import com.google.android.gms.common.api.n;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

public abstract class i<R extends n> {

    public interface a {
        void a(Status status);
    }

    public abstract void a(a aVar);

    @ResultIgnorabilityUnspecified
    public abstract R b(long j10, TimeUnit timeUnit);
}
