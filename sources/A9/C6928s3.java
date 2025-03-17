package a9;

import XH.C16807N;
import android.view.View;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.q;

/* renamed from: a9.s3  reason: case insensitive filesystem */
public final class C6928s3 extends C17544u implements C17631a<C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q<Integer, Integer, Long, C16807N> f42846c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f42847d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f42848e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f42849f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ H3<View> f42850g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f42851h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f42852i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6928s3(q<? super Integer, ? super Integer, ? super Long, C16807N> qVar, int i10, int i11, long j10, H3<View> h32, int i12, int i13) {
        super(0);
        this.f42846c = qVar;
        this.f42847d = i10;
        this.f42848e = i11;
        this.f42849f = j10;
        this.f42850g = h32;
        this.f42851h = i12;
        this.f42852i = i13;
    }

    public final Object invoke() {
        this.f42846c.invoke(Integer.valueOf(this.f42847d), Integer.valueOf(this.f42848e), Long.valueOf(this.f42849f));
        H3<View> h32 = this.f42850g;
        h32.f42033b = this.f42851h;
        h32.f42034c = this.f42852i;
        h32.f42035d = 0;
        return C16807N.f139792a;
    }
}
