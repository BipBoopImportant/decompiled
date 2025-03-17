package oK;

import KJ.C15988d;
import QJ.F0;
import QJ.I0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.X;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import t1.C5942c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020#0\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"LoK/e;", "", "LQJ/Q;", "scope", "LoK/h;", "decoder", "LIJ/b;", "throttleEvery", "<init>", "(LQJ/Q;LoK/h;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "T", "LTJ/g;", "delay", "h", "(LTJ/g;J)LTJ/g;", "LKJ/d;", "LoK/j;", "Lt1/c;", "g", "()LTJ/g;", "", "regions", "LXH/N;", "f", "(Ljava/util/List;)V", "a", "LoK/h;", "b", "J", "LSJ/j;", "c", "LSJ/j;", "visibleRegions", "LTJ/B;", "", "LoK/e$b;", "d", "LTJ/B;", "cachedImages", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.e  reason: case insensitive filesystem */
public final class C17712e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C17715h f145332a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f145333b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C16434j<List<C17717j>> f145334c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16505B<Map<C17717j, b>> f145335d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageCache$1", f = "ImageCache.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: oK.e$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f145336c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f145337d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17712e f145338e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LoK/j;", "tiles", "LXH/N;", "c", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: oK.e$a$a  reason: collision with other inner class name */
        static final class C4238a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17712e f145339a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f145340b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
            @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageCache$1$1$1$1", f = "ImageCache.kt", l = {58}, m = "invokeSuspend")
            /* renamed from: oK.e$a$a$a  reason: collision with other inner class name */
            static final class C4239a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f145341c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C17712e f145342d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C17717j f145343e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4239a(C17712e eVar, C17717j jVar, C17164e<? super C4239a> eVar2) {
                    super(2, eVar2);
                    this.f145342d = eVar;
                    this.f145343e = jVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C4239a(this.f145342d, this.f145343e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C4239a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object value;
                    Object value2;
                    Map map;
                    Object f10 = C17187b.f();
                    int i10 = this.f145341c;
                    if (i10 == 0) {
                        y.b(obj);
                        C16505B a10 = this.f145342d.f145335d;
                        C17717j jVar = this.f145343e;
                        do {
                            value2 = a10.getValue();
                            map = (Map) value2;
                            if (map.containsKey(jVar)) {
                                throw new IllegalStateException("Check failed.");
                            }
                        } while (!a10.e(value2, X.r(map, C16796C.a(jVar, new b.a(I0.m(getContext()))))));
                        C17715h b10 = this.f145342d.f145332a;
                        C17717j jVar2 = this.f145343e;
                        this.f145341c = 1;
                        obj = b10.b(jVar2, this);
                        if (obj == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5942c cVar = (C5942c) obj;
                    C16505B a11 = this.f145342d.f145335d;
                    C17717j jVar3 = this.f145343e;
                    do {
                        value = a11.getValue();
                    } while (!a11.e(value, X.r((Map) value, C16796C.a(jVar3, new b.C4240b(cVar)))));
                    return C16807N.f139792a;
                }
            }

            C4238a(C17712e eVar, Q q10) {
                this.f145339a = eVar;
                this.f145340b = q10;
            }

            /* renamed from: c */
            public final Object emit(List<C17717j> list, C17164e<? super C16807N> eVar) {
                Object value;
                F0 a10;
                C17712e eVar2 = this.f145339a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C17717j jVar = list.get(i10);
                    if (!((Map) eVar2.f145335d.getValue()).containsKey(jVar)) {
                        arrayList.add(jVar);
                    }
                }
                Q q10 = this.f145340b;
                C17712e eVar3 = this.f145339a;
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    F0 unused = C16314k.d(q10, (C17168i) null, T.UNDISPATCHED, new C4239a(eVar3, (C17717j) arrayList.get(i11), (C17164e<? super C4239a>) null), 1, (Object) null);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : ((Map) this.f145339a.f145335d.getValue()).keySet()) {
                    if (!list.contains((C17717j) next)) {
                        arrayList2.add(next);
                    }
                }
                C17712e eVar4 = this.f145339a;
                int size3 = arrayList2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj = ((Map) eVar4.f145335d.getValue()).get((C17717j) arrayList2.get(i12));
                    b.a aVar = obj instanceof b.a ? (b.a) obj : null;
                    if (!(aVar == null || (a10 = aVar.a()) == null)) {
                        F0.a.a(a10, (CancellationException) null, 1, (Object) null);
                    }
                }
                C16505B a11 = this.f145339a.f145335d;
                do {
                    value = a11.getValue();
                } while (!a11.e(value, X.n((Map) value, C16877v.y1(arrayList2))));
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17712e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f145338e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f145338e, eVar);
            aVar.f145337d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f145336c;
            if (i10 == 0) {
                y.b(obj);
                C17712e eVar = this.f145338e;
                C16532g e10 = eVar.h(C16534i.s(C16534i.p(eVar.f145334c)), this.f145338e.f145333b);
                C4238a aVar = new C4238a(this.f145338e, (Q) this.f145337d);
                this.f145336c = 1;
                if (e10.collect(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"LoK/e$b;", "", "a", "b", "LoK/e$b$a;", "LoK/e$b$b;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.e$b */
    private interface b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LoK/e$b$a;", "LoK/e$b;", "LQJ/F0;", "job", "<init>", "(LQJ/F0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQJ/F0;", "()LQJ/F0;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oK.e$b$a */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final F0 f145344a;

            public a(F0 f02) {
                C17542s.j(f02, "job");
                this.f145344a = f02;
            }

            public final F0 a() {
                return this.f145344a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f145344a, ((a) obj).f145344a);
            }

            public int hashCode() {
                return this.f145344a.hashCode();
            }

            public String toString() {
                F0 f02 = this.f145344a;
                return "InFlight(job=" + f02 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LoK/e$b$b;", "LoK/e$b;", "Lt1/c;", "painter", "<init>", "(Lt1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt1/c;", "()Lt1/c;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oK.e$b$b  reason: collision with other inner class name */
        public static final class C4240b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final C5942c f145345a;

            public C4240b(C5942c cVar) {
                C17542s.j(cVar, PlaceTypes.PAINTER);
                this.f145345a = cVar;
            }

            public final C5942c a() {
                return this.f145345a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4240b) && C17542s.e(this.f145345a, ((C4240b) obj).f145345a);
            }

            public int hashCode() {
                return this.f145345a.hashCode();
            }

            public String toString() {
                C5942c cVar = this.f145345a;
                return "Loaded(painter=" + cVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.e$c */
    public static final class c implements C16532g<C15988d<C17717j, ? extends C5942c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f145346a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: oK.e$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f145347a;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageCache$observeCachedImages$$inlined$map$1$2", f = "ImageCache.kt", l = {223}, m = "emit")
            /* renamed from: oK.e$c$a$a  reason: collision with other inner class name */
            public static final class C4241a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f145348c;

                /* renamed from: d  reason: collision with root package name */
                int f145349d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f145350e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4241a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f145350e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f145348c = obj;
                    this.f145349d |= Integer.MIN_VALUE;
                    return this.f145350e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f145347a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof oK.C17712e.c.a.C4241a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    oK.e$c$a$a r0 = (oK.C17712e.c.a.C4241a) r0
                    int r1 = r0.f145349d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f145349d = r1
                    goto L_0x0018
                L_0x0013:
                    oK.e$c$a$a r0 = new oK.e$c$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f145348c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f145349d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r9)
                    goto L_0x007f
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f145347a
                    java.util.Map r8 = (java.util.Map) r8
                    int r2 = r8.size()
                    java.util.Map r2 = YH.X.d(r2)
                    java.util.Set r8 = r8.entrySet()
                    java.util.Iterator r8 = r8.iterator()
                L_0x0048:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x006e
                    java.lang.Object r4 = r8.next()
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                    java.lang.Object r5 = r4.getKey()
                    oK.j r5 = (oK.C17717j) r5
                    java.lang.Object r4 = r4.getValue()
                    oK.e$b r4 = (oK.C17712e.b) r4
                    boolean r6 = r4 instanceof oK.C17712e.b.C4240b
                    if (r6 == 0) goto L_0x0048
                    oK.e$b$b r4 = (oK.C17712e.b.C4240b) r4
                    t1.c r4 = r4.a()
                    r2.put(r5, r4)
                    goto L_0x0048
                L_0x006e:
                    java.util.Map r8 = YH.X.b(r2)
                    KJ.d r8 = KJ.C15985a.i(r8)
                    r0.f145349d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x007f
                    return r1
                L_0x007f:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: oK.C17712e.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f145346a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f145346a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageCache$throttleLatest-HG0u8IE$$inlined$transform$1", f = "ImageCache.kt", l = {40}, m = "invokeSuspend")
    /* renamed from: oK.e$d */
    public static final class d extends l implements p<C16533h<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f145351c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f145352d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16532g f145353e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f145354f;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: oK.e$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h<T> f145355a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f145356b;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @f(c = "me.saket.telephoto.subsamplingimage.internal.ImageCache$throttleLatest-HG0u8IE$$inlined$transform$1$1", f = "ImageCache.kt", l = {223, 224}, m = "emit")
            /* renamed from: oK.e$d$a$a  reason: collision with other inner class name */
            public static final class C4242a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f145357c;

                /* renamed from: d  reason: collision with root package name */
                int f145358d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f145359e;

                /* renamed from: f  reason: collision with root package name */
                Object f145360f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4242a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f145359e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f145357c = obj;
                    this.f145358d |= Integer.MIN_VALUE;
                    return this.f145359e.emit(null, this);
                }
            }

            public a(C16533h hVar, long j10) {
                this.f145356b = j10;
                this.f145355a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r6, dI.C17164e<? super XH.C16807N> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof oK.C17712e.d.a.C4242a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    oK.e$d$a$a r0 = (oK.C17712e.d.a.C4242a) r0
                    int r1 = r0.f145358d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f145358d = r1
                    goto L_0x0018
                L_0x0013:
                    oK.e$d$a$a r0 = new oK.e$d$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f145357c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f145358d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r7)
                    goto L_0x005b
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.f145360f
                    oK.e$d$a r6 = (oK.C17712e.d.a) r6
                    XH.y.b(r7)
                    goto L_0x004d
                L_0x003c:
                    XH.y.b(r7)
                    TJ.h<T> r7 = r5.f145355a
                    r0.f145360f = r5
                    r0.f145358d = r4
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    r6 = r5
                L_0x004d:
                    long r6 = r6.f145356b
                    r2 = 0
                    r0.f145360f = r2
                    r0.f145358d = r3
                    java.lang.Object r6 = QJ.C16297b0.c(r6, r0)
                    if (r6 != r1) goto L_0x005b
                    return r1
                L_0x005b:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: oK.C17712e.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16532g gVar, C17164e eVar, long j10) {
            super(2, eVar);
            this.f145353e = gVar;
            this.f145354f = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f145353e, eVar, this.f145354f);
            dVar.f145352d = obj;
            return dVar;
        }

        public final Object invoke(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f145351c;
            if (i10 == 0) {
                y.b(obj);
                C16532g gVar = this.f145353e;
                a aVar = new a((C16533h) this.f145352d, this.f145354f);
                this.f145351c = 1;
                if (gVar.collect(aVar, this) == f10) {
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

    public /* synthetic */ C17712e(Q q10, C17715h hVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q10, hVar, j10);
    }

    /* access modifiers changed from: private */
    public final <T> C16532g<T> h(C16532g<? extends T> gVar, long j10) {
        return C16534i.H(new d(C16534i.o(gVar), (C17164e) null, j10));
    }

    public final void f(List<C17717j> list) {
        C17542s.j(list, "regions");
        this.f145334c.k(list);
    }

    public final C16532g<C15988d<C17717j, C5942c>> g() {
        return C16534i.s(new c(this.f145335d));
    }

    private C17712e(Q q10, C17715h hVar, long j10) {
        C17542s.j(q10, "scope");
        C17542s.j(hVar, "decoder");
        this.f145332a = hVar;
        this.f145333b = j10;
        this.f145334c = C16437m.b(10, (C16428d) null, (C17642l) null, 6, (Object) null);
        this.f145335d = C16521S.a(X.j());
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C17712e(QJ.Q r7, oK.C17715h r8, long r9, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r6 = this;
            r11 = r11 & 4
            if (r11 == 0) goto L_0x000e
            IJ.b$a r9 = IJ.C15906b.f135496b
            r9 = 100
            IJ.e r10 = IJ.C15909e.MILLISECONDS
            long r9 = IJ.C15908d.s(r9, r10)
        L_0x000e:
            r3 = r9
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oK.C17712e.<init>(QJ.Q, oK.h, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
