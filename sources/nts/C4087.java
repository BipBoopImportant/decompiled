package nts;

/* renamed from: nts.ọ  reason: contains not printable characters */
public class C4087 extends C3837 {

    /* renamed from: и  reason: contains not printable characters */
    public int f3379;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3646 f3380;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public long f3381 = -2;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public long f3382 = 0;

    public C4087(C3646 r32) {
        this.f3542 = 4;
        this.f3380 = r32;
        this.f3379 = 0;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m3225(byte[] bArr, int i10) {
        if (this.f3546) {
            return i10;
        }
        C3968 r02 = new C3968(bArr, i10);
        if (this.f3381 == -2) {
            try {
                r02.m2256();
                this.f3381 = r02.m2255();
            } catch (Exception unused) {
                return i10;
            }
        }
        if (this.f3381 == -1) {
            while (true) {
                int i11 = r02.f2373;
                int i12 = r02.f2371;
                if (i11 - i12 >= 2) {
                    byte[] bArr2 = r02.f2372;
                    if (bArr2[i12] == 0 && bArr2[i12 + 1] == 0) {
                        this.f3546 = true;
                        return i12 + 2;
                    }
                }
                try {
                    byte[] r82 = r02.m2258();
                    this.f3379 += r82.length;
                    this.f3380.m644(r82, 0, r82.length);
                } catch (Exception unused2) {
                    return i12;
                }
            }
        } else {
            while (this.f3382 < this.f3381) {
                try {
                    i10 = r02.f2371;
                    byte[] r83 = r02.m2258();
                    this.f3382 += (long) (r02.f2371 - i10);
                    this.f3379 += r83.length;
                    this.f3380.m644(r83, 0, r83.length);
                } catch (Exception unused3) {
                    return i10;
                }
            }
            this.f3546 = true;
            return r02.f2371;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3226(C3796 r52) {
        throw new C3625((Throwable) null, 702, C3727.m1052("@lfr0gsuykqvt;awthr!km,^k{GoK@G_UEEWe]QKZK\u0017\u0001-'3q&2>48>*075z 65)3`*,m\u001f*:\u0006.\n>\u0001\u0006\u001e\u0014\u0004\u0004\u0016$\u001c\u0010\n\u001b\nV0\u001c\u0016\u0002@\u0017\u0003\u000f\u0005\t\u000f\u001b\u0001\u0006\u0004K\u0011\u0007\u0004\u0018\u0002Q\u001b\u001d\\/:1+\u001c\u000b\u000e!+%\"nÂîäð²åñý÷ûýéóôö¹ãõöêð£éï®ÝÈÃÙîùüÓÙ×Ð ª¾ü«¿³¹µ³§½º¸÷­»¸¤¾í§¡à ·²Ò«ÕÑÊÆµ§×Ì°ÎÊÑÝ®¼Ì×L`j~<ksyusg}zx7m{xd~-ga SFMW`wr]WY^\u0012+\u0006\u0007\u001b\u001e\b\u001d\u001c\u0005\u0005&\u0002\u0010\u0004%\b\u0016\r\u001f\u0015\bS\u001f\u000f\u0000\u0014\u001c\u0017\\\\V\u001e;i$$8m=:01-10 \"i;\u0001\u001e\b\t\u0004\u000f\u0007\u000f\u001d\u0001\u0001B \u000f\u000f\n\u001a\u0012\tW/\u0001\t\u0013W\u001b\u0017\u0018\u0016\u0013\u0005n&(($?!//\"6eÚàÿéèåîæîüàà£òôâó÷þ¼ðÿà¸ñùçùòæ¿¾ÇØÜÕÜª¦®§½§¹¤®øáäÄÆÌÀÊÖËÅÅÏËÌÙÞËÉÚÎØÀÀÔÕÞÒÜïï¨àà¯ÉõöæîåããÇàèïñÿ÷üýé÷ÜâÒóåàüÂLvi~sxpxjvv5UDX)|rzh,iatng\"lj'CAL^TYY[}TBG[S]TW]MdXnI]ZHFJADPB\bJflx:myusua{|~1k}~bx+ag&B|qgmddZ|YONR^PUV@PAr^UmJ^YCMAJGSAV\fÃïåñ³äðüöúüèòõ÷¸âô÷ëñ¢èî¯ÊäëîùýÉÛÑÚÆÚÆÙÝöÚØÒÏÓßÑÂÔÖ¼¼¤ñ¥¢¤¥µ©¬¼ºÿª¸°°©®¨çª°§©­»èÄÎÚÏÛ×ÝÑ×ÃÙÞÜÉßÜÀÚÃÅöÏÀÎÄÐêòûñì¶Txrf$sgkamkeb`/uc`|f5y8\\boysmvOOQ\rYuk)~jfl`frhom\"xnmqk8rt5Qobt~`{BB\\\u00005zxb1cfbmsmj||mJ^W_XLxZCzT_V\ne*(2a362=#=:,,etBA]G\u0014SSZW_SS[\u0011×íòäåèãëãñíí®Ìããæöþå»Ãíåÿ»÷ûôúÿéÊÄÄÈÓÍÃÃÎÚ¢¨¼þ©½±»·±¥¿¸ºõ¯¹º¦¼ï¥£â¸µ¢½Ð", 298, 48, 114));
    }
}
