package oi;

import HJ.C15854t;
import KJ.C15987c;
import Kf.C9133b;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16509F;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16820k;
import XH.t;
import XH.x;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Media;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mi.l;
import nI.p;
import nI.q;
import ni.g;
import ni.h;
import ni.i;
import oi.a;
import oi.f;
import pp.C11767a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020&0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030*8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002060*8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010,R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002060*8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010,R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020<0;8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b\u001e\u0010?¨\u0006A"}, d2 = {"Loi/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lni/c;", "getProductDetailsUseCase", "Lni/a;", "getPipConfigUseCase", "Lni/e;", "getShareItemUrlUseCase", "Lmi/d;", "pipUiStateMapper", "LMg/b;", "localHistoryRepository", "LKf/b;", "cartApi", "<init>", "(Landroidx/lifecycle/U;Lni/c;Lni/a;Lni/e;Lmi/d;LMg/b;LKf/b;)V", "LXH/N;", "H", "()V", "Loi/f$c;", "shareData", "I", "(Loi/f$c;)V", "J", "Loi/f;", "action", "K", "(Loi/f;)V", "m", "Lni/e;", "n", "Lmi/d;", "o", "LMg/b;", "p", "LKf/b;", "", "q", "Ljava/lang/String;", "initialItemNo", "LTJ/B;", "r", "LTJ/B;", "currentItemNo", "LTJ/F;", "Lni/h;", "s", "LTJ/F;", "productDetailsState", "Loi/a;", "t", "messageState", "", "u", "shareItemLoading", "v", "isAddingToCart", "LTJ/P;", "Lmi/l;", "w", "LTJ/P;", "()LTJ/P;", "uiState", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final ni.e f75764m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final mi.d f75765n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Mg.b f75766o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C9133b f75767p;

    /* renamed from: q  reason: collision with root package name */
    private final String f75768q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<String> f75769r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16509F<h> f75770s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<a> f75771t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<Boolean> f75772u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<Boolean> f75773v;

    /* renamed from: w  reason: collision with root package name */
    private final C16519P<l> f75774w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v3.viewmodel.PipViewModelV3$doAddToCart$2", f = "PipViewModelV3.kt", l = {108}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f75775c;

        /* renamed from: d  reason: collision with root package name */
        Object f75776d;

        /* renamed from: e  reason: collision with root package name */
        Object f75777e;

        /* renamed from: f  reason: collision with root package name */
        int f75778f;

        /* renamed from: g  reason: collision with root package name */
        int f75779g;

        /* renamed from: h  reason: collision with root package name */
        int f75780h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f75781i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f75782j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f75782j = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f75782j, eVar);
            aVar.f75781i = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object obj2;
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f75780h;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f75781i;
                b bVar = this.f75782j;
                x.a aVar = x.f139812b;
                C9133b h10 = bVar.f75767p;
                List e10 = C16877v.e(new Kf.y((String) bVar.f75769r.getValue(), 1));
                Interaction$Component interaction$Component = Interaction$Component.PIP_ADD_TO_CART_BUTTON;
                this.f75781i = q10;
                this.f75775c = q10;
                this.f75776d = bVar;
                this.f75777e = q10;
                this.f75778f = 0;
                this.f75779g = 0;
                this.f75780h = 1;
                if (h10.b(e10, interaction$Component, (String) null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f75777e;
                b bVar2 = (b) this.f75776d;
                Q q12 = (Q) this.f75775c;
                q10 = (Q) this.f75781i;
                try {
                    y.b(obj);
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    x.a aVar2 = x.f139812b;
                    obj2 = x.b(y.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = x.b(C16807N.f139792a);
            b bVar3 = this.f75782j;
            Throwable e12 = x.e(obj2);
            if (e12 == null) {
                C16807N n10 = (C16807N) obj2;
            } else {
                qv.e eVar = qv.e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar4 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Unable to add to cart", e12);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar4.a(eVar, str4, false, e12, str3);
                    str = str3;
                    str2 = str4;
                }
                C9133b.a c10 = bVar3.f75767p.c(e12, (String) null);
                C16505B C10 = bVar3.f75771t;
                do {
                    value2 = C10.getValue();
                    a aVar3 = (a) value2;
                } while (!C10.e(value2, new a.C1387a(c10)));
            }
            C16505B G10 = this.f75782j.f75773v;
            do {
                value = G10.getValue();
                ((Boolean) value).booleanValue();
            } while (!G10.e(value, kotlin.coroutines.jvm.internal.b.a(false)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v3.viewmodel.PipViewModelV3$handleShareClicked$1", f = "PipViewModelV3.kt", l = {141}, m = "invokeSuspend")
    /* renamed from: oi.b$b  reason: collision with other inner class name */
    static final class C1388b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f75783c;

        /* renamed from: d  reason: collision with root package name */
        Object f75784d;

        /* renamed from: e  reason: collision with root package name */
        Object f75785e;

        /* renamed from: f  reason: collision with root package name */
        int f75786f;

        /* renamed from: g  reason: collision with root package name */
        int f75787g;

        /* renamed from: h  reason: collision with root package name */
        int f75788h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f75789i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f.c f75790j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1388b(b bVar, f.c cVar, C17164e<? super C1388b> eVar) {
            super(2, eVar);
            this.f75789i = bVar;
            this.f75790j = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1388b(this.f75789i, this.f75790j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1388b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object obj2;
            Object value3;
            Boolean a10;
            Object f10 = C17187b.f();
            int i10 = this.f75788h;
            if (i10 == 0) {
                y.b(obj);
                C16505B F10 = this.f75789i.f75772u;
                do {
                    value3 = F10.getValue();
                    ((Boolean) value3).booleanValue();
                    a10 = kotlin.coroutines.jvm.internal.b.a(true);
                } while (!F10.e(value3, a10));
                ni.e j10 = this.f75789i.f75764m;
                String a11 = this.f75790j.a();
                String b10 = this.f75790j.b();
                this.f75783c = F10;
                this.f75784d = value3;
                this.f75785e = a10;
                this.f75786f = 0;
                this.f75787g = 0;
                this.f75788h = 1;
                obj = j10.a(a11, b10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Boolean bool = (Boolean) this.f75785e;
                C16505B b11 = (C16505B) this.f75783c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i iVar = (i) obj;
            C16505B F11 = this.f75789i.f75772u;
            do {
                value = F11.getValue();
                ((Boolean) value).booleanValue();
            } while (!F11.e(value, kotlin.coroutines.jvm.internal.b.a(false)));
            C16505B C10 = this.f75789i.f75771t;
            f.c cVar = this.f75790j;
            do {
                value2 = C10.getValue();
                a aVar = (a) value2;
                if (iVar instanceof i.a) {
                    obj2 = a.b.f75760a;
                } else if (iVar instanceof i.b) {
                    obj2 = new a.c(((i.b) iVar).a(), cVar.d(), cVar.c());
                } else {
                    throw new t();
                }
            } while (!C10.e(value2, obj2));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v3.viewmodel.PipViewModelV3$observeAndAddItemToLocalHistory$1", f = "PipViewModelV3.kt", l = {163}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75791c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f75792d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f75793a;

            a(b bVar) {
                this.f75793a = bVar;
            }

            /* renamed from: c */
            public final Object emit(h hVar, C17164e<? super C16807N> eVar) {
                Object obj;
                if (hVar.d() != null && hVar.c() == null && !hVar.e()) {
                    Iterator it = hVar.d().a().g().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((Media) obj) instanceof Media.Image) {
                            break;
                        }
                    }
                    Media media = (Media) obj;
                    if (media != null) {
                        this.f75793a.f75766o.e(hVar.d().a().i(), media.getUrl(), hVar.d().a().h().i());
                    }
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f75792d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f75792d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f75791c;
            if (i10 == 0) {
                y.b(obj);
                C16509F E10 = this.f75792d.f75770s;
                a aVar = new a(this.f75792d);
                this.f75791c = 1;
                if (E10.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v3.viewmodel.PipViewModelV3$special$$inlined$flatMapLatest$1", f = "PipViewModelV3.kt", l = {189}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super h>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75794c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f75795d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f75796e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ni.c f75797f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, ni.c cVar) {
            super(3, eVar);
            this.f75797f = cVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super h> hVar, String str, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar, this.f75797f);
            dVar.f75795d = hVar;
            dVar.f75796e = str;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f75794c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<h> a10 = this.f75797f.a((String) this.f75796e, C11767a.NETWORK);
                this.f75794c = 1;
                if (C16534i.x((C16533h) this.f75795d, a10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lni/h;", "productDetailsState", "Lni/g;", "pipConfig", "", "shareItemLoading", "Loi/a;", "messageState", "itemAddingToCart", "Lmi/l;", "<anonymous>", "(Lni/h;Lni/g;ZLoi/a;Z)Lmi/l;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v3.viewmodel.PipViewModelV3$uiState$1", f = "PipViewModelV3.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.t<h, g, Boolean, a, Boolean, C17164e<? super l>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75798c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f75799d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f75800e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f75801f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f75802g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ boolean f75803h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f75804i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C17164e<? super e> eVar) {
            super(6, eVar);
            this.f75804i = bVar;
        }

        public final Object i(h hVar, g gVar, boolean z10, a aVar, boolean z11, C17164e<? super l> eVar) {
            e eVar2 = new e(this.f75804i, eVar);
            eVar2.f75799d = hVar;
            eVar2.f75800e = gVar;
            eVar2.f75801f = z10;
            eVar2.f75802g = aVar;
            eVar2.f75803h = z11;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f75798c == 0) {
                y.b(obj);
                boolean z10 = this.f75803h;
                return this.f75804i.f75765n.f((h) this.f75799d, (g) this.f75800e, this.f75801f, (a) this.f75802g, z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return i((h) obj, (g) obj2, ((Boolean) obj3).booleanValue(), (a) obj4, ((Boolean) obj5).booleanValue(), (C17164e) obj6);
        }
    }

    public b(U u10, ni.c cVar, ni.a aVar, ni.e eVar, mi.d dVar, Mg.b bVar, C9133b bVar2) {
        U u11 = u10;
        ni.c cVar2 = cVar;
        ni.e eVar2 = eVar;
        mi.d dVar2 = dVar;
        Mg.b bVar3 = bVar;
        C9133b bVar4 = bVar2;
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(cVar2, "getProductDetailsUseCase");
        C17542s.j(aVar, "getPipConfigUseCase");
        C17542s.j(eVar2, "getShareItemUrlUseCase");
        C17542s.j(dVar2, "pipUiStateMapper");
        C17542s.j(bVar3, "localHistoryRepository");
        C17542s.j(bVar4, "cartApi");
        this.f75764m = eVar2;
        this.f75765n = dVar2;
        this.f75766o = bVar3;
        this.f75767p = bVar4;
        Object f10 = u10.f("itemNo");
        if (f10 != null) {
            String str = (String) f10;
            this.f75768q = str;
            C16505B<String> a10 = C16521S.a(str);
            this.f75769r = a10;
            C16509F<h> Z10 = C16534i.Z(C16534i.g0(a10, new d((C17164e) null, cVar2)), g0.a(this), ip.f.a(), 1);
            this.f75770s = Z10;
            C16505B<a> a11 = C16521S.a(null);
            this.f75771t = a11;
            Boolean bool = Boolean.FALSE;
            C16505B<Boolean> a12 = C16521S.a(bool);
            this.f75772u = a12;
            C16505B<Boolean> a13 = C16521S.a(bool);
            this.f75773v = a13;
            this.f75774w = C16534i.c0(C16534i.k(Z10, aVar.get(), a12, a11, a13, new e(this, (C17164e<? super e>) null)), g0.a(this), ip.f.a(), new l(true, false, (mi.i) null, (a) null, (C15987c) null, (mi.b) null, 62, (DefaultConstructorMarker) null));
            J();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void H() {
        Boolean value;
        C16505B<Boolean> b10 = this.f75773v;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.TRUE));
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    private final void I(f.c cVar) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C1388b(this, cVar, (C17164e<? super C1388b>) null), 3, (Object) null);
    }

    private final void J() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    public final void K(f fVar) {
        a value;
        C17542s.j(fVar, "action");
        if (C17542s.e(fVar, f.b.f75808a)) {
            C16505B<a> b10 = this.f75771t;
            do {
                value = b10.getValue();
                a aVar = value;
            } while (!b10.e(value, null));
        } else if (fVar instanceof f.c) {
            I((f.c) fVar);
        } else if (fVar instanceof f.d) {
            this.f75769r.setValue(((f.d) fVar).a());
        } else if (C17542s.e(fVar, f.a.f75807a)) {
            H();
        } else {
            throw new t();
        }
    }

    public final C16519P<l> m() {
        return this.f75774w;
    }
}
