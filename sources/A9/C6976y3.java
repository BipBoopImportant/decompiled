package a9;

import D8.c;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import com.contentsquare.android.ComposeModule;
import com.contentsquare.android.ErrorAnalysisModule;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import v8.C8902a;
import w8.C8933a;
import x8.C8958b;

/* renamed from: a9.y3  reason: case insensitive filesystem */
public final class C6976y3 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f42971a = new c("ModuleStarter");

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f42972b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final C16824o f42973c = C16825p.b(a.f42975c);

    /* renamed from: d  reason: collision with root package name */
    public static final C16824o f42974d = C16825p.b(b.f42976c);

    /* renamed from: a9.y3$a */
    public static final class a extends C17544u implements C17631a<C8933a> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f42975c = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            c cVar = C6976y3.f42971a;
            C8933a aVar = null;
            try {
                aVar = (C8933a) ComposeModule.class.asSubclass(C8933a.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Exception e10) {
                c cVar2 = C6976y3.f42971a;
                cVar2.f("Loading module failed: " + e10);
            }
            c cVar3 = C6976y3.f42971a;
            cVar3.f(aVar + " loaded and started");
            return aVar;
        }
    }

    /* renamed from: a9.y3$b */
    public static final class b extends C17544u implements C17631a<C8902a> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f42976c = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            C8902a aVar;
            c cVar = C6976y3.f42971a;
            try {
                Class<?> cls = Class.forName("io.heap.core.Heap");
                C17542s.i(cls, "heapClass");
                aVar = new C8902a(cls, E3.f41979c);
            } catch (Exception e10) {
                c cVar2 = C6976y3.f42971a;
                cVar2.f("Loading Heap module failed: " + e10);
                aVar = null;
            }
            if (aVar == null) {
                return null;
            }
            c cVar3 = C6976y3.f42971a;
            cVar3.f("Heap Detected and loaded: " + aVar);
            return aVar;
        }
    }

    public static final C8933a a() {
        return (C8933a) f42973c.getValue();
    }

    public static final void b(Context context) {
        v8.c cVar;
        C17542s.j(context, "context");
        C17542s.j(context, "context");
        Iterator it = f42972b.iterator();
        while (it.hasNext()) {
            v8.c cVar2 = (v8.c) it.next();
            cVar2.f(context);
            c cVar3 = f42971a;
            cVar3.f(cVar2 + " stopped");
        }
        f42972b.clear();
        try {
            cVar = (v8.c) ErrorAnalysisModule.class.asSubclass(v8.c.class).getConstructor(new Class[]{C8958b.class}).newInstance(new Object[]{new P8.a()});
        } catch (Exception e10) {
            c cVar4 = f42971a;
            cVar4.f("Loading module failed: " + e10);
            cVar = null;
        }
        if (cVar != null) {
            cVar.b(context);
            f42972b.add(cVar);
            c cVar5 = f42971a;
            cVar5.f(cVar + " loaded and started");
        }
    }
}
