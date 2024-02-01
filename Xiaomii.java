public class Xiaomii implements Phone{
    private int Volume;
    private boolean IsPowerOn;
    
    public Xiaomii(){
        this.Volume = 50;
    }
    
    @Override
    public void PowerOn(){
        IsPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di XIAOMI");
        System.out.println("Android version 29");
    }
    
    @Override
    public void PowerOff() {
        IsPowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    
    @Override
    public void VolumeUp(){
        if (IsPowerOn){
            if (this.Volume == MAX_VOLUME){
                System.out.println("Volume Full woy");
                System.out.println("sudah " + this.getVolume() + "%");
            }
            else{
                this.Volume += 10;
                System.out.println("Volume sekarang " + this.getVolume());
            }
        } else {
            System.out.println("Minimal nyalain");
        }
    }
    
    @Override
    public void VolumeDown() {
        if (IsPowerOn) {
            if (this.Volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.Volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    
    public int getVolume(){
        return this.Volume;
    }
}
