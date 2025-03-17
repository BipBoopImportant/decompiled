package Jh;

import Lg.c;
import android.view.ViewGroup;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJh/b;", "LLg/a;", "LJh/c;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LJh/b$a;", "e", "(Landroid/view/ViewGroup;)LJh/b$a;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends Lg.a<c> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJh/b$a;", "LLg/c;", "LJh/c;", "LIh/b;", "binding", "<init>", "(LIh/b;)V", "viewModel", "LXH/N;", "l", "(LJh/c;)V", "h", "LIh/b;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c<c> {

        /* renamed from: h  reason: collision with root package name */
        private final Ih.b f61400h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Ih.b bVar) {
            super((X4.a) bVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(bVar, "binding");
            this.f61400h = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(Jh.c r7) {
            /*
                r6 = this;
                java.lang.String r0 = "viewModel"
                kotlin.jvm.internal.C17542s.j(r7, r0)
                super.c(r7)
                Ih.b r0 = r6.f61400h
                android.widget.TextView r0 = r0.f61122b
                hl.a r1 = r7.a()
                android.view.View r2 = r6.itemView
                android.content.Context r2 = r2.getContext()
                java.lang.String r3 = "getContext(...)"
                kotlin.jvm.internal.C17542s.i(r2, r3)
                boolean r4 = r1 instanceof hl.C11367a.b
                r5 = 0
                if (r4 == 0) goto L_0x0022
            L_0x0020:
                r1 = r5
                goto L_0x0049
            L_0x0022:
                boolean r4 = r1 instanceof hl.C11367a.c
                if (r4 == 0) goto L_0x002d
                hl.a$c r1 = (hl.C11367a.c) r1
                java.lang.String r1 = r1.a()
                goto L_0x0049
            L_0x002d:
                boolean r4 = r1 instanceof hl.C11367a.d
                if (r4 == 0) goto L_0x003c
                hl.a$d r1 = (hl.C11367a.d) r1
                int r1 = r1.a()
                java.lang.String r1 = r2.getString(r1)
                goto L_0x0049
            L_0x003c:
                if (r1 != 0) goto L_0x003f
                goto L_0x0020
            L_0x003f:
                boolean r2 = r1 instanceof hl.C11367a.e
                if (r2 == 0) goto L_0x00b3
                hl.a$e r1 = (hl.C11367a.e) r1
                android.text.SpannableStringBuilder r1 = r1.a()
            L_0x0049:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r1 = ip.o.a(r1)
                r0.setText(r1)
                hl.a r7 = r7.b()
                android.view.View r0 = r6.itemView
                android.content.Context r0 = r0.getContext()
                kotlin.jvm.internal.C17542s.i(r0, r3)
                boolean r1 = r7 instanceof hl.C11367a.b
                if (r1 == 0) goto L_0x0066
                goto L_0x008d
            L_0x0066:
                boolean r1 = r7 instanceof hl.C11367a.c
                if (r1 == 0) goto L_0x0071
                hl.a$c r7 = (hl.C11367a.c) r7
                java.lang.String r5 = r7.a()
                goto L_0x008d
            L_0x0071:
                boolean r1 = r7 instanceof hl.C11367a.d
                if (r1 == 0) goto L_0x0080
                hl.a$d r7 = (hl.C11367a.d) r7
                int r7 = r7.a()
                java.lang.String r5 = r0.getString(r7)
                goto L_0x008d
            L_0x0080:
                if (r7 != 0) goto L_0x0083
                goto L_0x008d
            L_0x0083:
                boolean r0 = r7 instanceof hl.C11367a.e
                if (r0 == 0) goto L_0x00ad
                hl.a$e r7 = (hl.C11367a.e) r7
                android.text.SpannableStringBuilder r5 = r7.a()
            L_0x008d:
                Ih.b r7 = r6.f61400h
                android.widget.TextView r7 = r7.f61123c
                kotlin.jvm.internal.C17542s.g(r7)
                r0 = 0
                if (r5 == 0) goto L_0x00a0
                boolean r1 = HJ.C15854t.v0(r5)
                if (r1 == 0) goto L_0x009e
                goto L_0x00a0
            L_0x009e:
                r1 = r0
                goto L_0x00a1
            L_0x00a0:
                r1 = 1
            L_0x00a1:
                if (r1 != 0) goto L_0x00a4
                goto L_0x00a6
            L_0x00a4:
                r0 = 8
            L_0x00a6:
                r7.setVisibility(r0)
                r7.setText(r5)
                return
            L_0x00ad:
                XH.t r7 = new XH.t
                r7.<init>()
                throw r7
            L_0x00b3:
                XH.t r7 = new XH.t
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Jh.b.a.c(Jh.c):void");
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof c;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Ih.b c10 = Ih.b.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(c10);
    }
}
