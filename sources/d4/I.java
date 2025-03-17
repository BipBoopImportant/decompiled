package D4;

import D4.C6447v;
import D4.E;
import D4.P;
import D4.d0;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0010\u0010\u000fJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R,\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110.8\u0000X\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u00101R$\u00108\u001a\u00020\n2\u0006\u00103\u001a\u00020\n8\u0000@BX\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0016\u0010:\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u00105R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0A8\u0000X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR$\u0010J\u001a\u00020F2\u0006\u00103\u001a\u00020F8\u0000@BX\u000e¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\n8@X\u0004¢\u0006\u0006\u001a\u0004\bK\u00107R$\u0010Q\u001a\u00020\n2\u0006\u0010M\u001a\u00020\n8@@@X\u000e¢\u0006\f\u001a\u0004\bN\u00107\"\u0004\bO\u0010PR$\u0010T\u001a\u00020\n2\u0006\u0010M\u001a\u00020\n8@@@X\u000e¢\u0006\f\u001a\u0004\bR\u00107\"\u0004\bS\u0010P¨\u0006U"}, d2 = {"LD4/I;", "", "Key", "Value", "LD4/L;", "config", "<init>", "(LD4/L;)V", "LD4/x;", "loadType", "", "j", "(LD4/x;)I", "LTJ/g;", "f", "()LTJ/g;", "e", "LD4/P$b$b;", "LD4/E;", "u", "(LD4/P$b$b;LD4/x;)LD4/E;", "loadId", "page", "", "r", "(ILD4/x;LD4/P$b$b;)Z", "LD4/E$a;", "event", "LXH/N;", "h", "(LD4/E$a;)V", "LD4/d0;", "hint", "i", "(LD4/x;LD4/d0;)LD4/E$a;", "LD4/d0$a;", "viewportHint", "LD4/Q;", "g", "(LD4/d0$a;)LD4/Q;", "a", "LD4/L;", "", "b", "Ljava/util/List;", "_pages", "", "c", "m", "()Ljava/util/List;", "pages", "<set-?>", "d", "I", "l", "()I", "initialPageIndex", "_placeholdersBefore", "_placeholdersAfter", "prependGenerationId", "appendGenerationId", "LSJ/j;", "LSJ/j;", "prependGenerationIdCh", "appendGenerationIdCh", "", "k", "Ljava/util/Map;", "()Ljava/util/Map;", "failedHintsByLoadType", "LD4/C;", "LD4/C;", "p", "()LD4/C;", "sourceLoadStates", "q", "storageCount", "value", "o", "t", "(I)V", "placeholdersBefore", "n", "s", "placeholdersAfter", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final L f34090a;

    /* renamed from: b  reason: collision with root package name */
    private final List<P.b.C0534b<Key, Value>> f34091b;

    /* renamed from: c  reason: collision with root package name */
    private final List<P.b.C0534b<Key, Value>> f34092c;

    /* renamed from: d  reason: collision with root package name */
    private int f34093d;

    /* renamed from: e  reason: collision with root package name */
    private int f34094e;

    /* renamed from: f  reason: collision with root package name */
    private int f34095f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f34096g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f34097h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C16434j<Integer> f34098i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C16434j<Integer> f34099j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<C6449x, d0> f34100k;

    /* renamed from: l  reason: collision with root package name */
    private C f34101l;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LD4/I$a;", "", "Key", "Value", "LD4/L;", "config", "<init>", "(LD4/L;)V", "a", "LD4/L;", "LbK/a;", "b", "LbK/a;", "lock", "LD4/I;", "c", "LD4/I;", "state", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        private final L f34102a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17052a f34103b = g.b(false, 1, (Object) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final I<Key, Value> f34104c;

        public a(L l10) {
            C17542s.j(l10, "config");
            this.f34102a = l10;
            this.f34104c = new I<>(l10, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34105a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                D4.x[] r0 = D4.C6449x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D4.x r1 = D4.C6449x.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D4.x r1 = D4.C6449x.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                D4.x r1 = D4.C6449x.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f34105a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.I.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<C16533h<? super Integer>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34106c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I<Key, Value> f34107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(I<Key, Value> i10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f34107d = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f34107d, eVar);
        }

        public final Object invoke(C16533h<? super Integer> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f34106c == 0) {
                y.b(obj);
                this.f34107d.f34099j.k(kotlin.coroutines.jvm.internal.b.e(this.f34107d.f34097h));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<C16533h<? super Integer>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34108c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ I<Key, Value> f34109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(I<Key, Value> i10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f34109d = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f34109d, eVar);
        }

        public final Object invoke(C16533h<? super Integer> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f34108c == 0) {
                y.b(obj);
                this.f34109d.f34098i.k(kotlin.coroutines.jvm.internal.b.e(this.f34109d.f34096g));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ I(L l10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10);
    }

    public final C16532g<Integer> e() {
        return C16534i.S(C16534i.p(this.f34099j), new c(this, (C17164e<? super c>) null));
    }

    public final C16532g<Integer> f() {
        return C16534i.S(C16534i.p(this.f34098i), new d(this, (C17164e<? super d>) null));
    }

    public final Q<Key, Value> g(d0.a aVar) {
        Integer num;
        List t12 = C16877v.t1(this.f34092c);
        if (aVar != null) {
            int o10 = o();
            int i10 = -this.f34093d;
            int p10 = C16877v.p(this.f34092c) - this.f34093d;
            int g10 = aVar.g();
            int i11 = i10;
            while (i11 < g10) {
                o10 += i11 > p10 ? this.f34090a.f34121a : this.f34092c.get(this.f34093d + i11).b().size();
                i11++;
            }
            int f10 = o10 + aVar.f();
            if (aVar.g() < i10) {
                f10 -= this.f34090a.f34121a;
            }
            num = Integer.valueOf(f10);
        } else {
            num = null;
        }
        return new Q<>(t12, num, this.f34090a, o());
    }

    public final void h(E.a<Value> aVar) {
        C17542s.j(aVar, "event");
        if (aVar.f() <= this.f34092c.size()) {
            this.f34100k.remove(aVar.c());
            this.f34101l.c(aVar.c(), C6447v.c.f34457b.b());
            int i10 = b.f34105a[aVar.c().ordinal()];
            if (i10 == 2) {
                int f10 = aVar.f();
                for (int i11 = 0; i11 < f10; i11++) {
                    this.f34091b.remove(0);
                }
                this.f34093d -= aVar.f();
                t(aVar.g());
                int i12 = this.f34096g + 1;
                this.f34096g = i12;
                this.f34098i.k(Integer.valueOf(i12));
            } else if (i10 == 3) {
                int f11 = aVar.f();
                for (int i13 = 0; i13 < f11; i13++) {
                    this.f34091b.remove(this.f34092c.size() - 1);
                }
                s(aVar.g());
                int i14 = this.f34097h + 1;
                this.f34097h = i14;
                this.f34099j.k(Integer.valueOf(i14));
            } else {
                throw new IllegalArgumentException("cannot drop " + aVar.c());
            }
        } else {
            throw new IllegalStateException(("invalid drop count. have " + this.f34092c.size() + " but wanted to drop " + aVar.f()).toString());
        }
    }

    public final E.a<Value> i(C6449x xVar, d0 d0Var) {
        int i10;
        C17542s.j(xVar, "loadType");
        C17542s.j(d0Var, "hint");
        E.a<Value> aVar = null;
        if (this.f34090a.f34125e == Integer.MAX_VALUE || this.f34092c.size() <= 2 || q() <= this.f34090a.f34125e) {
            return null;
        }
        if (xVar != C6449x.REFRESH) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < this.f34092c.size() && q() - i13 > this.f34090a.f34125e) {
                int[] iArr = b.f34105a;
                if (iArr[xVar.ordinal()] == 2) {
                    i10 = this.f34092c.get(i12).b().size();
                } else {
                    List<P.b.C0534b<Key, Value>> list = this.f34092c;
                    i10 = list.get(C16877v.p(list) - i12).b().size();
                }
                if (((iArr[xVar.ordinal()] == 2 ? d0Var.d() : d0Var.c()) - i13) - i10 < this.f34090a.f34122b) {
                    break;
                }
                i13 += i10;
                i12++;
            }
            if (i12 != 0) {
                int[] iArr2 = b.f34105a;
                int p10 = iArr2[xVar.ordinal()] == 2 ? -this.f34093d : (C16877v.p(this.f34092c) - this.f34093d) - (i12 - 1);
                int p11 = iArr2[xVar.ordinal()] == 2 ? (i12 - 1) - this.f34093d : C16877v.p(this.f34092c) - this.f34093d;
                if (this.f34090a.f34123c) {
                    i11 = (xVar == C6449x.PREPEND ? o() : n()) + i13;
                }
                aVar = new E.a<>(xVar, p10, p11, i11);
            }
            return aVar;
        }
        throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + xVar).toString());
    }

    public final int j(C6449x xVar) {
        C17542s.j(xVar, "loadType");
        int i10 = b.f34105a[xVar.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        } else if (i10 == 2) {
            return this.f34096g;
        } else {
            if (i10 == 3) {
                return this.f34097h;
            }
            throw new t();
        }
    }

    public final Map<C6449x, d0> k() {
        return this.f34100k;
    }

    public final int l() {
        return this.f34093d;
    }

    public final List<P.b.C0534b<Key, Value>> m() {
        return this.f34092c;
    }

    public final int n() {
        if (this.f34090a.f34123c) {
            return this.f34095f;
        }
        return 0;
    }

    public final int o() {
        if (this.f34090a.f34123c) {
            return this.f34094e;
        }
        return 0;
    }

    public final C p() {
        return this.f34101l;
    }

    public final int q() {
        int i10 = 0;
        for (P.b.C0534b b10 : this.f34092c) {
            i10 += b10.b().size();
        }
        return i10;
    }

    public final boolean r(int i10, C6449x xVar, P.b.C0534b<Key, Value> bVar) {
        C17542s.j(xVar, "loadType");
        C17542s.j(bVar, "page");
        int i11 = b.f34105a[xVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    if (this.f34092c.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    } else if (i10 != this.f34097h) {
                        return false;
                    } else {
                        this.f34091b.add(bVar);
                        s(bVar.i() == Integer.MIN_VALUE ? C17978n.e(n() - bVar.b().size(), 0) : bVar.i());
                        this.f34100k.remove(C6449x.APPEND);
                    }
                }
            } else if (this.f34092c.isEmpty()) {
                throw new IllegalStateException("should've received an init before prepend");
            } else if (i10 != this.f34096g) {
                return false;
            } else {
                this.f34091b.add(0, bVar);
                this.f34093d++;
                t(bVar.k() == Integer.MIN_VALUE ? C17978n.e(o() - bVar.b().size(), 0) : bVar.k());
                this.f34100k.remove(C6449x.PREPEND);
            }
        } else if (!this.f34092c.isEmpty()) {
            throw new IllegalStateException("cannot receive multiple init calls");
        } else if (i10 == 0) {
            this.f34091b.add(bVar);
            this.f34093d = 0;
            s(bVar.i());
            t(bVar.k());
        } else {
            throw new IllegalStateException("init loadId must be the initial value, 0");
        }
        return true;
    }

    public final void s(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this.f34095f = i10;
    }

    public final void t(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this.f34094e = i10;
    }

    public final E<Value> u(P.b.C0534b<Key, Value> bVar, C6449x xVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(xVar, "loadType");
        int[] iArr = b.f34105a;
        int i10 = iArr[xVar.ordinal()];
        int i11 = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 0 - this.f34093d;
            } else if (i10 == 3) {
                i11 = (this.f34092c.size() - this.f34093d) - 1;
            } else {
                throw new t();
            }
        }
        List e10 = C16877v.e(new a0(i11, bVar.b()));
        int i12 = iArr[xVar.ordinal()];
        if (i12 == 1) {
            return E.b.f33870g.c(e10, o(), n(), this.f34101l.d(), (C6448w) null);
        }
        if (i12 == 2) {
            return E.b.f33870g.b(e10, o(), this.f34101l.d(), (C6448w) null);
        }
        if (i12 == 3) {
            return E.b.f33870g.a(e10, n(), this.f34101l.d(), (C6448w) null);
        }
        throw new t();
    }

    private I(L l10) {
        this.f34090a = l10;
        ArrayList arrayList = new ArrayList();
        this.f34091b = arrayList;
        this.f34092c = arrayList;
        this.f34098i = C16437m.b(-1, (C16428d) null, (C17642l) null, 6, (Object) null);
        this.f34099j = C16437m.b(-1, (C16428d) null, (C17642l) null, 6, (Object) null);
        this.f34100k = new LinkedHashMap();
        C c10 = new C();
        c10.c(C6449x.REFRESH, C6447v.b.f34456b);
        this.f34101l = c10;
    }
}
