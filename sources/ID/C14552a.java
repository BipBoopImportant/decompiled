package iD;

import HJ.C15854t;
import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import XH.t;
import cD.C14029a;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import ip.e;
import jD.C14619a;
import java.util.ArrayList;
import java.util.Map;
import kD.l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import mD.C14788a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHB¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LiD/a;", "LmD/a;", "LcD/a;", "editProfileRepository", "LjD/a;", "profileStateToResult", "<init>", "(LcD/a;LjD/a;)V", "", "", "data", "", "a", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "LcD/a;", "b", "LjD/a;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iD.a  reason: case insensitive filesystem */
public final class C14552a implements C14788a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14029a f127548a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14619a f127549b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iD.a$a  reason: collision with other inner class name */
    static final class C3144a implements C17642l<l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14552a f127550a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16320n<Boolean> f127551b;

        C3144a(C14552a aVar, C16320n<? super Boolean> nVar) {
            this.f127550a = aVar;
            this.f127551b = nVar;
        }

        public final void a(l lVar) {
            C17542s.j(lVar, "state");
            C14619a.C3153a a10 = this.f127550a.f127549b.a(lVar);
            if (a10 instanceof C14619a.C3153a.b) {
                return;
            }
            if (a10 instanceof C14619a.C3153a.c) {
                e.a(this.f127551b, Boolean.TRUE);
            } else if (a10 instanceof C14619a.C3153a.C3154a) {
                C14552a aVar = this.f127550a;
                C14619a.C3153a.C3154a aVar2 = (C14619a.C3153a.C3154a) a10;
                Throwable b10 = aVar2.b();
                qv.e eVar = qv.e.WARN;
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
                        String a11 = C11818a.a(aVar2.a(), b10);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, b10, str3);
                    str = str3;
                    str2 = str4;
                }
                e.a(this.f127551b, Boolean.FALSE);
            } else {
                throw new t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iD.a$b */
    static final class b implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14552a f127552a;

        b(C14552a aVar) {
            this.f127552a = aVar;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                C14552a aVar = this.f127552a;
                qv.e eVar = qv.e.DEBUG;
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
                        String a10 = C11818a.a((String) null, th2);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, th2, str3);
                    str = str3;
                    str2 = str4;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public C14552a(C14029a aVar, C14619a aVar2) {
        C17542s.j(aVar, "editProfileRepository");
        C17542s.j(aVar2, "profileStateToResult");
        this.f127548a = aVar;
        this.f127549b = aVar2;
    }

    public Object a(Map<String, String> map, C17164e<? super Boolean> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        this.f127548a.u(map, new C3144a(this, pVar));
        pVar.K(new b(this));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }
}
