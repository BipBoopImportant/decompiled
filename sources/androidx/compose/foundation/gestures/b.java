package androidx.compose.foundation.gestures;

import G1.C4508k;
import QJ.F0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.gestures.c;
import c2.t;
import c2.z;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n0.C5589L;
import n0.T;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import o1.C5668h;
import p0.C5684b;
import p0.C5685c;
import p0.o;
import p0.v;
import r0.m;
import z1.e;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u0015*\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0016\u0010\u0017\u001a\u00020\u0011*\u00020\u0015H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\u00020\u0015*\u00020\u0015H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u0012*\u00020\u0012H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ@\u0010$\u001a\u00020 2.\u0010#\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001dH@¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0012H\u0016ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0015H\u0016ø\u0001\u0001¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,JQ\u0010-\u001a\u00020 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0010R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010,\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/foundation/gestures/b;", "T", "Landroidx/compose/foundation/gestures/d;", "Lp0/c;", "state", "Lp0/v;", "orientation", "", "enabled", "reverseDirection", "Lr0/m;", "interactionSource", "Ln0/T;", "overscrollEffect", "startDragImmediately", "<init>", "(Lp0/c;Lp0/v;ZLjava/lang/Boolean;Lr0/m;Ln0/T;Z)V", "", "Lo1/g;", "r3", "(F)J", "Lc2/y;", "s3", "p3", "(J)F", "q3", "n3", "(J)J", "o3", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/c$b;", "LXH/N;", "LdI/e;", "", "forEachDelta", "R2", "(LnI/p;LdI/e;)Ljava/lang/Object;", "startedPosition", "V2", "(J)V", "velocity", "W2", "a3", "()Z", "t3", "y", "Lp0/c;", "z", "Lp0/v;", "A", "Ljava/lang/Boolean;", "B", "Ln0/T;", "C", "Z", "m3", "isReverseDirection", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b<T> extends d {

    /* renamed from: A  reason: collision with root package name */
    private Boolean f17710A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public T f17711B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f17712C;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public C5685c<T> f17713y;

    /* renamed from: z  reason: collision with root package name */
    private v f17714z;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp0/b;", "Lp0/o;", "it", "LXH/N;", "<anonymous>", "(Lp0/b;Lp0/o;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {251}, m = "invokeSuspend")
    static final class a extends l implements q<C5684b, o<T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17715c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17716d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C17642l<? super c.b, C16807N>, C17164e<? super C16807N>, Object> f17717e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b<T> f17718f;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/foundation/gestures/c$b;", "dragDelta", "LXH/N;", "a", "(Landroidx/compose/foundation/gestures/c$b;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.b$a$a  reason: collision with other inner class name */
        static final class C0254a extends C17544u implements C17642l<c.b, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b<T> f17719c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5684b f17720d;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo1/g;", "deltaForDrag", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.b$a$a$a  reason: collision with other inner class name */
            static final class C0255a extends C17544u implements C17642l<C5667g, C5667g> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ b<T> f17721c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C5684b f17722d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0255a(b<T> bVar, C5684b bVar2) {
                    super(1);
                    this.f17721c = bVar;
                    this.f17722d = bVar2;
                }

                public final long a(long j10) {
                    float y10 = this.f17721c.f17713y.y(this.f17721c.q3(j10));
                    b<T> bVar = this.f17721c;
                    long k32 = bVar.r3(y10 - bVar.f17713y.A());
                    C5684b.b(this.f17722d, y10, 0.0f, 2, (Object) null);
                    return k32;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return C5667g.d(a(((C5667g) obj).v()));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0254a(b<T> bVar, C5684b bVar2) {
                super(1);
                this.f17719c = bVar;
                this.f17720d = bVar2;
            }

            public final void a(c.b bVar) {
                if (this.f17719c.f17711B == null) {
                    C5684b bVar2 = this.f17720d;
                    C5685c f32 = this.f17719c.f17713y;
                    b<T> bVar3 = this.f17719c;
                    C5684b.b(bVar2, f32.y(bVar3.q3(bVar3.o3(bVar.a()))), 0.0f, 2, (Object) null);
                    return;
                }
                T e32 = this.f17719c.f17711B;
                C17542s.g(e32);
                e32.c(this.f17719c.o3(bVar.a()), e.f32374a.b(), new C0255a(this.f17719c, this.f17720d));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((c.b) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C17642l<? super c.b, C16807N>, ? super C17164e<? super C16807N>, ? extends Object> pVar, b<T> bVar, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f17717e = pVar;
            this.f17718f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(C5684b bVar, o<T> oVar, C17164e<? super C16807N> eVar) {
            a aVar = new a(this.f17717e, this.f17718f, eVar);
            aVar.f17716d = bVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17715c;
            if (i10 == 0) {
                y.b(obj);
                p<C17642l<? super c.b, C16807N>, C17164e<? super C16807N>, Object> pVar = this.f17717e;
                C0254a aVar = new C0254a(this.f17718f, (C5684b) this.f17716d);
                this.f17715c = 1;
                if (pVar.invoke(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {275, 277}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.b$b  reason: collision with other inner class name */
    static final class C0256b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f17723c;

        /* renamed from: d  reason: collision with root package name */
        int f17724d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b<T> f17725e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f17726f;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lc2/y;", "availableVelocity", "<anonymous>", "(Lc2/y;)Lc2/y;"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {280}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.b$b$a */
        static final class a extends l implements p<c2.y, C17164e<? super c2.y>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f17727c;

            /* renamed from: d  reason: collision with root package name */
            int f17728d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ long f17729e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b<T> f17730f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b<T> bVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f17730f = bVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f17730f, eVar);
                aVar.f17729e = ((c2.y) obj).o();
                return aVar;
            }

            public final Object i(long j10, C17164e<? super c2.y> eVar) {
                return ((a) create(c2.y.b(j10), eVar)).invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((c2.y) obj).o(), (C17164e) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                b<T> bVar;
                long j10;
                Object f10 = C17187b.f();
                int i10 = this.f17728d;
                if (i10 == 0) {
                    y.b(obj);
                    long j11 = this.f17729e;
                    b<T> bVar2 = this.f17730f;
                    C5685c f32 = bVar2.f17713y;
                    float i32 = this.f17730f.p3(j11);
                    this.f17727c = bVar2;
                    this.f17729e = j11;
                    this.f17728d = 1;
                    Object H10 = f32.H(i32, this);
                    if (H10 == f10) {
                        return f10;
                    }
                    bVar = bVar2;
                    obj = H10;
                    j10 = j11;
                } else if (i10 == 1) {
                    j10 = this.f17729e;
                    bVar = (b) this.f17727c;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long l32 = bVar.s3(((Number) obj).floatValue());
                float A10 = this.f17730f.f17713y.A();
                float e10 = this.f17730f.f17713y.n().e();
                if (A10 >= this.f17730f.f17713y.n().g() || A10 <= e10) {
                    j10 = l32;
                }
                return c2.y.b(j10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0256b(b<T> bVar, long j10, C17164e<? super C0256b> eVar) {
            super(2, eVar);
            this.f17725e = bVar;
            this.f17726f = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0256b(this.f17725e, this.f17726f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C0256b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            b<T> bVar;
            Object f10 = C17187b.f();
            int i10 = this.f17724d;
            if (i10 == 0) {
                y.b(obj);
                if (this.f17725e.f17711B == null) {
                    b<T> bVar2 = this.f17725e;
                    C5685c f32 = bVar2.f17713y;
                    b<T> bVar3 = this.f17725e;
                    float i32 = bVar3.p3(bVar3.n3(this.f17726f));
                    this.f17723c = bVar2;
                    this.f17724d = 1;
                    Object H10 = f32.H(i32, this);
                    if (H10 == f10) {
                        return f10;
                    }
                    bVar = bVar2;
                    obj = H10;
                } else {
                    T e32 = this.f17725e.f17711B;
                    C17542s.g(e32);
                    long g32 = this.f17725e.n3(this.f17726f);
                    a aVar = new a(this.f17725e, (C17164e<? super a>) null);
                    this.f17724d = 2;
                    if (e32.a(g32, aVar, this) == f10) {
                        return f10;
                    }
                    return C16807N.f139792a;
                }
            } else if (i10 == 1) {
                bVar = (b) this.f17723c;
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long unused = bVar.s3(((Number) obj).floatValue());
            return C16807N.f139792a;
        }
    }

    public b(C5685c<T> cVar, v vVar, boolean z10, Boolean bool, m mVar, T t10, boolean z11) {
        super(a.f17667a, z10, mVar, vVar);
        this.f17713y = cVar;
        this.f17714z = vVar;
        this.f17710A = bool;
        this.f17711B = t10;
        this.f17712C = z11;
    }

    private final boolean m3() {
        Boolean bool = this.f17710A;
        if (bool == null) {
            return C4508k.l(this) == t.Rtl && this.f17714z == v.Horizontal;
        }
        C17542s.g(bool);
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public final long n3(long j10) {
        return c2.y.m(j10, m3() ? -1.0f : 1.0f);
    }

    /* access modifiers changed from: private */
    public final long o3(long j10) {
        return C5667g.s(j10, m3() ? -1.0f : 1.0f);
    }

    /* access modifiers changed from: private */
    public final float p3(long j10) {
        return this.f17714z == v.Vertical ? c2.y.i(j10) : c2.y.h(j10);
    }

    /* access modifiers changed from: private */
    public final float q3(long j10) {
        return this.f17714z == v.Vertical ? C5667g.n(j10) : C5667g.m(j10);
    }

    /* access modifiers changed from: private */
    public final long r3(float f10) {
        v vVar = this.f17714z;
        float f11 = vVar == v.Horizontal ? f10 : 0.0f;
        if (vVar != v.Vertical) {
            f10 = 0.0f;
        }
        return C5668h.a(f11, f10);
    }

    /* access modifiers changed from: private */
    public final long s3(float f10) {
        v vVar = this.f17714z;
        float f11 = vVar == v.Horizontal ? f10 : 0.0f;
        if (vVar != v.Vertical) {
            f10 = 0.0f;
        }
        return z.a(f11, f10);
    }

    public Object R2(p<? super C17642l<? super c.b, C16807N>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object k10 = C5685c.k(this.f17713y, (C5589L) null, new a(pVar, this, (C17164e<? super a>) null), eVar, 1, (Object) null);
        return k10 == C17187b.f() ? k10 : C16807N.f139792a;
    }

    public void V2(long j10) {
    }

    public void W2(long j10) {
        if (j2()) {
            F0 unused = C16314k.d(c2(), (C17168i) null, (QJ.T) null, new C0256b(this, j10, (C17164e<? super C0256b>) null), 3, (Object) null);
        }
    }

    public boolean a3() {
        return this.f17712C;
    }

    public final void t3(C5685c<T> cVar, v vVar, boolean z10, Boolean bool, m mVar, T t10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        C5685c<T> cVar2 = cVar;
        v vVar2 = vVar;
        Boolean bool2 = bool;
        if (!C17542s.e(this.f17713y, cVar)) {
            this.f17713y = cVar2;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f17714z != vVar2) {
            this.f17714z = vVar2;
            z12 = true;
        }
        if (!C17542s.e(this.f17710A, bool)) {
            this.f17710A = bool2;
            z14 = z11;
            z13 = true;
        } else {
            z13 = z12;
            z14 = z11;
        }
        this.f17712C = z14;
        this.f17711B = t10;
        d.d3(this, (C17642l) null, z10, mVar, vVar, z13, 1, (Object) null);
    }
}
