package hk;

import HJ.C15854t;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import e.C5280c;
import e.C5286i;
import eI.C17187b;
import g.C5312a;
import h.C5406d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u000b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "subject", "text", "Landroid/content/Intent;", "k", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "Lhk/g;", "shareable", "Lkotlin/Function0;", "LXH/N;", "onComplete", "e", "(Lhk/g;LnI/a;LU0/m;I)V", "shareprovider_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shareprovider.ShareHelperKt$ShareableItem$2$1", f = "ShareHelper.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98066c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f98067d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f98068e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f98069f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5286i<Intent, C5312a> f98070g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, g gVar, C5286i<Intent, C5312a> iVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f98068e = context;
            this.f98069f = gVar;
            this.f98070g = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f98068e, this.f98069f, this.f98070g, eVar);
            aVar.f98067d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98066c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f98067d;
                g gVar = this.f98069f;
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Share object: " + gVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                this.f98070g.a(C11366a.f98057a.a(this.f98068e, this.f98069f));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"hk/f$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a f98071a;

        public b(C17631a aVar) {
            this.f98071a = aVar;
        }

        public void b() {
            this.f98071a.invoke();
        }
    }

    public static final void e(g gVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "onComplete");
        C4889m k10 = mVar.k(-574932603);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(gVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-574932603, i11, -1, "com.ingka.ikea.app.shareprovider.ShareableItem (ShareHelper.kt:149)");
            }
            if (gVar == null) {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new b(gVar, aVar, i10));
                    return;
                }
                return;
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            C5406d dVar = new C5406d();
            k10.W(-1374169064);
            int i12 = i11 & 112;
            boolean z10 = true;
            boolean z11 = i12 == 32;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new c(aVar);
                k10.u(D10);
            }
            k10.P();
            C5286i a10 = C5280c.a(dVar, (C17642l) D10, k10, 0);
            String a11 = gVar.a();
            k10.W(-1374155720);
            boolean F10 = ((i11 & 14) == 4) | k10.F(context) | k10.F(a10);
            Object D11 = k10.D();
            if (F10 || D11 == C4889m.f14007a.a()) {
                D11 = new a(context, gVar, a10, (C17164e<? super a>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(a11, (p) D11, k10, 0);
            C16807N n11 = C16807N.f139792a;
            k10.W(-1374149710);
            if (i12 != 32) {
                z10 = false;
            }
            Object D12 = k10.D();
            if (z10 || D12 == C4889m.f14007a.a()) {
                D12 = new d(aVar);
                k10.u(D12);
            }
            k10.P();
            P.c(n11, (C17642l) D12, k10, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n12 = k10.n();
        if (n12 != null) {
            n12.a(new e(gVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(g gVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        e(gVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final L g(C17631a aVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        return new b(aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N h(g gVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        e(gVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17631a aVar, C5312a aVar2) {
        boolean z10;
        C17542s.j(aVar2, "result");
        int b10 = aVar2.b();
        String str = null;
        if (b10 == -1) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Share successful", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShareableItem";
                }
                bVar.a(eVar, str2, false, (Throwable) null, str);
            }
        } else if (b10 != 0) {
            e eVar2 = e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            Iterator it = d.f102012a.a().iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str == null) {
                    String a11 = C11818a.a("Share returned unexpected result: " + aVar2.b(), (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShareableItem";
                }
                String str4 = str3;
                bVar2.a(eVar2, str4, z10, (Throwable) null, str);
                str3 = str4;
                z10 = z10;
            }
        } else {
            e eVar3 = e.DEBUG;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str5 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str == null) {
                    String a12 = C11818a.a("Share cancelled", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str = C11820c.a(a12);
                }
                if (str5 == null) {
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShareableItem";
                }
                bVar3.a(eVar3, str5, false, (Throwable) null, str);
            }
        }
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Intent k(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
        C17542s.g(createChooser);
        return createChooser;
    }
}
