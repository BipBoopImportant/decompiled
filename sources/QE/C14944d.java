package qE;

/* renamed from: qE.d  reason: case insensitive filesystem */
public interface C14944d {
    void fireDataPacketIn(byte[] bArr);

    void fireDataPacketOut(byte[] bArr);

    void fireLog(int i10, String str, String str2);

    void fireSSLServerAuthentication(byte[] bArr, String str, String str2, String str3, boolean[] zArr);

    void fireSSLStatus(String str);
}
