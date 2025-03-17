package G2;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final r f6612d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f6613e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f6614f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f6615g;

    /* renamed from: h  reason: collision with root package name */
    static final a f6616h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6617a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6618b;

    /* renamed from: c  reason: collision with root package name */
    private final r f6619c;

    /* renamed from: G2.a$a  reason: collision with other inner class name */
    public static final class C0063a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6620a;

        /* renamed from: b  reason: collision with root package name */
        private int f6621b;

        /* renamed from: c  reason: collision with root package name */
        private r f6622c;

        public C0063a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f6616h : a.f6615g;
        }

        private void c(boolean z10) {
            this.f6620a = z10;
            this.f6622c = a.f6612d;
            this.f6621b = 2;
        }

        public a a() {
            return (this.f6621b == 2 && this.f6622c == a.f6612d) ? b(this.f6620a) : new a(this.f6620a, this.f6621b, this.f6622c);
        }
    }

    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f6623f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f6624a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f6625b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6626c;

        /* renamed from: d  reason: collision with root package name */
        private int f6627d;

        /* renamed from: e  reason: collision with root package name */
        private char f6628e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f6623f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f6624a = charSequence;
            this.f6625b = z10;
            this.f6626c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f6623f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f6627d;
            do {
                int i11 = this.f6627d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f6624a;
                int i12 = i11 - 1;
                this.f6627d = i12;
                charAt = charSequence.charAt(i12);
                this.f6628e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f6627d = i10;
            this.f6628e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f6627d;
                if (i10 >= this.f6626c) {
                    return 12;
                }
                CharSequence charSequence = this.f6624a;
                this.f6627d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f6628e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f6627d;
            while (true) {
                int i11 = this.f6627d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f6624a;
                int i12 = i11 - 1;
                this.f6627d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f6628e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f6627d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f6624a;
                        int i14 = i13 - 1;
                        this.f6627d = i14;
                        charAt = charSequence2.charAt(i14);
                        this.f6628e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f6627d = i10;
            this.f6628e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f6627d;
            while (true) {
                int i11 = this.f6627d;
                if (i11 < this.f6626c) {
                    CharSequence charSequence = this.f6624a;
                    this.f6627d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f6628e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f6627d;
                            if (i12 >= this.f6626c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f6624a;
                            this.f6627d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f6628e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f6627d = i10;
                    this.f6628e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.f6624a.charAt(this.f6627d - 1);
            this.f6628e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f6624a, this.f6627d);
                this.f6627d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f6627d--;
            byte c10 = c(this.f6628e);
            if (!this.f6625b) {
                return c10;
            }
            char c11 = this.f6628e;
            return c11 == '>' ? h() : c11 == ';' ? f() : c10;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.f6624a.charAt(this.f6627d);
            this.f6628e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f6624a, this.f6627d);
                this.f6627d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f6627d++;
            byte c10 = c(this.f6628e);
            if (!this.f6625b) {
                return c10;
            }
            char c11 = this.f6628e;
            return c11 == '<' ? i() : c11 == '&' ? g() : c10;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f6627d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f6627d < this.f6626c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f6627d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            this.f6627d = this.f6626c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f6627d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i10--;
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return -1;
                    } else {
                        if (i11 == 0) {
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        r rVar = s.f6644c;
        f6612d = rVar;
        f6615g = new a(false, 2, rVar);
        f6616h = new a(true, 2, rVar);
    }

    a(boolean z10, int i10, r rVar) {
        this.f6617a = z10;
        this.f6618b = i10;
        this.f6619c = rVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0063a().a();
    }

    static boolean e(Locale locale) {
        return t.a(locale) == 1;
    }

    private String f(CharSequence charSequence, r rVar) {
        boolean a10 = rVar.a(charSequence, 0, charSequence.length());
        return (this.f6617a || (!a10 && b(charSequence) != 1)) ? this.f6617a ? (!a10 || b(charSequence) == -1) ? f6614f : "" : "" : f6613e;
    }

    private String g(CharSequence charSequence, r rVar) {
        boolean a10 = rVar.a(charSequence, 0, charSequence.length());
        return (this.f6617a || (!a10 && a(charSequence) != 1)) ? this.f6617a ? (!a10 || a(charSequence) == -1) ? f6614f : "" : "" : f6613e;
    }

    public boolean d() {
        return (this.f6618b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f6619c, true);
    }

    public CharSequence i(CharSequence charSequence, r rVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = rVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append(g(charSequence, a10 ? s.f6643b : s.f6642a));
        }
        if (a10 != this.f6617a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append(f(charSequence, a10 ? s.f6643b : s.f6642a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f6619c, true);
    }

    public String k(String str, r rVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, rVar, z10).toString();
    }
}
