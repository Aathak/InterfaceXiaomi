public interface Phone { //tanda - pada diagram petani kode berarti private
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    void PowerOn();
    void PowerOff();
    void VolumeUp();
    void VolumeDown();
}
