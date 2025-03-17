package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;

@FunctionalInterface
public interface TransactionResponseParser {
    void parse(String str, Transaction transaction);
}
