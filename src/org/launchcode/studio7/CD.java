package org.launchcode.studio7;

public class CD extends BaseDisc implements IOpticalDisc {

     public CD(String rpm) {
        super(rpm);
    }

    // TODO: Implement your custom interface.
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + this.rpm + " rpm.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
