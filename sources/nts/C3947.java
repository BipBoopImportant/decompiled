package nts;

/* renamed from: nts.ᙻ  reason: contains not printable characters */
public class C3947 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C4010 f2265 = new C4010(160);

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C4123 f2266 = new C4123();

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C4114 f2267 = null;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public C3646 f2268;

    public C3947() {
        this.f3542 = 48;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2131(C3796 r42) {
        C3796 r02 = new C3796();
        r02.m1341(C3796.m1318(this.f2266.f1400), 6);
        C4010 r12 = this.f2265;
        if (r12.f3537) {
            r12.m2494(r02);
        }
        r02.f1337 = this.f3542;
        r42.m1336(r02.m1349());
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2132(byte[] bArr, int i10) {
        C4123 r02 = this.f2266;
        if (!r02.f3546) {
            i10 = r02.m3270(bArr, i10);
            if (!this.f2266.f3546) {
                return i10;
            }
        }
        C4123 r03 = this.f2266;
        int i11 = r03.f3547 + r03.f3539;
        if (this.f3540) {
            int i12 = i10 + 1;
            if (i12 >= bArr.length) {
                return i10;
            }
            if (this.f2267 == null && m3280(bArr, i10) == 0 && m3280(bArr, i12) == 0) {
                this.f2265.f3537 = false;
            }
        } else if (i11 >= this.f3539) {
            this.f2265.f3537 = false;
        }
        if (this.f2265.f3537) {
            if (this.f2267 == null) {
                if (this.f2266.f1400.equals(C4089.f3442)) {
                    this.f2267 = new C3880(this.f2268);
                } else if (this.f2266.f1400.equals(C4089.f3446)) {
                    this.f2267 = new C3915(this.f2268);
                } else if (this.f2266.f1400.equals(C4089.f3436)) {
                    this.f2267 = new C4090(this.f2268);
                } else if (this.f2266.f1400.equals(C4089.f3408)) {
                    this.f2267 = new C3946(this.f2268);
                } else if (this.f2266.f1400.equals(C4089.f3386)) {
                    this.f2267 = new C4087(this.f2268);
                } else if (this.f2266.f1400.equals(C4089.f3439)) {
                    this.f2267 = new C3578();
                } else if (this.f2266.f1400.equals(C4089.f3459)) {
                    this.f2267 = new C3808();
                } else if (this.f2266.f1400.equals(C4089.f3395)) {
                    this.f2267 = new C3905();
                } else if (this.f2266.f1400.equals(C4089.f3415)) {
                    this.f2267 = new C4033(this.f2268);
                } else {
                    throw new C3625((Throwable) null, 224, C3727.m1052("@lfr0gsuykqvt;awthr!km,^k{GoK@G_UEEWe]QKZK\u0017\u0001-'3q&2>48>*075z 65)3`*,m\u001f*:\u0006.\n>\u0001\u0006\u001e\u0014\u0004\u0004\u0016$\u001c\u0010\n\u001b\nV0\u001c\u0016\u0002@\u0017\u0003\u000f\u0005\t\u000f\u001b\u0001\u0006\u0004K\u0011\u0007\u0004\u0018\u0002Q\u001b\u001d\\/:1+\u001c\u000b\u000e!+%\"nÂîäð²åñý÷ûýéóôö¹ãõöêð£éï®ÝÈÃÙîùüÓÙ×Ð ª¾ü«¿³¹µ³§½º¸÷­»¸¤¾í§¡à ·²Ò«ÕÑÊÆµ§×Ì°ÎÊÑÝ®¼Ì×L`j~<ksyusg}zx7m{xd~-ga SFMW`wr]WY^\u0012+\u0006\u0007\u001b\u001e\b\u001d\u001c\u0005\u0005&\u0002\u0010\u0004%\b\u0016\r\u001f\u0015\bS\u001f\u000f\u0000\u0014\u001c\u0017\\\\V\u001e;i$$8m=:01-10 \"i;\u0001\u001e\b\t\u0004\u000f\u0007\u000f\u001d\u0001\u0001B \u000f\u000f\n\u001a\u0012\tW/\u0001\t\u0013W\u001b\u0017\u0018\u0016\u0013\u0005n&(($?!//\"6eÚàÿéèåîæîüàà£òôâó÷þ¼ðÿà¸ñùçùòæ¿¾ÇØÜÕÜª¦®§½§¹¤®øáäÄÆÌÀÊÖËÅÅÏËÌÙÞËÉÚÎØÀÀÔÕÞÒÜïï¨àà¯ÉõöæîåããÇàèïñÿ÷üýé÷ÜâÒóåàüÂLvi~sxpxjvv5UDX)|rzh,iatng\"lj'CAL^TYY[}TBG[S]TW]MdXnI]ZHFJADPB\bJflx:myusua{|~1k}~bx+ag&B|qgmddZ|YONR^PUV@PAr^UmJ^YCMAJGSAV\fÃïåñ³äðüöúüèòõ÷¸âô÷ëñ¢èî¯ÊäëîùýÉÛÑÚÆÚÆÙÝöÚØÒÏÓßÑÂÔÖ¼¼¤ñ¥¢¤¥µ©¬¼ºÿª¸°°©®¨çª°§©­»èÄÎÚÏÛ×ÝÑ×ÃÙÞÜÉßÜÀÚÃÅöÏÀÎÄÐêòûñì¶Txrf$sgkamkeb`/uc`|f5y8\\boysmvOOQ\rYuk)~jfl`frhom\"xnmqk8rt5Qobt~`{BB\\\u00005zxb1cfbmsmj||mJ^W_XLxZCzT_V\ne*(2a362=#=:,,etBA]G\u0014SSZW_SS[\u0011×íòäåèãëãñíí®Ìããæöþå»Ãíåÿ»÷ûôúÿéÊÄÄÈÓÍÃÃÎÚ¢¨¼þ©½±»·±¥¿¸ºõ¯¹º¦¼ï¥£â¸µ¢½Ð", 346, 44, 24) + this.f2266.f1400);
                }
            }
            C4010 r04 = this.f2265;
            if (!r04.f3546) {
                i10 = r04.m2493(bArr, i10, this.f2267);
                if (!this.f2265.f3546) {
                    return i10;
                }
            }
        }
        C4010 r05 = this.f2265;
        return (!r05.f3537 || r05.f3546) ? m3274(bArr, i10) : i10;
    }

    public C3947(C3646 r32) {
        this.f2268 = r32;
        this.f3542 = 48;
    }
}
