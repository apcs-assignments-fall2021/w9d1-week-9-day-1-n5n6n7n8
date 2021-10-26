import java.util.Scanner;

public class PencilClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int r = (int) (Math.random()*2);
        Boolean mechanical = true;
        String brand = "PaperMate";
        if(r==1)
        {
            mechanical = false;
            brand = "Dixon Ticonderoga";
        }

        Pencil pencil = new Pencil(brand, 6.0, "Blue", mechanical);
        System.out.println(pencil);
        Boolean doneWithInteraction = false;
        while(!doneWithInteraction){
            System.out.println("What do you want to do? sharpen/dye/get brand/get length/get color/leave");
            String choice = scan.nextLine().toLowerCase();
            if(choice.equals("sharpen")){
                Boolean isShort = pencil.sharpen();
                if(isShort){
                    System.out.println("Your pencil will not be able to be sharpened any further!");
                }
                System.out.println(pencil);
            }
            else if(choice.equals("dye")){
                System.out.println("What color do you want to dye the pencil to?");
                String newColor = scan.nextLine();
                pencil.dye(newColor);
                System.out.println(pencil);
            }
            else if(choice.equals("get brand")){
                System.out.println(pencil.getBrand());
            }
            else if(choice.equals("get color")){
                System.out.println(pencil.getColor());
            }
            else if(choice.equals("get length")){
                System.out.println(pencil.getLength() + " inches.");
            }
            else{
                System.out.println("Interaction terminated.");
                doneWithInteraction=true;
            }
        }
    }
}
