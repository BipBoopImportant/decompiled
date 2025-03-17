package pg;

import HJ.C15854t;
import XH.t;
import YH.C16877v;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10025b;
import og.C10127a;
import og.C10128b;
import og.c;
import qg.q;
import sg.g;
import u2.C6012a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpg/o;", "LLg/a;", "Lqg/q;", "Lsg/g;", "formController", "<init>", "(Lsg/g;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lpg/o$a;", "f", "(Landroid/view/ViewGroup;)Lpg/o$a;", "b", "Lsg/g;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends Lg.a<q> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f75921b;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00198\u0002XD¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\fR\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00158BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lpg/o$a;", "Lpg/G;", "Lqg/q;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/o;Landroid/view/View;)V", "viewModel", "", "F", "(Lqg/q;)Ljava/lang/CharSequence;", "LXH/N;", "I", "()V", "Lqg/q$c;", "ruleSet", "Landroid/text/SpannableString;", "G", "(Lqg/q$c;)Landroid/text/SpannableString;", "A", "view", "", "hasFocus", "x", "(Landroid/view/View;Z)V", "", "new", "y", "(Ljava/lang/String;)V", "E", "(Lqg/q;)V", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "content", "j", "Ljava/lang/String;", "newline", "", "k", "checkedColor", "Ljava/lang/Runnable;", "l", "Ljava/lang/Runnable;", "showHintRunnable", "H", "()Z", "hasHint", "s", "()I", "imeAction", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends G<q> {

        /* renamed from: i  reason: collision with root package name */
        private final TextView f75922i;

        /* renamed from: j  reason: collision with root package name */
        private final String f75923j = "\n";

        /* renamed from: k  reason: collision with root package name */
        private final int f75924k;

        /* renamed from: l  reason: collision with root package name */
        private final Runnable f75925l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ o f75926m;

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"pg/o$a$a", "", "span", "", "start", "end", "<init>", "(Ljava/lang/Object;II)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "I", "c", "()I", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pg.o$a$a  reason: collision with other inner class name */
        public static final class C1394a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f75927a;

            /* renamed from: b  reason: collision with root package name */
            private final int f75928b;

            /* renamed from: c  reason: collision with root package name */
            private final int f75929c;

            public C1394a(Object obj, int i10, int i11) {
                C17542s.j(obj, "span");
                this.f75927a = obj;
                this.f75928b = i10;
                this.f75929c = i11;
            }

            public final int a() {
                return this.f75929c;
            }

            public final Object b() {
                return this.f75927a;
            }

            public final int c() {
                return this.f75928b;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o oVar, View view) {
            super(view);
            C17542s.j(view, "itemView");
            this.f75926m = oVar;
            View findViewById = view.findViewById(C10127a.f75737e);
            C17542s.i(findViewById, "findViewById(...)");
            this.f75922i = (TextView) findViewById;
            this.f75924k = C6012a.c(view.getContext(), C10025b.f75259a);
            this.f75925l = new n(this);
        }

        private final CharSequence F(q qVar) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList<q.c> arrayList = new ArrayList<>();
            for (Object next : qVar.y()) {
                if (!((q.c) next).b().isEmpty()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
            for (q.c G10 : arrayList) {
                arrayList2.add(G(G10));
            }
            int i10 = 0;
            for (Object next2 : arrayList2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                spannableStringBuilder.append((SpannableString) next2);
                if (i11 < arrayList2.size()) {
                    spannableStringBuilder.append(this.f75923j);
                    spannableStringBuilder.append(this.f75923j);
                }
                i10 = i11;
            }
            return spannableStringBuilder;
        }

        private final SpannableString G(q.c cVar) {
            Resources resources = this.itemView.getResources();
            String a10 = cVar.a();
            ArrayList<C1394a> arrayList = new ArrayList<>();
            int i10 = 0;
            arrayList.add(new C1394a(new StyleSpan(1), 0, a10.length()));
            StringBuilder sb2 = new StringBuilder(a10);
            sb2.append(this.f75923j);
            int size = cVar.b().size();
            for (Object next : cVar.b()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                q.b bVar = (q.b) next;
                Boolean b10 = bVar.b();
                if (b10 == null || C17542s.e(b10, Boolean.FALSE)) {
                    sb2.append(resources.getString(c.f75747a, new Object[]{bVar.a()}));
                } else if (C17542s.e(b10, Boolean.TRUE)) {
                    String string = resources.getString(c.f75748b, new Object[]{bVar.a()});
                    C17542s.i(string, "getString(...)");
                    int length = sb2.length();
                    int length2 = string.length() + length;
                    arrayList.add(new C1394a(new ForegroundColorSpan(this.f75924k), length, length2));
                    arrayList.add(new C1394a(new StyleSpan(1), length, length2));
                    sb2.append(string);
                } else {
                    throw new t();
                }
                if (i11 < size) {
                    sb2.append(this.f75923j);
                }
                i10 = i11;
            }
            SpannableString spannableString = new SpannableString(sb2.toString());
            for (C1394a aVar : arrayList) {
                spannableString.setSpan(aVar.b(), aVar.c(), aVar.a(), 33);
            }
            return spannableString;
        }

        private final boolean H() {
            CharSequence text = this.f75922i.getText();
            C17542s.i(text, "getText(...)");
            return !C15854t.v0(text);
        }

        private final void I() {
            g.a.c(this.f75926m.f75921b, getBindingAdapterPosition(), false, 2, (Object) null);
            t().setImeOptions(this.f75926m.f75921b.h0(getBindingAdapterPosition()));
        }

        /* access modifiers changed from: private */
        public static final void J(a aVar) {
            aVar.f75922i.setVisibility(0);
            aVar.I();
        }

        public void A() {
            this.f75926m.f75921b.f0();
        }

        /* renamed from: E */
        public void q(q qVar) {
            C17542s.j(qVar, "viewModel");
            super.c(qVar);
            this.f75922i.setText(F(qVar));
        }

        public int s() {
            return this.f75926m.f75921b.h0(getBindingAdapterPosition());
        }

        public void x(View view, boolean z10) {
            C17542s.j(view, "view");
            if (!z10 || !H()) {
                if (z10) {
                    I();
                    return;
                }
                this.itemView.removeCallbacks(this.f75925l);
                this.f75922i.setVisibility(8);
                this.f75926m.f75921b.i0(getBindingAdapterPosition());
            } else if (this.f75926m.f75921b.k0()) {
                this.itemView.post(this.f75925l);
            } else {
                this.itemView.postDelayed(this.f75925l, 200);
            }
        }

        /* access modifiers changed from: protected */
        public void y(String str) {
            C17542s.j(str, "new");
            super.y(str);
            this.f75922i.setText(F((q) g()));
        }
    }

    public o(g gVar) {
        C17542s.j(gVar, "formController");
        this.f75921b = gVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof q;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        View c10 = h.c(viewGroup, C10128b.f75742c, false, 2, (Object) null);
        C17542s.i(c10, "inflate$default(...)");
        return new a(this, c10);
    }
}
