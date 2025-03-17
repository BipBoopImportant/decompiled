package pg;

import IC.C13023e;
import Lg.c;
import Lg.e;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import il.C11404d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import og.C10127a;
import qg.i;
import qg.v;
import sg.g;
import sg.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lpg/x;", "LLg/a;", "Lqg/v;", "Lsg/g;", "formController", "Lsg/m;", "urlHandler", "<init>", "(Lsg/g;Lsg/m;)V", "b", "Lsg/g;", "c", "Lsg/m;", "a", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class x extends Lg.a<v> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f75944b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final m f75945c;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J%\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\n \u001c*\u0004\u0018\u00010 0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u001c\u0010$\u001a\n \u001c*\u0004\u0018\u00010 0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010!R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lpg/x$a;", "LLg/c;", "Lqg/v;", "Landroid/view/View;", "itemView", "<init>", "(Lpg/x;Landroid/view/View;)V", "", "payload", "viewModel", "", "v", "(Ljava/lang/Object;Lqg/v;)Z", "LXH/N;", "w", "()V", "y", "(Lqg/v;)V", "x", "r", "", "payloads", "s", "(Lqg/v;Ljava/util/List;)Z", "view", "i", "(Landroid/view/View;)V", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "h", "Landroid/widget/CompoundButton;", "switch", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "switchText", "j", "errorText", "Lkotlin/Function2;", "k", "LnI/p;", "checkedListener", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<v> {

        /* renamed from: h  reason: collision with root package name */
        private final CompoundButton f75946h;

        /* renamed from: i  reason: collision with root package name */
        private final TextView f75947i;

        /* renamed from: j  reason: collision with root package name */
        private final TextView f75948j;

        /* renamed from: k  reason: collision with root package name */
        private final p<CompoundButton, Boolean, C16807N> f75949k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ x f75950l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(x xVar, View view) {
            super(view, false);
            C17542s.j(view, "itemView");
            this.f75950l = xVar;
            CompoundButton compoundButton = (CompoundButton) view.findViewById(C10127a.f75733a);
            this.f75946h = compoundButton;
            TextView textView = (TextView) view.findViewById(C10127a.f75738f);
            this.f75947i = textView;
            this.f75948j = (TextView) view.findViewById(C10127a.f75734b);
            this.f75949k = new t(view, this);
            textView.setOnClickListener(new u(this));
            compoundButton.setOnClickListener(new v(this));
            view.setOnFocusChangeListener(new w(xVar, this));
        }

        /* access modifiers changed from: private */
        public static final void p(a aVar, View view) {
            aVar.w();
        }

        /* access modifiers changed from: private */
        public static final void q(x xVar, a aVar, View view, boolean z10) {
            if (z10) {
                C17542s.g(view);
                jp.g.b(view);
                xVar.f75944b.a(aVar.getBindingAdapterPosition(), false);
                return;
            }
            xVar.f75944b.i0(aVar.getBindingAdapterPosition());
        }

        /* access modifiers changed from: private */
        public static final void t(p pVar, CompoundButton compoundButton, boolean z10) {
            pVar.invoke(compoundButton, Boolean.valueOf(z10));
        }

        /* access modifiers changed from: private */
        public static final C16807N u(View view, a aVar, CompoundButton compoundButton, boolean z10) {
            C17542s.j(compoundButton, "<unused var>");
            view.requestFocus();
            ((v) aVar.g()).r(Boolean.valueOf(z10));
            aVar.f75947i.setSelected(z10);
            aVar.f75948j.setVisibility(8);
            if (!z10) {
                i.u((i) aVar.g(), false, false, 3, (Object) null);
                aVar.y((v) aVar.g());
            }
            return C16807N.f139792a;
        }

        private final boolean v(Object obj, v vVar) {
            if (obj == C11404d.VALIDATION_FAILED) {
                y(vVar);
                return true;
            } else if (obj != C11404d.ENABLED_STATE_CHANGED) {
                return false;
            } else {
                x(vVar);
                return true;
            }
        }

        private final void w() {
            this.f75950l.f75944b.p0(((v) g()).e());
        }

        private final void x(v vVar) {
            this.f75946h.setEnabled(vVar.m());
            this.f75947i.setEnabled(vVar.m());
        }

        private final void y(v vVar) {
            Boolean o10 = vVar.o();
            if (o10 == null || C17542s.e(o10, Boolean.TRUE)) {
                this.f75948j.setVisibility(8);
            } else if (!C17542s.e(o10, Boolean.FALSE)) {
                throw new t();
            } else if (!vVar.l()) {
                this.f75948j.setVisibility(0);
                TextView textView = this.f75948j;
                C13023e d10 = vVar.d();
                textView.setText(d10 != null ? d10.b(e.a(this)) : null);
            }
        }

        public void i(View view) {
            C17542s.j(view, "view");
            if (this.f75947i.getSelectionStart() == -1 && this.f75947i.getSelectionEnd() == -1) {
                this.f75946h.toggle();
                w();
            }
        }

        /* renamed from: r */
        public void c(v vVar) {
            C17542s.j(vVar, "viewModel");
            super.c(vVar);
            this.f75946h.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.f75946h.setChecked(((Boolean) vVar.j()).booleanValue());
            this.f75946h.setOnCheckedChangeListener(new s(this.f75949k));
            this.f75947i.setSelected(((Boolean) vVar.j()).booleanValue());
            this.f75947i.setMovementMethod(LinkMovementMethod.getInstance());
            String y10 = vVar.z() == com.ingka.ikea.dynamicfields.datalayer.c.TOGGLE ? vVar.y() : vVar.x();
            this.f75947i.setText(C10154h.f75903a.a(this.f75950l.f75945c, y10, vVar.A(), vVar.w()));
            this.f75946h.setContentDescription(y10);
            y(vVar);
            x(vVar);
        }

        /* renamed from: s */
        public boolean d(v vVar, List<? extends Object> list) {
            C17542s.j(vVar, "viewModel");
            C17542s.j(list, "payloads");
            Iterable<Object> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Object v10 : iterable) {
                arrayList.add(Boolean.valueOf(v(v10, vVar)));
            }
            return ip.c.a(arrayList);
        }
    }

    public x(g gVar, m mVar) {
        C17542s.j(gVar, "formController");
        C17542s.j(mVar, "urlHandler");
        this.f75944b = gVar;
        this.f75945c = mVar;
    }
}
