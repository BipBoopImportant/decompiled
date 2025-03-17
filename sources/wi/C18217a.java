package wI;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18054c;
import uI.C18059h;
import uI.C18060i;
import uI.C18064m;
import xI.C18599A;
import xI.j1;
import yI.C18724h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LuI/c;", "", "value", "a", "(LuI/c;)Z", "b", "(LuI/c;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wI.a  reason: case insensitive filesystem */
public final class C18217a {
    public static final boolean a(C18054c<?> cVar) {
        C18724h<?> c02;
        C17542s.j(cVar, "<this>");
        if (cVar instanceof C18060i) {
            C18064m mVar = (C18064m) cVar;
            Field b10 = c.b(mVar);
            if (!(b10 != null ? b10.isAccessible() : true)) {
                return false;
            }
            Method c10 = c.c(mVar);
            if (!(c10 != null ? c10.isAccessible() : true)) {
                return false;
            }
            Method e10 = c.e((C18060i) cVar);
            if (!(e10 != null ? e10.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof C18064m) {
            C18064m mVar2 = (C18064m) cVar;
            Field b11 = c.b(mVar2);
            if (!(b11 != null ? b11.isAccessible() : true)) {
                return false;
            }
            Method c11 = c.c(mVar2);
            if (!(c11 != null ? c11.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof C18064m.b) {
            Field b12 = c.b(((C18064m.b) cVar).t());
            if (!(b12 != null ? b12.isAccessible() : true)) {
                return false;
            }
            Method d10 = c.d((C18059h) cVar);
            if (!(d10 != null ? d10.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof C18060i.a) {
            Field b13 = c.b(((C18060i.a) cVar).t());
            if (!(b13 != null ? b13.isAccessible() : true)) {
                return false;
            }
            Method d11 = c.d((C18059h) cVar);
            if (!(d11 != null ? d11.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof C18059h) {
            C18059h hVar = (C18059h) cVar;
            Method d12 = c.d(hVar);
            if (!(d12 != null ? d12.isAccessible() : true)) {
                return false;
            }
            C18599A<?> b14 = j1.b(cVar);
            AccessibleObject accessibleObject = null;
            Object b15 = (b14 == null || (c02 = b14.c0()) == null) ? null : c02.b();
            if (b15 instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) b15;
            }
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor a10 = c.a(hVar);
            if (!(a10 != null ? a10.isAccessible() : true)) {
                return false;
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        r3 = r3.c0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(uI.C18054c<?> r3, boolean r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            boolean r0 = r3 instanceof uI.C18060i
            if (r0 == 0) goto L_0x002b
            r0 = r3
            uI.m r0 = (uI.C18064m) r0
            java.lang.reflect.Field r1 = wI.c.b(r0)
            if (r1 == 0) goto L_0x0015
            r1.setAccessible(r4)
        L_0x0015:
            java.lang.reflect.Method r0 = wI.c.c(r0)
            if (r0 == 0) goto L_0x001e
            r0.setAccessible(r4)
        L_0x001e:
            uI.i r3 = (uI.C18060i) r3
            java.lang.reflect.Method r3 = wI.c.e(r3)
            if (r3 == 0) goto L_0x00be
            r3.setAccessible(r4)
            goto L_0x00be
        L_0x002b:
            boolean r0 = r3 instanceof uI.C18064m
            if (r0 == 0) goto L_0x0045
            uI.m r3 = (uI.C18064m) r3
            java.lang.reflect.Field r0 = wI.c.b(r3)
            if (r0 == 0) goto L_0x003a
            r0.setAccessible(r4)
        L_0x003a:
            java.lang.reflect.Method r3 = wI.c.c(r3)
            if (r3 == 0) goto L_0x00be
            r3.setAccessible(r4)
            goto L_0x00be
        L_0x0045:
            boolean r0 = r3 instanceof uI.C18064m.b
            if (r0 == 0) goto L_0x0065
            r0 = r3
            uI.m$b r0 = (uI.C18064m.b) r0
            uI.m r0 = r0.t()
            java.lang.reflect.Field r0 = wI.c.b(r0)
            if (r0 == 0) goto L_0x0059
            r0.setAccessible(r4)
        L_0x0059:
            uI.h r3 = (uI.C18059h) r3
            java.lang.reflect.Method r3 = wI.c.d(r3)
            if (r3 == 0) goto L_0x00be
            r3.setAccessible(r4)
            goto L_0x00be
        L_0x0065:
            boolean r0 = r3 instanceof uI.C18060i.a
            if (r0 == 0) goto L_0x0085
            r0 = r3
            uI.i$a r0 = (uI.C18060i.a) r0
            uI.m r0 = r0.t()
            java.lang.reflect.Field r0 = wI.c.b(r0)
            if (r0 == 0) goto L_0x0079
            r0.setAccessible(r4)
        L_0x0079:
            uI.h r3 = (uI.C18059h) r3
            java.lang.reflect.Method r3 = wI.c.d(r3)
            if (r3 == 0) goto L_0x00be
            r3.setAccessible(r4)
            goto L_0x00be
        L_0x0085:
            boolean r0 = r3 instanceof uI.C18059h
            if (r0 == 0) goto L_0x00bf
            r0 = r3
            uI.h r0 = (uI.C18059h) r0
            java.lang.reflect.Method r1 = wI.c.d(r0)
            if (r1 == 0) goto L_0x0095
            r1.setAccessible(r4)
        L_0x0095:
            xI.A r3 = xI.j1.b(r3)
            r1 = 0
            if (r3 == 0) goto L_0x00a7
            yI.h r3 = r3.c0()
            if (r3 == 0) goto L_0x00a7
            java.lang.reflect.Member r3 = r3.b()
            goto L_0x00a8
        L_0x00a7:
            r3 = r1
        L_0x00a8:
            boolean r2 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r2 == 0) goto L_0x00af
            r1 = r3
            java.lang.reflect.AccessibleObject r1 = (java.lang.reflect.AccessibleObject) r1
        L_0x00af:
            if (r1 == 0) goto L_0x00b5
            r3 = 1
            r1.setAccessible(r3)
        L_0x00b5:
            java.lang.reflect.Constructor r3 = wI.c.a(r0)
            if (r3 == 0) goto L_0x00be
            r3.setAccessible(r4)
        L_0x00be:
            return
        L_0x00bf:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown callable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wI.C18217a.b(uI.c, boolean):void");
    }
}
