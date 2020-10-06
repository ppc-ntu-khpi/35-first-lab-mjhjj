public class Shirt {
  public int shirtID = 1241; // стандартне значення номера моделі сорочки
  public String description = "Модно, стильно, молодежно"; // стандартний опис сорочки
  // коди кольорів: red, blue, green, unset
  public String colorCode = "Unset";
  public double price = 1283.32; // стандартна вартість сорочки
  public int quantityInStock = 0; // стандартна кількість на складі
  public String name = "Максим";
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
    System.out.println("Name: " + name);
  } // кінець методу displayShirtInformation
} // кінець опису класу