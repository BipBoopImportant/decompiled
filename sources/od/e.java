package Od;

import HJ.C15854t;
import IE.f;
import Od.d;
import Od.f;
import XH.t;
import com.optimizely.ab.config.Experiment;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.config.Variation;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LOd/e;", "LOd/d;", "LOd/f;", "analyticsMapper", "<init>", "(LOd/f;)V", "LIE/f;", "decision", "", "b", "(LIE/f;)Z", "Lcom/optimizely/ab/d;", "userContext", "c", "(Lcom/optimizely/ab/d;LIE/f;)Z", "optimizelyUserContext", "LNd/a;", "abTest", "", "LIE/e;", "optimizelyDecideOption", "LOd/d$a;", "a", "(Lcom/optimizely/ab/d;LNd/a;Ljava/util/List;)LOd/d$a;", "LOd/f;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62147b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f62148a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOd/e$a;", "", "<init>", "()V", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(f fVar) {
        C17542s.j(fVar, "analyticsMapper");
        this.f62148a = fVar;
    }

    private final boolean b(f fVar) {
        Iterator it;
        Class<e> cls = e.class;
        if (!fVar.b()) {
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
                    String a10 = C11818a.a("Experiment with flag '" + fVar.c() + "' is not enabled", (Throwable) null);
                    if (a10 == null) {
                        return false;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, (Throwable) null, str);
                str2 = str3;
            }
            return false;
        } else if (fVar.h() != null) {
            return true;
        } else {
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str4 == null) {
                    String a11 = C11818a.a("Experiment with flag '" + fVar.c() + "' had no variation key", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str4 = C11820c.a(a11);
                }
                if (str5 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str5, false, (Throwable) null, str4);
            }
            List<String> d10 = fVar.d();
            C17542s.i(d10, "getReasons(...)");
            Iterator it2 = d10.iterator();
            while (it2.hasNext()) {
                String str6 = (String) it2.next();
                qv.e eVar3 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str7 == null) {
                        C17542s.g(str6);
                        String a12 = C11818a.a(str6, (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str7 = C11820c.a(a12);
                    }
                    if (str8 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        it = it2;
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                    } else {
                        it = it2;
                    }
                    bVar3.a(eVar3, str8, false, (Throwable) null, str7);
                    it2 = it;
                }
                it2 = it2;
            }
            return false;
        }
    }

    private final boolean c(com.optimizely.ab.d dVar, f fVar) {
        Experiment experiment;
        Map<String, Variation> variationKeyToVariationMap;
        ProjectConfig projectConfig = dVar.e().getProjectConfig();
        Map<String, Experiment> experimentKeyMapping = projectConfig != null ? projectConfig.getExperimentKeyMapping() : null;
        boolean z10 = ((experimentKeyMapping == null || (experiment = experimentKeyMapping.get(fVar.e())) == null || (variationKeyToVariationMap = experiment.getVariationKeyToVariationMap()) == null) ? null : variationKeyToVariationMap.get("off")) != null;
        if (z10) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("It is not allowed to have the variation key 'off' in a rule since it's always gonna return a disabled decision if evaluated to.");
            qv.e eVar = qv.e.ERROR;
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = e.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
        }
        return !z10;
    }

    public d.a a(com.optimizely.ab.d dVar, Nd.a aVar, List<? extends IE.e> list) {
        C17542s.j(aVar, "abTest");
        C17542s.j(list, "optimizelyDecideOption");
        if (dVar == null) {
            return d.a.b.C1053d.f62145a;
        }
        f b10 = dVar.b(aVar.a(), list);
        C17542s.g(b10);
        if (!b(b10)) {
            return new d.a.b.c(b10);
        }
        if (!c(dVar, b10)) {
            return d.a.b.C1052b.f62143a;
        }
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Found decision with variationKey '" + b10.h() + "', enabled: " + b10.b(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = e.class.getName();
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
        f.a a11 = this.f62148a.a(b10);
        if (a11 instanceof f.a.b) {
            f.a.b bVar2 = (f.a.b) a11;
            return new d.a.c(new d.a.C1050a(bVar2.a(), bVar2.b(), bVar2.c()));
        } else if (a11 instanceof f.a.C1054a) {
            return new d.a.b.C1051a(((f.a.C1054a) a11).a());
        } else {
            throw new t();
        }
    }
}
