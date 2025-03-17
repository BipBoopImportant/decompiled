package Bg;

import HJ.C15854t;
import XH.C16807N;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.core.logger.DslKt;
import ip.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tf.C10253a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001d0!8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\u0019\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0016\u0010)\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(¨\u0006*"}, d2 = {"LBg/c;", "LBg/a;", "LBg/e;", "storage", "Ltf/a;", "killSwitchRepository", "<init>", "(LBg/e;Ltf/a;)V", "LBg/d;", "e", "()LBg/d;", "T", "", "msg", "g", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "event", "LXH/N;", "a", "(LBg/d;)V", "c", "()V", "", "f", "()Z", "b", "LBg/e;", "Ltf/a;", "Landroidx/lifecycle/K;", "Lip/d;", "d", "Landroidx/lifecycle/K;", "observable", "Landroidx/lifecycle/F;", "Landroidx/lifecycle/F;", "()Landroidx/lifecycle/F;", "triggerRatingFlow", "Lkotlin/Function0;", "LnI/a;", "onDialogConsumed", "Z", "triggeredDialog", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* renamed from: b  reason: collision with root package name */
    private final e f58911b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f58912c;

    /* renamed from: d  reason: collision with root package name */
    private final K<d<Boolean>> f58913d;

    /* renamed from: e  reason: collision with root package name */
    private final F<d<Boolean>> f58914e;

    /* renamed from: f  reason: collision with root package name */
    private final C17631a<C16807N> f58915f = new b(this);

    /* renamed from: g  reason: collision with root package name */
    private boolean f58916g;

    public c(e eVar, C10253a aVar) {
        C17542s.j(eVar, PlaceTypes.STORAGE);
        C17542s.j(aVar, "killSwitchRepository");
        this.f58911b = eVar;
        this.f58912c = aVar;
        K<d<Boolean>> k10 = new K<>();
        this.f58913d = k10;
        this.f58914e = k10;
        eVar.b();
    }

    private final d e() {
        T t10;
        Iterator<T> it = d.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            d dVar = (d) t10;
            if (this.f58911b.d(dVar) >= dVar.j()) {
                break;
            }
        }
        return (d) t10;
    }

    private final <T> T g(T t10, String str) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("AppRatingTracker: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        return t10;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(c cVar) {
        cVar.g(cVar, "dialog was consumed.");
        cVar.f58911b.g();
        return C16807N.f139792a;
    }

    public void a(d dVar) {
        C17542s.j(dVar, "event");
        if (!f()) {
            C16807N n10 = C16807N.f139792a;
            String m10 = dVar.m();
            g(n10, "disabled, ignoring event:'" + m10 + "'");
            return;
        }
        String m11 = dVar.m();
        g(this, "event registered: '" + m11 + "'");
        this.f58911b.c(dVar);
        d e10 = e();
        if (e10 != null) {
            String m12 = e10.m();
            g(this, "ui triggered by '" + m12 + "' reaching its threshold.");
            this.f58916g = true;
            this.f58913d.postValue(new d(Boolean.TRUE, this.f58915f));
        }
    }

    public F<d<Boolean>> b() {
        return this.f58914e;
    }

    public void c() {
        if (this.f58916g) {
            this.f58911b.f(2);
        }
    }

    public final boolean f() {
        return !this.f58912c.r() ? ((Boolean) g(Boolean.FALSE, "disabled: Remote kill switch")).booleanValue() : this.f58916g ? ((Boolean) g(Boolean.FALSE, "disabled: Already triggered this session")).booleanValue() : this.f58911b.a() >= 2 ? ((Boolean) g(Boolean.FALSE, "disabled: Already triggered 2 dialogs")).booleanValue() : this.f58911b.e() < 2 ? ((Boolean) g(Boolean.FALSE, "disabled: Not reached min sessions 2")).booleanValue() : ((Boolean) g(Boolean.TRUE, "enabled")).booleanValue();
    }
}
