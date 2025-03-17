package v;

import C.C4391e0;
import C.C4417z;
import H2.i;
import I.n;
import android.annotation.SuppressLint;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.R0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import ob.C10101e;
import u.C5965a;
import v.P1;
import v.a2;
import x.C6224d;
import x.C6227g;
import x.j;
import x.k;
import x.q;
import z.s;
import z.v;
import z.y;
import z.z;

/* renamed from: v.b1  reason: case insensitive filesystem */
final class C6054b1 implements C6057c1 {

    /* renamed from: a  reason: collision with root package name */
    final Object f30493a;

    /* renamed from: b  reason: collision with root package name */
    private final List<V> f30494b;

    /* renamed from: c  reason: collision with root package name */
    private final d f30495c;

    /* renamed from: d  reason: collision with root package name */
    P1.a f30496d;

    /* renamed from: e  reason: collision with root package name */
    P1 f30497e;

    /* renamed from: f  reason: collision with root package name */
    X0 f30498f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<C5019e0, Surface> f30499g;

    /* renamed from: h  reason: collision with root package name */
    List<C5019e0> f30500h;

    /* renamed from: i  reason: collision with root package name */
    c f30501i;

    /* renamed from: j  reason: collision with root package name */
    C10101e<Void> f30502j;

    /* renamed from: k  reason: collision with root package name */
    c.a<Void> f30503k;

    /* renamed from: l  reason: collision with root package name */
    private Map<C5019e0, Long> f30504l;

    /* renamed from: m  reason: collision with root package name */
    private final v f30505m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final z f30506n;

    /* renamed from: o  reason: collision with root package name */
    private final s f30507o;

    /* renamed from: p  reason: collision with root package name */
    private final C6227g f30508p;

    /* renamed from: q  reason: collision with root package name */
    private final y f30509q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f30510r;

    /* renamed from: v.b1$a */
    class a implements I.c<Void> {
        a() {
        }

        public void b(Throwable th2) {
            synchronized (C6054b1.this.f30493a) {
                try {
                    C6054b1.this.f30496d.stop();
                    int ordinal = C6054b1.this.f30501i.ordinal();
                    if (ordinal == 3 || ordinal == 5 || ordinal == 6) {
                        if (!(th2 instanceof CancellationException)) {
                            C4391e0.m("CaptureSession", "Opening session with fail " + C6054b1.this.f30501i, th2);
                            C6054b1.this.r();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* renamed from: c */
        public void a(Void voidR) {
        }
    }

    /* renamed from: v.b1$b */
    class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C6054b1.this.f30493a) {
                try {
                    X0 x02 = C6054b1.this.f30498f;
                    if (x02 != null) {
                        V k10 = x02.k();
                        C4391e0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                        C6054b1 b1Var = C6054b1.this;
                        b1Var.a(Collections.singletonList(b1Var.f30506n.a(k10)));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: v.b1$c */
    enum c {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: v.b1$d */
    final class d extends P1.c {
        d() {
        }

        public void r(P1 p12) {
            synchronized (C6054b1.this.f30493a) {
                try {
                    switch (C6054b1.this.f30501i.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C6054b1.this.f30501i);
                        case 3:
                        case 5:
                        case 6:
                            C6054b1.this.r();
                            break;
                        case 7:
                            C4391e0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    C4391e0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C6054b1.this.f30501i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void s(P1 p12) {
            synchronized (C6054b1.this.f30493a) {
                try {
                    switch (C6054b1.this.f30501i.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C6054b1.this.f30501i);
                        case 3:
                            C6054b1 b1Var = C6054b1.this;
                            b1Var.f30501i = c.OPENED;
                            b1Var.f30497e = p12;
                            C4391e0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C6054b1 b1Var2 = C6054b1.this;
                            b1Var2.x(b1Var2.f30498f);
                            C6054b1.this.w();
                            break;
                        case 5:
                            C6054b1.this.f30497e = p12;
                            break;
                        case 6:
                            p12.close();
                            break;
                    }
                    C4391e0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C6054b1.this.f30501i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void t(P1 p12) {
            synchronized (C6054b1.this.f30493a) {
                try {
                    if (C6054b1.this.f30501i.ordinal() != 0) {
                        C4391e0.a("CaptureSession", "CameraCaptureSession.onReady() " + C6054b1.this.f30501i);
                    } else {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C6054b1.this.f30501i);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void u(P1 p12) {
            synchronized (C6054b1.this.f30493a) {
                try {
                    if (C6054b1.this.f30501i != c.UNINITIALIZED) {
                        C4391e0.a("CaptureSession", "onSessionFinished()");
                        C6054b1.this.r();
                    } else {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C6054b1.this.f30501i);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    C6054b1(C6227g gVar) {
        this(gVar, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object B(c.a aVar) {
        String str;
        synchronized (this.f30493a) {
            i.j(this.f30503k == null, "Release completer expected to be null");
            this.f30503k = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public C10101e<Void> A(List<Surface> list, X0 x02, CameraDevice cameraDevice) {
        synchronized (this.f30493a) {
            try {
                int ordinal = this.f30501i.ordinal();
                if (!(ordinal == 0 || ordinal == 1)) {
                    if (ordinal == 2) {
                        this.f30499g.clear();
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            this.f30499g.put(this.f30500h.get(i10), list.get(i10));
                        }
                        this.f30501i = c.OPENING;
                        C4391e0.a("CaptureSession", "Opening capture session.");
                        P1.c w10 = a2.w(this.f30495c, new a2.a(x02.l()));
                        C5965a aVar = new C5965a(x02.f());
                        V.a k10 = V.a.k(x02.k());
                        Map<X0.f, k> hashMap = new HashMap<>();
                        if (this.f30510r && Build.VERSION.SDK_INT >= 35) {
                            hashMap = q(u(x02.h()), this.f30499g);
                        }
                        ArrayList arrayList = new ArrayList();
                        String b02 = aVar.b0((String) null);
                        for (X0.f next : x02.h()) {
                            k kVar = (!this.f30510r || Build.VERSION.SDK_INT < 35) ? null : hashMap.get(next);
                            if (kVar == null) {
                                kVar = s(next, this.f30499g, b02);
                                if (this.f30504l.containsKey(next.f())) {
                                    kVar.h(this.f30504l.get(next.f()).longValue());
                                }
                            }
                            arrayList.add(kVar);
                        }
                        q m10 = this.f30496d.m(x02.m(), t(arrayList), w10);
                        if (x02.p() == 5 && x02.g() != null) {
                            m10.f(j.b(x02.g()));
                        }
                        CaptureRequest f10 = C6024E0.f(k10.h(), cameraDevice, this.f30509q);
                        if (f10 != null) {
                            m10.g(f10);
                        }
                        C10101e<Void> e10 = this.f30496d.e(cameraDevice, m10, this.f30500h);
                        return e10;
                    } else if (ordinal != 4) {
                        C10101e<Void> n10 = n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f30501i));
                        return n10;
                    }
                }
                C10101e<Void> n11 = n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f30501i));
                return n11;
            } catch (CameraAccessException e11) {
                return n.n(e11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private CameraCaptureSession.CaptureCallback o(List<C5040p> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (C5040p a10 : list) {
            arrayList.add(U0.a(a10));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C6043U.a(arrayList);
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static List<OutputConfiguration> p(List<MultiResolutionStreamInfo> list, int i10) {
        try {
            return (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", new Class[]{Collection.class, Integer.TYPE}).invoke((Object) null, new Object[]{list, Integer.valueOf(i10)});
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            C4391e0.c("CaptureSession", "Failed to create instances for multi-resolution output, " + e10.getMessage());
            return null;
        }
    }

    private static Map<X0.f, k> q(Map<Integer, List<X0.f>> map, Map<C5019e0, Surface> map2) {
        HashMap hashMap = new HashMap();
        for (Integer next : map.keySet()) {
            next.intValue();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (X0.f fVar : map.get(next)) {
                SurfaceUtil.a a10 = SurfaceUtil.a(map2.get(fVar.f()));
                if (i10 == 0) {
                    i10 = a10.f17021a;
                }
                W0.a();
                int i11 = a10.f17022b;
                int i12 = a10.f17023c;
                String d10 = fVar.d();
                Objects.requireNonNull(d10);
                arrayList.add(V0.a(i11, i12, d10));
            }
            if (i10 == 0 || arrayList.isEmpty()) {
                C4391e0.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i10 + ", streamInfos size: " + arrayList.size());
            } else {
                List<OutputConfiguration> p10 = p(arrayList, i10);
                if (p10 != null) {
                    for (X0.f fVar2 : map.get(next)) {
                        OutputConfiguration remove = p10.remove(0);
                        remove.addSurface(map2.get(fVar2.f()));
                        hashMap.put(fVar2, new k(remove));
                    }
                }
            }
        }
        return hashMap;
    }

    private k s(X0.f fVar, Map<C5019e0, Surface> map, String str) {
        long j10;
        DynamicRangeProfiles d10;
        Surface surface = map.get(fVar.f());
        i.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        k kVar = new k(fVar.g(), surface);
        if (str != null) {
            kVar.g(str);
        } else {
            kVar.g(fVar.d());
        }
        if (fVar.c() == 0) {
            kVar.f(1);
        } else if (fVar.c() == 1) {
            kVar.f(2);
        }
        if (!fVar.e().isEmpty()) {
            kVar.b();
            for (C5019e0 e0Var : fVar.e()) {
                Surface surface2 = map.get(e0Var);
                i.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                kVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (d10 = this.f30508p.d()) != null) {
            C4417z b10 = fVar.b();
            Long a10 = C6224d.a(b10, d10);
            if (a10 == null) {
                C4391e0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b10);
            } else {
                j10 = a10.longValue();
                kVar.e(j10);
                return kVar;
            }
        }
        j10 = 1;
        kVar.e(j10);
        return kVar;
    }

    private List<k> t(List<k> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (k next : list) {
            if (!arrayList.contains(next.d())) {
                arrayList.add(next.d());
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    private static Map<Integer, List<X0.f>> u(Collection<X0.f> collection) {
        HashMap hashMap = new HashMap();
        for (X0.f next : collection) {
            if (next.g() > 0 && next.e().isEmpty()) {
                List list = (List) hashMap.get(Integer.valueOf(next.g()));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(next.g()), list);
                }
                list.add(next);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.intValue();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (this.f30493a) {
            try {
                if (this.f30501i == c.OPENED) {
                    x(this.f30498f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z() {
        synchronized (this.f30493a) {
            if (!this.f30494b.isEmpty()) {
                try {
                    v(this.f30494b);
                } finally {
                    this.f30494b.clear();
                }
            }
        }
    }

    public void a(List<V> list) {
        synchronized (this.f30493a) {
            try {
                switch (this.f30501i.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f30501i);
                    case 1:
                    case 2:
                    case 3:
                        this.f30494b.addAll(list);
                        break;
                    case 4:
                        this.f30494b.addAll(list);
                        w();
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f30493a) {
            try {
                c cVar = this.f30501i;
                if (cVar != c.OPENED) {
                    if (cVar != c.OPENING) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void c() {
        ArrayList<V> arrayList;
        synchronized (this.f30493a) {
            try {
                if (!this.f30494b.isEmpty()) {
                    arrayList = new ArrayList<>(this.f30494b);
                    this.f30494b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (arrayList != null) {
            for (V v10 : arrayList) {
                for (C5040p a10 : v10.c()) {
                    a10.a(v10.f());
                }
            }
        }
    }

    public void close() {
        synchronized (this.f30493a) {
            try {
                int ordinal = this.f30501i.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            P1.a aVar = this.f30496d;
                            i.h(aVar, "The Opener shouldn't null in state:" + this.f30501i);
                            this.f30496d.stop();
                        } else if (ordinal == 3 || ordinal == 4) {
                            P1.a aVar2 = this.f30496d;
                            i.h(aVar2, "The Opener shouldn't null in state:" + this.f30501i);
                            this.f30496d.stop();
                            this.f30501i = c.CLOSED;
                            this.f30507o.i();
                            this.f30498f = null;
                        }
                    }
                    this.f30501i = c.RELEASED;
                } else {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f30501i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r3.f30501i = v.C6054b1.c.RELEASING;
        r3.f30507o.i();
        r4 = r3.f30496d;
        H2.i.h(r4, "The Opener shouldn't null in state:" + r3.f30501i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r3.f30496d.stop() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r3.f30502j != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        r3.f30502j = androidx.concurrent.futures.c.a(new v.X0(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r4 = r3.f30502j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        r3.f30501i = v.C6054b1.c.RELEASED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        return I.n.p(null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob.C10101e<java.lang.Void> d(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f30493a
            monitor-enter(r0)
            v.b1$c r1 = r3.f30501i     // Catch:{ all -> 0x0018 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0018 }
            switch(r1) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0085;
                case 2: goto L_0x0068;
                case 3: goto L_0x0028;
                case 4: goto L_0x000e;
                case 5: goto L_0x000e;
                case 6: goto L_0x0055;
                default: goto L_0x000c;
            }     // Catch:{ all -> 0x0018 }
        L_0x000c:
            goto L_0x0089
        L_0x000e:
            v.P1 r1 = r3.f30497e     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0023
            r1.g()     // Catch:{ CameraAccessException -> 0x001b }
            goto L_0x0023
        L_0x0018:
            r4 = move-exception
            goto L_0x00a9
        L_0x001b:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            C.C4391e0.d(r1, r2, r4)     // Catch:{ all -> 0x0018 }
        L_0x0023:
            v.P1 r4 = r3.f30497e     // Catch:{ all -> 0x0018 }
            r4.close()     // Catch:{ all -> 0x0018 }
        L_0x0028:
            v.b1$c r4 = v.C6054b1.c.RELEASING     // Catch:{ all -> 0x0018 }
            r3.f30501i = r4     // Catch:{ all -> 0x0018 }
            z.s r4 = r3.f30507o     // Catch:{ all -> 0x0018 }
            r4.i()     // Catch:{ all -> 0x0018 }
            v.P1$a r4 = r3.f30496d     // Catch:{ all -> 0x0018 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r1.<init>()     // Catch:{ all -> 0x0018 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x0018 }
            v.b1$c r2 = r3.f30501i     // Catch:{ all -> 0x0018 }
            r1.append(r2)     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0018 }
            H2.i.h(r4, r1)     // Catch:{ all -> 0x0018 }
            v.P1$a r4 = r3.f30496d     // Catch:{ all -> 0x0018 }
            boolean r4 = r4.stop()     // Catch:{ all -> 0x0018 }
            if (r4 == 0) goto L_0x0055
            r3.r()     // Catch:{ all -> 0x0018 }
            goto L_0x0089
        L_0x0055:
            ob.e<java.lang.Void> r4 = r3.f30502j     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x0064
            v.X0 r4 = new v.X0     // Catch:{ all -> 0x0018 }
            r4.<init>(r3)     // Catch:{ all -> 0x0018 }
            ob.e r4 = androidx.concurrent.futures.c.a(r4)     // Catch:{ all -> 0x0018 }
            r3.f30502j = r4     // Catch:{ all -> 0x0018 }
        L_0x0064:
            ob.e<java.lang.Void> r4 = r3.f30502j     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r4
        L_0x0068:
            v.P1$a r4 = r3.f30496d     // Catch:{ all -> 0x0018 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r1.<init>()     // Catch:{ all -> 0x0018 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x0018 }
            v.b1$c r2 = r3.f30501i     // Catch:{ all -> 0x0018 }
            r1.append(r2)     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0018 }
            H2.i.h(r4, r1)     // Catch:{ all -> 0x0018 }
            v.P1$a r4 = r3.f30496d     // Catch:{ all -> 0x0018 }
            r4.stop()     // Catch:{ all -> 0x0018 }
        L_0x0085:
            v.b1$c r4 = v.C6054b1.c.RELEASED     // Catch:{ all -> 0x0018 }
            r3.f30501i = r4     // Catch:{ all -> 0x0018 }
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            r4 = 0
            ob.e r4 = I.n.p(r4)
            return r4
        L_0x0090:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0018 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0018 }
            r1.<init>()     // Catch:{ all -> 0x0018 }
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x0018 }
            v.b1$c r2 = r3.f30501i     // Catch:{ all -> 0x0018 }
            r1.append(r2)     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0018 }
            r4.<init>(r1)     // Catch:{ all -> 0x0018 }
            throw r4     // Catch:{ all -> 0x0018 }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C6054b1.d(boolean):ob.e");
    }

    public List<V> e() {
        List<V> unmodifiableList;
        synchronized (this.f30493a) {
            unmodifiableList = Collections.unmodifiableList(this.f30494b);
        }
        return unmodifiableList;
    }

    public X0 f() {
        X0 x02;
        synchronized (this.f30493a) {
            x02 = this.f30498f;
        }
        return x02;
    }

    public C10101e<Void> g(X0 x02, CameraDevice cameraDevice, P1.a aVar) {
        synchronized (this.f30493a) {
            try {
                if (this.f30501i.ordinal() != 1) {
                    C4391e0.c("CaptureSession", "Open not allowed in state: " + this.f30501i);
                    C10101e<Void> n10 = n.n(new IllegalStateException("open() should not allow the state: " + this.f30501i));
                    return n10;
                }
                this.f30501i = c.GET_SURFACE;
                ArrayList arrayList = new ArrayList(x02.o());
                this.f30500h = arrayList;
                this.f30496d = aVar;
                I.d<T> f10 = I.d.b(aVar.j(arrayList, 5000)).f(new Y0(this, x02, cameraDevice), this.f30496d.b());
                n.j(f10, new a(), this.f30496d.b());
                C10101e<Void> B10 = n.B(f10);
                return B10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(androidx.camera.core.impl.X0 r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f30493a
            monitor-enter(r0)
            v.b1$c r1 = r3.f30501i     // Catch:{ all -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0015 }
            switch(r1) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0043;
                case 2: goto L_0x0043;
                case 3: goto L_0x0043;
                case 4: goto L_0x0017;
                case 5: goto L_0x000d;
                case 6: goto L_0x000d;
                case 7: goto L_0x000d;
                default: goto L_0x000c;
            }     // Catch:{ all -> 0x0015 }
        L_0x000c:
            goto L_0x0045
        L_0x000d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch:{ all -> 0x0015 }
            throw r4     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r4 = move-exception
            goto L_0x0060
        L_0x0017:
            r3.f30498f = r4     // Catch:{ all -> 0x0015 }
            if (r4 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x001d:
            java.util.Map<androidx.camera.core.impl.e0, android.view.Surface> r1 = r3.f30499g     // Catch:{ all -> 0x0015 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0015 }
            java.util.List r4 = r4.o()     // Catch:{ all -> 0x0015 }
            boolean r4 = r1.containsAll(r4)     // Catch:{ all -> 0x0015 }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Does not have the proper configured lists"
            C.C4391e0.c(r4, r1)     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0036:
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Attempting to submit CaptureRequest after setting"
            C.C4391e0.a(r4, r1)     // Catch:{ all -> 0x0015 }
            androidx.camera.core.impl.X0 r4 = r3.f30498f     // Catch:{ all -> 0x0015 }
            r3.x(r4)     // Catch:{ all -> 0x0015 }
            goto L_0x0045
        L_0x0043:
            r3.f30498f = r4     // Catch:{ all -> 0x0015 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0047:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0015 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x0015 }
            v.b1$c r2 = r3.f30501i     // Catch:{ all -> 0x0015 }
            r1.append(r2)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0015 }
            r4.<init>(r1)     // Catch:{ all -> 0x0015 }
            throw r4     // Catch:{ all -> 0x0015 }
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C6054b1.h(androidx.camera.core.impl.X0):void");
    }

    public void i(Map<C5019e0, Long> map) {
        synchronized (this.f30493a) {
            this.f30504l = map;
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        c cVar = this.f30501i;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            C4391e0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f30501i = cVar2;
        this.f30497e = null;
        c.a<Void> aVar = this.f30503k;
        if (aVar != null) {
            aVar.c(null);
            this.f30503k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r6.k() != 2) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r7 = androidx.camera.core.impl.V.a.k(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r6.k() != 5) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r6.d() == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        r7.p(r6.d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r8 = r11.f30498f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r8 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        r7.e(r8.k().g());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        r7.e(r6.g());
        r7 = v.C6024E0.e(r7.h(), r11.f30497e.h(), r11.f30499g, false, r11.f30509q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d2, code lost:
        if (r7 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        C.C4391e0.a("CaptureSession", "Skipping issuing request without surface.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r8 = new java.util.ArrayList();
        r6 = r6.c().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ee, code lost:
        if (r6.hasNext() == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        v.U0.b(r6.next(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        r1.a(r7, r8);
        r2.add(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int v(java.util.List<androidx.camera.core.impl.V> r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f30493a
            monitor-enter(r0)
            v.b1$c r1 = r11.f30501i     // Catch:{ all -> 0x0013 }
            v.b1$c r2 = v.C6054b1.c.OPENED     // Catch:{ all -> 0x0013 }
            r3 = -1
            if (r1 == r2) goto L_0x0016
            java.lang.String r12 = "CaptureSession"
            java.lang.String r1 = "Skipping issueBurstCaptureRequest due to session closed"
            C.C4391e0.a(r12, r1)     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r3
        L_0x0013:
            r12 = move-exception
            goto L_0x016b
        L_0x0016:
            boolean r1 = r12.isEmpty()     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x001e
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r3
        L_0x001e:
            v.L0 r1 = new v.L0     // Catch:{ CameraAccessException -> 0x0054 }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0054 }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x0054 }
            java.lang.String r4 = "CaptureSession"
            java.lang.String r5 = "Issuing capture request."
            C.C4391e0.a(r4, r5)     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ CameraAccessException -> 0x0054 }
            r4 = 0
            r5 = r4
        L_0x0035:
            boolean r6 = r12.hasNext()     // Catch:{ CameraAccessException -> 0x0054 }
            r7 = 1
            if (r6 == 0) goto L_0x0102
            java.lang.Object r6 = r12.next()     // Catch:{ CameraAccessException -> 0x0054 }
            androidx.camera.core.impl.V r6 = (androidx.camera.core.impl.V) r6     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.List r8 = r6.i()     // Catch:{ CameraAccessException -> 0x0054 }
            boolean r8 = r8.isEmpty()     // Catch:{ CameraAccessException -> 0x0054 }
            if (r8 == 0) goto L_0x0057
            java.lang.String r6 = "CaptureSession"
            java.lang.String r7 = "Skipping issuing empty capture request."
            C.C4391e0.a(r6, r7)     // Catch:{ CameraAccessException -> 0x0054 }
            goto L_0x0035
        L_0x0054:
            r12 = move-exception
            goto L_0x014c
        L_0x0057:
            java.util.List r8 = r6.i()     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ CameraAccessException -> 0x0054 }
        L_0x005f:
            boolean r9 = r8.hasNext()     // Catch:{ CameraAccessException -> 0x0054 }
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r8.next()     // Catch:{ CameraAccessException -> 0x0054 }
            androidx.camera.core.impl.e0 r9 = (androidx.camera.core.impl.C5019e0) r9     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.Map<androidx.camera.core.impl.e0, android.view.Surface> r10 = r11.f30499g     // Catch:{ CameraAccessException -> 0x0054 }
            boolean r10 = r10.containsKey(r9)     // Catch:{ CameraAccessException -> 0x0054 }
            if (r10 != 0) goto L_0x005f
            java.lang.String r6 = "CaptureSession"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0054 }
            r7.<init>()     // Catch:{ CameraAccessException -> 0x0054 }
            java.lang.String r8 = "Skipping capture request with invalid surface: "
            r7.append(r8)     // Catch:{ CameraAccessException -> 0x0054 }
            r7.append(r9)     // Catch:{ CameraAccessException -> 0x0054 }
            java.lang.String r7 = r7.toString()     // Catch:{ CameraAccessException -> 0x0054 }
            C.C4391e0.a(r6, r7)     // Catch:{ CameraAccessException -> 0x0054 }
            goto L_0x0035
        L_0x008a:
            int r8 = r6.k()     // Catch:{ CameraAccessException -> 0x0054 }
            r9 = 2
            if (r8 != r9) goto L_0x0092
            r5 = r7
        L_0x0092:
            androidx.camera.core.impl.V$a r7 = androidx.camera.core.impl.V.a.k(r6)     // Catch:{ CameraAccessException -> 0x0054 }
            int r8 = r6.k()     // Catch:{ CameraAccessException -> 0x0054 }
            r9 = 5
            if (r8 != r9) goto L_0x00aa
            androidx.camera.core.impl.z r8 = r6.d()     // Catch:{ CameraAccessException -> 0x0054 }
            if (r8 == 0) goto L_0x00aa
            androidx.camera.core.impl.z r8 = r6.d()     // Catch:{ CameraAccessException -> 0x0054 }
            r7.p(r8)     // Catch:{ CameraAccessException -> 0x0054 }
        L_0x00aa:
            androidx.camera.core.impl.X0 r8 = r11.f30498f     // Catch:{ CameraAccessException -> 0x0054 }
            if (r8 == 0) goto L_0x00b9
            androidx.camera.core.impl.V r8 = r8.k()     // Catch:{ CameraAccessException -> 0x0054 }
            androidx.camera.core.impl.X r8 = r8.g()     // Catch:{ CameraAccessException -> 0x0054 }
            r7.e(r8)     // Catch:{ CameraAccessException -> 0x0054 }
        L_0x00b9:
            androidx.camera.core.impl.X r8 = r6.g()     // Catch:{ CameraAccessException -> 0x0054 }
            r7.e(r8)     // Catch:{ CameraAccessException -> 0x0054 }
            androidx.camera.core.impl.V r7 = r7.h()     // Catch:{ CameraAccessException -> 0x0054 }
            v.P1 r8 = r11.f30497e     // Catch:{ CameraAccessException -> 0x0054 }
            android.hardware.camera2.CameraDevice r8 = r8.h()     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.Map<androidx.camera.core.impl.e0, android.view.Surface> r9 = r11.f30499g     // Catch:{ CameraAccessException -> 0x0054 }
            z.y r10 = r11.f30509q     // Catch:{ CameraAccessException -> 0x0054 }
            android.hardware.camera2.CaptureRequest r7 = v.C6024E0.e(r7, r8, r9, r4, r10)     // Catch:{ CameraAccessException -> 0x0054 }
            if (r7 != 0) goto L_0x00dd
            java.lang.String r12 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing request without surface."
            C.C4391e0.a(r12, r1)     // Catch:{ CameraAccessException -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r3
        L_0x00dd:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0054 }
            r8.<init>()     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.List r6 = r6.c()     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CameraAccessException -> 0x0054 }
        L_0x00ea:
            boolean r9 = r6.hasNext()     // Catch:{ CameraAccessException -> 0x0054 }
            if (r9 == 0) goto L_0x00fa
            java.lang.Object r9 = r6.next()     // Catch:{ CameraAccessException -> 0x0054 }
            androidx.camera.core.impl.p r9 = (androidx.camera.core.impl.C5040p) r9     // Catch:{ CameraAccessException -> 0x0054 }
            v.U0.b(r9, r8)     // Catch:{ CameraAccessException -> 0x0054 }
            goto L_0x00ea
        L_0x00fa:
            r1.a(r7, r8)     // Catch:{ CameraAccessException -> 0x0054 }
            r2.add(r7)     // Catch:{ CameraAccessException -> 0x0054 }
            goto L_0x0035
        L_0x0102:
            boolean r12 = r2.isEmpty()     // Catch:{ CameraAccessException -> 0x0054 }
            if (r12 != 0) goto L_0x0144
            z.v r12 = r11.f30505m     // Catch:{ CameraAccessException -> 0x0054 }
            boolean r12 = r12.a(r2, r5)     // Catch:{ CameraAccessException -> 0x0054 }
            if (r12 == 0) goto L_0x011d
            v.P1 r12 = r11.f30497e     // Catch:{ CameraAccessException -> 0x0054 }
            r12.a()     // Catch:{ CameraAccessException -> 0x0054 }
            v.a1 r12 = new v.a1     // Catch:{ CameraAccessException -> 0x0054 }
            r12.<init>(r11)     // Catch:{ CameraAccessException -> 0x0054 }
            r1.c(r12)     // Catch:{ CameraAccessException -> 0x0054 }
        L_0x011d:
            z.z r12 = r11.f30506n     // Catch:{ CameraAccessException -> 0x0054 }
            boolean r12 = r12.b(r2, r5)     // Catch:{ CameraAccessException -> 0x0054 }
            if (r12 == 0) goto L_0x013c
            int r12 = r2.size()     // Catch:{ CameraAccessException -> 0x0054 }
            int r12 = r12 - r7
            java.lang.Object r12 = r2.get(r12)     // Catch:{ CameraAccessException -> 0x0054 }
            android.hardware.camera2.CaptureRequest r12 = (android.hardware.camera2.CaptureRequest) r12     // Catch:{ CameraAccessException -> 0x0054 }
            v.b1$b r4 = new v.b1$b     // Catch:{ CameraAccessException -> 0x0054 }
            r4.<init>()     // Catch:{ CameraAccessException -> 0x0054 }
            java.util.List r4 = java.util.Collections.singletonList(r4)     // Catch:{ CameraAccessException -> 0x0054 }
            r1.a(r12, r4)     // Catch:{ CameraAccessException -> 0x0054 }
        L_0x013c:
            v.P1 r12 = r11.f30497e     // Catch:{ CameraAccessException -> 0x0054 }
            int r12 = r12.k(r2, r1)     // Catch:{ CameraAccessException -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r12
        L_0x0144:
            java.lang.String r12 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing burst request due to no valid request elements"
            C.C4391e0.a(r12, r1)     // Catch:{ CameraAccessException -> 0x0054 }
            goto L_0x0169
        L_0x014c:
            java.lang.String r1 = "CaptureSession"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0013 }
            r2.<init>()     // Catch:{ all -> 0x0013 }
            java.lang.String r4 = "Unable to access camera: "
            r2.append(r4)     // Catch:{ all -> 0x0013 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0013 }
            r2.append(r12)     // Catch:{ all -> 0x0013 }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x0013 }
            C.C4391e0.c(r1, r12)     // Catch:{ all -> 0x0013 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0013 }
        L_0x0169:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r3
        L_0x016b:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C6054b1.v(java.util.List):int");
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f30507o.e().a(new Z0(this), H.a.a());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        C.C4391e0.c("CaptureSession", "Unable to access camera: " + r7.getMessage());
        java.lang.Thread.dumpStack();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000a, B:19:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int x(androidx.camera.core.impl.X0 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f30493a
            monitor-enter(r0)
            r1 = -1
            if (r7 != 0) goto L_0x0012
            java.lang.String r7 = "CaptureSession"
            java.lang.String r2 = "Skipping issueRepeatingCaptureRequests for no configuration case."
            C.C4391e0.a(r7, r2)     // Catch:{ all -> 0x000f }
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x000f:
            r7 = move-exception
            goto L_0x00b7
        L_0x0012:
            v.b1$c r2 = r6.f30501i     // Catch:{ all -> 0x000f }
            v.b1$c r3 = v.C6054b1.c.OPENED     // Catch:{ all -> 0x000f }
            if (r2 == r3) goto L_0x0021
            java.lang.String r7 = "CaptureSession"
            java.lang.String r2 = "Skipping issueRepeatingCaptureRequests due to session closed"
            C.C4391e0.a(r7, r2)     // Catch:{ all -> 0x000f }
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x0021:
            androidx.camera.core.impl.V r7 = r7.k()     // Catch:{ all -> 0x000f }
            java.util.List r2 = r7.i()     // Catch:{ all -> 0x000f }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x000f }
            if (r2 == 0) goto L_0x005c
            java.lang.String r7 = "CaptureSession"
            java.lang.String r2 = "Skipping issueRepeatingCaptureRequests for no surface."
            C.C4391e0.a(r7, r2)     // Catch:{ all -> 0x000f }
            v.P1 r7 = r6.f30497e     // Catch:{ CameraAccessException -> 0x003c }
            r7.a()     // Catch:{ CameraAccessException -> 0x003c }
            goto L_0x005a
        L_0x003c:
            r7 = move-exception
            java.lang.String r2 = "CaptureSession"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000f }
            r3.<init>()     // Catch:{ all -> 0x000f }
            java.lang.String r4 = "Unable to access camera: "
            r3.append(r4)     // Catch:{ all -> 0x000f }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x000f }
            r3.append(r7)     // Catch:{ all -> 0x000f }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x000f }
            C.C4391e0.c(r2, r7)     // Catch:{ all -> 0x000f }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x000f }
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x005c:
            java.lang.String r2 = "CaptureSession"
            java.lang.String r3 = "Issuing request for session."
            C.C4391e0.a(r2, r3)     // Catch:{ CameraAccessException -> 0x007d }
            v.P1 r2 = r6.f30497e     // Catch:{ CameraAccessException -> 0x007d }
            android.hardware.camera2.CameraDevice r2 = r2.h()     // Catch:{ CameraAccessException -> 0x007d }
            java.util.Map<androidx.camera.core.impl.e0, android.view.Surface> r3 = r6.f30499g     // Catch:{ CameraAccessException -> 0x007d }
            z.y r4 = r6.f30509q     // Catch:{ CameraAccessException -> 0x007d }
            r5 = 1
            android.hardware.camera2.CaptureRequest r2 = v.C6024E0.e(r7, r2, r3, r5, r4)     // Catch:{ CameraAccessException -> 0x007d }
            if (r2 != 0) goto L_0x007f
            java.lang.String r7 = "CaptureSession"
            java.lang.String r2 = "Skipping issuing empty request for session."
            C.C4391e0.a(r7, r2)     // Catch:{ CameraAccessException -> 0x007d }
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x007d:
            r7 = move-exception
            goto L_0x0098
        L_0x007f:
            z.s r3 = r6.f30507o     // Catch:{ CameraAccessException -> 0x007d }
            java.util.List r7 = r7.c()     // Catch:{ CameraAccessException -> 0x007d }
            r4 = 0
            android.hardware.camera2.CameraCaptureSession$CaptureCallback[] r4 = new android.hardware.camera2.CameraCaptureSession.CaptureCallback[r4]     // Catch:{ CameraAccessException -> 0x007d }
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r7 = r6.o(r7, r4)     // Catch:{ CameraAccessException -> 0x007d }
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r7 = r3.d(r7)     // Catch:{ CameraAccessException -> 0x007d }
            v.P1 r3 = r6.f30497e     // Catch:{ CameraAccessException -> 0x007d }
            int r7 = r3.i(r2, r7)     // Catch:{ CameraAccessException -> 0x007d }
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r7
        L_0x0098:
            java.lang.String r2 = "CaptureSession"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000f }
            r3.<init>()     // Catch:{ all -> 0x000f }
            java.lang.String r4 = "Unable to access camera: "
            r3.append(r4)     // Catch:{ all -> 0x000f }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x000f }
            r3.append(r7)     // Catch:{ all -> 0x000f }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x000f }
            C.C4391e0.c(r2, r7)     // Catch:{ all -> 0x000f }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x000f }
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C6054b1.x(androidx.camera.core.impl.X0):int");
    }

    C6054b1(C6227g gVar, boolean z10) {
        this(gVar, new R0(Collections.emptyList()), z10);
    }

    C6054b1(C6227g gVar, R0 r02) {
        this(gVar, r02, false);
    }

    C6054b1(C6227g gVar, R0 r02, boolean z10) {
        this.f30493a = new Object();
        this.f30494b = new ArrayList();
        this.f30499g = new HashMap();
        this.f30500h = Collections.emptyList();
        this.f30501i = c.UNINITIALIZED;
        this.f30504l = new HashMap();
        this.f30505m = new v();
        this.f30506n = new z();
        this.f30501i = c.INITIALIZED;
        this.f30508p = gVar;
        this.f30495c = new d();
        this.f30507o = new s(r02.a(CaptureNoResponseQuirk.class));
        this.f30509q = new y(r02);
        this.f30510r = z10;
    }
}
