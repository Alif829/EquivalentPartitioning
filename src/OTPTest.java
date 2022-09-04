import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OTPTest {

    @org.junit.jupiter.api.Test
    void otpValidator1() {
        OTP otp=new OTP(123456);
        String s=Integer.toString(otp.getOtp());
        assertTrue(s.length()==6);
    }

    @Test
    void validator2() {
        OTP otp=new OTP(12345);
        String s=Integer.toString(otp.getOtp());
        assertFalse(s.length()==6);
    }

    @Test
    void validator3() {
        OTP otp=new OTP(1234567);
        String s=Integer.toString(otp.getOtp());
        assertFalse(s.length()==6);
    }
}