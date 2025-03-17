package yd;

import Dd.g;
import E1.I;
import G1.C4504g;
import Jd.i;
import O0.P0;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16533h;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M;
import U0.M0;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import YH.X;
import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import com.ikea.kompassmap.model.product.Product;
import com.ikea.kompassmap.model.store.Store;
import com.ikea.kompassmap.model.store.map.ExposedFloor;
import com.ikea.kompassmap.model.store.map.KompassMapOptions;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import org.maplibre.geojson.FeatureCollection;
import p1.i1;
import s0.C5843N;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ikea/kompassmap/model/store/map/KompassMapOptions;", "kompassMapOptions", "", "productId", "Lkotlin/Function0;", "LXH/N;", "onMapLoaded", "Lkotlin/Function1;", "Lcom/ikea/kompassmap/model/store/map/ExposedFloor;", "onFloorChange", "Lyd/o;", "analytics", "e", "(Lcom/ikea/kompassmap/model/store/map/KompassMapOptions;Ljava/lang/String;LnI/a;LnI/l;LnI/l;LU0/m;II)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: yd.z  reason: case insensitive filesystem */
public final class C10472z {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: yd.z$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KompassMapOptions f77961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C10461o, C16807N> f77962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f77963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<ExposedFloor, C16807N> f77964d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f77965e;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: yd.z$a$a  reason: collision with other inner class name */
        static final class C1438a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ KompassMapOptions f77966a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<C10461o, C16807N> f77967b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f77968c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<ExposedFloor, C16807N> f77969d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f77970e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
            @f(c = "com.ikea.kompassmap.KompassMapKt$KompassMap$4$1$3$1", f = "KompassMap.kt", l = {}, m = "invokeSuspend")
            /* renamed from: yd.z$a$a$a  reason: collision with other inner class name */
            static final class C1439a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f77971c;

                /* renamed from: d  reason: collision with root package name */
                private /* synthetic */ Object f77972d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ i f77973e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ Context f77974f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C17642l<C10461o, C16807N> f77975g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C17631a<C16807N> f77976h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ C17642l<ExposedFloor, C16807N> f77977i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ KompassMapOptions f77978j;

                /* renamed from: k  reason: collision with root package name */
                final /* synthetic */ Jd.a f77979k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ C4899r0<Boolean> f77980l;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ C10448b f77981m;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
                @f(c = "com.ikea.kompassmap.KompassMapKt$KompassMap$4$1$3$1$1", f = "KompassMap.kt", l = {}, m = "invokeSuspend")
                /* renamed from: yd.z$a$a$a$a  reason: collision with other inner class name */
                static final class C1440a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f77982c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ i f77983d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ Context f77984e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ C17642l<C10461o, C16807N> f77985f;

                    /* renamed from: g  reason: collision with root package name */
                    final /* synthetic */ C17631a<C16807N> f77986g;

                    /* renamed from: h  reason: collision with root package name */
                    final /* synthetic */ C17642l<ExposedFloor, C16807N> f77987h;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C1440a(i iVar, Context context, C17642l<? super C10461o, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super ExposedFloor, C16807N> lVar2, C17164e<? super C1440a> eVar) {
                        super(2, eVar);
                        this.f77983d = iVar;
                        this.f77984e = context;
                        this.f77985f = lVar;
                        this.f77986g = aVar;
                        this.f77987h = lVar2;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C1440a(this.f77983d, this.f77984e, this.f77985f, this.f77986g, this.f77987h, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C1440a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        C17187b.f();
                        if (this.f77982c == 0) {
                            y.b(obj);
                            this.f77983d.p0(this.f77984e);
                            this.f77983d.Y(this.f77985f);
                            this.f77983d.h0(this.f77986g);
                            this.f77983d.d0(this.f77987h);
                            return C16807N.f139792a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
                @f(c = "com.ikea.kompassmap.KompassMapKt$KompassMap$4$1$3$1$2", f = "KompassMap.kt", l = {105, 118}, m = "invokeSuspend")
                /* renamed from: yd.z$a$a$a$b */
                static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f77988c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ KompassMapOptions f77989d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ Jd.a f77990e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ i f77991f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    b(KompassMapOptions kompassMapOptions, Jd.a aVar, i iVar, C17164e<? super b> eVar) {
                        super(2, eVar);
                        this.f77989d = kompassMapOptions;
                        this.f77990e = aVar;
                        this.f77991f = iVar;
                    }

                    /* access modifiers changed from: private */
                    public static final C16807N n(i iVar, FeatureCollection featureCollection) {
                        iVar.o0(featureCollection);
                        return C16807N.f139792a;
                    }

                    /* access modifiers changed from: private */
                    public static final C16807N q(Throwable th2) {
                        Log.e("KompassMap getBackground - streets", th2.toString());
                        return C16807N.f139792a;
                    }

                    /* access modifiers changed from: private */
                    public static final C16807N s(i iVar, FeatureCollection featureCollection) {
                        iVar.a0(featureCollection);
                        return C16807N.f139792a;
                    }

                    /* access modifiers changed from: private */
                    public static final C16807N t(Throwable th2) {
                        Log.e("KompassMap getBackground - buildings", th2.toString());
                        return C16807N.f139792a;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new b(this.f77989d, this.f77990e, this.f77991f, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f77988c;
                        if (i10 == 0) {
                            y.b(obj);
                            String storeNo = this.f77989d.getStoreNo();
                            String ruCode = this.f77989d.getRuCode();
                            C10444O o10 = C10444O.STREETS;
                            Jd.a aVar = this.f77990e;
                            C10430A a10 = new C10430A(this.f77991f);
                            C10431B b10 = new C10431B();
                            this.f77988c = 1;
                            if (aVar.j("IKEA Shoppable App", "ingka-digital", ruCode, storeNo, o10, a10, b10, this) == f10) {
                                return f10;
                            }
                        } else if (i10 == 1) {
                            y.b(obj);
                        } else if (i10 == 2) {
                            y.b(obj);
                            return C16807N.f139792a;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Jd.a aVar2 = this.f77990e;
                        String ruCode2 = this.f77989d.getRuCode();
                        String storeNo2 = this.f77989d.getStoreNo();
                        C10444O o11 = C10444O.BUILDINGS;
                        C10432C c10 = new C10432C(this.f77991f);
                        C10433D d10 = new C10433D();
                        this.f77988c = 2;
                        if (aVar2.j("IKEA Shoppable App", "ingka-digital", ruCode2, storeNo2, o11, c10, d10, this) == f10) {
                            return f10;
                        }
                        return C16807N.f139792a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
                @f(c = "com.ikea.kompassmap.KompassMapKt$KompassMap$4$1$3$1$3", f = "KompassMap.kt", l = {135}, m = "invokeSuspend")
                /* renamed from: yd.z$a$a$a$c */
                static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f77992c;

                    /* renamed from: d  reason: collision with root package name */
                    private /* synthetic */ Object f77993d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C4899r0<Boolean> f77994e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ Jd.a f77995f;

                    /* renamed from: g  reason: collision with root package name */
                    final /* synthetic */ KompassMapOptions f77996g;

                    /* renamed from: h  reason: collision with root package name */
                    final /* synthetic */ C10448b f77997h;

                    /* renamed from: i  reason: collision with root package name */
                    final /* synthetic */ Context f77998i;

                    /* renamed from: j  reason: collision with root package name */
                    final /* synthetic */ i f77999j;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    c(C4899r0<Boolean> r0Var, Jd.a aVar, KompassMapOptions kompassMapOptions, C10448b bVar, Context context, i iVar, C17164e<? super c> eVar) {
                        super(2, eVar);
                        this.f77994e = r0Var;
                        this.f77995f = aVar;
                        this.f77996g = kompassMapOptions;
                        this.f77997h = bVar;
                        this.f77998i = context;
                        this.f77999j = iVar;
                    }

                    /* access modifiers changed from: private */
                    public static final C16807N k(i iVar, Store store) {
                        iVar.n0(store.getData());
                        return C16807N.f139792a;
                    }

                    /* access modifiers changed from: private */
                    public static final C16807N m(Q q10, C4899r0 r0Var, Exception exc) {
                        r0Var.setValue(Boolean.TRUE);
                        Log.e("KompassMap getStore", exc.toString());
                        return C16807N.f139792a;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        c cVar = new c(this.f77994e, this.f77995f, this.f77996g, this.f77997h, this.f77998i, this.f77999j, eVar);
                        cVar.f77993d = obj;
                        return cVar;
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f77992c;
                        if (i10 == 0) {
                            y.b(obj);
                            Q q10 = (Q) this.f77993d;
                            this.f77994e.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                            Jd.a aVar = this.f77995f;
                            String storeNo = this.f77996g.getStoreNo();
                            String ruCode = this.f77996g.getRuCode();
                            String languageCode = this.f77996g.getLanguageCode();
                            C10448b bVar = this.f77997h;
                            String b10 = bVar != null ? bVar.b() : null;
                            Map m10 = X.m(C16796C.a(C10454h.MAP.b(), ""), C16796C.a(C10454h.FREQUENTLY_ASKED_POINTS_OF_INTEREST.b(), ""), C16796C.a(C10454h.MAP_METADATA.b(), ""));
                            Context context = this.f77998i;
                            C10434E e10 = new C10434E(this.f77999j);
                            C10435F f11 = new C10435F(q10, this.f77994e);
                            this.f77992c = 1;
                            if (aVar.C("IKEA Shoppable App", "ingka-digital", storeNo, ruCode, languageCode, b10, "IkeaApp", m10, context, e10, f11, this) == f10) {
                                return f10;
                            }
                        } else if (i10 == 1) {
                            y.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return C16807N.f139792a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1439a(i iVar, Context context, C17642l<? super C10461o, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super ExposedFloor, C16807N> lVar2, KompassMapOptions kompassMapOptions, Jd.a aVar2, C4899r0<Boolean> r0Var, C10448b bVar, C17164e<? super C1439a> eVar) {
                    super(2, eVar);
                    this.f77973e = iVar;
                    this.f77974f = context;
                    this.f77975g = lVar;
                    this.f77976h = aVar;
                    this.f77977i = lVar2;
                    this.f77978j = kompassMapOptions;
                    this.f77979k = aVar2;
                    this.f77980l = r0Var;
                    this.f77981m = bVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C1439a aVar = new C1439a(this.f77973e, this.f77974f, this.f77975g, this.f77976h, this.f77977i, this.f77978j, this.f77979k, this.f77980l, this.f77981m, eVar);
                    aVar.f77972d = obj;
                    return aVar;
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C1439a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    C17187b.f();
                    if (this.f77971c == 0) {
                        y.b(obj);
                        Q q10 = (Q) this.f77972d;
                        F0 unused = C16314k.d(q10, C16311i0.a(), (T) null, new C1440a(this.f77973e, this.f77974f, this.f77975g, this.f77976h, this.f77977i, (C17164e<? super C1440a>) null), 2, (Object) null);
                        Q q11 = q10;
                        F0 unused2 = C16314k.d(q11, C16311i0.b(), (T) null, new b(this.f77978j, this.f77979k, this.f77973e, (C17164e<? super b>) null), 2, (Object) null);
                        F0 unused3 = C16314k.d(q11, C16311i0.b(), (T) null, new c(this.f77980l, this.f77979k, this.f77978j, this.f77981m, this.f77974f, this.f77973e, (C17164e<? super c>) null), 2, (Object) null);
                        return C16807N.f139792a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
            @f(c = "com.ikea.kompassmap.KompassMapKt$KompassMap$4$1$4$1", f = "KompassMap.kt", l = {163}, m = "invokeSuspend")
            /* renamed from: yd.z$a$a$b */
            static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f78000c;

                /* renamed from: d  reason: collision with root package name */
                private /* synthetic */ Object f78001d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C4899r0<Boolean> f78002e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ i f78003f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ String f78004g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ C4899r0<Boolean> f78005h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ Jd.a f78006i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ KompassMapOptions f78007j;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: yd.z$a$a$b$a  reason: collision with other inner class name */
                static final class C1441a<T> implements C16533h {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ String f78008a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C4899r0<Boolean> f78009b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ Q f78010c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ Jd.a f78011d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ KompassMapOptions f78012e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ i f78013f;

                    /* renamed from: g  reason: collision with root package name */
                    final /* synthetic */ C4899r0<Boolean> f78014g;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
                    @f(c = "com.ikea.kompassmap.KompassMapKt$KompassMap$4$1$4$1$1$1", f = "KompassMap.kt", l = {167}, m = "invokeSuspend")
                    /* renamed from: yd.z$a$a$b$a$a  reason: collision with other inner class name */
                    static final class C1442a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                        /* renamed from: c  reason: collision with root package name */
                        int f78015c;

                        /* renamed from: d  reason: collision with root package name */
                        private /* synthetic */ Object f78016d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ C4899r0<Boolean> f78017e;

                        /* renamed from: f  reason: collision with root package name */
                        final /* synthetic */ Jd.a f78018f;

                        /* renamed from: g  reason: collision with root package name */
                        final /* synthetic */ KompassMapOptions f78019g;

                        /* renamed from: h  reason: collision with root package name */
                        final /* synthetic */ String f78020h;

                        /* renamed from: i  reason: collision with root package name */
                        final /* synthetic */ i f78021i;

                        /* renamed from: j  reason: collision with root package name */
                        final /* synthetic */ C4899r0<Boolean> f78022j;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C1442a(C4899r0<Boolean> r0Var, Jd.a aVar, KompassMapOptions kompassMapOptions, String str, i iVar, C4899r0<Boolean> r0Var2, C17164e<? super C1442a> eVar) {
                            super(2, eVar);
                            this.f78017e = r0Var;
                            this.f78018f = aVar;
                            this.f78019g = kompassMapOptions;
                            this.f78020h = str;
                            this.f78021i = iVar;
                            this.f78022j = r0Var2;
                        }

                        /* access modifiers changed from: private */
                        public static final C16807N k(i iVar, Product product) {
                            iVar.k0(product.getData());
                            return C16807N.f139792a;
                        }

                        /* access modifiers changed from: private */
                        public static final C16807N m(Q q10, C4899r0 r0Var, Throwable th2) {
                            r0Var.setValue(Boolean.TRUE);
                            Log.e("KompassMap getProduct", th2.toString());
                            return C16807N.f139792a;
                        }

                        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                            C1442a aVar = new C1442a(this.f78017e, this.f78018f, this.f78019g, this.f78020h, this.f78021i, this.f78022j, eVar);
                            aVar.f78016d = obj;
                            return aVar;
                        }

                        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                            return ((C1442a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object f10 = C17187b.f();
                            int i10 = this.f78015c;
                            if (i10 == 0) {
                                y.b(obj);
                                this.f78017e.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                                Jd.a aVar = this.f78018f;
                                String storeNo = this.f78019g.getStoreNo();
                                String str = this.f78020h;
                                String ruCode = this.f78019g.getRuCode();
                                String languageCode = this.f78019g.getLanguageCode();
                                Map m10 = X.m(C16796C.a(C10441L.COMMUNICATIONS.b(), ""), C16796C.a(C10441L.AVAILABILITIES.b(), ""), C16796C.a(C10441L.SALES_PRICES.b(), ""));
                                C10436G g10 = new C10436G(this.f78021i);
                                C10437H h10 = new C10437H((Q) this.f78016d, this.f78022j);
                                this.f78015c = 1;
                                if (aVar.k("IKEA Shoppable App", "ingka-digital", storeNo, str, ruCode, languageCode, m10, g10, h10, this) == f10) {
                                    return f10;
                                }
                            } else if (i10 == 1) {
                                y.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C16807N.f139792a;
                        }
                    }

                    C1441a(String str, C4899r0<Boolean> r0Var, Q q10, Jd.a aVar, KompassMapOptions kompassMapOptions, i iVar, C4899r0<Boolean> r0Var2) {
                        this.f78008a = str;
                        this.f78009b = r0Var;
                        this.f78010c = q10;
                        this.f78011d = aVar;
                        this.f78012e = kompassMapOptions;
                        this.f78013f = iVar;
                        this.f78014g = r0Var2;
                    }

                    /* renamed from: c */
                    public final Object emit(Jd.e eVar, C17164e<? super C16807N> eVar2) {
                        String str = this.f78008a;
                        if (str != null && str.length() != 0 && !eVar.n().isEmpty() && !this.f78009b.getValue().booleanValue()) {
                            F0 unused = C16314k.d(this.f78010c, C16311i0.b(), (T) null, new C1442a(this.f78009b, this.f78011d, this.f78012e, this.f78008a, this.f78013f, this.f78014g, (C17164e<? super C1442a>) null), 2, (Object) null);
                        }
                        return C16807N.f139792a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C4899r0<Boolean> r0Var, i iVar, String str, C4899r0<Boolean> r0Var2, Jd.a aVar, KompassMapOptions kompassMapOptions, C17164e<? super b> eVar) {
                    super(2, eVar);
                    this.f78002e = r0Var;
                    this.f78003f = iVar;
                    this.f78004g = str;
                    this.f78005h = r0Var2;
                    this.f78006i = aVar;
                    this.f78007j = kompassMapOptions;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    b bVar = new b(this.f78002e, this.f78003f, this.f78004g, this.f78005h, this.f78006i, this.f78007j, eVar);
                    bVar.f78001d = obj;
                    return bVar;
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f78000c;
                    if (i10 == 0) {
                        y.b(obj);
                        this.f78002e.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                        C16505B<Jd.e> T10 = this.f78003f.T();
                        C1441a aVar = new C1441a(this.f78004g, this.f78005h, (Q) this.f78001d, this.f78006i, this.f78007j, this.f78003f, this.f78002e);
                        this.f78000c = 1;
                        if (T10.collect(aVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y.b(obj);
                    }
                    throw new C16820k();
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: yd.z$a$a$c */
            static final class c implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ A1<Jd.e> f78023a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ i f78024b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C4899r0<Boolean> f78025c;

                c(A1<Jd.e> a12, i iVar, C4899r0<Boolean> r0Var) {
                    this.f78023a = a12;
                    this.f78024b = iVar;
                    this.f78025c = r0Var;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(834064301, i10, -1, "com.ikea.kompassmap.KompassMap.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KompassMap.kt:234)");
                        }
                        mVar.W(1306899847);
                        if (this.f78023a.getValue().t() == null) {
                            Dd.l.c(this.f78024b, D.j(androidx.compose.ui.d.f18749a, h.B((float) 0), C18029u.f147649a.a()), mVar, 0, 0);
                        }
                        mVar.P();
                        if (C4895p.J()) {
                            C4895p.R();
                            return;
                        }
                        return;
                    }
                    mVar.L();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((C4889m) obj, ((Number) obj2).intValue());
                    return C16807N.f139792a;
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: yd.z$a$a$d */
            static final class d implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f78026a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C4899r0<Boolean> f78027b;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: yd.z$a$a$d$a  reason: collision with other inner class name */
                static final class C1443a implements q<Integer, C4889m, Integer, C16807N> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f78028a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C4899r0<Boolean> f78029b;

                    C1443a(i iVar, C4899r0<Boolean> r0Var) {
                        this.f78028a = iVar;
                        this.f78029b = r0Var;
                    }

                    public final void a(int i10, C4889m mVar, int i11) {
                        if ((i11 & 6) == 0) {
                            i11 |= mVar.d(i10) ? 4 : 2;
                        }
                        if ((i11 & 19) != 18 || !mVar.l()) {
                            if (C4895p.J()) {
                                C4895p.S(963032163, i11, -1, "com.ikea.kompassmap.KompassMap.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KompassMap.kt:249)");
                            }
                            if (i10 == 1) {
                                mVar.W(1860490603);
                                C1438a.k(this.f78028a, this.f78029b, mVar, 0);
                                Ed.d.b(this.f78028a, mVar, 0);
                                mVar.P();
                            } else if (i10 != 2) {
                                mVar.W(1860629948);
                                mVar.P();
                            } else {
                                mVar.W(1859928759);
                                androidx.compose.ui.d m10 = D.m(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), C18029u.f147649a.l(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                C5073d.f d10 = C5073d.f18068a.d();
                                C5437c.C0386c a10 = C5437c.f24302a.a();
                                i iVar = this.f78028a;
                                C4899r0<Boolean> r0Var = this.f78029b;
                                I b10 = G.b(d10, a10, mVar, 54);
                                int a11 = C4883j.a(mVar, 0);
                                C4912y s10 = mVar.s();
                                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, m10);
                                C4504g.a aVar = C4504g.f6515W;
                                C17631a<C4504g> a12 = aVar.a();
                                if (mVar.m() == null) {
                                    C4883j.c();
                                }
                                mVar.I();
                                if (mVar.i()) {
                                    mVar.p(a12);
                                } else {
                                    mVar.t();
                                }
                                C4889m a13 = F1.a(mVar);
                                F1.c(a13, b10, aVar.c());
                                F1.c(a13, s10, aVar.e());
                                p<C4504g, Integer, C16807N> b11 = aVar.b();
                                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                                    a13.u(Integer.valueOf(a11));
                                    a13.w(Integer.valueOf(a11), b11);
                                }
                                F1.c(a13, e10, aVar.d());
                                C5843N n10 = C5843N.f28726a;
                                Ed.d.b(iVar, mVar, 0);
                                C1438a.k(iVar, r0Var, mVar, 0);
                                mVar.x();
                                mVar.P();
                            }
                            if (C4895p.J()) {
                                C4895p.R();
                                return;
                            }
                            return;
                        }
                        mVar.L();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        a(((Number) obj).intValue(), (C4889m) obj2, ((Number) obj3).intValue());
                        return C16807N.f139792a;
                    }
                }

                d(i iVar, C4899r0<Boolean> r0Var) {
                    this.f78026a = iVar;
                    this.f78027b = r0Var;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(1894336439, i10, -1, "com.ikea.kompassmap.KompassMap.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KompassMap.kt:248)");
                        }
                        h.b(c1.c.e(963032163, true, new C1443a(this.f78026a, this.f78027b), mVar, 54), mVar, 6);
                        if (C4895p.J()) {
                            C4895p.R();
                            return;
                        }
                        return;
                    }
                    mVar.L();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((C4889m) obj, ((Number) obj2).intValue());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"yd/z$a$a$e", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* renamed from: yd.z$a$a$e */
            public static final class e implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C10450d f78030a;

                public e(C10450d dVar) {
                    this.f78030a = dVar;
                }

                public void b() {
                    this.f78030a.c();
                }
            }

            C1438a(KompassMapOptions kompassMapOptions, C17642l<? super C10461o, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super ExposedFloor, C16807N> lVar2, String str) {
                this.f77966a = kompassMapOptions;
                this.f77967b = lVar;
                this.f77968c = aVar;
                this.f77969d = lVar2;
                this.f77970e = str;
            }

            /* access modifiers changed from: private */
            public static final void k(i iVar, C4899r0<Boolean> r0Var, C4889m mVar, int i10) {
                mVar.W(-326661067);
                if (C4895p.J()) {
                    C4895p.S(-326661067, i10, -1, "com.ikea.kompassmap.KompassMap.<anonymous>.<anonymous>.UIButtonsLayout (KompassMap.kt:192)");
                }
                C5437c.b g10 = C5437c.f24302a.g();
                d.a aVar = androidx.compose.ui.d.f18749a;
                C18029u uVar = C18029u.f147649a;
                androidx.compose.ui.d m10 = D.m(aVar, 0.0f, 0.0f, uVar.d(), uVar.d(), 3, (Object) null);
                I a10 = C5080k.a(C5073d.f18068a.n(uVar.a()), g10, mVar, 48);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, m10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                mVar.W(1645620428);
                mVar.P();
                g.f(iVar, (androidx.compose.ui.d) null, (C5437c) null, mVar, 0, 6);
                Dd.c.c(iVar, (androidx.compose.ui.d) null, (C5437c) null, mVar, 0, 6);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                }
                mVar.P();
            }

            /* access modifiers changed from: private */
            public static final C16807N m(i iVar) {
                iVar.V().invoke();
                i.P(iVar, (String) null, (String) null, (C17631a) null, 7, (Object) null);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N n(C4899r0 r0Var) {
                r0Var.setValue(Boolean.FALSE);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N p() {
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N q(C4899r0 r0Var) {
                r0Var.setValue(Boolean.FALSE);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N s() {
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final L t(C10450d dVar, M m10) {
                C17542s.j(m10, "$this$DisposableEffect");
                dVar.b();
                return new e(dVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                j((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: yd.z$a$a$b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: yd.z$a$a$b} */
            /* JADX WARNING: type inference failed for: r8v7 */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x029f, code lost:
                if (r8 == r21.a()) goto L_0x02a1;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void j(U0.C4889m r30, int r31) {
                /*
                    r29 = this;
                    r0 = r29
                    r9 = r30
                    r1 = r31
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0017
                    boolean r2 = r30.l()
                    if (r2 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r30.L()
                    goto L_0x0555
                L_0x0017:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0026
                    r2 = -1
                    java.lang.String r4 = "com.ikea.kompassmap.KompassMap.<anonymous>.<anonymous> (KompassMap.kt:58)"
                    r5 = 555685078(0x211f14d6, float:5.389887E-19)
                    U0.C4895p.S(r5, r1, r2, r4)
                L_0x0026:
                    r1 = -1614864554(0xffffffff9fbf1f56, float:-8.094349E-20)
                    r9.C(r1)
                    m3.a r2 = m3.a.f26247a
                    int r4 = m3.a.f26249c
                    androidx.lifecycle.k0 r5 = r2.a(r9, r4)
                    java.lang.String r6 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
                    if (r5 == 0) goto L_0x055c
                    r7 = 8
                    l3.a r13 = bL.C17057a.a(r5, r9, r7)
                    r8 = 0
                    sL.a r15 = fL.C17263a.d(r9, r8)
                    java.lang.Class<Jd.a> r10 = Jd.a.class
                    uI.d r10 = kotlin.jvm.internal.P.b(r10)
                    androidx.lifecycle.j0 r11 = r5.getViewModelStore()
                    r12 = 0
                    r14 = 0
                    r16 = 0
                    androidx.lifecycle.f0 r5 = cL.C17079a.b(r10, r11, r12, r13, r14, r15, r16)
                    r30.U()
                    Jd.a r5 = (Jd.a) r5
                    r9.C(r1)
                    androidx.lifecycle.k0 r1 = r2.a(r9, r4)
                    if (r1 == 0) goto L_0x0556
                    l3.a r13 = bL.C17057a.a(r1, r9, r7)
                    sL.a r15 = fL.C17263a.d(r9, r8)
                    java.lang.Class<Jd.i> r2 = Jd.i.class
                    uI.d r10 = kotlin.jvm.internal.P.b(r2)
                    androidx.lifecycle.j0 r11 = r1.getViewModelStore()
                    r12 = 0
                    r14 = 0
                    r16 = 0
                    androidx.lifecycle.f0 r1 = cL.C17079a.b(r10, r11, r12, r13, r14, r15, r16)
                    r30.U()
                    r7 = r1
                    Jd.i r7 = (Jd.i) r7
                    TJ.B r1 = r7.T()
                    r2 = 0
                    r6 = 1
                    U0.A1 r4 = U0.p1.b(r1, r2, r9, r8, r6)
                    U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                    java.lang.Object r1 = r9.Q(r1)
                    android.content.Context r1 = (android.content.Context) r1
                    yd.b r15 = yd.C10449c.a(r1)
                    r10 = -1414191095(0xffffffffabb52809, float:-1.2871936E-12)
                    r9.W(r10)
                    java.lang.Object r10 = r30.D()
                    U0.m$a r21 = U0.C4889m.f14007a
                    java.lang.Object r11 = r21.a()
                    if (r10 != r11) goto L_0x00b5
                    yd.d r10 = new yd.d
                    r10.<init>(r1)
                    r9.u(r10)
                L_0x00b5:
                    yd.d r10 = (yd.C10450d) r10
                    r30.P()
                    U0.r0 r22 = r10.a()
                    r11 = -1414186805(0xffffffffabb538cb, float:-1.2876587E-12)
                    r9.W(r11)
                    java.lang.Object r11 = r30.D()
                    java.lang.Object r12 = r21.a()
                    if (r11 != r12) goto L_0x00d7
                    java.lang.Boolean r11 = java.lang.Boolean.FALSE
                    U0.r0 r11 = U0.u1.e(r11, r2, r3, r2)
                    r9.u(r11)
                L_0x00d7:
                    r23 = r11
                    U0.r0 r23 = (U0.C4899r0) r23
                    r30.P()
                    r11 = -1414184629(0xffffffffabb5414b, float:-1.2878946E-12)
                    r9.W(r11)
                    java.lang.Object r11 = r30.D()
                    java.lang.Object r12 = r21.a()
                    if (r11 != r12) goto L_0x00f7
                    java.lang.Boolean r11 = java.lang.Boolean.FALSE
                    U0.r0 r11 = U0.u1.e(r11, r2, r3, r2)
                    r9.u(r11)
                L_0x00f7:
                    r24 = r11
                    U0.r0 r24 = (U0.C4899r0) r24
                    r30.P()
                    r11 = -1414182389(0xffffffffabb54a0b, float:-1.2881375E-12)
                    r9.W(r11)
                    java.lang.Object r11 = r30.D()
                    java.lang.Object r12 = r21.a()
                    if (r11 != r12) goto L_0x0117
                    java.lang.Boolean r11 = java.lang.Boolean.FALSE
                    U0.r0 r11 = U0.u1.e(r11, r2, r3, r2)
                    r9.u(r11)
                L_0x0117:
                    r25 = r11
                    U0.r0 r25 = (U0.C4899r0) r25
                    r30.P()
                    r11 = -1414180309(0xffffffffabb5522b, float:-1.288363E-12)
                    r9.W(r11)
                    java.lang.Object r11 = r30.D()
                    java.lang.Object r12 = r21.a()
                    if (r11 != r12) goto L_0x0137
                    java.lang.Boolean r11 = java.lang.Boolean.FALSE
                    U0.r0 r11 = U0.u1.e(r11, r2, r3, r2)
                    r9.u(r11)
                L_0x0137:
                    r14 = r11
                    U0.r0 r14 = (U0.C4899r0) r14
                    r30.P()
                    r11 = -1414178294(0xffffffffabb55a0a, float:-1.2885814E-12)
                    r9.W(r11)
                    java.lang.Object r11 = r30.D()
                    java.lang.Object r12 = r21.a()
                    if (r11 != r12) goto L_0x0156
                    java.lang.Boolean r11 = java.lang.Boolean.TRUE
                    U0.r0 r11 = U0.u1.e(r11, r2, r3, r2)
                    r9.u(r11)
                L_0x0156:
                    r13 = r11
                    U0.r0 r13 = (U0.C4899r0) r13
                    r30.P()
                    r11 = -1414176041(0xffffffffabb562d7, float:-1.2888257E-12)
                    r9.W(r11)
                    com.ikea.kompassmap.model.store.map.KompassMapOptions r11 = r0.f77966a
                    java.lang.Object r12 = r30.D()
                    java.lang.Object r8 = r21.a()
                    if (r12 != r8) goto L_0x0187
                    yd.n r8 = yd.C10460n.f77928a
                    java.lang.String r12 = r11.getStoreNo()
                    java.lang.String r11 = r11.getLanguageCode()
                    boolean r8 = r8.c(r1, r12, r11)
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                    U0.r0 r12 = U0.u1.e(r8, r2, r3, r2)
                    r9.u(r12)
                L_0x0187:
                    r2 = r12
                    U0.r0 r2 = (U0.C4899r0) r2
                    r30.P()
                    XH.N r3 = XH.C16807N.f139792a
                    r8 = -1414166122(0xffffffffabb58996, float:-1.2899011E-12)
                    r9.W(r8)
                    boolean r8 = r9.F(r10)
                    java.lang.Object r11 = r30.D()
                    if (r8 != 0) goto L_0x01a5
                    java.lang.Object r8 = r21.a()
                    if (r11 != r8) goto L_0x01ad
                L_0x01a5:
                    yd.t r11 = new yd.t
                    r11.<init>(r10)
                    r9.u(r11)
                L_0x01ad:
                    nI.l r11 = (nI.C17642l) r11
                    r30.P()
                    r8 = 6
                    U0.P.c(r3, r11, r9, r8)
                    java.lang.Object r3 = r4.getValue()
                    Jd.e r3 = (Jd.e) r3
                    java.util.List r3 = r3.u()
                    java.util.Collection r3 = (java.util.Collection) r3
                    boolean r3 = r3.isEmpty()
                    r3 = r3 ^ r6
                    r10 = -1414157672(0xffffffffabb5aa98, float:-1.2908173E-12)
                    r9.W(r10)
                    boolean r10 = r9.F(r7)
                    java.lang.Object r11 = r30.D()
                    if (r10 != 0) goto L_0x01dd
                    java.lang.Object r10 = r21.a()
                    if (r11 != r10) goto L_0x01e5
                L_0x01dd:
                    yd.u r11 = new yd.u
                    r11.<init>(r7)
                    r9.u(r11)
                L_0x01e5:
                    nI.a r11 = (nI.C17631a) r11
                    r30.P()
                    r10 = 0
                    e.C5281d.a(r3, r11, r9, r10, r10)
                    com.ikea.kompassmap.model.store.map.KompassMapOptions r3 = r0.f77966a
                    r10 = -1414146031(0xffffffffabb5d811, float:-1.2920794E-12)
                    r9.W(r10)
                    boolean r10 = r9.F(r7)
                    boolean r11 = r9.F(r1)
                    r10 = r10 | r11
                    nI.l<yd.o, XH.N> r11 = r0.f77967b
                    boolean r11 = r9.V(r11)
                    r10 = r10 | r11
                    nI.a<XH.N> r11 = r0.f77968c
                    boolean r11 = r9.V(r11)
                    r10 = r10 | r11
                    nI.l<com.ikea.kompassmap.model.store.map.ExposedFloor, XH.N> r11 = r0.f77969d
                    boolean r11 = r9.V(r11)
                    r10 = r10 | r11
                    com.ikea.kompassmap.model.store.map.KompassMapOptions r11 = r0.f77966a
                    boolean r11 = r9.V(r11)
                    r10 = r10 | r11
                    boolean r11 = r9.F(r5)
                    r10 = r10 | r11
                    boolean r11 = r9.F(r15)
                    r10 = r10 | r11
                    nI.l<yd.o, XH.N> r12 = r0.f77967b
                    nI.a<XH.N> r11 = r0.f77968c
                    nI.l<com.ikea.kompassmap.model.store.map.ExposedFloor, XH.N> r6 = r0.f77969d
                    com.ikea.kompassmap.model.store.map.KompassMapOptions r8 = r0.f77966a
                    r16 = r11
                    java.lang.Object r11 = r30.D()
                    if (r10 != 0) goto L_0x0243
                    java.lang.Object r10 = r21.a()
                    if (r11 != r10) goto L_0x023c
                    goto L_0x0243
                L_0x023c:
                    r26 = r2
                    r27 = r13
                    r28 = r14
                    goto L_0x0267
                L_0x0243:
                    yd.z$a$a$a r11 = new yd.z$a$a$a
                    r20 = 0
                    r10 = r11
                    r26 = r2
                    r2 = r11
                    r11 = r7
                    r17 = r12
                    r12 = r1
                    r27 = r13
                    r13 = r17
                    r28 = r14
                    r14 = r16
                    r19 = r15
                    r15 = r6
                    r16 = r8
                    r17 = r5
                    r18 = r24
                    r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                    r9.u(r2)
                    r11 = r2
                L_0x0267:
                    nI.p r11 = (nI.p) r11
                    r30.P()
                    r2 = 0
                    U0.P.g(r3, r11, r9, r2)
                    TJ.B r2 = r7.T()
                    r3 = -1414045113(0xffffffffabb76247, float:-1.303021E-12)
                    r9.W(r3)
                    boolean r3 = r9.F(r7)
                    java.lang.String r6 = r0.f77970e
                    boolean r6 = r9.V(r6)
                    r3 = r3 | r6
                    boolean r6 = r9.F(r5)
                    r3 = r3 | r6
                    com.ikea.kompassmap.model.store.map.KompassMapOptions r6 = r0.f77966a
                    boolean r6 = r9.V(r6)
                    r3 = r3 | r6
                    java.lang.String r13 = r0.f77970e
                    com.ikea.kompassmap.model.store.map.KompassMapOptions r6 = r0.f77966a
                    java.lang.Object r8 = r30.D()
                    if (r3 != 0) goto L_0x02a1
                    java.lang.Object r3 = r21.a()
                    if (r8 != r3) goto L_0x02b4
                L_0x02a1:
                    yd.z$a$a$b r8 = new yd.z$a$a$b
                    r17 = 0
                    r10 = r8
                    r11 = r25
                    r12 = r7
                    r14 = r23
                    r15 = r5
                    r16 = r6
                    r10.<init>(r11, r12, r13, r14, r15, r16, r17)
                    r9.u(r8)
                L_0x02b4:
                    nI.p r8 = (nI.p) r8
                    r30.P()
                    r3 = 0
                    U0.P.g(r2, r8, r9, r3)
                    java.lang.Object r2 = r4.getValue()
                    Jd.e r2 = (Jd.e) r2
                    com.ikea.kompassmap.model.store.map.Floor r2 = r2.m()
                    java.lang.String r8 = "Dismiss"
                    java.lang.String r10 = "getString(...)"
                    if (r2 != 0) goto L_0x0361
                    r2 = -883512296(0xffffffffcb56ac18, float:-1.406876E7)
                    r9.W(r2)
                    java.lang.Object r2 = r26.getValue()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L_0x034f
                    java.lang.Object r2 = r22.getValue()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L_0x034f
                    r2 = -883367402(0xffffffffcb58e216, float:-1.4213654E7)
                    r9.W(r2)
                    int r2 = yd.C10443N.f77913g
                    java.lang.String r1 = r1.getString(r2)
                    kotlin.jvm.internal.C17542s.i(r1, r10)
                    r2 = -1413963100(0xffffffffabb8a2a4, float:-1.3119128E-12)
                    r9.W(r2)
                    java.lang.Object r2 = r30.D()
                    java.lang.Object r3 = r21.a()
                    if (r2 != r3) goto L_0x0314
                    yd.v r2 = new yd.v
                    r11 = r27
                    r2.<init>(r11)
                    r9.u(r2)
                L_0x0314:
                    nI.a r2 = (nI.C17631a) r2
                    r30.P()
                    wK.u2 r3 = new wK.u2
                    r3.<init>(r2, r8)
                    r2 = -1413957748(0xffffffffabb8b78c, float:-1.3124931E-12)
                    r9.W(r2)
                    java.lang.Object r2 = r30.D()
                    java.lang.Object r4 = r21.a()
                    if (r2 != r4) goto L_0x0336
                    yd.w r2 = new yd.w
                    r2.<init>()
                    r9.u(r2)
                L_0x0336:
                    r5 = r2
                    nI.a r5 = (nI.C17631a) r5
                    r30.P()
                    int r2 = wK.C18500u2.f151671c
                    r4 = 6
                    int r2 = r2 << r4
                    r7 = r2 | 24576(0x6000, float:3.4438E-41)
                    r8 = 10
                    r2 = 0
                    r4 = 0
                    r6 = r30
                    wK.Ga.g(r1, r2, r3, r4, r5, r6, r7, r8)
                    r30.P()
                    goto L_0x035c
                L_0x034f:
                    r1 = -882988024(0xffffffffcb5eac08, float:-1.4593032E7)
                    r9.W(r1)
                    r2 = 0
                    Dd.i.b(r9, r2)
                    r30.P()
                L_0x035c:
                    r30.P()
                    goto L_0x054c
                L_0x0361:
                    r11 = r27
                    r2 = 0
                    r3 = -882837922(0xffffffffcb60f65e, float:-1.4743134E7)
                    r9.W(r3)
                    androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                    i1.c$a r13 = i1.C5437c.f24302a
                    i1.c r3 = r13.o()
                    E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r2)
                    int r5 = U0.C4883j.a(r9, r2)
                    U0.y r2 = r30.s()
                    androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r9, r12)
                    G1.g$a r14 = G1.C4504g.f6515W
                    nI.a r15 = r14.a()
                    U0.f r16 = r30.m()
                    if (r16 != 0) goto L_0x0391
                    U0.C4883j.c()
                L_0x0391:
                    r30.I()
                    boolean r16 = r30.i()
                    if (r16 == 0) goto L_0x039e
                    r9.p(r15)
                    goto L_0x03a1
                L_0x039e:
                    r30.t()
                L_0x03a1:
                    U0.m r15 = U0.F1.a(r30)
                    nI.p r0 = r14.c()
                    U0.F1.c(r15, r3, r0)
                    nI.p r0 = r14.e()
                    U0.F1.c(r15, r2, r0)
                    nI.p r0 = r14.b()
                    boolean r2 = r15.i()
                    if (r2 != 0) goto L_0x03cb
                    java.lang.Object r2 = r15.D()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                    boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
                    if (r2 != 0) goto L_0x03d9
                L_0x03cb:
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                    r15.u(r2)
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                    r15.w(r2, r0)
                L_0x03d9:
                    nI.p r0 = r14.d()
                    U0.F1.c(r15, r6, r0)
                    androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
                    r5 = 0
                    r6 = 7
                    r0 = 0
                    r2 = 0
                    r3 = 0
                    r15 = r1
                    r1 = r0
                    r0 = r4
                    r4 = r30
                    Hd.l.g(r1, r2, r3, r4, r5, r6)
                    androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r1 = r16.g()
                    i1.c$b r2 = r13.k()
                    r3 = 0
                    E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r9, r3)
                    int r2 = U0.C4883j.a(r9, r3)
                    U0.y r3 = r30.s()
                    androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r9, r12)
                    nI.a r5 = r14.a()
                    U0.f r6 = r30.m()
                    if (r6 != 0) goto L_0x0417
                    U0.C4883j.c()
                L_0x0417:
                    r30.I()
                    boolean r6 = r30.i()
                    if (r6 == 0) goto L_0x0424
                    r9.p(r5)
                    goto L_0x0427
                L_0x0424:
                    r30.t()
                L_0x0427:
                    U0.m r5 = U0.F1.a(r30)
                    nI.p r6 = r14.c()
                    U0.F1.c(r5, r1, r6)
                    nI.p r1 = r14.e()
                    U0.F1.c(r5, r3, r1)
                    nI.p r1 = r14.b()
                    boolean r3 = r5.i()
                    if (r3 != 0) goto L_0x0451
                    java.lang.Object r3 = r5.D()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                    boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
                    if (r3 != 0) goto L_0x045f
                L_0x0451:
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r5.u(r3)
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r5.w(r2, r1)
                L_0x045f:
                    nI.p r1 = r14.d()
                    U0.F1.c(r5, r4, r1)
                    s0.h r1 = s0.C5862h.f28810a
                    r1 = -2064179506(0xffffffff84f71ece, float:-5.809771E-36)
                    r9.W(r1)
                    java.lang.Object r1 = r11.getValue()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 == 0) goto L_0x049f
                    java.lang.Object r1 = r22.getValue()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L_0x049f
                    java.lang.Object r1 = r24.getValue()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L_0x04a1
                    java.lang.Object r1 = r25.getValue()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 == 0) goto L_0x049f
                    goto L_0x04a1
                L_0x049f:
                    r11 = r7
                    goto L_0x050b
                L_0x04a1:
                    java.lang.Object r1 = r24.getValue()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 == 0) goto L_0x04b0
                    int r1 = yd.C10443N.f77908b
                    goto L_0x04b2
                L_0x04b0:
                    int r1 = yd.C10443N.f77909c
                L_0x04b2:
                    java.lang.String r1 = r15.getString(r1)
                    kotlin.jvm.internal.C17542s.i(r1, r10)
                    r2 = -2064167518(0xffffffff84f74da2, float:-5.8140715E-36)
                    r9.W(r2)
                    java.lang.Object r2 = r30.D()
                    java.lang.Object r3 = r21.a()
                    if (r2 != r3) goto L_0x04d1
                    yd.x r2 = new yd.x
                    r2.<init>(r11)
                    r9.u(r2)
                L_0x04d1:
                    nI.a r2 = (nI.C17631a) r2
                    r30.P()
                    wK.u2 r3 = new wK.u2
                    r3.<init>(r2, r8)
                    r2 = -2064161398(0xffffffff84f7658a, float:-5.816267E-36)
                    r9.W(r2)
                    java.lang.Object r2 = r30.D()
                    java.lang.Object r4 = r21.a()
                    if (r2 != r4) goto L_0x04f3
                    yd.y r2 = new yd.y
                    r2.<init>()
                    r9.u(r2)
                L_0x04f3:
                    r5 = r2
                    nI.a r5 = (nI.C17631a) r5
                    r30.P()
                    int r2 = wK.C18500u2.f151671c
                    r4 = 6
                    int r2 = r2 << r4
                    r8 = r2 | 24576(0x6000, float:3.4438E-41)
                    r10 = 10
                    r2 = 0
                    r4 = 0
                    r6 = r30
                    r11 = r7
                    r7 = r8
                    r8 = r10
                    wK.Ga.g(r1, r2, r3, r4, r5, r6, r7, r8)
                L_0x050b:
                    r30.P()
                    androidx.compose.foundation.layout.d$m r1 = r16.g()
                    i1.c$b r2 = r13.k()
                    yd.z$a$a$c r3 = new yd.z$a$a$c
                    r4 = r28
                    r3.<init>(r0, r11, r4)
                    r0 = 834064301(0x31b6cfad, float:5.320507E-9)
                    r5 = 54
                    r6 = 1
                    c1.a r0 = c1.c.e(r0, r6, r3, r9, r5)
                    r3 = 438(0x1b6, float:6.14E-43)
                    Ed.k.b(r1, r2, r0, r9, r3)
                    r30.x()
                    androidx.compose.foundation.layout.d$m r0 = r16.a()
                    i1.c$b r1 = r13.j()
                    yd.z$a$a$d r2 = new yd.z$a$a$d
                    r2.<init>(r11, r4)
                    r4 = 1894336439(0x70e947b7, float:5.7757364E29)
                    c1.a r2 = c1.c.e(r4, r6, r2, r9, r5)
                    Ed.k.b(r0, r1, r2, r9, r3)
                    r30.x()
                    r30.P()
                L_0x054c:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0555
                    U0.C4895p.R()
                L_0x0555:
                    return
                L_0x0556:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>(r6)
                    throw r0
                L_0x055c:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>(r6)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: yd.C10472z.a.C1438a.j(U0.m, int):void");
            }
        }

        a(KompassMapOptions kompassMapOptions, C17642l<? super C10461o, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super ExposedFloor, C16807N> lVar2, String str) {
            this.f77961a = kompassMapOptions;
            this.f77962b = lVar;
            this.f77963c = aVar;
            this.f77964d = lVar2;
            this.f77965e = str;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1169322863, i11, -1, "com.ikea.kompassmap.KompassMap.<anonymous> (KompassMap.kt:57)");
                }
                C4889m mVar2 = mVar;
                P0.a((d) null, (i1) null, 0, 0, 0.0f, 0.0f, (C5601g) null, c.e(555685078, true, new C1438a(this.f77961a, this.f77962b, this.f77963c, this.f77964d, this.f77965e), mVar2, 54), mVar2, 12582912, 127);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(com.ikea.kompassmap.model.store.map.KompassMapOptions r15, java.lang.String r16, nI.C17631a<XH.C16807N> r17, nI.C17642l<? super com.ikea.kompassmap.model.store.map.ExposedFloor, XH.C16807N> r18, nI.C17642l<? super yd.C10461o, XH.C16807N> r19, U0.C4889m r20, int r21, int r22) {
        /*
            r6 = r15
            r7 = r21
            java.lang.String r0 = "kompassMapOptions"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            r0 = -49084464(0xfffffffffd1307d0, float:-1.2214818E37)
            r1 = r20
            U0.m r8 = r1.k(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r7 | 6
            goto L_0x0028
        L_0x0018:
            r1 = r7 & 6
            if (r1 != 0) goto L_0x0027
            boolean r1 = r8.V(r15)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r7
            goto L_0x0028
        L_0x0027:
            r1 = r7
        L_0x0028:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
        L_0x002e:
            r3 = r16
            goto L_0x0043
        L_0x0031:
            r3 = r7 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r16
            boolean r4 = r8.V(r3)
            if (r4 == 0) goto L_0x0040
            r4 = 32
            goto L_0x0042
        L_0x0040:
            r4 = 16
        L_0x0042:
            r1 = r1 | r4
        L_0x0043:
            r4 = r22 & 4
            if (r4 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r5 = r17
            goto L_0x005e
        L_0x004c:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0049
            r5 = r17
            boolean r9 = r8.F(r5)
            if (r9 == 0) goto L_0x005b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r9
        L_0x005e:
            r9 = r22 & 8
            if (r9 == 0) goto L_0x0067
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r10 = r18
            goto L_0x0079
        L_0x0067:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0064
            r10 = r18
            boolean r11 = r8.F(r10)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r1 = r1 | r11
        L_0x0079:
            r11 = r22 & 16
            if (r11 == 0) goto L_0x0082
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007f:
            r12 = r19
            goto L_0x0094
        L_0x0082:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007f
            r12 = r19
            boolean r13 = r8.F(r12)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r1 = r1 | r13
        L_0x0094:
            r13 = r1 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00aa
            boolean r13 = r8.l()
            if (r13 != 0) goto L_0x00a1
            goto L_0x00aa
        L_0x00a1:
            r8.L()
            r2 = r3
            r3 = r5
            r4 = r10
            r5 = r12
            goto L_0x0151
        L_0x00aa:
            if (r2 == 0) goto L_0x00af
            r2 = 0
            r13 = r2
            goto L_0x00b0
        L_0x00af:
            r13 = r3
        L_0x00b0:
            if (r4 == 0) goto L_0x00d3
            r2 = 622370093(0x25189d2d, float:1.3237152E-16)
            r8.W(r2)
            java.lang.Object r2 = r8.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x00cc
            yd.p r2 = new yd.p
            r2.<init>()
            r8.u(r2)
        L_0x00cc:
            nI.a r2 = (nI.C17631a) r2
            r8.P()
            r14 = r2
            goto L_0x00d4
        L_0x00d3:
            r14 = r5
        L_0x00d4:
            if (r9 == 0) goto L_0x00f6
            r2 = 622371629(0x2518a32d, float:1.3239185E-16)
            r8.W(r2)
            java.lang.Object r2 = r8.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x00f0
            yd.q r2 = new yd.q
            r2.<init>()
            r8.u(r2)
        L_0x00f0:
            nI.l r2 = (nI.C17642l) r2
            r8.P()
            r10 = r2
        L_0x00f6:
            if (r11 == 0) goto L_0x0118
            r2 = 622373261(0x2518a98d, float:1.3241344E-16)
            r8.W(r2)
            java.lang.Object r2 = r8.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0112
            yd.r r2 = new yd.r
            r2.<init>()
            r8.u(r2)
        L_0x0112:
            nI.l r2 = (nI.C17642l) r2
            r8.P()
            r12 = r2
        L_0x0118:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0124
            r2 = -1
            java.lang.String r3 = "com.ikea.kompassmap.KompassMap (KompassMap.kt:55)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0124:
            Ad.b r0 = Ad.b.f58676a
            gL.b r9 = r0.c()
            yd.z$a r11 = new yd.z$a
            r0 = r11
            r1 = r15
            r2 = r12
            r3 = r14
            r4 = r10
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = -1169322863(0xffffffffba4d8c91, float:-7.8410754E-4)
            r2 = 1
            c1.a r0 = c1.c.e(r1, r2, r11, r8, r0)
            r1 = 48
            fL.C17263a.a(r9, r0, r8, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x014d
            U0.C4895p.R()
        L_0x014d:
            r4 = r10
            r5 = r12
            r2 = r13
            r3 = r14
        L_0x0151:
            U0.Y0 r8 = r8.n()
            if (r8 == 0) goto L_0x0165
            yd.s r9 = new yd.s
            r0 = r9
            r1 = r15
            r6 = r21
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.C10472z.e(com.ikea.kompassmap.model.store.map.KompassMapOptions, java.lang.String, nI.a, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(ExposedFloor exposedFloor) {
        C17542s.j(exposedFloor, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C10461o oVar) {
        C17542s.j(oVar, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(KompassMapOptions kompassMapOptions, String str, C17631a aVar, C17642l lVar, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        e(kompassMapOptions, str, aVar, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
