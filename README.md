# Tugascoding30okt

# Assignment1

## Nomor 1
program ini akan mencetak angka dari 1 sampai 9 dan kemudian mencetak string "Muhammad Hafizh Ario Diffo" sebanyak 91 kali.
```sh
 public static void main(String[] args) {
        // TODO code application logic here
                String name = "Attar Zaki Al Ghifari";
        System.out.println("Nama : " + name);
        System.out.println("=================");
        for (int i = 0 ; i<=100 ; i++){
            if (i>= 10 ){
                System.out.println(name);
            }
            else{
                System.out.println(i);

## Nomor 2
Program tersebut merupakan penentu angka termasuk genap atau ganjil
```sh
  public static void main(String[] args) {
        // TODO code application logic here
        int count = 1;

        while (count <= 10) {
            if (count % 2 == 0) {
                System.out.println(count + " is an even number.");
            } else {
                System.out.println(count + " is an odd number.");
            }
            count++;
        }
    }

## Nomor 3
Program tersebut memungkinkan pengguna untuk memasukkan tanggal lahir dan bulan, dan kemudian menentukan zodiak yang sesuai dengan input tersebut. 
```sh
   public class ProgramZodiak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tanggal lahir Anda (dd-mm-yyyy): ");
        String[] dateParts = scanner.nextLine().split("-");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);

        String zodiacSign;

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiacSign = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiacSign = "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiacSign = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiacSign = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiacSign = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiacSign = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Sagittarius";
        } else {
            zodiacSign = "Capricorn";
        }

        System.out.println("Zodiak Anda adalah: " + zodiacSign);
    }
}

   ```
## Nomor 4
public class Data_array {

    public static void main(String[] args) {
     String[] Air_Mineral = {"Aqua", "Le Minerale", "Kitaro","Cleo", "Hanun"};
        

        for (int i = 0; i < Air_Mineral.length; i++) {
            System.out.println("Air Mineral Paling Populer ke-" + (i + 1) + ": " + Air_Mineral[i]);
        }
    }
}

