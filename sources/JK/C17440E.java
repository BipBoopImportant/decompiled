package jK;

import YH.C16870n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"LjK/E;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;LnI/p;)V", "elementsCount", "", "e", "(I)[J", "index", "LXH/N;", "b", "(I)V", "c", "()I", "a", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "LnI/p;", "", "J", "lowerMarks", "[J", "highMarksArray", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.E  reason: case insensitive filesystem */
public final class C17440E {

    /* renamed from: e  reason: collision with root package name */
    private static final a f144015e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final long[] f144016f = new long[0];

    /* renamed from: a  reason: collision with root package name */
    private final SerialDescriptor f144017a;

    /* renamed from: b  reason: collision with root package name */
    private final p<SerialDescriptor, Integer, Boolean> f144018b;

    /* renamed from: c  reason: collision with root package name */
    private long f144019c;

    /* renamed from: d  reason: collision with root package name */
    private final long[] f144020d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LjK/E$a;", "", "<init>", "()V", "", "EMPTY_HIGH_MARKS", "[J", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jK.E$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17440E(SerialDescriptor serialDescriptor, p<? super SerialDescriptor, ? super Integer, Boolean> pVar) {
        C17542s.j(serialDescriptor, "descriptor");
        C17542s.j(pVar, "readIfAbsent");
        this.f144017a = serialDescriptor;
        this.f144018b = pVar;
        int d10 = serialDescriptor.d();
        long j10 = 0;
        if (d10 <= 64) {
            this.f144019c = d10 != 64 ? -1 << d10 : j10;
            this.f144020d = f144016f;
            return;
        }
        this.f144019c = 0;
        this.f144020d = e(d10);
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f144020d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f144020d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f144020d[i10];
            while (j10 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << numberOfTrailingZeros;
                int i13 = numberOfTrailingZeros + i12;
                if (this.f144018b.invoke(this.f144017a, Integer.valueOf(i13)).booleanValue()) {
                    this.f144020d[i10] = j10;
                    return i13;
                }
            }
            this.f144020d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[((i10 - 1) >>> 6)];
        if ((i10 & 63) != 0) {
            jArr[C16870n.m0(jArr)] = -1 << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f144019c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int d10 = this.f144017a.d();
        do {
            long j10 = this.f144019c;
            if (j10 != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                this.f144019c |= 1 << numberOfTrailingZeros;
            } else if (d10 > 64) {
                return c();
            } else {
                return -1;
            }
        } while (!this.f144018b.invoke(this.f144017a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }
}
