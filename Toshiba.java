/**
 *
 * @author 4715
 */
public class Toshiba implements Laptop{
    private int volume;
    boolean is_Power_On;

    public Toshiba() {
        // set volume awal
        this.volume = 50;
    }

    
    @Override
    public void powerOn() {
        is_Power_On = true;
        System.out.println("Laptop is ON");
        System.out.println("Toshiba Satellite");
        System.out.println("Windows 11");
    }

    @Override
    public void powerOff() {
        is_Power_On = false;
        System.out.println("Shutdown is proses");
    }

    @Override
    public void volumeUp() {
        if (is_Power_On) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume is FULL!!");
                System.out.println("Of " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume is : " + this.getVolume());
            }
        } else {
            System.out.println("Pliss Turn On Laptop!!");
        }
    }

    @Override
    public void volumeDown() {
        if (is_Power_On) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume is = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is : " + this.getVolume());
            }
        } else {
            System.out.println("Pliss Turn On Laptop!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
