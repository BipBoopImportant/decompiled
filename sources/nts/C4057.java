package nts;

import java.io.RandomAccessFile;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

/* renamed from: nts.ᵛ  reason: contains not printable characters */
public class C4057 implements C3904 {
    /* renamed from: ગ  reason: contains not printable characters */
    public void m2833(Socket socket, int i10) {
        if (i10 > 2048) {
            socket.setSendBufferSize(i10);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m2840(DatagramSocket datagramSocket) {
        return false;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m2832(DatagramSocket datagramSocket, int i10) {
        if (i10 > 2048) {
            datagramSocket.setSendBufferSize(i10);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2839(Socket socket, int i10) {
        if (i10 > 2048) {
            socket.setReceiveBufferSize(i10);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public DatagramSocket m2835(InetAddress inetAddress, int i10, boolean z10) {
        return new DatagramSocket(i10, inetAddress);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2838(DatagramSocket datagramSocket, InetAddress inetAddress, int i10) {
        datagramSocket.connect(inetAddress, i10);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2837(DatagramSocket datagramSocket, int i10) {
        if (i10 > 2048) {
            datagramSocket.setReceiveBufferSize(i10);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2836(DatagramPacket datagramPacket, byte[] bArr, int i10, int i11) {
        datagramPacket.setData(bArr, i10, i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public RandomAccessFile m2834(String str, long j10) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        randomAccessFile.seek(j10);
        randomAccessFile.setLength(j10);
        return randomAccessFile;
    }
}
