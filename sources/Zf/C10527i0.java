package zf;

import HJ.C15854t;
import U0.C4889m;
import XH.C16807N;
import XH.t;
import c1.c;
import com.ingka.ikea.app.browseandsearch.browseV2.e;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import u0.C5968C;
import u0.C5972G;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;
import zf.C10521f0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu0/C;", "Lzf/f0;", "inAppUpdateUiState", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/e;", "LXH/N;", "onScreenUiEvent", "b", "(Lu0/C;Lzf/f0;LnI/l;)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zf.i0  reason: case insensitive filesystem */
public final class C10527i0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.i0$a */
    static final class a implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10521f0 f78282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<e, C16807N> f78283b;

        a(C10521f0 f0Var, C17642l<? super e, C16807N> lVar) {
            this.f78282a = f0Var;
            this.f78283b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C5991o oVar, C10521f0 f0Var, C17642l lVar) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Clicked in state: " + f0Var, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = oVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            if (f0Var instanceof C10521f0.a) {
                lVar.invoke(new e.q(((C10521f0.a) f0Var).b()));
            } else if (f0Var instanceof C10521f0.b) {
                lVar.invoke(e.d.f70354a);
            } else if (!(f0Var instanceof C10521f0.c)) {
                throw new t();
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(u0.C5991o r11, U0.C4889m r12, int r13) {
            /*
                r10 = this;
                java.lang.String r0 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                r0 = r13 & 6
                r1 = 4
                if (r0 != 0) goto L_0x0014
                boolean r0 = r12.V(r11)
                if (r0 == 0) goto L_0x0012
                r0 = r1
                goto L_0x0013
            L_0x0012:
                r0 = 2
            L_0x0013:
                r13 = r13 | r0
            L_0x0014:
                r0 = r13 & 19
                r2 = 18
                if (r0 != r2) goto L_0x0025
                boolean r0 = r12.l()
                if (r0 != 0) goto L_0x0021
                goto L_0x0025
            L_0x0021:
                r12.L()
                goto L_0x0081
            L_0x0025:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0034
                r0 = -1
                java.lang.String r2 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.inAppUpdates.<anonymous> (InAppUpdatesComposables.kt:20)"
                r3 = -1193465086(0xffffffffb8dd2b02, float:-1.0546112E-4)
                U0.C4895p.S(r3, r13, r0, r2)
            L_0x0034:
                zf.f0 r4 = r10.f78282a
                r0 = -1660892490(0xffffffff9d00cab6, float:-1.7045458E-21)
                r12.W(r0)
                r13 = r13 & 14
                if (r13 != r1) goto L_0x0042
                r13 = 1
                goto L_0x0043
            L_0x0042:
                r13 = 0
            L_0x0043:
                zf.f0 r0 = r10.f78282a
                boolean r0 = r12.F(r0)
                r13 = r13 | r0
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.e, XH.N> r0 = r10.f78283b
                boolean r0 = r12.V(r0)
                r13 = r13 | r0
                zf.f0 r0 = r10.f78282a
                nI.l<com.ingka.ikea.app.browseandsearch.browseV2.e, XH.N> r1 = r10.f78283b
                java.lang.Object r2 = r12.D()
                if (r13 != 0) goto L_0x0063
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r2 != r13) goto L_0x006b
            L_0x0063:
                zf.h0 r2 = new zf.h0
                r2.<init>(r11, r0, r1)
                r12.u(r2)
            L_0x006b:
                r5 = r2
                nI.a r5 = (nI.C17631a) r5
                r12.P()
                r8 = 0
                r9 = 4
                r6 = 0
                r7 = r12
                zf.C10519e0.j(r4, r5, r6, r7, r8, r9)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0081
                U0.C4895p.R()
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zf.C10527i0.a.b(u0.o, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(C5968C c10, C10521f0 f0Var, C17642l<? super e, C16807N> lVar) {
        C17542s.j(c10, "<this>");
        C17542s.j(f0Var, "inAppUpdateUiState");
        C17542s.j(lVar, "onScreenUiEvent");
        c10.d("InAppUpdates", new C10523g0(), "InAppUpdates", c.c(-1193465086, true, new a(f0Var, lVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c c(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }
}
