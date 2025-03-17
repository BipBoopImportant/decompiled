package FF;

import OE.q;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.C5210m;
import androidx.lifecycle.F;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.core.network.models.FurnishingType;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.Showroom;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"LFF/U;", "Landroidx/lifecycle/f0;", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "<init>", "(LOE/q;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/data/SceneRepository;)V", "", "Lcom/sugarcube/core/network/models/Showroom;", "showrooms", "", "loggedIn", "showLoading", "LFF/i;", "i", "(Ljava/util/List;ZZ)LFF/i;", "m", "LOE/q;", "getSugarcube", "()LOE/q;", "n", "Lcom/sugarcube/app/base/data/user/UserRepo;", "getUserRepo", "()Lcom/sugarcube/app/base/data/user/UserRepo;", "o", "Lcom/sugarcube/app/base/data/SceneRepository;", "getSceneRepository", "()Lcom/sugarcube/app/base/data/SceneRepository;", "LTJ/P;", "p", "LTJ/P;", "getShowrooms", "()LTJ/P;", "Landroidx/lifecycle/F;", "q", "Landroidx/lifecycle/F;", "C", "()Landroidx/lifecycle/F;", "screenContent", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class U extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final q f109835m;

    /* renamed from: n  reason: collision with root package name */
    private final UserRepo f109836n;

    /* renamed from: o  reason: collision with root package name */
    private final SceneRepository f109837o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<List<Showroom>> f109838p;

    /* renamed from: q  reason: collision with root package name */
    private final F<C12892i> f109839q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            Integer sortOrder = ((Showroom) t10).getSortOrder();
            int i10 = Integer.MAX_VALUE;
            Integer valueOf = Integer.valueOf(sortOrder != null ? sortOrder.intValue() : Integer.MAX_VALUE);
            Integer sortOrder2 = ((Showroom) t11).getSortOrder();
            if (sortOrder2 != null) {
                i10 = sortOrder2.intValue();
            }
            return C17035a.e(valueOf, Integer.valueOf(i10));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            Integer sortOrder = ((Showroom) t10).getSortOrder();
            int i10 = Integer.MAX_VALUE;
            Integer valueOf = Integer.valueOf(sortOrder != null ? sortOrder.intValue() : Integer.MAX_VALUE);
            Integer sortOrder2 = ((Showroom) t11).getSortOrder();
            if (sortOrder2 != null) {
                i10 = sortOrder2.intValue();
            }
            return C17035a.e(valueOf, Integer.valueOf(i10));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/sugarcube/core/network/models/Showroom;", "showrooms", "", "isLoggedIn", "LFF/i;", "<anonymous>", "(Ljava/util/List;Z)LFF/i;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryViewModel$screenContent$1", f = "ShowroomsGalleryFragment.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements nI.q<List<? extends Showroom>, Boolean, C17164e<? super C12892i>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f109840c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f109841d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f109842e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ U f109843f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(U u10, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f109843f = u10;
        }

        public final Object i(List<Showroom> list, boolean z10, C17164e<? super C12892i> eVar) {
            c cVar = new c(this.f109843f, eVar);
            cVar.f109841d = list;
            cVar.f109842e = z10;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((List) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f109840c == 0) {
                y.b(obj);
                boolean z10 = this.f109842e;
                return this.f109843f.i((List) this.f109841d, z10, false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<List<? extends Showroom>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f109844a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f109845a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryViewModel$special$$inlined$map$1$2", f = "ShowroomsGalleryFragment.kt", l = {50}, m = "emit")
            /* renamed from: FF.U$d$a$a  reason: collision with other inner class name */
            public static final class C2624a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f109846c;

                /* renamed from: d  reason: collision with root package name */
                int f109847d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f109848e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2624a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f109848e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f109846c = obj;
                    this.f109847d |= Integer.MIN_VALUE;
                    return this.f109848e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f109845a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof FF.U.d.a.C2624a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    FF.U$d$a$a r0 = (FF.U.d.a.C2624a) r0
                    int r1 = r0.f109847d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f109847d = r1
                    goto L_0x0018
                L_0x0013:
                    FF.U$d$a$a r0 = new FF.U$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f109846c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f109847d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f109845a
                    java.util.List r5 = (java.util.List) r5
                    if (r5 != 0) goto L_0x003e
                    java.util.List r5 = YH.C16877v.n()
                L_0x003e:
                    r0.f109847d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: FF.U.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f109844a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f109844a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [androidx.lifecycle.F, androidx.lifecycle.K] */
    public U(q qVar, UserRepo userRepo, SceneRepository sceneRepository) {
        C17542s.j(qVar, "sugarcube");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(sceneRepository, "sceneRepository");
        this.f109835m = qVar;
        this.f109836n = userRepo;
        this.f109837o = sceneRepository;
        C16519P<List<Showroom>> c02 = C16534i.c0(new d(C5210m.a(sceneRepository.getShowrooms())), g0.a(this), C16515L.a.b(C16515L.f138570a, 5000, 0, 2, (Object) null), C16877v.n());
        this.f109838p = c02;
        this.f109839q = C5210m.c(C16534i.n(c02, userRepo.isLoggedIn(), new c(this, (C17164e<? super c>) null)), (C17168i) null, 0, 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final C12892i i(List<Showroom> list, boolean z10, boolean z11) {
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Showroom) next).getFurnishingType() == FurnishingType.UNFURNISHED) {
                arrayList.add(next);
            }
        }
        List g12 = C16877v.g1(arrayList, new a());
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (((Showroom) next2).getFurnishingType() != FurnishingType.UNFURNISHED) {
                arrayList2.add(next2);
            }
        }
        List g13 = C16877v.g1(arrayList2, new b());
        C12890g gVar = new C12890g(C12891h.Blank, g12);
        C12890g gVar2 = new C12890g(C12891h.Furnished, g13);
        Set h10 = YH.g0.h(RoomType.LIVING_ROOM, RoomType.DINING_ROOM, RoomType.BEDROOM, RoomType.OFFICE);
        Iterable<Showroom> a10 = gVar2.a();
        ArrayList arrayList3 = new ArrayList(C16877v.y(a10, 10));
        for (Showroom roomType : a10) {
            arrayList3.add(RoomTypeRenderer.INSTANCE.toRoomType(roomType.getRoomType()));
        }
        return new C12892i(gVar, gVar2, C16877v.t1(C16877v.C0(h10, C16877v.y1(arrayList3))), !z10, this.f109835m.getLocale(), System.currentTimeMillis(), z11);
    }

    public final F<C12892i> C() {
        return this.f109839q;
    }
}
