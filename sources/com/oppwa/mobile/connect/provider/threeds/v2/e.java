package com.oppwa.mobile.connect.provider.threeds.v2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import qE.C14944d;

class e implements C14944d {

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, String> f122126c;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f122127a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f122128b = new LinkedList();

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f122126c = hashMap;
        hashMap.put("01", "[Tampered] not installed from trusted store");
        hashMap.put("02", "[Tampered] internal error to get store");
        hashMap.put("03", "[Tampered] invalid appSignature");
        hashMap.put("04", "[Tampered] has suspicious app installed");
        hashMap.put("05", "[Root] has suspicious files");
        hashMap.put("06", "[Root] has suspicious apk");
        hashMap.put("07", "[Root] has root permission");
        hashMap.put("08", "[Root] has root tag");
        hashMap.put("09", "[Root] is being hooked");
        hashMap.put("10", "[Debug] Debugger attached");
    }

    e() {
    }

    public void a() {
        this.f122127a.clear();
        this.f122128b.clear();
    }

    public List<String> b() {
        return this.f122128b;
    }

    public List<String> c() {
        return this.f122127a;
    }

    public void fireDataPacketIn(byte[] bArr) {
    }

    public void fireDataPacketOut(byte[] bArr) {
    }

    public void fireLog(int i10, String str, String str2) {
        if ("CRes".equals(str2)) {
            List<String> list = this.f122128b;
            list.add(str2 + " - " + str);
        } else if ("SW".equals(str2)) {
            this.f122127a.add(String.format("%s - %s (%s)", new Object[]{str2, str, a(str)}));
        }
    }

    public void fireSSLServerAuthentication(byte[] bArr, String str, String str2, String str3, boolean[] zArr) {
    }

    public void fireSSLStatus(String str) {
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        String str2 = f122126c.get(str);
        return str2 != null ? str2 : "unknown description";
    }
}
