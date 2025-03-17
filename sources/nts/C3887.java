package nts;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;

/* renamed from: nts.ᑵ  reason: contains not printable characters */
public class C3887 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public int f1767 = 0;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public String f1768 = "";

    public C3887() {
        this.f3542 = 160;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m1950(byte[] bArr, int i10) {
        if (i10 >= bArr.length) {
            return i10;
        }
        byte b10 = bArr[i10] & 15;
        this.f1767 = b10;
        C4114 r62 = b10 != 0 ? b10 != 1 ? b10 != 2 ? b10 != 6 ? b10 != 7 ? null : new C3837() : new C3838() : new C3838() : new C3838() : new C4177();
        this.f3542 = b10 | 128;
        r62.f3542 = bArr[i10] & 255;
        int r72 = r62.m3270(bArr, i10);
        if (!r62.f3546) {
            return i10;
        }
        if (b10 == 0) {
            C4177 r82 = (C4177) r62;
            if (r82.f3887.f1400.equals(C4089.f3466)) {
                byte[] bArr2 = r82.f3886.f2703.f3541;
                int i11 = 0;
                while (i11 < bArr2.length && bArr2[i11] != 0) {
                    i11++;
                }
                String str = C3823.f1540;
                this.f1768 = new String(bArr2, 0, i11);
                this.f3547 = r62.f3547;
                this.f3539 = r62.f3539;
                return m3274(bArr, r72);
            }
        }
        if (b10 != 7) {
            byte[] bArr3 = r62.f3541;
            String str2 = C3823.f1540;
            this.f1768 = new String(bArr3);
        } else if (r62.f3541.length == 4) {
            this.f1768 = (r62.f3541[0] & 255) + "." + (r62.f3541[1] & 255) + "." + (r62.f3541[2] & 255) + "." + (r62.f3541[3] & 255);
        } else {
            throw new C3625((Throwable) null, 446, C3727.m1052("@lfr0gsuykqvt;awthr!km,^k{GoK@G_UEEWe]QKZK\u0017\u0001-'3q&2>48>*075z 65)3`*,m\u001f*:\u0006.\n>\u0001\u0006\u001e\u0014\u0004\u0004\u0016$\u001c\u0010\n\u001b\nV0\u001c\u0016\u0002@\u0017\u0003\u000f\u0005\t\u000f\u001b\u0001\u0006\u0004K\u0011\u0007\u0004\u0018\u0002Q\u001b\u001d\\/:1+\u001c\u000b\u000e!+%\"nÂîäð²åñý÷ûýéóôö¹ãõöêð£éï®ÝÈÃÙîùüÓÙ×Ð ª¾ü«¿³¹µ³§½º¸÷­»¸¤¾í§¡à ·²Ò«ÕÑÊÆµ§×Ì°ÎÊÑÝ®¼Ì×L`j~<ksyusg}zx7m{xd~-ga SFMW`wr]WY^\u0012+\u0006\u0007\u001b\u001e\b\u001d\u001c\u0005\u0005&\u0002\u0010\u0004%\b\u0016\r\u001f\u0015\bS\u001f\u000f\u0000\u0014\u001c\u0017\\\\V\u001e;i$$8m=:01-10 \"i;\u0001\u001e\b\t\u0004\u000f\u0007\u000f\u001d\u0001\u0001B \u000f\u000f\n\u001a\u0012\tW/\u0001\t\u0013W\u001b\u0017\u0018\u0016\u0013\u0005n&(($?!//\"6eÚàÿéèåîæîüàà£òôâó÷þ¼ðÿà¸ñùçùòæ¿¾ÇØÜÕÜª¦®§½§¹¤®øáäÄÆÌÀÊÖËÅÅÏËÌÙÞËÉÚÎØÀÀÔÕÞÒÜïï¨àà¯ÉõöæîåããÇàèïñÿ÷üýé÷ÜâÒóåàüÂLvi~sxpxjvv5UDX)|rzh,iatng\"lj'CAL^TYY[}TBG[S]TW]MdXnI]ZHFJADPB\bJflx:myusua{|~1k}~bx+ag&B|qgmddZ|YONR^PUV@PAr^UmJ^YCMAJGSAV\fÃïåñ³äðüöúüèòõ÷¸âô÷ëñ¢èî¯ÊäëîùýÉÛÑÚÆÚÆÙÝöÚØÒÏÓßÑÂÔÖ¼¼¤ñ¥¢¤¥µ©¬¼ºÿª¸°°©®¨çª°§©­»èÄÎÚÏÛ×ÝÑ×ÃÙÞÜÉßÜÀÚÃÅöÏÀÎÄÐêòûñì¶Txrf$sgkamkeb`/uc`|f5y8\\boysmvOOQ\rYuk)~jfl`frhom\"xnmqk8rt5Qobt~`{BB\\\u00005zxb1cfbmsmj||mJ^W_XLxZCzT_V\ne*(2a362=#=:,,etBA]G\u0014SSZW_SS[\u0011×íòäåèãëãñíí®Ìããæöþå»Ãíåÿ»÷ûôúÿéÊÄÄÈÓÍÃÃÎÚ¢¨¼þ©½±»·±¥¿¸ºõ¯¹º¦¼ï¥£â¸µ¢½Ð", 893, 15, 67));
        }
        this.f3547 = r62.f3547;
        this.f3539 = r62.f3539;
        return m3274(bArr, r72);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1951(C3796 r12) {
        boolean z10 = C3596.f366;
        new Vector();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = this.f3542;
        int i11 = i10 & 15;
        this.f1767 = i11;
        if (i11 == 1 || i11 == 2 || i11 == 6) {
            String str = this.f1768;
            String str2 = C3823.f1540;
            try {
                byteArrayOutputStream.write(str.getBytes());
            } catch (IOException e10) {
                throw new C3625((Throwable) e10, C3625.m589(e10));
            }
        } else if (i11 == 7) {
            String[] r42 = C3823.m1632(this.f1768, ".");
            if (r42.length == 4) {
                try {
                    byteArrayOutputStream.write(new byte[]{(byte) (Integer.parseInt(r42[0]) & 255), (byte) (Integer.parseInt(r42[1]) & 255), (byte) (Integer.parseInt(r42[2]) & 255), (byte) (Integer.parseInt(r42[3]) & 255)});
                } catch (IOException e11) {
                    throw new C3625((Throwable) e11, C3625.m589(e11));
                }
            } else {
                throw new C3625(0, this.f1768 + C3727.m1052("@lfr0gsuykqvt;awthr!km,^k{GoK@G_UEEWe]QKZK\u0017\u0001-'3q&2>48>*075z 65)3`*,m\u001f*:\u0006.\n>\u0001\u0006\u001e\u0014\u0004\u0004\u0016$\u001c\u0010\n\u001b\nV0\u001c\u0016\u0002@\u0017\u0003\u000f\u0005\t\u000f\u001b\u0001\u0006\u0004K\u0011\u0007\u0004\u0018\u0002Q\u001b\u001d\\/:1+\u001c\u000b\u000e!+%\"nÂîäð²åñý÷ûýéóôö¹ãõöêð£éï®ÝÈÃÙîùüÓÙ×Ð ª¾ü«¿³¹µ³§½º¸÷­»¸¤¾í§¡à ·²Ò«ÕÑÊÆµ§×Ì°ÎÊÑÝ®¼Ì×L`j~<ksyusg}zx7m{xd~-ga SFMW`wr]WY^\u0012+\u0006\u0007\u001b\u001e\b\u001d\u001c\u0005\u0005&\u0002\u0010\u0004%\b\u0016\r\u001f\u0015\bS\u001f\u000f\u0000\u0014\u001c\u0017\\\\V\u001e;i$$8m=:01-10 \"i;\u0001\u001e\b\t\u0004\u000f\u0007\u000f\u001d\u0001\u0001B \u000f\u000f\n\u001a\u0012\tW/\u0001\t\u0013W\u001b\u0017\u0018\u0016\u0013\u0005n&(($?!//\"6eÚàÿéèåîæîüàà£òôâó÷þ¼ðÿà¸ñùçùòæ¿¾ÇØÜÕÜª¦®§½§¹¤®øáäÄÆÌÀÊÖËÅÅÏËÌÙÞËÉÚÎØÀÀÔÕÞÒÜïï¨àà¯ÉõöæîåããÇàèïñÿ÷üýé÷ÜâÒóåàüÂLvi~sxpxjvv5UDX)|rzh,iatng\"lj'CAL^TYY[}TBG[S]TW]MdXnI]ZHFJADPB\bJflx:myusua{|~1k}~bx+ag&B|qgmddZ|YONR^PUV@PAr^UmJ^YCMAJGSAV\fÃïåñ³äðüöúüèòõ÷¸âô÷ëñ¢èî¯ÊäëîùýÉÛÑÚÆÚÆÙÝöÚØÒÏÓßÑÂÔÖ¼¼¤ñ¥¢¤¥µ©¬¼ºÿª¸°°©®¨çª°§©­»èÄÎÚÏÛ×ÝÑ×ÃÙÞÜÉßÜÀÚÃÅöÏÀÎÄÐêòûñì¶Txrf$sgkamkeb`/uc`|f5y8\\boysmvOOQ\rYuk)~jfl`frhom\"xnmqk8rt5Qobt~`{BB\\\u00005zxb1cfbmsmj||mJ^W_XLxZCzT_V\ne*(2a362=#=:,,etBA]G\u0014SSZW_SS[\u0011×íòäåèãëãñíí®Ìããæöþå»Ãíåÿ»÷ûôúÿéÊÄÄÈÓÍÃÃÎÚ¢¨¼þ©½±»·±¥¿¸ºõ¯¹º¦¼ï¥£â¸µ¢½Ð", 849, 14, 74));
            }
        } else {
            throw new C3625(0, C3727.m1052("@lfr0gsuykqvt;awthr!km,^k{GoK@G_UEEWe]QKZK\u0017\u0001-'3q&2>48>*075z 65)3`*,m\u001f*:\u0006.\n>\u0001\u0006\u001e\u0014\u0004\u0004\u0016$\u001c\u0010\n\u001b\nV0\u001c\u0016\u0002@\u0017\u0003\u000f\u0005\t\u000f\u001b\u0001\u0006\u0004K\u0011\u0007\u0004\u0018\u0002Q\u001b\u001d\\/:1+\u001c\u000b\u000e!+%\"nÂîäð²åñý÷ûýéóôö¹ãõöêð£éï®ÝÈÃÙîùüÓÙ×Ð ª¾ü«¿³¹µ³§½º¸÷­»¸¤¾í§¡à ·²Ò«ÕÑÊÆµ§×Ì°ÎÊÑÝ®¼Ì×L`j~<ksyusg}zx7m{xd~-ga SFMW`wr]WY^\u0012+\u0006\u0007\u001b\u001e\b\u001d\u001c\u0005\u0005&\u0002\u0010\u0004%\b\u0016\r\u001f\u0015\bS\u001f\u000f\u0000\u0014\u001c\u0017\\\\V\u001e;i$$8m=:01-10 \"i;\u0001\u001e\b\t\u0004\u000f\u0007\u000f\u001d\u0001\u0001B \u000f\u000f\n\u001a\u0012\tW/\u0001\t\u0013W\u001b\u0017\u0018\u0016\u0013\u0005n&(($?!//\"6eÚàÿéèåîæîüàà£òôâó÷þ¼ðÿà¸ñùçùòæ¿¾ÇØÜÕÜª¦®§½§¹¤®øáäÄÆÌÀÊÖËÅÅÏËÌÙÞËÉÚÎØÀÀÔÕÞÒÜïï¨àà¯ÉõöæîåããÇàèïñÿ÷üýé÷ÜâÒóåàüÂLvi~sxpxjvv5UDX)|rzh,iatng\"lj'CAL^TYY[}TBG[S]TW]MdXnI]ZHFJADPB\bJflx:myusua{|~1k}~bx+ag&B|qgmddZ|YONR^PUV@PAr^UmJ^YCMAJGSAV\fÃïåñ³äðüöúüèòõ÷¸âô÷ëñ¢èî¯ÊäëîùýÉÛÑÚÆÚÆÙÝöÚØÒÏÓßÑÂÔÖ¼¼¤ñ¥¢¤¥µ©¬¼ºÿª¸°°©®¨çª°§©­»èÄÎÚÏÛ×ÝÑ×ÃÙÞÜÉßÜÀÚÃÅöÏÀÎÄÐêòûñì¶Txrf$sgkamkeb`/uc`|f5y8\\boysmvOOQ\rYuk)~jfl`frhom\"xnmqk8rt5Qobt~`{BB\\\u00005zxb1cfbmsmj||mJ^W_XLxZCzT_V\ne*(2a362=#=:,,etBA]G\u0014SSZW_SS[\u0011×íòäåèãëãñíí®Ìããæöþå»Ãíåÿ»÷ûôúÿéÊÄÄÈÓÍÃÃÎÚ¢¨¼þ©½±»·±¥¿¸ºõ¯¹º¦¼ï¥£â¸µ¢½Ð", 863, 15, 110) + this.f3542 + C3727.m1052("@lfr0gsuykqvt;awthr!km,^k{GoK@G_UEEWe]QKZK\u0017\u0001-'3q&2>48>*075z 65)3`*,m\u001f*:\u0006.\n>\u0001\u0006\u001e\u0014\u0004\u0004\u0016$\u001c\u0010\n\u001b\nV0\u001c\u0016\u0002@\u0017\u0003\u000f\u0005\t\u000f\u001b\u0001\u0006\u0004K\u0011\u0007\u0004\u0018\u0002Q\u001b\u001d\\/:1+\u001c\u000b\u000e!+%\"nÂîäð²åñý÷ûýéóôö¹ãõöêð£éï®ÝÈÃÙîùüÓÙ×Ð ª¾ü«¿³¹µ³§½º¸÷­»¸¤¾í§¡à ·²Ò«ÕÑÊÆµ§×Ì°ÎÊÑÝ®¼Ì×L`j~<ksyusg}zx7m{xd~-ga SFMW`wr]WY^\u0012+\u0006\u0007\u001b\u001e\b\u001d\u001c\u0005\u0005&\u0002\u0010\u0004%\b\u0016\r\u001f\u0015\bS\u001f\u000f\u0000\u0014\u001c\u0017\\\\V\u001e;i$$8m=:01-10 \"i;\u0001\u001e\b\t\u0004\u000f\u0007\u000f\u001d\u0001\u0001B \u000f\u000f\n\u001a\u0012\tW/\u0001\t\u0013W\u001b\u0017\u0018\u0016\u0013\u0005n&(($?!//\"6eÚàÿéèåîæîüàà£òôâó÷þ¼ðÿà¸ñùçùòæ¿¾ÇØÜÕÜª¦®§½§¹¤®øáäÄÆÌÀÊÖËÅÅÏËÌÙÞËÉÚÎØÀÀÔÕÞÒÜïï¨àà¯ÉõöæîåããÇàèïñÿ÷üýé÷ÜâÒóåàüÂLvi~sxpxjvv5UDX)|rzh,iatng\"lj'CAL^TYY[}TBG[S]TW]MdXnI]ZHFJADPB\bJflx:myusua{|~1k}~bx+ag&B|qgmddZ|YONR^PUV@PAr^UmJ^YCMAJGSAV\fÃïåñ³äðüöúüèòõ÷¸âô÷ëñ¢èî¯ÊäëîùýÉÛÑÚÆÚÆÙÝöÚØÒÏÓßÑÂÔÖ¼¼¤ñ¥¢¤¥µ©¬¼ºÿª¸°°©®¨çª°§©­»èÄÎÚÏÛ×ÝÑ×ÃÙÞÜÉßÜÀÚÃÅöÏÀÎÄÐêòûñì¶Txrf$sgkamkeb`/uc`|f5y8\\boysmvOOQ\rYuk)~jfl`frhom\"xnmqk8rt5Qobt~`{BB\\\u00005zxb1cfbmsmj||mJ^W_XLxZCzT_V\ne*(2a362=#=:,,etBA]G\u0014SSZW_SS[\u0011×íòäåèãëãñíí®Ìããæöþå»Ãíåÿ»÷ûôúÿéÊÄÄÈÓÍÃÃÎÚ¢¨¼þ©½±»·±¥¿¸ºõ¯¹º¦¼ï¥£â¸µ¢½Ð", 878, 15, 36));
        }
        C3707 r02 = new C3707();
        if (i10 != 0) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C3796.m1319(byteArrayOutputStream2, i10, byteArrayOutputStream.size());
                byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
                if (r02.f933 != 0) {
                    byteArrayOutputStream2.write(new byte[2]);
                }
                r02.f934 = byteArrayOutputStream2.toByteArray();
            } catch (IOException e12) {
                throw new C3625((Throwable) e12, C3625.m589(e12));
            }
        } else {
            r02.f934 = byteArrayOutputStream.toByteArray();
            r02.f933 = 0;
        }
        r12.m1336(r02);
    }
}
