public class OTP {
    private int otp;

    public OTP(int otp){
        this.otp=otp;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }
    public boolean otpValidator()
    {
        String s=Integer.toString(otp);
        if(s.length()==6)
        {
            return true;
        }
        else
            return false;
    }
}
