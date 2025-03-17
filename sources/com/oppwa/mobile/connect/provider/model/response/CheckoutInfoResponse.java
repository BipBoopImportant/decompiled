package com.oppwa.mobile.connect.provider.model.response;

import androidx.annotation.Keep;
import com.oppwa.mobile.connect.checkout.meta.CheckoutMsdkUi;

@Keep
public class CheckoutInfoResponse {
    private double amount;
    private String bankAccountCountry;
    private Config config;
    private String currency;
    private String endpoint;
    private String resourcePath;

    @Keep
    public static class Config {
        private BrandConfig brandConfig;
        private String[] klarnaMerchantIds;
        private MsdkConfig msdkConfig;
        private boolean redShieldDeviceIdInMsdkActive;
        private Registration[] registrations;
        private WorkflowSpecificConfig workflowSpecificConfig;

        @Keep
        public static class BrandConfig {
            private boolean activateBrands;
            private String[] brands;
            private boolean overrideShopBrands;

            public String[] getBrands() {
                return this.brands;
            }

            public boolean isActivateBrands() {
                return this.activateBrands;
            }

            public boolean isOverrideShopBrands() {
                return this.overrideShopBrands;
            }
        }

        @Keep
        public static class MsdkConfig {
            private String logLevel;

            /* renamed from: ui  reason: collision with root package name */
            private CheckoutMsdkUi f122025ui;

            public String getLogLevel() {
                return this.logLevel;
            }

            public CheckoutMsdkUi getUi() {
                return this.f122025ui;
            }
        }

        @Keep
        public static class Registration {
            private BankAccount bankAccount;
            private Card card;

            /* renamed from: id  reason: collision with root package name */
            private String f122026id;
            private String paymentBrand;
            private VirtualAccount virtualAccount;

            @Keep
            public static class BankAccount {
                private String country;
                private String holder;
                private String iban;
                private String number;

                public String getCountry() {
                    return this.country;
                }

                public String getHolder() {
                    return this.holder;
                }

                public String getIban() {
                    return this.iban;
                }

                public String getNumber() {
                    return this.number;
                }
            }

            @Keep
            public static class Card {
                private String bin;
                private String expiryMonth;
                private String expiryYear;
                private String holder;
                private String last4Digits;

                public String getBin() {
                    return this.bin;
                }

                public String getExpiryMonth() {
                    return this.expiryMonth;
                }

                public String getExpiryYear() {
                    return this.expiryYear;
                }

                public String getHolder() {
                    return this.holder;
                }

                public String getLast4Digits() {
                    return this.last4Digits;
                }
            }

            @Keep
            public static class VirtualAccount {
                private String accountId;
                private String holder;

                public String getAccountId() {
                    return this.accountId;
                }

                public String getHolder() {
                    return this.holder;
                }
            }

            public BankAccount getBankAccount() {
                return this.bankAccount;
            }

            public Card getCard() {
                return this.card;
            }

            public String getId() {
                return this.f122026id;
            }

            public String getPaymentBrand() {
                return this.paymentBrand;
            }

            public VirtualAccount getVirtualAccount() {
                return this.virtualAccount;
            }
        }

        @Keep
        public static class WorkflowSpecificConfig {
            private AffirmConfig affirmConfig;

            @Keep
            public static class AffirmConfig {
                private boolean active;
                private String publicKey;

                public String getPublicKey() {
                    return this.publicKey;
                }

                public boolean isActive() {
                    return this.active;
                }
            }

            public AffirmConfig getAffirmConfig() {
                return this.affirmConfig;
            }
        }

        public BrandConfig getBrandConfig() {
            return this.brandConfig;
        }

        public String[] getKlarnaMerchantIds() {
            return this.klarnaMerchantIds;
        }

        public MsdkConfig getMsdkConfig() {
            return this.msdkConfig;
        }

        public Registration[] getRegistrations() {
            return this.registrations;
        }

        public WorkflowSpecificConfig getWorkflowSpecificConfig() {
            return this.workflowSpecificConfig;
        }

        public boolean isRedShieldDeviceIdInMsdkActive() {
            return this.redShieldDeviceIdInMsdkActive;
        }
    }

    public double getAmount() {
        return this.amount;
    }

    public String getBankAccountCountry() {
        return this.bankAccountCountry;
    }

    public Config getConfig() {
        return this.config;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public String getResourcePath() {
        return this.resourcePath;
    }
}
