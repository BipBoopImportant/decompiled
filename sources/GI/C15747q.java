package GI;

import DI.C15535F;
import DI.C15555b;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15566m;
import DI.C15573t;
import DI.C15574u;
import DI.a0;
import DI.h0;
import DI.i0;
import DI.n0;
import DI.s0;
import EI.C15649h;
import LI.C16015b;
import XH.C16807N;
import cJ.C17069f;
import d9.M;
import gJ.C17282m;
import gJ.C17284o;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import nI.C17631a;
import nI.C17642l;
import nJ.C17649d;
import nJ.C17656k;
import nJ.C17657l;
import tJ.C17987g;
import tJ.C17989i;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.C18141v;
import uJ.y0;
import vJ.g;

/* renamed from: GI.q  reason: case insensitive filesystem */
public class C15747q extends C15740j {

    /* renamed from: i  reason: collision with root package name */
    private final y0 f134628i;

    /* renamed from: j  reason: collision with root package name */
    private final C17656k f134629j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C17989i<Set<C17069f>> f134630k;

    /* renamed from: l  reason: collision with root package name */
    private final C15649h f134631l;

    /* renamed from: GI.q$a */
    private class a extends C17657l {

        /* renamed from: b  reason: collision with root package name */
        private final C17987g<C17069f, Collection<? extends h0>> f134632b;

        /* renamed from: c  reason: collision with root package name */
        private final C17987g<C17069f, Collection<? extends a0>> f134633c;

        /* renamed from: d  reason: collision with root package name */
        private final C17989i<Collection<C15566m>> f134634d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15747q f134635e;

        /* renamed from: GI.q$a$a  reason: collision with other inner class name */
        class C3316a implements C17642l<C17069f, Collection<? extends h0>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15747q f134636a;

            C3316a(C15747q qVar) {
                this.f134636a = qVar;
            }

            /* renamed from: a */
            public Collection<? extends h0> invoke(C17069f fVar) {
                return a.this.m(fVar);
            }
        }

        /* renamed from: GI.q$a$b */
        class b implements C17642l<C17069f, Collection<? extends a0>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15747q f134638a;

            b(C15747q qVar) {
                this.f134638a = qVar;
            }

            /* renamed from: a */
            public Collection<? extends a0> invoke(C17069f fVar) {
                return a.this.n(fVar);
            }
        }

        /* renamed from: GI.q$a$c */
        class c implements C17631a<Collection<C15566m>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15747q f134640a;

            c(C15747q qVar) {
                this.f134640a = qVar;
            }

            /* renamed from: a */
            public Collection<C15566m> invoke() {
                return a.this.l();
            }
        }

        /* renamed from: GI.q$a$d */
        class d extends C17282m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Set f134642a;

            d(Set set) {
                this.f134642a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public void a(C15555b bVar) {
                if (bVar == null) {
                    f(0);
                }
                C17284o.K(bVar, (C17642l<C15555b, C16807N>) null);
                this.f134642a.add(bVar);
            }

            /* access modifiers changed from: protected */
            public void e(C15555b bVar, C15555b bVar2) {
                if (bVar == null) {
                    f(1);
                }
                if (bVar2 == null) {
                    f(2);
                }
            }
        }

        public a(C15747q qVar, C17994n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f134635e = qVar;
            this.f134632b = nVar.g(new C3316a(qVar));
            this.f134633c = nVar.g(new b(qVar));
            this.f134634d = nVar.d(new c(qVar));
        }

        private static /* synthetic */ void h(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (!(i10 == 3 || i10 == 7 || i10 == 9 || i10 == 12)) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i10 == 3 || i10 == 7 || i10 == 9 || i10 == 12)) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
            }
            i11 = 2;
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i10 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i10 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i10 != 12) {
                switch (i10) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i10 == 3 || i10 == 7 || i10 == 9 || i10 == 12)) {
                switch (i10) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th2 = new IllegalArgumentException(format);
                        break;
                }
            }
            th2 = new IllegalStateException(format);
            throw th2;
        }

        /* access modifiers changed from: private */
        public Collection<C15566m> l() {
            HashSet hashSet = new HashSet();
            for (C17069f fVar : (Set) this.f134635e.f134630k.invoke()) {
                LI.d dVar = LI.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(d(fVar, dVar));
                hashSet.addAll(b(fVar, dVar));
            }
            return hashSet;
        }

        /* access modifiers changed from: private */
        public Collection<? extends h0> m(C17069f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().d(fVar, LI.d.FOR_NON_TRACKED_SCOPE));
        }

        /* access modifiers changed from: private */
        public Collection<? extends a0> n(C17069f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().b(fVar, LI.d.FOR_NON_TRACKED_SCOPE));
        }

        private C17656k o() {
            C17656k q10 = this.f134635e.k().a().iterator().next().q();
            if (q10 == null) {
                h(9);
            }
            return q10;
        }

        private <D extends C15555b> Collection<? extends D> p(C17069f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C17284o.f143311f.v(fVar, collection, Collections.emptySet(), this.f134635e, new d(linkedHashSet));
            return linkedHashSet;
        }

        public Set<C17069f> a() {
            Set<C17069f> set = (Set) this.f134635e.f134630k.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        public Collection<? extends a0> b(C17069f fVar, C16015b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection<? extends a0> invoke = this.f134633c.invoke(fVar);
            if (invoke == null) {
                h(3);
            }
            return invoke;
        }

        public Set<C17069f> c() {
            Set<C17069f> set = (Set) this.f134635e.f134630k.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        public Collection<? extends h0> d(C17069f fVar, C16015b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection<? extends h0> invoke = this.f134632b.invoke(fVar);
            if (invoke == null) {
                h(7);
            }
            return invoke;
        }

        public Set<C17069f> f() {
            Set<C17069f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                h(18);
            }
            return emptySet;
        }

        public Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar) {
            if (dVar == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            Collection<C15566m> collection = (Collection) this.f134634d.invoke();
            if (collection == null) {
                h(15);
            }
            return collection;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C15747q(C17994n nVar, C15558e eVar, C18096U u10, C17069f fVar, C17989i<Set<C17069f>> iVar, C15649h hVar, i0 i0Var) {
        super(nVar, eVar, fVar, i0Var, false);
        if (nVar == null) {
            F0(6);
        }
        if (eVar == null) {
            F0(7);
        }
        if (u10 == null) {
            F0(8);
        }
        if (fVar == null) {
            F0(9);
        }
        if (iVar == null) {
            F0(10);
        }
        if (hVar == null) {
            F0(11);
        }
        if (i0Var == null) {
            F0(12);
        }
        this.f134631l = hVar;
        this.f134628i = new C18141v(this, Collections.emptyList(), Collections.singleton(u10), nVar);
        this.f134629j = new a(this, nVar);
        this.f134630k = iVar;
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    public static C15747q L0(C17994n nVar, C15558e eVar, C17069f fVar, C17989i<Set<C17069f>> iVar, C15649h hVar, i0 i0Var) {
        if (nVar == null) {
            F0(0);
        }
        if (eVar == null) {
            F0(1);
        }
        if (fVar == null) {
            F0(2);
        }
        if (iVar == null) {
            F0(3);
        }
        if (hVar == null) {
            F0(4);
        }
        if (i0Var == null) {
            F0(5);
        }
        return new C15747q(nVar, eVar, eVar.r(), fVar, iVar, hVar, i0Var);
    }

    public C15557d F() {
        return null;
    }

    public boolean I0() {
        return false;
    }

    public s0<C18113f0> V() {
        return null;
    }

    public boolean Y() {
        return false;
    }

    public boolean b0() {
        return false;
    }

    public boolean g0() {
        return false;
    }

    public C15649h getAnnotations() {
        C15649h hVar = this.f134631l;
        if (hVar == null) {
            F0(21);
        }
        return hVar;
    }

    public C15574u getVisibility() {
        C15574u uVar = C15573t.f133853e;
        if (uVar == null) {
            F0(20);
        }
        return uVar;
    }

    public C15559f h() {
        C15559f fVar = C15559f.ENUM_ENTRY;
        if (fVar == null) {
            F0(18);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    public C17656k j0(g gVar) {
        if (gVar == null) {
            F0(13);
        }
        C17656k kVar = this.f134629j;
        if (kVar == null) {
            F0(14);
        }
        return kVar;
    }

    public y0 k() {
        y0 y0Var = this.f134628i;
        if (y0Var == null) {
            F0(17);
        }
        return y0Var;
    }

    public Collection<C15557d> l() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(16);
        }
        return emptyList;
    }

    public Collection<C15558e> m() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(23);
        }
        return emptyList;
    }

    public boolean m0() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public C17656k o0() {
        C17656k.b bVar = C17656k.b.f144864b;
        if (bVar == null) {
            F0(15);
        }
        return bVar;
    }

    public C15558e p0() {
        return null;
    }

    public List<n0> t() {
        List<n0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            F0(22);
        }
        return emptyList;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    public C15535F u() {
        C15535F f10 = C15535F.FINAL;
        if (f10 == null) {
            F0(19);
        }
        return f10;
    }

    public boolean v() {
        return false;
    }
}
