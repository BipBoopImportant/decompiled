package Ys;

import HJ.C15854t;
import QJ.C16320n;
import XH.C16807N;
import Ys.f;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LYs/b;", "LYs/a;", "LYs/c;", "installReferrerClientWrapper", "<init>", "(LYs/c;)V", "LQJ/n;", "LYs/f$a;", "continuation", "LXH/N;", "a", "(LQJ/n;)V", "", "responseCode", "onInstallReferrerSetupFinished", "(I)V", "onInstallReferrerServiceDisconnected", "()V", "LYs/c;", "b", "LQJ/n;", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final c f89727a;

    /* renamed from: b  reason: collision with root package name */
    private C16320n<? super f.a> f89728b;

    public b(c cVar) {
        C17542s.j(cVar, "installReferrerClientWrapper");
        this.f89727a = cVar;
    }

    public void a(C16320n<? super f.a> nVar) {
        C17542s.j(nVar, "continuation");
        this.f89728b = nVar;
    }

    public void onInstallReferrerServiceDisconnected() {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Service disconnected", (Throwable) null);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
    }

    public void onInstallReferrerSetupFinished(int i10) {
        Iterator it;
        String str;
        char c10;
        String str2;
        int i11 = i10;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        Class<b> cls = b.class;
        if (i11 == 0) {
            String str5 = str3;
            String c11 = this.f89727a.c();
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            String str6 = null;
            String str7 = null;
            while (it2.hasNext()) {
                C11819b bVar = (C11819b) it2.next();
                if (str6 == null) {
                    String a10 = C11818a.a("Referrer URL: " + c11, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str6 = C11820c.a(a10);
                }
                if (str7 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str = str4;
                    c10 = '$';
                    it = it2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str5) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str4;
                    it = it2;
                    c10 = '$';
                }
                char c12 = c10;
                bVar.a(eVar, str7, false, (Throwable) null, str6);
                str4 = str;
                it2 = it;
            }
            if (c11 == null || c11.length() == 0) {
                C16320n<? super f.a> nVar = this.f89728b;
                if (nVar == null) {
                    C17542s.z("continuation");
                    nVar = null;
                }
                nVar.I(f.a.b.f89742a, (C17642l<? super Throwable, C16807N>) null);
            } else {
                C16320n<? super f.a> nVar2 = this.f89728b;
                if (nVar2 == null) {
                    C17542s.z("continuation");
                    nVar2 = null;
                }
                nVar2.I(new f.a.d(c11), (C17642l<? super Throwable, C16807N>) null);
            }
            this.f89727a.a();
        } else if (i11 == 1) {
            String str8 = str3;
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str9 = null;
            String str10 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str9 == null) {
                    String a11 = C11818a.a("Install service unavailable", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str9 = C11820c.a(a11);
                }
                if (str10 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str8) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str10, false, (Throwable) null, str9);
            }
            this.f89727a.a();
            C16320n<? super f.a> nVar3 = this.f89728b;
            if (nVar3 == null) {
                C17542s.z("continuation");
                nVar3 = null;
            }
            nVar3.I(f.a.c.f89743a, (C17642l<? super Throwable, C16807N>) null);
        } else if (i11 == 2) {
            e eVar3 = e.DEBUG;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str11 = null;
            String str12 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str11 == null) {
                    String a12 = C11818a.a("Feature not supported", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str11 = C11820c.a(a12);
                }
                if (str12 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    str2 = str3;
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str12 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str2) + DslKt.INDICATOR_SEPARATOR + name3;
                } else {
                    str2 = str3;
                }
                String str13 = str12;
                bVar3.a(eVar3, str13, false, (Throwable) null, str11);
                str12 = str13;
                str3 = str2;
            }
            this.f89727a.a();
            C16320n<? super f.a> nVar4 = this.f89728b;
            if (nVar4 == null) {
                C17542s.z("continuation");
                nVar4 = null;
            }
            nVar4.I(f.a.C1920a.f89741a, (C17642l<? super Throwable, C16807N>) null);
        }
    }
}
