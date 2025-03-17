package Hd;

import Jd.e;
import Jd.i;
import KL.m;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.content.Context;
import android.graphics.PointF;
import androidx.compose.ui.d;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.p;
import org.maplibre.android.MapLibre;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.E;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;
import org.maplibre.android.style.sources.GeoJsonSource;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import yd.C10456j;
import yd.C10461o;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LJd/a;", "kompassViewModel", "LJd/i;", "storeViewModel", "LXH/N;", "g", "(Landroidx/compose/ui/d;LJd/a;LJd/i;LU0/m;II)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.ui.map.MapLibreMapKt$MapLibreMap$1", f = "MapLibreMap.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f60787c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f60788d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f60789e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O<FeatureCollection> f60790f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<e> f60791g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.ui.map.MapLibreMapKt$MapLibreMap$1$1", f = "MapLibreMap.kt", l = {41}, m = "invokeSuspend")
        /* renamed from: Hd.l$a$a  reason: collision with other inner class name */
        static final class C0998a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f60792c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ i f60793d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ O<FeatureCollection> f60794e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ A1<e> f60795f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
            @f(c = "com.ikea.kompassmap.ui.map.MapLibreMapKt$MapLibreMap$1$1$1", f = "MapLibreMap.kt", l = {}, m = "invokeSuspend")
            /* renamed from: Hd.l$a$a$a  reason: collision with other inner class name */
            static final class C0999a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f60796c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ O<FeatureCollection> f60797d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ A1<e> f60798e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0999a(O<FeatureCollection> o10, A1<e> a12, C17164e<? super C0999a> eVar) {
                    super(2, eVar);
                    this.f60797d = o10;
                    this.f60798e = a12;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0999a(this.f60797d, this.f60798e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0999a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
                    r0 = r0.getData();
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                    /*
                        r1 = this;
                        eI.C17187b.f()
                        int r0 = r1.f60796c
                        if (r0 != 0) goto L_0x002b
                        XH.y.b(r2)
                        kotlin.jvm.internal.O<org.maplibre.geojson.FeatureCollection> r2 = r1.f60797d
                        U0.A1<Jd.e> r0 = r1.f60798e
                        java.lang.Object r0 = r0.getValue()
                        Jd.e r0 = (Jd.e) r0
                        com.ikea.kompassmap.model.store.map.Floor r0 = r0.m()
                        if (r0 == 0) goto L_0x0025
                        java.util.List r0 = r0.getData()
                        if (r0 == 0) goto L_0x0025
                        org.maplibre.geojson.FeatureCollection r0 = org.maplibre.geojson.FeatureCollection.fromFeatures((java.util.List<org.maplibre.geojson.Feature>) r0)
                        goto L_0x0026
                    L_0x0025:
                        r0 = 0
                    L_0x0026:
                        r2.f144348a = r0
                        XH.N r2 = XH.C16807N.f139792a
                        return r2
                    L_0x002b:
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r2.<init>(r0)
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Hd.l.a.C0998a.C0999a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0998a(i iVar, O<FeatureCollection> o10, A1<e> a12, C17164e<? super C0998a> eVar) {
                super(2, eVar);
                this.f60793d = iVar;
                this.f60794e = o10;
                this.f60795f = a12;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0998a(this.f60793d, this.f60794e, this.f60795f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0998a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                GeoJsonSource geoJsonSource;
                GeoJsonSource geoJsonSource2;
                GeoJsonSource geoJsonSource3;
                Object f10 = C17187b.f();
                int i10 = this.f60792c;
                E e10 = null;
                if (i10 == 0) {
                    y.b(obj);
                    M b10 = C16311i0.b();
                    C0999a aVar = new C0999a(this.f60794e, this.f60795f, (C17164e<? super C0999a>) null);
                    this.f60792c = 1;
                    if (C16310i.g(b10, aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o o10 = this.f60793d.T().getValue().o();
                if (o10 != null) {
                    e10 = o10.t();
                }
                i iVar = this.f60793d;
                O<FeatureCollection> o11 = this.f60794e;
                A1<e> a12 = this.f60795f;
                if (e10 != null && (geoJsonSource3 = (GeoJsonSource) e10.i(iVar.S())) != null) {
                    geoJsonSource3.a((FeatureCollection) o11.f144348a);
                } else if (e10 != null) {
                    e10.g(new GeoJsonSource(iVar.S(), (FeatureCollection) o11.f144348a));
                }
                FeatureCollection w10 = a12.getValue().w();
                if (w10 != null) {
                    if (e10 != null && (geoJsonSource2 = (GeoJsonSource) e10.i(iVar.U())) != null) {
                        geoJsonSource2.a(w10);
                    } else if (e10 != null) {
                        e10.g(new GeoJsonSource(iVar.U(), w10));
                    }
                }
                FeatureCollection k10 = a12.getValue().k();
                if (k10 != null) {
                    if (e10 != null && (geoJsonSource = (GeoJsonSource) e10.i(iVar.R())) != null) {
                        geoJsonSource.a(k10);
                    } else if (e10 != null) {
                        e10.g(new GeoJsonSource(iVar.R(), k10));
                    }
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, O<FeatureCollection> o10, A1<e> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f60789e = iVar;
            this.f60790f = o10;
            this.f60791g = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f60789e, this.f60790f, this.f60791g, eVar);
            aVar.f60788d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f60787c == 0) {
                y.b(obj);
                F0 unused = C16314k.d((Q) this.f60788d, C16311i0.c(), (T) null, new C0998a(this.f60789e, this.f60790f, this.f60791g, (C17164e<? super C0998a>) null), 2, (Object) null);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.ui.map.MapLibreMapKt$MapLibreMap$2$1", f = "MapLibreMap.kt", l = {71}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f60799c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f60800d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<e> f60801e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f60802f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Jd.a f60803g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f60804h;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1<e> f60805a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f60806b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f60807c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Jd.a f60808d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Context f60809e;

            a(A1<e> a12, i iVar, C4899r0<Boolean> r0Var, Jd.a aVar, Context context) {
                this.f60805a = a12;
                this.f60806b = iVar;
                this.f60807c = r0Var;
                this.f60808d = aVar;
                this.f60809e = context;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
                r4 = (r4 = r4.getAsJsonObject()).get("productFloor");
             */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(Jd.e r7, dI.C17164e<? super XH.C16807N> r8) {
                /*
                    r6 = this;
                    com.ikea.kompassmap.model.store.map.Floor r8 = r7.m()
                    if (r8 == 0) goto L_0x0072
                    U0.A1<Jd.e> r0 = r6.f60805a
                    Jd.i r1 = r6.f60806b
                    KL.m r2 = r7.y()
                    if (r2 == 0) goto L_0x0072
                    java.util.List r2 = r7.z()
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.Iterator r2 = r2.iterator()
                L_0x001a:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x0072
                    java.lang.Object r3 = r2.next()
                    KL.n r3 = (KL.n) r3
                    com.google.gson.JsonElement r4 = r3.c()
                    if (r4 == 0) goto L_0x003f
                    com.google.gson.JsonObject r4 = r4.getAsJsonObject()
                    if (r4 == 0) goto L_0x003f
                    java.lang.String r5 = "productFloor"
                    com.google.gson.JsonElement r4 = r4.get(r5)
                    if (r4 == 0) goto L_0x003f
                    java.lang.String r4 = r4.getAsString()
                    goto L_0x0040
                L_0x003f:
                    r4 = 0
                L_0x0040:
                    java.lang.String r5 = r8.getFloorId()
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                    if (r4 == 0) goto L_0x0062
                    java.lang.Object r4 = r0.getValue()
                    Jd.e r4 = (Jd.e) r4
                    KL.m r4 = r4.y()
                    if (r4 == 0) goto L_0x001a
                    KL.a r3 = r4.g(r3)
                    KL.k r3 = (KL.k) r3
                    if (r3 == 0) goto L_0x001a
                    r1.Q(r3)
                    goto L_0x001a
                L_0x0062:
                    java.lang.Object r3 = r0.getValue()
                    Jd.e r3 = (Jd.e) r3
                    KL.m r3 = r3.y()
                    if (r3 == 0) goto L_0x001a
                    r3.h()
                    goto L_0x001a
                L_0x0072:
                    com.ikea.kompassmap.model.product.ProductData r7 = r7.t()
                    if (r7 == 0) goto L_0x0099
                    U0.r0<java.lang.Boolean> r7 = r6.f60807c
                    Jd.i r8 = r6.f60806b
                    Jd.a r0 = r6.f60808d
                    android.content.Context r1 = r6.f60809e
                    java.lang.Object r2 = r7.getValue()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L_0x0099
                    Hd.d r2 = Hd.d.f60755a
                    r2.h(r8, r0, r1)
                    r8 = 1
                    java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
                    r7.setValue(r8)
                L_0x0099:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Hd.l.b.a.emit(Jd.e, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, A1<e> a12, C4899r0<Boolean> r0Var, Jd.a aVar, Context context, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f60800d = iVar;
            this.f60801e = a12;
            this.f60802f = r0Var;
            this.f60803g = aVar;
            this.f60804h = context;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f60800d, this.f60801e, this.f60802f, this.f60803g, this.f60804h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f60799c;
            if (i10 == 0) {
                y.b(obj);
                C16505B<e> T10 = this.f60800d.T();
                a aVar = new a(this.f60801e, this.f60800d, this.f60802f, this.f60803g, this.f60804h);
                this.f60799c = 1;
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: Hd.l$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: Hd.l$b} */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b1, code lost:
        if (r9 == r13.a()) goto L_0x01b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(androidx.compose.ui.d r21, Jd.a r22, Jd.i r23, U0.C4889m r24, int r25, int r26) {
        /*
            r0 = r22
            r4 = r25
            r1 = -1132994515(0xffffffffbc77e02d, float:-0.015129131)
            r2 = r24
            U0.m r2 = r2.k(r1)
            r3 = r26 & 1
            r5 = 2
            if (r3 == 0) goto L_0x0018
            r6 = r4 | 6
            r7 = r6
            r6 = r21
            goto L_0x002c
        L_0x0018:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x0029
            r6 = r21
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x0026
            r7 = 4
            goto L_0x0027
        L_0x0026:
            r7 = r5
        L_0x0027:
            r7 = r7 | r4
            goto L_0x002c
        L_0x0029:
            r6 = r21
            r7 = r4
        L_0x002c:
            r8 = r4 & 48
            r9 = 32
            if (r8 != 0) goto L_0x004a
            r8 = r26 & 2
            if (r8 != 0) goto L_0x0047
            r8 = r4 & 64
            if (r8 != 0) goto L_0x003f
            boolean r8 = r2.V(r0)
            goto L_0x0043
        L_0x003f:
            boolean r8 = r2.F(r0)
        L_0x0043:
            if (r8 == 0) goto L_0x0047
            r8 = r9
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r7 = r7 | r8
        L_0x004a:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0063
            r8 = r26 & 4
            if (r8 != 0) goto L_0x005d
            r8 = r23
            boolean r10 = r2.F(r8)
            if (r10 == 0) goto L_0x005f
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005d:
            r8 = r23
        L_0x005f:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r7 = r7 | r10
            goto L_0x0065
        L_0x0063:
            r8 = r23
        L_0x0065:
            r10 = r7 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x007a
            boolean r10 = r2.l()
            if (r10 != 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            r2.L()
            r3 = r0
            r1 = r6
            r11 = r8
            goto L_0x01eb
        L_0x007a:
            r2.G()
            r10 = r4 & 1
            r11 = 0
            if (r10 == 0) goto L_0x009c
            boolean r10 = r2.O()
            if (r10 == 0) goto L_0x0089
            goto L_0x009c
        L_0x0089:
            r2.L()
            r3 = r26 & 2
            if (r3 == 0) goto L_0x0092
            r7 = r7 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0092:
            r3 = r26 & 4
            if (r3 == 0) goto L_0x0098
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0098:
            r3 = r6
        L_0x0099:
            r10 = r8
            goto L_0x011f
        L_0x009c:
            if (r3 == 0) goto L_0x00a1
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x00a2
        L_0x00a1:
            r3 = r6
        L_0x00a2:
            r6 = r26 & 2
            r10 = 8
            java.lang.String r12 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r13 = -1614864554(0xffffffff9fbf1f56, float:-8.094349E-20)
            if (r6 == 0) goto L_0x00e4
            r2.C(r13)
            m3.a r0 = m3.a.f26247a
            int r6 = m3.a.f26249c
            androidx.lifecycle.k0 r0 = r0.a(r2, r6)
            if (r0 == 0) goto L_0x00de
            l3.a r17 = bL.C17057a.a(r0, r2, r10)
            sL.a r19 = fL.C17263a.d(r2, r11)
            java.lang.Class<Jd.a> r6 = Jd.a.class
            uI.d r14 = kotlin.jvm.internal.P.b(r6)
            androidx.lifecycle.j0 r15 = r0.getViewModelStore()
            r16 = 0
            r18 = 0
            r20 = 0
            androidx.lifecycle.f0 r0 = cL.C17079a.b(r14, r15, r16, r17, r18, r19, r20)
            r2.U()
            Jd.a r0 = (Jd.a) r0
            r7 = r7 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00e4
        L_0x00de:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x00e4:
            r6 = r26 & 4
            if (r6 == 0) goto L_0x0099
            r2.C(r13)
            m3.a r6 = m3.a.f26247a
            int r8 = m3.a.f26249c
            androidx.lifecycle.k0 r6 = r6.a(r2, r8)
            if (r6 == 0) goto L_0x0119
            l3.a r16 = bL.C17057a.a(r6, r2, r10)
            sL.a r18 = fL.C17263a.d(r2, r11)
            java.lang.Class<Jd.i> r8 = Jd.i.class
            uI.d r13 = kotlin.jvm.internal.P.b(r8)
            androidx.lifecycle.j0 r14 = r6.getViewModelStore()
            r15 = 0
            r17 = 0
            r19 = 0
            androidx.lifecycle.f0 r6 = cL.C17079a.b(r13, r14, r15, r16, r17, r18, r19)
            r2.U()
            Jd.i r6 = (Jd.i) r6
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
            r10 = r6
            goto L_0x011f
        L_0x0119:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x011f:
            r2.y()
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x012e
            r6 = -1
            java.lang.String r8 = "com.ikea.kompassmap.ui.map.MapLibreMap (MapLibreMap.kt:32)"
            U0.C4895p.S(r1, r7, r6, r8)
        L_0x012e:
            TJ.B r1 = r10.T()
            r6 = 0
            r8 = 1
            U0.A1 r1 = U0.p1.b(r1, r6, r2, r11, r8)
            r12 = -1785695905(0xffffffff9590715f, float:-5.8340005E-26)
            r2.W(r12)
            java.lang.Object r12 = r2.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r14 = r13.a()
            if (r12 != r14) goto L_0x0153
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            U0.r0 r12 = U0.u1.e(r12, r6, r5, r6)
            r2.u(r12)
        L_0x0153:
            r15 = r12
            U0.r0 r15 = (U0.C4899r0) r15
            r2.P()
            kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
            r5.<init>()
            U0.I0 r12 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r12 = r2.Q(r12)
            r14 = r12
            android.content.Context r14 = (android.content.Context) r14
            java.lang.Object r12 = r1.getValue()
            Jd.e r12 = (Jd.e) r12
            com.ikea.kompassmap.model.store.map.Floor r12 = r12.m()
            Hd.l$a r8 = new Hd.l$a
            r8.<init>(r10, r5, r1, r6)
            U0.P.g(r12, r8, r2, r11)
            TJ.B r6 = r10.T()
            r8 = -1785646786(0xffffffff9591313e, float:-5.8642724E-26)
            r2.W(r8)
            boolean r8 = r2.F(r10)
            boolean r12 = r2.V(r1)
            r8 = r8 | r12
            r12 = r7 & 112(0x70, float:1.57E-43)
            r12 = r12 ^ 48
            if (r12 <= r9) goto L_0x019a
            boolean r12 = r2.F(r0)
            if (r12 != 0) goto L_0x019e
        L_0x019a:
            r12 = r7 & 48
            if (r12 != r9) goto L_0x01a0
        L_0x019e:
            r9 = 1
            goto L_0x01a1
        L_0x01a0:
            r9 = r11
        L_0x01a1:
            r8 = r8 | r9
            boolean r9 = r2.F(r14)
            r8 = r8 | r9
            java.lang.Object r9 = r2.D()
            if (r8 != 0) goto L_0x01b3
            java.lang.Object r8 = r13.a()
            if (r9 != r8) goto L_0x01c5
        L_0x01b3:
            Hd.l$b r9 = new Hd.l$b
            r18 = 0
            r12 = r9
            r13 = r10
            r8 = r14
            r14 = r1
            r16 = r0
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2.u(r9)
        L_0x01c5:
            nI.p r9 = (nI.p) r9
            r2.P()
            U0.P.g(r6, r9, r2, r11)
            Hd.f r6 = new Hd.f
            r6.<init>(r10, r1, r5)
            int r1 = r7 << 3
            r9 = r1 & 112(0x70, float:1.57E-43)
            r1 = 4
            r7 = 0
            r5 = r6
            r6 = r3
            r8 = r2
            r11 = r10
            r10 = r1
            androidx.compose.ui.viewinterop.e.a(r5, r6, r7, r8, r9, r10)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01e9
            U0.C4895p.R()
        L_0x01e9:
            r1 = r3
            r3 = r0
        L_0x01eb:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x0200
            Hd.g r7 = new Hd.g
            r0 = r7
            r2 = r3
            r3 = r11
            r4 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hd.l.g(androidx.compose.ui.d, Jd.a, Jd.i, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final MapView h(i iVar, A1 a12, O o10, Context context) {
        C17542s.j(context, "context");
        MapLibre.getInstance(context);
        MapView mapView = new MapView(context);
        mapView.r(new h(iVar, a12, context, mapView, o10));
        return mapView;
    }

    /* access modifiers changed from: private */
    public static final void i(i iVar, A1 a12, Context context, MapView mapView, O o10, o oVar) {
        i iVar2 = iVar;
        MapView mapView2 = mapView;
        o oVar2 = oVar;
        C17542s.j(oVar2, "map");
        iVar.g0(oVar2);
        oVar.v().M(false);
        oVar.v().Z(false);
        oVar.v().H(false);
        oVar2.P(new CameraPosition.a().e(((e) a12.getValue()).A()).a(((e) a12.getValue()).j()).d(((e) a12.getValue()).l()).b());
        oVar2.T(((e) a12.getValue()).p());
        oVar2.U(((e) a12.getValue()).q());
        oVar2.X(((e) a12.getValue()).x(), new i(iVar, o10));
        e eVar = e.f60766a;
        String b10 = C10456j.BUBBLE.b();
        m mVar = m.f60810a;
        Context context2 = context;
        o oVar3 = oVar;
        e.b(eVar, context2, oVar3, b10, mVar.a(), false, 16, (Object) null);
        e eVar2 = eVar;
        eVar2.a(context2, oVar3, C10456j.BUBBLE_SELECTED.b(), mVar.a(), true);
        C10456j jVar = C10456j.PIN;
        e.b(eVar2, context2, oVar3, jVar.b(), mVar.b(), false, 16, (Object) null);
        C10456j jVar2 = C10456j.PIN_SELECTED;
        eVar2.a(context2, oVar3, jVar2.b(), mVar.b(), true);
        e.b(eVar2, context2, oVar3, jVar.b(), mVar.c(), false, 16, (Object) null);
        eVar2.a(context2, oVar3, jVar2.b(), mVar.c(), true);
        n(iVar);
        E t10 = oVar.t();
        if (t10 != null) {
            iVar.q0(new m(mapView2, oVar2, t10));
        }
        iVar.i0(mapView2);
        oVar2.c(new j(oVar2, iVar, mapView2, a12));
    }

    /* access modifiers changed from: private */
    public static final void j(i iVar, O o10, E e10) {
        C17542s.j(e10, "it");
        e10.g(new GeoJsonSource(iVar.S(), (FeatureCollection) o10.f144348a));
    }

    /* access modifiers changed from: private */
    public static final boolean k(o oVar, i iVar, MapView mapView, A1 a12, LatLng latLng) {
        C17542s.j(latLng, "point");
        PointF e10 = oVar.s().e(latLng);
        C17542s.i(e10, "toScreenLocation(...)");
        List<Feature> N10 = oVar.N(e10, new String[0]);
        C17542s.i(N10, "queryRenderedFeatures(...)");
        if (iVar.T().getValue().t() != null) {
            return true;
        }
        m(a12, iVar, N10);
        C16807N n10 = C16807N.f139792a;
        return true;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(d dVar, Jd.a aVar, i iVar, int i10, int i11, C4889m mVar, int i12) {
        g(dVar, aVar, iVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: org.maplibre.geojson.Feature} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m(U0.A1<Jd.e> r10, Jd.i r11, java.util.List<org.maplibre.geojson.Feature> r12) {
        /*
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0007:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "id"
            r4 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.next()
            r5 = r2
            org.maplibre.geojson.Feature r5 = (org.maplibre.geojson.Feature) r5
            com.google.gson.JsonElement r5 = r5.getProperty(r3)
            if (r5 == 0) goto L_0x0007
            goto L_0x001f
        L_0x001e:
            r2 = r4
        L_0x001f:
            org.maplibre.geojson.Feature r2 = (org.maplibre.geojson.Feature) r2
            java.lang.String r1 = "subtype"
            if (r2 != 0) goto L_0x0060
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r2.next()
            r6 = r5
            org.maplibre.geojson.Feature r6 = (org.maplibre.geojson.Feature) r6
            java.lang.String r7 = "icon-image"
            com.google.gson.JsonElement r6 = r6.getProperty(r7)
            if (r6 == 0) goto L_0x0029
            goto L_0x0040
        L_0x003f:
            r5 = r4
        L_0x0040:
            r2 = r5
            org.maplibre.geojson.Feature r2 = (org.maplibre.geojson.Feature) r2
            if (r2 != 0) goto L_0x0060
            java.util.Iterator r0 = r0.iterator()
        L_0x0049:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r0.next()
            r5 = r2
            org.maplibre.geojson.Feature r5 = (org.maplibre.geojson.Feature) r5
            com.google.gson.JsonElement r5 = r5.getProperty(r1)
            if (r5 == 0) goto L_0x0049
            r4 = r2
        L_0x005d:
            r2 = r4
            org.maplibre.geojson.Feature r2 = (org.maplibre.geojson.Feature) r2
        L_0x0060:
            if (r2 == 0) goto L_0x008b
            java.lang.Object r10 = r10.getValue()
            Jd.e r10 = (Jd.e) r10
            nI.l r10 = r10.i()
            yd.o$c r0 = new yd.o$c
            java.lang.String r3 = r2.getStringProperty(r3)
            if (r3 != 0) goto L_0x007c
            java.lang.String r3 = r2.getStringProperty(r1)
            if (r3 != 0) goto L_0x007c
            java.lang.String r3 = ""
        L_0x007c:
            yd.o$b r1 = yd.C10461o.b.MAP
            r0.<init>(r3, r1)
            r10.invoke(r0)
            r11.N(r2)
            r11.F(r12)
            goto L_0x009b
        L_0x008b:
            r8 = 7
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            Jd.i.P(r4, r5, r6, r7, r8, r9)
            java.util.List r10 = YH.C16877v.n()
            r11.F(r10)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hd.l.m(U0.A1, Jd.i, java.util.List):void");
    }

    private static final void n(i iVar) {
        iVar.e0();
        i.P(iVar, (String) null, (String) null, new k(iVar), 3, (Object) null);
        iVar.T().getValue().s().invoke();
        iVar.T().getValue().i().invoke(C10461o.a.f77946a);
    }

    /* access modifiers changed from: private */
    public static final C16807N o(i iVar) {
        iVar.j0();
        return C16807N.f139792a;
    }
}
