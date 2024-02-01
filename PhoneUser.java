public class PhoneUser {
    
    private Phone phone;
    
    public PhoneUser(Phone phone){
        this.phone = phone;
    }
    
    void TurnOnThePhone(){
        this.phone.PowerOn();
    }
    
    void TurnOffThePhone(){
        this.phone.PowerOff();
    }
    
    void MakePhoneLouder(){
        this.phone.VolumeUp();
    }
    
    void MakePhoneSilent(){
        this.phone.VolumeDown();
    }
}
