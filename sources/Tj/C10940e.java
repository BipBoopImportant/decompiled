package Tj;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import rz.C15031y;
import rz.I;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LTj/e;", "LTj/d;", "LjB/b;", "shoppingListRepo", "<init>", "(LjB/b;)V", "Lrz/I;", "", "", "setOfKeys", "LXH/x;", "LTj/f;", "c", "(Lrz/I;Ljava/util/Set;)Ljava/lang/Object;", "LTJ/g;", "scanAndGoProductFlow", "a", "(LTJ/g;)LTJ/g;", "LjB/b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tj.e  reason: case insensitive filesystem */
public final class C10940e implements C10939d {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f87483a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LXH/x;", "Lrz/I;", "productFlow", "", "", "setOfKeys", "LTj/f;", "<anonymous>", "(LXH/x;Ljava/util/Set;)LXH/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.AddToFavouritesUseCaseImpl$invoke$1", f = "AddToFavouritesUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tj.e$a */
    static final class a extends l implements q<x<? extends I>, Set<? extends String>, C17164e<? super x<? extends C10941f>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87484c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f87485d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f87486e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10940e f87487f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tj.e$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1820a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f87488a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    rz.y[] r0 = rz.C15031y.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    rz.y r1 = rz.C15031y.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    rz.y r1 = rz.C15031y.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    rz.y r1 = rz.C15031y.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    rz.y r1 = rz.C15031y.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    rz.y r1 = rz.C15031y.COMBINATION     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f87488a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Tj.C10940e.a.C1820a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C10940e eVar, C17164e<? super a> eVar2) {
            super(3, eVar2);
            this.f87487f = eVar;
        }

        public final Object i(Object obj, Set<String> set, C17164e<? super x<C10941f>> eVar) {
            a aVar = new a(this.f87487f, eVar);
            aVar.f87485d = x.a(obj);
            aVar.f87486e = set;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((x) obj).j(), (Set) obj2, (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C17187b.f();
            if (this.f87484c == 0) {
                y.b(obj);
                Object j10 = ((x) this.f87485d).j();
                Set set = (Set) this.f87486e;
                C10940e eVar = this.f87487f;
                Throwable e10 = x.e(j10);
                if (e10 != null) {
                    return x.a(x.b(y.a(e10)));
                }
                I i10 = (I) j10;
                C15031y p10 = i10.p();
                int i11 = C1820a.f87488a[p10.ordinal()];
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    obj2 = eVar.c(i10, set);
                } else if (i11 == 4 || i11 == 5) {
                    obj2 = x.b(y.a(new IllegalStateException("Pickup type: " + p10 + " will not work for favourites")));
                } else {
                    throw new t();
                }
                return x.a(obj2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C10940e(C14613b bVar) {
        C17542s.j(bVar, "shoppingListRepo");
        this.f87483a = bVar;
    }

    /* access modifiers changed from: private */
    public final Object c(I i10, Set<String> set) {
        if (!i10.k().j()) {
            x.a aVar = x.f139812b;
            return x.b(y.a(new IllegalStateException("Product not for sale online, this may be a product outside of regular range")));
        }
        x.a aVar2 = x.f139812b;
        return x.b(new C10941f(i10.l(), set.contains(i10.l().getProductNo())));
    }

    public C16532g<x<C10941f>> a(C16532g<x<I>> gVar) {
        C17542s.j(gVar, "scanAndGoProductFlow");
        return C16534i.n(gVar, this.f87483a.f(), new a(this, (C17164e<? super a>) null));
    }
}
