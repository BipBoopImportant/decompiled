package nts;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

/* renamed from: nts.ᒧ  reason: contains not printable characters */
public class C3891 implements C3904 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int f1779;

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1964(DatagramSocket datagramSocket, int i10) {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1969(DatagramSocket datagramSocket, int i10) {
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1965(Socket socket, int i10) {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1970(DatagramSocket datagramSocket, InetAddress inetAddress, int i10) {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1971(Socket socket, int i10) {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m1972(DatagramSocket datagramSocket) {
        return false;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public DatagramSocket m1967(InetAddress inetAddress, int i10, boolean z10) {
        return new DatagramSocket(i10, inetAddress);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1968(DatagramPacket datagramPacket, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        datagramPacket.setData(bArr2);
        datagramPacket.setLength(i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public RandomAccessFile m1966(String str, long j10) {
        boolean z10;
        File file = new File(str);
        if (j10 == 0) {
            if (file.exists()) {
                file.delete();
            }
            return new RandomAccessFile(str, "rw");
        }
        if (file.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            int i10 = f1779;
            f1779 = i10 + 1;
            sb2.append(i10);
            File file2 = new File(sb2.toString());
            file.renameTo(file2);
            FileInputStream fileInputStream = new FileInputStream(file2);
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            byte[] bArr = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];
            do {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                long j11 = (long) read;
                z10 = j11 >= j10;
                if (z10) {
                    j11 = j10;
                }
                fileOutputStream.write(bArr, 0, (int) j11);
            } while (!z10);
            fileOutputStream.close();
            fileInputStream.close();
            file2.delete();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        randomAccessFile.seek(j10);
        return randomAccessFile;
    }
}
