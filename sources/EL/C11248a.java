package el;

import Lg.a;
import Lg.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lel/a;", "LLg/a;", "Lel/b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lel/a$a;", "e", "(Landroid/view/ViewGroup;)Lel/a$a;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: el.a  reason: case insensitive filesystem */
public final class C11248a extends a<b> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lel/a$a;", "LLg/c;", "Lel/b;", "Lbl/d;", "binding", "<init>", "(Lel/a;Lbl/d;)V", "viewModel", "LXH/N;", "l", "(Lel/b;)V", "h", "Lbl/d;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: el.a$a  reason: collision with other inner class name */
    public final class C2153a extends c<b> {

        /* renamed from: h  reason: collision with root package name */
        private final d f97128h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C11248a f97129i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2153a(el.C11248a r2, bl.d r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                r1.f97129i = r2
                android.view.View r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                r0 = 0
                r1.<init>((android.view.View) r2, (boolean) r0)
                r1.f97128h = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: el.C11248a.C2153a.<init>(el.a, bl.d):void");
        }

        /* JADX WARNING: type inference failed for: r9v3, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(el.b r9) {
            /*
                r8 = this;
                java.lang.String r0 = "viewModel"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                super.c(r9)
                bl.d r0 = r8.f97128h
                android.view.View r0 = r0.f90475b
                java.lang.String r1 = "divider"
                kotlin.jvm.internal.C17542s.i(r0, r1)
                java.lang.Integer r1 = r9.c()
                r2 = 0
                r3 = 0
                java.lang.String r4 = "itemView"
                if (r1 == 0) goto L_0x0028
                int r1 = r1.intValue()
                float r1 = Xo.e.a(r1)
                int r1 = ip.h.a(r1)
                goto L_0x003f
            L_0x0028:
                android.view.View r1 = r8.itemView
                kotlin.jvm.internal.C17542s.i(r1, r4)
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                boolean r5 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r5 == 0) goto L_0x0038
                android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
                goto L_0x0039
            L_0x0038:
                r1 = r3
            L_0x0039:
                if (r1 == 0) goto L_0x003e
                int r1 = r1.topMargin
                goto L_0x003f
            L_0x003e:
                r1 = r2
            L_0x003f:
                java.lang.Integer r5 = r9.a()
                if (r5 == 0) goto L_0x0052
                int r5 = r5.intValue()
                float r5 = Xo.e.a(r5)
                int r5 = ip.h.a(r5)
                goto L_0x0069
            L_0x0052:
                android.view.View r5 = r8.itemView
                kotlin.jvm.internal.C17542s.i(r5, r4)
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r6 == 0) goto L_0x0062
                android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
                goto L_0x0063
            L_0x0062:
                r5 = r3
            L_0x0063:
                if (r5 == 0) goto L_0x0068
                int r5 = r5.bottomMargin
                goto L_0x0069
            L_0x0068:
                r5 = r2
            L_0x0069:
                java.lang.Integer r6 = r9.b()
                if (r6 == 0) goto L_0x007c
                int r6 = r6.intValue()
                float r6 = Xo.e.a(r6)
                int r6 = ip.h.a(r6)
                goto L_0x0093
            L_0x007c:
                android.view.View r6 = r8.itemView
                kotlin.jvm.internal.C17542s.i(r6, r4)
                android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
                boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r7 == 0) goto L_0x008c
                android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
                goto L_0x008d
            L_0x008c:
                r6 = r3
            L_0x008d:
                if (r6 == 0) goto L_0x0092
                int r6 = r6.leftMargin
                goto L_0x0093
            L_0x0092:
                r6 = r2
            L_0x0093:
                java.lang.Integer r9 = r9.b()
                if (r9 == 0) goto L_0x00a6
                int r9 = r9.intValue()
                float r9 = Xo.e.a(r9)
                int r2 = ip.h.a(r9)
                goto L_0x00ba
            L_0x00a6:
                android.view.View r9 = r8.itemView
                kotlin.jvm.internal.C17542s.i(r9, r4)
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                boolean r4 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r4 == 0) goto L_0x00b6
                r3 = r9
                android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            L_0x00b6:
                if (r3 == 0) goto L_0x00ba
                int r2 = r3.rightMargin
            L_0x00ba:
                jp.g.d(r0, r6, r1, r2, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: el.C11248a.C2153a.c(el.b):void");
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof b;
    }

    /* renamed from: e */
    public C2153a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C17542s.i(from, "from(...)");
        d b10 = d.b(from, viewGroup, false);
        C17542s.i(b10, "inflate(...)");
        return new C2153a(this, b10);
    }
}
