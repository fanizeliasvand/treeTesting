

public class Car implements Comparable<Car> {

   private String Description, Owner;
   private String VIN;

   public Car(String description, String owner, String vin) {
       Description = description;
       Owner = owner;
       VIN = vin;
   }
   public String getDescription() {
	   
	   
	   
	   
       return Description;
}
   public String getOwner() {
	   
	   
	   
	   
       return Owner;
   }
   public String getVIN() {
	   
	   
	   
       return VIN;
   }

   public String toString()
           {
               return Owner + ", " + Description + " " + VIN + "\t";
           }

   public boolean equals(Object other) {
       return (Owner.equals(((Car)other).getOwner()) &&
               Description.equals(((Car)other).getDescription()) &&
               (VIN == (((Car)other).getVIN())));
   }

   public int hashCode() {
       return VIN.hashCode();
   }


   public int compareTo(Car car) {
       int result;

       if (Owner.equals(car.getOwner()))
           result = Owner.compareTo(car.getOwner());
       else
           result = Description.compareTo(car.getDescription());

       return result;
   }

       

}
