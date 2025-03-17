package nts;

import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.Vector;

/* renamed from: nts.Ꭶ  reason: contains not printable characters */
public class C3857 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f1665 = -1;

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1820(C4042 r12) {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1823(C4042 r12) {
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m1821() {
        return !(this instanceof C3620);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m1822() {
        C4042 r02 = new C4042();
        m1823(r02);
        return r02.f1611;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static Vector m1819(byte[] bArr) {
        C3857 r22;
        Vector vector = new Vector();
        C4042 r12 = new C4042(bArr);
        while (r12.m1731() > 0) {
            byte r42 = r12.m1761();
            switch (r42) {
                case 0:
                    r22 = new C4084();
                    break;
                case 1:
                    r22 = new C4119();
                    break;
                case 2:
                case 3:
                    r22 = new C3620();
                    break;
                case 4:
                    r22 = new C3962();
                    break;
                case 5:
                    r22 = new C3677();
                    break;
                case 6:
                    r22 = new C3791();
                    break;
                case 7:
                    r22 = new C3984();
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    r22 = new C3997();
                    break;
                case 16:
                    r22 = new C4031();
                    break;
                case 17:
                    r22 = new C4003();
                    break;
                case 18:
                case 19:
                    r22 = new C4152();
                    break;
                case 20:
                    r22 = new C3639();
                    break;
                case 21:
                    r22 = new C4025();
                    break;
                case 22:
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    r22 = new C3567();
                    break;
                case BuildConfig.MIN_SDK_VERSION:
                    r22 = new C4047();
                    break;
                case 25:
                    r22 = new C3543();
                    break;
                case 26:
                    r22 = new C4024();
                    break;
                case 27:
                    r22 = new C3716();
                    break;
                case 28:
                    r22 = new C4231(28);
                    break;
                case 29:
                    r22 = new C4231(29);
                    break;
                case 30:
                    r22 = new C3907();
                    break;
                default:
                    r22 = new C3857();
                    break;
            }
            r22.f1665 = r42;
            r22.m1820(r12);
            vector.add(r22);
        }
        return vector;
    }
}
