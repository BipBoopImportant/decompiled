package G2;

import java.util.Locale;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final r f6642a = new e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final r f6643b = new e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final r f6644c;

    /* renamed from: d  reason: collision with root package name */
    public static final r f6645d;

    /* renamed from: e  reason: collision with root package name */
    public static final r f6646e = new e(a.f6648b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final r f6647f = f.f6653b;

    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f6648b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f6649a;

        private a(boolean z10) {
            this.f6649a = z10;
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = s.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                    } else if (!this.f6649a) {
                        return 1;
                    }
                } else if (this.f6649a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f6649a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f6650a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = s.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements r {

        /* renamed from: a  reason: collision with root package name */
        private final c f6651a;

        d(c cVar) {
            this.f6651a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f6651a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                return this.f6651a == null ? b() : c(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    private static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f6652b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f6652b = z10;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.f6652b;
        }
    }

    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f6653b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return t.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f6650a;
        f6644c = new e(bVar, false);
        f6645d = new e(bVar, true);
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
