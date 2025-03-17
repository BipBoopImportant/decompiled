package m0;

import XH.C16814e;
import j0.D;
import j0.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000e\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lm0/a0;", "T", "Lm0/C;", "Lm0/a0$b;", "config", "<init>", "(Lm0/a0$b;)V", "Lm0/q;", "V", "Lm0/z0;", "converter", "Lm0/L0;", "f", "(Lm0/z0;)Lm0/L0;", "a", "Lm0/a0$b;", "getConfig", "()Lm0/a0$b;", "b", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.a0  reason: case insensitive filesystem */
public final class C5531a0<T> implements C5524C<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f25703a;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lm0/a0$a;", "T", "Lm0/Z;", "value", "Lm0/D;", "easing", "Lm0/t;", "arcMode", "<init>", "(Ljava/lang/Object;Lm0/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "I", "d", "setArcMode-Rur9ykg$animation_core_release", "(I)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: m0.a0$a */
    public static final class a<T> extends Z<T> {

        /* renamed from: c  reason: collision with root package name */
        private int f25704c;

        public /* synthetic */ a(Object obj, C5525D d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, d10, i10);
        }

        public final int d() {
            return this.f25704c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(aVar.b(), b()) && C17542s.e(aVar.a(), a()) && C5564t.c(aVar.f25704c, this.f25704c);
        }

        public int hashCode() {
            Object b10 = b();
            return ((((b10 != null ? b10.hashCode() : 0) * 31) + C5564t.d(this.f25704c)) * 31) + a().hashCode();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Object obj, C5525D d10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? M.e() : d10, (i11 & 4) != 0 ? C5564t.f25879a.a() : i10, (DefaultConstructorMarker) null);
        }

        private a(T t10, C5525D d10, int i10) {
            super(t10, d10, (DefaultConstructorMarker) null);
            this.f25704c = i10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm0/a0$b;", "T", "Lm0/b0;", "Lm0/a0$a;", "<init>", "()V", "", "timeStamp", "g", "(Ljava/lang/Object;I)Lm0/a0$a;", "Lm0/D;", "easing", "LXH/N;", "h", "(Lm0/a0$a;Lm0/D;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: m0.a0$b */
    public static final class b<T> extends C5533b0<T, a<T>> {
        public b() {
            super((DefaultConstructorMarker) null);
        }

        public a<T> g(T t10, int i10) {
            a aVar = new a(t10, (C5525D) null, 0, 6, (DefaultConstructorMarker) null);
            c().t(i10, aVar);
            return aVar;
        }

        @C16814e
        public final void h(a<T> aVar, C5525D d10) {
            aVar.c(d10);
        }
    }

    public C5531a0(b<T> bVar) {
        this.f25703a = bVar;
    }

    /* renamed from: f */
    public <V extends C5562q> L0<V> a(z0<T, V> z0Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i10;
        D d10 = new D(this.f25703a.c().e() + 2);
        E e10 = new E(this.f25703a.c().e());
        E<E> c10 = this.f25703a.c();
        int[] iArr3 = c10.f24634b;
        Object[] objArr = c10.f24635c;
        long[] jArr3 = c10.f24633a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            a aVar = (a) objArr[i15];
                            d10.i(i16);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            e10.t(i16, new K0((C5562q) z0Var.a().invoke(aVar.b()), aVar.a(), aVar.d(), (DefaultConstructorMarker) null));
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.f25703a.c().a(0)) {
            d10.h(0, 0);
        }
        if (!this.f25703a.c().a(this.f25703a.b())) {
            d10.i(this.f25703a.b());
        }
        d10.p();
        return new L0(d10, e10, this.f25703a.b(), this.f25703a.a(), M.e(), C5564t.f25879a.a(), (DefaultConstructorMarker) null);
    }
}
