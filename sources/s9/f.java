package s9;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import s9.C8747c;
import v9.C8903a;

public abstract class f {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private C8903a f56014a;

        /* renamed from: b  reason: collision with root package name */
        private Map<j9.f, b> f56015b = new HashMap();

        public a a(j9.f fVar, b bVar) {
            this.f56015b.put(fVar, bVar);
            return this;
        }

        public f b() {
            if (this.f56014a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f56015b.keySet().size() >= j9.f.values().length) {
                Map<j9.f, b> map = this.f56015b;
                this.f56015b = new HashMap();
                return f.d(this.f56014a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        public a c(C8903a aVar) {
            this.f56014a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new C8747c.b().c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, (double) i11) * ((double) j10) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j10 > 1 ? j10 : 2) * ((long) i11)))));
    }

    public static a b() {
        return new a();
    }

    static f d(C8903a aVar, Map<j9.f, b> map) {
        return new C8746b(aVar, map);
    }

    public static f f(C8903a aVar) {
        return b().a(j9.f.DEFAULT, b.a().b(30000).d(86400000).a()).a(j9.f.HIGHEST, b.a().b(1000).d(86400000).a()).a(j9.f.VERY_LOW, b.a().b(86400000).d(86400000).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, j9.f fVar, long j10, int i10) {
        builder.setMinimumLatency(g(fVar, j10, i10));
        j(builder, h().get(fVar).c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    public abstract C8903a e();

    public long g(j9.f fVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(fVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map<j9.f, b> h();
}
