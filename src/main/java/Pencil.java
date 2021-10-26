public class Pencil {
    private String brand;
    private double length;
    private String color;
    private Boolean isMechanical;
    public Pencil(String b, double l, String c, Boolean m) {
        brand = b;
        length = l;
        color = c;
        isMechanical = m;
    }

    public Boolean sharpen() {
        if(this.isMechanical) {
            System.out.println("You can't sharpen a mechanical pencil!");
        }
        else {
            this.length--;
            if (this.length < 1) {
                this.length = 1;
            }
        }
        return this.length==1;
    }
    public void dye(String c){
        this.color = c;
    }
    public String getBrand() {
        return this.brand;
    }
    public double getLength() {
        return this.length;
    }
    public String getColor() {
        return this.color;
    }
    @Override
    public String toString() {
        if(this.isMechanical)
        {
            return "You have a " + brand + " mechanical pencil. " + this.length + " inches. Has a " + this.color + " color.";
        }
        return "You have a " + brand + " pencil. Length of " + this.length + " inches. Has a " + this.color + " color.";

    }

}
