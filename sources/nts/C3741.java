package nts;

import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: nts.ක  reason: contains not printable characters */
public class C3741 extends C3967 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public String f1095;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public Key f1096 = null;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public boolean f1097;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public Mac f1098 = null;

    public C3741(String str) {
        this.f1095 = str;
        this.f1097 = false;
        this.f625 = m1143(str);
        m1144();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1143(String str) {
        if (C3823.m1590(str)) {
            return -1;
        }
        if (str.endsWith(C3727.m1052("{XTUSI\u001eLUE\u0012XQL\u0016XFJO\u000bDL]GIOE\u0003LDU\u0007z|}nr3QQWYGE\u0016\f\u0006Wou--/\"82`g`pj`3?2ISY\f\u000f\rai;", 44, 4, 77))) {
            return 160;
        }
        if (str.endsWith(C3727.m1052("{XTUSI\u001eLUE\u0012XQL\u0016XFJO\u000bDL]GIOE\u0003LDU\u0007z|}nr3QQWYGE\u0016\f\u0006Wou--/\"82`g`pj`3?2ISY\f\u000f\rai;", 48, 6, 42))) {
            return 256;
        }
        if (str.endsWith(C3727.m1052("{XTUSI\u001eLUE\u0012XQL\u0016XFJO\u000bDL]GIOE\u0003LDU\u0007z|}nr3QQWYGE\u0016\f\u0006Wou--/\"82`g`pj`3?2ISY\f\u000f\rai;", 54, 6, 97))) {
            return 224;
        }
        if (str.endsWith(C3727.m1052("{XTUSI\u001eLUE\u0012XQL\u0016XFJO\u000bDL]GIOE\u0003LDU\u0007z|}nr3QQWYGE\u0016\f\u0006Wou--/\"82`g`pj`3?2ISY\f\u000f\rai;", 60, 6, 57))) {
            return 384;
        }
        if (str.endsWith(C3727.m1052("{XTUSI\u001eLUE\u0012XQL\u0016XFJO\u000bDL]GIOE\u0003LDU\u0007z|}nr3QQWYGE\u0016\f\u0006Wou--/\"82`g`pj`3?2ISY\f\u000f\rai;", 66, 6, 126))) {
            return 512;
        }
        return str.endsWith(C3727.m1052("{XTUSI\u001eLUE\u0012XQL\u0016XFJO\u000bDL]GIOE\u0003LDU\u0007z|}nr3QQWYGE\u0016\f\u0006Wou--/\"82`g`pj`3?2ISY\f\u000f\rai;", 72, 3, 71)) ? 128 : -1;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1144() {
        try {
            this.f1098 = Mac.getInstance(this.f1095, C3727.m1052("{XTUSI\u001eLUE\u0012XQL\u0016XFJO\u000bDL]GIOE\u0003LDU\u0007z|}nr3QQWYGE\u0016\f\u0006Wou--/\"82`g`pj`3?2ISY\f\u000f\rai;", 38, 6, 51));
            this.f1097 = false;
        } catch (Exception e10) {
            throw new C3738(e10.getMessage());
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1145(byte[] bArr, int i10, int i11) {
        if (!this.f1097) {
            this.f1097 = true;
            try {
                this.f1098.init(this.f1096);
            } catch (Exception e10) {
                throw new C3738(e10.getMessage());
            }
        }
        this.f1098.update(bArr, i10, i11);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1146(byte[] bArr) {
        if (!this.f1097) {
            this.f1096 = new SecretKeySpec(bArr, this.f1095);
            return;
        }
        throw new C3738(C3727.m1052("{XTUSI\u001eLUE\u0012XQL\u0016XFJO\u000bDL]GIOE\u0003LDU\u0007z|}nr3QQWYGE\u0016\f\u0006Wou--/\"82`g`pj`3?2ISY\f\u000f\rai;", 0, 38, 30));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m1147() {
        this.f1097 = false;
        return this.f1098.doFinal();
    }
}
