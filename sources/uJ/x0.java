package uJ;

import EJ.C15671l;
import XH.C16807N;
import fI.C17221b;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import yJ.C18735d;
import yJ.C18740i;
import yJ.C18741j;
import yJ.p;

public class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f147938a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f147939b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f147940c;

    /* renamed from: d  reason: collision with root package name */
    private final p f147941d;

    /* renamed from: e  reason: collision with root package name */
    private final C18136r f147942e;

    /* renamed from: f  reason: collision with root package name */
    private final C18138s f147943f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f147944g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f147945h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayDeque<C18741j> f147946i;

    /* renamed from: j  reason: collision with root package name */
    private Set<C18741j> f147947j;

    public interface a {

        /* renamed from: uJ.x0$a$a  reason: collision with other inner class name */
        public static final class C4284a implements a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f147948a;

            public void a(C17631a<Boolean> aVar) {
                C17542s.j(aVar, "block");
                if (!this.f147948a) {
                    this.f147948a = aVar.invoke().booleanValue();
                }
            }

            public final boolean b() {
                return this.f147948a;
            }
        }

        void a(C17631a<Boolean> aVar);
    }

    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public static abstract class c {

        public static abstract class a extends c {
            public a() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f147949a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public C18741j a(x0 x0Var, C18740i iVar) {
                C17542s.j(x0Var, "state");
                C17542s.j(iVar, "type");
                return x0Var.j().p(iVar);
            }
        }

        /* renamed from: uJ.x0$c$c  reason: collision with other inner class name */
        public static final class C4285c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C4285c f147950a = new C4285c();

            private C4285c() {
                super((DefaultConstructorMarker) null);
            }

            public /* bridge */ /* synthetic */ C18741j a(x0 x0Var, C18740i iVar) {
                return (C18741j) b(x0Var, iVar);
            }

            public Void b(x0 x0Var, C18740i iVar) {
                C17542s.j(x0Var, "state");
                C17542s.j(iVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final d f147951a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public C18741j a(x0 x0Var, C18740i iVar) {
                C17542s.j(x0Var, "state");
                C17542s.j(iVar, "type");
                return x0Var.j().z(iVar);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract C18741j a(x0 x0Var, C18740i iVar);

        private c() {
        }
    }

    public x0(boolean z10, boolean z11, boolean z12, p pVar, C18136r rVar, C18138s sVar) {
        C17542s.j(pVar, "typeSystemContext");
        C17542s.j(rVar, "kotlinTypePreparator");
        C17542s.j(sVar, "kotlinTypeRefiner");
        this.f147938a = z10;
        this.f147939b = z11;
        this.f147940c = z12;
        this.f147941d = pVar;
        this.f147942e = rVar;
        this.f147943f = sVar;
    }

    public static /* synthetic */ Boolean d(x0 x0Var, C18740i iVar, C18740i iVar2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return x0Var.c(iVar, iVar2, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    public Boolean c(C18740i iVar, C18740i iVar2, boolean z10) {
        C17542s.j(iVar, "subType");
        C17542s.j(iVar2, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque<C18741j> arrayDeque = this.f147946i;
        C17542s.g(arrayDeque);
        arrayDeque.clear();
        Set<C18741j> set = this.f147947j;
        C17542s.g(set);
        set.clear();
        this.f147945h = false;
    }

    public boolean f(C18740i iVar, C18740i iVar2) {
        C17542s.j(iVar, "subType");
        C17542s.j(iVar2, "superType");
        return true;
    }

    public b g(C18741j jVar, C18735d dVar) {
        C17542s.j(jVar, "subType");
        C17542s.j(dVar, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<C18741j> h() {
        return this.f147946i;
    }

    public final Set<C18741j> i() {
        return this.f147947j;
    }

    public final p j() {
        return this.f147941d;
    }

    public final void k() {
        this.f147945h = true;
        if (this.f147946i == null) {
            this.f147946i = new ArrayDeque<>(4);
        }
        if (this.f147947j == null) {
            this.f147947j = C15671l.f134268c.a();
        }
    }

    public final boolean l(C18740i iVar) {
        C17542s.j(iVar, "type");
        return this.f147940c && this.f147941d.x(iVar);
    }

    public final boolean m() {
        return this.f147938a;
    }

    public final boolean n() {
        return this.f147939b;
    }

    public final C18740i o(C18740i iVar) {
        C17542s.j(iVar, "type");
        return this.f147942e.a(iVar);
    }

    public final C18740i p(C18740i iVar) {
        C17542s.j(iVar, "type");
        return this.f147943f.a(iVar);
    }

    public boolean q(C17642l<? super a, C16807N> lVar) {
        C17542s.j(lVar, "block");
        a.C4284a aVar = new a.C4284a();
        lVar.invoke(aVar);
        return aVar.b();
    }
}
