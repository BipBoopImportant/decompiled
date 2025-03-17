package iF;

import B0.C4380y;
import E1.I;
import G1.C4504g;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.o1;
import XH.C16807N;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m0.N;
import n1.C5626f;
import n1.C5635o;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5842M;
import t0.C5938c;
import t0.x;
import y1.C6253a;
import y1.C6254b;
import y1.C6255c;
import y1.C6256d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ai\u0010\r\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014*\n\u0010\u0016\"\u00020\u00152\u00020\u0015¨\u0006\u001c²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00018\n@\nX\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00158\n@\nX\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00158\n@\nX\u0002"}, d2 = {"Lkotlin/Function1;", "", "LXH/N;", "onSearch", "Lkotlin/Function0;", "onSearchCleared", "onSuggestionClicked", "LU0/A1;", "", "suggestions", "LU0/r0;", "LiF/X;", "searchBarUiState", "k", "(LnI/l;LnI/a;LnI/l;LU0/A1;LU0/r0;LU0/m;I)V", "C", "(Ljava/util/List;LnI/l;LU0/m;I)V", "suggestion", "onClick", "z", "(Ljava/lang/String;LnI/l;LU0/m;I)V", "", "ScrollDirection", "input", "", "shouldShowSuggestions", "previousIndex", "previousScrollOffset", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class V {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f127611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5626f f127612b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f127613c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f127614d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<X> f127615e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f127616f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f127617g;

        a(List<String> list, C5626f fVar, C17642l<? super String, C16807N> lVar, C4899r0<String> r0Var, C4899r0<X> r0Var2, C17642l<? super String, C16807N> lVar2, C4899r0<Boolean> r0Var3) {
            this.f127611a = list;
            this.f127612b = fVar;
            this.f127613c = lVar;
            this.f127614d = r0Var;
            this.f127615e = r0Var2;
            this.f127616f = lVar2;
            this.f127617g = r0Var3;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, C5626f fVar, C4899r0 r0Var, C17642l lVar2, C4899r0 r0Var2, C4899r0 r0Var3, String str) {
            C17542s.j(str, "suggestion");
            V.y(lVar, fVar, r0Var, lVar2, r0Var2, r0Var3, str);
            return C16807N.f139792a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0056, code lost:
            if (r0 == U0.C4889m.f14007a.a()) goto L_0x0058;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(l0.e r8, U0.C4889m r9, int r10) {
            /*
                r7 = this;
                java.lang.String r0 = "$this$AnimatedVisibility"
                kotlin.jvm.internal.C17542s.j(r8, r0)
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x0014
                r8 = -1
                java.lang.String r0 = "com.sugarcube.app.base.ui.compose.SearchBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:217)"
                r1 = -70318149(0xfffffffffbcf07bb, float:-2.1499245E36)
                U0.C4895p.S(r1, r10, r8, r0)
            L_0x0014:
                java.util.List<java.lang.String> r8 = r7.f127611a
                r10 = -210947624(0xfffffffff36d31d8, float:-1.87925E31)
                r9.W(r10)
                n1.f r10 = r7.f127612b
                boolean r10 = r9.F(r10)
                nI.l<java.lang.String, XH.N> r0 = r7.f127613c
                boolean r0 = r9.V(r0)
                r10 = r10 | r0
                U0.r0<java.lang.String> r0 = r7.f127614d
                boolean r0 = r9.V(r0)
                r10 = r10 | r0
                U0.r0<iF.X> r0 = r7.f127615e
                boolean r0 = r9.V(r0)
                r10 = r10 | r0
                nI.l<java.lang.String, XH.N> r0 = r7.f127616f
                boolean r0 = r9.V(r0)
                r10 = r10 | r0
                nI.l<java.lang.String, XH.N> r1 = r7.f127616f
                n1.f r2 = r7.f127612b
                U0.r0<java.lang.Boolean> r3 = r7.f127617g
                nI.l<java.lang.String, XH.N> r4 = r7.f127613c
                U0.r0<iF.X> r5 = r7.f127615e
                U0.r0<java.lang.String> r6 = r7.f127614d
                java.lang.Object r0 = r9.D()
                if (r10 != 0) goto L_0x0058
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r0 != r10) goto L_0x0061
            L_0x0058:
                iF.U r10 = new iF.U
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r9.u(r10)
            L_0x0061:
                nI.l r0 = (nI.C17642l) r0
                r9.P()
                r10 = 0
                iF.V.C(r8, r0, r9, r10)
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x0073
                U0.C4895p.R()
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: iF.V.a.b(l0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements C17642l<C6254b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f127618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f127619b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5626f f127620c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f127621d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f127622e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<X> f127623f;

        b(C4899r0<String> r0Var, C17642l<? super String, C16807N> lVar, C5626f fVar, C4899r0<Boolean> r0Var2, C17642l<? super String, C16807N> lVar2, C4899r0<X> r0Var3) {
            this.f127618a = r0Var;
            this.f127619b = lVar;
            this.f127620c = fVar;
            this.f127621d = r0Var2;
            this.f127622e = lVar2;
            this.f127623f = r0Var3;
        }

        public final Boolean a(KeyEvent keyEvent) {
            C17542s.j(keyEvent, "keyEvent");
            if (!C6253a.t(C6256d.a(keyEvent), C6253a.f32108b.g())) {
                return Boolean.FALSE;
            }
            if (C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.b())) {
                C17642l<String, C16807N> lVar = this.f127619b;
                C5626f fVar = this.f127620c;
                C4899r0<Boolean> r0Var = this.f127621d;
                C17642l<String, C16807N> lVar2 = this.f127622e;
                C4899r0<X> r0Var2 = this.f127623f;
                C4899r0<String> r0Var3 = this.f127618a;
                V.y(lVar, fVar, r0Var, lVar2, r0Var2, r0Var3, V.o(r0Var3));
            }
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6254b) obj).f());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<p<? super C4889m, ? super Integer, ? extends C16807N>, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5842M f127624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f127625b;

        c(C5842M m10, C4899r0<String> r0Var) {
            this.f127624a = m10;
            this.f127625b = r0Var;
        }

        public final void a(p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
            C17542s.j(pVar, "innerTextField");
            if ((i10 & 6) == 0) {
                i10 |= mVar.F(pVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(959101660, i10, -1, "com.sugarcube.app.base.ui.compose.SearchBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:285)");
                }
                androidx.compose.ui.d e10 = C5842M.e(this.f127624a, androidx.compose.ui.d.f18749a, 1.0f, false, 2, (Object) null);
                C5842M m10 = this.f127624a;
                C4899r0<String> r0Var = this.f127625b;
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar, e10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h10, aVar.c());
                F1.c(a12, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e11, aVar.d());
                C5079j jVar = C5079j.f18125a;
                String G10 = V.o(r0Var);
                l0.d.f(m10, G10 == null || G10.length() == 0, (androidx.compose.ui.d) null, androidx.compose.animation.g.o((N) null, 0.0f, 3, (Object) null), androidx.compose.animation.g.q((N) null, 0.0f, 3, (Object) null), (String) null, C14569i.f127688a.a(), mVar, 1600512, 18);
                pVar.invoke(mVar, Integer.valueOf(i10 & 14));
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((p) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f127626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f127627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<X> f127628c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f127629d;

        d(C4899r0<String> r0Var, C17631a<C16807N> aVar, C4899r0<X> r0Var2, C4899r0<Boolean> r0Var3) {
            this.f127626a = r0Var;
            this.f127627b = aVar;
            this.f127628c = r0Var2;
            this.f127629d = r0Var3;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17631a aVar, C4899r0 r0Var, C4899r0 r0Var2, C4899r0 r0Var3) {
            V.m(aVar, r0Var, r0Var2, r0Var3);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(l0.e r26, U0.C4889m r27, int r28) {
            /*
                r25 = this;
                r0 = r25
                r8 = r27
                java.lang.String r1 = "$this$AnimatedVisibility"
                r2 = r26
                kotlin.jvm.internal.C17542s.j(r2, r1)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x001c
                r1 = -1
                java.lang.String r2 = "com.sugarcube.app.base.ui.compose.SearchBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:308)"
                r3 = -120074505(0xfffffffff8d7cef7, float:-3.5016924E34)
                r4 = r28
                U0.C4895p.S(r3, r4, r1, r2)
            L_0x001c:
                androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
                r1 = 4
                float r1 = (float) r1
                float r10 = c2.h.B(r1)
                r1 = 8
                float r1 = (float) r1
                float r12 = c2.h.B(r1)
                r14 = 10
                r15 = 0
                r11 = 0
                r13 = 0
                androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.m(r9, r10, r11, r12, r13, r14, r15)
                r1 = -210817352(0xfffffffff36f2eb8, float:-1.894999E31)
                r8.W(r1)
                java.lang.Object r1 = r27.D()
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r3 = r2.a()
                if (r1 != r3) goto L_0x004d
                r0.m r1 = r0.l.a()
                r8.u(r1)
            L_0x004d:
                r17 = r1
                r0.m r17 = (r0.m) r17
                r27.P()
                r1 = -210819615(0xfffffffff36f25e1, float:-1.8947254E31)
                r8.W(r1)
                U0.r0<java.lang.String> r1 = r0.f127626a
                boolean r1 = r8.V(r1)
                nI.a<XH.N> r3 = r0.f127627b
                boolean r3 = r8.V(r3)
                r1 = r1 | r3
                U0.r0<iF.X> r3 = r0.f127628c
                boolean r3 = r8.V(r3)
                r1 = r1 | r3
                nI.a<XH.N> r3 = r0.f127627b
                U0.r0<iF.X> r4 = r0.f127628c
                U0.r0<java.lang.String> r5 = r0.f127626a
                U0.r0<java.lang.Boolean> r6 = r0.f127629d
                java.lang.Object r7 = r27.D()
                if (r1 != 0) goto L_0x0082
                java.lang.Object r1 = r2.a()
                if (r7 != r1) goto L_0x008a
            L_0x0082:
                iF.W r7 = new iF.W
                r7.<init>(r3, r4, r5, r6)
                r8.u(r7)
            L_0x008a:
                r22 = r7
                nI.a r22 = (nI.C17631a) r22
                r27.P()
                r23 = 28
                r24 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.d.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
                uK.c r1 = uK.C18148c.Cross
                int r1 = r1.m()
                r2 = 0
                t1.c r1 = J1.e.c(r1, r8, r2)
                p1.w0$a r9 = p1.C5749w0.f27365b
                rF.b r2 = rF.C15002a.a(r8, r2)
                long r10 = r2.h()
                r13 = 2
                r14 = 0
                r12 = 0
                p1.w0 r7 = p1.C5749w0.a.b(r9, r10, r12, r13, r14)
                r9 = 48
                r10 = 56
                java.lang.String r2 = "Cancel icon"
                r4 = 0
                r5 = 0
                r6 = 0
                r8 = r27
                n0.C5583F.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00d4
                U0.C4895p.R()
            L_0x00d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: iF.V.d.b(l0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements C17642l<String, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f127630a;

        e(C17642l<? super String, C16807N> lVar) {
            this.f127630a = lVar;
        }

        public final void a(String str) {
            C17542s.j(str, "it");
            this.f127630a.invoke(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final f f127631c = new f();

        public f() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(String str) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f127632c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f127633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17642l lVar, List list) {
            super(1);
            this.f127632c = lVar;
            this.f127633d = list;
        }

        public final Object a(int i10) {
            return this.f127632c.invoke(this.f127633d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f127634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f127635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(List list, C17642l lVar) {
            super(4);
            this.f127634c = list;
            this.f127635d = lVar;
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
                String str = (String) this.f127634c.get(i10);
                mVar.W(966402313);
                mVar.W(2109385676);
                boolean V10 = mVar.V(this.f127635d);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new e(this.f127635d);
                    mVar.u(D10);
                }
                mVar.P();
                V.z(str, (C17642l) D10, mVar, 0);
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

    /* access modifiers changed from: private */
    public static final C16807N A(C17642l lVar, String str) {
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(String str, C17642l lVar, int i10, C4889m mVar, int i11) {
        z(str, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void C(java.util.List<java.lang.String> r17, nI.C17642l<? super java.lang.String, XH.C16807N> r18, U0.C4889m r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.String r3 = "suggestions"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onSuggestionClicked"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = 1593850313(0x5f0039c9, float:9.239637E18)
            r4 = r19
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x0028
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r2
            goto L_0x0029
        L_0x0028:
            r4 = r2
        L_0x0029:
            r5 = r2 & 48
            r6 = 32
            if (r5 != 0) goto L_0x003a
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x0037
            r5 = r6
            goto L_0x0039
        L_0x0037:
            r5 = 16
        L_0x0039:
            r4 = r4 | r5
        L_0x003a:
            r5 = r4 & 19
            r7 = 18
            if (r5 != r7) goto L_0x004e
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0047
            goto L_0x004e
        L_0x0047:
            r15.L()
            r16 = r15
            goto L_0x00d6
        L_0x004e:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x005a
            r5 = -1
            java.lang.String r7 = "com.sugarcube.app.base.ui.compose.SearchSuggestions (SearchBar.kt:330)"
            U0.C4895p.S(r3, r4, r5, r7)
        L_0x005a:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r5 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r3, r5, r8, r7)
            r3 = 0
            rF.b r5 = rF.C15002a.a(r15, r3)
            long r10 = r5.c()
            r13 = 2
            r14 = 0
            r12 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.d(r9, r10, r12, r13, r14)
            float r7 = (float) r3
            float r10 = c2.h.B(r7)
            r7 = 12
            float r7 = (float) r7
            float r12 = c2.h.B(r7)
            r13 = 5
            r9 = 0
            r11 = 0
            s0.E r7 = androidx.compose.foundation.layout.D.e(r9, r10, r11, r12, r13, r14)
            r9 = 216121702(0xce1c166, float:3.4783136E-31)
            r15.W(r9)
            boolean r9 = r15.F(r0)
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r6) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r8 = r3
        L_0x0096:
            r3 = r9 | r8
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x00a6
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x00ae
        L_0x00a6:
            iF.P r4 = new iF.P
            r4.<init>(r0, r1)
            r15.u(r4)
        L_0x00ae:
            r12 = r4
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r14 = 384(0x180, float:5.38E-43)
            r3 = 250(0xfa, float:3.5E-43)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r13 = r15
            r16 = r15
            r15 = r3
            t0.C5937b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00d6
            U0.C4895p.R()
        L_0x00d6:
            U0.Y0 r3 = r16.n()
            if (r3 == 0) goto L_0x00e4
            iF.Q r4 = new iF.Q
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iF.V.C(java.util.List, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N D(List list, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        xVar.e(list.size(), (C17642l<? super Integer, ? extends Object>) null, new g(f.f127631c, list), c1.c.c(-632812321, true, new h(list, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(List list, C17642l lVar, int i10, C4889m mVar, int i11) {
        C(list, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(nI.C17642l<? super java.lang.String, XH.C16807N> r77, nI.C17631a<XH.C16807N> r78, nI.C17642l<? super java.lang.String, XH.C16807N> r79, U0.A1<? extends java.util.List<java.lang.String>> r80, U0.C4899r0<iF.X> r81, U0.C4889m r82, int r83) {
        /*
            r8 = r77
            r9 = r78
            r10 = r79
            r11 = r80
            r12 = r81
            r13 = r83
            r14 = 48
            java.lang.String r0 = "onSearch"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onSearchCleared"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onSuggestionClicked"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "suggestions"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "searchBarUiState"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 1229735416(0x494c45f8, float:836703.5)
            r1 = r82
            U0.m r15 = r1.k(r0)
            r7 = 6
            r1 = r13 & 6
            r6 = 2
            if (r1 != 0) goto L_0x0041
            boolean r1 = r15.F(r8)
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = r6
        L_0x003f:
            r1 = r1 | r13
            goto L_0x0042
        L_0x0041:
            r1 = r13
        L_0x0042:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0052
            boolean r2 = r15.F(r9)
            if (r2 == 0) goto L_0x004f
            r2 = 32
            goto L_0x0051
        L_0x004f:
            r2 = 16
        L_0x0051:
            r1 = r1 | r2
        L_0x0052:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0062
            boolean r2 = r15.F(r10)
            if (r2 == 0) goto L_0x005f
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r2
        L_0x0062:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0072
            boolean r2 = r15.V(r11)
            if (r2 == 0) goto L_0x006f
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r1 = r1 | r2
        L_0x0072:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x0083
            boolean r2 = r15.V(r12)
            if (r2 == 0) goto L_0x0080
            r2 = r3
            goto L_0x0082
        L_0x0080:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0082:
            r1 = r1 | r2
        L_0x0083:
            r2 = r1
            r1 = r2 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r4) goto L_0x009a
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x0091
            goto L_0x009a
        L_0x0091:
            r15.L()
            r2 = r8
            r6 = r9
            r5 = r12
            r7 = r15
            goto L_0x0781
        L_0x009a:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00a6
            r1 = -1
            java.lang.String r4 = "com.sugarcube.app.base.ui.compose.SearchBar (SearchBar.kt:144)"
            U0.C4895p.S(r0, r2, r1, r4)
        L_0x00a6:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r4 = -866459253(0xffffffffcc5ae18b, float:-5.7378348E7)
            r15.W(r4)
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r2
            r14 = 1
            if (r4 != r3) goto L_0x00b9
            r16 = r14
            goto L_0x00bb
        L_0x00b9:
            r16 = r0
        L_0x00bb:
            java.lang.Object r3 = r15.D()
            if (r16 != 0) goto L_0x00c9
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r5 = r16.a()
            if (r3 != r5) goto L_0x00d1
        L_0x00c9:
            iF.J r3 = new iF.J
            r3.<init>(r12)
            r15.u(r3)
        L_0x00d1:
            r5 = r3
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            r16 = 0
            r19 = 6
            r3 = 0
            r20 = 0
            r35 = r2
            r2 = r3
            r3 = r20
            r37 = r4
            r4 = r5
            r5 = r15
            r0 = r6
            r6 = r16
            r7 = r19
            java.lang.Object r1 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            U0.r0 r7 = (U0.C4899r0) r7
            r1 = -866456440(0xffffffffcc5aec88, float:-5.73896E7)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            U0.m$a r25 = U0.C4889m.f14007a
            java.lang.Object r2 = r25.a()
            r6 = 0
            if (r1 != r2) goto L_0x0122
            java.lang.String r1 = o(r7)
            if (r1 == 0) goto L_0x0115
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r1 = 0
            goto L_0x0116
        L_0x0115:
            r1 = r14
        L_0x0116:
            r1 = r1 ^ r14
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            U0.r0 r1 = U0.u1.e(r1, r6, r0, r6)
            r15.u(r1)
        L_0x0122:
            r0 = r1
            U0.r0 r0 = (U0.C4899r0) r0
            r15.P()
            r1 = 24
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            U0.I0 r2 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r2 = r15.Q(r2)
            r5 = r2
            n1.f r5 = (n1.C5626f) r5
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r2 = s0.C5852X.b(r16)
            A0.f r1 = A0.g.e(r1)
            androidx.compose.ui.d r17 = m1.e.a(r2, r1)
            r1 = 0
            rF.b r2 = rF.C15002a.a(r15, r1)
            long r18 = r2.c()
            r21 = 2
            r22 = 0
            r20 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.b.d(r17, r18, r20, r21, r22)
            i1.c$a r26 = i1.C5437c.f24302a
            i1.c r2 = r26.o()
            r3 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r3)
            int r4 = U0.C4883j.a(r15, r3)
            U0.y r3 = r15.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
            G1.g$a r27 = G1.C4504g.f6515W
            nI.a r6 = r27.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x0181
            U0.C4883j.c()
        L_0x0181:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x018e
            r15.p(r6)
            goto L_0x0191
        L_0x018e:
            r15.t()
        L_0x0191:
            U0.m r6 = U0.F1.a(r15)
            nI.p r14 = r27.c()
            U0.F1.c(r6, r2, r14)
            nI.p r2 = r27.e()
            U0.F1.c(r6, r3, r2)
            nI.p r2 = r27.b()
            boolean r3 = r6.i()
            if (r3 != 0) goto L_0x01bb
            java.lang.Object r3 = r6.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r14)
            if (r3 != 0) goto L_0x01c9
        L_0x01bb:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r6.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r6.w(r3, r2)
        L_0x01c9:
            nI.p r2 = r27.d()
            U0.F1.c(r6, r1, r2)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            java.lang.Object r1 = r81.getValue()
            iF.X r1 = (iF.X) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x01e6
            r1 = 48
            float r2 = (float) r1
            float r1 = c2.h.B(r2)
            goto L_0x01ed
        L_0x01e6:
            r1 = 264(0x108, float:3.7E-43)
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
        L_0x01ed:
            r6 = 384(0x180, float:5.38E-43)
            r14 = 10
            r2 = 0
            java.lang.String r3 = "search bar width"
            r4 = 0
            r39 = r16
            r40 = r5
            r5 = r15
            r41 = r7
            r7 = r14
            U0.A1 r14 = m0.C5534c.c(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r81.getValue()
            iF.X r1 = (iF.X) r1
            boolean r1 = r1.f()
            r7 = r40
            if (r1 == 0) goto L_0x0212
            l(r7, r0)
        L_0x0212:
            java.lang.Object r1 = r81.getValue()
            iF.X r1 = (iF.X) r1
            boolean r1 = r1.g()
            if (r1 != 0) goto L_0x0221
            l(r7, r0)
        L_0x0221:
            java.lang.String r1 = o(r41)
            java.lang.Object r2 = r81.getValue()
            iF.X r2 = (iF.X) r2
            java.lang.String r2 = r2.e()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r1 != 0) goto L_0x0247
            java.lang.Object r1 = r81.getValue()
            iF.X r1 = (iF.X) r1
            java.lang.String r1 = r1.e()
            r6 = r41
            u(r6, r1)
        L_0x0244:
            r1 = 48
            goto L_0x024a
        L_0x0247:
            r6 = r41
            goto L_0x0244
        L_0x024a:
            float r5 = (float) r1
            float r18 = c2.h.B(r5)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r39
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r14.getValue()
            c2.h r2 = (c2.h) r2
            float r2 = r2.G()
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.y(r1, r2)
            i1.c r2 = r26.o()
            r3 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r3)
            int r4 = U0.C4883j.a(r15, r3)
            U0.y r3 = r15.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
            r16 = r5
            nI.a r5 = r27.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0291
            U0.C4883j.c()
        L_0x0291:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x029e
            r15.p(r5)
            goto L_0x02a1
        L_0x029e:
            r15.t()
        L_0x02a1:
            U0.m r5 = U0.F1.a(r15)
            nI.p r10 = r27.c()
            U0.F1.c(r5, r2, r10)
            nI.p r2 = r27.e()
            U0.F1.c(r5, r3, r2)
            nI.p r2 = r27.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x02cb
            java.lang.Object r3 = r5.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r10)
            if (r3 != 0) goto L_0x02d9
        L_0x02cb:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r5.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r5.w(r3, r2)
        L_0x02d9:
            nI.p r2 = r27.d()
            U0.F1.c(r5, r1, r2)
            java.lang.Object r1 = r80.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = 349600503(0x14d67af7, float:2.1656979E-26)
            r15.W(r2)
            r10 = 54
            if (r1 != 0) goto L_0x02fb
            r82 = r0
            r42 = r6
            r43 = r7
            r7 = r15
            r28 = r16
            goto L_0x036a
        L_0x02fb:
            boolean r2 = v(r0)
            if (r2 == 0) goto L_0x030d
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x030d
            r17 = 1
            goto L_0x030f
        L_0x030d:
            r17 = 0
        L_0x030f:
            r22 = 15
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            androidx.compose.animation.i r18 = androidx.compose.animation.g.m(r18, r19, r20, r21, r22, r23)
            r32 = 15
            r33 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            androidx.compose.animation.k r19 = androidx.compose.animation.g.A(r28, r29, r30, r31, r32, r33)
            iF.V$a r5 = new iF.V$a
            r3 = r0
            r4 = 0
            r0 = r5
            r2 = r7
            r82 = r3
            r3 = r77
            r4 = r6
            r11 = r5
            r28 = r16
            r5 = r81
            r42 = r6
            r6 = r79
            r43 = r7
            r7 = r82
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -70318149(0xfffffffffbcf07bb, float:-2.1499245E36)
            r1 = 1
            c1.a r20 = c1.c.e(r0, r1, r11, r15, r10)
            r22 = 200064(0x30d80, float:2.8035E-40)
            r23 = 18
            r16 = 0
            r0 = 0
            r7 = r15
            r15 = r17
            r17 = r18
            r18 = r19
            r19 = r0
            r21 = r7
            l0.d.g(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            XH.N r0 = XH.C16807N.f139792a
        L_0x036a:
            r7.P()
            r7.x()
            float r0 = c2.h.B(r28)
            r1 = r39
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r1, r0)
            java.lang.Object r2 = r14.getValue()
            c2.h r2 = (c2.h) r2
            float r2 = r2.G()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r0, r2)
            i1.c r2 = r26.o()
            r11 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r11)
            int r3 = U0.C4883j.a(r7, r11)
            U0.y r4 = r7.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r7, r0)
            nI.a r5 = r27.a()
            U0.f r6 = r7.m()
            if (r6 != 0) goto L_0x03aa
            U0.C4883j.c()
        L_0x03aa:
            r7.I()
            boolean r6 = r7.i()
            if (r6 == 0) goto L_0x03b7
            r7.p(r5)
            goto L_0x03ba
        L_0x03b7:
            r7.t()
        L_0x03ba:
            U0.m r5 = U0.F1.a(r7)
            nI.p r6 = r27.c()
            U0.F1.c(r5, r2, r6)
            nI.p r2 = r27.e()
            U0.F1.c(r5, r4, r2)
            nI.p r2 = r27.b()
            boolean r4 = r5.i()
            if (r4 != 0) goto L_0x03e4
            java.lang.Object r4 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 != 0) goto L_0x03f2
        L_0x03e4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.w(r3, r2)
        L_0x03f2:
            nI.p r2 = r27.d()
            U0.F1.c(r5, r0, r2)
            float r0 = c2.h.B(r28)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r1, r0)
            r2 = 8
            float r2 = (float) r2
            float r3 = c2.h.B(r2)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.i(r0, r3)
            i1.c$c r3 = r26.i()
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r4 = r4.f()
            r5 = 48
            E1.I r3 = androidx.compose.foundation.layout.G.b(r4, r3, r7, r5)
            int r4 = U0.C4883j.a(r7, r11)
            U0.y r5 = r7.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r7, r0)
            nI.a r6 = r27.a()
            U0.f r14 = r7.m()
            if (r14 != 0) goto L_0x0435
            U0.C4883j.c()
        L_0x0435:
            r7.I()
            boolean r14 = r7.i()
            if (r14 == 0) goto L_0x0442
            r7.p(r6)
            goto L_0x0445
        L_0x0442:
            r7.t()
        L_0x0445:
            U0.m r6 = U0.F1.a(r7)
            nI.p r14 = r27.c()
            U0.F1.c(r6, r3, r14)
            nI.p r3 = r27.e()
            U0.F1.c(r6, r5, r3)
            nI.p r3 = r27.b()
            boolean r5 = r6.i()
            if (r5 != 0) goto L_0x046f
            java.lang.Object r5 = r6.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r14)
            if (r5 != 0) goto L_0x047d
        L_0x046f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.w(r4, r3)
        L_0x047d:
            nI.p r3 = r27.d()
            U0.F1.c(r6, r0, r3)
            s0.N r6 = s0.C5843N.f28726a
            r0 = 169861529(0xa1fe199, float:7.698002E-33)
            r7.W(r0)
            java.lang.Object r0 = r7.D()
            java.lang.Object r3 = r25.a()
            if (r0 != r3) goto L_0x049d
            r0.m r0 = r0.l.a()
            r7.u(r0)
        L_0x049d:
            r27 = r0
            r0.m r27 = (r0.m) r27
            r7.P()
            r0 = 169865619(0xa1ff193, float:7.7010066E-33)
            r7.W(r0)
            r4 = r37
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 != r5) goto L_0x04b2
            r0 = 1
            goto L_0x04b3
        L_0x04b2:
            r0 = r11
        L_0x04b3:
            java.lang.Object r3 = r7.D()
            if (r0 != 0) goto L_0x04bf
            java.lang.Object r0 = r25.a()
            if (r3 != r0) goto L_0x04c7
        L_0x04bf:
            iF.K r3 = new iF.K
            r3.<init>(r12)
            r7.u(r3)
        L_0x04c7:
            r32 = r3
            nI.a r32 = (nI.C17631a) r32
            r7.P()
            r33 = 28
            r34 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r26 = r1
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.b(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3 = 4
            float r14 = (float) r3
            float r15 = c2.h.B(r14)
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.D.i(r0, r15)
            uK.c r0 = uK.C18148c.MagnifyingGlass
            int r0 = r0.m()
            t1.c r15 = J1.e.c(r0, r7, r11)
            p1.w0$a r18 = p1.C5749w0.f27365b
            rF.b r0 = rF.C15002a.a(r7, r11)
            long r19 = r0.f()
            r22 = 2
            r23 = 0
            r21 = 0
            p1.w0 r21 = p1.C5749w0.a.b(r18, r19, r21, r22, r23)
            r23 = 48
            r24 = 56
            java.lang.String r16 = "Search icon"
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = r7
            n0.C5583F.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            float r19 = c2.h.B(r14)
            r21 = 11
            r22 = 0
            r17 = 0
            r18 = 0
            r16 = r1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r14 = 6
            s0.C5844O.a(r0, r7, r14)
            float r19 = c2.h.B(r2)
            androidx.compose.ui.d r15 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r18 = 2
            r19 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r14 = r6
            androidx.compose.ui.d r0 = s0.C5842M.e(r14, r15, r16, r17, r18, r19)
            r1 = 169888439(0xa204ab7, float:7.717772E-33)
            r7.W(r1)
            if (r4 != r5) goto L_0x054e
            r1 = 1
            goto L_0x054f
        L_0x054e:
            r1 = r11
        L_0x054f:
            java.lang.Object r2 = r7.D()
            if (r1 != 0) goto L_0x055b
            java.lang.Object r1 = r25.a()
            if (r2 != r1) goto L_0x0563
        L_0x055b:
            iF.L r2 = new iF.L
            r2.<init>(r12)
            r7.u(r2)
        L_0x0563:
            nI.l r2 = (nI.C17642l) r2
            r7.P()
            androidx.compose.ui.d r14 = androidx.compose.ui.focus.b.a(r0, r2)
            r0 = 169895063(0xa206497, float:7.7226386E-33)
            r7.W(r0)
            r15 = r43
            boolean r0 = r7.F(r15)
            r1 = r35
            r2 = r1 & 14
            if (r2 != r3) goto L_0x0581
            r16 = 1
            goto L_0x0583
        L_0x0581:
            r16 = r11
        L_0x0583:
            r0 = r0 | r16
            r10 = r42
            boolean r16 = r7.V(r10)
            r0 = r0 | r16
            if (r4 != r5) goto L_0x0592
            r16 = 1
            goto L_0x0594
        L_0x0592:
            r16 = r11
        L_0x0594:
            r0 = r0 | r16
            r1 = r1 & 896(0x380, float:1.256E-42)
            r11 = 256(0x100, float:3.59E-43)
            if (r1 != r11) goto L_0x059f
            r16 = 1
            goto L_0x05a1
        L_0x059f:
            r16 = 0
        L_0x05a1:
            r0 = r0 | r16
            java.lang.Object r3 = r7.D()
            if (r0 != 0) goto L_0x05b7
            java.lang.Object r0 = r25.a()
            if (r3 != r0) goto L_0x05b0
            goto L_0x05b7
        L_0x05b0:
            r13 = r1
            r11 = r2
            r8 = r4
            r12 = r5
            r44 = r6
            goto L_0x05d2
        L_0x05b7:
            iF.V$b r3 = new iF.V$b
            r0 = r3
            r13 = r1
            r1 = r10
            r11 = r2
            r2 = r79
            r9 = r3
            r3 = r15
            r8 = r4
            r4 = r82
            r12 = r5
            r5 = r77
            r44 = r6
            r6 = r81
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.u(r9)
            r3 = r9
        L_0x05d2:
            nI.l r3 = (nI.C17642l) r3
            r7.P()
            androidx.compose.ui.d r17 = androidx.compose.ui.input.key.a.a(r14, r3)
            java.lang.String r0 = o(r10)
            if (r0 != 0) goto L_0x05e3
            java.lang.String r0 = ""
        L_0x05e3:
            r9 = r0
            p1.j1 r14 = new p1.j1
            r6 = 0
            rF.b r0 = rF.C15002a.a(r7, r6)
            long r0 = r0.f()
            r5 = 0
            r14.<init>(r0, r5)
            B0.A r21 = new B0.A
            T1.r$a r0 = T1.r.f13620b
            int r49 = r0.g()
            r53 = 119(0x77, float:1.67E-43)
            r54 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r45 = r21
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r0 = 169921166(0xa20ca8e, float:7.741816E-33)
            r7.W(r0)
            boolean r0 = r7.F(r15)
            r1 = 4
            if (r11 != r1) goto L_0x061f
            r1 = 1
            goto L_0x0620
        L_0x061f:
            r1 = r6
        L_0x0620:
            r0 = r0 | r1
            boolean r1 = r7.V(r10)
            r0 = r0 | r1
            if (r8 != r12) goto L_0x062a
            r1 = 1
            goto L_0x062b
        L_0x062a:
            r1 = r6
        L_0x062b:
            r0 = r0 | r1
            r1 = 256(0x100, float:3.59E-43)
            if (r13 != r1) goto L_0x0632
            r1 = 1
            goto L_0x0633
        L_0x0632:
            r1 = r6
        L_0x0633:
            r0 = r0 | r1
            java.lang.Object r1 = r7.D()
            if (r0 != 0) goto L_0x0645
            java.lang.Object r0 = r25.a()
            if (r1 != r0) goto L_0x0641
            goto L_0x0645
        L_0x0641:
            r15 = r5
            r36 = r6
            goto L_0x065c
        L_0x0645:
            iF.M r13 = new iF.M
            r0 = r13
            r1 = r10
            r2 = r79
            r3 = r15
            r4 = r82
            r15 = r5
            r5 = r77
            r36 = r6
            r6 = r81
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.u(r13)
            r1 = r13
        L_0x065c:
            r31 = r1
            nI.l r31 = (nI.C17642l) r31
            r7.P()
            B0.z r22 = new B0.z
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 47
            r34 = 0
            r26 = r22
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            N1.Y r20 = new N1.Y
            r45 = r20
            tK.v r0 = tK.C18030v.f147664a
            int r1 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r7, r1)
            long r46 = r0.G0()
            r75 = 16777214(0xfffffe, float:2.3509884E-38)
            r76 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r45.<init>(r46, r48, r50, r51, r52, r53, r54, r55, r57, r58, r59, r60, r62, r63, r64, r65, r66, r67, r69, r70, r71, r72, r73, r74, r75, r76)
            r0 = 169907790(0xa20964e, float:7.731989E-33)
            r7.W(r0)
            r0 = 4
            if (r11 != r0) goto L_0x06c9
            r0 = 1
            goto L_0x06cb
        L_0x06c9:
            r0 = r36
        L_0x06cb:
            boolean r1 = r7.V(r10)
            r0 = r0 | r1
            if (r8 != r12) goto L_0x06d4
            r1 = 1
            goto L_0x06d6
        L_0x06d4:
            r1 = r36
        L_0x06d6:
            r0 = r0 | r1
            java.lang.Object r1 = r7.D()
            if (r0 != 0) goto L_0x06eb
            java.lang.Object r0 = r25.a()
            if (r1 != r0) goto L_0x06e4
            goto L_0x06eb
        L_0x06e4:
            r2 = r77
            r5 = r81
            r0 = r82
            goto L_0x06f9
        L_0x06eb:
            iF.N r1 = new iF.N
            r2 = r77
            r5 = r81
            r0 = r82
            r1.<init>(r2, r5, r10, r0)
            r7.u(r1)
        L_0x06f9:
            r16 = r1
            nI.l r16 = (nI.C17642l) r16
            r7.P()
            iF.V$c r1 = new iF.V$c
            r3 = r44
            r1.<init>(r3, r10)
            r4 = 959101660(0x392abadc, float:1.6282074E-4)
            r6 = 1
            r8 = 54
            c1.a r30 = c1.c.e(r4, r6, r1, r7, r8)
            r33 = 196608(0x30000, float:2.75506E-40)
            r34 = 15896(0x3e18, float:2.2275E-41)
            r18 = 0
            r19 = 0
            r23 = 1
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r32 = 102236160(0x6180000, float:2.8588023E-35)
            r1 = r15
            r15 = r9
            r29 = r14
            r31 = r7
            B0.C4359c.b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.String r4 = o(r10)
            if (r4 == 0) goto L_0x0741
            int r4 = r4.length()
            if (r4 != 0) goto L_0x073d
            goto L_0x0741
        L_0x073d:
            r38 = r36
            r4 = 1
            goto L_0x0744
        L_0x0741:
            r4 = 1
            r38 = 1
        L_0x0744:
            r16 = r38 ^ 1
            r6 = 0
            r8 = 3
            androidx.compose.animation.i r18 = androidx.compose.animation.g.o(r1, r6, r8, r1)
            androidx.compose.animation.k r19 = androidx.compose.animation.g.q(r1, r6, r8, r1)
            iF.V$d r1 = new iF.V$d
            r6 = r78
            r1.<init>(r10, r6, r5, r0)
            r0 = -120074505(0xfffffffff8d7cef7, float:-3.5016924E34)
            r8 = 54
            c1.a r21 = c1.c.e(r0, r4, r1, r7, r8)
            r23 = 1600518(0x186c06, float:2.242803E-39)
            r24 = 18
            r17 = 0
            r20 = 0
            r15 = r3
            r22 = r7
            l0.d.f(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7.x()
            r7.x()
            r7.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0781
            U0.C4895p.R()
        L_0x0781:
            U0.Y0 r7 = r7.n()
            if (r7 == 0) goto L_0x079c
            iF.O r8 = new iF.O
            r0 = r8
            r1 = r77
            r2 = r78
            r3 = r79
            r4 = r80
            r5 = r81
            r6 = r83
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x079c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iF.V.k(nI.l, nI.a, nI.l, U0.A1, U0.r0, U0.m, int):void");
    }

    private static final void l(C5626f fVar, C4899r0<Boolean> r0Var) {
        C5626f.q(fVar, false, 1, (Object) null);
        if (v(r0Var)) {
            w(r0Var, false);
        }
    }

    /* access modifiers changed from: private */
    public static final void m(C17631a<C16807N> aVar, C4899r0<X> r0Var, C4899r0<String> r0Var2, C4899r0<Boolean> r0Var3) {
        u(r0Var2, "");
        w(r0Var3, false);
        aVar.invoke();
        X.f127640g.f(r0Var, (String) null);
    }

    /* access modifiers changed from: private */
    public static final C4899r0 n(C4899r0 r0Var) {
        return u1.e(((X) r0Var.getValue()).e(), (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final String o(C4899r0<String> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C4899r0 r0Var) {
        X.f127640g.e(r0Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C4899r0 r0Var, C5635o oVar) {
        C17542s.j(oVar, "it");
        if (oVar.b()) {
            X.f127640g.d(r0Var);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C4899r0 r0Var, C17642l lVar, C5626f fVar, C4899r0 r0Var2, C17642l lVar2, C4899r0 r0Var3, C4380y yVar) {
        C17542s.j(yVar, "$this$KeyboardActions");
        y(lVar, fVar, r0Var2, lVar2, r0Var3, r0Var, o(r0Var));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C17642l lVar, C4899r0 r0Var, C4899r0 r0Var2, C4899r0 r0Var3, String str) {
        C17542s.j(str, "it");
        x(lVar, r0Var, r0Var2, str);
        w(r0Var3, str.length() > 0);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17642l lVar, C17631a aVar, C17642l lVar2, A1 a12, C4899r0 r0Var, int i10, C4889m mVar, int i11) {
        k(lVar, aVar, lVar2, a12, r0Var, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void u(C4899r0<String> r0Var, String str) {
        r0Var.setValue(str);
    }

    private static final boolean v(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void w(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final void x(C17642l<? super String, C16807N> lVar, C4899r0<X> r0Var, C4899r0<String> r0Var2, String str) {
        lVar.invoke(str);
        u(r0Var2, str);
        X.f127640g.f(r0Var, str);
    }

    /* access modifiers changed from: private */
    public static final void y(C17642l<? super String, C16807N> lVar, C5626f fVar, C4899r0<Boolean> r0Var, C17642l<? super String, C16807N> lVar2, C4899r0<X> r0Var2, C4899r0<String> r0Var3, String str) {
        l(fVar, r0Var);
        if (str != null && str.length() != 0) {
            x(lVar2, r0Var2, r0Var3, str);
            lVar.invoke(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z(java.lang.String r53, nI.C17642l<? super java.lang.String, XH.C16807N> r54, U0.C4889m r55, int r56) {
        /*
            r0 = r53
            r15 = r54
            java.lang.String r1 = "suggestion"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            java.lang.String r1 = "onClick"
            kotlin.jvm.internal.C17542s.j(r15, r1)
            r1 = 673100586(0x281eb32a, float:8.809612E-15)
            r2 = r55
            U0.m r13 = r2.k(r1)
            r2 = r56 & 6
            r3 = 4
            if (r2 != 0) goto L_0x0028
            boolean r2 = r13.V(r0)
            if (r2 == 0) goto L_0x0024
            r2 = r3
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r56 | r2
            goto L_0x002a
        L_0x0028:
            r2 = r56
        L_0x002a:
            r4 = r56 & 48
            r5 = 32
            if (r4 != 0) goto L_0x003b
            boolean r4 = r13.F(r15)
            if (r4 == 0) goto L_0x0038
            r4 = r5
            goto L_0x003a
        L_0x0038:
            r4 = 16
        L_0x003a:
            r2 = r2 | r4
        L_0x003b:
            r4 = r2 & 19
            r6 = 18
            if (r4 != r6) goto L_0x004f
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            r13.L()
            r25 = r13
            goto L_0x01ea
        L_0x004f:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x005b
            r4 = -1
            java.lang.String r6 = "com.sugarcube.app.base.ui.compose.SearchSuggestionItem (SearchBar.kt:352)"
            U0.C4895p.S(r1, r2, r4, r6)
        L_0x005b:
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r4 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r1, r4, r7, r6)
            r1 = -23219588(0xfffffffffe9db27c, float:-1.0480777E38)
            r13.W(r1)
            java.lang.Object r1 = r13.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r6 = r4.a()
            if (r1 != r6) goto L_0x007d
            r0.m r1 = r0.l.a()
            r13.u(r1)
        L_0x007d:
            r17 = r1
            r0.m r17 = (r0.m) r17
            r13.P()
            r22 = 6
            r23 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            n0.I r18 = O0.C4756u0.c(r18, r19, r20, r22, r23)
            r1 = -23215757(0xfffffffffe9dc173, float:-1.0484662E38)
            r13.W(r1)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r6 = 0
            if (r1 != r5) goto L_0x009f
            r1 = r7
            goto L_0x00a0
        L_0x009f:
            r1 = r6
        L_0x00a0:
            r14 = r2 & 14
            if (r14 != r3) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r7 = r6
        L_0x00a6:
            r1 = r1 | r7
            java.lang.Object r2 = r13.D()
            if (r1 != 0) goto L_0x00b3
            java.lang.Object r1 = r4.a()
            if (r2 != r1) goto L_0x00bb
        L_0x00b3:
            iF.S r2 = new iF.S
            r2.<init>(r15, r0)
            r13.u(r2)
        L_0x00bb:
            r22 = r2
            nI.a r22 = (nI.C17631a) r22
            r13.P()
            r23 = 28
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            androidx.compose.ui.d r25 = androidx.compose.foundation.d.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = 36
            float r1 = (float) r1
            float r26 = c2.h.B(r1)
            float r28 = c2.h.B(r1)
            r30 = 10
            r31 = 0
            r27 = 0
            r29 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r25, r26, r27, r28, r29, r30, r31)
            r2 = 8
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.i(r1, r2)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r2 = r2.f()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.l()
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r13, r6)
            int r3 = U0.C4883j.a(r13, r6)
            U0.y r4 = r13.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r7 = r13.m()
            if (r7 != 0) goto L_0x011d
            U0.C4883j.c()
        L_0x011d:
            r13.I()
            boolean r7 = r13.i()
            if (r7 == 0) goto L_0x012a
            r13.p(r6)
            goto L_0x012d
        L_0x012a:
            r13.t()
        L_0x012d:
            U0.m r6 = U0.F1.a(r13)
            nI.p r7 = r5.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r5.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r5.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0157
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x0165
        L_0x0157:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x0165:
            nI.p r2 = r5.d()
            U0.F1.c(r6, r1, r2)
            s0.N r1 = s0.C5843N.f28726a
            N1.Y r21 = new N1.Y
            r20 = r21
            tK.v r1 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r1 = r1.a(r13, r2)
            long r22 = r1.G0()
            r51 = 16777214(0xfffffe, float:2.3509884E-38)
            r52 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r21.<init>(r22, r24, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r45, r46, r47, r48, r49, r50, r51, r52)
            r23 = 3072(0xc00, float:4.305E-42)
            r24 = 57342(0xdffe, float:8.0353E-41)
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r25 = r13
            r22 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 1
            r18 = 0
            r19 = 0
            r0 = r53
            r21 = r25
            I0.b1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r25.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ea
            U0.C4895p.R()
        L_0x01ea:
            U0.Y0 r0 = r25.n()
            if (r0 == 0) goto L_0x01fe
            iF.T r1 = new iF.T
            r2 = r53
            r3 = r54
            r4 = r56
            r1.<init>(r2, r3, r4)
            r0.a(r1)
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iF.V.z(java.lang.String, nI.l, U0.m, int):void");
    }
}
