package nts;

/* renamed from: nts.ἆ  reason: contains not printable characters */
public class C4095 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f3481 = -1;

    /* renamed from: ગ  reason: contains not printable characters */
    public String f3482;

    /* renamed from: ഇ  reason: contains not printable characters */
    public String f3483;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean f3484 = false;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public String f3485;

    public C4095(String str, boolean z10) {
        int i10;
        String str2 = "";
        this.f3483 = str2;
        this.f3482 = str2;
        this.f3485 = str2;
        if (str != null && str.length() != 0) {
            int indexOf = str.indexOf("=");
            if (indexOf == -1) {
                this.f3484 = true;
                this.f3483 = str.trim();
            } else {
                this.f3483 = str.substring(0, indexOf).trim();
                if (indexOf < str.length() - 1) {
                    this.f3482 = str.substring(indexOf + 1).trim();
                }
                if (this.f3482.startsWith("\"")) {
                    int length = this.f3482.length();
                    this.f3482 = this.f3482.substring(1, this.f3482.charAt(length + -1) == '\"' ? length - 1 : length);
                    if (z10) {
                        StringBuffer stringBuffer = new StringBuffer();
                        int i11 = 0;
                        while (i11 < this.f3482.length()) {
                            if (this.f3482.charAt(i11) != '\\' || (i10 = i11 + 1) >= this.f3482.length()) {
                                stringBuffer.append(this.f3482.charAt(i11));
                            } else {
                                if (this.f3482.charAt(i10) == 'r') {
                                    stringBuffer.append(13);
                                } else if (this.f3482.charAt(i10) == 'n') {
                                    stringBuffer.append(10);
                                } else if (this.f3482.charAt(i10) == 't') {
                                    stringBuffer.append(9);
                                } else {
                                    stringBuffer.append(this.f3482.charAt(i10));
                                }
                                i11 = i10;
                            }
                            i11++;
                        }
                        this.f3482 = stringBuffer.toString();
                    }
                }
            }
            int indexOf2 = this.f3483.indexOf("[");
            if (indexOf2 != -1) {
                int indexOf3 = this.f3483.indexOf("]", indexOf2);
                indexOf3 = indexOf3 < 0 ? this.f3483.length() : indexOf3;
                if (indexOf3 != indexOf2) {
                    this.f3485 = this.f3483.substring(indexOf2 + 1, indexOf3).trim();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f3483.substring(0, indexOf2));
                sb2.append(indexOf3 != this.f3483.length() ? this.f3483.substring(indexOf3 + 1) : str2);
                this.f3483 = sb2.toString();
            }
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public boolean m3232() {
        String trim = this.f3482.toLowerCase().trim();
        if (trim.equals("1") || trim.equals(C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 0, 3, 98)) || trim.equals(C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 3, 4, 119))) {
            return true;
        }
        if (trim.equals("0") || trim.equals("no") || trim.equals(C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 7, 5, 38))) {
            return false;
        }
        throw new C3625((Throwable) null, 202, C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 12, 29, 16) + this.f3483 + C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 41, 4, 8) + this.f3482 + "]");
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public String m3233() {
        return this.f3482;
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public boolean m3234() {
        return this.f3484;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public String m3235() {
        return this.f3483;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m3236() {
        if (this.f3481 < 0) {
            try {
                this.f3481 = Integer.parseInt(this.f3485);
            } catch (Exception unused) {
            }
        }
        return this.f3481;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public String m3238() {
        return this.f3482;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m3239() {
        String trim = this.f3482.toLowerCase().trim();
        if (trim.equals("1") || trim.equals(C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 45, 3, 1)) || trim.equals(C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 48, 4, 71))) {
            return 1;
        }
        if (trim.equals("0") || trim.equals("no") || trim.equals(C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 52, 5, 58))) {
            return 0;
        }
        try {
            return trim.startsWith("0x") ? (int) C3823.m1633(trim.substring(2)) : Integer.parseInt(trim);
        } catch (Exception unused) {
            throw new C3625((Throwable) null, 202, C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 57, 29, 10) + this.f3483 + C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 86, 4, 58) + this.f3482 + "]");
        }
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public long m3240() {
        String trim = this.f3482.toLowerCase().trim();
        try {
            if (!trim.startsWith("0x")) {
                return Long.parseLong(trim);
            }
            String substring = trim.substring(2);
            String str = C3823.f1540;
            return Long.parseLong(substring, 16);
        } catch (Exception unused) {
            throw new C3625((Throwable) null, 202, C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 90, 26, 53) + this.f3483 + C3727.m1052("\u0018\u0005\u0010\u0004\u0003\u0007\u0016BDJTEDrqmw$wg{{bdj,ma~|vs{4awum~:?\u0007\u001e\u0007}VK^\u0007\u0000\u0004\u0015mke{jk]^BX\u000bXHTTMKE\u0003IOJZ[XH\u001bNXZBQ\u0015\u0010JSJ00\u0006\u0005\u0019\u0003P\u0003\u0013\u000f\u000f\u0016\u0010\u001eX\u0017\u0015\u000b\u0003G\u0010\u0000\f\u0016\u0007MNZCZ ", 116, 4, 8) + this.f3482 + "]");
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m3237(String str) {
        String str2 = this.f3483;
        String str3 = C3823.f1540;
        return str2.equalsIgnoreCase(str);
    }
}
