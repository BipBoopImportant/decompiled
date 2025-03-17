package jb;

/* renamed from: jb.d  reason: case insensitive filesystem */
public abstract class C9893d implements m<Character> {

    /* renamed from: jb.d$a */
    static abstract class a extends C9893d {
        a() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C9893d.super.b((Character) obj);
        }
    }

    /* renamed from: jb.d$b */
    private static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final char f74783a;

        b(char c10) {
            this.f74783a = c10;
        }

        public boolean e(char c10) {
            return c10 == this.f74783a;
        }

        public String toString() {
            return "CharMatcher.is('" + C9893d.g(this.f74783a) + "')";
        }
    }

    /* renamed from: jb.d$c */
    static abstract class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f74784a;

        c(String str) {
            this.f74784a = (String) l.j(str);
        }

        public final String toString() {
            return this.f74784a;
        }
    }

    /* renamed from: jb.d$d  reason: collision with other inner class name */
    private static final class C1351d extends c {

        /* renamed from: b  reason: collision with root package name */
        static final C9893d f74785b = new C1351d();

        private C1351d() {
            super("CharMatcher.none()");
        }

        public int c(CharSequence charSequence, int i10) {
            l.l(i10, charSequence.length());
            return -1;
        }

        public boolean e(char c10) {
            return false;
        }
    }

    protected C9893d() {
    }

    public static C9893d d(char c10) {
        return new b(c10);
    }

    public static C9893d f() {
        return C1351d.f74785b;
    }

    /* access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        l.l(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
