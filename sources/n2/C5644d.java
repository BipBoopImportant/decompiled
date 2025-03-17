package n2;

import java.util.HashMap;
import m2.e;
import m2.g;

/* renamed from: n2.d  reason: case insensitive filesystem */
public class C5644d extends e {

    /* renamed from: q0  reason: collision with root package name */
    protected float f26521q0 = 0.5f;
    @Deprecated

    /* renamed from: r0  reason: collision with root package name */
    protected HashMap<String, Float> f26522r0 = new HashMap<>();
    @Deprecated

    /* renamed from: s0  reason: collision with root package name */
    protected HashMap<String, Float> f26523s0 = new HashMap<>();
    @Deprecated

    /* renamed from: t0  reason: collision with root package name */
    protected HashMap<String, Float> f26524t0 = new HashMap<>();

    /* renamed from: u0  reason: collision with root package name */
    private HashMap<String, Float> f26525u0;

    /* renamed from: v0  reason: collision with root package name */
    private HashMap<String, Float> f26526v0;

    /* renamed from: w0  reason: collision with root package name */
    protected g.a f26527w0 = g.a.SPREAD;

    public C5644d(g gVar, g.d dVar) {
        super(gVar, dVar);
    }

    /* access modifiers changed from: package-private */
    public float A0(String str) {
        HashMap<String, Float> hashMap = this.f26525u0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.f26525u0.get(str).floatValue();
    }

    /* access modifiers changed from: protected */
    public float B0(String str) {
        if (this.f26523s0.containsKey(str)) {
            return this.f26523s0.get(str).floatValue();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public float C0(String str) {
        if (this.f26522r0.containsKey(str)) {
            return this.f26522r0.get(str).floatValue();
        }
        return -1.0f;
    }

    public C5644d D0(g.a aVar) {
        this.f26527w0 = aVar;
        return this;
    }

    public void w0(Object obj, float f10, float f11, float f12, float f13, float f14) {
        super.s0(obj);
        String obj2 = obj.toString();
        if (!Float.isNaN(f10)) {
            this.f26522r0.put(obj2, Float.valueOf(f10));
        }
        if (!Float.isNaN(f11)) {
            this.f26523s0.put(obj2, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            this.f26524t0.put(obj2, Float.valueOf(f12));
        }
        if (!Float.isNaN(f13)) {
            if (this.f26525u0 == null) {
                this.f26525u0 = new HashMap<>();
            }
            this.f26525u0.put(obj2, Float.valueOf(f13));
        }
        if (!Float.isNaN(f14)) {
            if (this.f26526v0 == null) {
                this.f26526v0 = new HashMap<>();
            }
            this.f26526v0.put(obj2, Float.valueOf(f14));
        }
    }

    public C5644d x0(float f10) {
        this.f26521q0 = f10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public float y0(String str) {
        HashMap<String, Float> hashMap = this.f26526v0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.f26526v0.get(str).floatValue();
    }

    /* access modifiers changed from: protected */
    public float z0(String str) {
        if (this.f26524t0.containsKey(str)) {
            return this.f26524t0.get(str).floatValue();
        }
        return 0.0f;
    }
}
