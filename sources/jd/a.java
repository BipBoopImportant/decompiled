package Jd;

import GK.C15777E;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import QL.m;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ikea.kompassmap.model.product.Product;
import com.ikea.kompassmap.model.store.Store;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import org.maplibre.geojson.FeatureCollection;
import yd.C10444O;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0001\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\u00140\u0012H@¢\u0006\u0004\b\u0019\u0010\u001aJ~\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u0012H@¢\u0006\u0004\b\u001e\u0010\u001fJ`\u0010#\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u0012H@¢\u0006\u0004\b#\u0010$J=\u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"LJd/a;", "Landroidx/lifecycle/f0;", "LBd/a;", "kompassRepository", "<init>", "(LBd/a;)V", "", "userAgent", "token", "storeNo", "ruCode", "languageCode", "supportedStatus", "supportedPlatform", "", "extraParameters", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lcom/ikea/kompassmap/model/store/Store;", "LXH/N;", "onSuccess", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "C", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;LnI/l;LnI/l;LdI/e;)Ljava/lang/Object;", "productId", "Lcom/ikea/kompassmap/model/product/Product;", "", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LnI/l;LnI/l;LdI/e;)Ljava/lang/Object;", "Lyd/O;", "type", "Lorg/maplibre/geojson/FeatureCollection;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyd/O;LnI/l;LnI/l;LdI/e;)Ljava/lang/Object;", "url", "Landroid/graphics/Bitmap;", "i", "(Ljava/lang/String;LnI/l;LnI/l;)V", "m", "LBd/a;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Bd.a f61139m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$fetchImage$1", f = "KompassViewModel.kt", l = {168}, m = "invokeSuspend")
    /* renamed from: Jd.a$a  reason: collision with other inner class name */
    static final class C1005a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61140c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f61141d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f61142e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<Bitmap, C16807N> f61143f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<Throwable, C16807N> f61144g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$fetchImage$1$1", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Jd.a$a$a  reason: collision with other inner class name */
        static final class C1006a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61145c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Bitmap, C16807N> f61146d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Bitmap f61147e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1006a(C17642l<? super Bitmap, C16807N> lVar, Bitmap bitmap, C17164e<? super C1006a> eVar) {
                super(2, eVar);
                this.f61146d = lVar;
                this.f61147e = bitmap;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1006a(this.f61146d, this.f61147e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1006a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61145c == 0) {
                    y.b(obj);
                    C17642l<Bitmap, C16807N> lVar = this.f61146d;
                    Bitmap bitmap = this.f61147e;
                    C17542s.g(bitmap);
                    lVar.invoke(bitmap);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$fetchImage$1$2", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Jd.a$a$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61148c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Throwable, C16807N> f61149d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ m f61150e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C17642l<? super Throwable, C16807N> lVar, m mVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f61149d = lVar;
                this.f61150e = mVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f61149d, this.f61150e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61148c == 0) {
                    y.b(obj);
                    this.f61149d.invoke(this.f61150e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$fetchImage$1$3", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Jd.a$a$c */
        static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61151c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Throwable, C16807N> f61152d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Exception f61153e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C17642l<? super Throwable, C16807N> lVar, Exception exc, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f61152d = lVar;
                this.f61153e = exc;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new c(this.f61152d, this.f61153e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61151c == 0) {
                    y.b(obj);
                    this.f61152d.invoke(this.f61153e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1005a(a aVar, String str, C17642l<? super Bitmap, C16807N> lVar, C17642l<? super Throwable, C16807N> lVar2, C17164e<? super C1005a> eVar) {
            super(2, eVar);
            this.f61141d = aVar;
            this.f61142e = str;
            this.f61143f = lVar;
            this.f61144g = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1005a(this.f61141d, this.f61142e, this.f61143f, this.f61144g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1005a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61140c;
            if (i10 == 0) {
                y.b(obj);
                Bd.a h10 = this.f61141d.f61139m;
                String str = this.f61142e;
                this.f61140c = 1;
                obj = h10.b(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (m e10) {
                    Log.e("fetchImage", "Error fetching image HTTP error " + e10.a() + " with URL: " + this.f61142e, e10);
                    F0 unused = C16314k.d(g0.a(this.f61141d), C16311i0.c(), (T) null, new b(this.f61144g, e10, (C17164e<? super b>) null), 2, (Object) null);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    Log.e("fetchImage", "Error fetching image: " + e11 + " with URL: " + this.f61142e);
                    F0 unused2 = C16314k.d(g0.a(this.f61141d), C16311i0.c(), (T) null, new c(this.f61144g, e11, (C17164e<? super c>) null), 2, (Object) null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F0 unused3 = C16314k.d(g0.a(this.f61141d), C16311i0.c(), (T) null, new C1006a(this.f61143f, BitmapFactory.decodeStream(((C15777E) obj).c()), (C17164e<? super C1006a>) null), 2, (Object) null);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getBackground$2", f = "KompassViewModel.kt", l = {135}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61154c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f61155d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f61156e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f61157f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f61158g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f61159h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C10444O f61160i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<FeatureCollection, C16807N> f61161j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<Throwable, C16807N> f61162k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getBackground$2$1", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Jd.a$b$a  reason: collision with other inner class name */
        static final class C1007a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61163c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<FeatureCollection, C16807N> f61164d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ FeatureCollection f61165e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1007a(C17642l<? super FeatureCollection, C16807N> lVar, FeatureCollection featureCollection, C17164e<? super C1007a> eVar) {
                super(2, eVar);
                this.f61164d = lVar;
                this.f61165e = featureCollection;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1007a(this.f61164d, this.f61165e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1007a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61163c == 0) {
                    y.b(obj);
                    this.f61164d.invoke(this.f61165e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getBackground$2$2", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Jd.a$b$b  reason: collision with other inner class name */
        static final class C1008b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61166c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Throwable, C16807N> f61167d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ m f61168e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1008b(C17642l<? super Throwable, C16807N> lVar, m mVar, C17164e<? super C1008b> eVar) {
                super(2, eVar);
                this.f61167d = lVar;
                this.f61168e = mVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1008b(this.f61167d, this.f61168e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1008b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61166c == 0) {
                    y.b(obj);
                    this.f61167d.invoke(this.f61168e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getBackground$2$3", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61169c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Throwable, C16807N> f61170d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Exception f61171e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C17642l<? super Throwable, C16807N> lVar, Exception exc, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f61170d = lVar;
                this.f61171e = exc;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new c(this.f61170d, this.f61171e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61169c == 0) {
                    y.b(obj);
                    this.f61170d.invoke(this.f61171e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, String str, String str2, String str3, String str4, C10444O o10, C17642l<? super FeatureCollection, C16807N> lVar, C17642l<? super Throwable, C16807N> lVar2, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f61155d = aVar;
            this.f61156e = str;
            this.f61157f = str2;
            this.f61158g = str3;
            this.f61159h = str4;
            this.f61160i = o10;
            this.f61161j = lVar;
            this.f61162k = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f61155d, this.f61156e, this.f61157f, this.f61158g, this.f61159h, this.f61160i, this.f61161j, this.f61162k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61154c;
            if (i10 == 0) {
                y.b(obj);
                Bd.a h10 = this.f61155d.f61139m;
                String str = this.f61156e;
                String str2 = this.f61157f;
                String str3 = this.f61158g;
                String str4 = this.f61159h;
                C10444O o10 = this.f61160i;
                this.f61154c = 1;
                obj = h10.d(str, str2, str3, str4, o10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (m e10) {
                    Log.e("getBackground", "Error fetching background HTTP error " + e10.a() + " with parameters: StoreNo = " + this.f61159h, e10);
                    F0 unused = C16314k.d(g0.a(this.f61155d), C16311i0.b(), (T) null, new C1008b(this.f61162k, e10, (C17164e<? super C1008b>) null), 2, (Object) null);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    Log.e("getBackground", "Error fetching background: " + e11 + " with parameters: StoreNo = " + this.f61159h);
                    F0 unused2 = C16314k.d(g0.a(this.f61155d), C16311i0.b(), (T) null, new c(this.f61162k, e11, (C17164e<? super c>) null), 2, (Object) null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F0 unused3 = C16314k.d(g0.a(this.f61155d), C16311i0.b(), (T) null, new C1007a(this.f61161j, (FeatureCollection) obj, (C17164e<? super C1007a>) null), 2, (Object) null);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getProduct$2", f = "KompassViewModel.kt", l = {94}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61172c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f61173d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f61174e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f61175f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f61176g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f61177h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f61178i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f61179j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f61180k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f61181l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17642l<Product, C16807N> f61182m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17642l<Throwable, C16807N> f61183n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getProduct$2$1", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Jd.a$c$a  reason: collision with other inner class name */
        static final class C1009a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61184c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Product, C16807N> f61185d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Product f61186e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1009a(C17642l<? super Product, C16807N> lVar, Product product, C17164e<? super C1009a> eVar) {
                super(2, eVar);
                this.f61185d = lVar;
                this.f61186e = product;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1009a(this.f61185d, this.f61186e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1009a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61184c == 0) {
                    y.b(obj);
                    this.f61185d.invoke(this.f61186e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getProduct$2$2", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61187c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Throwable, C16807N> f61188d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ m f61189e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C17642l<? super Throwable, C16807N> lVar, m mVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f61188d = lVar;
                this.f61189e = mVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f61188d, this.f61189e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61187c == 0) {
                    y.b(obj);
                    this.f61188d.invoke(this.f61189e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getProduct$2$3", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Jd.a$c$c  reason: collision with other inner class name */
        static final class C1010c extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61190c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Throwable, C16807N> f61191d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Exception f61192e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1010c(C17642l<? super Throwable, C16807N> lVar, Exception exc, C17164e<? super C1010c> eVar) {
                super(2, eVar);
                this.f61191d = lVar;
                this.f61192e = exc;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1010c(this.f61191d, this.f61192e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1010c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61190c == 0) {
                    y.b(obj);
                    this.f61191d.invoke(this.f61192e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, C17642l<? super Product, C16807N> lVar, C17642l<? super Throwable, C16807N> lVar2, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f61174e = aVar;
            this.f61175f = str;
            this.f61176g = str2;
            this.f61177h = str3;
            this.f61178i = str4;
            this.f61179j = str5;
            this.f61180k = str6;
            this.f61181l = map;
            this.f61182m = lVar;
            this.f61183n = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f61174e, this.f61175f, this.f61176g, this.f61177h, this.f61178i, this.f61179j, this.f61180k, this.f61181l, this.f61182m, this.f61183n, eVar);
            cVar.f61173d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
            r16 = "getProduct";
            r15 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
            r16 = "getProduct";
            r15 = null;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0017, B:15:0x003c] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0020 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:3:0x0017] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r10 = r17
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f61172c
                java.lang.String r11 = ", LanguageCode = "
                java.lang.String r12 = ", RuCode = "
                java.lang.String r13 = ", ProductId = "
                java.lang.String r14 = " with parameters: StoreNo = "
                java.lang.String r15 = "getProduct"
                r2 = 1
                if (r1 == 0) goto L_0x0033
                if (r1 != r2) goto L_0x002b
                XH.y.b(r18)     // Catch:{ m -> 0x0026, Exception -> 0x0020 }
                r1 = r18
                r16 = r15
                r15 = 0
                goto L_0x0063
            L_0x0020:
                r0 = move-exception
                r16 = r15
                r15 = 0
                goto L_0x0089
            L_0x0026:
                r0 = move-exception
                r2 = r15
                r15 = 0
                goto L_0x00da
            L_0x002b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0033:
                XH.y.b(r18)
                java.lang.Object r1 = r10.f61173d
                QJ.Q r1 = (QJ.Q) r1
                Jd.a r1 = r10.f61174e     // Catch:{ m -> 0x0026, Exception -> 0x0020 }
                java.lang.String r3 = r10.f61179j     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                java.lang.String r4 = r10.f61180k     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                java.lang.String r5 = r10.f61175f     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                java.lang.String r6 = r10.f61176g     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                java.lang.String r7 = r10.f61177h     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                java.lang.String r8 = r10.f61178i     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                java.util.Map<java.lang.String, java.lang.String> r9 = r10.f61181l     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                Bd.a r1 = r1.f61139m     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                r10.f61172c = r2     // Catch:{ m -> 0x0084, Exception -> 0x0020 }
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r16 = r15
                r15 = 0
                r9 = r17
                java.lang.Object r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                if (r1 != r0) goto L_0x0063
                return r0
            L_0x0063:
                com.ikea.kompassmap.model.product.Product r1 = (com.ikea.kompassmap.model.product.Product) r1     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                Jd.a r0 = r10.f61174e     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                QJ.Q r2 = androidx.lifecycle.g0.a(r0)     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                QJ.M r3 = QJ.C16311i0.b()     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                Jd.a$c$a r5 = new Jd.a$c$a     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                nI.l<com.ikea.kompassmap.model.product.Product, XH.N> r0 = r10.f61182m     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                r5.<init>(r0, r1, r15)     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                r6 = 2
                r7 = 0
                r4 = 0
                QJ.F0 unused = QJ.C16314k.d(r2, r3, r4, r5, r6, r7)     // Catch:{ m -> 0x0080, Exception -> 0x007e }
                goto L_0x0129
            L_0x007e:
                r0 = move-exception
                goto L_0x0089
            L_0x0080:
                r0 = move-exception
            L_0x0081:
                r2 = r16
                goto L_0x00da
            L_0x0084:
                r0 = move-exception
                r16 = r15
                r15 = 0
                goto L_0x0081
            L_0x0089:
                r0.printStackTrace()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Error fetching product: "
                r1.append(r2)
                r1.append(r0)
                r1.append(r14)
                java.lang.String r2 = r10.f61175f
                r1.append(r2)
                r1.append(r13)
                java.lang.String r2 = r10.f61176g
                r1.append(r2)
                r1.append(r12)
                java.lang.String r2 = r10.f61177h
                r1.append(r2)
                r1.append(r11)
                java.lang.String r2 = r10.f61178i
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = r16
                android.util.Log.e(r2, r1)
                Jd.a r1 = r10.f61174e
                QJ.Q r2 = androidx.lifecycle.g0.a(r1)
                QJ.M r3 = QJ.C16311i0.b()
                Jd.a$c$c r5 = new Jd.a$c$c
                nI.l<java.lang.Throwable, XH.N> r1 = r10.f61183n
                r5.<init>(r1, r0, r15)
                r6 = 2
                r7 = 0
                r4 = 0
                QJ.F0 unused = QJ.C16314k.d(r2, r3, r4, r5, r6, r7)
                goto L_0x0129
            L_0x00da:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Error fetching product HTTP error "
                r1.append(r3)
                int r3 = r0.a()
                r1.append(r3)
                r1.append(r14)
                java.lang.String r3 = r10.f61175f
                r1.append(r3)
                r1.append(r13)
                java.lang.String r3 = r10.f61176g
                r1.append(r3)
                r1.append(r12)
                java.lang.String r3 = r10.f61177h
                r1.append(r3)
                r1.append(r11)
                java.lang.String r3 = r10.f61178i
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r2, r1, r0)
                Jd.a r1 = r10.f61174e
                QJ.Q r2 = androidx.lifecycle.g0.a(r1)
                QJ.M r3 = QJ.C16311i0.b()
                Jd.a$c$b r5 = new Jd.a$c$b
                nI.l<java.lang.Throwable, XH.N> r1 = r10.f61183n
                r5.<init>(r1, r0, r15)
                r6 = 2
                r7 = 0
                r4 = 0
                QJ.F0 unused = QJ.C16314k.d(r2, r3, r4, r5, r6, r7)
            L_0x0129:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Jd.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getStore$2", f = "KompassViewModel.kt", l = {44, 45, 55}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f61193c;

        /* renamed from: d  reason: collision with root package name */
        int f61194d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f61195e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f61196f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f61197g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f61198h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f61199i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f61200j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f61201k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f61202l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f61203m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f61204n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f61205o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C17642l<Store, C16807N> f61206p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C17642l<Exception, C16807N> f61207q;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getStore$2$1", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Jd.a$d$a  reason: collision with other inner class name */
        static final class C1011a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61208c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Store, C16807N> f61209d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Store f61210e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1011a(C17642l<? super Store, C16807N> lVar, Store store, C17164e<? super C1011a> eVar) {
                super(2, eVar);
                this.f61209d = lVar;
                this.f61210e = store;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1011a(this.f61209d, this.f61210e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1011a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61208c == 0) {
                    y.b(obj);
                    this.f61209d.invoke(this.f61210e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getStore$2$2", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61211c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Exception, C16807N> f61212d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ m f61213e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C17642l<? super Exception, C16807N> lVar, m mVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f61212d = lVar;
                this.f61213e = mVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f61212d, this.f61213e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61211c == 0) {
                    y.b(obj);
                    this.f61212d.invoke(this.f61213e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
        @f(c = "com.ikea.kompassmap.viewModel.KompassViewModel$getStore$2$3", f = "KompassViewModel.kt", l = {}, m = "invokeSuspend")
        static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61214c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Exception, C16807N> f61215d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Exception f61216e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C17642l<? super Exception, C16807N> lVar, Exception exc, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f61215d = lVar;
                this.f61216e = exc;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new c(this.f61215d, this.f61216e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f61214c == 0) {
                    y.b(obj);
                    this.f61215d.invoke(this.f61216e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, String str, String str2, a aVar, String str3, String str4, String str5, Map<String, String> map, String str6, String str7, C17642l<? super Store, C16807N> lVar, C17642l<? super Exception, C16807N> lVar2, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f61196f = context;
            this.f61197g = str;
            this.f61198h = str2;
            this.f61199i = aVar;
            this.f61200j = str3;
            this.f61201k = str4;
            this.f61202l = str5;
            this.f61203m = map;
            this.f61204n = str6;
            this.f61205o = str7;
            this.f61206p = lVar;
            this.f61207q = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f61196f, this.f61197g, this.f61198h, this.f61199i, this.f61200j, this.f61201k, this.f61202l, this.f61203m, this.f61204n, this.f61205o, this.f61206p, this.f61207q, eVar);
            dVar.f61195e = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: type inference failed for: r12v1, types: [dI.e] */
        /* JADX WARNING: type inference failed for: r12v2, types: [dI.e] */
        /* JADX WARNING: type inference failed for: r12v3, types: [dI.e] */
        /* JADX WARNING: type inference failed for: r12v10 */
        /* JADX WARNING: type inference failed for: r12v13 */
        /* JADX WARNING: type inference failed for: r12v14 */
        /* JADX WARNING: type inference failed for: r12v17 */
        /* JADX WARNING: type inference failed for: r12v19 */
        /* JADX WARNING: type inference failed for: r12v20 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            r22 = "getStore";
            r23 = " with parameters: StoreNo = ";
            r24 = ", RuCode = ";
            r20 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
            r24 = ", RuCode = ";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x013c, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x013d, code lost:
            r22 = "getStore";
            r23 = " with parameters: StoreNo = ";
            r24 = ", RuCode = ";
            r20 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
            r0 = e;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0025, B:28:0x007c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:42:0x00a9] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0100 A[Catch:{ m -> 0x0107, Exception -> 0x0104 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0101 A[Catch:{ m -> 0x0107, Exception -> 0x0104 }] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0033 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:6:0x0025] */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                r25 = this;
                r11 = r25
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f61194d
                java.lang.String r12 = ", ExtraParameter = "
                java.lang.String r13 = ", SupportedPlatform = "
                java.lang.String r14 = ", SupportedStatus = "
                java.lang.String r15 = ", LanguageCode = "
                java.lang.String r10 = ", RuCode = "
                java.lang.String r9 = " with parameters: StoreNo = "
                java.lang.String r8 = "getStore"
                r7 = 3
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0073
                if (r1 == r3) goto L_0x0069
                if (r1 == r2) goto L_0x004f
                if (r1 != r7) goto L_0x0047
                java.lang.Object r0 = r11.f61195e
                com.ikea.kompassmap.model.store.Store r0 = (com.ikea.kompassmap.model.store.Store) r0
                XH.y.b(r26)     // Catch:{ m -> 0x003f, Exception -> 0x0033 }
                r22 = r8
                r23 = r9
                r24 = r10
                r20 = r12
                r12 = 0
                goto L_0x0102
            L_0x0033:
                r0 = move-exception
                r22 = r8
                r23 = r9
                r24 = r10
                r20 = r12
            L_0x003c:
                r12 = 0
                goto L_0x0168
            L_0x003f:
                r0 = move-exception
                r5 = r8
                r2 = r9
                r3 = r10
                r4 = r12
            L_0x0044:
                r12 = 0
                goto L_0x01cf
            L_0x0047:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x004f:
                java.lang.Object r1 = r11.f61193c
                android.content.Context r1 = (android.content.Context) r1
                java.lang.Object r2 = r11.f61195e
                java.lang.String r2 = (java.lang.String) r2
                XH.y.b(r26)     // Catch:{ m -> 0x003f, Exception -> 0x0033 }
                r3 = r2
                r22 = r8
                r23 = r9
                r24 = r10
                r20 = r12
                r12 = 0
                r2 = r1
                r1 = r26
                goto L_0x00ef
            L_0x0069:
                java.lang.Object r1 = r11.f61195e
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r26)     // Catch:{ m -> 0x003f, Exception -> 0x0033 }
                r1 = r26
                goto L_0x008d
            L_0x0073:
                XH.y.b(r26)
                java.lang.Object r1 = r11.f61195e
                QJ.Q r1 = (QJ.Q) r1
                yd.n r4 = yd.C10460n.f77928a     // Catch:{ m -> 0x003f, Exception -> 0x0033 }
                android.content.Context r5 = r11.f61196f     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.String r6 = r11.f61197g     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.String r7 = r11.f61198h     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                r11.f61195e = r1     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                r11.f61194d = r3     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.Object r1 = r4.g(r5, r6, r7, r11)     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                if (r1 != r0) goto L_0x008d
                return r0
            L_0x008d:
                com.ikea.kompassmap.model.store.Store r1 = (com.ikea.kompassmap.model.store.Store) r1     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                if (r1 != 0) goto L_0x0146
                Jd.a r1 = r11.f61199i     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.String r3 = r11.f61204n     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.String r4 = r11.f61205o     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.String r5 = r11.f61197g     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.String r6 = r11.f61200j     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.String r7 = r11.f61198h     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                java.lang.String r2 = r11.f61201k     // Catch:{ m -> 0x013c, Exception -> 0x0033 }
                r18 = r8
                java.lang.String r8 = r11.f61202l     // Catch:{ m -> 0x0132, Exception -> 0x0127 }
                r19 = r9
                java.util.Map<java.lang.String, java.lang.String> r9 = r11.f61203m     // Catch:{ m -> 0x0121, Exception -> 0x011b }
                r20 = r12
                android.content.Context r12 = r11.f61196f     // Catch:{ m -> 0x0112, Exception -> 0x00b6 }
                Bd.a r1 = r1.f61139m     // Catch:{ m -> 0x0112, Exception -> 0x00b6 }
                if (r2 != 0) goto L_0x00b3
                java.lang.String r2 = "Live"
            L_0x00b3:
                r21 = r2
                goto L_0x00c9
            L_0x00b6:
                r0 = move-exception
                r24 = r10
            L_0x00b9:
                r22 = r18
                r23 = r19
                goto L_0x003c
            L_0x00bf:
                r0 = move-exception
                r3 = r10
                r5 = r18
                r2 = r19
                r4 = r20
                goto L_0x0044
            L_0x00c9:
                r11.f61195e = r7     // Catch:{ m -> 0x0112, Exception -> 0x00b6 }
                r11.f61193c = r12     // Catch:{ m -> 0x0112, Exception -> 0x00b6 }
                r2 = 2
                r11.f61194d = r2     // Catch:{ m -> 0x0112, Exception -> 0x00b6 }
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r17 = r12
                r12 = 0
                r6 = r7
                r16 = r7
                r7 = r21
                r22 = r18
                r23 = r19
                r24 = r10
                r10 = r25
                java.lang.Object r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                if (r1 != r0) goto L_0x00eb
                return r0
            L_0x00eb:
                r3 = r16
                r2 = r17
            L_0x00ef:
                com.ikea.kompassmap.model.store.Store r1 = (com.ikea.kompassmap.model.store.Store) r1     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                yd.n r4 = yd.C10460n.f77928a     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                r11.f61195e = r1     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                r11.f61193c = r12     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                r5 = 3
                r11.f61194d = r5     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                java.lang.Object r2 = r4.h(r2, r1, r3, r11)     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                if (r2 != r0) goto L_0x0101
                return r0
            L_0x0101:
                r0 = r1
            L_0x0102:
                r1 = r0
                goto L_0x014f
            L_0x0104:
                r0 = move-exception
                goto L_0x0168
            L_0x0107:
                r0 = move-exception
            L_0x0108:
                r4 = r20
                r5 = r22
                r2 = r23
                r3 = r24
                goto L_0x01cf
            L_0x0112:
                r0 = move-exception
                r24 = r10
            L_0x0115:
                r22 = r18
                r23 = r19
            L_0x0119:
                r12 = 0
                goto L_0x0108
            L_0x011b:
                r0 = move-exception
                r24 = r10
                r20 = r12
                goto L_0x00b9
            L_0x0121:
                r0 = move-exception
                r24 = r10
                r20 = r12
                goto L_0x0115
            L_0x0127:
                r0 = move-exception
                r23 = r9
                r24 = r10
                r20 = r12
                r22 = r18
                goto L_0x003c
            L_0x0132:
                r0 = move-exception
                r23 = r9
                r24 = r10
                r20 = r12
                r22 = r18
                goto L_0x0119
            L_0x013c:
                r0 = move-exception
                r22 = r8
                r23 = r9
                r24 = r10
                r20 = r12
                goto L_0x0119
            L_0x0146:
                r22 = r8
                r23 = r9
                r24 = r10
                r20 = r12
                r12 = 0
            L_0x014f:
                Jd.a r0 = r11.f61199i     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                QJ.Q r2 = androidx.lifecycle.g0.a(r0)     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                QJ.M r3 = QJ.C16311i0.b()     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                Jd.a$d$a r5 = new Jd.a$d$a     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                nI.l<com.ikea.kompassmap.model.store.Store, XH.N> r0 = r11.f61206p     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                r5.<init>(r0, r1, r12)     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                r6 = 2
                r7 = 0
                r4 = 0
                QJ.F0 unused = QJ.C16314k.d(r2, r3, r4, r5, r6, r7)     // Catch:{ m -> 0x0107, Exception -> 0x0104 }
                goto L_0x022e
            L_0x0168:
                r0.printStackTrace()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Error fetching store: "
                r1.append(r2)
                r1.append(r0)
                r2 = r23
                r1.append(r2)
                java.lang.String r2 = r11.f61197g
                r1.append(r2)
                r3 = r24
                r1.append(r3)
                java.lang.String r2 = r11.f61200j
                r1.append(r2)
                r1.append(r15)
                java.lang.String r2 = r11.f61198h
                r1.append(r2)
                r1.append(r14)
                java.lang.String r2 = r11.f61201k
                r1.append(r2)
                r1.append(r13)
                java.lang.String r2 = r11.f61202l
                r1.append(r2)
                r4 = r20
                r1.append(r4)
                java.util.Map<java.lang.String, java.lang.String> r2 = r11.f61203m
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5 = r22
                android.util.Log.e(r5, r1)
                Jd.a r1 = r11.f61199i
                QJ.Q r2 = androidx.lifecycle.g0.a(r1)
                QJ.M r3 = QJ.C16311i0.b()
                Jd.a$d$c r5 = new Jd.a$d$c
                nI.l<java.lang.Exception, XH.N> r1 = r11.f61207q
                r5.<init>(r1, r0, r12)
                r6 = 2
                r7 = 0
                r4 = 0
                QJ.F0 unused = QJ.C16314k.d(r2, r3, r4, r5, r6, r7)
                goto L_0x022e
            L_0x01cf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "Error fetching store HTTP error "
                r1.append(r6)
                int r6 = r0.a()
                r1.append(r6)
                r1.append(r2)
                java.lang.String r2 = r11.f61197g
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = r11.f61200j
                r1.append(r2)
                r1.append(r15)
                java.lang.String r2 = r11.f61198h
                r1.append(r2)
                r1.append(r14)
                java.lang.String r2 = r11.f61201k
                r1.append(r2)
                r1.append(r13)
                java.lang.String r2 = r11.f61202l
                r1.append(r2)
                r1.append(r4)
                java.util.Map<java.lang.String, java.lang.String> r2 = r11.f61203m
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r5, r1, r0)
                Jd.a r1 = r11.f61199i
                QJ.Q r2 = androidx.lifecycle.g0.a(r1)
                QJ.M r3 = QJ.C16311i0.b()
                Jd.a$d$b r5 = new Jd.a$d$b
                nI.l<java.lang.Exception, XH.N> r1 = r11.f61207q
                r5.<init>(r1, r0, r12)
                r6 = 2
                r7 = 0
                r4 = 0
                QJ.F0 unused = QJ.C16314k.d(r2, r3, r4, r5, r6, r7)
            L_0x022e:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Jd.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Bd.a aVar) {
        C17542s.j(aVar, "kompassRepository");
        this.f61139m = aVar;
    }

    public final Object C(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, Context context, C17642l<? super Store, C16807N> lVar, C17642l<? super Exception, C16807N> lVar2, C17164e<? super C16807N> eVar) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new d(context, str3, str5, this, str4, str6, str7, map, str, str2, lVar, lVar2, (C17164e<? super d>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    public final void i(String str, C17642l<? super Bitmap, C16807N> lVar, C17642l<? super Throwable, C16807N> lVar2) {
        C17542s.j(str, "url");
        C17542s.j(lVar, "onSuccess");
        C17542s.j(lVar2, "onError");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C1005a(this, str, lVar, lVar2, (C17164e<? super C1005a>) null), 3, (Object) null);
    }

    public final Object j(String str, String str2, String str3, String str4, C10444O o10, C17642l<? super FeatureCollection, C16807N> lVar, C17642l<? super Throwable, C16807N> lVar2, C17164e<? super C16807N> eVar) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, str, str2, str3, str4, o10, lVar, lVar2, (C17164e<? super b>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    public final Object k(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, C17642l<? super Product, C16807N> lVar, C17642l<? super Throwable, C16807N> lVar2, C17164e<? super C16807N> eVar) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(this, str3, str4, str5, str6, str, str2, map, lVar, lVar2, (C17164e<? super c>) null), 3, (Object) null);
        return C16807N.f139792a;
    }
}
