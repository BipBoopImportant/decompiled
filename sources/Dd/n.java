package Dd;

import E1.C4478k;
import J1.e;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.y;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import nI.p;
import p1.C5749w0;
import t1.C5942c;
import yd.C10442M;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "url", "Landroid/graphics/Bitmap;", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "drawableResId", "Lt1/c;", "d", "(ILU0/m;I)Lt1/c;", "LXH/N;", "b", "(Ljava/lang/String;LU0/m;I)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.ui.components.NetworkImageKt$NetworkImage$1$1", f = "NetworkImage.kt", l = {47}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f59144c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59145d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<C5942c> f59146e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5942c f59147f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, C4899r0<C5942c> r0Var, C5942c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f59145d = str;
            this.f59146e = r0Var;
            this.f59147f = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f59145d, this.f59146e, this.f59147f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: t1.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: t1.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: t1.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f59144c
                r2 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r2) goto L_0x000f
                XH.y.b(r11)
                goto L_0x0025
            L_0x000f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0017:
                XH.y.b(r11)
                java.lang.String r11 = r10.f59145d
                r10.f59144c = r2
                java.lang.Object r11 = Dd.n.e(r11, r10)
                if (r11 != r0) goto L_0x0025
                return r0
            L_0x0025:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                U0.r0<t1.c> r0 = r10.f59146e
                if (r11 == 0) goto L_0x003c
                t1.a r9 = new t1.a
                p1.J0 r2 = p1.O.c(r11)
                r7 = 6
                r8 = 0
                r3 = 0
                r5 = 0
                r1 = r9
                r1.<init>(r2, r3, r5, r7, r8)
                goto L_0x003e
            L_0x003c:
                t1.c r9 = r10.f59147f
            L_0x003e:
                r0.setValue(r9)
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Dd.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Landroid/graphics/Bitmap;", "<anonymous>", "(LQJ/Q;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.ui.components.NetworkImageKt$loadImageFromUrl$2", f = "NetworkImage.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super Bitmap>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f59148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f59149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f59149d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f59149d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Bitmap> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f59148c == 0) {
                y.b(obj);
                try {
                    InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(this.f59149d));
                    Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                    openStream.close();
                    return decodeStream;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final void b(String str, C4889m mVar, int i10) {
        int i11;
        C17542s.j(str, "url");
        C4889m k10 = mVar.k(-1710566238);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1710566238, i11, -1, "com.ikea.kompassmap.ui.components.NetworkImage (NetworkImage.kt:41)");
            }
            k10.W(-588605404);
            int i12 = i11 & 14;
            boolean z10 = true;
            boolean z11 = i12 == 4;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            C5942c d10 = d(C10442M.f77906b, k10, 0);
            k10.W(-588600263);
            if (i12 != 4) {
                z10 = false;
            }
            boolean V10 = z10 | k10.V(r0Var) | k10.F(d10);
            Object D11 = k10.D();
            if (V10 || D11 == C4889m.f14007a.a()) {
                D11 = new a(str, r0Var, d10, (C17164e<? super a>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(str, (p) D11, k10, i12);
            C5942c cVar = (C5942c) r0Var.getValue();
            if (cVar != null) {
                C5583F.a(cVar, (String) null, J.t(d.f18749a, h.B((float) 56)), (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, k10, 432, 120);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new m(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, int i10, C4889m mVar, int i11) {
        b(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final C5942c d(int i10, C4889m mVar, int i11) {
        mVar.W(-1331412721);
        if (C4895p.J()) {
            C4895p.S(-1331412721, i11, -1, "com.ikea.kompassmap.ui.components.loadDrawablePainter (NetworkImage.kt:36)");
        }
        C5942c c10 = e.c(i10, mVar, i11 & 14);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return c10;
    }

    public static final Object e(String str, C17164e<? super Bitmap> eVar) {
        return C16310i.g(C16311i0.b(), new b(str, (C17164e<? super b>) null), eVar);
    }
}
