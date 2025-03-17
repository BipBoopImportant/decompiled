package nts;

/* renamed from: nts.ݣ  reason: contains not printable characters */
public class C3662 extends C4114 {

    /* renamed from: и  reason: contains not printable characters */
    public C3954 f770 = null;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public C3605 f771 = null;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public C3874 f772 = new C3874(0);

    /* renamed from: ᜇ  reason: contains not printable characters */
    public boolean f773 = false;

    /* renamed from: ϴ  reason: contains not printable characters */
    public int m713(byte[] bArr, int i10) {
        int i11;
        if (this.f3546) {
            return i10;
        }
        C3605 r02 = this.f771;
        if (r02 != null && r02.f3546) {
            this.f771 = null;
        }
        C3954 r03 = this.f770;
        if (r03 != null && r03.f3546) {
            this.f770 = null;
        }
        if (!this.f773) {
            if (i10 >= bArr.length) {
                this.f772.m1921(bArr, i10, i10);
                return i10;
            }
            byte b10 = bArr[i10];
            if ((b10 & 255) == 160) {
                this.f770 = new C3954();
                this.f773 = true;
            } else if ((b10 & 255) == 48) {
                this.f771 = new C3605();
                this.f773 = true;
            } else {
                throw new C3625((Throwable) null, 222, C3727.m1052("@lfr0gsuykqvt;awthr!km,^k{GoK@G_UEEWe]QKZK\u0017\u0001-'3q&2>48>*075z 65)3`*,m\u001f*:\u0006.\n>\u0001\u0006\u001e\u0014\u0004\u0004\u0016$\u001c\u0010\n\u001b\nV0\u001c\u0016\u0002@\u0017\u0003\u000f\u0005\t\u000f\u001b\u0001\u0006\u0004K\u0011\u0007\u0004\u0018\u0002Q\u001b\u001d\\/:1+\u001c\u000b\u000e!+%\"nÂîäð²åñý÷ûýéóôö¹ãõöêð£éï®ÝÈÃÙîùüÓÙ×Ð ª¾ü«¿³¹µ³§½º¸÷­»¸¤¾í§¡à ·²Ò«ÕÑÊÆµ§×Ì°ÎÊÑÝ®¼Ì×L`j~<ksyusg}zx7m{xd~-ga SFMW`wr]WY^\u0012+\u0006\u0007\u001b\u001e\b\u001d\u001c\u0005\u0005&\u0002\u0010\u0004%\b\u0016\r\u001f\u0015\bS\u001f\u000f\u0000\u0014\u001c\u0017\\\\V\u001e;i$$8m=:01-10 \"i;\u0001\u001e\b\t\u0004\u000f\u0007\u000f\u001d\u0001\u0001B \u000f\u000f\n\u001a\u0012\tW/\u0001\t\u0013W\u001b\u0017\u0018\u0016\u0013\u0005n&(($?!//\"6eÚàÿéèåîæîüàà£òôâó÷þ¼ðÿà¸ñùçùòæ¿¾ÇØÜÕÜª¦®§½§¹¤®øáäÄÆÌÀÊÖËÅÅÏËÌÙÞËÉÚÎØÀÀÔÕÞÒÜïï¨àà¯ÉõöæîåããÇàèïñÿ÷üýé÷ÜâÒóåàüÂLvi~sxpxjvv5UDX)|rzh,iatng\"lj'CAL^TYY[}TBG[S]TW]MdXnI]ZHFJADPB\bJflx:myusua{|~1k}~bx+ag&B|qgmddZ|YONR^PUV@PAr^UmJ^YCMAJGSAV\fÃïåñ³äðüöúüèòõ÷¸âô÷ëñ¢èî¯ÊäëîùýÉÛÑÚÆÚÆÙÝöÚØÒÏÓßÑÂÔÖ¼¼¤ñ¥¢¤¥µ©¬¼ºÿª¸°°©®¨çª°§©­»èÄÎÚÏÛ×ÝÑ×ÃÙÞÜÉßÜÀÚÃÅöÏÀÎÄÐêòûñì¶Txrf$sgkamkeb`/uc`|f5y8\\boysmvOOQ\rYuk)~jfl`frhom\"xnmqk8rt5Qobt~`{BB\\\u00005zxb1cfbmsmj||mJ^W_XLxZCzT_V\ne*(2a362=#=:,,etBA]G\u0014SSZW_SS[\u0011×íòäåèãëãñíí®Ìããæöþå»Ãíåÿ»÷ûôúÿéÊÄÄÈÓÍÃÃÎÚ¢¨¼þ©½±»·±¥¿¸ºõ¯¹º¦¼ï¥£â¸µ¢½Ð", 535, 64, 78));
            }
        }
        C3954 r04 = this.f770;
        if (r04 != null) {
            i11 = r04.m3270(bArr, i10);
            C3605 r12 = this.f771;
            this.f3547 = r12.f3547;
            this.f3539 = r12.f3539;
            this.f3546 = this.f770.f3546;
        } else {
            C3605 r05 = this.f771;
            if (r05 != null) {
                i11 = r05.m3270(bArr, i10);
                C3605 r13 = this.f771;
                this.f3547 = r13.f3547;
                this.f3539 = r13.f3539;
                this.f3546 = r13.f3546;
            } else {
                i11 = i10;
            }
        }
        this.f772.m1921(bArr, i10, i11);
        return i11;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m714() {
        if (this.f3546) {
            C3874 r02 = this.f772;
            if (r02.f1728 > 0) {
                return r02.m1923();
            }
        }
        return super.m3273();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m715(C3796 r52) {
        C3605 r02 = this.f771;
        if (r02 == null && this.f770 == null) {
            throw new C3625((Throwable) null, 226, C3727.m1052("@lfr0gsuykqvt;awthr!km,^k{GoK@G_UEEWe]QKZK\u0017\u0001-'3q&2>48>*075z 65)3`*,m\u001f*:\u0006.\n>\u0001\u0006\u001e\u0014\u0004\u0004\u0016$\u001c\u0010\n\u001b\nV0\u001c\u0016\u0002@\u0017\u0003\u000f\u0005\t\u000f\u001b\u0001\u0006\u0004K\u0011\u0007\u0004\u0018\u0002Q\u001b\u001d\\/:1+\u001c\u000b\u000e!+%\"nÂîäð²åñý÷ûýéóôö¹ãõöêð£éï®ÝÈÃÙîùüÓÙ×Ð ª¾ü«¿³¹µ³§½º¸÷­»¸¤¾í§¡à ·²Ò«ÕÑÊÆµ§×Ì°ÎÊÑÝ®¼Ì×L`j~<ksyusg}zx7m{xd~-ga SFMW`wr]WY^\u0012+\u0006\u0007\u001b\u001e\b\u001d\u001c\u0005\u0005&\u0002\u0010\u0004%\b\u0016\r\u001f\u0015\bS\u001f\u000f\u0000\u0014\u001c\u0017\\\\V\u001e;i$$8m=:01-10 \"i;\u0001\u001e\b\t\u0004\u000f\u0007\u000f\u001d\u0001\u0001B \u000f\u000f\n\u001a\u0012\tW/\u0001\t\u0013W\u001b\u0017\u0018\u0016\u0013\u0005n&(($?!//\"6eÚàÿéèåîæîüàà£òôâó÷þ¼ðÿà¸ñùçùòæ¿¾ÇØÜÕÜª¦®§½§¹¤®øáäÄÆÌÀÊÖËÅÅÏËÌÙÞËÉÚÎØÀÀÔÕÞÒÜïï¨àà¯ÉõöæîåããÇàèïñÿ÷üýé÷ÜâÒóåàüÂLvi~sxpxjvv5UDX)|rzh,iatng\"lj'CAL^TYY[}TBG[S]TW]MdXnI]ZHFJADPB\bJflx:myusua{|~1k}~bx+ag&B|qgmddZ|YONR^PUV@PAr^UmJ^YCMAJGSAV\fÃïåñ³äðüöúüèòõ÷¸âô÷ëñ¢èî¯ÊäëîùýÉÛÑÚÆÚÆÙÝöÚØÒÏÓßÑÂÔÖ¼¼¤ñ¥¢¤¥µ©¬¼ºÿª¸°°©®¨çª°§©­»èÄÎÚÏÛ×ÝÑ×ÃÙÞÜÉßÜÀÚÃÅöÏÀÎÄÐêòûñì¶Txrf$sgkamkeb`/uc`|f5y8\\boysmvOOQ\rYuk)~jfl`frhom\"xnmqk8rt5Qobt~`{BB\\\u00005zxb1cfbmsmj||mJ^W_XLxZCzT_V\ne*(2a362=#=:,,etBA]G\u0014SSZW_SS[\u0011×íòäåèãëãñíí®Ìããæöþå»Ãíåÿ»÷ûôúÿéÊÄÄÈÓÍÃÃÎÚ¢¨¼þ©½±»·±¥¿¸ºõ¯¹º¦¼ï¥£â¸µ¢½Ð", 464, 71, 61));
        } else if (r02 != null) {
            r02.m461(r52);
        } else {
            C3954 r03 = this.f770;
            if (r03 != null) {
                r03.m2193(r52);
            }
        }
    }
}
