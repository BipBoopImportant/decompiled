package ko;

import Co.c;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import Nn.C10804g;
import Nn.C10810m;
import Nn.x;
import Op.C10828d;
import XH.C16807N;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import go.C11334s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lko/b;", "Lko/a;", "LNn/x;", "checkoutRepository", "<init>", "(LNn/x;)V", "", "LNn/m;", "deliveryArrangementItems", "LNn/g;", "checkoutItems", "Lgo/s;", "c", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "", "itemNumber", "b", "(Ljava/util/List;Ljava/lang/String;)LNn/g;", "checkoutId", "deliveryId", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "LNn/x;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11518a {

    /* renamed from: a  reason: collision with root package name */
    private final x f98977a;

    public b(x xVar) {
        C17542s.j(xVar, "checkoutRepository");
        this.f98977a = xVar;
    }

    private final C10804g b(List<C10804g> list, String str) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C10804g) obj).b(), str)) {
                break;
            }
        }
        C10804g gVar = (C10804g) obj;
        if (gVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("We got a delivery item that can't be found in the checkout");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            C16807N n10 = C16807N.f139792a;
        }
        return gVar;
    }

    private final List<C11334s> c(List<C10810m> list, List<C10804g> list2) {
        String str;
        String valueOf;
        String str2;
        String str3;
        C10804g.b a10;
        C10804g.b a11;
        C10804g.b a12;
        Iterator it;
        int i10;
        C10804g.b a13;
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        Iterator it2 = iterable.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            C10810m mVar = (C10810m) next;
            C10804g b10 = b(list2, mVar.b());
            if (b10 == null || (a13 = b10.a()) == null || (str = a13.d()) == null) {
                str = b10 != null ? b10.b() : null;
            }
            if (str == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("We could not find any product name or product no");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str4 = null;
                String str5 = null;
                for (C11819b bVar : arrayList2) {
                    if (str4 == null) {
                        String a14 = C11818a.a((String) null, illegalArgumentException);
                        if (a14 == null) {
                            break;
                        }
                        str4 = C11820c.a(a14);
                    }
                    String str6 = str4;
                    if (str5 == null) {
                        String name = b.class.getName();
                        C17542s.g(name);
                        it = it2;
                        i10 = i12;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        it = it2;
                        i10 = i12;
                    }
                    String str7 = str5;
                    bVar.a(eVar, str7, false, illegalArgumentException, str6);
                    str5 = str7;
                    eVar = eVar;
                    str4 = str6;
                    it2 = it;
                    i12 = i10;
                    illegalArgumentException = illegalArgumentException;
                }
            }
            Iterator it3 = it2;
            int i13 = i12;
            C13023e b11 = b10 != null ? C13026h.b(Oo.b.f84766r1, Integer.valueOf(b10.c())) : null;
            Integer a15 = mVar.a();
            Integer c10 = mVar.c();
            C13023e b12 = (a15 == null || c10 == null) ? null : C13026h.b(Oo.b.f84711m1, a15, c10);
            if (b10 == null || (valueOf = b10.b()) == null) {
                valueOf = String.valueOf(i11);
            }
            String str8 = valueOf;
            if (str == null) {
                str = "";
            }
            String str9 = str;
            String i14 = c.i((b10 == null || (a12 = b10.a()) == null) ? null : a12.c(), (b10 == null || (a11 = b10.a()) == null) ? null : a11.b());
            if (b10 == null || (a10 = b10.a()) == null) {
                str3 = null;
                str2 = null;
            } else {
                str2 = a10.a();
                str3 = null;
            }
            arrayList.add(new C11334s(str8, str9, i14, new C10828d.C1720d(str2, str3), b11, C15985a.a(), b12));
            it2 = it3;
            i11 = i13;
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<go.C11334s> a(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "checkoutId"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "deliveryId"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            Nn.x r0 = r12.f98977a
            Nn.f r13 = r0.s(r13)
            r0 = 0
            if (r13 == 0) goto L_0x0047
            Nn.K r1 = r13.i()
            if (r1 == 0) goto L_0x0047
            java.util.List r1 = r1.a()
            if (r1 == 0) goto L_0x0047
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r1.next()
            r3 = r2
            Nn.K$b r3 = (Nn.K.b) r3
            java.lang.String r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r14)
            if (r3 == 0) goto L_0x0025
            goto L_0x003e
        L_0x003d:
            r2 = r0
        L_0x003e:
            Nn.K$b r2 = (Nn.K.b) r2
            if (r2 == 0) goto L_0x0047
            java.util.List r14 = r2.b()
            goto L_0x0048
        L_0x0047:
            r14 = r0
        L_0x0048:
            r1 = r14
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x005d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0054
            goto L_0x005d
        L_0x0054:
            java.util.List r13 = r13.g()
            java.util.List r13 = r12.c(r14, r13)
            return r13
        L_0x005d:
            r14 = 1
            if (r13 == 0) goto L_0x0062
            r13 = r14
            goto L_0x0063
        L_0x0062:
            r13 = 0
        L_0x0063:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find any delivery items. checkoutExists: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r7.<init>(r13)
            qv.e r13 = qv.e.ERROR
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x008c:
            boolean r3 = r1.hasNext()
            r8 = 0
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r1.next()
            r4 = r3
            qv.b r4 = (qv.C11819b) r4
            boolean r4 = r4.b(r13, r8)
            if (r4 == 0) goto L_0x008c
            r2.add(r3)
            goto L_0x008c
        L_0x00a4:
            java.util.Iterator r9 = r2.iterator()
            r1 = r0
            r2 = r1
        L_0x00aa:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0120
            java.lang.Object r3 = r9.next()
            qv.b r3 = (qv.C11819b) r3
            if (r1 != 0) goto L_0x00c4
            java.lang.String r1 = qv.C11818a.a(r0, r7)
            if (r1 != 0) goto L_0x00c0
            goto L_0x0120
        L_0x00c0:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x00c4:
            r10 = r1
            if (r2 != 0) goto L_0x0113
            java.lang.Class<ko.b> r1 = ko.b.class
            java.lang.String r1 = r1.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r2 = 36
            r4 = 2
            java.lang.String r2 = HJ.C15854t.s1(r1, r2, r0, r4, r0)
            r5 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r5, r0, r4, r0)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00e4
            goto L_0x00ea
        L_0x00e4:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r2, r1)
        L_0x00ea:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "main"
            boolean r2 = HJ.C15854t.b0(r2, r4, r14)
            if (r2 == 0) goto L_0x00fd
            java.lang.String r2 = "m"
            goto L_0x00ff
        L_0x00fd:
            java.lang.String r2 = "b"
        L_0x00ff:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "|"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r2 = r4.toString()
        L_0x0113:
            r11 = r2
            r1 = r3
            r2 = r13
            r3 = r11
            r4 = r8
            r5 = r7
            r6 = r10
            r1.a(r2, r3, r4, r5, r6)
            r1 = r10
            r2 = r11
            goto L_0x00aa
        L_0x0120:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.b.a(java.lang.String, java.lang.String):java.util.List");
    }
}
