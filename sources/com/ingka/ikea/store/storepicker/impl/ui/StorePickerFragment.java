package com.ingka.ikea.store.storepicker.impl.ui;

import HJ.C15854t;
import MB.C13194a;
import PB.C13334c;
import PB.j;
import QB.w0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import Yw.e;
import am.d;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fC.C14445a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import l3.a;
import m3.c;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uI.C18059h;
import x4.C;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/ingka/ikea/store/storepicker/impl/ui/StorePickerFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LPB/c;", "destination", "LXH/N;", "K0", "(LPB/c;)V", "D0", "(LU0/m;I)V", "LfC/a;", "X", "LfC/a;", "J0", "()LfC/a;", "setStoreDetailsNavigation", "(LfC/a;)V", "storeDetailsNavigation", "Lam/d;", "Y", "Lam/d;", "H0", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "LYw/e;", "Z", "LYw/e;", "I0", "()LYw/e;", "setPromptUserToEnableLocationUseCase", "(LYw/e;)V", "promptUserToEnableLocationUseCase", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StorePickerFragment extends a {

    /* renamed from: X  reason: collision with root package name */
    public C14445a f120500X;

    /* renamed from: Y  reason: collision with root package name */
    public d f120501Y;

    /* renamed from: Z  reason: collision with root package name */
    public e f120502Z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<C13334c, C16807N> {
        a(Object obj) {
            super(1, obj, StorePickerFragment.class, "handleNavigation", "handleNavigation(Lcom/ingka/ikea/store/storepicker/impl/presentation/StorePickerContract$Destination;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C13334c) obj);
            return C16807N.f139792a;
        }

        public final void t(C13334c cVar) {
            C17542s.j(cVar, "p0");
            ((StorePickerFragment) this.receiver).K0(cVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.store.storepicker.impl.ui.StorePickerFragment$handleNavigation$2", f = "StorePickerFragment.kt", l = {78}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f120503c;

        /* renamed from: d  reason: collision with root package name */
        Object f120504d;

        /* renamed from: e  reason: collision with root package name */
        Object f120505e;

        /* renamed from: f  reason: collision with root package name */
        int f120506f;

        /* renamed from: g  reason: collision with root package name */
        int f120507g;

        /* renamed from: h  reason: collision with root package name */
        int f120508h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f120509i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ StorePickerFragment f120510j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StorePickerFragment storePickerFragment, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f120510j = storePickerFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f120510j, eVar);
            bVar.f120509i = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object obj2;
            Object obj3;
            Object f10 = C17187b.f();
            int i10 = this.f120508h;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f120509i;
                StorePickerFragment storePickerFragment = this.f120510j;
                x.a aVar = x.f139812b;
                e I02 = storePickerFragment.I0();
                this.f120509i = q10;
                this.f120503c = q10;
                this.f120504d = storePickerFragment;
                this.f120505e = q10;
                this.f120506f = 0;
                this.f120507g = 0;
                this.f120508h = 1;
                Object r52 = I02.m20invokeIoAF18A(this);
                if (r52 == f10) {
                    return f10;
                }
                obj3 = r52;
            } else if (i10 == 1) {
                Q q11 = (Q) this.f120505e;
                StorePickerFragment storePickerFragment2 = (StorePickerFragment) this.f120504d;
                Q q12 = (Q) this.f120503c;
                q10 = (Q) this.f120509i;
                try {
                    y.b(obj);
                    obj3 = ((x) obj).j();
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    x.a aVar2 = x.f139812b;
                    obj2 = x.b(y.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = x.b(x.a(obj3));
            char c10 = '$';
            if (x.e(obj2) == null) {
                ((x) obj2).j();
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("User has enabled location", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str);
                    c10 = '$';
                }
            } else {
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str3 == null) {
                        String a11 = C11818a.a("User declined to enable location", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str3 = C11820c.a(a11);
                    }
                    if (str4 == null) {
                        String name2 = q10.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str4, false, (Throwable) null, str3);
                }
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final void K0(C13334c cVar) {
        if (cVar instanceof C13334c.a) {
            C13334c.a aVar = (C13334c.a) cVar;
            if (aVar.b() != null) {
                C13334c.d b10 = aVar.b();
                rw.d.a(this, new C13194a.b.C2743a(b10.a().j(), b10.a().h(), b10.a().k(), b10.a().d().j()), aVar.a());
            }
            androidx.navigation.fragment.a.a(this).i0();
        } else if (cVar instanceof C13334c.e) {
            C14445a.C3107a.a(J0(), androidx.navigation.fragment.a.a(this), ((C13334c.e) cVar).a(), (C) null, 4, (Object) null);
        } else if (C17542s.e(cVar, C13334c.b.f113840a)) {
            startActivity(H0().c());
        } else if (C17542s.e(cVar, C13334c.C2800c.f113841a)) {
            F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1080022952);
        if (C4895p.J()) {
            C4895p.S(-1080022952, i10, -1, "com.ingka.ikea.store.storepicker.impl.ui.StorePickerFragment.FragmentContent (StorePickerFragment.kt:37)");
        }
        mVar.C(1890788296);
        k0 a10 = m3.a.f26247a.a(mVar, m3.a.f26249c);
        if (a10 != null) {
            i0.c a11 = f3.a.a(a10, mVar, 0);
            mVar.C(1729797275);
            f0 b10 = c.b(j.class, a10, (String) null, a11, a10 instanceof C5212o ? ((C5212o) a10).getDefaultViewModelCreationExtras() : a.C0407a.f25486b, mVar, 36936, 0);
            mVar.U();
            mVar.U();
            j jVar = (j) b10;
            mVar.W(-95302713);
            boolean F10 = mVar.F(this);
            Object D10 = mVar.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(this);
                mVar.u(D10);
            }
            mVar.P();
            w0.n0(jVar, (C17642l) ((C18059h) D10), mVar, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }

    public final d H0() {
        d dVar = this.f120501Y;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("deviceIntentProvider");
        return null;
    }

    public final e I0() {
        e eVar = this.f120502Z;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("promptUserToEnableLocationUseCase");
        return null;
    }

    public final C14445a J0() {
        C14445a aVar = this.f120500X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storeDetailsNavigation");
        return null;
    }
}
