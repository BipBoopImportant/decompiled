package MK;

import GK.C15776D;
import GK.C15789h;
import GK.C15794m;
import GK.C15795n;
import GK.C15802u;
import GK.C15803v;
import HJ.C15854t;
import HK.C15864d;
import QK.C16354j;
import WK.C16770e;
import WK.C16773h;
import YH.X;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!¨\u0006$"}, d2 = {"LGK/u;", "", "headerName", "", "LGK/h;", "a", "(LGK/u;Ljava/lang/String;)Ljava/util/List;", "LWK/e;", "", "result", "LXH/N;", "c", "(LWK/e;Ljava/util/List;)V", "", "g", "(LWK/e;)Z", "", "prefix", "h", "(LWK/e;B)Z", "d", "(LWK/e;)Ljava/lang/String;", "e", "LGK/n;", "LGK/v;", "url", "headers", "f", "(LGK/n;LGK/v;LGK/u;)V", "LGK/D;", "b", "(LGK/D;)Z", "LWK/h;", "LWK/h;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final C16773h f136458a;

    /* renamed from: b  reason: collision with root package name */
    private static final C16773h f136459b;

    static {
        C16773h.a aVar = C16773h.f139664d;
        f136458a = aVar.d("\"\\");
        f136459b = aVar.d("\t ,=");
    }

    public static final List<C15789h> a(C15802u uVar, String str) {
        C17542s.j(uVar, "<this>");
        C17542s.j(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (C15854t.H(str, uVar.k(i10), true)) {
                try {
                    c(new C16770e().D0(uVar.t(i10)), arrayList);
                } catch (EOFException e10) {
                    C16354j.f137719a.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(C15776D d10) {
        C17542s.j(d10, "<this>");
        if (C17542s.e(d10.z().h(), "HEAD")) {
            return false;
        }
        int g10 = d10.g();
        return (((g10 >= 100 && g10 < 200) || g10 == 204 || g10 == 304) && C15864d.v(d10) == -1 && !C15854t.H("chunked", C15776D.o(d10, "Transfer-Encoding", (String) null, 2, (Object) null), true)) ? false : true;
    }

    private static final void c(C16770e eVar, List<C15789h> list) {
        String e10;
        int M10;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    g(eVar);
                    str = e(eVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean g10 = g(eVar);
                e10 = e(eVar);
                if (e10 != null) {
                    M10 = C15864d.M(eVar, (byte) 61);
                    boolean g11 = g(eVar);
                    if (g10 || (!g11 && !eVar.Y1())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int M11 = M10 + C15864d.M(eVar, (byte) 61);
                        while (true) {
                            if (e10 == null) {
                                e10 = e(eVar);
                                if (g(eVar)) {
                                    continue;
                                    break;
                                }
                                M11 = C15864d.M(eVar, (byte) 61);
                            }
                            if (M11 == 0) {
                                continue;
                                break;
                            } else if (M11 <= 1 && !g(eVar)) {
                                String d10 = h(eVar, (byte) 34) ? d(eVar) : e(eVar);
                                if (d10 == null || ((String) linkedHashMap.put(e10, d10)) != null) {
                                    return;
                                }
                                if (g(eVar) || eVar.Y1()) {
                                    e10 = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new C15789h(str, linkedHashMap));
                        str = e10;
                    }
                } else if (eVar.Y1()) {
                    list.add(new C15789h(str, X.j()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, e10 + C15854t.M("=", M10));
            C17542s.i(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new C15789h(str, singletonMap));
        }
    }

    private static final String d(C16770e eVar) {
        if (eVar.readByte() == 34) {
            C16770e eVar2 = new C16770e();
            while (true) {
                long b32 = eVar.b3(f136458a);
                if (b32 == -1) {
                    return null;
                }
                if (eVar.u(b32) == 34) {
                    eVar2.s3(eVar, b32);
                    eVar.readByte();
                    return eVar2.l0();
                } else if (eVar.size() == b32 + 1) {
                    return null;
                } else {
                    eVar2.s3(eVar, b32);
                    eVar.readByte();
                    eVar2.s3(eVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private static final String e(C16770e eVar) {
        long b32 = eVar.b3(f136459b);
        if (b32 == -1) {
            b32 = eVar.size();
        }
        if (b32 != 0) {
            return eVar.B1(b32);
        }
        return null;
    }

    public static final void f(C15795n nVar, C15803v vVar, C15802u uVar) {
        C17542s.j(nVar, "<this>");
        C17542s.j(vVar, "url");
        C17542s.j(uVar, "headers");
        if (nVar != C15795n.f135076b) {
            List<C15794m> e10 = C15794m.f135061j.e(vVar, uVar);
            if (!e10.isEmpty()) {
                nVar.a(vVar, e10);
            }
        }
    }

    private static final boolean g(C16770e eVar) {
        boolean z10 = false;
        while (!eVar.Y1()) {
            byte u10 = eVar.u(0);
            if (u10 == 44) {
                eVar.readByte();
                z10 = true;
            } else if (u10 != 32 && u10 != 9) {
                break;
            } else {
                eVar.readByte();
            }
        }
        return z10;
    }

    private static final boolean h(C16770e eVar, byte b10) {
        return !eVar.Y1() && eVar.u(0) == b10;
    }
}
