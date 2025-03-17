package I2;

import GJ.C15765h;
import GJ.C15767j;
import GJ.C15768k;
import XH.C16807N;
import android.view.View;
import android.view.ViewParent;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17540p;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Landroid/view/View;", "LGJ/h;", "Landroid/view/ViewParent;", "b", "(Landroid/view/View;)LGJ/h;", "ancestors", "a", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I2.h0  reason: case insensitive filesystem */
public final class C4612h0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGJ/j;", "Landroid/view/View;", "LXH/N;", "<anonymous>", "(LGJ/j;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
    /* renamed from: I2.h0$a */
    static final class a extends k implements p<C15767j<? super View>, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        int f8673d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f8674e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f8675f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f8675f = view;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f8675f, eVar);
            aVar.f8674e = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C15767j<? super View> jVar, C17164e<? super C16807N> eVar) {
            return ((a) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: GJ.j} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f8673d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r5)
                goto L_0x004f
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                java.lang.Object r1 = r4.f8674e
                GJ.j r1 = (GJ.C15767j) r1
                XH.y.b(r5)
                goto L_0x0037
            L_0x0022:
                XH.y.b(r5)
                java.lang.Object r5 = r4.f8674e
                r1 = r5
                GJ.j r1 = (GJ.C15767j) r1
                android.view.View r5 = r4.f8675f
                r4.f8674e = r1
                r4.f8673d = r3
                java.lang.Object r5 = r1.d(r5, r4)
                if (r5 != r0) goto L_0x0037
                return r0
            L_0x0037:
                android.view.View r5 = r4.f8675f
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x004f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                GJ.h r5 = I2.C4610g0.c(r5)
                r3 = 0
                r4.f8674e = r3
                r4.f8673d = r2
                java.lang.Object r5 = r1.f(r5, r4)
                if (r5 != r0) goto L_0x004f
                return r0
            L_0x004f:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: I2.C4612h0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I2.h0$b */
    /* synthetic */ class b extends C17540p implements C17642l<ViewParent, ViewParent> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8676a = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        /* renamed from: t */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final C15765h<View> a(View view) {
        return C15768k.b(new a(view, (C17164e<? super a>) null));
    }

    public static final C15765h<ViewParent> b(View view) {
        return C15768k.q(view.getParent(), b.f8676a);
    }
}
