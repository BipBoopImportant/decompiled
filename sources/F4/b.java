package F4;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import j0.C5445a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x2.C6244c;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    static final c f35375f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f35376a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f35377b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<c, d> f35378c = new C5445a();

    /* renamed from: d  reason: collision with root package name */
    private final SparseBooleanArray f35379d = new SparseBooleanArray();

    /* renamed from: e  reason: collision with root package name */
    private final d f35380e = a();

    static class a implements c {
        a() {
        }

        private boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean c(float[] fArr) {
            float f10 = fArr[0];
            return f10 >= 10.0f && f10 <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        public boolean a(int i10, float[] fArr) {
            return !d(fArr) && !b(fArr) && !c(fArr);
        }
    }

    /* renamed from: F4.b$b  reason: collision with other inner class name */
    public static final class C0569b {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f35381a;

        /* renamed from: b  reason: collision with root package name */
        private final Bitmap f35382b;

        /* renamed from: c  reason: collision with root package name */
        private final List<c> f35383c;

        /* renamed from: d  reason: collision with root package name */
        private int f35384d = 16;

        /* renamed from: e  reason: collision with root package name */
        private int f35385e = 12544;

        /* renamed from: f  reason: collision with root package name */
        private int f35386f = -1;

        /* renamed from: g  reason: collision with root package name */
        private final List<c> f35387g;

        /* renamed from: h  reason: collision with root package name */
        private Rect f35388h;

        public C0569b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f35383c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f35387g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f35375f);
            this.f35382b = bitmap;
            this.f35381a = null;
            arrayList.add(c.f35398e);
            arrayList.add(c.f35399f);
            arrayList.add(c.f35400g);
            arrayList.add(c.f35401h);
            arrayList.add(c.f35402i);
            arrayList.add(c.f35403j);
        }

        private int[] c(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f35388h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f35388h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i10 = 0; i10 < height2; i10++) {
                Rect rect2 = this.f35388h;
                System.arraycopy(iArr, ((rect2.top + i10) * width) + rect2.left, iArr2, i10 * width2, width2);
            }
            return iArr2;
        }

        private Bitmap e(Bitmap bitmap) {
            int max;
            int i10;
            double d10 = -1.0d;
            if (this.f35385e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i11 = this.f35385e;
                if (width > i11) {
                    d10 = Math.sqrt(((double) i11) / ((double) width));
                }
            } else if (this.f35386f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i10 = this.f35386f)) {
                d10 = ((double) i10) / ((double) max);
            }
            return d10 <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d10), (int) Math.ceil(((double) bitmap.getHeight()) * d10), false);
        }

        public C0569b a() {
            this.f35387g.clear();
            return this;
        }

        public b b() {
            List<d> list;
            c[] cVarArr;
            Bitmap bitmap = this.f35382b;
            if (bitmap != null) {
                Bitmap e10 = e(bitmap);
                Rect rect = this.f35388h;
                if (!(e10 == this.f35382b || rect == null)) {
                    double width = ((double) e10.getWidth()) / ((double) this.f35382b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), e10.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), e10.getHeight());
                }
                int[] c10 = c(e10);
                int i10 = this.f35384d;
                if (this.f35387g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list2 = this.f35387g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                a aVar = new a(c10, i10, cVarArr);
                if (e10 != this.f35382b) {
                    e10.recycle();
                }
                list = aVar.d();
            } else {
                list = this.f35381a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            b bVar = new b(list, this.f35383c);
            bVar.c();
            return bVar;
        }

        public C0569b d(int i10) {
            this.f35384d = i10;
            return this;
        }

        public C0569b f(int i10, int i11, int i12, int i13) {
            if (this.f35382b != null) {
                if (this.f35388h == null) {
                    this.f35388h = new Rect();
                }
                this.f35388h.set(0, 0, this.f35382b.getWidth(), this.f35382b.getHeight());
                if (!this.f35388h.intersect(i10, i11, i12, i13)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }
    }

    public interface c {
        boolean a(int i10, float[] fArr);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final int f35389a;

        /* renamed from: b  reason: collision with root package name */
        private final int f35390b;

        /* renamed from: c  reason: collision with root package name */
        private final int f35391c;

        /* renamed from: d  reason: collision with root package name */
        private final int f35392d;

        /* renamed from: e  reason: collision with root package name */
        private final int f35393e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f35394f;

        /* renamed from: g  reason: collision with root package name */
        private int f35395g;

        /* renamed from: h  reason: collision with root package name */
        private int f35396h;

        /* renamed from: i  reason: collision with root package name */
        private float[] f35397i;

        public d(int i10, int i11) {
            this.f35389a = Color.red(i10);
            this.f35390b = Color.green(i10);
            this.f35391c = Color.blue(i10);
            this.f35392d = i10;
            this.f35393e = i11;
        }

        private void a() {
            if (!this.f35394f) {
                int g10 = C6244c.g(-1, this.f35392d, 4.5f);
                int g11 = C6244c.g(-1, this.f35392d, 3.0f);
                if (g10 == -1 || g11 == -1) {
                    int g12 = C6244c.g(-16777216, this.f35392d, 4.5f);
                    int g13 = C6244c.g(-16777216, this.f35392d, 3.0f);
                    if (g12 == -1 || g13 == -1) {
                        this.f35396h = g10 != -1 ? C6244c.p(-1, g10) : C6244c.p(-16777216, g12);
                        this.f35395g = g11 != -1 ? C6244c.p(-1, g11) : C6244c.p(-16777216, g13);
                        this.f35394f = true;
                        return;
                    }
                    this.f35396h = C6244c.p(-16777216, g12);
                    this.f35395g = C6244c.p(-16777216, g13);
                    this.f35394f = true;
                    return;
                }
                this.f35396h = C6244c.p(-1, g10);
                this.f35395g = C6244c.p(-1, g11);
                this.f35394f = true;
            }
        }

        public int b() {
            a();
            return this.f35396h;
        }

        public float[] c() {
            if (this.f35397i == null) {
                this.f35397i = new float[3];
            }
            C6244c.a(this.f35389a, this.f35390b, this.f35391c, this.f35397i);
            return this.f35397i;
        }

        public int d() {
            return this.f35393e;
        }

        public int e() {
            return this.f35392d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f35393e == dVar.f35393e && this.f35392d == dVar.f35392d;
        }

        public int f() {
            a();
            return this.f35395g;
        }

        public int hashCode() {
            return (this.f35392d * 31) + this.f35393e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + ']' + " [HSL: " + Arrays.toString(c()) + ']' + " [Population: " + this.f35393e + ']' + " [Title Text: #" + Integer.toHexString(f()) + ']' + " [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    b(List<d> list, List<c> list2) {
        this.f35376a = list;
        this.f35377b = list2;
    }

    private d a() {
        int size = this.f35376a.size();
        int i10 = Integer.MIN_VALUE;
        d dVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = this.f35376a.get(i11);
            if (dVar2.d() > i10) {
                i10 = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public static C0569b b(Bitmap bitmap) {
        return new C0569b(bitmap);
    }

    private float d(d dVar, c cVar) {
        float[] c10 = dVar.c();
        d dVar2 = this.f35380e;
        int d10 = dVar2 != null ? dVar2.d() : 1;
        float f10 = 0.0f;
        float g10 = cVar.g() > 0.0f ? cVar.g() * (1.0f - Math.abs(c10[1] - cVar.i())) : 0.0f;
        float a10 = cVar.a() > 0.0f ? cVar.a() * (1.0f - Math.abs(c10[2] - cVar.h())) : 0.0f;
        if (cVar.f() > 0.0f) {
            f10 = cVar.f() * (((float) dVar.d()) / ((float) d10));
        }
        return g10 + a10 + f10;
    }

    private d e(c cVar) {
        d f10 = f(cVar);
        if (f10 != null && cVar.j()) {
            this.f35379d.append(f10.e(), true);
        }
        return f10;
    }

    private d f(c cVar) {
        int size = this.f35376a.size();
        float f10 = 0.0f;
        d dVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar2 = this.f35376a.get(i10);
            if (h(dVar2, cVar)) {
                float d10 = d(dVar2, cVar);
                if (dVar == null || d10 > f10) {
                    dVar = dVar2;
                    f10 = d10;
                }
            }
        }
        return dVar;
    }

    private boolean h(d dVar, c cVar) {
        float[] c10 = dVar.c();
        return c10[1] >= cVar.e() && c10[1] <= cVar.c() && c10[2] >= cVar.d() && c10[2] <= cVar.b() && !this.f35379d.get(dVar.e());
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int size = this.f35377b.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.f35377b.get(i10);
            cVar.k();
            this.f35378c.put(cVar, e(cVar));
        }
        this.f35379d.clear();
    }

    public List<d> g() {
        return Collections.unmodifiableList(this.f35376a);
    }
}
