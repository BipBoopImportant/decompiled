package com.google.firebase.perf.metrics;

import Cc.e;
import Fc.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Trace extends com.google.firebase.perf.application.b implements Parcelable, Ec.b {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    private static final Ac.a f68590m = Ac.a.e();

    /* renamed from: n  reason: collision with root package name */
    private static final Map<String, Trace> f68591n = new ConcurrentHashMap();

    /* renamed from: o  reason: collision with root package name */
    static final Parcelable.Creator<Trace> f68592o = new b();

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Ec.b> f68593a;

    /* renamed from: b  reason: collision with root package name */
    private final Trace f68594b;

    /* renamed from: c  reason: collision with root package name */
    private final GaugeManager f68595c;

    /* renamed from: d  reason: collision with root package name */
    private final String f68596d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, a> f68597e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f68598f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Ec.a> f68599g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Trace> f68600h;

    /* renamed from: i  reason: collision with root package name */
    private final k f68601i;

    /* renamed from: j  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f68602j;

    /* renamed from: k  reason: collision with root package name */
    private l f68603k;

    /* renamed from: l  reason: collision with root package name */
    private l f68604l;

    class a implements Parcelable.Creator<Trace> {
        a() {
        }

        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, (a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, (a) null);
        }

        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    private void b(String str, String str2) {
        if (k()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.f68596d}));
        } else if (this.f68598f.containsKey(str) || this.f68598f.size() < 5) {
            e.d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    private a l(String str) {
        a aVar = this.f68597e.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(str);
        this.f68597e.put(str, aVar2);
        return aVar2;
    }

    private void m(l lVar) {
        if (!this.f68600h.isEmpty()) {
            Trace trace = this.f68600h.get(this.f68600h.size() - 1);
            if (trace.f68604l == null) {
                trace.f68604l = lVar;
            }
        }
    }

    public void a(Ec.a aVar) {
        if (aVar == null) {
            f68590m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (i() && !k()) {
            this.f68599g.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, a> c() {
        return this.f68597e;
    }

    /* access modifiers changed from: package-private */
    public l d() {
        return this.f68604l;
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f68596d;
    }

    /* access modifiers changed from: package-private */
    public List<Ec.a> f() {
        List<Ec.a> unmodifiableList;
        synchronized (this.f68599g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Ec.a next : this.f68599g) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } finally {
            }
        }
        return unmodifiableList;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            if (j()) {
                f68590m.k("Trace '%s' is started but not stopped when it is destructed!", this.f68596d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public l g() {
        return this.f68603k;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f68598f.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f68598f);
    }

    @Keep
    public long getLongMetric(String str) {
        a aVar = str != null ? this.f68597e.get(str.trim()) : null;
        if (aVar == null) {
            return 0;
        }
        return aVar.a();
    }

    /* access modifiers changed from: package-private */
    public List<Trace> h() {
        return this.f68600h;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f68603k != null;
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f68590m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!i()) {
            f68590m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f68596d);
        } else if (k()) {
            f68590m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f68596d);
        } else {
            a l10 = l(str.trim());
            l10.c(j10);
            f68590m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(l10.a()), this.f68596d);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return i() && !k();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f68604l != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f68590m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f68596d);
            z10 = true;
        } catch (Exception e10) {
            f68590m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f68598f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f68590m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!i()) {
            f68590m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f68596d);
        } else if (k()) {
            f68590m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f68596d);
        } else {
            l(str.trim()).d(j10);
            f68590m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f68596d);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (k()) {
            f68590m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f68598f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f68590m.a("Trace feature is disabled.");
            return;
        }
        String f10 = e.f(this.f68596d);
        if (f10 != null) {
            f68590m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f68596d, f10);
        } else if (this.f68603k != null) {
            f68590m.d("Trace '%s' has already started, should not start again!", this.f68596d);
        } else {
            this.f68603k = this.f68602j.a();
            registerForAppState();
            Ec.a perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f68593a);
            a(perfSession);
            if (perfSession.e()) {
                this.f68595c.collectGaugeMetricOnce(perfSession.d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!i()) {
            f68590m.d("Trace '%s' has not been started so unable to stop!", this.f68596d);
        } else if (k()) {
            f68590m.d("Trace '%s' has already stopped, should not stop again!", this.f68596d);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f68593a);
            unregisterForAppState();
            l a10 = this.f68602j.a();
            this.f68604l = a10;
            if (this.f68594b == null) {
                m(a10);
                if (!this.f68596d.isEmpty()) {
                    this.f68601i.C(new b(this).a(), getAppState());
                    if (SessionManager.getInstance().perfSession().e()) {
                        this.f68595c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                        return;
                    }
                    return;
                }
                f68590m.c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f68594b, 0);
        parcel.writeString(this.f68596d);
        parcel.writeList(this.f68600h);
        parcel.writeMap(this.f68597e);
        parcel.writeParcelable(this.f68603k, 0);
        parcel.writeParcelable(this.f68604l, 0);
        synchronized (this.f68599g) {
            parcel.writeList(this.f68599g);
        }
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.application.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f68593a = new WeakReference<>(this);
        this.f68594b = null;
        this.f68596d = str.trim();
        this.f68600h = new ArrayList();
        this.f68597e = new ConcurrentHashMap();
        this.f68598f = new ConcurrentHashMap();
        this.f68602j = aVar;
        this.f68601i = kVar;
        this.f68599g = Collections.synchronizedList(new ArrayList());
        this.f68595c = gaugeManager;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.b());
        this.f68593a = new WeakReference<>(this);
        Class<Trace> cls = Trace.class;
        this.f68594b = (Trace) parcel.readParcelable(cls.getClassLoader());
        this.f68596d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f68600h = arrayList;
        parcel.readList(arrayList, cls.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f68597e = concurrentHashMap;
        this.f68598f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, a.class.getClassLoader());
        Class<l> cls2 = l.class;
        this.f68603k = (l) parcel.readParcelable(cls2.getClassLoader());
        this.f68604l = (l) parcel.readParcelable(cls2.getClassLoader());
        List<Ec.a> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f68599g = synchronizedList;
        parcel.readList(synchronizedList, Ec.a.class.getClassLoader());
        if (z10) {
            this.f68601i = null;
            this.f68602j = null;
            this.f68595c = null;
            return;
        }
        this.f68601i = k.k();
        this.f68602j = new com.google.firebase.perf.util.a();
        this.f68595c = GaugeManager.getInstance();
    }
}
