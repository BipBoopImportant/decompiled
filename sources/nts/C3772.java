package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;

/* renamed from: nts.Ⴂ  reason: contains not printable characters */
public class C3772 extends C3987 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public boolean f1237 = false;

    /* renamed from: Е  reason: contains not printable characters */
    public int f1238 = 0;

    /* renamed from: и  reason: contains not printable characters */
    public boolean f1239 = true;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public String f1240 = "";

    /* renamed from: ࡑ  reason: contains not printable characters */
    public String f1241 = "";

    /* renamed from: ખ  reason: contains not printable characters */
    public int f1242 = 0;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public boolean f1243 = false;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public String f1244 = "";

    /* renamed from: ⴸ  reason: contains not printable characters */
    public String f1245 = "";

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String f1246 = "";

    /* renamed from: ⶏ  reason: contains not printable characters */
    public String f1247 = "";

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3772)) {
            return false;
        }
        C3772 r52 = (C3772) obj;
        return this.f1246.equals(r52.f1246) && this.f1247.equals(r52.f1247) && this.f1240.equals(r52.f1240) && this.f1245.equals(r52.f1245) && this.f1244.equals(r52.f1244) && this.f1241.equals(r52.f1241) && this.f1243 == r52.f1243 && this.f1242 == r52.f1242 && this.f1238 == r52.f1238 && this.f1239 == r52.f1239;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m1237() {
        return this.f1238;
    }

    /* renamed from: Е  reason: contains not printable characters */
    public final void m1239() {
        if (this.f1245.length() == 0 && this.f1240.length() == 0) {
            this.f1246 = "";
            return;
        }
        C3798 r02 = new C3798((Object) null, new Object());
        r02.f1390 = 1;
        r02.f1392 = 65535;
        byte[] bytes = (this.f1245 + ":" + this.f1240).getBytes();
        String str = C3823.f1540;
        if (bytes == null) {
            bytes = C4058.f2976;
        }
        r02.f1395 = C3823.m1630(bytes, 0, bytes.length);
        try {
            r02.m1367(2);
        } catch (C3625 unused) {
        }
        this.f1246 = C3823.m1611(r02.f1388);
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int m1240() {
        return this.f1242;
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public String m1241() {
        return this.f1245;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public String m1242() {
        return this.f1246;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1246(String str) {
        if (!this.f1237) {
            if (str == null) {
                str = "";
            }
            this.f1246 = str;
            return;
        }
        throw new C3625((Throwable) null, 211, C3727.m1052("$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u0015\u0013\t\u0013\u0003\u00193/**c5))#+m/$$'-4\"00}|_SRTN\u0019[_W[SV\u0012wY]KZMGF\t`HUQ\u0004TJHLz>~sut|{csq:*\t\u0005\u0004\u0002\u0018O\r\t\u0001\r\u0005\u0000D!\u000f\u000b\u001d\f\u001b\u0011\u0010_.\u0010\u0003\u0000\u0005\u001a\u0006\u0013V> \"&(l,!/.&!1!#h»·¶°ªý¿»³¿·²ö½¹¯¾©£¢í¬°µà°®¬¨ÚÞ¥ÀË®Ð¥Ý£ç§ª¬­¥¢ºª¨ã¶º»½§ð²¶¾²º¿û°´¢³¤®¯à½ª¾í½£¡¥×ÓZomwriup2wyesbugf)ljzhowknn'`pjXNPWQ_QUGK\u0011YD\u0016[[_\nH^NGAMAND\u0000NH\u0005E5>+76:s$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u00128\u001e\u000e\u001c\u001b3f2,*.$`,!#\".)=-3x", 0, 53, 82));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m1249() {
        return this.f1243;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String m1250() {
        return this.f1247;
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public String m1251() {
        return this.f1240;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1238(String str) {
        if (!this.f1237) {
            if (str == null) {
                str = "";
            }
            this.f1245 = str;
            m1239();
            return;
        }
        throw new C3625((Throwable) null, 211, C3727.m1052("$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u0015\u0013\t\u0013\u0003\u00193/**c5))#+m/$$'-4\"00}|_SRTN\u0019[_W[SV\u0012wY]KZMGF\t`HUQ\u0004TJHLz>~sut|{csq:*\t\u0005\u0004\u0002\u0018O\r\t\u0001\r\u0005\u0000D!\u000f\u000b\u001d\f\u001b\u0011\u0010_.\u0010\u0003\u0000\u0005\u001a\u0006\u0013V> \"&(l,!/.&!1!#h»·¶°ªý¿»³¿·²ö½¹¯¾©£¢í¬°µà°®¬¨ÚÞ¥ÀË®Ð¥Ý£ç§ª¬­¥¢ºª¨ã¶º»½§ð²¶¾²º¿û°´¢³¤®¯à½ª¾í½£¡¥×ÓZomwriup2wyesbugf)ljzhowknn'`pjXNPWQ_QUGK\u0011YD\u0016[[_\nH^NGAMAND\u0000NH\u0005E5>+76:s$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u00128\u001e\u000e\u001c\u001b3f2,*.$`,!#\".)=-3x", 233, 44, 19));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1244(String str) {
        if (!this.f1237) {
            if (str == null) {
                str = "";
            }
            this.f1247 = str;
            return;
        }
        throw new C3625((Throwable) null, 211, C3727.m1052("$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u0015\u0013\t\u0013\u0003\u00193/**c5))#+m/$$'-4\"00}|_SRTN\u0019[_W[SV\u0012wY]KZMGF\t`HUQ\u0004TJHLz>~sut|{csq:*\t\u0005\u0004\u0002\u0018O\r\t\u0001\r\u0005\u0000D!\u000f\u000b\u001d\f\u001b\u0011\u0010_.\u0010\u0003\u0000\u0005\u001a\u0006\u0013V> \"&(l,!/.&!1!#h»·¶°ªý¿»³¿·²ö½¹¯¾©£¢í¬°µà°®¬¨ÚÞ¥ÀË®Ð¥Ý£ç§ª¬­¥¢ºª¨ã¶º»½§ð²¶¾²º¿û°´¢³¤®¯à½ª¾í½£¡¥×ÓZomwriup2wyesbugf)ljzhowknn'`pjXNPWQ_QUGK\u0011YD\u0016[[_\nH^NGAMAND\u0000NH\u0005E5>+76:s$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u00128\u001e\u000e\u001c\u001b3f2,*.$`,!#\".)=-3x", 53, 44, 38));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1248(String str) {
        if (!this.f1237) {
            if (str == null) {
                str = "";
            }
            this.f1240 = str;
            m1239();
            return;
        }
        throw new C3625((Throwable) null, 211, C3727.m1052("$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u0015\u0013\t\u0013\u0003\u00193/**c5))#+m/$$'-4\"00}|_SRTN\u0019[_W[SV\u0012wY]KZMGF\t`HUQ\u0004TJHLz>~sut|{csq:*\t\u0005\u0004\u0002\u0018O\r\t\u0001\r\u0005\u0000D!\u000f\u000b\u001d\f\u001b\u0011\u0010_.\u0010\u0003\u0000\u0005\u001a\u0006\u0013V> \"&(l,!/.&!1!#h»·¶°ªý¿»³¿·²ö½¹¯¾©£¢í¬°µà°®¬¨ÚÞ¥ÀË®Ð¥Ý£ç§ª¬­¥¢ºª¨ã¶º»½§ð²¶¾²º¿û°´¢³¤®¯à½ª¾í½£¡¥×ÓZomwriup2wyesbugf)ljzhowknn'`pjXNPWQ_QUGK\u0011YD\u0016[[_\nH^NGAMAND\u0000NH\u0005E5>+76:s$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u00128\u001e\u000e\u001c\u001b3f2,*.$`,!#\".)=-3x", 97, 48, 56));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1245(int i10) {
        if (!this.f1237) {
            this.f1238 = i10;
            if (this.f1242 == 0 && i10 != 0) {
                this.f1242 = i10 == 1 ? 80 : 1080;
                return;
            }
            return;
        }
        throw new C3625((Throwable) null, 211, C3727.m1052("$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u0015\u0013\t\u0013\u0003\u00193/**c5))#+m/$$'-4\"00}|_SRTN\u0019[_W[SV\u0012wY]KZMGF\t`HUQ\u0004TJHLz>~sut|{csq:*\t\u0005\u0004\u0002\u0018O\r\t\u0001\r\u0005\u0000D!\u000f\u000b\u001d\f\u001b\u0011\u0010_.\u0010\u0003\u0000\u0005\u001a\u0006\u0013V> \"&(l,!/.&!1!#h»·¶°ªý¿»³¿·²ö½¹¯¾©£¢í¬°µà°®¬¨ÚÞ¥ÀË®Ð¥Ý£ç§ª¬­¥¢ºª¨ã¶º»½§ð²¶¾²º¿û°´¢³¤®¯à½ª¾í½£¡¥×ÓZomwriup2wyesbugf)ljzhowknn'`pjXNPWQ_QUGK\u0011YD\u0016[[_\nH^NGAMAND\u0000NH\u0005E5>+76:s$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u00128\u001e\u000e\u001c\u001b3f2,*.$`,!#\".)=-3x", 189, 44, 119));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1243(int i10) {
        if (!this.f1237) {
            this.f1242 = i10;
            return;
        }
        throw new C3625((Throwable) null, 211, C3727.m1052("$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u0015\u0013\t\u0013\u0003\u00193/**c5))#+m/$$'-4\"00}|_SRTN\u0019[_W[SV\u0012wY]KZMGF\t`HUQ\u0004TJHLz>~sut|{csq:*\t\u0005\u0004\u0002\u0018O\r\t\u0001\r\u0005\u0000D!\u000f\u000b\u001d\f\u001b\u0011\u0010_.\u0010\u0003\u0000\u0005\u001a\u0006\u0013V> \"&(l,!/.&!1!#h»·¶°ªý¿»³¿·²ö½¹¯¾©£¢í¬°µà°®¬¨ÚÞ¥ÀË®Ð¥Ý£ç§ª¬­¥¢ºª¨ã¶º»½§ð²¶¾²º¿û°´¢³¤®¯à½ª¾í½£¡¥×ÓZomwriup2wyesbugf)ljzhowknn'`pjXNPWQ_QUGK\u0011YD\u0016[[_\nH^NGAMAND\u0000NH\u0005E5>+76:s$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u00128\u001e\u000e\u001c\u001b3f2,*.$`,!#\".)=-3x", 145, 44, (int) CheckoutActivity.RESULT_ERROR));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1247(boolean z10) {
        if (z10 && !C3823.m1590(C3856.f1645)) {
            throw new C3625((Throwable) null, 702, C3727.m1052("$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u0015\u0013\t\u0013\u0003\u00193/**c5))#+m/$$'-4\"00}|_SRTN\u0019[_W[SV\u0012wY]KZMGF\t`HUQ\u0004TJHLz>~sut|{csq:*\t\u0005\u0004\u0002\u0018O\r\t\u0001\r\u0005\u0000D!\u000f\u000b\u001d\f\u001b\u0011\u0010_.\u0010\u0003\u0000\u0005\u001a\u0006\u0013V> \"&(l,!/.&!1!#h»·¶°ªý¿»³¿·²ö½¹¯¾©£¢í¬°µà°®¬¨ÚÞ¥ÀË®Ð¥Ý£ç§ª¬­¥¢ºª¨ã¶º»½§ð²¶¾²º¿û°´¢³¤®¯à½ª¾í½£¡¥×ÓZomwriup2wyesbugf)ljzhowknn'`pjXNPWQ_QUGK\u0011YD\u0016[[_\nH^NGAMAND\u0000NH\u0005E5>+76:s$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u00128\u001e\u000e\u001c\u001b3f2,*.$`,!#\".)=-3x", 277, 71, 73));
        } else if (!this.f1237) {
            this.f1243 = z10;
        } else {
            throw new C3625((Throwable) null, 211, C3727.m1052("$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u0015\u0013\t\u0013\u0003\u00193/**c5))#+m/$$'-4\"00}|_SRTN\u0019[_W[SV\u0012wY]KZMGF\t`HUQ\u0004TJHLz>~sut|{csq:*\t\u0005\u0004\u0002\u0018O\r\t\u0001\r\u0005\u0000D!\u000f\u000b\u001d\f\u001b\u0011\u0010_.\u0010\u0003\u0000\u0005\u001a\u0006\u0013V> \"&(l,!/.&!1!#h»·¶°ªý¿»³¿·²ö½¹¯¾©£¢í¬°µà°®¬¨ÚÞ¥ÀË®Ð¥Ý£ç§ª¬­¥¢ºª¨ã¶º»½§ð²¶¾²º¿û°´¢³¤®¯à½ª¾í½£¡¥×ÓZomwriup2wyesbugf)ljzhowknn'`pjXNPWQ_QUGK\u0011YD\u0016[[_\nH^NGAMAND\u0000NH\u0005E5>+76:s$\u0007\u000b\n\f\u0016A\u0003\u0007\u000f\u0003\u000b\u000eJ/\u0001\u0005\u0013\u0002\u0015\u001f\u001eQ1\n\n\u00128\u001e\u000e\u001c\u001b3f2,*.$`,!#\".)=-3x", 348, 50, 9));
        }
    }
}
