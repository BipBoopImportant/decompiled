package gw;

import HJ.C15854t;
import Il.e;
import XH.t;
import com.sugarcube.core.logger.DslKt;
import cw.d;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\rH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Lgw/b;", "Lgp/b;", "Lgw/d;", "localSource", "Lcw/d;", "messageCenterRepository", "<init>", "(Lgw/d;Lcw/d;)V", "LIl/e;", "param", "LXH/N;", "c", "(LIl/e;)V", "", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Lgw/d;", "Lcw/d;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final d f73468a;

    /* renamed from: b  reason: collision with root package name */
    private final d f73469b;

    /* renamed from: c  reason: collision with root package name */
    private final C11346e f73470c = C11346e.CLEAR_LOCAL_SOURCE_ON_MARKET_CHANGE;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73471a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Il.b[] r0 = Il.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Il.b r1 = Il.b.REGION_CHANGED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Il.b r1 = Il.b.LANGUAGE_CHANGED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Il.b r1 = Il.b.NO_CHANGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f73471a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.b.a.<clinit>():void");
        }
    }

    public b(d dVar, d dVar2) {
        C17542s.j(dVar, "localSource");
        C17542s.j(dVar2, "messageCenterRepository");
        this.f73468a = dVar;
        this.f73469b = dVar2;
    }

    private final void c(e eVar) {
        char c10;
        String str;
        e eVar2 = eVar;
        int i10 = a.f73471a[eVar.a().ordinal()];
        String str2 = DslKt.INDICATOR_BACKGROUND;
        Class<b> cls = b.class;
        if (i10 == 1) {
            String str3 = str2;
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar3, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a("Clear the local source values: " + eVar2, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                if (str5 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    c10 = '$';
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    c10 = '$';
                }
                char c11 = c10;
                bVar.a(eVar3, str5, false, (Throwable) null, str4);
                eVar2 = eVar;
            }
            this.f73468a.f();
            this.f73468a.i();
            this.f73469b.invalidate();
        } else if (i10 == 2) {
            qv.e eVar4 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar4, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a("Force refresh messages by resetting local source: " + eVar2, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    str = str2;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str = str2;
                }
                String str8 = str7;
                bVar2.a(eVar4, str8, false, (Throwable) null, str6);
                str7 = str8;
                str2 = str;
            }
            this.f73468a.d();
            this.f73469b.invalidate();
        } else if (i10 != 3) {
            throw new t();
        }
    }

    public C11346e a() {
        return this.f73470c;
    }

    public Object b(Object obj, C17164e<? super Boolean> eVar) {
        if (obj instanceof e) {
            c((e) obj);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected task parameter: " + obj);
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
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
                bVar.a(eVar2, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
        }
        return kotlin.coroutines.jvm.internal.b.a(true);
    }
}
