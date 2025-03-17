package Hf;

import B0.C4373q;
import Gf.c;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import KJ.C15988d;
import N1.G;
import N1.P;
import O0.C4762x0;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import SC.C13607l;
import TC.C13679b;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Y1.j;
import Y1.k;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import androidx.compose.foundation.layout.D;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import com.adjust.sdk.Constants;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import i1.C5437c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import on.C11687b;
import p1.C5747v0;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import r0.m;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import t0.C5938c;
import t0.x;
import uK.C18146a;
import x4.C8951o;
import xf.h;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aÃ\u0001\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00112\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0011H\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$²\u0006\f\u0010\n\u001a\u00020\t8\nX\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u0002"}, d2 = {"LDf/d;", "navigationContract", "Lx4/o;", "navController", "LGf/f;", "viewModel", "LXH/N;", "r", "(LDf/d;Lx4/o;LGf/f;LU0/m;II)V", "LGf/j;", "topAppBarUiState", "LGf/d;", "uiState", "", "inputText", "", "isLoading", "Lkotlin/Function1;", "onInputTextChanged", "Lkotlin/Function3;", "LGf/c$j;", "Lxf/h;", "openPlp", "onProductClicked", "Lkotlin/Function0;", "onClearRecentSearchesClicked", "onDeeplinkClicked", "onAlertMessageClicked", "onInboxClicked", "onBackClicked", "s", "(LGf/j;LGf/d;Ljava/lang/String;ZLnI/l;LnI/q;LnI/l;LnI/a;LnI/l;LnI/a;LnI/a;LnI/a;LU0/m;II)V", "LGf/c;", "item", "m", "(LGf/c;LnI/q;LnI/l;LnI/a;LnI/l;LU0/m;I)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Gf.c f60925a;

        a(Gf.c cVar) {
            this.f60925a = cVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(5798943, i11, -1, "com.ingka.ikea.app.browseandsearch.searchv2.compose.SearchItem.<anonymous> (SearchScreenV2.kt:232)");
                }
                C13607l.h(((c.h) this.f60925a).g(), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 524284);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<String, C16807N> {
        b(Object obj) {
            super(1, obj, Gf.f.class, "onSearchTextChanged", "onSearchTextChanged(Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((String) obj);
            return C16807N.f139792a;
        }

        public final void t(String str) {
            C17542s.j(str, "p0");
            ((Gf.f) this.receiver).I(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Gf.j f60926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f60927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f60928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<String, c.j, h, C16807N> f60929d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f60930e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f60931f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f60932g;

        c(Gf.j jVar, String str, C17642l<? super String, C16807N> lVar, q<? super String, ? super c.j, ? super h, C16807N> qVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
            this.f60926a = jVar;
            this.f60927b = str;
            this.f60928c = lVar;
            this.f60929d = qVar;
            this.f60930e = aVar;
            this.f60931f = aVar2;
            this.f60932g = aVar3;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(q qVar, String str) {
            C17542s.j(str, "text");
            qVar.invoke(str, c.j.TEXT, h.REGULAR);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r11, int r12) {
            /*
                r10 = this;
                r0 = r12 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r11.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r11.L()
                goto L_0x006d
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.browseandsearch.searchv2.compose.SearchScreenV2.<anonymous> (SearchScreenV2.kt:135)"
                r2 = 334673183(0x13f2b51f, float:6.1267988E-27)
                U0.C4895p.S(r2, r12, r0, r1)
            L_0x001f:
                Gf.j r12 = r10.f60926a
                Es.a r0 = r12.b()
                Gf.j r12 = r10.f60926a
                qe.b r1 = r12.a()
                java.lang.String r2 = r10.f60927b
                nI.l<java.lang.String, XH.N> r3 = r10.f60928c
                r12 = 1315254126(0x4e652f6e, float:9.612727E8)
                r11.W(r12)
                nI.q<java.lang.String, Gf.c$j, xf.h, XH.N> r12 = r10.f60929d
                boolean r12 = r11.V(r12)
                nI.q<java.lang.String, Gf.c$j, xf.h, XH.N> r4 = r10.f60929d
                java.lang.Object r5 = r11.D()
                if (r12 != 0) goto L_0x004b
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r5 != r12) goto L_0x0053
            L_0x004b:
                Hf.j0 r5 = new Hf.j0
                r5.<init>(r4)
                r11.u(r5)
            L_0x0053:
                r4 = r5
                nI.l r4 = (nI.C17642l) r4
                r11.P()
                nI.a<XH.N> r5 = r10.f60930e
                nI.a<XH.N> r6 = r10.f60931f
                nI.a<XH.N> r7 = r10.f60932g
                r9 = 0
                r8 = r11
                Hf.s0.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x006d
                U0.C4895p.R()
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Hf.i0.c.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Gf.d f60933a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<String, c.j, h, C16807N> f60934b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f60935c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f60936d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f60937e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f60938f;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class a extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f60939c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f60940d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C17642l lVar, List list) {
                super(1);
                this.f60939c = lVar;
                this.f60940d = list;
            }

            public final Object a(int i10) {
                return this.f60939c.invoke(this.f60940d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class b extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f60941c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f60942d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17642l lVar, List list) {
                super(1);
                this.f60941c = lVar;
                this.f60942d = list;
            }

            public final Object a(int i10) {
                return this.f60941c.invoke(this.f60942d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
        public static final class c extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f60943c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ q f60944d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17642l f60945e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17631a f60946f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17642l f60947g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(List list, q qVar, C17642l lVar, C17631a aVar, C17642l lVar2) {
                super(4);
                this.f60943c = list;
                this.f60944d = qVar;
                this.f60945e = lVar;
                this.f60946f = aVar;
                this.f60947g = lVar2;
            }

            public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (mVar.V(cVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= mVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 147) != 146 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    mVar.W(1437712963);
                    i0.m((Gf.c) this.f60943c.get(i10), this.f60944d, this.f60945e, this.f60946f, this.f60947g, mVar, 0);
                    mVar.P();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        d(Gf.d dVar, q<? super String, ? super c.j, ? super h, C16807N> qVar, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar2, boolean z10) {
            this.f60933a = dVar;
            this.f60934b = qVar;
            this.f60935c = lVar;
            this.f60936d = aVar;
            this.f60937e = lVar2;
            this.f60938f = z10;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(Gf.d dVar, q qVar, C17642l lVar, C17631a aVar, C17642l lVar2, x xVar) {
            C17542s.j(xVar, "$this$LazyColumn");
            List<Gf.c> a10 = dVar.a();
            xVar.e(a10.size(), new a(new l0(), a10), new b(new m0(), a10), c1.c.c(-632812321, true, new c(a10, qVar, lVar, aVar, lVar2)));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final Object h(Gf.c cVar) {
            C17542s.j(cVar, "item");
            long f10 = cVar.f();
            return "SearchScreen: " + f10;
        }

        /* access modifiers changed from: private */
        public static final Object i(Gf.c cVar) {
            C17542s.j(cVar, "it");
            return cVar.getClass().getName();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: Hf.k0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: Hf.k0} */
        /* JADX WARNING: type inference failed for: r8v7 */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fe, code lost:
            if (r8 == U0.C4889m.f14007a.a()) goto L_0x0100;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(s0.C5834E r23, U0.C4889m r24, int r25) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                r13 = r24
                java.lang.String r2 = "contentPadding"
                kotlin.jvm.internal.C17542s.j(r1, r2)
                r2 = r25 & 6
                if (r2 != 0) goto L_0x001b
                boolean r2 = r13.V(r1)
                if (r2 == 0) goto L_0x0017
                r2 = 4
                goto L_0x0018
            L_0x0017:
                r2 = 2
            L_0x0018:
                r2 = r25 | r2
                goto L_0x001d
            L_0x001b:
                r2 = r25
            L_0x001d:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x002f
                boolean r3 = r24.l()
                if (r3 != 0) goto L_0x002a
                goto L_0x002f
            L_0x002a:
                r24.L()
                goto L_0x016a
            L_0x002f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.app.browseandsearch.searchv2.compose.SearchScreenV2.<anonymous> (SearchScreenV2.kt:149)"
                r5 = -1449680268(0xffffffffa997a274, float:-6.733928E-14)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003e:
                androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
                r15 = 0
                r12 = 1
                r11 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.f(r14, r15, r12, r11)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r2, r1)
                Gf.d r3 = r0.f60933a
                nI.q<java.lang.String, Gf.c$j, xf.h, XH.N> r4 = r0.f60934b
                nI.l<java.lang.String, XH.N> r5 = r0.f60935c
                nI.a<XH.N> r6 = r0.f60936d
                nI.l<java.lang.String, XH.N> r7 = r0.f60937e
                boolean r10 = r0.f60938f
                i1.c$a r16 = i1.C5437c.f24302a
                i1.c r2 = r16.o()
                r8 = 0
                E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r8)
                int r8 = U0.C4883j.a(r13, r8)
                U0.y r9 = r24.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
                G1.g$a r17 = G1.C4504g.f6515W
                nI.a r11 = r17.a()
                U0.f r18 = r24.m()
                if (r18 != 0) goto L_0x007d
                U0.C4883j.c()
            L_0x007d:
                r24.I()
                boolean r18 = r24.i()
                if (r18 == 0) goto L_0x008a
                r13.p(r11)
                goto L_0x008d
            L_0x008a:
                r24.t()
            L_0x008d:
                U0.m r11 = U0.F1.a(r24)
                nI.p r12 = r17.c()
                U0.F1.c(r11, r2, r12)
                nI.p r2 = r17.e()
                U0.F1.c(r11, r9, r2)
                nI.p r2 = r17.b()
                boolean r9 = r11.i()
                if (r9 != 0) goto L_0x00b7
                java.lang.Object r9 = r11.D()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
                boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
                if (r9 != 0) goto L_0x00c5
            L_0x00b7:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r11.u(r9)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r11.w(r8, r2)
            L_0x00c5:
                nI.p r2 = r17.d()
                U0.F1.c(r11, r1, r2)
                androidx.compose.foundation.layout.j r12 = androidx.compose.foundation.layout.C5079j.f18125a
                r9 = 0
                r11 = 1
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.f(r14, r15, r11, r9)
                r2 = -201337161(0xfffffffff3ffd6b7, float:-4.0539265E31)
                r13.W(r2)
                boolean r2 = r13.F(r3)
                boolean r8 = r13.V(r4)
                r2 = r2 | r8
                boolean r8 = r13.V(r5)
                r2 = r2 | r8
                boolean r8 = r13.V(r6)
                r2 = r2 | r8
                boolean r8 = r13.V(r7)
                r2 = r2 | r8
                java.lang.Object r8 = r24.D()
                if (r2 != 0) goto L_0x0100
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r8 != r2) goto L_0x0109
            L_0x0100:
                Hf.k0 r8 = new Hf.k0
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                r13.u(r8)
            L_0x0109:
                r17 = r8
                nI.l r17 = (nI.C17642l) r17
                r24.P()
                r18 = 6
                r19 = 254(0xfe, float:3.56E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r20 = r9
                r9 = r17
                r17 = r10
                r10 = r24
                r20 = r11
                r11 = r18
                r21 = r12
                r0 = r20
                r12 = r19
                t0.C5937b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r1 = -201314909(0xfffffffff4002da3, float:-4.0621315E31)
                r13.W(r1)
                if (r17 == 0) goto L_0x015b
                r1 = 0
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r14, r15, r0, r1)
                i1.c r1 = r16.b()
                r2 = r21
                androidx.compose.ui.d r0 = r2.a(r0, r1)
                java.lang.String r1 = "Loading"
                androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
                r9 = 0
                r10 = 30
                r2 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = r24
                O0.C4747p0.c(r1, r2, r4, r6, r7, r8, r9, r10)
            L_0x015b:
                r24.P()
                r24.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x016a
                U0.C4895p.R()
            L_0x016a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Hf.i0.d.e(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            e((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17631a<C16807N> {
        e(Object obj) {
            super(0, obj, Gf.f.class, "onClearRecentSearchesClicked", "onClearRecentSearchesClicked()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((Gf.f) this.receiver).F();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60948a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Gf.c$j[] r0 = Gf.c.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Gf.c$j r1 = Gf.c.j.CATEGORY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Gf.c$j r1 = Gf.c.j.ROOM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Gf.c$j r1 = Gf.c.j.TEXT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f60948a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Hf.i0.f.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(Gf.j jVar, Gf.d dVar, String str, boolean z10, C17642l lVar, q qVar, C17642l lVar2, C17631a aVar, C17642l lVar3, C17631a aVar2, C17631a aVar3, C17631a aVar4, int i10, int i11, C4889m mVar, int i12) {
        s(jVar, dVar, str, z10, lVar, qVar, lVar2, aVar, lVar3, aVar2, aVar3, aVar4, mVar, M0.a(i10 | 1), M0.a(i11));
        return C16807N.f139792a;
    }

    private static final String B(A1<String> a12) {
        return a12.getValue();
    }

    private static final boolean C(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N D(Df.d dVar, C8951o oVar, Gf.f fVar, String str, c.j jVar, h hVar) {
        C11687b.e eVar;
        C17542s.j(str, "id");
        C17542s.j(jVar, "type");
        C17542s.j(hVar, "searchComponent");
        int i10 = f.f60948a[jVar.ordinal()];
        if (i10 == 1) {
            eVar = C11687b.e.CATEGORY;
        } else if (i10 == 2) {
            eVar = C11687b.e.ROOM;
        } else if (i10 == 3) {
            eVar = C11687b.e.SEARCH_RESULTS;
        } else {
            throw new t();
        }
        dVar.c(oVar, str, eVar, hVar.b());
        fVar.G(str, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(Df.d dVar, C8951o oVar, Gf.f fVar, String str) {
        C17542s.j(str, "itemNo");
        dVar.g(oVar, str, Interaction$Component.AUTOCOMPLETE_PRODUCT);
        fVar.H(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void m(Gf.c cVar, q<? super String, ? super c.j, ? super h, C16807N> qVar, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        Gf.c cVar2 = cVar;
        q<? super String, ? super c.j, ? super h, C16807N> qVar2 = qVar;
        C17642l<? super String, C16807N> lVar3 = lVar;
        C17631a<C16807N> aVar2 = aVar;
        C17642l<? super String, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(1816618588);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(cVar2) : k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(qVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar3) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar4) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1816618588, i11, -1, "com.ingka.ikea.app.browseandsearch.searchv2.compose.SearchItem (SearchScreenV2.kt:196)");
            }
            boolean z10 = false;
            if (cVar2 instanceof c.C0996c) {
                k10.W(-927957657);
                String h10 = ((c.C0996c) cVar2).h();
                C13573c1.a aVar3 = new C13573c1.a(C18146a.f148220R5, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null);
                C13589g1 g1Var = C13589g1.Small;
                float B10 = c2.h.B((float) 16);
                k10.W(1078456790);
                boolean z11 = (57344 & i11) == 16384;
                if ((i11 & 14) == 4 || ((i11 & 8) != 0 && k10.F(cVar2))) {
                    z10 = true;
                }
                boolean z12 = z11 | z10;
                Object D10 = k10.D();
                if (z12 || D10 == C4889m.f14007a.a()) {
                    D10 = new g0(lVar4, cVar2);
                    k10.u(D10);
                }
                k10.P();
                String str = h10;
                mVar2 = k10;
                C13585f1.c(str, (C17631a) D10, (androidx.compose.ui.d) null, (String) null, aVar3, (C13569b1) null, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, g1Var, B10, false, false, (m) null, mVar2, (C13573c1.a.f116164f << 12) | 905969664, 0, 7404);
                mVar2.P();
            } else {
                mVar2 = k10;
                if (cVar2 instanceof c.e) {
                    mVar2.W(-927438624);
                    H.b((c.e) cVar2, qVar2, mVar2, i11 & 112);
                    mVar2.P();
                } else if (cVar2 instanceof c.f) {
                    mVar2.W(-927320576);
                    K.c((c.f) cVar2, lVar3, mVar2, (i11 >> 3) & 112);
                    mVar2.P();
                } else if (cVar2 instanceof c.g) {
                    mVar2.W(-927191771);
                    U.m((c.g) cVar2, qVar2, aVar2, mVar2, ((i11 >> 3) & 896) | (i11 & 112));
                    mVar2.P();
                } else if (cVar2 instanceof c.h) {
                    mVar2.W(-926922505);
                    C13589g1 g1Var2 = C13589g1.Small;
                    float B11 = c2.h.B((float) 24);
                    C5264a e10 = c1.c.e(5798943, true, new a(cVar2), mVar2, 54);
                    mVar2.W(1078498273);
                    boolean z13 = (i11 & 112) == 32;
                    if ((i11 & 14) == 4 || ((i11 & 8) != 0 && mVar2.F(cVar2))) {
                        z10 = true;
                    }
                    boolean z14 = z13 | z10;
                    Object D11 = mVar2.D();
                    if (z14 || D11 == C4889m.f14007a.a()) {
                        D11 = new h0(qVar2, cVar2);
                        mVar2.u(D11);
                    }
                    mVar2.P();
                    C13585f1.d(e10, (C17631a) D11, (androidx.compose.ui.d) null, (p<? super C4889m, ? super Integer, C16807N>) null, C9100d.f60892a.a(), (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, g1Var2, B11, false, (m) null, mVar2, 113270790, 0, 1644);
                    mVar2.P();
                } else if (cVar2 instanceof c.a) {
                    mVar2.W(-926089938);
                    String g10 = ((c.a) cVar2).g();
                    C13573c1.a aVar4 = new C13573c1.a(C18146a.f148166Nb, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null);
                    C13589g1 g1Var3 = C13589g1.Small;
                    float B12 = c2.h.B((float) 24);
                    mVar2.W(1078517752);
                    boolean z15 = (i11 & 112) == 32;
                    if ((i11 & 14) == 4 || ((i11 & 8) != 0 && mVar2.F(cVar2))) {
                        z10 = true;
                    }
                    boolean z16 = z15 | z10;
                    Object D12 = mVar2.D();
                    if (z16 || D12 == C4889m.f14007a.a()) {
                        D12 = new X(qVar2, cVar2);
                        mVar2.u(D12);
                    }
                    mVar2.P();
                    C13585f1.c(g10, (C17631a) D12, (androidx.compose.ui.d) null, (String) null, aVar4, (C13569b1) null, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, g1Var3, B12, false, false, (m) null, mVar2, (C13573c1.a.f116164f << 12) | 905969664, 6, 6380);
                    mVar2.P();
                } else if (cVar2 instanceof c.i) {
                    mVar2.W(-925526265);
                    Bl.c.c(C13026h.c(((c.i) cVar2).g()), D.i(androidx.compose.ui.d.f18749a, c2.h.B((float) 24)), (G) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, (C13679b) null, mVar2, C13023e.f110931a | 48, 0, 262140);
                    mVar2.P();
                } else if (C17542s.e(cVar2, c.b.f60641a)) {
                    mVar2.W(1078528804);
                    D.b(mVar2, 0);
                    mVar2.P();
                } else {
                    mVar2.W(1078444924);
                    mVar2.P();
                    throw new t();
                }
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new Y(cVar, qVar, lVar, aVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17642l lVar, Gf.c cVar) {
        lVar.invoke(((c.C0996c) cVar).g());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(q qVar, Gf.c cVar) {
        qVar.invoke(((c.h) cVar).h(), c.j.TEXT, h.AUTOCOMPLETE_TEXT);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(q qVar, Gf.c cVar) {
        c.a aVar = (c.a) cVar;
        qVar.invoke(aVar.getId(), aVar.h(), h.AUTOCOMPLETE_CATEGORY);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(Gf.c cVar, q qVar, C17642l lVar, C17631a aVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        m(cVar, qVar, lVar, aVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(Df.d r20, x4.C8951o r21, Gf.f r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r20
            r2 = r21
            r4 = r24
            java.lang.String r0 = "navigationContract"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 1387719089(0x52b6e9b1, float:3.9280237E11)
            r3 = r23
            U0.m r3 = r3.k(r0)
            r5 = r25 & 1
            r13 = 4
            if (r5 == 0) goto L_0x0021
            r5 = r4 | 6
            goto L_0x003a
        L_0x0021:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0039
            r5 = r4 & 8
            if (r5 != 0) goto L_0x002e
            boolean r5 = r3.V(r1)
            goto L_0x0032
        L_0x002e:
            boolean r5 = r3.F(r1)
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            r5 = r13
            goto L_0x0037
        L_0x0036:
            r5 = 2
        L_0x0037:
            r5 = r5 | r4
            goto L_0x003a
        L_0x0039:
            r5 = r4
        L_0x003a:
            r6 = r25 & 2
            if (r6 == 0) goto L_0x0041
            r5 = r5 | 48
            goto L_0x0051
        L_0x0041:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0051
            boolean r6 = r3.F(r2)
            if (r6 == 0) goto L_0x004e
            r6 = 32
            goto L_0x0050
        L_0x004e:
            r6 = 16
        L_0x0050:
            r5 = r5 | r6
        L_0x0051:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x006b
            r6 = r25 & 4
            if (r6 != 0) goto L_0x0064
            r6 = r22
            boolean r7 = r3.F(r6)
            if (r7 == 0) goto L_0x0066
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0064:
            r6 = r22
        L_0x0066:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r5 = r5 | r7
        L_0x0069:
            r14 = r5
            goto L_0x006e
        L_0x006b:
            r6 = r22
            goto L_0x0069
        L_0x006e:
            r5 = r14 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0080
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x007b
            goto L_0x0080
        L_0x007b:
            r3.L()
            goto L_0x02d0
        L_0x0080:
            r3.G()
            r5 = r4 & 1
            r15 = 0
            if (r5 == 0) goto L_0x009b
            boolean r5 = r3.O()
            if (r5 == 0) goto L_0x008f
            goto L_0x009b
        L_0x008f:
            r3.L()
            r5 = r25 & 4
            if (r5 == 0) goto L_0x0098
            r14 = r14 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0098:
            r12 = r14
            r14 = r6
            goto L_0x00ea
        L_0x009b:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x0098
            r5 = 1890788296(0x70b323c8, float:4.435286E29)
            r3.C(r5)
            m3.a r5 = m3.a.f26247a
            int r6 = m3.a.f26249c
            androidx.lifecycle.k0 r6 = r5.a(r3, r6)
            if (r6 == 0) goto L_0x00e2
            androidx.lifecycle.i0$c r8 = f3.a.a(r6, r3, r15)
            r5 = 1729797275(0x671a9c9b, float:7.301333E23)
            r3.C(r5)
            boolean r5 = r6 instanceof androidx.lifecycle.C5212o
            if (r5 == 0) goto L_0x00c6
            r5 = r6
            androidx.lifecycle.o r5 = (androidx.lifecycle.C5212o) r5
            l3.a r5 = r5.getDefaultViewModelCreationExtras()
        L_0x00c4:
            r9 = r5
            goto L_0x00c9
        L_0x00c6:
            l3.a$a r5 = l3.a.C0407a.f25486b
            goto L_0x00c4
        L_0x00c9:
            r11 = 36936(0x9048, float:5.1758E-41)
            r12 = 0
            java.lang.Class<Gf.f> r5 = Gf.f.class
            r7 = 0
            r10 = r3
            androidx.lifecycle.f0 r5 = m3.c.b(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.U()
            r3.U()
            Gf.f r5 = (Gf.f) r5
            r14 = r14 & -897(0xfffffffffffffc7f, float:NaN)
            r12 = r14
            r14 = r5
            goto L_0x00ea
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            r3.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00f9
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.browseandsearch.searchv2.compose.SearchScreenV2 (SearchScreenV2.kt:58)"
            U0.C4895p.S(r0, r12, r5, r6)
        L_0x00f9:
            TJ.P r5 = r14.D()
            r10 = 0
            r11 = 7
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r3
            U0.A1 r0 = j3.a.c(r5, r6, r7, r8, r9, r10, r11)
            TJ.P r5 = r14.m()
            U0.A1 r16 = j3.a.c(r5, r6, r7, r8, r9, r10, r11)
            TJ.P r5 = r14.C()
            U0.A1 r17 = j3.a.c(r5, r6, r7, r8, r9, r10, r11)
            TJ.P r5 = r14.E()
            U0.A1 r5 = j3.a.c(r5, r6, r7, r8, r9, r10, r11)
            Gf.j r0 = t(r0)
            Gf.d r6 = u(r16)
            java.lang.String r7 = B(r17)
            boolean r8 = C(r5)
            r5 = 1501182497(0x597a3a21, float:4.4020411E15)
            r3.W(r5)
            boolean r5 = r3.F(r14)
            java.lang.Object r9 = r3.D()
            if (r5 != 0) goto L_0x0147
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x014f
        L_0x0147:
            Hf.i0$b r9 = new Hf.i0$b
            r9.<init>(r14)
            r3.u(r9)
        L_0x014f:
            uI.h r9 = (uI.C18059h) r9
            r3.P()
            nI.l r9 = (nI.C17642l) r9
            r5 = 1501184639(0x597a427f, float:4.40261609E15)
            r3.W(r5)
            r5 = r12 & 14
            if (r5 == r13) goto L_0x016d
            r11 = r12 & 8
            if (r11 == 0) goto L_0x016b
            boolean r11 = r3.F(r1)
            if (r11 == 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r11 = r15
            goto L_0x016e
        L_0x016d:
            r11 = 1
        L_0x016e:
            boolean r16 = r3.F(r2)
            r11 = r11 | r16
            boolean r16 = r3.F(r14)
            r11 = r11 | r16
            java.lang.Object r10 = r3.D()
            if (r11 != 0) goto L_0x0188
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r10 != r11) goto L_0x0190
        L_0x0188:
            Hf.W r10 = new Hf.W
            r10.<init>(r1, r2, r14)
            r3.u(r10)
        L_0x0190:
            nI.q r10 = (nI.q) r10
            r3.P()
            r11 = 1501203588(0x597a8c84, float:4.40770267E15)
            r3.W(r11)
            if (r5 == r13) goto L_0x01aa
            r11 = r12 & 8
            if (r11 == 0) goto L_0x01a8
            boolean r11 = r3.F(r1)
            if (r11 == 0) goto L_0x01a8
            goto L_0x01aa
        L_0x01a8:
            r11 = r15
            goto L_0x01ab
        L_0x01aa:
            r11 = 1
        L_0x01ab:
            boolean r16 = r3.F(r2)
            r11 = r11 | r16
            boolean r16 = r3.F(r14)
            r11 = r11 | r16
            java.lang.Object r15 = r3.D()
            if (r11 != 0) goto L_0x01c5
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r15 != r11) goto L_0x01cd
        L_0x01c5:
            Hf.Z r15 = new Hf.Z
            r15.<init>(r1, r2, r14)
            r3.u(r15)
        L_0x01cd:
            r11 = r15
            nI.l r11 = (nI.C17642l) r11
            r3.P()
            r15 = 1501213898(0x597ab4ca, float:4.41047024E15)
            r3.W(r15)
            boolean r15 = r3.F(r14)
            java.lang.Object r13 = r3.D()
            if (r15 != 0) goto L_0x01eb
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r15 = r15.a()
            if (r13 != r15) goto L_0x01f3
        L_0x01eb:
            Hf.i0$e r13 = new Hf.i0$e
            r13.<init>(r14)
            r3.u(r13)
        L_0x01f3:
            uI.h r13 = (uI.C18059h) r13
            r3.P()
            nI.a r13 = (nI.C17631a) r13
            r15 = 1501216481(0x597abee1, float:4.41116361E15)
            r3.W(r15)
            boolean r15 = r3.F(r2)
            java.lang.Object r4 = r3.D()
            if (r15 != 0) goto L_0x0212
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r15 = r15.a()
            if (r4 != r15) goto L_0x021a
        L_0x0212:
            Hf.a0 r4 = new Hf.a0
            r4.<init>(r2)
            r3.u(r4)
        L_0x021a:
            nI.l r4 = (nI.C17642l) r4
            r3.P()
            r15 = 1501230477(0x597af58d, float:4.41492063E15)
            r3.W(r15)
            r15 = 4
            if (r5 == r15) goto L_0x0235
            r15 = r12 & 8
            if (r15 == 0) goto L_0x0233
            boolean r15 = r3.F(r1)
            if (r15 == 0) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            r15 = 0
            goto L_0x0236
        L_0x0235:
            r15 = 1
        L_0x0236:
            boolean r17 = r3.F(r2)
            r15 = r15 | r17
            r17 = r14
            java.lang.Object r14 = r3.D()
            if (r15 != 0) goto L_0x024c
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r15 = r15.a()
            if (r14 != r15) goto L_0x0254
        L_0x024c:
            Hf.b0 r14 = new Hf.b0
            r14.<init>(r1, r2)
            r3.u(r14)
        L_0x0254:
            nI.a r14 = (nI.C17631a) r14
            r3.P()
            r15 = 1501233702(0x597b0226, float:4.41578634E15)
            r3.W(r15)
            r15 = 4
            if (r5 == r15) goto L_0x026f
            r5 = r12 & 8
            if (r5 == 0) goto L_0x026d
            boolean r5 = r3.F(r1)
            if (r5 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r15 = 0
            goto L_0x0270
        L_0x026f:
            r15 = 1
        L_0x0270:
            boolean r5 = r3.F(r2)
            r5 = r5 | r15
            java.lang.Object r12 = r3.D()
            if (r5 != 0) goto L_0x0283
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r12 != r5) goto L_0x028b
        L_0x0283:
            Hf.c0 r12 = new Hf.c0
            r12.<init>(r1, r2)
            r3.u(r12)
        L_0x028b:
            r15 = r12
            nI.a r15 = (nI.C17631a) r15
            r3.P()
            r5 = 1501236663(0x597b0db7, float:4.41658117E15)
            r3.W(r5)
            boolean r5 = r3.F(r2)
            java.lang.Object r12 = r3.D()
            if (r5 != 0) goto L_0x02a9
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r12 != r5) goto L_0x02b1
        L_0x02a9:
            Hf.d0 r12 = new Hf.d0
            r12.<init>(r2)
            r3.u(r12)
        L_0x02b1:
            r16 = r12
            nI.a r16 = (nI.C17631a) r16
            r3.P()
            r18 = 0
            r19 = 0
            r5 = r0
            r12 = r13
            r13 = r4
            r0 = r17
            r17 = r3
            s(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x02cf
            U0.C4895p.R()
        L_0x02cf:
            r6 = r0
        L_0x02d0:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x02e8
            Hf.e0 r8 = new Hf.e0
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r6
            r4 = r24
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x02e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.i0.r(Df.d, x4.o, Gf.f, U0.m, int, int):void");
    }

    public static final void s(Gf.j jVar, Gf.d dVar, String str, boolean z10, C17642l<? super String, C16807N> lVar, q<? super String, ? super c.j, ? super h, C16807N> qVar, C17642l<? super String, C16807N> lVar2, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar3, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        C4889m mVar2;
        Gf.j jVar2 = jVar;
        Gf.d dVar2 = dVar;
        String str2 = str;
        C17642l<? super String, C16807N> lVar4 = lVar;
        q<? super String, ? super c.j, ? super h, C16807N> qVar2 = qVar;
        C17642l<? super String, C16807N> lVar5 = lVar2;
        C17631a<C16807N> aVar5 = aVar;
        C17642l<? super String, C16807N> lVar6 = lVar3;
        C17631a<C16807N> aVar6 = aVar2;
        C17631a<C16807N> aVar7 = aVar3;
        C17631a<C16807N> aVar8 = aVar4;
        int i14 = i10;
        C17542s.j(jVar2, "topAppBarUiState");
        C17542s.j(dVar2, "uiState");
        C17542s.j(str2, "inputText");
        C17542s.j(lVar4, "onInputTextChanged");
        C17542s.j(qVar2, "openPlp");
        C17542s.j(lVar5, "onProductClicked");
        C17542s.j(aVar5, "onClearRecentSearchesClicked");
        C17542s.j(lVar6, "onDeeplinkClicked");
        C17542s.j(aVar6, "onAlertMessageClicked");
        C17542s.j(aVar7, "onInboxClicked");
        C17542s.j(aVar8, "onBackClicked");
        C4889m k10 = mVar.k(1752842339);
        int i15 = 4;
        if ((i14 & 6) == 0) {
            i12 = (k10.F(jVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        int i16 = 16;
        if ((i14 & 48) == 0) {
            i12 |= k10.F(dVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.V(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.b(z10) ? RecyclerView.n.FLAG_MOVED : 1024;
        } else {
            boolean z11 = z10;
        }
        if ((i14 & 24576) == 0) {
            i12 |= k10.F(lVar4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i12 |= k10.F(qVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i14) == 0) {
            i12 |= k10.F(lVar5) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i14) == 0) {
            i12 |= k10.F(aVar5) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i12 |= k10.F(lVar6) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i12 |= k10.F(aVar6) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            if (!k10.F(aVar7)) {
                i15 = 2;
            }
            i13 = i11 | i15;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (k10.F(aVar8)) {
                i16 = 32;
            }
            i13 |= i16;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 19) == 18 && k10.l()) {
            k10.L();
            mVar2 = k10;
        } else {
            if (C4895p.J()) {
                C4895p.S(1752842339, i12, i13, "com.ingka.ikea.app.browseandsearch.searchv2.compose.SearchScreenV2 (SearchScreenV2.kt:132)");
            }
            mVar2 = k10;
            c cVar = r0;
            c cVar2 = new c(jVar, str, lVar, qVar, aVar2, aVar3, aVar4);
            C4762x0.a((androidx.compose.ui.d) null, c1.c.e(334673183, true, cVar, mVar2, 54), (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(-1449680268, true, new d(dVar, qVar, lVar2, aVar, lVar3, z10), mVar2, 54), mVar2, 805306416, 509);
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            f0 f0Var = r0;
            f0 f0Var2 = new f0(jVar, dVar, str, z10, lVar, qVar, lVar2, aVar, lVar3, aVar2, aVar3, aVar4, i10, i11);
            n10.a(f0Var);
        }
    }

    private static final Gf.j t(A1<Gf.j> a12) {
        return a12.getValue();
    }

    private static final Gf.d u(A1<Gf.d> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C8951o oVar, String str) {
        C17542s.j(str, Constants.DEEPLINK);
        try {
            Uri parse = Uri.parse(str);
            C17542s.i(parse, "parse(...)");
            oVar.X(parse);
        } catch (ActivityNotFoundException unused) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No Activity found to handle Intent with url: " + str);
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "SearchScreen:";
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(Df.d dVar, C8951o oVar) {
        dVar.a(oVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(Df.d dVar, C8951o oVar) {
        dVar.b(oVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C8951o oVar) {
        oVar.k0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(Df.d dVar, C8951o oVar, Gf.f fVar, int i10, int i11, C4889m mVar, int i12) {
        r(dVar, oVar, fVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
