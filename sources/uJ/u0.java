package uJ;

import BJ.C15468c;
import BJ.C15470e;
import BJ.z;
import EJ.C15660a;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import oI.C17693a;

public final class u0 extends C15470e<s0<?>, s0<?>> implements Iterable<s0<?>>, C17693a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f147932b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final u0 f147933c = new u0((List<? extends s0<?>>) C16877v.n());

    public static final class a extends z<s0<?>, s0<?>> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public int c(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, C17642l<? super String, Integer> lVar) {
            int i10;
            C17542s.j(concurrentHashMap, "<this>");
            C17542s.j(str, "key");
            C17542s.j(lVar, "compute");
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(str);
                    if (num2 != null) {
                        i10 = num2.intValue();
                    } else {
                        Integer invoke = lVar.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(invoke.intValue()));
                        i10 = invoke.intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        public final u0 j(List<? extends s0<?>> list) {
            C17542s.j(list, "attributes");
            return list.isEmpty() ? k() : new u0(list, (DefaultConstructorMarker) null);
        }

        public final u0 k() {
            return u0.f147933c;
        }

        private a() {
        }
    }

    public /* synthetic */ u0(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends s0<?>>) list);
    }

    public final u0 A(s0<?> s0Var) {
        C17542s.j(s0Var, "attribute");
        if (t(s0Var)) {
            return this;
        }
        if (isEmpty()) {
            return new u0(s0Var);
        }
        return f147932b.j(C16877v.W0(C16877v.t1(this), s0Var));
    }

    public final u0 B(s0<?> s0Var) {
        C17542s.j(s0Var, "attribute");
        if (isEmpty()) {
            return this;
        }
        C15468c b10 = b();
        ArrayList arrayList = new ArrayList();
        for (Object next : b10) {
            if (!C17542s.e((s0) next, s0Var)) {
                arrayList.add(next);
            }
        }
        return arrayList.size() == b().a() ? this : f147932b.j(arrayList);
    }

    /* access modifiers changed from: protected */
    public z<s0<?>, s0<?>> i() {
        return f147932b;
    }

    public final u0 s(u0 u0Var) {
        C17542s.j(u0Var, "other");
        if (isEmpty() && u0Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : f147932b.h()) {
            int intValue2 = intValue.intValue();
            s0 s0Var = (s0) b().get(intValue2);
            s0 s0Var2 = (s0) u0Var.b().get(intValue2);
            C15660a.a(arrayList, s0Var == null ? s0Var2 != null ? s0Var2.a(s0Var) : null : s0Var.a(s0Var2));
        }
        return f147932b.j(arrayList);
    }

    public final boolean t(s0<?> s0Var) {
        C17542s.j(s0Var, "attribute");
        return b().get(f147932b.f(s0Var.b())) != null;
    }

    public final u0 x(u0 u0Var) {
        C17542s.j(u0Var, "other");
        if (isEmpty() && u0Var.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number intValue : f147932b.h()) {
            int intValue2 = intValue.intValue();
            s0 s0Var = (s0) b().get(intValue2);
            s0 s0Var2 = (s0) u0Var.b().get(intValue2);
            C15660a.a(arrayList, s0Var == null ? s0Var2 != null ? s0Var2.c(s0Var) : null : s0Var.c(s0Var2));
        }
        return f147932b.j(arrayList);
    }

    private u0(List<? extends s0<?>> list) {
        for (s0 s0Var : list) {
            m(s0Var.b(), s0Var);
        }
    }

    private u0(s0<?> s0Var) {
        this((List<? extends s0<?>>) C16877v.e(s0Var));
    }
}
