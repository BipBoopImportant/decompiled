package nts;

import java.io.RandomAccessFile;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* renamed from: nts.ᭇ  reason: contains not printable characters */
public class C4020 extends C4057 implements C3904 {
    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m2597(DatagramSocket datagramSocket) {
        try {
            return datagramSocket.getReuseAddress();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public DatagramSocket m2596(InetAddress inetAddress, int i10, boolean z10) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
            datagramSocket.setReuseAddress(z10);
            datagramSocket.bind(new InetSocketAddress(inetAddress, i10));
            return datagramSocket;
        } catch (Throwable unused) {
            return new DatagramSocket(i10, inetAddress);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public RandomAccessFile m2595(String str, long j10) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        randomAccessFile.seek(j10);
        randomAccessFile.setLength(j10);
        return randomAccessFile;
    }
}
