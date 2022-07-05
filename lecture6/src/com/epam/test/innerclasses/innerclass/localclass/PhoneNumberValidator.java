package com.epam.test.innerclasses.innerclass.localclass;

public class PhoneNumberValidator {
    private final String polishCountryCode = "+48";
    private static String phoneNumberRegex = "[^0-9]";

    public void validatePhoneNumber(String number) {
        int i = 0;
        class PhoneNumber {
            private String phoneNumber;

            public PhoneNumber() {
                this.phoneNumber = polishCountryCode + number + i;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                if (phoneNumberRegex.contains(phoneNumber)) {
                    System.out.println();
                }
                this.phoneNumber = phoneNumber;
            }
        }    //...some code
    }

    {
        class PhoneNumber {
            private String phoneNumber;

            public PhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
        }
    }

    public void validatePhoneNumber1(String phoneNumber) {
        for (int i = 0; i < 10; i++) {
            class PhoneNumber {
                private String phoneNumber;

                public PhoneNumber(String phoneNumber) {
                    this.phoneNumber = phoneNumber;
                }
            }
//            ...some logic
        }
//        ... code for validation
    }

//
//    public PhoneNumber generatePhoneNumber() {
//
//    }
}
