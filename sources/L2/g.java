package l2;

public class g {

    /* renamed from: d  reason: collision with root package name */
    static boolean f25473d = false;

    /* renamed from: a  reason: collision with root package name */
    private String f25474a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25475b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f25476c;

    enum a {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public g(String str) {
        this.f25474a = str;
    }

    private C5519c a(C5519c cVar, int i10, a aVar, boolean z10, char[] cArr) {
        C5519c cVar2;
        if (f25473d) {
            System.out.println("CREATE " + aVar + " at " + cArr[i10]);
        }
        switch (aVar.ordinal()) {
            case 1:
                cVar2 = f.m0(cArr);
                break;
            case 2:
                cVar2 = C5517a.m0(cArr);
                break;
            case 3:
                cVar2 = e.L(cArr);
                break;
            case 4:
                cVar2 = i.L(cArr);
                break;
            case 5:
                cVar2 = C5520d.n0(cArr);
                break;
            case 6:
                cVar2 = j.L(cArr);
                break;
            default:
                cVar2 = null;
                break;
        }
        i10++;
        if (cVar2 == null) {
            return null;
        }
        cVar2.H(this.f25476c);
        if (z10) {
            cVar2.I((long) i10);
        }
        if (cVar instanceof C5518b) {
            cVar2.E((C5518b) cVar);
        }
        return cVar2;
    }

    private C5519c b(int i10, char c10, C5519c cVar, char[] cArr) {
        if (c10 == 9 || c10 == 10 || c10 == 13 || c10 == ' ') {
            return cVar;
        }
        if (c10 == '\"' || c10 == '\'') {
            if (cVar instanceof f) {
                return a(cVar, i10, a.KEY, true, cArr);
            }
            return a(cVar, i10, a.STRING, true, cArr);
        } else if (c10 != '[') {
            if (c10 != ']') {
                if (c10 == '{') {
                    return a(cVar, i10, a.OBJECT, true, cArr);
                } else if (c10 != '}') {
                    switch (c10) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return a(cVar, i10, a.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            return cVar;
                        case '/':
                            int i11 = i10 + 1;
                            if (i11 >= cArr.length || cArr[i11] != '/') {
                                return cVar;
                            }
                            this.f25475b = true;
                            return cVar;
                        default:
                            if (!(cVar instanceof C5518b) || (cVar instanceof f)) {
                                return a(cVar, i10, a.KEY, true, cArr);
                            }
                            C5519c a10 = a(cVar, i10, a.TOKEN, true, cArr);
                            j jVar = (j) a10;
                            if (jVar.M(c10, (long) i10)) {
                                return a10;
                            }
                            throw new h("incorrect token <" + c10 + "> at line " + this.f25476c, jVar);
                    }
                }
            }
            cVar.G((long) (i10 - 1));
            C5519c k10 = cVar.k();
            k10.G((long) i10);
            return k10;
        } else {
            return a(cVar, i10, a.ARRAY, true, cArr);
        }
    }

    public static f d(String str) {
        return new g(str).c();
    }

    public f c() {
        char[] charArray = this.f25474a.toCharArray();
        int length = charArray.length;
        int i10 = 1;
        this.f25476c = 1;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char c10 = charArray[i11];
            if (c10 == '{') {
                break;
            }
            if (c10 == 10) {
                this.f25476c++;
            }
            i11++;
        }
        if (i11 != -1) {
            f m02 = f.m0(charArray);
            m02.H(this.f25476c);
            m02.I((long) i11);
            int i12 = i11 + 1;
            C5519c cVar = m02;
            while (i12 < length) {
                char c11 = charArray[i12];
                if (c11 == 10) {
                    this.f25476c += i10;
                }
                if (this.f25475b) {
                    if (c11 == 10) {
                        this.f25475b = z10;
                    } else {
                        continue;
                        i12++;
                        i10 = 1;
                        z10 = false;
                    }
                }
                if (cVar == null) {
                    break;
                }
                if (cVar.D()) {
                    cVar = b(i12, c11, cVar, charArray);
                } else if (cVar instanceof f) {
                    if (c11 == '}') {
                        cVar.G((long) (i12 - 1));
                    } else {
                        cVar = b(i12, c11, cVar, charArray);
                    }
                } else if (!(cVar instanceof C5517a)) {
                    boolean z11 = cVar instanceof i;
                    if (z11) {
                        long j10 = cVar.f25465b;
                        if (charArray[(int) j10] == c11) {
                            cVar.I(j10 + 1);
                            cVar.G((long) (i12 - 1));
                        }
                    } else {
                        if (cVar instanceof j) {
                            j jVar = (j) cVar;
                            if (!jVar.M(c11, (long) i12)) {
                                throw new h("parsing incorrect token " + jVar.j() + " at line " + this.f25476c, jVar);
                            }
                        }
                        if ((cVar instanceof C5520d) || z11) {
                            long j11 = cVar.f25465b;
                            char c12 = charArray[(int) j11];
                            if ((c12 == '\'' || c12 == '\"') && c12 == c11) {
                                cVar.I(j11 + 1);
                                cVar.G((long) (i12 - 1));
                            }
                        }
                        if (!cVar.D() && (c11 == '}' || c11 == ']' || c11 == ',' || c11 == ' ' || c11 == 9 || c11 == 13 || c11 == 10 || c11 == ':')) {
                            long j12 = (long) (i12 - 1);
                            cVar.G(j12);
                            if (c11 == '}' || c11 == ']') {
                                cVar = cVar.k();
                                cVar.G(j12);
                                if (cVar instanceof C5520d) {
                                    cVar = cVar.k();
                                    cVar.G(j12);
                                }
                            }
                        }
                    }
                } else if (c11 == ']') {
                    cVar.G((long) (i12 - 1));
                } else {
                    cVar = b(i12, c11, cVar, charArray);
                }
                if (cVar.D() && (!(cVar instanceof C5520d) || ((C5520d) cVar).f25463f.size() > 0)) {
                    cVar = cVar.k();
                }
                i12++;
                i10 = 1;
                z10 = false;
            }
            while (cVar != null && !cVar.D()) {
                if (cVar instanceof i) {
                    cVar.I((long) (((int) cVar.f25465b) + 1));
                }
                cVar.G((long) (length - 1));
                cVar = cVar.k();
            }
            if (f25473d) {
                System.out.println("Root: " + m02.K());
            }
            return m02;
        }
        throw new h("invalid json content", (C5519c) null);
    }
}
