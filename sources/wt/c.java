package Wt;

import IC.C13023e;
import IC.C13026h;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import bI.C17035a;
import ep.C11255a;
import ep.C11256b;
import ip.i;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;
import kp.C11522d;
import qx.C14956a;
import tI.C17978n;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aE\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u001b2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a%\u0010!\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\"\u001aK\u0010*\u001a\u00020)*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0000H\u0001¢\u0006\u0004\b,\u0010-\u001a)\u0010/\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010%2\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b/\u00100\u001a\u001b\u00101\u001a\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b1\u00102\u001a;\u00105\u001a\u0004\u0018\u00010\u00132\u0006\u00103\u001a\u00020\u00162\b\u00104\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b5\u00106\u001a'\u00107\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b7\u00108\u001a\u0015\u00109\u001a\u0004\u0018\u00010\u0013*\u00020\u000bH\u0000¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Ljt/b;", "Ljava/time/LocalDateTime;", "currentTime", "Lep/b;", "localizedDateTimeFormatter", "Lkp/d;", "currencyConfig", "LXt/a;", "m", "(Ljt/b;Ljava/time/LocalDateTime;Lep/b;Lkp/d;)LXt/a;", "", "Ljt/b$f;", "timeSlots", "currentDate", "", "h", "(Ljava/util/List;Ljava/time/LocalDateTime;)I", "Ljt/b$b;", "loyaltyEvent", "LIC/e;", "e", "(Ljt/b$b;)LIC/e;", "", "isRegistrationOpen", "timeSlot", "Ljt/b$c;", "price", "LXH/v;", "i", "(ZLjt/b$f;Ljava/time/LocalDateTime;Ljt/b$c;Lkp/d;)LXH/v;", "storeEvent", "j", "(Ljt/b;Lkp/d;)LXH/v;", "g", "(Ljava/util/List;Lep/b;)LIC/e;", "isLoggedIn", "isFamilyMember", "", "currentTimeSlotId", "Lep/a;", "dateFormatPattern", "LSt/a;", "l", "(Ljt/b;Lep/b;Lkp/d;ZZLjava/time/LocalDateTime;Ljava/lang/String;Lep/a;)LSt/a;", "k", "(Ljava/time/LocalDateTime;Ljt/b;)Z", "selectedTimeSlotId", "b", "(Ljt/b;Ljava/lang/String;Ljava/time/LocalDateTime;)Ljt/b$f;", "a", "(Ljava/util/List;)Ljt/b$f;", "isEventRegistrationOpen", "eventRegistrationStartTime", "d", "(ZLjava/time/LocalDateTime;Ljt/b$f;Lep/b;Lep/a;)LIC/e;", "f", "(Ljt/b$f;Lep/b;Lep/a;)LIC/e;", "c", "(Ljt/b$f;)LIC/e;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Boolean.valueOf(((b.f) t11).g() instanceof b.f.a.C2236f), Boolean.valueOf(((b.f) t10).g() instanceof b.f.a.C2236f));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f89165a;

        public b(Comparator comparator) {
            this.f89165a = comparator;
        }

        public final int compare(T t10, T t11) {
            int compare = this.f89165a.compare(t10, t11);
            return compare != 0 ? compare : C17035a.e(Boolean.valueOf(((b.f) t10).g() instanceof b.f.a.g), Boolean.valueOf(((b.f) t11).g() instanceof b.f.a.g));
        }
    }

    private static final b.f a(List<b.f> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            b.f fVar = (b.f) obj;
            if (!(fVar.g() instanceof b.f.a.e)) {
                if (fVar.g() instanceof b.f.a.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return (b.f) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: jt.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: jt.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: jt.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: jt.b$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final jt.b.f b(jt.b r4, java.lang.String r5, java.time.LocalDateTime r6) {
        /*
            java.lang.String r0 = "storeEvent"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "currentTime"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.util.List r0 = r4.h()
            jt.b$f r0 = a(r0)
            if (r0 == 0) goto L_0x0015
            return r0
        L_0x0015:
            r0 = 0
            if (r5 == 0) goto L_0x0040
            java.util.List r1 = r4.h()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r1.next()
            r3 = r2
            jt.b$f r3 = (jt.b.f) r3
            java.lang.String r3 = r3.d()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 == 0) goto L_0x0022
            goto L_0x003b
        L_0x003a:
            r2 = r0
        L_0x003b:
            jt.b$f r2 = (jt.b.f) r2
            if (r2 == 0) goto L_0x0040
            return r2
        L_0x0040:
            java.util.List r5 = r4.h()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            Wt.c$a r1 = new Wt.c$a
            r1.<init>()
            Wt.c$b r2 = new Wt.c$b
            r2.<init>(r1)
            java.util.List r5 = YH.C16877v.g1(r5, r2)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x005a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r5.next()
            r2 = r1
            jt.b$f r2 = (jt.b.f) r2
            jt.b$f$a r3 = r2.g()
            boolean r3 = r3 instanceof jt.b.f.a.C2235b
            if (r3 != 0) goto L_0x005a
            boolean r2 = r2.h(r6)
            if (r2 != 0) goto L_0x005a
            r0 = r1
        L_0x0076:
            jt.b$f r0 = (jt.b.f) r0
            if (r0 == 0) goto L_0x007b
            return r0
        L_0x007b:
            java.util.List r4 = r4.h()
            java.lang.Object r4 = YH.C16877v.w0(r4)
            jt.b$f r4 = (jt.b.f) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Wt.c.b(jt.b, java.lang.String, java.time.LocalDateTime):jt.b$f");
    }

    public static final C13023e c(b.f fVar) {
        Integer num;
        C17542s.j(fVar, "<this>");
        b.f.a g10 = fVar.g();
        if (C17542s.e(g10, b.f.a.c.f98748a) || C17542s.e(g10, b.f.a.C2235b.f98747a)) {
            num = null;
        } else if (C17542s.e(g10, b.f.a.d.f98749a)) {
            num = Integer.valueOf(st.c.f102801q1);
        } else if (C17542s.e(g10, b.f.a.e.f98750a)) {
            num = Integer.valueOf(st.c.f102738T0);
        } else if (g10 instanceof b.f.a.C2236f) {
            num = Integer.valueOf(st.c.f102734R0);
        } else if (C17542s.e(g10, b.f.a.g.f98754a)) {
            num = Integer.valueOf(st.c.f102810t1);
        } else {
            throw new t();
        }
        if (num != null) {
            return C13026h.a(num.intValue());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        r1 = IC.C13026h.b(st.c.f102742V0, r4.b(r2, r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final IC.C13023e d(boolean r1, java.time.LocalDateTime r2, jt.b.f r3, ep.C11256b r4, ep.C11255a r5) {
        /*
            java.lang.String r0 = "timeSlot"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "localizedDateTimeFormatter"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "dateFormatPattern"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            kotlin.jvm.internal.V r0 = kotlin.jvm.internal.V.f144353a
            java.lang.String r5 = r5.b()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r0 = 1
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String r0 = "EEEE, dd MMM %s"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            java.lang.String r0 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r5, r0)
            if (r1 != 0) goto L_0x0044
            if (r2 == 0) goto L_0x003d
            int r1 = st.c.f102742V0
            java.lang.String r2 = r4.b(r2, r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            IC.e r1 = IC.C13026h.b(r1, r2)
            if (r1 != 0) goto L_0x0062
        L_0x003d:
            java.lang.String r1 = ""
            IC.e r1 = IC.C13026h.c(r1)
            goto L_0x0062
        L_0x0044:
            jt.b$f$a r1 = r3.g()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0061
            int r1 = st.c.f102736S0
            java.time.LocalDateTime r2 = r3.e()
            java.lang.String r2 = r4.b(r2, r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            IC.e r1 = IC.C13026h.b(r1, r2)
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wt.c.d(boolean, java.time.LocalDateTime, jt.b$f, ep.b, ep.a):IC.e");
    }

    private static final C13023e e(b.C2233b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar != b.C2233b.IKEA_FAMILY_ONLY) {
            bVar = null;
        }
        if (bVar != null) {
            return C13026h.a(Oo.b.f84451N3);
        }
        return null;
    }

    public static final C13023e f(b.f fVar, C11256b bVar, C11255a aVar) {
        C17542s.j(fVar, "timeSlot");
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(aVar, "dateFormatPattern");
        V v10 = V.f144353a;
        String format = String.format("E, dd MMM %s", Arrays.copyOf(new Object[]{aVar.b()}, 1));
        C17542s.i(format, "format(...)");
        String b10 = bVar.b(fVar.f(), format);
        String b11 = bVar.b(fVar.c(), format);
        return C13026h.c(b10 + " – " + b11);
    }

    private static final C13023e g(List<b.f> list, C11256b bVar) {
        LocalDateTime f10 = ((b.f) C16877v.w0(list)).f();
        LocalDateTime c10 = ((b.f) C16877v.I0(list)).c();
        if (i.c(Integer.valueOf(list.size()), 1)) {
            return C13026h.c(bVar.b(f10, "dd MMM"));
        }
        if (!c10.toLocalDate().isAfter(f10.toLocalDate())) {
            return C13026h.c(bVar.b(f10, "dd MMM"));
        }
        String b10 = bVar.b(f10, "dd MMM");
        String b11 = bVar.b(c10, "dd MMM");
        return C13026h.c(b10 + " - " + b11);
    }

    private static final int h(List<b.f> list, LocalDateTime localDateTime) {
        if (list.size() == 1) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!((b.f) next).h(localDateTime)) {
                arrayList.add(next);
            }
        }
        return C17978n.e(arrayList.size() - 1, 0);
    }

    private static final v<C13023e, C13023e> i(boolean z10, b.f fVar, LocalDateTime localDateTime, b.c cVar, C11522d dVar) {
        C13023e eVar;
        if (!z10) {
            eVar = C13026h.a(st.c.f102740U0);
        } else {
            eVar = d.b(fVar, localDateTime, false);
            if (eVar == null) {
                eVar = C13026h.a(st.c.f102728O0);
            }
        }
        C13023e b10 = cVar != null ? C13026h.b(st.c.f102732Q0, C14956a.f130484a.b(cVar.a(), dVar)) : C13026h.a(st.c.f102710F0);
        return C16796C.a(b10, new C13023e.a(st.c.f102756b1, C16877v.q(b10, eVar)));
    }

    private static final v<C13023e, C13023e> j(jt.b bVar, C11522d dVar) {
        b.c e10 = bVar.e();
        C13023e b10 = e10 != null ? C13026h.b(st.c.f102732Q0, C14956a.f130484a.b(e10.a(), dVar)) : C13026h.a(st.c.f102710F0);
        return C16796C.a(b10, bVar.f().d() ? b10 : new C13023e.a(st.c.f102756b1, C16877v.q(b10, C13026h.a(st.c.f102728O0))));
    }

    public static final boolean k(LocalDateTime localDateTime, jt.b bVar) {
        boolean z10;
        C17542s.j(localDateTime, "currentTime");
        C17542s.j(bVar, "storeEvent");
        Iterable h10 = bVar.h();
        if (!(h10 instanceof Collection) || !((Collection) h10).isEmpty()) {
            Iterator it = h10.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((b.f) it.next()).h(localDateTime)) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = true;
        return bVar.f().d() && bVar.i(localDateTime) && !z10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: jt.b$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final St.a l(jt.b r27, ep.C11256b r28, kp.C11522d r29, boolean r30, boolean r31, java.time.LocalDateTime r32, java.lang.String r33, ep.C11255a r34) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r32
            r4 = r33
            r5 = r34
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.C17542s.j(r0, r6)
            java.lang.String r6 = "localizedDateTimeFormatter"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            java.lang.String r6 = "currencyConfig"
            kotlin.jvm.internal.C17542s.j(r2, r6)
            java.lang.String r6 = "currentTime"
            kotlin.jvm.internal.C17542s.j(r3, r6)
            java.lang.String r6 = "currentTimeSlotId"
            kotlin.jvm.internal.C17542s.j(r4, r6)
            java.lang.String r6 = "dateFormatPattern"
            kotlin.jvm.internal.C17542s.j(r5, r6)
            java.util.List r6 = r27.h()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0034:
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x004d
            java.lang.Object r7 = r6.next()
            r9 = r7
            jt.b$f r9 = (jt.b.f) r9
            java.lang.String r9 = r9.d()
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r4)
            if (r9 == 0) goto L_0x0034
            goto L_0x004e
        L_0x004d:
            r7 = r8
        L_0x004e:
            jt.b$f r7 = (jt.b.f) r7
            if (r7 != 0) goto L_0x005d
            java.util.List r4 = r27.h()
            java.lang.Object r4 = YH.C16877v.w0(r4)
            r7 = r4
            jt.b$f r7 = (jt.b.f) r7
        L_0x005d:
            jt.b$b r4 = r27.d()
            jt.b$b r6 = jt.b.C2233b.IKEA_FAMILY_ONLY
            r9 = 0
            r10 = 1
            if (r4 != r6) goto L_0x006c
            if (r31 != 0) goto L_0x006c
            r24 = r10
            goto L_0x006e
        L_0x006c:
            r24 = r9
        L_0x006e:
            jt.b$a r4 = r27.a()
            java.lang.String r4 = r4.c()
            IC.e r12 = IC.C13026h.c(r4)
            jt.b$a r4 = r27.a()
            java.lang.String r4 = r4.b()
            IC.e r13 = IC.C13026h.c(r4)
            jt.b$a r4 = r27.a()
            java.lang.String r4 = r4.a()
            IC.e r14 = IC.C13026h.c(r4)
            java.lang.String r15 = r27.b()
            jt.b$b r4 = r27.d()
            IC.e r17 = e(r4)
            XH.v r16 = j(r0, r2)
            java.util.List r2 = r27.h()
            int r4 = r2.size()
            if (r4 <= r10) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r2 = r8
        L_0x00ae:
            if (r2 == 0) goto L_0x00cc
            java.util.List r2 = r27.h()
            int r2 = r2.size()
            int r2 = r2 + -1
            int r4 = st.b.f102698d
            int r6 = IC.C13020b.a(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            IC.e r8 = IC.C13026h.d(r4, r6, r2)
        L_0x00cc:
            r19 = r8
            boolean r21 = k(r3, r0)
            IC.e r18 = f(r7, r1, r5)
            boolean r2 = r0.i(r3)
            jt.b$d r3 = r27.f()
            java.time.LocalDateTime r3 = r3.e()
            IC.e r20 = d(r2, r3, r7, r1, r5)
            jt.b$c r0 = r27.e()
            if (r0 == 0) goto L_0x00ef
            r22 = r10
            goto L_0x00f1
        L_0x00ef:
            r22 = r9
        L_0x00f1:
            java.lang.String r25 = r7.d()
            jt.b$f$a r26 = r7.g()
            St.a r0 = new St.a
            r11 = r0
            r23 = r30
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Wt.c.l(jt.b, ep.b, kp.d, boolean, boolean, java.time.LocalDateTime, java.lang.String, ep.a):St.a");
    }

    public static final Xt.a m(jt.b bVar, LocalDateTime localDateTime, C11256b bVar2, C11522d dVar) {
        boolean z10;
        boolean z11;
        C17542s.j(bVar, "<this>");
        C17542s.j(localDateTime, "currentTime");
        C17542s.j(bVar2, "localizedDateTimeFormatter");
        C17542s.j(dVar, "currencyConfig");
        b.f b10 = b(bVar, (String) null, localDateTime);
        String c10 = bVar.c();
        C13023e c11 = C13026h.c(bVar.a().c());
        C13023e c12 = C13026h.c(bVar.a().b());
        C13023e g10 = g(bVar.h(), bVar2);
        String b11 = bVar.b();
        int h10 = h(bVar.h(), localDateTime);
        C13023e e10 = e(bVar.d());
        v<C13023e, C13023e> i10 = i(bVar.i(localDateTime), b10, localDateTime, bVar.e(), dVar);
        Iterable h11 = bVar.h();
        if (!(h11 instanceof Collection) || !((Collection) h11).isEmpty()) {
            Iterator it = h11.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((b.f) it.next()).g().b()) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        Iterable h12 = bVar.h();
        if (!(h12 instanceof Collection) || !((Collection) h12).isEmpty()) {
            Iterator it2 = h12.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((b.f) it2.next()).g() instanceof b.f.a.d) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z11 = false;
        return new Xt.a(c10, c11, c12, g10, b11, h10, e10, i10, z10, z11);
    }
}
