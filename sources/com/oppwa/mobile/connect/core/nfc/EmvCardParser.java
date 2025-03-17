package com.oppwa.mobile.connect.core.nfc;

import android.content.Context;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.core.nfc.exception.EmvCardParserException;
import com.oppwa.mobile.connect.core.nfc.model.CardDetails;
import com.oppwa.mobile.connect.core.nfc.model.EmvFileInfo;
import com.oppwa.mobile.connect.core.nfc.model.EmvTag;
import com.oppwa.mobile.connect.core.nfc.model.apdu.CommandApdu;
import com.oppwa.mobile.connect.core.nfc.model.apdu.CommandFactory;
import com.oppwa.mobile.connect.core.nfc.model.apdu.ResponseApdu;
import com.oppwa.mobile.connect.utils.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class EmvCardParser {

    /* renamed from: a  reason: collision with root package name */
    private final Context f121566a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f121567a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.oppwa.mobile.connect.core.nfc.model.EmvTag[] r0 = com.oppwa.mobile.connect.core.nfc.model.EmvTag.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f121567a = r0
                com.oppwa.mobile.connect.core.nfc.model.EmvTag r1 = com.oppwa.mobile.connect.core.nfc.model.EmvTag.TERMINAL_TRANSACTION_QUALIFIERS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f121567a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.oppwa.mobile.connect.core.nfc.model.EmvTag r1 = com.oppwa.mobile.connect.core.nfc.model.EmvTag.UNPREDICTABLE_NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.core.nfc.EmvCardParser.a.<clinit>():void");
        }
    }

    public EmvCardParser(Context context) {
        this.f121566a = context;
    }

    private byte a(int i10) {
        return (byte) (((i10 << 3) >> 3) | 4);
    }

    private byte[] c(byte[] bArr) {
        return a(EmvTag.APPLICATION_FILE_LOCATOR, bArr);
    }

    private byte[] d(byte[] bArr) {
        byte[] a10 = a(EmvTag.APPLICATION_IDENTIFIER, bArr);
        if (a10 == null || a10.length == 0) {
            Logger.info("NFCCardReader", "AID not found " + a.a(bArr));
        }
        return a10;
    }

    private byte[] f(byte[] bArr) {
        return a(EmvTag.PROCESSING_OPTIONS_DATA_OBJECT_LIST, bArr);
    }

    private byte[] g(byte[] bArr) {
        return a(EmvTag.TRACK_2_EQUIVALENT_DATA, bArr);
    }

    /* access modifiers changed from: protected */
    public CardDetails e(byte[] bArr) {
        String a10 = a.a(bArr);
        int indexOf = a10.indexOf(68);
        String str = null;
        if (indexOf <= 0) {
            return null;
        }
        String substring = a10.substring(0, indexOf);
        int i10 = indexOf + 3;
        String substring2 = i10 < a10.length() ? a10.substring(indexOf + 1, i10) : null;
        int i11 = indexOf + 5;
        if (i11 < a10.length()) {
            str = a10.substring(i10, i11);
        }
        return new CardDetails(substring, str, substring2);
    }

    public CardDetails parse(Tag tag) {
        IsoDep isoDep;
        CardDetails e10;
        try {
            isoDep = (IsoDep) Optional.ofNullable(IsoDep.get(tag)).orElseThrow(new b());
            isoDep.connect();
            ResponseApdu b10 = b(isoDep);
            byte[] bArr = null;
            byte[] d10 = b10.isSuccessful() ? d(b10.getData()) : null;
            ResponseApdu a10 = a(isoDep, f((d10 != null ? b(isoDep, d10) : a(isoDep)).getData()));
            if (a10.isSuccessful()) {
                byte[] g10 = g(a10.getData());
                if (g10 == null || (e10 = e(g10)) == null) {
                    bArr = c(a10.getData());
                } else {
                    isoDep.close();
                    return e10;
                }
            }
            CardDetails a11 = a(isoDep, a(bArr));
            isoDep.close();
            return a11;
        } catch (IOException e11) {
            throw new EmvCardParserException(e11.getMessage(), e11.getCause());
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ EmvCardParserException a() {
        return new EmvCardParserException("Failed to get an instance of IsoDep for the given tag.");
    }

    private ResponseApdu b(IsoDep isoDep) {
        ResponseApdu a10 = a(isoDep, CommandFactory.createSelectCommand("2PAY.SYS.DDF01".getBytes()));
        if (!a10.isSuccessful()) {
            Logger.info("NFCCardReader", "Failed to send select PPSE " + a.a(a10));
        }
        return a10;
    }

    private ResponseApdu a(IsoDep isoDep) {
        for (String a10 : this.f121566a.getResources().getStringArray(R.array.emv_aids_array)) {
            byte[] a11 = a.a(a10);
            if (a11 != null) {
                ResponseApdu a12 = a(isoDep, CommandFactory.createSelectCommand(a11));
                if (a12.isSuccessful()) {
                    return a12;
                }
            }
        }
        throw new EmvCardParserException("Failed to select AID using predefined list");
    }

    private ResponseApdu b(IsoDep isoDep, byte[] bArr) {
        ResponseApdu a10 = a(isoDep, CommandFactory.createSelectCommand(bArr));
        if (a10.isSuccessful()) {
            return a10;
        }
        String a11 = a.a(a10);
        throw new EmvCardParserException(a11, "Failed to send select AID " + a.a(bArr));
    }

    private ResponseApdu a(IsoDep isoDep, byte[] bArr) {
        byte[] bArr2;
        if (bArr != null) {
            bArr2 = b(bArr);
        } else {
            bArr2 = new byte[0];
        }
        return a(isoDep, CommandFactory.createGetProcessingOptionsCommand(bArr2));
    }

    private CardDetails a(IsoDep isoDep, List<EmvFileInfo> list) {
        byte[] bArr = null;
        byte[] bArr2 = null;
        for (CommandApdu a10 : a(list)) {
            ResponseApdu a11 = a(isoDep, a10);
            if (a11.isSuccessful()) {
                byte[] data = a11.getData();
                if (bArr == null) {
                    bArr = a(EmvTag.PRIMARY_ACCOUNT_NUMBER, data);
                }
                if (bArr2 == null) {
                    bArr2 = a(EmvTag.APPLICATION_EXPIRATION_DATE, data);
                }
                if (!(bArr == null || bArr2 == null)) {
                    return a(bArr, bArr2);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public byte[] b(byte[] bArr) {
        byte[] bArr2;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (byteArrayInputStream.available() > 0) {
            byte read = (byte) byteArrayInputStream.read();
            if (a.a(read)) {
                bArr2 = a(read, (byte) byteArrayInputStream.read(), byteArrayInputStream.read());
            } else {
                bArr2 = a(read, (byte) 0, byteArrayInputStream.read());
            }
            byteArrayOutputStream.write(bArr2, 0, bArr2.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private CardDetails a(byte[] bArr, byte[] bArr2) {
        String str;
        String str2;
        if (bArr2.length >= 2) {
            str2 = a.b(bArr2[0]);
            str = a.b(bArr2[1]);
        } else {
            str2 = null;
            str = null;
        }
        return new CardDetails(a.a(bArr), str, str2);
    }

    /* access modifiers changed from: protected */
    public List<EmvFileInfo> a(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (byteArrayInputStream.available() >= 4) {
                byte a10 = a(byteArrayInputStream.read());
                byte read = (byte) byteArrayInputStream.read();
                byte read2 = (byte) byteArrayInputStream.read();
                if (byteArrayInputStream.skip(1) == 1) {
                    linkedList.add(new EmvFileInfo(a10, read, read2));
                }
            }
        } else {
            for (int i10 = 1; i10 <= 30; i10++) {
                linkedList.add(new EmvFileInfo(a(i10), 1, 8));
            }
        }
        return linkedList;
    }

    /* access modifiers changed from: protected */
    public List<CommandApdu> a(List<EmvFileInfo> list) {
        LinkedList linkedList = new LinkedList();
        for (EmvFileInfo next : list) {
            for (int firstRecord = next.getFirstRecord(); firstRecord <= next.getLastRecord(); firstRecord++) {
                linkedList.add(CommandFactory.createReadRecordCommand((byte) firstRecord, next.getSfi()));
            }
        }
        return linkedList;
    }

    private ResponseApdu a(IsoDep isoDep, CommandApdu commandApdu) {
        return new ResponseApdu(isoDep.transceive(commandApdu.getBytes()));
    }

    private byte[] a(byte b10, byte b11, int i10) {
        EmvTag valueOf = EmvTag.valueOf(b10, b11);
        if (valueOf != null) {
            int i11 = a.f121567a[valueOf.ordinal()];
            if (i11 == 1) {
                return new byte[]{40, 0, 0, 0};
            }
            if (i11 == 2) {
                return a.a(i10);
            }
        }
        return new byte[i10];
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(com.oppwa.mobile.connect.core.nfc.model.EmvTag r5, byte[] r6) {
        /*
            r4 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r6)
        L_0x0005:
            int r6 = r0.available()
            if (r6 <= 0) goto L_0x005c
            int r6 = r0.read()
            byte r6 = (byte) r6
            r1 = 0
            r0.mark(r1)
            byte r2 = r5.getB2()
            r3 = -1
            if (r2 != 0) goto L_0x0026
            byte r2 = r5.getB1()
            if (r6 != r2) goto L_0x0042
            int r6 = r0.read()
            goto L_0x0043
        L_0x0026:
            boolean r2 = com.oppwa.mobile.connect.core.nfc.a.a((byte) r6)
            if (r2 == 0) goto L_0x0042
            byte r2 = r5.getB1()
            if (r6 != r2) goto L_0x0042
            int r6 = r0.read()
            byte r6 = (byte) r6
            byte r2 = r5.getB2()
            if (r6 != r2) goto L_0x0042
            int r6 = r0.read()
            goto L_0x0043
        L_0x0042:
            r6 = r3
        L_0x0043:
            boolean r2 = com.oppwa.mobile.connect.core.nfc.a.a(r6, r5)
            if (r2 == 0) goto L_0x0058
            int r2 = r0.available()
            if (r2 < r6) goto L_0x0058
            byte[] r2 = new byte[r6]
            int r6 = r0.read(r2, r1, r6)
            if (r6 == r3) goto L_0x0058
            return r2
        L_0x0058:
            r0.reset()
            goto L_0x0005
        L_0x005c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.core.nfc.EmvCardParser.a(com.oppwa.mobile.connect.core.nfc.model.EmvTag, byte[]):byte[]");
    }
}
