package com.oppwa.mobile.connect.core.nfc.exception;

public class EmvCardParserException extends Exception {
    public EmvCardParserException(String str, String str2) {
        super(str + " " + str2);
    }

    public EmvCardParserException(String str) {
        super(str);
    }

    public EmvCardParserException(String str, Throwable th2) {
        super(str, th2);
    }
}
