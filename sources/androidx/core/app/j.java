package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final b f20977a;

    private static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private static HandlerThread f20978e;

        /* renamed from: f  reason: collision with root package name */
        private static Handler f20979f;

        /* renamed from: a  reason: collision with root package name */
        int f20980a;

        /* renamed from: b  reason: collision with root package name */
        SparseIntArray[] f20981b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f20982c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f20983d = new C0326a();

        /* renamed from: androidx.core.app.j$a$a  reason: collision with other inner class name */
        class C0326a implements Window.OnFrameMetricsAvailableListener {
            C0326a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f20980a & 1) != 0) {
                    aVar.e(aVar.f20981b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f20980a & 2) != 0) {
                    aVar2.e(aVar2.f20981b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f20980a & 4) != 0) {
                    aVar3.e(aVar3.f20981b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f20980a & 8) != 0) {
                    aVar4.e(aVar4.f20981b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f20980a & 16) != 0) {
                    aVar5.e(aVar5.f20981b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f20980a & 64) != 0) {
                    aVar6.e(aVar6.f20981b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f20980a & 32) != 0) {
                    aVar7.e(aVar7.f20981b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f20980a & 128) != 0) {
                    aVar8.e(aVar8.f20981b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f20980a & 256) != 0) {
                    aVar9.e(aVar9.f20981b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f20980a = i10;
        }

        public void a(Activity activity) {
            if (f20978e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f20978e = handlerThread;
                handlerThread.start();
                f20979f = new Handler(f20978e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f20981b;
                if (sparseIntArrayArr[i10] == null && (this.f20980a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f20983d, f20979f);
            this.f20982c.add(new WeakReference(activity));
        }

        public SparseIntArray[] b() {
            return this.f20981b;
        }

        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f20982c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() == activity) {
                    this.f20982c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f20983d);
            return this.f20981b;
        }

        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f20981b;
            this.f20981b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* access modifiers changed from: package-private */
        public void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public void a(Activity activity) {
            throw null;
        }

        public SparseIntArray[] b() {
            throw null;
        }

        public SparseIntArray[] c(Activity activity) {
            throw null;
        }

        public SparseIntArray[] d() {
            throw null;
        }
    }

    public j() {
        this(1);
    }

    public void a(Activity activity) {
        this.f20977a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f20977a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f20977a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f20977a.d();
    }

    public j(int i10) {
        this.f20977a = new a(i10);
    }
}
