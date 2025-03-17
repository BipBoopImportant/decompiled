package XK;

import WK.C16762E;
import WK.C16770e;
import WK.C16773h;
import XH.C16807N;
import YH.C16877v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"LWK/E;", "", "o", "(LWK/E;)I", "", "n", "(LWK/E;)Z", "child", "normalize", "j", "(LWK/E;LWK/E;Z)LWK/E;", "", "k", "(Ljava/lang/String;Z)LWK/E;", "LWK/e;", "q", "(LWK/e;Z)LWK/E;", "LWK/h;", "s", "(Ljava/lang/String;)LWK/h;", "", "r", "(B)LWK/h;", "slash", "p", "(LWK/e;LWK/h;)Z", "a", "LWK/h;", "SLASH", "b", "BACKSLASH", "c", "ANY_SLASH", "d", "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(LWK/E;)LWK/h;", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: XK.d  reason: case insensitive filesystem */
public final class C16837d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16773h f140284a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C16773h f140285b;

    /* renamed from: c  reason: collision with root package name */
    private static final C16773h f140286c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C16773h f140287d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C16773h f140288e;

    static {
        C16773h.a aVar = C16773h.f139664d;
        f140284a = aVar.d("/");
        f140285b = aVar.d("\\");
        f140286c = aVar.d("/\\");
        f140287d = aVar.d(".");
        f140288e = aVar.d("..");
    }

    public static final C16762E j(C16762E e10, C16762E e11, boolean z10) {
        C17542s.j(e10, "<this>");
        C17542s.j(e11, "child");
        if (e11.n() || e11.K() != null) {
            return e11;
        }
        C16773h m10 = m(e10);
        if (m10 == null && (m10 = m(e11)) == null) {
            m10 = s(C16762E.f139593c);
        }
        C16770e eVar = new C16770e();
        eVar.j2(e10.b());
        if (eVar.size() > 0) {
            eVar.j2(m10);
        }
        eVar.j2(e11.b());
        return q(eVar, z10);
    }

    public static final C16762E k(String str, boolean z10) {
        C17542s.j(str, "<this>");
        return q(new C16770e().D0(str), z10);
    }

    /* access modifiers changed from: private */
    public static final int l(C16762E e10) {
        int O10 = C16773h.O(e10.b(), f140284a, 0, 2, (Object) null);
        return O10 != -1 ? O10 : C16773h.O(e10.b(), f140285b, 0, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16773h m(C16762E e10) {
        C16773h b10 = e10.b();
        C16773h hVar = f140284a;
        if (C16773h.J(b10, hVar, 0, 2, (Object) null) != -1) {
            return hVar;
        }
        C16773h b11 = e10.b();
        C16773h hVar2 = f140285b;
        if (C16773h.J(b11, hVar2, 0, 2, (Object) null) != -1) {
            return hVar2;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean n(C16762E e10) {
        return e10.b().v(f140288e) && (e10.b().W() == 2 || e10.b().Q(e10.b().W() + -3, f140284a, 0, 1) || e10.b().Q(e10.b().W() + -3, f140285b, 0, 1));
    }

    /* access modifiers changed from: private */
    public static final int o(C16762E e10) {
        if (e10.b().W() == 0) {
            return -1;
        }
        if (e10.b().B(0) == 47) {
            return 1;
        }
        if (e10.b().B(0) != 92) {
            if (e10.b().W() > 2 && e10.b().B(1) == 58 && e10.b().B(2) == 92) {
                char B10 = (char) e10.b().B(0);
                if ('a' > B10 || B10 >= '{') {
                    return ('A' > B10 || B10 >= '[') ? -1 : 3;
                }
                return 3;
            }
        } else if (e10.b().W() <= 2 || e10.b().B(1) != 92) {
            return 1;
        } else {
            int H10 = e10.b().H(f140285b, 2);
            return H10 == -1 ? e10.b().W() : H10;
        }
    }

    private static final boolean p(C16770e eVar, C16773h hVar) {
        if (!C17542s.e(hVar, f140285b) || eVar.size() < 2 || eVar.u(1) != 58) {
            return false;
        }
        char u10 = (char) eVar.u(0);
        return ('a' <= u10 && u10 < '{') || ('A' <= u10 && u10 < '[');
    }

    public static final C16762E q(C16770e eVar, boolean z10) {
        C16773h hVar;
        C16773h hVar2;
        C17542s.j(eVar, "<this>");
        C16770e eVar2 = new C16770e();
        C16773h hVar3 = null;
        int i10 = 0;
        while (true) {
            if (!eVar.h3(0, f140284a)) {
                hVar = f140285b;
                if (!eVar.h3(0, hVar)) {
                    break;
                }
            }
            byte readByte = eVar.readByte();
            if (hVar3 == null) {
                hVar3 = r(readByte);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && C17542s.e(hVar3, hVar);
        if (z11) {
            C17542s.g(hVar3);
            eVar2.j2(hVar3);
            eVar2.j2(hVar3);
        } else if (i10 > 0) {
            C17542s.g(hVar3);
            eVar2.j2(hVar3);
        } else {
            long b32 = eVar.b3(f140286c);
            if (hVar3 == null) {
                hVar3 = b32 == -1 ? s(C16762E.f139593c) : r(eVar.u(b32));
            }
            if (p(eVar, hVar3)) {
                if (b32 == 2) {
                    eVar2.s3(eVar, 3);
                } else {
                    eVar2.s3(eVar, 2);
                }
            }
            C16807N n10 = C16807N.f139792a;
        }
        boolean z12 = eVar2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!eVar.Y1()) {
            long b33 = eVar.b3(f140286c);
            if (b33 == -1) {
                hVar2 = eVar.i0();
            } else {
                hVar2 = eVar.E1(b33);
                eVar.readByte();
            }
            C16773h hVar4 = f140288e;
            if (C17542s.e(hVar2, hVar4)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || C17542s.e(C16877v.I0(arrayList), hVar4)))) {
                        arrayList.add(hVar2);
                    } else if (!z11 || arrayList.size() != 1) {
                        C16877v.P(arrayList);
                    }
                }
            } else if (!C17542s.e(hVar2, f140287d) && !C17542s.e(hVar2, C16773h.f139665e)) {
                arrayList.add(hVar2);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                eVar2.j2(hVar3);
            }
            eVar2.j2((C16773h) arrayList.get(i11));
        }
        if (eVar2.size() == 0) {
            eVar2.j2(f140287d);
        }
        return new C16762E(eVar2.i0());
    }

    private static final C16773h r(byte b10) {
        if (b10 == 47) {
            return f140284a;
        }
        if (b10 == 92) {
            return f140285b;
        }
        throw new IllegalArgumentException("not a directory separator: " + b10);
    }

    /* access modifiers changed from: private */
    public static final C16773h s(String str) {
        if (C17542s.e(str, "/")) {
            return f140284a;
        }
        if (C17542s.e(str, "\\")) {
            return f140285b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
