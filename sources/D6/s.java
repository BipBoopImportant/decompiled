package D6;

import C6.d;
import android.graphics.Paint;
import com.airbnb.lottie.o;
import java.util.List;
import w6.C8927i;
import y6.C8986c;
import y6.t;

public class s implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34546a;

    /* renamed from: b  reason: collision with root package name */
    private final C6.b f34547b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C6.b> f34548c;

    /* renamed from: d  reason: collision with root package name */
    private final C6.a f34549d;

    /* renamed from: e  reason: collision with root package name */
    private final d f34550e;

    /* renamed from: f  reason: collision with root package name */
    private final C6.b f34551f;

    /* renamed from: g  reason: collision with root package name */
    private final b f34552g;

    /* renamed from: h  reason: collision with root package name */
    private final c f34553h;

    /* renamed from: i  reason: collision with root package name */
    private final float f34554i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f34555j;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34556a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f34557b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                D6.s$c[] r0 = D6.s.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34557b = r0
                r1 = 1
                D6.s$c r2 = D6.s.c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f34557b     // Catch:{ NoSuchFieldError -> 0x001d }
                D6.s$c r3 = D6.s.c.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f34557b     // Catch:{ NoSuchFieldError -> 0x0028 }
                D6.s$c r4 = D6.s.c.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                D6.s$b[] r3 = D6.s.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f34556a = r3
                D6.s$b r4 = D6.s.b.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f34556a     // Catch:{ NoSuchFieldError -> 0x0043 }
                D6.s$b r3 = D6.s.b.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f34556a     // Catch:{ NoSuchFieldError -> 0x004d }
                D6.s$b r1 = D6.s.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D6.s.a.<clinit>():void");
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int i10 = a.f34556a[ordinal()];
            return i10 != 1 ? i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int i10 = a.f34557b[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, C6.b bVar, List<C6.b> list, C6.a aVar, d dVar, C6.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f34546a = str;
        this.f34547b = bVar;
        this.f34548c = list;
        this.f34549d = aVar;
        this.f34550e = dVar;
        this.f34551f = bVar2;
        this.f34552g = bVar3;
        this.f34553h = cVar;
        this.f34554i = f10;
        this.f34555j = z10;
    }

    public C8986c a(o oVar, C8927i iVar, E6.b bVar) {
        return new t(oVar, bVar, this);
    }

    public b b() {
        return this.f34552g;
    }

    public C6.a c() {
        return this.f34549d;
    }

    public C6.b d() {
        return this.f34547b;
    }

    public c e() {
        return this.f34553h;
    }

    public List<C6.b> f() {
        return this.f34548c;
    }

    public float g() {
        return this.f34554i;
    }

    public String h() {
        return this.f34546a;
    }

    public d i() {
        return this.f34550e;
    }

    public C6.b j() {
        return this.f34551f;
    }

    public boolean k() {
        return this.f34555j;
    }
}
