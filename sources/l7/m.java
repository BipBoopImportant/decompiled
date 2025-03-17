package L7;

import C7.h;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f38396a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final m f38397b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final m f38398c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final m f38399d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final m f38400e;

    /* renamed from: f  reason: collision with root package name */
    public static final m f38401f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final m f38402g;

    /* renamed from: h  reason: collision with root package name */
    public static final h<m> f38403h;

    /* renamed from: i  reason: collision with root package name */
    static final boolean f38404i = true;

    private static class a extends m {
        a() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    private static class b extends m {
        b() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i11) / ((float) i13), ((float) i10) / ((float) i12)));
            int i14 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i14 = 0;
            }
            return 1.0f / ((float) (max << i14));
        }
    }

    private static class c extends m {
        c() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : m.f38398c.a(i10, i11, i12, i13);
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, m.f38398c.b(i10, i11, i12, i13));
        }
    }

    private static class d extends m {
        d() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
        }
    }

    private static class e extends m {
        e() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return m.f38404i ? g.QUALITY : g.MEMORY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            if (m.f38404i) {
                return Math.min(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    private static class f extends m {
        f() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f38400e = dVar;
        f38402g = dVar;
        f38403h = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
