package T5;

import T5.j;
import T5.l;
import T5.v;
import WK.C16777l;
import XH.C16824o;
import XH.C16825p;
import Y5.g;
import android.content.Context;
import dI.C17164e;
import dI.C17168i;
import f6.C7853d;
import k6.C8436c;
import k6.C8437d;
import k6.C8441h;
import k6.C8445l;
import kotlin.Metadata;
import l6.C8531c;
import l6.f;
import nI.C17642l;
import r6.C8696d;
import r6.s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"LT5/r;", "", "Lk6/h;", "request", "Lk6/d;", "e", "(Lk6/h;)Lk6/d;", "Lk6/l;", "d", "(Lk6/h;LdI/e;)Ljava/lang/Object;", "Lk6/h$b;", "c", "()Lk6/h$b;", "defaults", "LT5/h;", "getComponents", "()LT5/h;", "components", "Lf6/d;", "b", "()Lf6/d;", "memoryCache", "LY5/a;", "a", "()LY5/a;", "diskCache", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface r {

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R \u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006'"}, d2 = {"LT5/r$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "LT5/h;", "components", "f", "(LT5/h;)LT5/r$a;", "LT5/r;", "c", "()LT5/r;", "a", "Landroid/content/Context;", "application", "Lk6/h$b;", "b", "Lk6/h$b;", "defaults", "LXH/o;", "Lf6/d;", "LXH/o;", "memoryCacheLazy", "LY5/a;", "d", "diskCacheLazy", "LT5/j$c;", "e", "LT5/j$c;", "eventListenerFactory", "LT5/h;", "componentRegistry", "LT5/l$a;", "g", "LT5/l$a;", "()LT5/l$a;", "extras", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f40058a;

        /* renamed from: b  reason: collision with root package name */
        private C8441h.b f40059b = C8441h.b.f54209p;

        /* renamed from: c  reason: collision with root package name */
        private C16824o<? extends C7853d> f40060c = null;

        /* renamed from: d  reason: collision with root package name */
        private C16824o<? extends Y5.a> f40061d = null;

        /* renamed from: e  reason: collision with root package name */
        private j.c f40062e = null;

        /* renamed from: f  reason: collision with root package name */
        private C6704h f40063f = null;

        /* renamed from: g  reason: collision with root package name */
        private final l.a f40064g = new l.a();

        public a(Context context) {
            this.f40058a = C8696d.b(context);
        }

        /* access modifiers changed from: private */
        public static final C7853d d(a aVar) {
            return C7853d.a.d(new C7853d.a(), aVar.f40058a, 0.0d, 2, (Object) null).b();
        }

        /* access modifiers changed from: private */
        public static final Y5.a e() {
            return g.d();
        }

        public final r c() {
            Context context = this.f40058a;
            C8441h.b b10 = C8441h.b.b(this.f40059b, (C16777l) null, (C17168i) null, (C17168i) null, (C17168i) null, (C8436c) null, (C8436c) null, (C8436c) null, (C17642l) null, (C17642l) null, (C17642l) null, (l6.j) null, (f) null, (C8531c) null, this.f40064g.a(), 8191, (Object) null);
            C16824o<? extends C7853d> oVar = this.f40060c;
            if (oVar == null) {
                oVar = C16825p.b(new p(this));
            }
            C16824o<? extends C7853d> oVar2 = oVar;
            C16824o<? extends Y5.a> oVar3 = this.f40061d;
            if (oVar3 == null) {
                oVar3 = C16825p.b(new q());
            }
            C16824o<? extends Y5.a> oVar4 = oVar3;
            j.c cVar = this.f40062e;
            if (cVar == null) {
                cVar = j.c.f40048b;
            }
            j.c cVar2 = cVar;
            C6704h hVar = this.f40063f;
            if (hVar == null) {
                hVar = new C6704h();
            }
            return new v(new v.a(context, b10, oVar2, oVar4, cVar2, hVar, (s) null));
        }

        public final a f(C6704h hVar) {
            this.f40063f = hVar;
            return this;
        }

        public final l.a g() {
            return this.f40064g;
        }
    }

    Y5.a a();

    C7853d b();

    C8441h.b c();

    Object d(C8441h hVar, C17164e<? super C8445l> eVar);

    C8437d e(C8441h hVar);

    C6704h getComponents();
}
