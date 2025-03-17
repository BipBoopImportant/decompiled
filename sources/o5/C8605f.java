package o5;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import UJ.C16619l;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.os.Build;
import androidx.work.C7055y;
import com.adjust.sdk.Constants;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import o5.C8601b;
import p5.C8626b;
import p5.c;
import p5.d;
import p5.e;
import p5.g;
import p5.h;
import p5.i;
import q5.n;
import s5.C8739u;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lo5/f;", "", "", "Lp5/d;", "controllers", "<init>", "(Ljava/util/List;)V", "Lq5/n;", "trackers", "(Lq5/n;)V", "Ls5/u;", "spec", "LTJ/g;", "Lo5/b;", "b", "(Ls5/u;)LTJ/g;", "workSpec", "", "a", "(Ls5/u;)Z", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o5.f  reason: case insensitive filesystem */
public final class C8605f {

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f55234a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp5/d;", "it", "", "a", "(Lp5/d;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: o5.f$a */
    static final class a extends C17544u implements C17642l<d, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f55235c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(d dVar) {
            C17542s.j(dVar, "it");
            String simpleName = dVar.getClass().getSimpleName();
            C17542s.i(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o5.f$b */
    public static final class b implements C16532g<C8601b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f55236a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: o5.f$b$a */
        static final class a extends C17544u implements C17631a<C8601b[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f55237c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C16532g[] gVarArr) {
                super(0);
                this.f55237c = gVarArr;
            }

            /* renamed from: b */
            public final C8601b[] invoke() {
                return new C8601b[this.f55237c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
        /* renamed from: o5.f$b$b  reason: collision with other inner class name */
        public static final class C0884b extends l implements q<C16533h<? super C8601b>, C8601b[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f55238c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f55239d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f55240e;

            public C0884b(C17164e eVar) {
                super(3, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super C8601b> hVar, C8601b[] bVarArr, C17164e<? super C16807N> eVar) {
                C0884b bVar = new C0884b(eVar);
                bVar.f55239d = hVar;
                bVar.f55240e = bVarArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C8601b bVar;
                Object f10 = C17187b.f();
                int i10 = this.f55238c;
                if (i10 == 0) {
                    y.b(obj);
                    C16533h hVar = (C16533h) this.f55239d;
                    C8601b[] bVarArr = (C8601b[]) ((Object[]) this.f55240e);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!C17542s.e(bVar, C8601b.a.f55215a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = C8601b.a.f55215a;
                    }
                    this.f55238c = 1;
                    if (hVar.emit(bVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        public b(C16532g[] gVarArr) {
            this.f55236a = gVarArr;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f55236a;
            Object a10 = C16619l.a(hVar, gVarArr, new a(gVarArr), new C0884b((C17164e) null), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    public C8605f(List<? extends d> list) {
        C17542s.j(list, "controllers");
        this.f55234a = list;
    }

    public final boolean a(C8739u uVar) {
        C17542s.j(uVar, "workSpec");
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f55234a) {
            if (((d) next).a(uVar)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            C7055y e10 = C7055y.e();
            String c10 = C8606g.f55241a;
            e10.a(c10, "Work " + uVar.f55910a + " constrained by " + C16877v.G0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f55235c, 31, (Object) null));
        }
        return arrayList.isEmpty();
    }

    public final C16532g<C8601b> b(C8739u uVar) {
        C17542s.j(uVar, "spec");
        ArrayList<d> arrayList = new ArrayList<>();
        for (Object next : this.f55234a) {
            if (((d) next).b(uVar)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (d c10 : arrayList) {
            arrayList2.add(c10.c(uVar.f55919j));
        }
        return C16534i.s(new b((C16532g[]) C16877v.t1(arrayList2).toArray(new C16532g[0])));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8605f(n nVar) {
        this((List<? extends d>) C16877v.s(new C8626b(nVar.a()), new c(nVar.b()), new i(nVar.e()), new e(nVar.d()), new h(nVar.d()), new g(nVar.d()), new p5.f(nVar.d()), Build.VERSION.SDK_INT >= 28 ? C8606g.a(nVar.c()) : null));
        C17542s.j(nVar, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH);
    }
}
