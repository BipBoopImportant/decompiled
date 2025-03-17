package R0;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import f1.C5309k;
import f1.C5310l;
import f1.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.B0;
import m0.C5530a;
import m0.C5546i;
import m0.C5554m;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u000eB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH@¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H@¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LR0/f;", "LR0/e;", "Lm0/a;", "", "Lm0/m;", "anim", "<init>", "(Lm0/a;)V", "()V", "LXH/N;", "d", "(LdI/e;)Ljava/lang/Object;", "b", "targetValue", "c", "(FLdI/e;)Ljava/lang/Object;", "a", "Lm0/a;", "()F", "distanceFraction", "", "e", "()Z", "isAnimating", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final c f12270b = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C5309k<f, Float> f12271c = C5310l.a(a.f12273c, b.f12274c);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5530a<Float, C5554m> f12272a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf1/m;", "LR0/f;", "it", "", "a", "(Lf1/m;LR0/f;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<m, f, Float> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f12273c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Float invoke(m mVar, f fVar) {
            return (Float) fVar.f12272a.m();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LR0/f;", "a", "(F)LR0/f;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Float, f> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f12274c = new b();

        b() {
            super(1);
        }

        public final f a(float f10) {
            return new f(new C5530a(Float.valueOf(f10), B0.f(C17536l.f144385a), (Object) null, (String) null, 12, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LR0/f$c;", "", "<init>", "()V", "Lf1/k;", "LR0/f;", "", "Saver", "Lf1/k;", "a", "()Lf1/k;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<f, Float> a() {
            return f.f12271c;
        }

        private c() {
        }
    }

    public /* synthetic */ f(C5530a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public float a() {
        return this.f12272a.m().floatValue();
    }

    public Object b(C17164e<? super C16807N> eVar) {
        Object f10 = C5530a.f(this.f12272a, kotlin.coroutines.jvm.internal.b.d(0.0f), (C5546i) null, (Object) null, (C17642l) null, eVar, 14, (Object) null);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public Object c(float f10, C17164e<? super C16807N> eVar) {
        Object t10 = this.f12272a.t(kotlin.coroutines.jvm.internal.b.d(f10), eVar);
        return t10 == C17187b.f() ? t10 : C16807N.f139792a;
    }

    public Object d(C17164e<? super C16807N> eVar) {
        Object f10 = C5530a.f(this.f12272a, kotlin.coroutines.jvm.internal.b.d(1.0f), (C5546i) null, (Object) null, (C17642l) null, eVar, 14, (Object) null);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public boolean e() {
        return this.f12272a.p();
    }

    private f(C5530a<Float, C5554m> aVar) {
        this.f12272a = aVar;
    }

    public f() {
        this(new C5530a(Float.valueOf(0.0f), B0.f(C17536l.f144385a), (Object) null, (String) null, 12, (DefaultConstructorMarker) null));
    }
}
