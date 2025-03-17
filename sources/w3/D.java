package w3;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import t3.C5950a;

public final class D extends C6218b {

    /* renamed from: e  reason: collision with root package name */
    private final int f31398e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f31399f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f31400g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f31401h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f31402i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f31403j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f31404k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f31405l;

    /* renamed from: m  reason: collision with root package name */
    private int f31406m;

    public static final class a extends h {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public D() {
        this(2000);
    }

    public long b(k kVar) {
        Uri uri = kVar.f31433a;
        this.f31401h = uri;
        String str = (String) C5950a.e(uri.getHost());
        int port = this.f31401h.getPort();
        r(kVar);
        try {
            this.f31404k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f31404k, port);
            if (this.f31404k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f31403j = multicastSocket;
                multicastSocket.joinGroup(this.f31404k);
                this.f31402i = this.f31403j;
            } else {
                this.f31402i = new DatagramSocket(inetSocketAddress);
            }
            this.f31402i.setSoTimeout(this.f31398e);
            this.f31405l = true;
            s(kVar);
            return -1;
        } catch (SecurityException e10) {
            throw new a(e10, 2006);
        } catch (IOException e11) {
            throw new a(e11, 2001);
        }
    }

    public int c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f31406m == 0) {
            try {
                ((DatagramSocket) C5950a.e(this.f31402i)).receive(this.f31400g);
                int length = this.f31400g.getLength();
                this.f31406m = length;
                p(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f31400g.getLength();
        int i12 = this.f31406m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f31399f, length2 - i12, bArr, i10, min);
        this.f31406m -= min;
        return min;
    }

    public void close() {
        this.f31401h = null;
        MulticastSocket multicastSocket = this.f31403j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C5950a.e(this.f31404k));
            } catch (IOException unused) {
            }
            this.f31403j = null;
        }
        DatagramSocket datagramSocket = this.f31402i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f31402i = null;
        }
        this.f31404k = null;
        this.f31406m = 0;
        if (this.f31405l) {
            this.f31405l = false;
            q();
        }
    }

    public Uri n() {
        return this.f31401h;
    }

    public D(int i10) {
        this(i10, 8000);
    }

    public D(int i10, int i11) {
        super(true);
        this.f31398e = i11;
        byte[] bArr = new byte[i10];
        this.f31399f = bArr;
        this.f31400g = new DatagramPacket(bArr, 0, i10);
    }
}
