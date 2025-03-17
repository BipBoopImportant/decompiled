package nts;

/* renamed from: nts.о  reason: contains not printable characters */
public abstract class C3594 extends C3967 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public boolean f349 = false;

    /* renamed from: Е  reason: contains not printable characters */
    public byte[] f350;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public String f351;

    /* renamed from: ખ  reason: contains not printable characters */
    public byte[] f352;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int f353 = 0;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int f354 = 64;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public byte[] f355 = null;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public C3638 f356 = null;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public C3638 f357 = null;

    public C3594(String str, byte[] bArr) {
        m354(str);
        m357(str);
        m358(bArr);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m353() {
        this.f349 = false;
        this.f353 = 0;
        this.f356.m617();
        this.f357.m617();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m355(byte[] bArr, int i10, int i11) {
        if (!this.f349) {
            this.f356.m617();
            C3638 r12 = this.f356;
            byte[] bArr2 = this.f352;
            r12.m621(bArr2, 0, this.f354, bArr2, 0);
            this.f355 = new byte[this.f354];
            this.f349 = true;
        }
        int i12 = 0;
        while (i12 < i11) {
            int min = Math.min(this.f355.length - this.f353, i11 - i12);
            System.arraycopy(bArr, i10 + i12, this.f355, this.f353, min);
            int i13 = this.f353 + min;
            this.f353 = i13;
            i12 += min;
            byte[] bArr3 = this.f355;
            if (i13 == bArr3.length) {
                this.f356.m621(bArr3, 0, bArr3.length, bArr3, 0);
                this.f353 = 0;
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3638 m356(String str) {
        C4094 r02 = C3990.f2631;
        return C3618.f582.m563(str);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m357(String str) {
        this.f351 = str;
        this.f356 = m356(str);
        C3638 r22 = m356(this.f351);
        this.f357 = r22;
        this.f349 = false;
        C4094 r02 = C3990.f2631;
        int i10 = r22.f625;
        this.f625 = i10;
        this.f624 = new byte[(i10 / 8)];
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m358(byte[] bArr) {
        if (!this.f349) {
            if (bArr == null) {
                this.f2370 = new byte[0];
            } else if (bArr.length > this.f354) {
                this.f2370 = this.f356.m620(bArr);
            } else {
                this.f2370 = (byte[]) bArr.clone();
            }
            for (int i10 = 0; i10 < this.f354; i10++) {
                byte[] bArr2 = this.f352;
                this.f350[i10] = 0;
                bArr2[i10] = 0;
            }
            byte[] bArr3 = this.f2370;
            System.arraycopy(bArr3, 0, this.f352, 0, bArr3.length);
            byte[] bArr4 = this.f2370;
            System.arraycopy(bArr4, 0, this.f350, 0, bArr4.length);
            for (int i11 = 0; i11 < this.f354; i11++) {
                byte[] bArr5 = this.f352;
                bArr5[i11] = (byte) (bArr5[i11] ^ 54);
                byte[] bArr6 = this.f350;
                bArr6[i11] = (byte) (bArr6[i11] ^ 92);
            }
            return;
        }
        throw new C3738(C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 190, 38, 47));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m354(String str) {
        String r12 = C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 111, 4, 50);
        String str2 = C3823.f1540;
        if (str.equalsIgnoreCase(r12)) {
            this.f354 = 64;
        } else if (str.equalsIgnoreCase(C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 115, 6, 3))) {
            this.f354 = 64;
        } else if (str.equalsIgnoreCase(C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 121, 6, 25))) {
            this.f354 = 64;
        } else if (str.equalsIgnoreCase(C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 127, 6, 106))) {
            this.f354 = 128;
        } else if (str.equalsIgnoreCase(C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 133, 6, 19))) {
            this.f354 = 128;
        } else if (str.equalsIgnoreCase(C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 139, 3, 34))) {
            this.f354 = 64;
        } else if (str.equalsIgnoreCase(C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 142, 9, 51))) {
            this.f354 = 64;
        } else {
            throw new C3738(C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 151, 21, 127) + str + C3727.m1052("\u0002\u0006\t\n]YVUBXR#\u001e\u001a\u0015\u0016\u001f\u0017e{psd~t\u0006\t\u000eTP_\\KQ[)!#ko`ctnd\u0017\u0013\u001e]YVUBXR',.73<?)3)=:2DBC>\u0011\u000e\u0013\u0015P\u001b\u0013\u000e\u0014_\u001f\u0015\u001f\u0014\b\f\u0010\u000f\u000bA\b@Y\u000bBBZ\u000fSTRSKWRB\\\u0017\n\u0010\u001ak%?5G@G5/%WWU@ZP#/\"ÃÙÓ¦¥§çïæüæòýõ¶Ø×ÉÁØÃÃÛÒÕÓÒÊÖÓÃÝô×ÛÚÜÆÃÚÊ×ÞÃ×ÉÅÀËÃÒÈÆÀÊÃËÚõóòáý¼", 172, 18, 23));
        }
        int i10 = this.f354;
        this.f352 = new byte[i10];
        this.f350 = new byte[i10];
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m359() {
        this.f356.m623(this.f355, 0, this.f353);
        this.f353 = 0;
        C3638 r02 = this.f356;
        C4094 r12 = C3990.f2631;
        byte[] bArr = r02.f624;
        this.f357.m617();
        C3638 r42 = this.f357;
        byte[] bArr2 = this.f350;
        r42.m621(bArr2, 0, this.f354, bArr2, 0);
        this.f357.m623(bArr, 0, bArr.length);
        System.arraycopy(this.f357.f624, 0, this.f624, 0, this.f625 / 8);
        return this.f624;
    }
}
