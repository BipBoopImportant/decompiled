package uj;

import Ez.d;
import Lg.c;
import Xo.f;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luj/e;", "LLg/a;", "Luj/b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Luj/e$a;", "e", "(Landroid/view/ViewGroup;)Luj/e$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uj.e  reason: case insensitive filesystem */
public final class C12002e extends Lg.a<C11999b> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0012\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0019\u001a\u00020\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001e"}, d2 = {"Luj/e$a;", "LLg/c;", "Luj/b;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "viewModel", "LXH/N;", "l", "(Luj/b;)V", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "getTitle$annotations", "()V", "title", "Landroid/widget/ImageView;", "i", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "getImage$annotations", "image", "j", "getBody", "getBody$annotations", "body", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uj.e$a */
    public static final class a extends c<C11999b> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f103422h;

        /* renamed from: i  reason: collision with root package name */
        private final ImageView f103423i;

        /* renamed from: j  reason: collision with root package name */
        private final TextView f103424j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            View findViewById = view.findViewById(Ez.c.f109603q1);
            C17542s.i(findViewById, "findViewById(...)");
            this.f103422h = (TextView) findViewById;
            View findViewById2 = view.findViewById(Ez.c.f109611t0);
            C17542s.i(findViewById2, "findViewById(...)");
            this.f103423i = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(Ez.c.f109620w0);
            C17542s.i(findViewById3, "findViewById(...)");
            this.f103424j = (TextView) findViewById3;
        }

        /* renamed from: l */
        public void c(C11999b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            boolean c10 = bVar.c();
            if (c10) {
                this.f103422h.setText(bVar.f());
            }
            int i10 = 8;
            this.f103422h.setVisibility(c10 ? 0 : 8);
            boolean a10 = bVar.a();
            if (a10) {
                this.f103423i.setImageResource(bVar.e());
            }
            this.f103423i.setVisibility(a10 ? 0 : 8);
            boolean b10 = bVar.b();
            if (b10) {
                this.f103424j.setText(f.a(this.f103422h.getContext().getString(bVar.d())));
            }
            TextView textView = this.f103424j;
            if (b10) {
                i10 = 0;
            }
            textView.setVisibility(i10);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C11999b;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, d.f109650r, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(c10);
    }
}
