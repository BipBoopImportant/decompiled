package ck;

import HJ.C15854t;
import XH.t;
import a7.C6749d;
import a7.m;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lck/a;", "La7/d;", "<init>", "()V", "", "host", "La7/m;", "result", "LXH/N;", "a", "(Ljava/lang/String;La7/m;)V", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ck.a  reason: case insensitive filesystem */
public final class C11141a implements C6749d {

    /* renamed from: a  reason: collision with root package name */
    public static final C1979a f90761a = new C1979a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lck/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ck.a$a  reason: collision with other inner class name */
    public static final class C1979a {
        public /* synthetic */ C1979a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1979a() {
        }
    }

    public void a(String str, m mVar) {
        boolean z10;
        boolean z11;
        String str2;
        boolean z12;
        String str3 = str;
        m mVar2 = mVar;
        C17542s.j(str3, "host");
        C17542s.j(mVar2, "result");
        boolean z13 = true;
        String str4 = null;
        if (mVar2 instanceof m.c.e) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            Iterator it = d.f102012a.a().iterator();
            while (true) {
                z12 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a(str3 + "\n" + mVar2, (Throwable) null);
                    if (a10 != null) {
                        str4 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str5 == null) {
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "CertificateTransparency";
                }
                String str6 = str5;
                bVar.a(eVar, str6, z12, (Throwable) null, str4);
                str5 = str6;
                z12 = z12;
            }
        } else if ((mVar2 instanceof m.c.a) || (mVar2 instanceof m.c.C0733c)) {
            e eVar2 = e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            Iterator it2 = d.f102012a.a().iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str4 == null) {
                    String a11 = C11818a.a(str3 + "\n" + mVar2, (Throwable) null);
                    if (a11 != null) {
                        str4 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str7 == null) {
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, z13) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "CertificateTransparency";
                }
                boolean z14 = z10;
                bVar2.a(eVar2, str7, z14, (Throwable) null, str4);
                z10 = z14;
                z13 = true;
            }
        } else if ((mVar2 instanceof m.b.C0732b) || (mVar2 instanceof m.b.d) || (mVar2 instanceof m.b.a) || (mVar2 instanceof m.b.c) || (mVar2 instanceof m.b.e) || (mVar2 instanceof m.b.f)) {
            IllegalStateException illegalStateException = new IllegalStateException(str3 + "\n" + mVar2);
            e eVar3 = e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str8 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException);
                    if (a12 != null) {
                        str8 = C11820c.a(a12);
                    } else {
                        return;
                    }
                }
                if (str9 == null) {
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "CertificateTransparency";
                }
                bVar3.a(eVar3, str9, false, illegalStateException, str8);
            }
        } else if ((mVar2 instanceof m.c.b) || (mVar2 instanceof m.c.d)) {
            e eVar4 = e.WARN;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            Iterator it3 = d.f102012a.a().iterator();
            while (true) {
                z11 = false;
                if (!it3.hasNext()) {
                    break;
                }
                Object next4 = it3.next();
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str10 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str4 == null) {
                    String a13 = C11818a.a("Stale for: " + str3 + "\n" + mVar2, (Throwable) null);
                    if (a13 != null) {
                        str4 = C11820c.a(a13);
                    } else {
                        return;
                    }
                }
                String str11 = str4;
                if (str10 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "CertificateTransparency";
                } else {
                    str2 = str10;
                }
                bVar4.a(eVar4, str2, z11, (Throwable) null, str11);
                str4 = str11;
                str10 = str2;
                z11 = z11;
            }
        } else {
            throw new t();
        }
    }
}
