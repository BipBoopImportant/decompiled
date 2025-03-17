package com.ingka.ikea.account.impl.upgrade;

import Lg.c;
import Sd.d;
import XH.C16807N;
import al.C11067a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/account/impl/upgrade/c;", "LLg/a;", "Lcom/ingka/ikea/account/impl/upgrade/d;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lcom/ingka/ikea/account/impl/upgrade/c$a;", "e", "(Landroid/view/ViewGroup;)Lcom/ingka/ikea/account/impl/upgrade/c$a;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.ingka.ikea.account.impl.upgrade.c  reason: case insensitive filesystem */
public final class C9601c extends Lg.a<C9602d> {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/account/impl/upgrade/c$a;", "LLg/c;", "Lcom/ingka/ikea/account/impl/upgrade/d;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "viewModel", "LXH/N;", "p", "(Lcom/ingka/ikea/account/impl/upgrade/d;)V", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "header", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "i", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "buttonBack", "Landroid/widget/Button;", "j", "Landroid/widget/Button;", "buttonNavigate", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.account.impl.upgrade.c$a */
    public static final class a extends c<C9602d> {

        /* renamed from: h  reason: collision with root package name */
        private final TextView f69891h;

        /* renamed from: i  reason: collision with root package name */
        private final FloatingActionButton f69892i;

        /* renamed from: j  reason: collision with root package name */
        private final Button f69893j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            View findViewById = view.findViewById(Sd.c.f63340e);
            C17542s.i(findViewById, "findViewById(...)");
            this.f69891h = (TextView) findViewById;
            View findViewById2 = view.findViewById(C11067a.f90292f);
            C17542s.i(findViewById2, "findViewById(...)");
            FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById2;
            this.f69892i = floatingActionButton;
            View findViewById3 = view.findViewById(C11067a.f90291e);
            C17542s.i(findViewById3, "findViewById(...)");
            Button button = (Button) findViewById3;
            this.f69893j = button;
            floatingActionButton.setOnClickListener(new C9599a(this));
            button.setOnClickListener(new C9600b(this));
        }

        /* access modifiers changed from: private */
        public static final void n(a aVar, View view) {
            C17631a<C16807N> a10 = ((C9602d) aVar.g()).a();
            if (a10 != null) {
                a10.invoke();
            }
        }

        /* access modifiers changed from: private */
        public static final void o(a aVar, View view) {
            C17631a<C16807N> e10 = ((C9602d) aVar.g()).e();
            if (e10 != null) {
                e10.invoke();
            }
        }

        /* renamed from: p */
        public void c(C9602d dVar) {
            C17542s.j(dVar, "viewModel");
            super.c(dVar);
            this.f69891h.setText(dVar.d());
            this.f69892i.setImageResource(dVar.c());
            this.f69892i.setContentDescription(this.itemView.getResources().getString(dVar.b()));
            String f10 = dVar.f();
            if (f10 == null || f10.length() == 0) {
                this.f69893j.setVisibility(8);
                return;
            }
            this.f69893j.setVisibility(0);
            this.f69893j.setText(dVar.f());
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9602d;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, d.f63354f, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(c10);
    }
}
