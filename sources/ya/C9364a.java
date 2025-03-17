package Ya;

import android.app.PendingIntent;
import java.util.Map;

/* renamed from: Ya.a  reason: case insensitive filesystem */
public class C9364a {

    /* renamed from: a  reason: collision with root package name */
    private final String f64841a;

    /* renamed from: b  reason: collision with root package name */
    private final int f64842b;

    /* renamed from: c  reason: collision with root package name */
    private final int f64843c;

    /* renamed from: d  reason: collision with root package name */
    private final int f64844d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f64845e;

    /* renamed from: f  reason: collision with root package name */
    private final int f64846f;

    /* renamed from: g  reason: collision with root package name */
    private final long f64847g;

    /* renamed from: h  reason: collision with root package name */
    private final long f64848h;

    /* renamed from: i  reason: collision with root package name */
    private final long f64849i;

    /* renamed from: j  reason: collision with root package name */
    private final long f64850j;

    /* renamed from: k  reason: collision with root package name */
    private final PendingIntent f64851k;

    /* renamed from: l  reason: collision with root package name */
    private final PendingIntent f64852l;

    /* renamed from: m  reason: collision with root package name */
    private final PendingIntent f64853m;

    /* renamed from: n  reason: collision with root package name */
    private final PendingIntent f64854n;

    /* renamed from: o  reason: collision with root package name */
    private final Map f64855o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f64856p = false;

    private C9364a(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f64841a = str;
        this.f64842b = i10;
        this.f64843c = i11;
        this.f64844d = i12;
        this.f64845e = num;
        this.f64846f = i13;
        this.f64847g = j10;
        this.f64848h = j11;
        this.f64849i = j12;
        this.f64850j = j13;
        this.f64851k = pendingIntent;
        this.f64852l = pendingIntent2;
        this.f64853m = pendingIntent3;
        this.f64854n = pendingIntent4;
        this.f64855o = map;
    }

    public static C9364a e(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new C9364a(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private final boolean h(C9367d dVar) {
        return dVar.a() && this.f64849i <= this.f64850j;
    }

    public int a() {
        return this.f64844d;
    }

    public boolean b(C9367d dVar) {
        return d(dVar) != null;
    }

    public int c() {
        return this.f64843c;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent d(C9367d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f64852l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (h(dVar)) {
                return this.f64854n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f64851k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (h(dVar)) {
                return this.f64853m;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.f64856p = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.f64856p;
    }
}
