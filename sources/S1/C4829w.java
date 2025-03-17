package S1;

import S1.C;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"LS1/w;", "", "<init>", "()V", "", "LS1/l;", "fontList", "LS1/C;", "fontWeight", "LS1/x;", "fontStyle", "a", "(Ljava/util/List;LS1/C;I)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: S1.w  reason: case insensitive filesystem */
public final class C4829w {
    public final List<C4819l> a(List<? extends C4819l> list, C c10, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C4819l lVar = (C4819l) obj;
            if (C17542s.e(lVar.b(), c10) && C4830x.f(lVar.c(), i10)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj2 = list.get(i13);
            if (C4830x.f(((C4819l) obj2).c(), i10)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List list2 = list;
        C.a aVar = C.f13316b;
        C c11 = null;
        if (c10.compareTo(aVar.f()) < 0) {
            int size3 = list2.size();
            C c12 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                C b10 = ((C4819l) list2.get(i14)).b();
                if (b10.compareTo(c10) >= 0) {
                    if (b10.compareTo(c10) <= 0) {
                        c12 = b10;
                        c11 = c12;
                        break;
                    } else if (c12 == null || b10.compareTo(c12) < 0) {
                        c12 = b10;
                    }
                } else if (c11 == null || b10.compareTo(c11) > 0) {
                    c11 = b10;
                }
                i14++;
            }
            if (c11 != null) {
                c12 = c11;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i11 < size4) {
                Object obj3 = list2.get(i11);
                if (C17542s.e(((C4819l) obj3).b(), c12)) {
                    arrayList3.add(obj3);
                }
                i11++;
            }
            return arrayList3;
        } else if (c10.compareTo(aVar.g()) > 0) {
            int size5 = list2.size();
            C c13 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                C b11 = ((C4819l) list2.get(i15)).b();
                if (b11.compareTo(c10) >= 0) {
                    if (b11.compareTo(c10) <= 0) {
                        c13 = b11;
                        c11 = c13;
                        break;
                    } else if (c13 == null || b11.compareTo(c13) < 0) {
                        c13 = b11;
                    }
                } else if (c11 == null || b11.compareTo(c11) > 0) {
                    c11 = b11;
                }
                i15++;
            }
            if (c13 == null) {
                c13 = c11;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i11 < size6) {
                Object obj4 = list2.get(i11);
                if (C17542s.e(((C4819l) obj4).b(), c13)) {
                    arrayList4.add(obj4);
                }
                i11++;
            }
            return arrayList4;
        } else {
            C g10 = aVar.g();
            int size7 = list2.size();
            C c14 = null;
            C c15 = null;
            int i16 = 0;
            while (true) {
                if (i16 >= size7) {
                    break;
                }
                C b12 = ((C4819l) list2.get(i16)).b();
                if (g10 == null || b12.compareTo(g10) <= 0) {
                    if (b12.compareTo(c10) >= 0) {
                        if (b12.compareTo(c10) <= 0) {
                            c14 = b12;
                            c15 = c14;
                            break;
                        } else if (c15 == null || b12.compareTo(c15) < 0) {
                            c15 = b12;
                        }
                    } else if (c14 == null || b12.compareTo(c14) > 0) {
                        c14 = b12;
                    }
                }
                i16++;
            }
            if (c15 != null) {
                c14 = c15;
            }
            ArrayList arrayList5 = new ArrayList(list2.size());
            int size8 = list2.size();
            for (int i17 = 0; i17 < size8; i17++) {
                Object obj5 = list2.get(i17);
                if (C17542s.e(((C4819l) obj5).b(), c14)) {
                    arrayList5.add(obj5);
                }
            }
            if (!arrayList5.isEmpty()) {
                return arrayList5;
            }
            C g11 = C.f13316b.g();
            int size9 = list2.size();
            C c16 = null;
            int i18 = 0;
            while (true) {
                if (i18 >= size9) {
                    break;
                }
                C b13 = ((C4819l) list2.get(i18)).b();
                if (g11 == null || b13.compareTo(g11) >= 0) {
                    if (b13.compareTo(c10) >= 0) {
                        if (b13.compareTo(c10) <= 0) {
                            c11 = b13;
                            c16 = c11;
                            break;
                        } else if (c16 == null || b13.compareTo(c16) < 0) {
                            c16 = b13;
                        }
                    } else if (c11 == null || b13.compareTo(c11) > 0) {
                        c11 = b13;
                    }
                }
                i18++;
            }
            if (c16 != null) {
                c11 = c16;
            }
            ArrayList arrayList6 = new ArrayList(list2.size());
            int size10 = list2.size();
            while (i11 < size10) {
                Object obj6 = list2.get(i11);
                if (C17542s.e(((C4819l) obj6).b(), c11)) {
                    arrayList6.add(obj6);
                }
                i11++;
            }
            return arrayList6;
        }
    }
}
