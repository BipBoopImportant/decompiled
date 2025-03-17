package ZJ;

import QJ.C16315k0;
import QJ.C16318m;
import QJ.C16320n;
import QJ.C16324p;
import QJ.q1;
import QJ.r;
import WJ.C16732A;
import XH.C16807N;
import YH.C16877v;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u000b\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0010B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H@¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0015\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u00132\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u000f*\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u00020\u000f2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020-2\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00028\u0000H@¢\u0006\u0004\b4\u0010\nJ\u0017\u00105\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u0010(J\u0010\u00106\u001a\u00020\u000fH@¢\u0006\u0004\b6\u0010\nJ\u0017\u00107\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u0010(J!\u00108\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b8\u00109J#\u0010:\u001a\u000e\u0018\u00010\u0017R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00028\u0000H@¢\u0006\u0004\b<\u0010\nJ!\u0010>\u001a\u00020\u000f2\u0010\u0010=\u001a\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR(\u0010E\u001a\u0014\u0012\u000e\u0012\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010C8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010FR\u0016\u0010I\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010HR\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u0014\u0010L\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u00048\u0002X\u0004¨\u0006N"}, d2 = {"LZJ/j;", "R", "LQJ/m;", "LZJ/d;", "", "LdI/i;", "context", "<init>", "(LdI/i;)V", "o", "(LdI/e;)Ljava/lang/Object;", "LZJ/e;", "Lkotlin/Function1;", "LdI/e;", "block", "LXH/N;", "a", "(LZJ/e;LnI/l;)V", "Q", "LZJ/g;", "Lkotlin/Function2;", "e", "(LZJ/g;LnI/p;)V", "LZJ/j$a;", "", "reregister", "u", "(LZJ/j$a;Z)V", "LQJ/k0;", "disposableHandle", "n", "(LQJ/k0;)V", "LWJ/A;", "segment", "", "index", "d", "(LWJ/A;I)V", "internalResult", "c", "(Ljava/lang/Object;)V", "clauseObject", "result", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "LZJ/m;", "x", "(Ljava/lang/Object;Ljava/lang/Object;)LZJ/m;", "", "cause", "b", "(Ljava/lang/Throwable;)V", "q", "k", "z", "w", "y", "(Ljava/lang/Object;Ljava/lang/Object;)I", "r", "(Ljava/lang/Object;)LZJ/j$a;", "m", "selectedClause", "l", "(LZJ/j$a;)V", "LdI/i;", "getContext", "()LdI/i;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "t", "()Z", "isSelected", "state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZJ.j  reason: case insensitive filesystem */
public class C17015j<R> implements C16318m, C17009d<R>, C17016k, q1 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f140859f = AtomicReferenceFieldUpdater.newUpdater(C17015j.class, Object.class, "state$volatile");

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f140860a;

    /* renamed from: b  reason: collision with root package name */
    private List<C17015j<R>.defpackage.a> f140861b = new ArrayList(2);

    /* renamed from: c  reason: collision with root package name */
    private Object f140862c;

    /* renamed from: d  reason: collision with root package name */
    private int f140863d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Object f140864e = C17017l.f140882e;
    private volatile /* synthetic */ Object state$volatile = C17017l.f140879b;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012H\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b \u0010\"R6\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R6\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"RV\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010*\u001a\u00020'8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"LZJ/j$a;", "", "clauseObject", "Lkotlin/Function3;", "LZJ/k;", "LXH/N;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "param", "block", "", "LdI/i;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(LZJ/j;Ljava/lang/Object;LnI/q;LnI/q;Ljava/lang/Object;Ljava/lang/Object;LnI/q;)V", "LZJ/j;", "select", "", "e", "(LZJ/j;)Z", "result", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "b", "()V", "internalResult", "a", "(LZJ/k;Ljava/lang/Object;)LnI/q;", "Ljava/lang/Object;", "LnI/q;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZJ.j$a */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f140865a;

        /* renamed from: b  reason: collision with root package name */
        private final q<Object, C17016k<?>, Object, C16807N> f140866b;

        /* renamed from: c  reason: collision with root package name */
        private final q<Object, Object, Object, Object> f140867c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f140868d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f140869e;

        /* renamed from: f  reason: collision with root package name */
        public final q<C17016k<?>, Object, Object, q<Throwable, Object, C17168i, C16807N>> f140870f;

        /* renamed from: g  reason: collision with root package name */
        public Object f140871g;

        /* renamed from: h  reason: collision with root package name */
        public int f140872h = -1;

        public a(Object obj, q<Object, ? super C17016k<?>, Object, C16807N> qVar, q<Object, Object, Object, ? extends Object> qVar2, Object obj2, Object obj3, q<? super C17016k<?>, Object, Object, ? extends q<? super Throwable, Object, ? super C17168i, C16807N>> qVar3) {
            this.f140865a = obj;
            this.f140866b = qVar;
            this.f140867c = qVar2;
            this.f140868d = obj2;
            this.f140869e = obj3;
            this.f140870f = qVar3;
        }

        public final q<Throwable, Object, C17168i, C16807N> a(C17016k<?> kVar, Object obj) {
            q<C17016k<?>, Object, Object, q<Throwable, Object, C17168i, C16807N>> qVar = this.f140870f;
            if (qVar != null) {
                return qVar.invoke(kVar, this.f140868d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f140871g;
            C17015j<R> jVar = C17015j.this;
            C16315k0 k0Var = null;
            if (obj instanceof C16732A) {
                ((C16732A) obj).s(this.f140872h, (Throwable) null, jVar.getContext());
                return;
            }
            if (obj instanceof C16315k0) {
                k0Var = (C16315k0) obj;
            }
            if (k0Var != null) {
                k0Var.b();
            }
        }

        public final Object c(Object obj, C17164e<? super R> eVar) {
            Object obj2 = this.f140869e;
            if (this.f140868d == C17017l.i()) {
                C17542s.h(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((C17642l) obj2).invoke(eVar);
            }
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, eVar);
        }

        public final Object d(Object obj) {
            return this.f140867c.invoke(this.f140865a, this.f140868d, obj);
        }

        public final boolean e(C17015j<R> jVar) {
            this.f140866b.invoke(this.f140865a, jVar, this.f140868d);
            return jVar.f140864e == C17017l.f140882e;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
    /* renamed from: ZJ.j$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f140874c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f140875d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17015j<R> f140876e;

        /* renamed from: f  reason: collision with root package name */
        int f140877f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17015j<R> jVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f140876e = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f140875d = obj;
            this.f140877f |= Integer.MIN_VALUE;
            return this.f140876e.q(this);
        }
    }

    public C17015j(C17168i iVar) {
        this.f140860a = iVar;
    }

    private final void k(Object obj) {
        List<C17015j<R>.defpackage.a> list = this.f140861b;
        C17542s.g(list);
        Iterable<a> iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (a aVar : iterable) {
                if (aVar.f140865a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    private final void l(C17015j<R>.defpackage.a aVar) {
        List<C17015j<R>.defpackage.a> list = this.f140861b;
        if (list != null) {
            for (C17015j<R>.defpackage.a aVar2 : list) {
                if (aVar2 != aVar) {
                    aVar2.b();
                }
            }
            f140859f.set(this, C17017l.f140880c);
            this.f140864e = C17017l.f140882e;
            this.f140861b = null;
        }
    }

    private final Object m(C17164e<? super R> eVar) {
        Object obj = f140859f.get(this);
        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f140864e;
        l(aVar);
        return aVar.c(aVar.d(obj2), eVar);
    }

    static /* synthetic */ <R> Object p(C17015j<R> jVar, C17164e<? super R> eVar) {
        return jVar.t() ? jVar.m(eVar) : jVar.q(eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[PHI: r6 
      PHI: (r6v2 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:19:0x0054, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(dI.C17164e<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ZJ.C17015j.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ZJ.j$b r0 = (ZJ.C17015j.b) r0
            int r1 = r0.f140877f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f140877f = r1
            goto L_0x0018
        L_0x0013:
            ZJ.j$b r0 = new ZJ.j$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f140875d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f140877f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r6)
            goto L_0x0057
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.f140874c
            ZJ.j r2 = (ZJ.C17015j) r2
            XH.y.b(r6)
            goto L_0x004b
        L_0x003c:
            XH.y.b(r6)
            r0.f140874c = r5
            r0.f140877f = r4
            java.lang.Object r6 = r5.z(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            r6 = 0
            r0.f140874c = r6
            r0.f140877f = r3
            java.lang.Object r6 = r2.m(r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ZJ.C17015j.q(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ZJ.j<R>$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ZJ.j<R>$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ZJ.j$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ZJ.j<R>$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final ZJ.C17015j<R>.defpackage.a r(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.List<ZJ.j<R>$a> r0 = r4.f140861b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r0.next()
            r3 = r2
            ZJ.j$a r3 = (ZJ.C17015j.a) r3
            java.lang.Object r3 = r3.f140865a
            if (r3 != r5) goto L_0x000c
            r1 = r2
        L_0x001e:
            ZJ.j$a r1 = (ZJ.C17015j.a) r1
            if (r1 == 0) goto L_0x0023
            return r1
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Clause with object "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not found"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ZJ.C17015j.r(java.lang.Object):ZJ.j$a");
    }

    private final boolean t() {
        return f140859f.get(this) instanceof a;
    }

    public static /* synthetic */ void v(C17015j jVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            jVar.u(aVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    /* access modifiers changed from: private */
    public final void w(Object obj) {
        C17015j<R>.defpackage.a r10 = r(obj);
        C17542s.g(r10);
        r10.f140871g = null;
        r10.f140872h = -1;
        u(r10, true);
    }

    private final int y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f140859f.get(this);
            if (obj3 instanceof C16320n) {
                C17015j<R>.defpackage.a r10 = r(obj);
                if (r10 == null) {
                    continue;
                } else {
                    q<Throwable, Object, C17168i, C16807N> a10 = r10.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(f140859f, this, obj3, r10)) {
                        this.f140864e = obj2;
                        if (C17017l.j((C16320n) obj3, a10)) {
                            return 0;
                        }
                        this.f140864e = C17017l.f140882e;
                        return 2;
                    }
                }
            } else if (C17542s.e(obj3, C17017l.f140880c) || (obj3 instanceof a)) {
                return 3;
            } else {
                if (C17542s.e(obj3, C17017l.f140881d)) {
                    return 2;
                }
                if (C17542s.e(obj3, C17017l.f140879b)) {
                    if (androidx.concurrent.futures.b.a(f140859f, this, obj3, C16877v.e(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (androidx.concurrent.futures.b.a(f140859f, this, obj3, C16877v.W0((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }

    private final Object z(C17164e<? super C16807N> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        AtomicReferenceFieldUpdater i10 = f140859f;
        while (true) {
            Object obj = i10.get(this);
            if (obj == C17017l.f140879b) {
                if (androidx.concurrent.futures.b.a(f140859f, this, obj, pVar)) {
                    r.c(pVar, this);
                    break;
                }
            } else if (obj instanceof List) {
                if (androidx.concurrent.futures.b.a(f140859f, this, obj, C17017l.f140879b)) {
                    for (Object j10 : (Iterable) obj) {
                        w(j10);
                    }
                }
            } else if (obj instanceof a) {
                pVar.P(C16807N.f139792a, ((a) obj).a(this, this.f140864e));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    public void a(C17010e eVar, C17642l<? super C17164e<? super R>, ? extends Object> lVar) {
        v(this, new a(eVar.d(), eVar.a(), eVar.c(), C17017l.i(), lVar, eVar.b()), false, 1, (Object) null);
    }

    public void b(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater s10 = f140859f;
        do {
            obj = s10.get(this);
            if (obj == C17017l.f140880c) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(s10, this, obj, C17017l.f140881d));
        List<C17015j<R>.defpackage.a> list = this.f140861b;
        if (list != null) {
            for (a b10 : list) {
                b10.b();
            }
            this.f140864e = C17017l.f140882e;
            this.f140861b = null;
        }
    }

    public void c(Object obj) {
        this.f140864e = obj;
    }

    public void d(C16732A<?> a10, int i10) {
        this.f140862c = a10;
        this.f140863d = i10;
    }

    public <Q> void e(C17012g<? extends Q> gVar, p<? super Q, ? super C17164e<? super R>, ? extends Object> pVar) {
        v(this, new a(gVar.d(), gVar.a(), gVar.c(), (Object) null, pVar, gVar.b()), false, 1, (Object) null);
    }

    public boolean f(Object obj, Object obj2) {
        return y(obj, obj2) == 0;
    }

    public C17168i getContext() {
        return this.f140860a;
    }

    public void n(C16315k0 k0Var) {
        this.f140862c = k0Var;
    }

    public Object o(C17164e<? super R> eVar) {
        return p(this, eVar);
    }

    public final void u(C17015j<R>.defpackage.a aVar, boolean z10) {
        if (!(f140859f.get(this) instanceof a)) {
            if (!z10) {
                k(aVar.f140865a);
            }
            if (aVar.e(this)) {
                if (!z10) {
                    List<C17015j<R>.defpackage.a> list = this.f140861b;
                    C17542s.g(list);
                    list.add(aVar);
                }
                aVar.f140871g = this.f140862c;
                aVar.f140872h = this.f140863d;
                this.f140862c = null;
                this.f140863d = -1;
                return;
            }
            f140859f.set(this, aVar);
        }
    }

    public final C17018m x(Object obj, Object obj2) {
        return C17017l.a(y(obj, obj2));
    }
}
