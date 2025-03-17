package Vi;

import Fz.n;
import HJ.C15854t;
import Lg.c;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.textfield.TextInputEditText;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import jp.C11441c;
import jp.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00060\u0012R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LVi/B;", "LLg/a;", "LVi/C;", "LQJ/Q;", "scope", "Lkotlin/Function1;", "", "LXH/N;", "confirmClicked", "<init>", "(LQJ/Q;LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/B$a;", "g", "(Landroid/view/ViewGroup;)LVi/B$a;", "b", "LQJ/Q;", "c", "LnI/l;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class B extends Lg.a<C> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Q f88470b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17642l<String, C16807N> f88471c;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u0016\u0010+\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u00100\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"LVi/B$a;", "LLg/c;", "LVi/C;", "LFz/n;", "binding", "<init>", "(LVi/B;LFz/n;)V", "LXH/N;", "H", "()V", "I", "x", "z", "y", "B", "F", "u", "E", "C", "w", "r", "LQJ/F0;", "t", "()LQJ/F0;", "", "s", "()Z", "viewModel", "q", "(LVi/C;)V", "j", "h", "LFz/n;", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "i", "Landroid/content/res/Resources;", "resources", "", "Ljava/lang/String;", "email", "k", "Z", "shouldShowTerms", "l", "areTermsAccepted", "m", "LQJ/F0;", "errorDebounce", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<C> {

        /* renamed from: h  reason: collision with root package name */
        private final n f88472h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public final Resources f88473i;

        /* renamed from: j  reason: collision with root package name */
        private String f88474j = "";

        /* renamed from: k  reason: collision with root package name */
        private boolean f88475k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f88476l;

        /* renamed from: m  reason: collision with root package name */
        private F0 f88477m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ B f88478n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.adapter.delegate.EmailAndTermsDelegate$ViewModel$queueEmailCheck$1$1", f = "EmailAndTermsDelegate.kt", l = {173}, m = "invokeSuspend")
        /* renamed from: Vi.B$a$a  reason: collision with other inner class name */
        static final class C1866a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f88479c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f88480d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ n f88481e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f88482f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1866a(boolean z10, n nVar, a aVar, C17164e<? super C1866a> eVar) {
                super(2, eVar);
                this.f88480d = z10;
                this.f88481e = nVar;
                this.f88482f = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1866a(this.f88480d, this.f88481e, this.f88482f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1866a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f88479c;
                if (i10 == 0) {
                    y.b(obj);
                    this.f88479c = 1;
                    if (C16297b0.b(900, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (!this.f88480d) {
                    this.f88481e.f110161g.setError(this.f88482f.f88473i.getString(Ez.f.f109666F));
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(B b10, n nVar) {
            super((X4.a) nVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(nVar, "binding");
            this.f88478n = b10;
            this.f88472h = nVar;
            this.f88473i = nVar.getRoot().getResources();
        }

        /* access modifiers changed from: private */
        public static final C16807N A(a aVar, String str) {
            C17542s.j(str, "text");
            aVar.f88474j = str;
            aVar.r();
            F0 f02 = aVar.f88477m;
            if (f02 != null) {
                F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            }
            F0 t10 = aVar.t();
            aVar.f88477m = t10;
            if (t10 != null) {
                t10.start();
            }
            return C16807N.f139792a;
        }

        private final void B() {
            this.f88472h.f110161g.setEndIconVisible(!C15854t.v0(this.f88474j));
        }

        private final void C() {
            this.f88472h.f110162h.setOnCheckedChangeListener(new C10984y(this));
        }

        /* access modifiers changed from: private */
        public static final void D(a aVar, CompoundButton compoundButton, boolean z10) {
            aVar.f88476l = z10;
            aVar.w();
        }

        private final void E() {
            this.f88472h.f110162h.setVisibility(this.f88475k ? 0 : 8);
        }

        private final void F() {
            this.f88472h.f110160f.setFilters(new InputFilter[]{new A()});
        }

        /* access modifiers changed from: private */
        public static final CharSequence G(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            C17542s.g(charSequence);
            if (!C15854t.v0(C15854t.Q(C15854t.z1(charSequence).toString(), " ", "", false, 4, (Object) null))) {
                return null;
            }
            return "";
        }

        private final void H() {
            this.f88474j = ((C) g()).a();
            this.f88475k = ((C) g()).b();
        }

        private final void I() {
            x();
            F();
            y();
            B();
            z();
            E();
            C();
            w();
            u();
        }

        private final void r() {
            this.f88472h.f110161g.setError((CharSequence) null);
        }

        private final boolean s() {
            return Patterns.EMAIL_ADDRESS.matcher(this.f88474j).matches();
        }

        private final F0 t() {
            boolean s10 = s();
            w();
            n nVar = this.f88472h;
            B b10 = this.f88478n;
            nVar.f110161g.setEndIconVisible(s10);
            return C16314k.d(b10.f88470b, (C17168i) null, T.LAZY, new C1866a(s10, nVar, this, (C17164e<? super C1866a>) null), 1, (Object) null);
        }

        private final void u() {
            this.f88472h.f110157c.setOnClickListener(new C10985z(this.f88478n, this));
        }

        /* access modifiers changed from: private */
        public static final void v(B b10, a aVar, View view) {
            b10.f88471c.invoke(aVar.f88474j);
        }

        private final void w() {
            this.f88472h.f110157c.setEnabled(this.f88475k ? s() && this.f88476l : s());
        }

        private final void x() {
            this.f88472h.f110156b.setText(Xo.f.a(this.f88473i.getString(Ez.f.f109665E)));
        }

        private final void y() {
            if (!C15854t.v0(this.f88474j)) {
                this.f88472h.f110160f.setText(this.f88474j);
            }
        }

        private final void z() {
            TextInputEditText textInputEditText = this.f88472h.f110160f;
            C17542s.i(textInputEditText, "emailEditText");
            C11441c.a(textInputEditText, new C10983x(this));
        }

        public void j() {
            F0 f02 = this.f88477m;
            if (f02 != null) {
                F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            }
            super.j();
        }

        /* renamed from: q */
        public void c(C c10) {
            C17542s.j(c10, "viewModel");
            super.c(c10);
            H();
            I();
        }
    }

    public B(Q q10, C17642l<? super String, C16807N> lVar) {
        C17542s.j(q10, "scope");
        C17542s.j(lVar, "confirmClicked");
        this.f88470b = q10;
        this.f88471c = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C;
    }

    /* renamed from: g */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        n c10 = n.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
