package Lj;

import Lg.c;
import Lj.t;
import android.view.ViewGroup;
import android.widget.ImageView;
import bl.C11103c;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ll.C11549a;
import nl.C11652b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fBC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00060\u0013R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"LLj/s;", "LLg/a;", "LLj/t;", "", "maxHeightInPixels", "paddingStartPixels", "paddingTopPixels", "paddingEndPixels", "paddingBottomPixels", "loadingStateExtraPadding", "<init>", "(IIIIII)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLj/s$a;", "k", "(Landroid/view/ViewGroup;)LLj/s$a;", "b", "I", "c", "d", "e", "f", "g", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s extends Lg.a<t> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f83270b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f83271c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f83272d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f83273e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f83274f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final int f83275g;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LLj/s$a;", "LLg/c;", "LLj/t;", "Lbl/c;", "itemBinding", "<init>", "(LLj/s;Lbl/c;)V", "", "shimmerColor", "Lnl/b;", "m", "(I)Lnl/b;", "viewModel", "LXH/N;", "l", "(LLj/t;)V", "h", "Lbl/c;", "i", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<t> {

        /* renamed from: h  reason: collision with root package name */
        private final C11103c f83276h;

        /* renamed from: i  reason: collision with root package name */
        private final int f83277i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ s f83278j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Lj.s r2, bl.C11103c r3) {
            /*
                r1 = this;
                java.lang.String r0 = "itemBinding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f83278j = r2
                androidx.constraintlayout.widget.ConstraintLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 0
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f83276h = r3
                androidx.constraintlayout.widget.ConstraintLayout r2 = r3.getRoot()
                android.content.Context r2 = r2.getContext()
                int r3 = lg.C10025b.f75264f
                int r2 = u2.C6012a.c(r2, r3)
                r1.f83277i = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Lj.s.a.<init>(Lj.s, bl.c):void");
        }

        private final C11652b m(int i10) {
            C11652b bVar = new C11652b(i10, new C11549a.c(10.0f), (Integer) null, 4, (DefaultConstructorMarker) null);
            bVar.setVisible(true, true);
            return bVar;
        }

        /* renamed from: l */
        public void c(t tVar) {
            C17542s.j(tVar, "viewModel");
            super.c(tVar);
            ImageView imageView = this.f83276h.f90473b;
            s sVar = this.f83278j;
            if (sVar.f83270b != 0) {
                imageView.setMaxHeight(sVar.f83270b);
                imageView.setMaxWidth(sVar.f83270b);
            }
            boolean z10 = tVar instanceof t.a;
            if (z10) {
                imageView.setPaddingRelative(sVar.f83271c, sVar.f83272d, sVar.f83273e, sVar.f83274f);
                imageView.setContentDescription(((t.a) tVar).a());
            } else if (C17542s.e(tVar, t.b.f83281a)) {
                imageView.setPaddingRelative(sVar.f83271c + sVar.f83275g, sVar.f83272d + sVar.f83275g, sVar.f83273e + sVar.f83275g, sVar.f83274f + sVar.f83275g);
            } else {
                throw new XH.t();
            }
            if (z10) {
                ImageView imageView2 = this.f83276h.f90473b;
                C17542s.i(imageView2, "image");
                es.c.e(imageView2, ((t.a) tVar).b());
            } else if (C17542s.e(tVar, t.b.f83281a)) {
                this.f83276h.f90473b.setImageDrawable(m(this.f83277i));
            } else {
                throw new XH.t();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s(int r6, int r7, int r8, int r9, int r10, int r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Lj.s.<init>(int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof t;
    }

    /* renamed from: k */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        C11103c c10 = C11103c.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }

    public s(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f83270b = i10;
        this.f83271c = i11;
        this.f83272d = i12;
        this.f83273e = i13;
        this.f83274f = i14;
        this.f83275g = i15;
    }
}
