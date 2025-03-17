package fE;

import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import androidx.work.B;
import androidx.work.C7032a;
import androidx.work.C7041j;
import androidx.work.C7042k;
import androidx.work.C7054x;
import androidx.work.H;
import androidx.work.I;
import androidx.work.S;
import androidx.work.T;
import eE.C14397a;
import eE.C14398b;
import eE.C14399c;
import eE.C14400d;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import uI.C18055d;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0017\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0013\"\u0014\b\u0001\u0010\u0015*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0014*\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\u0019\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u0019\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00020\u0019\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001b\u0010,\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"LfE/b;", "LeE/d;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/work/x;", "W", "LuI/d;", "worker", "LeE/a;", "parameters", "Landroidx/work/B;", "g", "(LuI/d;LeE/a;)Landroidx/work/B;", "LeE/b;", "Landroidx/work/I;", "h", "(LuI/d;LeE/b;)Landroidx/work/I;", "Landroidx/work/T;", "Landroidx/work/T$a;", "B", "LeE/c;", "f", "(Landroidx/work/T$a;LeE/c;)Landroidx/work/T;", "Ljava/util/UUID;", "a", "(LuI/d;LeE/a;)Ljava/util/UUID;", "Landroidx/work/k;", "existingWorkPolicy", "b", "(LuI/d;LeE/a;Landroidx/work/k;)Ljava/util/UUID;", "d", "(LuI/d;LeE/b;)Ljava/util/UUID;", "", "name", "LXH/N;", "c", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Landroidx/work/S;", "LXH/o;", "i", "()Landroidx/work/S;", "workManager", "workscheduler-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fE.b  reason: case insensitive filesystem */
public final class C14448b implements C14400d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f126889a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f126890b = C16825p.b(new C14447a(this));

    public C14448b(Context context) {
        C17542s.j(context, "context");
        this.f126889a = context;
    }

    private final <W extends T, B extends T.a<B, W>> W f(B b10, C14399c cVar) {
        b10.a(cVar.e());
        C7032a b11 = cVar.b();
        long d10 = cVar.d();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b10.i(b11, d10, timeUnit);
        b10.m(cVar.g(), timeUnit);
        b10.j(cVar.c());
        b10.n(cVar.f());
        H a10 = cVar.a();
        if (a10 != null) {
            b10.k(a10);
        }
        return b10.b();
    }

    private final <W extends C7054x> B g(C18055d<W> dVar, C14397a aVar) {
        return (B) f(new B.a(C17603a.b(dVar)), aVar);
    }

    private final <W extends C7054x> I h(C18055d<W> dVar, C14398b bVar) {
        return (I) f(new I.a((Class<? extends C7054x>) C17603a.b(dVar), bVar.i(), bVar.h()), bVar);
    }

    private final S i() {
        return (S) this.f126890b.getValue();
    }

    /* access modifiers changed from: private */
    public static final S j(C14448b bVar) {
        return S.f45094a.a(bVar.f126889a);
    }

    public <W extends C7054x> UUID a(C18055d<W> dVar, C14397a aVar) {
        C17542s.j(dVar, "worker");
        C17542s.j(aVar, "parameters");
        B g10 = g(dVar, aVar);
        i().d(g10);
        return g10.a();
    }

    public <W extends C7054x> UUID b(C18055d<W> dVar, C14397a aVar, C7042k kVar) {
        C17542s.j(dVar, "worker");
        C17542s.j(aVar, "parameters");
        C17542s.j(kVar, "existingWorkPolicy");
        B g10 = g(dVar, aVar);
        i().g(aVar.e(), kVar, g10);
        return g10.a();
    }

    public void c(String str) {
        C17542s.j(str, "name");
        i().b(str);
    }

    public <W extends C7054x> UUID d(C18055d<W> dVar, C14398b bVar) {
        C17542s.j(dVar, "worker");
        C17542s.j(bVar, "parameters");
        I h10 = h(dVar, bVar);
        i().f(bVar.e(), C7041j.CANCEL_AND_REENQUEUE, h10);
        return h10.a();
    }
}
