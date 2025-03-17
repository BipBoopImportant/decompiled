package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: nts.Ꮴ  reason: contains not printable characters */
public class C3862 extends C3701 {

    /* renamed from: ᅯ  reason: contains not printable characters */
    public String f1674;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public String f1675;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public KeyGenerator f1676 = null;

    public C3862(String str, String str2) {
        String upperCase = str.toUpperCase();
        this.f1674 = upperCase;
        this.f1675 = str2;
        if (upperCase.equals(C4133.m3376(84, 3, 97))) {
            this.f910 = new C4124[]{new C4124(128, 256, 64)};
            this.f916 = new C4124[]{new C4124(128, 128, 0)};
            this.f912 = 128;
            this.f914 = 128;
            this.f913 = 256;
            this.f911 = 1;
            this.f909 = 1;
        } else if (this.f1674.equals(C4133.m3376(87, 4, 89)) || this.f1674.equals(C4133.m3376(91, 9, CheckoutActivity.RESULT_CANCELED))) {
            this.f1674 = C4133.m3376(100, 6, 64);
            this.f910 = new C4124[]{new C4124(128, 192, 64)};
            this.f913 = 128;
            this.f912 = 64;
            this.f914 = 64;
            this.f911 = 1;
            this.f909 = 1;
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static String m1866(int i10) {
        switch (i10) {
            case 1:
                return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 106, 3, 77);
            case 2:
                return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 109, 3, 80);
            case 3:
                return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 112, 3, 13);
            case 4:
                return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 115, 3, 65);
            case 5:
                return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 118, 3, 53);
            case 6:
                return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 121, 3, (int) CheckoutActivity.RESULT_ERROR);
            default:
                return "";
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1867() {
        if (this.f1676 == null) {
            try {
                String str = this.f1675;
                if (str != null) {
                    this.f1676 = KeyGenerator.getInstance(this.f1674, str);
                } else {
                    this.f1676 = KeyGenerator.getInstance(this.f1674);
                }
                this.f1676.init(this.f913);
            } catch (Exception e10) {
                throw new C3738(e10.getMessage());
            }
        }
        m901(this.f1676.generateKey().getEncoded());
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m1868(byte[] bArr, byte[] bArr2) {
        return new C3863(this, bArr, bArr2, this.f911, this.f909, this.f912 / 8, this.f914, this.f1674, this.f1675);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m1869(byte[] bArr, byte[] bArr2) {
        return new C3864(this, bArr, bArr2, this.f911, this.f909, this.f912 / 8, this.f914, this.f1674, this.f1675);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m1870() {
        m905(C4149.m3450(this.f912 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static String m1865(int i10, String str) {
        if (i10 == 1) {
            return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 124, 9, 18);
        }
        if (i10 != 2) {
            if (i10 == 3) {
                throw new C3738(C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 186, 21, 29));
            } else if (i10 != 4) {
                return i10 != 5 ? "" : C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 157, 17, 104);
            } else {
                return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 174, 12, 123);
            }
        } else if (str == null) {
            return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 133, 12, 98);
        } else {
            return C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 145, 12, 75);
        }
    }

    /* renamed from: nts.Ꮴ$ગ  reason: contains not printable characters */
    public class C3863 extends C3755 {

        /* renamed from: и  reason: contains not printable characters */
        public String f1677;

        /* renamed from: ࡑ  reason: contains not printable characters */
        public String f1678;

        /* renamed from: ᖑ  reason: contains not printable characters */
        public String f1679;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public Cipher f1680 = null;

        /* renamed from: ᜇ  reason: contains not printable characters */
        public byte[] f1681;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3863(C3862 r14, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, String str, String str2) {
            super(bArr2, i12, i12, i10, i11, i13);
            int i14 = i10;
            int i15 = i11;
            int i16 = i13;
            String str3 = str;
            String str4 = str2;
            this.f1678 = str3;
            if (str4 == null || !str4.equalsIgnoreCase(C4133.m3376(207, 6, 105)) || i16 <= 0 || !(i14 == 3 || i14 == 4)) {
                this.f1677 = str3 + "/" + C3862.m1866(i10) + "/" + C3862.m1865(i15, this.f1679);
            } else {
                this.f1677 = str3 + "/" + C3862.m1866(i10) + i16 + "/" + C3862.m1865(i15, this.f1679);
            }
            this.f1681 = bArr;
            this.f1679 = str4;
        }

        /* renamed from: ϴ  reason: contains not printable characters */
        public final void m1871() {
            if (this.f1680 == null) {
                String str = this.f1679;
                if (str != null) {
                    this.f1680 = Cipher.getInstance(this.f1677, str);
                } else {
                    this.f1680 = Cipher.getInstance(this.f1677);
                }
                this.f1680.init(1, new SecretKeySpec(this.f1681, this.f1678), this.f109 == 2 ? null : new IvParameterSpec(this.f108));
            }
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public int m1872(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            m1871();
            byte[] update = this.f1680.update(bArr, i10, i11);
            if (update == null) {
                return 0;
            }
            System.arraycopy(update, 0, bArr2, i12, update.length);
            return update.length;
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m1874() {
            throw new C3625(0, C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 213, 29, 45));
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1873(byte[] bArr, int i10, int i11) {
            m1871();
            return this.f1680.doFinal(bArr, i10, i11);
        }
    }

    /* renamed from: nts.Ꮴ$ഇ  reason: contains not printable characters */
    public class C3864 extends C3793 {

        /* renamed from: и  reason: contains not printable characters */
        public String f1682;

        /* renamed from: ࡑ  reason: contains not printable characters */
        public String f1683;

        /* renamed from: ᖑ  reason: contains not printable characters */
        public String f1684;

        /* renamed from: ᘺ  reason: contains not printable characters */
        public Cipher f1685 = null;

        /* renamed from: ᜇ  reason: contains not printable characters */
        public byte[] f1686;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3864(C3862 r14, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, String str, String str2) {
            super(bArr2, i12, i12, i10, i11, i13);
            int i14 = i10;
            int i15 = i11;
            int i16 = i13;
            String str3 = str;
            String str4 = str2;
            this.f1683 = str3;
            if (str4 == null || !str4.equalsIgnoreCase(C4133.m3376(242, 6, 37)) || i16 <= 0 || !(i14 == 3 || i14 == 4)) {
                this.f1682 = str3 + "/" + C3862.m1866(i10) + "/" + C3862.m1865(i15, this.f1684);
            } else {
                this.f1682 = str3 + "/" + C3862.m1866(i10) + i16 + "/" + C3862.m1865(i15, this.f1684);
            }
            this.f1686 = bArr;
            this.f1684 = str4;
        }

        /* renamed from: ϴ  reason: contains not printable characters */
        public final void m1875() {
            if (this.f1685 == null) {
                String str = this.f1684;
                if (str != null) {
                    this.f1685 = Cipher.getInstance(this.f1682, str);
                } else {
                    this.f1685 = Cipher.getInstance(this.f1682);
                }
                this.f1685.init(2, new SecretKeySpec(this.f1686, this.f1683), this.f109 == 2 ? null : new IvParameterSpec(this.f108));
            }
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public int m1876(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            m1875();
            byte[] update = this.f1685.update(bArr, i10, i11);
            if (update == null) {
                return 0;
            }
            System.arraycopy(update, 0, bArr2, i12, update.length);
            return update.length;
        }

        /* renamed from: ᐳ  reason: contains not printable characters */
        public void m1878() {
            throw new C3625(0, C3727.m1052("8\u0017\bP\u0004\u001f\u000f\u0011[\u0013\nX\u0011\u0011\t\\\u0015\u0003\r\t\u0003F\u0003\u000b\u0019J\u001d\u0000\u0006\u001dM\r?5>\">\"=9u\u000f  -\"h8#?!g/2`--)|)?51?z3;%v%8:!M\r\u0003\t\u0006\u001a\u0002\u001e\r\tIwrg9OMZcd|dwuulffsDBBgge{|~19>rvq\u0003\u0015\u0011_IL)\t5\u0005\u0007\u0006\b\u000e\b»¡ª»Ú¾å±µº¶²º­¶©ÖÐÐÐÕÁß¾áõèî¾ºµ¹½µûÝÆÐÚÞÐÊÚÜÝ×ÑÛÏÌÄÄââäêôö£ÁÎÊÑ×Äêðò¦ôìêÿçì©ààø­ñòüý¶óñöèâèí°", 248, 29, 103));
        }

        /* renamed from: ഇ  reason: contains not printable characters */
        public byte[] m1877(byte[] bArr, int i10, int i11) {
            m1875();
            return this.f1685.doFinal(bArr, i10, i11);
        }
    }
}
