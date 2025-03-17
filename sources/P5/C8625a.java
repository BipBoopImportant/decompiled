package p5;

import SJ.C16447w;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import androidx.work.C7036e;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import o5.C8600a;
import o5.C8601b;
import q5.h;
import s5.C8739u;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168$X¤\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lp5/a;", "T", "Lp5/d;", "Lq5/h;", "tracker", "<init>", "(Lq5/h;)V", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroidx/work/e;", "constraints", "LTJ/g;", "Lo5/b;", "c", "(Landroidx/work/e;)LTJ/g;", "Ls5/u;", "workSpec", "a", "(Ls5/u;)Z", "Lq5/h;", "", "e", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p5.a  reason: case insensitive filesystem */
public abstract class C8625a<T> implements d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f55394a;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LSJ/y;", "Lo5/b;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: p5.a$a  reason: collision with other inner class name */
    static final class C0889a extends l implements p<C16449y<? super C8601b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f55395c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f55396d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8625a<T> f55397e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: p5.a$a$a  reason: collision with other inner class name */
        static final class C0890a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C8625a<T> f55398c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f55399d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0890a(C8625a<T> aVar, b bVar) {
                super(0);
                this.f55398c = aVar;
                this.f55399d = bVar;
            }

            public final void invoke() {
                this.f55398c.f55394a.f(this.f55399d);
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"p5/a$a$b", "Lo5/a;", "newValue", "LXH/N;", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: p5.a$a$b */
        public static final class b implements C8600a<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C8625a<T> f55400a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C16449y<C8601b> f55401b;

            b(C8625a<T> aVar, C16449y<? super C8601b> yVar) {
                this.f55400a = aVar;
                this.f55401b = yVar;
            }

            public void a(T t10) {
                this.f55401b.d().k(this.f55400a.f(t10) ? new C8601b.C0881b(this.f55400a.e()) : C8601b.a.f55215a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0889a(C8625a<T> aVar, C17164e<? super C0889a> eVar) {
            super(2, eVar);
            this.f55397e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C0889a aVar = new C0889a(this.f55397e, eVar);
            aVar.f55396d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16449y<? super C8601b> yVar, C17164e<? super C16807N> eVar) {
            return ((C0889a) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f55395c;
            if (i10 == 0) {
                y.b(obj);
                C16449y yVar = (C16449y) this.f55396d;
                b bVar = new b(this.f55397e, yVar);
                this.f55397e.f55394a.c(bVar);
                C0890a aVar = new C0890a(this.f55397e, bVar);
                this.f55395c = 1;
                if (C16447w.a(yVar, aVar, this) == f10) {
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

    public C8625a(h<T> hVar) {
        C17542s.j(hVar, "tracker");
        this.f55394a = hVar;
    }

    public boolean a(C8739u uVar) {
        C17542s.j(uVar, "workSpec");
        return b(uVar) && f(this.f55394a.e());
    }

    public C16532g<C8601b> c(C7036e eVar) {
        C17542s.j(eVar, "constraints");
        return C16534i.f(new C0889a(this, (C17164e<? super C0889a>) null));
    }

    /* access modifiers changed from: protected */
    public abstract int e();

    /* access modifiers changed from: protected */
    public abstract boolean f(T t10);
}
