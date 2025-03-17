package VI;

import DI.C15538I;
import DI.C15543N;
import DI.C15558e;
import DI.C15578y;
import DI.i0;
import DI.u0;
import EI.C15644c;
import EI.C15645d;
import EJ.C15660a;
import HJ.C15854t;
import NI.C16097a;
import VI.C16692x;
import XI.C16829b;
import YH.C16877v;
import ZI.c;
import bJ.C17046e;
import cJ.C17065b;
import cJ.C17069f;
import iJ.C17362B;
import iJ.C17363C;
import iJ.C17364D;
import iJ.C17365E;
import iJ.C17367a;
import iJ.C17370d;
import iJ.C17372f;
import iJ.C17373g;
import iJ.C17375i;
import iJ.C17377k;
import iJ.C17378l;
import iJ.C17380n;
import iJ.C17386t;
import iJ.C17387u;
import iJ.C17390x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import qJ.C17819g;
import tJ.C17994n;
import uJ.C18096U;

/* renamed from: VI.h  reason: case insensitive filesystem */
public final class C16676h extends C16672d<C15644c, C17373g<?>> {

    /* renamed from: d  reason: collision with root package name */
    private final C15538I f139362d;

    /* renamed from: e  reason: collision with root package name */
    private final C15543N f139363e;

    /* renamed from: f  reason: collision with root package name */
    private final C17819g f139364f;

    /* renamed from: g  reason: collision with root package name */
    private C17046e f139365g = C17046e.f141178i;

    /* renamed from: VI.h$a */
    private abstract class a implements C16692x.a {

        /* renamed from: VI.h$a$a  reason: collision with other inner class name */
        public static final class C3414a implements C16692x.a {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ C16692x.a f139367a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C16692x.a f139368b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f139369c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17069f f139370d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ArrayList<C15644c> f139371e;

            C3414a(C16692x.a aVar, a aVar2, C17069f fVar, ArrayList<C15644c> arrayList) {
                this.f139368b = aVar;
                this.f139369c = aVar2;
                this.f139370d = fVar;
                this.f139371e = arrayList;
                this.f139367a = aVar;
            }

            public void a() {
                this.f139368b.a();
                this.f139369c.h(this.f139370d, new C17367a((C15644c) C16877v.b1(this.f139371e)));
            }

            public void b(C17069f fVar, Object obj) {
                this.f139367a.b(fVar, obj);
            }

            public void c(C17069f fVar, C17065b bVar, C17069f fVar2) {
                C17542s.j(bVar, "enumClassId");
                C17542s.j(fVar2, "enumEntryName");
                this.f139367a.c(fVar, bVar, fVar2);
            }

            public void d(C17069f fVar, C17372f fVar2) {
                C17542s.j(fVar2, "value");
                this.f139367a.d(fVar, fVar2);
            }

            public C16692x.b e(C17069f fVar) {
                return this.f139367a.e(fVar);
            }

            public C16692x.a f(C17069f fVar, C17065b bVar) {
                C17542s.j(bVar, "classId");
                return this.f139367a.f(fVar, bVar);
            }
        }

        /* renamed from: VI.h$a$b */
        public static final class b implements C16692x.b {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<C17373g<?>> f139372a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C16676h f139373b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17069f f139374c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f139375d;

            /* renamed from: VI.h$a$b$a  reason: collision with other inner class name */
            public static final class C3415a implements C16692x.a {

                /* renamed from: a  reason: collision with root package name */
                private final /* synthetic */ C16692x.a f139376a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C16692x.a f139377b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ b f139378c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ArrayList<C15644c> f139379d;

                C3415a(C16692x.a aVar, b bVar, ArrayList<C15644c> arrayList) {
                    this.f139377b = aVar;
                    this.f139378c = bVar;
                    this.f139379d = arrayList;
                    this.f139376a = aVar;
                }

                public void a() {
                    this.f139377b.a();
                    this.f139378c.f139372a.add(new C17367a((C15644c) C16877v.b1(this.f139379d)));
                }

                public void b(C17069f fVar, Object obj) {
                    this.f139376a.b(fVar, obj);
                }

                public void c(C17069f fVar, C17065b bVar, C17069f fVar2) {
                    C17542s.j(bVar, "enumClassId");
                    C17542s.j(fVar2, "enumEntryName");
                    this.f139376a.c(fVar, bVar, fVar2);
                }

                public void d(C17069f fVar, C17372f fVar2) {
                    C17542s.j(fVar2, "value");
                    this.f139376a.d(fVar, fVar2);
                }

                public C16692x.b e(C17069f fVar) {
                    return this.f139376a.e(fVar);
                }

                public C16692x.a f(C17069f fVar, C17065b bVar) {
                    C17542s.j(bVar, "classId");
                    return this.f139376a.f(fVar, bVar);
                }
            }

            b(C16676h hVar, C17069f fVar, a aVar) {
                this.f139373b = hVar;
                this.f139374c = fVar;
                this.f139375d = aVar;
            }

            public void a() {
                this.f139375d.g(this.f139374c, this.f139372a);
            }

            public C16692x.a b(C17065b bVar) {
                C17542s.j(bVar, "classId");
                ArrayList arrayList = new ArrayList();
                C16676h hVar = this.f139373b;
                i0 i0Var = i0.f133841a;
                C17542s.i(i0Var, "NO_SOURCE");
                C16692x.a x10 = hVar.x(bVar, i0Var, arrayList);
                C17542s.g(x10);
                return new C3415a(x10, this, arrayList);
            }

            public void c(C17372f fVar) {
                C17542s.j(fVar, "value");
                this.f139372a.add(new C17386t(fVar));
            }

            public void d(C17065b bVar, C17069f fVar) {
                C17542s.j(bVar, "enumClassId");
                C17542s.j(fVar, "enumEntryName");
                this.f139372a.add(new C17377k(bVar, fVar));
            }

            public void e(Object obj) {
                this.f139372a.add(this.f139373b.O(this.f139374c, obj));
            }
        }

        public a() {
        }

        public void b(C17069f fVar, Object obj) {
            h(fVar, C16676h.this.O(fVar, obj));
        }

        public void c(C17069f fVar, C17065b bVar, C17069f fVar2) {
            C17542s.j(bVar, "enumClassId");
            C17542s.j(fVar2, "enumEntryName");
            h(fVar, new C17377k(bVar, fVar2));
        }

        public void d(C17069f fVar, C17372f fVar2) {
            C17542s.j(fVar2, "value");
            h(fVar, new C17386t(fVar2));
        }

        public C16692x.b e(C17069f fVar) {
            return new b(C16676h.this, fVar, this);
        }

        public C16692x.a f(C17069f fVar, C17065b bVar) {
            C17542s.j(bVar, "classId");
            ArrayList arrayList = new ArrayList();
            C16676h hVar = C16676h.this;
            i0 i0Var = i0.f133841a;
            C17542s.i(i0Var, "NO_SOURCE");
            C16692x.a x10 = hVar.x(bVar, i0Var, arrayList);
            C17542s.g(x10);
            return new C3414a(x10, this, fVar, arrayList);
        }

        public abstract void g(C17069f fVar, ArrayList<C17373g<?>> arrayList);

        public abstract void h(C17069f fVar, C17373g<?> gVar);
    }

    /* renamed from: VI.h$b */
    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<C17069f, C17373g<?>> f139380b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16676h f139381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15558e f139382d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17065b f139383e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<C15644c> f139384f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i0 f139385g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16676h hVar, C15558e eVar, C17065b bVar, List<C15644c> list, i0 i0Var) {
            super();
            this.f139381c = hVar;
            this.f139382d = eVar;
            this.f139383e = bVar;
            this.f139384f = list;
            this.f139385g = i0Var;
        }

        public void a() {
            if (!this.f139381c.F(this.f139383e, this.f139380b) && !this.f139381c.w(this.f139383e)) {
                this.f139384f.add(new C15645d(this.f139382d.r(), this.f139380b, this.f139385g));
            }
        }

        public void g(C17069f fVar, ArrayList<C17373g<?>> arrayList) {
            C17542s.j(arrayList, "elements");
            if (fVar != null) {
                u0 b10 = C16097a.b(fVar, this.f139382d);
                if (b10 != null) {
                    HashMap<C17069f, C17373g<?>> hashMap = this.f139380b;
                    C17375i iVar = C17375i.f143504a;
                    List<T> c10 = C15660a.c(arrayList);
                    C18096U type = b10.getType();
                    C17542s.i(type, "getType(...)");
                    hashMap.put(fVar, iVar.c(c10, type));
                } else if (this.f139381c.w(this.f139383e) && C17542s.e(fVar.b(), "value")) {
                    ArrayList<C17367a> arrayList2 = new ArrayList<>();
                    for (T next : arrayList) {
                        if (next instanceof C17367a) {
                            arrayList2.add(next);
                        }
                    }
                    Collection collection = this.f139384f;
                    for (C17367a b11 : arrayList2) {
                        collection.add((C15644c) b11.b());
                    }
                }
            }
        }

        public void h(C17069f fVar, C17373g<?> gVar) {
            C17542s.j(gVar, "value");
            if (fVar != null) {
                this.f139380b.put(fVar, gVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16676h(C15538I i10, C15543N n10, C17994n nVar, C16690v vVar) {
        super(nVar, vVar);
        C17542s.j(i10, "module");
        C17542s.j(n10, "notFoundClasses");
        C17542s.j(nVar, "storageManager");
        C17542s.j(vVar, "kotlinClassFinder");
        this.f139362d = i10;
        this.f139363e = n10;
        this.f139364f = new C17819g(i10, n10);
    }

    /* access modifiers changed from: private */
    public final C17373g<?> O(C17069f fVar, Object obj) {
        C17373g<?> e10 = C17375i.f143504a.e(obj, this.f139362d);
        if (e10 != null) {
            return e10;
        }
        C17378l.a aVar = C17378l.f143507b;
        return aVar.a("Unsupported annotation argument: " + fVar);
    }

    private final C15558e R(C17065b bVar) {
        return C15578y.d(this.f139362d, bVar, this.f139363e);
    }

    /* renamed from: P */
    public C15644c i(C16829b bVar, c cVar) {
        C17542s.j(bVar, "proto");
        C17542s.j(cVar, "nameResolver");
        return this.f139364f.a(bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public C17373g<?> I(String str, Object obj) {
        C17542s.j(str, "desc");
        C17542s.j(obj, "initializer");
        boolean z10 = false;
        if (C15854t.d0("ZBCS", str, false, 2, (Object) null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && str.equals("Z")) {
                            if (intValue != 0) {
                                z10 = true;
                            }
                            obj = Boolean.valueOf(z10);
                        }
                    } else if (str.equals("S")) {
                        obj = Short.valueOf((short) intValue);
                    }
                } else if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
            } else if (str.equals("B")) {
                obj = Byte.valueOf((byte) intValue);
            }
            throw new AssertionError(str);
        }
        return C17375i.f143504a.e(obj, this.f139362d);
    }

    public void S(C17046e eVar) {
        C17542s.j(eVar, "<set-?>");
        this.f139365g = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public C17373g<?> M(C17373g<?> gVar) {
        C17373g<?> d10;
        C17542s.j(gVar, "constant");
        if (gVar instanceof C17370d) {
            d10 = new C17362B(((Number) ((C17370d) gVar).b()).byteValue());
        } else if (gVar instanceof C17390x) {
            d10 = new C17365E(((Number) ((C17390x) gVar).b()).shortValue());
        } else if (gVar instanceof C17380n) {
            d10 = new C17363C(((Number) ((C17380n) gVar).b()).intValue());
        } else if (!(gVar instanceof C17387u)) {
            return gVar;
        } else {
            d10 = new C17364D(((Number) ((C17387u) gVar).b()).longValue());
        }
        return d10;
    }

    public C17046e u() {
        return this.f139365g;
    }

    /* access modifiers changed from: protected */
    public C16692x.a x(C17065b bVar, i0 i0Var, List<C15644c> list) {
        C17542s.j(bVar, "annotationClassId");
        C17542s.j(i0Var, "source");
        C17542s.j(list, "result");
        return new b(this, R(bVar), bVar, list, i0Var);
    }
}
