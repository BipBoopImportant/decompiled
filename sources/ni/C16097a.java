package NI;

import DI.C15555b;
import DI.C15557d;
import DI.C15558e;
import DI.u0;
import XH.C16807N;
import cJ.C17069f;
import gJ.C17282m;
import gJ.C17284o;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import nI.C17642l;
import qJ.C17835w;

/* renamed from: NI.a  reason: case insensitive filesystem */
public final class C16097a {

    /* renamed from: NI.a$a  reason: collision with other inner class name */
    static class C3354a extends C17282m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17835w f136538a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f136539b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f136540c;

        /* renamed from: NI.a$a$a  reason: collision with other inner class name */
        class C3355a implements C17642l<C15555b, C16807N> {
            C3355a() {
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
            }

            /* renamed from: b */
            public C16807N invoke(C15555b bVar) {
                if (bVar == null) {
                    a(0);
                }
                C3354a.this.f136538a.a(bVar);
                return C16807N.f139792a;
            }
        }

        C3354a(C17835w wVar, Set set, boolean z10) {
            this.f136538a = wVar;
            this.f136539b = set;
            this.f136540c = z10;
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a(C15555b bVar) {
            if (bVar == null) {
                f(0);
            }
            C17284o.K(bVar, new C3355a());
            this.f136539b.add(bVar);
        }

        public void d(C15555b bVar, Collection<? extends C15555b> collection) {
            if (bVar == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f136540c || bVar.h() == C15555b.a.FAKE_OVERRIDE) {
                super.d(bVar, collection);
            }
        }

        public void e(C15555b bVar, C15555b bVar2) {
            if (bVar == null) {
                f(1);
            }
            if (bVar2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 != 18 ? 3 : 2)];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        throw (i10 != 18 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static u0 b(C17069f fVar, C15558e eVar) {
        if (fVar == null) {
            a(19);
        }
        if (eVar == null) {
            a(20);
        }
        Collection<C15557d> l10 = eVar.l();
        if (l10.size() != 1) {
            return null;
        }
        for (u0 next : l10.iterator().next().j()) {
            if (next.getName().equals(fVar)) {
                return next;
            }
        }
        return null;
    }

    private static <D extends C15555b> Collection<D> c(C17069f fVar, Collection<D> collection, Collection<D> collection2, C15558e eVar, C17835w wVar, C17284o oVar, boolean z10) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (eVar == null) {
            a(15);
        }
        if (wVar == null) {
            a(16);
        }
        if (oVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        oVar.v(fVar, collection, collection2, eVar, new C3354a(wVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static <D extends C15555b> Collection<D> d(C17069f fVar, Collection<D> collection, Collection<D> collection2, C15558e eVar, C17835w wVar, C17284o oVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        if (wVar == null) {
            a(4);
        }
        if (oVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, eVar, wVar, oVar, false);
    }

    public static <D extends C15555b> Collection<D> e(C17069f fVar, Collection<D> collection, Collection<D> collection2, C15558e eVar, C17835w wVar, C17284o oVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (eVar == null) {
            a(9);
        }
        if (wVar == null) {
            a(10);
        }
        if (oVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, eVar, wVar, oVar, true);
    }
}
