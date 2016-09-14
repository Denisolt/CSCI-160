// The purpose of this class is to model a television
//Denisolt Shakhbulatov 10.22.2015
/* ____________________________________________
+                  Television                 +
+_____________________________________________+
+             -MANUFACTURER: String           +
+               -SCREEN_SIZE: int             +
+               -powerOn: boolean             +
+                 -channel: int               +
+                 -volume: int                +
+_____________________________________________+
+   +Television(brand: String, size: int):    + 
+    +setChannel (station: int): void         +
+            +power( ): void                  +
+        +increaseVolume( ): void             +
+        +decreaseVolume( ): void             +
+        +getChannel( ): int                  +
+         +getVolume( ): int                  + 
+      +getManufacturer( ): String            +
+       +getScreenSize( ): int                +
_______________________________________________
 */
public class Television
{
    private String manufacturer;
    private int screen_size;
    private boolean powerOn;
    private int channel;
    private int volume;
    
    public Television( String brand, int size)
    {
        manufacturer = brand;
        screen_size = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }

    public void setChannel(int station)
    {
        channel = station;
    }
    
    public void power()
    {
        if (powerOn==true)
            powerOn=false;
        else
            powerOn=true;
    }
     
    public void increaseVolume()
    {
        volume = volume + 1;
    }
    
    public void decreaseVolume()
    {
        volume = volume - 1;
    }
     
    public int getChannel()
    {
        return channel;
    }
    
    public int getVolume()
    {
        return volume;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getScreenSize()
    {
        return screen_size;
    }
   
}
