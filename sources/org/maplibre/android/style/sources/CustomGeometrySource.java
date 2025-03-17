package org.maplibre.android.style.sources;

import XH.C16807N;
import androidx.annotation.Keep;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u0003\u001f.*J$\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH ¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H ¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H ¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0003¢\u0006\u0004\b$\u0010#J'\u0010&\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006H ¢\u0006\u0004\b(\u0010#R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R \u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001d018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u00103R\"\u00107\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0006\u0012\u0004\u0018\u000105018\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00103¨\u00069"}, d2 = {"Lorg/maplibre/android/style/sources/CustomGeometrySource;", "Lorg/maplibre/android/style/sources/Source;", "", "sourceId", "", "options", "LXH/N;", "initialize", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "filter", "Lorg/maplibre/geojson/Feature;", "querySourceFeatures", "([Ljava/lang/Object;)[Lorg/maplibre/geojson/Feature;", "", "z", "x", "y", "Lorg/maplibre/geojson/FeatureCollection;", "data", "nativeSetTileData", "(IIILorg/maplibre/geojson/FeatureCollection;)V", "nativeInvalidateTile", "(III)V", "Lorg/maplibre/android/geometry/LatLngBounds;", "bounds", "nativeInvalidateBounds", "(Lorg/maplibre/android/geometry/LatLngBounds;)V", "fetchTile", "Lorg/maplibre/android/style/sources/CustomGeometrySource$b;", "request", "c", "(Lorg/maplibre/android/style/sources/CustomGeometrySource$b;)V", "cancelTile", "startThreads", "()V", "releaseThreads", "", "isCancelled", "(III)Z", "finalize", "Ljava/util/concurrent/locks/Lock;", "a", "Ljava/util/concurrent/locks/Lock;", "executorLock", "Ljava/util/concurrent/ThreadPoolExecutor;", "b", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "", "Lorg/maplibre/android/style/sources/CustomGeometrySource$c;", "Ljava/util/Map;", "awaitingTasksMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "inProgressTasksMap", "e", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomGeometrySource extends Source {

    /* renamed from: e  reason: collision with root package name */
    public static final a f146085e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicInteger f146086f = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private final Lock f146087a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ThreadPoolExecutor f146088b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<c, b> f146089c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<c, AtomicBoolean> f146090d;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/maplibre/android/style/sources/CustomGeometrySource$a;", "", "<init>", "()V", "", "THREAD_PREFIX", "Ljava/lang/String;", "", "THREAD_POOL_LIMIT", "I", "Ljava/util/concurrent/atomic/AtomicInteger;", "poolCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lorg/maplibre/android/style/sources/CustomGeometrySource$b;", "Ljava/lang/Runnable;", "Lorg/maplibre/android/style/sources/CustomGeometrySource$c;", "id", "Lorg/maplibre/android/style/sources/b;", "provider", "", "awaiting", "Ljava/util/concurrent/atomic/AtomicBoolean;", "inProgress", "Lorg/maplibre/android/style/sources/CustomGeometrySource;", "_source", "_cancelled", "<init>", "(Lorg/maplibre/android/style/sources/CustomGeometrySource$c;Lorg/maplibre/android/style/sources/b;Ljava/util/Map;Ljava/util/Map;Lorg/maplibre/android/style/sources/CustomGeometrySource;Ljava/util/concurrent/atomic/AtomicBoolean;)V", "", "a", "()Z", "LXH/N;", "run", "()V", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/maplibre/android/style/sources/CustomGeometrySource$c;", "b", "Ljava/util/Map;", "c", "Ljava/lang/ref/WeakReference;", "d", "Ljava/lang/ref/WeakReference;", "sourceRef", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancelled", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final c f146091a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<c, b> f146092b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<c, AtomicBoolean> f146093c;

        /* renamed from: d  reason: collision with root package name */
        private final WeakReference<CustomGeometrySource> f146094d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicBoolean f146095e;

        public b(c cVar, b bVar, Map<c, b> map, Map<c, AtomicBoolean> map2, CustomGeometrySource customGeometrySource, AtomicBoolean atomicBoolean) {
            C17542s.j(cVar, "id");
            this.f146091a = cVar;
            this.f146092b = map;
            this.f146093c = map2;
            this.f146094d = new WeakReference<>(customGeometrySource);
            this.f146095e = atomicBoolean;
        }

        private final boolean a() {
            AtomicBoolean atomicBoolean = this.f146095e;
            C17542s.g(atomicBoolean);
            return atomicBoolean.get();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C17542s.e(b.class, obj.getClass())) {
                return false;
            }
            return C17542s.e(this.f146091a, ((b) obj).f146091a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
            if (a() == false) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
            r0 = r5.f146092b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            r1 = r5.f146093c;
            kotlin.jvm.internal.C17542s.g(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r5.f146093c.remove(r5.f146091a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
            if (r5.f146092b.containsKey(r5.f146091a) == false) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
            r2 = r5.f146092b.get(r5.f146091a);
            r3 = r5.f146094d.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
            if (r3 == null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
            if (r2 == null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
            r3 = org.maplibre.android.style.sources.CustomGeometrySource.a(r3);
            kotlin.jvm.internal.C17542s.g(r3);
            r3.execute(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0080, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
            r5.f146092b.remove(r5.f146091a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
            r2 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0094, code lost:
            kotlin.jvm.internal.C17542s.g((java.lang.Object) null);
            org.maplibre.android.geometry.LatLngBounds.Companion.e(r5.f146091a.c(), r5.f146091a.a(), r5.f146091a.b());
            r5.f146091a.c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b4, code lost:
            throw null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, org.maplibre.android.style.sources.CustomGeometrySource$b> r0 = r5.f146092b
                kotlin.jvm.internal.C17542s.g(r0)
                monitor-enter(r0)
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r1 = r5.f146093c     // Catch:{ all -> 0x002e }
                kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x002e }
                monitor-enter(r1)     // Catch:{ all -> 0x002e }
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r2 = r5.f146093c     // Catch:{ all -> 0x0028 }
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a     // Catch:{ all -> 0x0028 }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x0028 }
                if (r2 == 0) goto L_0x0031
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, org.maplibre.android.style.sources.CustomGeometrySource$b> r2 = r5.f146092b     // Catch:{ all -> 0x0028 }
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a     // Catch:{ all -> 0x0028 }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x0028 }
                if (r2 != 0) goto L_0x002b
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, org.maplibre.android.style.sources.CustomGeometrySource$b> r2 = r5.f146092b     // Catch:{ all -> 0x0028 }
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a     // Catch:{ all -> 0x0028 }
                r2.put(r3, r5)     // Catch:{ all -> 0x0028 }
                goto L_0x002b
            L_0x0028:
                r2 = move-exception
                goto L_0x00b5
            L_0x002b:
                monitor-exit(r1)     // Catch:{ all -> 0x002e }
                monitor-exit(r0)
                return
            L_0x002e:
                r1 = move-exception
                goto L_0x00b7
            L_0x0031:
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r2 = r5.f146093c     // Catch:{ all -> 0x0028 }
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a     // Catch:{ all -> 0x0028 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r5.f146095e     // Catch:{ all -> 0x0028 }
                java.lang.Object r2 = r2.put(r3, r4)     // Catch:{ all -> 0x0028 }
                java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2     // Catch:{ all -> 0x0028 }
                monitor-exit(r1)     // Catch:{ all -> 0x002e }
                monitor-exit(r0)
                boolean r0 = r5.a()
                if (r0 == 0) goto L_0x0094
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, org.maplibre.android.style.sources.CustomGeometrySource$b> r0 = r5.f146092b
                monitor-enter(r0)
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r1 = r5.f146093c     // Catch:{ all -> 0x008e }
                kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x008e }
                monitor-enter(r1)     // Catch:{ all -> 0x008e }
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, java.util.concurrent.atomic.AtomicBoolean> r2 = r5.f146093c     // Catch:{ all -> 0x0080 }
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a     // Catch:{ all -> 0x0080 }
                r2.remove(r3)     // Catch:{ all -> 0x0080 }
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, org.maplibre.android.style.sources.CustomGeometrySource$b> r2 = r5.f146092b     // Catch:{ all -> 0x0080 }
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a     // Catch:{ all -> 0x0080 }
                boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x0080 }
                if (r2 == 0) goto L_0x0089
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, org.maplibre.android.style.sources.CustomGeometrySource$b> r2 = r5.f146092b     // Catch:{ all -> 0x0080 }
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a     // Catch:{ all -> 0x0080 }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0080 }
                org.maplibre.android.style.sources.CustomGeometrySource$b r2 = (org.maplibre.android.style.sources.CustomGeometrySource.b) r2     // Catch:{ all -> 0x0080 }
                java.lang.ref.WeakReference<org.maplibre.android.style.sources.CustomGeometrySource> r3 = r5.f146094d     // Catch:{ all -> 0x0080 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0080 }
                org.maplibre.android.style.sources.CustomGeometrySource r3 = (org.maplibre.android.style.sources.CustomGeometrySource) r3     // Catch:{ all -> 0x0080 }
                if (r3 == 0) goto L_0x0082
                if (r2 == 0) goto L_0x0082
                java.util.concurrent.ThreadPoolExecutor r3 = r3.f146088b     // Catch:{ all -> 0x0080 }
                kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ all -> 0x0080 }
                r3.execute(r2)     // Catch:{ all -> 0x0080 }
                goto L_0x0082
            L_0x0080:
                r2 = move-exception
                goto L_0x0090
            L_0x0082:
                java.util.Map<org.maplibre.android.style.sources.CustomGeometrySource$c, org.maplibre.android.style.sources.CustomGeometrySource$b> r2 = r5.f146092b     // Catch:{ all -> 0x0080 }
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a     // Catch:{ all -> 0x0080 }
                r2.remove(r3)     // Catch:{ all -> 0x0080 }
            L_0x0089:
                XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x0080 }
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                monitor-exit(r0)
                return
            L_0x008e:
                r1 = move-exception
                goto L_0x0092
            L_0x0090:
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r2     // Catch:{ all -> 0x008e }
            L_0x0092:
                monitor-exit(r0)
                throw r1
            L_0x0094:
                r0 = 0
                kotlin.jvm.internal.C17542s.g(r0)
                org.maplibre.android.geometry.LatLngBounds$c r1 = org.maplibre.android.geometry.LatLngBounds.Companion
                org.maplibre.android.style.sources.CustomGeometrySource$c r2 = r5.f146091a
                int r2 = r2.c()
                org.maplibre.android.style.sources.CustomGeometrySource$c r3 = r5.f146091a
                int r3 = r3.a()
                org.maplibre.android.style.sources.CustomGeometrySource$c r4 = r5.f146091a
                int r4 = r4.b()
                r1.e(r2, r3, r4)
                org.maplibre.android.style.sources.CustomGeometrySource$c r1 = r5.f146091a
                r1.c()
                throw r0
            L_0x00b5:
                monitor-exit(r1)     // Catch:{ all -> 0x002e }
                throw r2     // Catch:{ all -> 0x002e }
            L_0x00b7:
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.style.sources.CustomGeometrySource.b.run():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u0014\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lorg/maplibre/android/style/sources/CustomGeometrySource$c;", "", "", "z", "x", "y", "<init>", "(III)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "setZ", "(I)V", "b", "setX", "setY", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private int f146096a;

        /* renamed from: b  reason: collision with root package name */
        private int f146097b;

        /* renamed from: c  reason: collision with root package name */
        private int f146098c;

        public c(int i10, int i11, int i12) {
            this.f146096a = i10;
            this.f146097b = i11;
            this.f146098c = i12;
        }

        public final int a() {
            return this.f146097b;
        }

        public final int b() {
            return this.f146098c;
        }

        public final int c() {
            return this.f146096a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null) {
                if (C17542s.e(c.class, obj.getClass()) && (obj instanceof c)) {
                    c cVar = (c) obj;
                    return this.f146096a == cVar.f146096a && this.f146097b == cVar.f146097b && this.f146098c == cVar.f146098c;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new int[]{this.f146096a, this.f146097b, this.f146098c});
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"org/maplibre/android/style/sources/CustomGeometrySource$d", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "getThreadCount", "()Ljava/util/concurrent/atomic/AtomicInteger;", "threadCount", "", "b", "I", "getPoolId", "()I", "poolId", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f146099a = new AtomicInteger();

        /* renamed from: b  reason: collision with root package name */
        private final int f146100b = CustomGeometrySource.f146086f.getAndIncrement();

        d() {
        }

        public Thread newThread(Runnable runnable) {
            C17542s.j(runnable, "runnable");
            V v10 = V.f144353a;
            String format = String.format(Locale.US, "%s-%d-%d", Arrays.copyOf(new Object[]{"CustomGeom", Integer.valueOf(this.f146100b), Integer.valueOf(this.f146099a.getAndIncrement())}, 3));
            C17542s.i(format, "format(...)");
            return new Thread(runnable, format);
        }
    }

    private final void c(b bVar) {
        this.f146087a.lock();
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f146088b;
            if (threadPoolExecutor != null) {
                C17542s.g(threadPoolExecutor);
                if (!threadPoolExecutor.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = this.f146088b;
                    C17542s.g(threadPoolExecutor2);
                    threadPoolExecutor2.execute(bVar);
                }
            }
        } finally {
            this.f146087a.unlock();
        }
    }

    @Keep
    private final void cancelTile(int i10, int i11, int i12) {
        c cVar = new c(i10, i11, i12);
        synchronized (this.f146089c) {
            synchronized (this.f146090d) {
                try {
                    AtomicBoolean atomicBoolean = this.f146090d.get(cVar);
                    if (atomicBoolean != null) {
                        if (!atomicBoolean.compareAndSet(false, true)) {
                        }
                        C16807N n10 = C16807N.f139792a;
                    }
                    b bVar = new b(cVar, (b) null, (Map<c, b>) null, (Map<c, AtomicBoolean>) null, (CustomGeometrySource) null, (AtomicBoolean) null);
                    ThreadPoolExecutor threadPoolExecutor = this.f146088b;
                    C17542s.g(threadPoolExecutor);
                    if (!threadPoolExecutor.getQueue().remove(bVar)) {
                        this.f146089c.remove(cVar);
                    }
                    C16807N n102 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Keep
    private final void fetchTile(int i10, int i11, int i12) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c cVar = new c(i10, i11, i12);
        b bVar = new b(cVar, (b) null, this.f146089c, this.f146090d, this, atomicBoolean);
        synchronized (this.f146089c) {
            synchronized (this.f146090d) {
                try {
                    ThreadPoolExecutor threadPoolExecutor = this.f146088b;
                    C17542s.g(threadPoolExecutor);
                    if (threadPoolExecutor.getQueue().contains(bVar)) {
                        ThreadPoolExecutor threadPoolExecutor2 = this.f146088b;
                        C17542s.g(threadPoolExecutor2);
                        threadPoolExecutor2.remove(bVar);
                        c(bVar);
                        C16807N n10 = C16807N.f139792a;
                    } else if (this.f146090d.containsKey(cVar)) {
                        this.f146089c.put(cVar, bVar);
                    } else {
                        c(bVar);
                        C16807N n11 = C16807N.f139792a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Keep
    private final native void initialize(String str, Object obj);

    @Keep
    private final boolean isCancelled(int i10, int i11, int i12) {
        AtomicBoolean atomicBoolean = this.f146090d.get(new c(i10, i11, i12));
        C17542s.g(atomicBoolean);
        return atomicBoolean.get();
    }

    @Keep
    private final native void nativeInvalidateBounds(LatLngBounds latLngBounds);

    @Keep
    private final native void nativeInvalidateTile(int i10, int i11, int i12);

    @Keep
    private final native void nativeSetTileData(int i10, int i11, int i12, FeatureCollection featureCollection);

    @Keep
    private final native Feature[] querySourceFeatures(Object[] objArr);

    @Keep
    private final void releaseThreads() {
        this.f146087a.lock();
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f146088b;
            C17542s.g(threadPoolExecutor);
            threadPoolExecutor.shutdownNow();
        } finally {
            this.f146087a.unlock();
        }
    }

    @Keep
    private final void startThreads() {
        this.f146087a.lock();
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f146088b;
            if (threadPoolExecutor != null) {
                C17542s.g(threadPoolExecutor);
                if (!threadPoolExecutor.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = this.f146088b;
                    C17542s.g(threadPoolExecutor2);
                    threadPoolExecutor2.shutdownNow();
                }
            }
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(4, 4, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d());
            this.f146087a.unlock();
            this.f146088b = threadPoolExecutor3;
        } catch (Throwable th2) {
            this.f146087a.unlock();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public final native void finalize();
}
