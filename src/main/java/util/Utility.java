package util;

import java.util.Random;

public class Utility {

    //1. Method to generate a random FirstName
    public static String getRandomFirstName() {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Emma", "Ethan", "Olivia", "Noah"};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
    //2. Method to generate a random Email
    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "hotmail.com", "yahoo.com", "outlook.com"};
        int domainIndex = new Random().nextInt(domains.length);

        // Generate random username (alphanumeric + underscore)
        int usernameLength = 8;  // Adjust length as needed
        String username = generateRandomString(usernameLength, true);

        return username + "@" + domains[domainIndex];
    }
    private static String generateRandomString(int length, boolean allowNumbers) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        if (allowNumbers) {
            characters += "0123456789_";
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    //3. Method to generate a random Password
    public static String generatePassword(int length) {
        // Define characters to be used in the password
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numericChars = "0123456789";
        String specialChars = "!@#$%^&*()-_=+";
        // Create a combined character pool
        String allChars = uppercaseChars + lowercaseChars + numericChars + specialChars;
        // Initialize random generator
        Random rand = new Random();
        // Generate password
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // Choose a random character from the combined pool
            int randomIndex = rand.nextInt(allChars.length());
            char randomChar = allChars.charAt(randomIndex);
            password.append(randomChar);
        }
        return password.toString();
    }
    ///


    // 4.Method to generate a random company name
    private static final String[] PREFIXES = {
            "Tech", "Global", "International", "Innovative", "Digital", "Creative", "Dynamic", "Strategic", "Smart", "NextGen"
    };
    // Array of possible company name suffixes
    private static final String[] SUFFIXES = {
            "Solutions", "Consulting", "Technologies", "Services", "Systems", "Enterprises", "Ventures", "Group", "Labs", "Corp"
    };
    // Method to generate a random company name
    public static String generateCompanyName() {
        Random rand = new Random();
        String prefix = PREFIXES[rand.nextInt(PREFIXES.length)];
        String suffix = SUFFIXES[rand.nextInt(SUFFIXES.length)];
        return prefix + " " + suffix;
    }

    //5. Method to generate a random Categories
    public static String getRandom_differentCategories() {
        String[] names = {"Computers ", "Electronics ", "Apparel ", "Digital downloads ", "Books ", "Jewelry ", "Gift Cards "};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
    public static String getRandom_FirstThreeCategories() {
        String[] names = {"Computers ", "Electronics ", "Apparel "};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
    public static String getRandom_ComputerItems() {
        String[] names = {"Desktops ", "Notebooks ", "Software "};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
    public static String getRandom_ElectronicsItems() {
        String[] names = {"Camera & photo ", "Cell phones ", "Others "};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
    public static String getRandom_ApparelItems() {
        String[] names = {"Shoes ", "Clothing ", "Accessories "};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
    public static String getRandom_SubCategory_FromApparel_() {
        String[] names = {"Shoes ", "Clothing ", "Accessories "};
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }
    public static void main(String[] args) {
        System.out.println(getRandom_differentCategories().trim()+" ");
    }


    public static int getRandomNumberBetween1and30() {
        Random random = new Random();
        // Generate a random integer between 0 (inclusive) and 30 (exclusive)
        int randomNumber = random.nextInt(30);
        // Add 1 to make the range inclusive of 1 and 30
        return randomNumber + 1;
    }
    public static String getRandomMonths() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        Random random = new Random();
        int randomIndex = random.nextInt(months.length); // Generate random index between 0 and 11
        return months[randomIndex];
    }
    public static int getRandomYearBetween1914And2024() {
        Random random = new Random();
        // Generate a random integer between 0 (inclusive) and 110 (exclusive)
        int randomYear = random.nextInt(111);
        // Add 1914 to get the year within the desired range (1914 - 2024)
        return randomYear + 1914;
    }

}
