package com.oppwa.mobile.connect.core.nfc.model.apdu;

import com.oppwa.mobile.connect.core.nfc.model.apdu.CommandApdu;

public class CommandFactory {
    public static CommandApdu createGetProcessingOptionsCommand(byte[] bArr) {
        int length = bArr.length + 2;
        byte[] bArr2 = new byte[length];
        bArr2[0] = -125;
        bArr2[1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return new CommandApdu.Builder().setCla(128).setIns(168).setP1(0).setP2(0).setLc(length).setData(bArr2).build();
    }

    public static CommandApdu createReadRecordCommand(byte b10, byte b11) {
        return new CommandApdu.Builder().setCla(0).setIns(178).setP1(b10).setP2(b11).setLc(0).build();
    }

    public static CommandApdu createSelectCommand(byte[] bArr) {
        return new CommandApdu.Builder().setCla(0).setIns(164).setP1(4).setP2(0).setLc(bArr.length).setData(bArr).build();
    }
}
