package BD;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import GD.C12928a;
import GD.C12929b;
import GD.C12930c;
import GD.C12935h;
import GD.k;
import HJ.C15854t;
import KD.C13143a;
import LC.C13178b;
import LC.h;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import QJ.Q;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.core.model.Image;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import gs.e;
import i1.C5437c;
import jC.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.v;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5857c;
import t1.C5942c;
import xD.C15208e;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aq\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001as\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aY\u0010$\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b$\u0010%\u001a \u0010*\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H@¢\u0006\u0004\b*\u0010+¨\u0006-²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u0002²\u0006\u000e\u0010,\u001a\u00020\u001c8\n@\nX\u0002"}, d2 = {"LGD/k$b$c;", "model", "Lp0/v;", "orientation", "", "showBackOfCard", "Lkotlin/Function0;", "LXH/N;", "requestCardFlip", "Lkotlin/Function1;", "LGD/h;", "onEvent", "onReadyStateChanged", "Landroidx/compose/ui/d;", "modifier", "isLoading", "e", "(LGD/k$b$c;Lp0/v;ZLnI/a;LnI/l;LnI/l;Landroidx/compose/ui/d;ZLU0/m;II)V", "LGD/b;", "header", "Lt1/c;", "qrPainter", "isExpired", "LGD/a;", "background", "LxD/e;", "contentColor", "onCardDetailsClicked", "Lgs/e$c;", "onImageStateChanged", "n", "(LGD/b;Lt1/c;ZZLGD/a;LxD/e;Lp0/v;LnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "onBackClick", "LGD/c;", "onCardInfoClick", "onRemoveClick", "l", "(LGD/k$b$c;Lp0/v;LnI/a;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "Landroid/graphics/Bitmap;", "bitmap", "LjC/i;", "systemUi", "v", "(Landroid/graphics/Bitmap;LjC/i;LdI/e;)Ljava/lang/Object;", "imageState", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class G {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.wallet.impl.compose.card.prepaid.GiftCardKt$GiftCard$1$1", f = "GiftCard.kt", l = {90}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f107880c;

        /* renamed from: d  reason: collision with root package name */
        Object f107881d;

        /* renamed from: e  reason: collision with root package name */
        Object f107882e;

        /* renamed from: f  reason: collision with root package name */
        Object f107883f;

        /* renamed from: g  reason: collision with root package name */
        Object f107884g;

        /* renamed from: h  reason: collision with root package name */
        int f107885h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f107886i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f107887j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C4899r0<e.c> f107888k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C4899r0<C15208e> f107889l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i f107890m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LxD/e;", "<anonymous>", "(LQJ/Q;)LxD/e;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.wallet.impl.compose.card.prepaid.GiftCardKt$GiftCard$1$1$2", f = "GiftCard.kt", l = {91}, m = "invokeSuspend")
        /* renamed from: BD.G$a$a  reason: collision with other inner class name */
        static final class C2578a extends l implements p<Q, C17164e<? super C15208e>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f107891c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Bitmap f107892d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ i f107893e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2578a(Bitmap bitmap, i iVar, C17164e<? super C2578a> eVar) {
                super(2, eVar);
                this.f107892d = bitmap;
                this.f107893e = iVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2578a(this.f107892d, this.f107893e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C15208e> eVar) {
                return ((C2578a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f107891c;
                if (i10 == 0) {
                    y.b(obj);
                    Bitmap bitmap = this.f107892d;
                    i iVar = this.f107893e;
                    this.f107891c = 1;
                    obj = G.v(bitmap, iVar, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super Boolean, C16807N> lVar, C4899r0<e.c> r0Var, C4899r0<C15208e> r0Var2, i iVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f107887j = lVar;
            this.f107888k = r0Var;
            this.f107889l = r0Var2;
            this.f107890m = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f107887j, this.f107888k, this.f107889l, this.f107890m, eVar);
            aVar.f107886i = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C4899r0<C15208e> r0Var;
            Object f10 = C17187b.f();
            int i10 = this.f107885h;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f107886i;
                e.c r10 = G.i(this.f107888k);
                if (!(r10 instanceof e.c.a)) {
                    if (r10 instanceof e.c.C2193c) {
                        this.f107887j.invoke(kotlin.coroutines.jvm.internal.b.a(false));
                    } else if (r10 instanceof e.c.b) {
                        G.h(this.f107889l, C15208e.Light);
                        this.f107887j.invoke(kotlin.coroutines.jvm.internal.b.a(true));
                    } else if (r10 instanceof e.c.d) {
                        e.c.d dVar = (e.c.d) r10;
                        Drawable a10 = dVar.a();
                        BitmapDrawable bitmapDrawable = a10 instanceof BitmapDrawable ? (BitmapDrawable) a10 : null;
                        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
                        if (bitmap == null) {
                            qv.e eVar = qv.e.WARN;
                            ArrayList<C11819b> arrayList = new ArrayList<>();
                            for (Object next : qv.d.f102012a.a()) {
                                if (((C11819b) next).b(eVar, false)) {
                                    arrayList.add(next);
                                }
                            }
                            String str = null;
                            String str2 = null;
                            for (C11819b bVar : arrayList) {
                                if (str == null) {
                                    String a11 = C11818a.a("Drawable not BitmapDrawable: " + dVar.a() + " ", (Throwable) null);
                                    if (a11 == null) {
                                        break;
                                    }
                                    str = C11820c.a(a11);
                                }
                                if (str2 == null) {
                                    String name = q10.getClass().getName();
                                    C17542s.g(name);
                                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o12.length() != 0) {
                                        name = C15854t.P0(o12, "Kt");
                                    }
                                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                                }
                                bVar.a(eVar, str2, false, (Throwable) null, str);
                            }
                            G.h(this.f107889l, C15208e.Light);
                            this.f107887j.invoke(kotlin.coroutines.jvm.internal.b.a(true));
                        } else {
                            C4899r0<C15208e> r0Var2 = this.f107889l;
                            M a12 = C16311i0.a();
                            C2578a aVar = new C2578a(bitmap, this.f107890m, (C17164e<? super C2578a>) null);
                            this.f107886i = q10;
                            this.f107880c = r10;
                            this.f107881d = bitmap;
                            this.f107882e = bitmapDrawable;
                            this.f107883f = a10;
                            this.f107884g = r0Var2;
                            this.f107885h = 1;
                            obj2 = C16310i.g(a12, aVar, this);
                            if (obj2 == f10) {
                                return f10;
                            }
                            r0Var = r0Var2;
                        }
                    } else {
                        throw new t();
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                r0Var = (C4899r0) this.f107884g;
                Drawable drawable = (Drawable) this.f107883f;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) this.f107882e;
                Bitmap bitmap2 = (Bitmap) this.f107881d;
                e.c cVar = (e.c) this.f107880c;
                Q q11 = (Q) this.f107886i;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G.h(r0Var, (C15208e) obj2);
            this.f107887j.invoke(kotlin.coroutines.jvm.internal.b.a(true));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b.c f107894a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5942c f107895b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f107896c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f107897d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f107898e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107899f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<C15208e> f107900g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4899r0<e.c> f107901h;

        b(k.b.c cVar, C5942c cVar2, boolean z10, v vVar, C17642l<? super C12935h, C16807N> lVar, C17631a<C16807N> aVar, C4899r0<C15208e> r0Var, C4899r0<e.c> r0Var2) {
            this.f107894a = cVar;
            this.f107895b = cVar2;
            this.f107896c = z10;
            this.f107897d = vVar;
            this.f107898e = lVar;
            this.f107899f = aVar;
            this.f107900g = r0Var;
            this.f107901h = r0Var2;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, k.b.c cVar, C17631a aVar) {
            lVar.invoke(new C12935h.d.a(cVar));
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C4899r0 r0Var, e.c cVar) {
            C17542s.j(cVar, "it");
            G.j(r0Var, cVar);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5857c r16, U0.C4889m r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r11 = r17
                r1 = r18
                java.lang.String r2 = "$this$FlippableCard"
                r3 = r16
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001e
                boolean r2 = r17.l()
                if (r2 != 0) goto L_0x0019
                goto L_0x001e
            L_0x0019:
                r17.L()
                goto L_0x00c5
            L_0x001e:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002d
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.GiftCard.<anonymous> (GiftCard.kt:103)"
                r4 = -402748197(0xffffffffe7fe8cdb, float:-2.4041588E24)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002d:
                GD.k$b$c r1 = r0.f107894a
                GD.b r1 = r1.i()
                t1.c r2 = r0.f107895b
                GD.k$b$c r3 = r0.f107894a
                GD.k$b$g r3 = r3.j()
                boolean r3 = r3 instanceof GD.k.b.g.C2651b
                boolean r4 = r0.f107896c
                GD.k$b$c r5 = r0.f107894a
                GD.a r5 = r5.g()
                U0.r0<xD.e> r6 = r0.f107900g
                xD.e r6 = BD.G.g(r6)
                p0.v r7 = r0.f107897d
                r8 = 1774621528(0x69c69358, float:3.000789E25)
                r11.W(r8)
                nI.l<GD.h, XH.N> r8 = r0.f107898e
                boolean r8 = r11.V(r8)
                GD.k$b$c r9 = r0.f107894a
                boolean r9 = r11.V(r9)
                r8 = r8 | r9
                nI.a<XH.N> r9 = r0.f107899f
                boolean r9 = r11.V(r9)
                r8 = r8 | r9
                nI.l<GD.h, XH.N> r9 = r0.f107898e
                GD.k$b$c r10 = r0.f107894a
                nI.a<XH.N> r12 = r0.f107899f
                java.lang.Object r13 = r17.D()
                if (r8 != 0) goto L_0x007b
                U0.m$a r8 = U0.C4889m.f14007a
                java.lang.Object r8 = r8.a()
                if (r13 != r8) goto L_0x0083
            L_0x007b:
                BD.H r13 = new BD.H
                r13.<init>(r9, r10, r12)
                r11.u(r13)
            L_0x0083:
                r8 = r13
                nI.a r8 = (nI.C17631a) r8
                r17.P()
                r9 = 1774626733(0x69c6a7ad, float:3.0019892E25)
                r11.W(r9)
                U0.r0<gs.e$c> r9 = r0.f107901h
                java.lang.Object r10 = r17.D()
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r10 != r12) goto L_0x00a5
                BD.I r10 = new BD.I
                r10.<init>(r9)
                r11.u(r10)
            L_0x00a5:
                r9 = r10
                nI.l r9 = (nI.C17642l) r9
                r17.P()
                androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
                r12 = 1
                r13 = 0
                r14 = 0
                androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.f(r10, r14, r12, r13)
                r12 = 905969664(0x36000000, float:1.9073486E-6)
                r13 = 0
                r11 = r17
                BD.G.n(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00c5
                U0.C4895p.R()
            L_0x00c5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: BD.G.b.c(s0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b.c f107902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f107903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107904c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f107905d;

        c(k.b.c cVar, v vVar, C17631a<C16807N> aVar, C17642l<? super C12935h, C16807N> lVar) {
            this.f107902a = cVar;
            this.f107903b = vVar;
            this.f107904c = aVar;
            this.f107905d = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, C12930c cVar) {
            C17542s.j(cVar, "it");
            lVar.invoke(new C12935h.b(cVar));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, k.b.c cVar, C17631a aVar) {
            lVar.invoke(new C12935h.c.C2648c(cVar));
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5857c r12, U0.C4889m r13, int r14) {
            /*
                r11 = this;
                java.lang.String r0 = "$this$FlippableCard"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                r12 = r14 & 17
                r0 = 16
                if (r12 != r0) goto L_0x0017
                boolean r12 = r13.l()
                if (r12 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r13.L()
                goto L_0x00aa
            L_0x0017:
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x0026
                r12 = -1
                java.lang.String r0 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.GiftCard.<anonymous> (GiftCard.kt:120)"
                r1 = 176017948(0xa7dd21c, float:1.2221024E-32)
                U0.C4895p.S(r1, r14, r12, r0)
            L_0x0026:
                GD.k$b$c r2 = r11.f107902a
                p0.v r3 = r11.f107903b
                nI.a<XH.N> r4 = r11.f107904c
                r12 = 1774636452(0x69c6cda4, float:3.0042303E25)
                r13.W(r12)
                nI.l<GD.h, XH.N> r12 = r11.f107905d
                boolean r12 = r13.V(r12)
                nI.l<GD.h, XH.N> r14 = r11.f107905d
                java.lang.Object r0 = r13.D()
                if (r12 != 0) goto L_0x0048
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r0 != r12) goto L_0x0050
            L_0x0048:
                BD.J r0 = new BD.J
                r0.<init>(r14)
                r13.u(r0)
            L_0x0050:
                r5 = r0
                nI.l r5 = (nI.C17642l) r5
                r13.P()
                r12 = 1774639951(0x69c6db4f, float:3.005037E25)
                r13.W(r12)
                nI.l<GD.h, XH.N> r12 = r11.f107905d
                boolean r12 = r13.V(r12)
                GD.k$b$c r14 = r11.f107902a
                boolean r14 = r13.V(r14)
                r12 = r12 | r14
                nI.a<XH.N> r14 = r11.f107904c
                boolean r14 = r13.V(r14)
                r12 = r12 | r14
                nI.l<GD.h, XH.N> r14 = r11.f107905d
                GD.k$b$c r0 = r11.f107902a
                nI.a<XH.N> r1 = r11.f107904c
                java.lang.Object r6 = r13.D()
                if (r12 != 0) goto L_0x0084
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r6 != r12) goto L_0x008c
            L_0x0084:
                BD.K r6 = new BD.K
                r6.<init>(r14, r0, r1)
                r13.u(r6)
            L_0x008c:
                nI.a r6 = (nI.C17631a) r6
                r13.P()
                androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                r14 = 1
                r0 = 0
                r1 = 0
                androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.f(r12, r1, r14, r0)
                r9 = 196608(0x30000, float:2.75506E-40)
                r10 = 0
                r8 = r13
                BD.G.l(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x00aa
                U0.C4895p.R()
            L_0x00aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: BD.G.c.c(s0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.wallet.impl.compose.card.prepaid.GiftCardKt", f = "GiftCard.kt", l = {210}, m = "calculateContentColor")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f107906c;

        /* renamed from: d  reason: collision with root package name */
        Object f107907d;

        /* renamed from: e  reason: collision with root package name */
        Object f107908e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f107909f;

        /* renamed from: g  reason: collision with root package name */
        int f107910g;

        d(C17164e<? super d> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f107909f = obj;
            this.f107910g |= Integer.MIN_VALUE;
            return G.v((Bitmap) null, (i) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(GD.k.b.c r26, p0.v r27, boolean r28, nI.C17631a<XH.C16807N> r29, nI.C17642l<? super GD.C12935h, XH.C16807N> r30, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r31, androidx.compose.ui.d r32, boolean r33, U0.C4889m r34, int r35, int r36) {
        /*
            r9 = r26
            r15 = r27
            r14 = r29
            r13 = r30
            r12 = r31
            r11 = r35
            r10 = r36
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "requestCardFlip"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onReadyStateChanged"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -1642994812(0xffffffff9e11e384, float:-7.723285E-21)
            r1 = r34
            U0.m r8 = r1.k(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0037
            r1 = r11 | 6
            goto L_0x0047
        L_0x0037:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0046
            boolean r1 = r8.V(r9)
            if (r1 == 0) goto L_0x0043
            r1 = 4
            goto L_0x0044
        L_0x0043:
            r1 = 2
        L_0x0044:
            r1 = r1 | r11
            goto L_0x0047
        L_0x0046:
            r1 = r11
        L_0x0047:
            r2 = r10 & 2
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 48
            goto L_0x005e
        L_0x004e:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x005e
            boolean r2 = r8.V(r15)
            if (r2 == 0) goto L_0x005b
            r2 = 32
            goto L_0x005d
        L_0x005b:
            r2 = 16
        L_0x005d:
            r1 = r1 | r2
        L_0x005e:
            r2 = r10 & 4
            if (r2 == 0) goto L_0x0067
            r1 = r1 | 384(0x180, float:5.38E-43)
            r6 = r28
            goto L_0x0079
        L_0x0067:
            r2 = r11 & 384(0x180, float:5.38E-43)
            r6 = r28
            if (r2 != 0) goto L_0x0079
            boolean r2 = r8.b(r6)
            if (r2 == 0) goto L_0x0076
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0078
        L_0x0076:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0078:
            r1 = r1 | r2
        L_0x0079:
            r2 = r10 & 8
            if (r2 == 0) goto L_0x0080
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0090
        L_0x0080:
            r2 = r11 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0090
            boolean r2 = r8.F(r14)
            if (r2 == 0) goto L_0x008d
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r1 = r1 | r2
        L_0x0090:
            r2 = r10 & 16
            if (r2 == 0) goto L_0x0097
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a7
        L_0x0097:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00a7
            boolean r2 = r8.F(r13)
            if (r2 == 0) goto L_0x00a4
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r2
        L_0x00a7:
            r2 = r10 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00af
            r1 = r1 | r3
            goto L_0x00bf
        L_0x00af:
            r2 = r11 & r3
            if (r2 != 0) goto L_0x00bf
            boolean r2 = r8.F(r12)
            if (r2 == 0) goto L_0x00bc
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r1 = r1 | r2
        L_0x00bf:
            r2 = r10 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00c9
            r1 = r1 | r3
        L_0x00c6:
            r3 = r32
            goto L_0x00da
        L_0x00c9:
            r3 = r3 & r11
            if (r3 != 0) goto L_0x00c6
            r3 = r32
            boolean r4 = r8.V(r3)
            if (r4 == 0) goto L_0x00d7
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r4
        L_0x00da:
            r4 = r10 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00e5
            r1 = r1 | r16
            r5 = r33
            goto L_0x00f8
        L_0x00e5:
            r16 = r11 & r16
            r5 = r33
            if (r16 != 0) goto L_0x00f8
            boolean r16 = r8.b(r5)
            if (r16 == 0) goto L_0x00f4
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r16
        L_0x00f8:
            r16 = 4793491(0x492493, float:6.717112E-39)
            r7 = r1 & r16
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r7 != r0) goto L_0x0111
            boolean r0 = r8.l()
            if (r0 != 0) goto L_0x0109
            goto L_0x0111
        L_0x0109:
            r8.L()
            r7 = r3
            r4 = r8
            r8 = r5
            goto L_0x0245
        L_0x0111:
            if (r2 == 0) goto L_0x0118
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r20 = r0
            goto L_0x011a
        L_0x0118:
            r20 = r3
        L_0x011a:
            r0 = 0
            if (r4 == 0) goto L_0x0120
            r21 = r0
            goto L_0x0122
        L_0x0120:
            r21 = r5
        L_0x0122:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0131
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.GiftCard (GiftCard.kt:66)"
            r4 = -1642994812(0xffffffff9e11e384, float:-7.723285E-21)
            U0.C4895p.S(r4, r1, r2, r3)
        L_0x0131:
            GD.k$b$g r2 = r26.j()
            t1.c r16 = CD.e.d(r2, r8, r0)
            r7 = 0
            r5 = 1
            jC.i r4 = jC.k.c(r7, r8, r0, r5)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = -95212127(0xfffffffffa532da1, float:-2.7412503E35)
            r8.W(r3)
            java.lang.Object r3 = r8.D()
            U0.m$a r18 = U0.C4889m.f14007a
            java.lang.Object r0 = r18.a()
            if (r3 != r0) goto L_0x015b
            BD.C r3 = new BD.C
            r3.<init>()
            r8.u(r3)
        L_0x015b:
            r0 = r3
            nI.a r0 = (nI.C17631a) r0
            r8.P()
            r19 = 3072(0xc00, float:4.305E-42)
            r22 = 6
            r3 = 0
            r23 = 0
            r24 = r1
            r1 = r2
            r2 = r3
            r3 = r23
            r25 = r4
            r4 = r0
            r0 = 131072(0x20000, float:1.83671E-40)
            r5 = r8
            r6 = r19
            r10 = r7
            r0 = 2
            r7 = r22
            java.lang.Object r1 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            U0.r0 r7 = (U0.C4899r0) r7
            r1 = -95210142(0xfffffffffa533562, float:-2.7416434E35)
            r8.W(r1)
            java.lang.Object r1 = r8.D()
            java.lang.Object r2 = r18.a()
            if (r1 != r2) goto L_0x019a
            gs.e$c$a r1 = gs.e.c.a.f97965b
            U0.r0 r1 = U0.u1.e(r1, r10, r0, r10)
            r8.u(r1)
        L_0x019a:
            r10 = r1
            U0.r0 r10 = (U0.C4899r0) r10
            r8.P()
            gs.e$c r6 = i(r10)
            r0 = -95206010(0xfffffffffa534586, float:-2.7424618E35)
            r8.W(r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r24 & r0
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x01b4
            r0 = 1
            goto L_0x01b5
        L_0x01b4:
            r0 = 0
        L_0x01b5:
            boolean r1 = r8.V(r7)
            r0 = r0 | r1
            r4 = r25
            boolean r1 = r8.F(r4)
            r0 = r0 | r1
            java.lang.Object r1 = r8.D()
            if (r0 != 0) goto L_0x01cd
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x01e0
        L_0x01cd:
            BD.G$a r5 = new BD.G$a
            r17 = 0
            r0 = r5
            r1 = r31
            r2 = r10
            r3 = r7
            r11 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r8.u(r11)
            r1 = r11
        L_0x01e0:
            nI.p r1 = (nI.p) r1
            r8.P()
            int r0 = gs.e.c.f97964a
            U0.P.g(r6, r1, r8, r0)
            BD.G$b r11 = new BD.G$b
            r0 = r11
            r1 = r26
            r2 = r16
            r3 = r21
            r4 = r27
            r5 = r30
            r6 = r29
            r12 = r8
            r8 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -402748197(0xffffffffe7fe8cdb, float:-2.4041588E24)
            r1 = 54
            r2 = 1
            c1.a r0 = c1.c.e(r0, r2, r11, r12, r1)
            BD.G$c r3 = new BD.G$c
            r3.<init>(r9, r15, r14, r13)
            r4 = 176017948(0xa7dd21c, float:1.2221024E-32)
            c1.a r1 = c1.c.e(r4, r2, r3, r12, r1)
            int r2 = r24 >> 3
            r3 = r2 & 14
            r3 = r3 | 3456(0xd80, float:4.843E-42)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            int r4 = r24 >> 6
            r3 = r3 & r4
            r18 = r2 | r3
            r19 = 32
            r2 = 0
            r10 = r27
            r11 = r28
            r4 = r12
            r12 = r0
            r13 = r1
            r14 = r20
            r15 = r2
            r17 = r4
            zD.p.j(r10, r11, r12, r13, r14, r15, r17, r18, r19)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0241
            U0.C4895p.R()
        L_0x0241:
            r7 = r20
            r8 = r21
        L_0x0245:
            U0.Y0 r11 = r4.n()
            if (r11 == 0) goto L_0x0264
            BD.D r12 = new BD.D
            r0 = r12
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BD.G.e(GD.k$b$c, p0.v, boolean, nI.a, nI.l, nI.l, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C4899r0 f() {
        return u1.e(C15208e.Light, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C15208e g(C4899r0<C15208e> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void h(C4899r0<C15208e> r0Var, C15208e eVar) {
        r0Var.setValue(eVar);
    }

    /* access modifiers changed from: private */
    public static final e.c i(C4899r0<e.c> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void j(C4899r0<e.c> r0Var, e.c cVar) {
        r0Var.setValue(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N k(k.b.c cVar, v vVar, boolean z10, C17631a aVar, C17642l lVar, C17642l lVar2, androidx.compose.ui.d dVar, boolean z11, int i10, int i11, C4889m mVar, int i12) {
        e(cVar, vVar, z10, aVar, lVar, lVar2, dVar, z11, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(GD.k.b.c r19, p0.v r20, nI.C17631a<XH.C16807N> r21, nI.C17642l<? super GD.C12930c, XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r7 = r26
            r0 = -1201751444(0xffffffffb85eba6c, float:-5.3102543E-5)
            r1 = r25
            U0.m r1 = r1.k(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r19
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r19
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r19
            r3 = r7
        L_0x0029:
            r4 = r27 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r20
            goto L_0x0044
        L_0x0032:
            r4 = r7 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r20
            boolean r5 = r1.V(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r5 = r21
            goto L_0x005f
        L_0x004d:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r21
            boolean r6 = r1.F(r5)
            if (r6 == 0) goto L_0x005c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r6
        L_0x005f:
            r6 = r27 & 8
            if (r6 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r6 = r22
            goto L_0x007a
        L_0x0068:
            r6 = r7 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r22
            boolean r8 = r1.F(r6)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r8
        L_0x007a:
            r8 = r27 & 16
            if (r8 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r15 = r23
            goto L_0x0095
        L_0x0083:
            r8 = r7 & 24576(0x6000, float:3.4438E-41)
            r15 = r23
            if (r8 != 0) goto L_0x0095
            boolean r8 = r1.F(r15)
            if (r8 == 0) goto L_0x0092
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r8
        L_0x0095:
            r8 = r27 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x009f
            r3 = r3 | r9
        L_0x009c:
            r9 = r24
            goto L_0x00b0
        L_0x009f:
            r9 = r9 & r7
            if (r9 != 0) goto L_0x009c
            r9 = r24
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x00ad
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r10
        L_0x00b0:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r3
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00c4
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x00c0
            goto L_0x00c4
        L_0x00c0:
            r1.L()
            goto L_0x0103
        L_0x00c4:
            if (r8 == 0) goto L_0x00cb
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r18 = r8
            goto L_0x00cd
        L_0x00cb:
            r18 = r9
        L_0x00cd:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00d9
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.GiftCardBack (GiftCard.kt:193)"
            U0.C4895p.S(r0, r3, r8, r9)
        L_0x00d9:
            GD.b r8 = r19.i()
            KJ.c r9 = r19.h()
            int r0 = r3 << 3
            r3 = 4194176(0x3fff80, float:5.877292E-39)
            r16 = r0 & r3
            r17 = 0
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r18
            r15 = r1
            CD.c.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0101
            U0.C4895p.R()
        L_0x0101:
            r9 = r18
        L_0x0103:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0121
            BD.F r11 = new BD.F
            r0 = r11
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r9
            r7 = r26
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BD.G.l(GD.k$b$c, p0.v, nI.a, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(k.b.c cVar, v vVar, C17631a aVar, C17642l lVar, C17631a aVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        l(cVar, vVar, aVar, lVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void n(C12929b bVar, C5942c cVar, boolean z10, boolean z11, C12928a aVar, C15208e eVar, v vVar, C17631a<C16807N> aVar2, C17642l<? super e.c, C16807N> lVar, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m mVar2;
        androidx.compose.ui.d dVar2;
        C12929b bVar2 = bVar;
        C5942c cVar2 = cVar;
        C12928a aVar3 = aVar;
        C15208e eVar2 = eVar;
        v vVar2 = vVar;
        C17631a<C16807N> aVar4 = aVar2;
        C17642l<? super e.c, C16807N> lVar2 = lVar;
        int i13 = i10;
        int i14 = i11;
        C17542s.j(bVar2, "header");
        C17542s.j(cVar2, "qrPainter");
        C17542s.j(aVar3, "background");
        C17542s.j(eVar2, "contentColor");
        C17542s.j(vVar2, "orientation");
        C17542s.j(aVar4, "onCardDetailsClicked");
        C17542s.j(lVar2, "onImageStateChanged");
        C4889m k10 = mVar.k(-471937522);
        if ((i14 & 1) != 0) {
            i12 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i12 = (k10.V(bVar2) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        if ((i14 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(cVar2) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i12 |= 384;
            boolean z12 = z10;
        } else {
            boolean z13 = z10;
            if ((i13 & 384) == 0) {
                i12 |= k10.b(z13) ? 256 : 128;
            }
        }
        if ((i14 & 8) != 0) {
            i12 |= 3072;
            boolean z14 = z11;
        } else {
            boolean z15 = z11;
            if ((i13 & 3072) == 0) {
                i12 |= k10.b(z15) ? RecyclerView.n.FLAG_MOVED : 1024;
            }
        }
        if ((i14 & 16) != 0) {
            i12 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i12 |= k10.V(aVar3) ? 16384 : 8192;
        }
        if ((i14 & 32) != 0) {
            i12 |= ImageMetadata.EDGE_MODE;
        } else if ((i13 & ImageMetadata.EDGE_MODE) == 0) {
            i12 |= k10.V(eVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((i14 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            i12 |= k10.V(vVar2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((i14 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            i12 |= k10.F(aVar4) ? 8388608 : 4194304;
        }
        if ((i14 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            i12 |= k10.F(lVar2) ? 67108864 : 33554432;
        }
        int i15 = i14 & 512;
        if (i15 != 0) {
            i12 |= 805306368;
            androidx.compose.ui.d dVar3 = dVar;
        } else {
            androidx.compose.ui.d dVar4 = dVar;
            if ((i13 & 805306368) == 0) {
                i12 |= k10.V(dVar4) ? 536870912 : 268435456;
            }
        }
        if ((i12 & 306783379) != 306783378 || !k10.l()) {
            d.a aVar5 = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar;
            if (C4895p.J()) {
                C4895p.S(-471937522, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.GiftCardFront (GiftCard.kt:150)");
            }
            Image a10 = C13143a.a(aVar3, vVar2);
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar5);
            C4504g.a aVar6 = C4504g.f6515W;
            androidx.compose.ui.d dVar5 = aVar5;
            C17631a<C4504g> a12 = aVar6.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, h10, aVar6.c());
            F1.c(a13, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b10 = aVar6.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar6.d());
            C5079j jVar = C5079j.f18125a;
            String url = a10.getUrl();
            d.a aVar7 = androidx.compose.ui.d.f18749a;
            h.c(url, (String) null, jVar.e(C5116k1.a(aVar7, "WalletTestTags-BackgroundImage")), (C13178b) null, (e.b) null, (C4478k) null, (C5437c) null, lVar, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, C12638p.f108029a.a(), k10, ((i12 >> 3) & 29360128) | 905969712, 48, 1144);
            int i16 = i12 >> 9;
            androidx.compose.ui.d dVar6 = dVar5;
            mVar2 = k10;
            CD.e.b(bVar, cVar, z10, vVar, aVar2, J.f(aVar7, 0.0f, 1, (Object) null), z11, eVar, mVar2, (i12 & 14) | ImageMetadata.EDGE_MODE | (i12 & 112) | (i12 & 896) | (i16 & 7168) | (i16 & 57344) | (3670016 & (i12 << 9)) | ((i12 << 6) & 29360128), 0);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar6;
        } else {
            k10.L();
            dVar2 = dVar;
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            C12622E e11 = r0;
            C12622E e12 = new C12622E(bVar, cVar, z10, z11, aVar, eVar, vVar, aVar2, lVar, dVar2, i10, i11);
            n10.a(e11);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C12929b bVar, C5942c cVar, boolean z10, boolean z11, C12928a aVar, C15208e eVar, v vVar, C17631a aVar2, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        n(bVar, cVar, z10, z11, aVar, eVar, vVar, aVar2, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object v(android.graphics.Bitmap r6, jC.i r7, dI.C17164e<? super xD.C15208e> r8) {
        /*
            boolean r0 = r8 instanceof BD.G.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            BD.G$d r0 = (BD.G.d) r0
            int r1 = r0.f107910g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f107910g = r1
            goto L_0x0018
        L_0x0013:
            BD.G$d r0 = new BD.G$d
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r1 = r0.f107909f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f107910g
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f107908e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f107907d
            jC.i r6 = (jC.i) r6
            java.lang.Object r6 = r0.f107906c
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            XH.y.b(r1)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            c2.p r1 = new c2.p
            r3 = 0
            r5 = 25
            r1.<init>(r3, r3, r5, r5)
            r0.f107906c = r6
            r0.f107907d = r7
            r0.f107908e = r8
            r0.f107910g = r4
            java.lang.Object r1 = r7.e(r6, r1, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            jC.b$d r1 = (jC.C14615b.d) r1
            if (r1 == 0) goto L_0x0075
            jC.b$c r6 = jC.C14615b.c.f127858b
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r6 == 0) goto L_0x0064
            goto L_0x0075
        L_0x0064:
            jC.b$b r6 = jC.C14615b.C3152b.f127857b
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r6 == 0) goto L_0x006f
            xD.e r6 = xD.C15208e.Dark
            goto L_0x0077
        L_0x006f:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x0075:
            xD.e r6 = xD.C15208e.Light
        L_0x0077:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: BD.G.v(android.graphics.Bitmap, jC.i, dI.e):java.lang.Object");
    }
}
