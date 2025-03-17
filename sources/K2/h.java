package k2;

import androidx.room.x;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import i2.C5438a;
import java.util.Arrays;

public class h {

    /* renamed from: a  reason: collision with root package name */
    int[] f25090a = new int[CheckoutActivity.RESULT_CANCELED];

    /* renamed from: b  reason: collision with root package name */
    C5438a[] f25091b = new C5438a[CheckoutActivity.RESULT_CANCELED];

    /* renamed from: c  reason: collision with root package name */
    int f25092c;

    public h() {
        b();
    }

    public void a(int i10, C5438a aVar) {
        if (this.f25091b[i10] != null) {
            d(i10);
        }
        this.f25091b[i10] = aVar;
        int[] iArr = this.f25090a;
        int i11 = this.f25092c;
        this.f25092c = i11 + 1;
        iArr[i11] = i10;
        Arrays.sort(iArr);
    }

    public void b() {
        Arrays.fill(this.f25090a, x.MAX_BIND_PARAMETER_CNT);
        Arrays.fill(this.f25091b, (Object) null);
        this.f25092c = 0;
    }

    public int c(int i10) {
        return this.f25090a[i10];
    }

    public void d(int i10) {
        this.f25091b[i10] = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f25092c;
            if (i11 < i13) {
                int[] iArr = this.f25090a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            } else {
                this.f25092c = i13 - 1;
                return;
            }
        }
    }

    public int e() {
        return this.f25092c;
    }

    public C5438a f(int i10) {
        return this.f25091b[this.f25090a[i10]];
    }
}
